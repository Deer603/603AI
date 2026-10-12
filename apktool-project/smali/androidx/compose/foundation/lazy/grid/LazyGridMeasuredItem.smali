.class public final Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;
.super Ljava/lang/Object;
.source "LazyGridMeasuredItem.kt"

# interfaces
.implements Landroidx/compose/foundation/lazy/grid/LazyGridItemInfo;
.implements Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLazyGridMeasuredItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridMeasuredItem.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 6 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n*L\n1#1,259:1\n255#1:274\n255#1:277\n255#1:285\n34#2,6:260\n30#3:266\n30#3:268\n80#4:267\n80#4:269\n80#4:271\n80#4:273\n80#4:276\n80#4:279\n80#4:287\n80#4:289\n32#5:270\n32#5:272\n32#5:275\n32#5:278\n32#5:286\n32#5:288\n96#6,5:280\n*S KotlinDebug\n*F\n+ 1 LazyGridMeasuredItem.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem\n*L\n173#1:274\n178#1:277\n224#1:285\n78#1:260,6\n87#1:266\n89#1:268\n87#1:267\n89#1:269\n150#1:271\n152#1:273\n173#1:276\n178#1:279\n224#1:287\n255#1:289\n150#1:270\n152#1:272\n173#1:275\n178#1:278\n224#1:286\n255#1:288\n186#1:280,5\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008#\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0093\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0008\u0012\u0006\u0010\u000c\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0006\u0012\u000c\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u0004\u0012\u0006\u0010\u001b\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u001cJ\u0016\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020\u00042\u0006\u0010G\u001a\u00020\u0008J\u001d\u0010H\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0004H\u0016\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008I\u0010JJ\u0012\u0010K\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0004H\u0016J\u0016\u0010L\u001a\u00020E2\u0006\u0010M\u001a\u00020N2\u0006\u0010O\u001a\u00020\u0008J(\u0010P\u001a\u00020E2\u0006\u0010Q\u001a\u00020\u00042\u0006\u0010R\u001a\u00020\u00042\u0006\u0010S\u001a\u00020\u00042\u0006\u0010T\u001a\u00020\u0004H\u0016J6\u0010P\u001a\u00020E2\u0006\u0010Q\u001a\u00020\u00042\u0006\u0010R\u001a\u00020\u00042\u0006\u0010S\u001a\u00020\u00042\u0006\u0010T\u001a\u00020\u00042\u0006\u0010:\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0004J\u000e\u0010U\u001a\u00020E2\u0006\u0010+\u001a\u00020\u0004J+\u0010V\u001a\u00020\u0014*\u00020\u00142\u0012\u0010W\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040XH\u0082\u0008\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008Y\u0010ZR\u000e\u0010\u000f\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0004@RX\u0096\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010 R\u001c\u0010\u0018\u001a\u00020\u0019X\u0096\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\n\n\u0002\u0010#\u001a\u0004\u0008!\u0010\"R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u0006X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008$\u0010%R\u0011\u0010\t\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008&\u0010 R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\'\u0010 R\u0014\u0010\u0007\u001a\u00020\u0008X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010(R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008)\u0010%R\u0014\u0010\u001a\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008*\u0010 R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010,\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008-\u0010 R\u0014\u0010.\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008/\u0010 R\u000e\u00100\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u00102\u001a\u00020\u0008X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u00083\u0010(\"\u0004\u00084\u00105R&\u00106\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u0014@RX\u0096\u000e\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\n\n\u0002\u0010#\u001a\u0004\u00087\u0010\"R\u0014\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u00108\u001a\u00020\u00048VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u00089\u0010 R\u000e\u0010\u000b\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010:\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0004@RX\u0096\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008;\u0010 R\u001c\u0010<\u001a\u00020=X\u0096\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\n\n\u0002\u0010#\u001a\u0004\u0008>\u0010\"R\u0014\u0010\u001b\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008?\u0010 R\u0016\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\n\u0002\u0010#R\u0018\u0010@\u001a\u00020\u0004*\u00020\u00148BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008A\u0010BR\u0018\u0010,\u001a\u00020\u0004*\u00020\u00128BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008-\u0010C\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006["
    }
    d2 = {
        "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;",
        "Landroidx/compose/foundation/lazy/grid/LazyGridItemInfo;",
        "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;",
        "index",
        "",
        "key",
        "",
        "isVertical",
        "",
        "crossAxisSize",
        "mainAxisSpacing",
        "reverseLayout",
        "layoutDirection",
        "Landroidx/compose/ui/unit/LayoutDirection;",
        "beforeContentPadding",
        "afterContentPadding",
        "placeables",
        "",
        "Landroidx/compose/ui/layout/Placeable;",
        "visualOffset",
        "Landroidx/compose/ui/unit/IntOffset;",
        "contentType",
        "animator",
        "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;",
        "constraints",
        "Landroidx/compose/ui/unit/Constraints;",
        "lane",
        "span",
        "(ILjava/lang/Object;ZIIZLandroidx/compose/ui/unit/LayoutDirection;IILjava/util/List;JLjava/lang/Object;Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;JIILkotlin/jvm/internal/DefaultConstructorMarker;)V",
        "<set-?>",
        "column",
        "getColumn",
        "()I",
        "getConstraints-msEJaDk",
        "()J",
        "J",
        "getContentType",
        "()Ljava/lang/Object;",
        "getCrossAxisSize",
        "getIndex",
        "()Z",
        "getKey",
        "getLane",
        "mainAxisLayoutSize",
        "mainAxisSize",
        "getMainAxisSize",
        "mainAxisSizeWithSpacings",
        "getMainAxisSizeWithSpacings",
        "maxMainAxisOffset",
        "minMainAxisOffset",
        "nonScrollableItem",
        "getNonScrollableItem",
        "setNonScrollableItem",
        "(Z)V",
        "offset",
        "getOffset-nOcc-ac",
        "placeablesCount",
        "getPlaceablesCount",
        "row",
        "getRow",
        "size",
        "Landroidx/compose/ui/unit/IntSize;",
        "getSize-YbymL2g",
        "getSpan",
        "mainAxis",
        "getMainAxis--gyyYBs",
        "(J)I",
        "(Landroidx/compose/ui/layout/Placeable;)I",
        "applyScrollDelta",
        "",
        "delta",
        "updateAnimations",
        "getOffset",
        "getOffset-Bjo55l4",
        "(I)J",
        "getParentData",
        "place",
        "scope",
        "Landroidx/compose/ui/layout/Placeable$PlacementScope;",
        "isLookingAhead",
        "position",
        "mainAxisOffset",
        "crossAxisOffset",
        "layoutWidth",
        "layoutHeight",
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
            "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;",
            ">;"
        }
    .end annotation
.end field

.field private final beforeContentPadding:I

.field private column:I

.field private final constraints:J

.field private final contentType:Ljava/lang/Object;

.field private final crossAxisSize:I

.field private final index:I

.field private final isVertical:Z

.field private final key:Ljava/lang/Object;

.field private final lane:I

.field private final layoutDirection:Landroidx/compose/ui/unit/LayoutDirection;

.field private mainAxisLayoutSize:I

.field private final mainAxisSize:I

.field private final mainAxisSizeWithSpacings:I

.field private maxMainAxisOffset:I

.field private minMainAxisOffset:I

.field private nonScrollableItem:Z

.field private offset:J

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

.field private row:I

.field private final size:J

.field private final span:I

.field private final visualOffset:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x8

    sput v0, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->$stable:I

    return-void
.end method

.method private constructor <init>(ILjava/lang/Object;ZIIZLandroidx/compose/ui/unit/LayoutDirection;IILjava/util/List;JLjava/lang/Object;Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;JII)V
    .locals 23
    .param p1, "index"    # I
    .param p2, "key"    # Ljava/lang/Object;
    .param p3, "isVertical"    # Z
    .param p4, "crossAxisSize"    # I
    .param p5, "mainAxisSpacing"    # I
    .param p6, "reverseLayout"    # Z
    .param p7, "layoutDirection"    # Landroidx/compose/ui/unit/LayoutDirection;
    .param p8, "beforeContentPadding"    # I
    .param p9, "afterContentPadding"    # I
    .param p10, "placeables"    # Ljava/util/List;
    .param p11, "visualOffset"    # J
    .param p13, "contentType"    # Ljava/lang/Object;
    .param p14, "animator"    # Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;
    .param p15, "constraints"    # J
    .param p17, "lane"    # I
    .param p18, "span"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/Object;",
            "ZIIZ",
            "Landroidx/compose/ui/unit/LayoutDirection;",
            "II",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/ui/layout/Placeable;",
            ">;J",
            "Ljava/lang/Object;",
            "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator<",
            "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;",
            ">;JII)V"
        }
    .end annotation

    .line 35
    move-object/from16 v0, p0

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 36
    move/from16 v1, p1

    iput v1, v0, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->index:I

    .line 37
    move-object/from16 v2, p2

    iput-object v2, v0, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->key:Ljava/lang/Object;

    .line 38
    move/from16 v3, p3

    iput-boolean v3, v0, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->isVertical:Z

    .line 43
    move/from16 v4, p4

    iput v4, v0, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->crossAxisSize:I

    .line 45
    move/from16 v5, p6

    iput-boolean v5, v0, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->reverseLayout:Z

    .line 46
    move-object/from16 v6, p7

    iput-object v6, v0, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->layoutDirection:Landroidx/compose/ui/unit/LayoutDirection;

    .line 47
    move/from16 v7, p8

    iput v7, v0, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->beforeContentPadding:I

    .line 48
    move/from16 v8, p9

    iput v8, v0, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->afterContentPadding:I

    .line 49
    move-object/from16 v9, p10

    iput-object v9, v0, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->placeables:Ljava/util/List;

    .line 54
    move-wide/from16 v10, p11

    iput-wide v10, v0, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->visualOffset:J

    .line 55
    move-object/from16 v12, p13

    iput-object v12, v0, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->contentType:Ljava/lang/Object;

    .line 56
    move-object/from16 v13, p14

    iput-object v13, v0, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->animator:Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;

    .line 57
    move-wide/from16 v14, p15

    iput-wide v14, v0, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->constraints:J

    .line 58
    move/from16 v1, p17

    iput v1, v0, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->lane:I

    .line 59
    move/from16 v1, p18

    iput v1, v0, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->span:I

    .line 70
    const/high16 v1, -0x80000000

    iput v1, v0, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->mainAxisLayoutSize:I

    .line 76
    nop

    .line 77
    const/4 v1, 0x0

    .line 78
    .local v1, "maxMainAxis":I
    move/from16 v16, v1

    .end local v1    # "maxMainAxis":I
    .local v16, "maxMainAxis":I
    iget-object v1, v0, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->placeables:Ljava/util/List;

    .local v1, "$this$fastForEach$iv":Ljava/util/List;
    const/16 v17, 0x0

    .line 260
    .local v17, "$i$f$fastForEach":I
    nop

    .line 261
    const/16 v18, 0x0

    .local v18, "index$iv":I
    move-object/from16 v19, v1

    check-cast v19, Ljava/util/Collection;

    invoke-interface/range {v19 .. v19}, Ljava/util/Collection;->size()I

    move-result v2

    move/from16 v3, v16

    move/from16 v4, v18

    .end local v16    # "maxMainAxis":I
    .end local v18    # "index$iv":I
    .local v3, "maxMainAxis":I
    .local v4, "index$iv":I
    :goto_0
    if-ge v4, v2, :cond_1

    .line 262
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v16

    .line 263
    .local v16, "item$iv":Ljava/lang/Object;
    move-object/from16 v18, v16

    check-cast v18, Landroidx/compose/ui/layout/Placeable;

    .local v18, "it":Landroidx/compose/ui/layout/Placeable;
    const/16 v19, 0x0

    .line 79
    .local v19, "$i$a$-fastForEach-LazyGridMeasuredItem$1":I
    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->isVertical()Z

    move-result v20

    if-eqz v20, :cond_0

    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    move-result v20

    goto :goto_1

    :cond_0
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    move-result v20

    :goto_1
    move-object/from16 v21, v1

    move/from16 v1, v20

    .end local v1    # "$this$fastForEach$iv":Ljava/util/List;
    .local v21, "$this$fastForEach$iv":Ljava/util/List;
    invoke-static {v3, v1}, Ljava/lang/Math;->max(II)I

    move-result v3

    .line 80
    nop

    .line 263
    .end local v18    # "it":Landroidx/compose/ui/layout/Placeable;
    .end local v19    # "$i$a$-fastForEach-LazyGridMeasuredItem$1":I
    nop

    .line 261
    .end local v16    # "item$iv":Ljava/lang/Object;
    add-int/lit8 v4, v4, 0x1

    move-object/from16 v1, v21

    goto :goto_0

    .end local v21    # "$this$fastForEach$iv":Ljava/util/List;
    .restart local v1    # "$this$fastForEach$iv":Ljava/util/List;
    :cond_1
    move-object/from16 v21, v1

    .line 265
    .end local v1    # "$this$fastForEach$iv":Ljava/util/List;
    .end local v4    # "index$iv":I
    .restart local v21    # "$this$fastForEach$iv":Ljava/util/List;
    nop

    .line 81
    .end local v17    # "$i$f$fastForEach":I
    .end local v21    # "$this$fastForEach$iv":Ljava/util/List;
    iput v3, v0, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->mainAxisSize:I

    .line 82
    add-int v1, v3, p5

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v1

    iput v1, v0, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->mainAxisSizeWithSpacings:I

    .line 83
    .end local v3    # "maxMainAxis":I
    nop

    .line 86
    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->isVertical()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 87
    iget v1, v0, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->crossAxisSize:I

    const-wide v16, 0xffffffffL

    .local v1, "width$iv":I
    iget v2, v0, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->mainAxisSize:I

    .local v2, "height$iv":I
    const/4 v3, 0x0

    .line 266
    .local v3, "$i$f$IntSize":I
    const/16 v18, 0x0

    .line 267
    .local v18, "$i$f$packInts":I
    const/16 v19, 0x20

    int-to-long v4, v1

    shl-long v4, v4, v19

    move/from16 v20, v3

    move-wide/from16 v21, v4

    .end local v3    # "$i$f$IntSize":I
    .local v20, "$i$f$IntSize":I
    int-to-long v3, v2

    and-long v3, v3, v16

    or-long v3, v21, v3

    .line 266
    .end local v18    # "$i$f$packInts":I
    invoke-static {v3, v4}, Landroidx/compose/ui/unit/IntSize;->constructor-impl(J)J

    move-result-wide v1

    .end local v1    # "width$iv":I
    .end local v2    # "height$iv":I
    .end local v20    # "$i$f$IntSize":I
    goto :goto_2

    .line 89
    :cond_2
    const-wide v16, 0xffffffffL

    const/16 v19, 0x20

    iget v1, v0, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->mainAxisSize:I

    .restart local v1    # "width$iv":I
    iget v2, v0, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->crossAxisSize:I

    .restart local v2    # "height$iv":I
    const/4 v3, 0x0

    .line 268
    .restart local v3    # "$i$f$IntSize":I
    const/4 v4, 0x0

    .line 269
    .local v4, "$i$f$packInts":I
    move v5, v3

    move/from16 v18, v4

    .end local v3    # "$i$f$IntSize":I
    .end local v4    # "$i$f$packInts":I
    .local v5, "$i$f$IntSize":I
    .restart local v18    # "$i$f$packInts":I
    int-to-long v3, v1

    shl-long v3, v3, v19

    move-wide/from16 v19, v3

    int-to-long v3, v2

    and-long v3, v3, v16

    or-long v3, v19, v3

    .line 268
    .end local v18    # "$i$f$packInts":I
    invoke-static {v3, v4}, Landroidx/compose/ui/unit/IntSize;->constructor-impl(J)J

    move-result-wide v3

    move-wide v1, v3

    .line 86
    .end local v1    # "width$iv":I
    .end local v2    # "height$iv":I
    .end local v5    # "$i$f$IntSize":I
    :goto_2
    iput-wide v1, v0, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->size:J

    .line 91
    sget-object v1, Landroidx/compose/ui/unit/IntOffset;->Companion:Landroidx/compose/ui/unit/IntOffset$Companion;

    invoke-virtual {v1}, Landroidx/compose/ui/unit/IntOffset$Companion;->getZero-nOcc-ac()J

    move-result-wide v1

    iput-wide v1, v0, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->offset:J

    .line 94
    const/4 v1, -0x1

    iput v1, v0, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->row:I

    .line 97
    iput v1, v0, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->column:I

    .line 35
    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;ZIIZLandroidx/compose/ui/unit/LayoutDirection;IILjava/util/List;JLjava/lang/Object;Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;JIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct/range {p0 .. p18}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;-><init>(ILjava/lang/Object;ZIIZLandroidx/compose/ui/unit/LayoutDirection;IILjava/util/List;JLjava/lang/Object;Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;JII)V

    return-void
.end method

.method private final copy-4Tuh3kE(JLkotlin/jvm/functions/Function1;)J
    .locals 11
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

    .line 255
    .local v0, "$i$f$copy-4Tuh3kE":I
    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->isVertical()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p1, p2}, Landroidx/compose/ui/unit/IntOffset;->getX-impl(J)I

    move-result v1

    goto :goto_0

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

    :goto_0
    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->isVertical()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {p1, p2}, Landroidx/compose/ui/unit/IntOffset;->getY-impl(J)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {p3, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    goto :goto_1

    :cond_1
    invoke-static {p1, p2}, Landroidx/compose/ui/unit/IntOffset;->getY-impl(J)I

    move-result v2

    .local v1, "x$iv":I
    .local v2, "y$iv":I
    :goto_1
    const/4 v3, 0x0

    .line 288
    .local v3, "$i$f$IntOffset":I
    const/4 v4, 0x0

    .line 289
    .local v4, "$i$f$packInts":I
    int-to-long v5, v1

    const/16 v7, 0x20

    shl-long/2addr v5, v7

    int-to-long v7, v2

    const-wide v9, 0xffffffffL

    and-long/2addr v7, v9

    or-long v4, v5, v7

    .line 288
    .end local v4    # "$i$f$packInts":I
    invoke-static {v4, v5}, Landroidx/compose/ui/unit/IntOffset;->constructor-impl(J)J

    move-result-wide v1

    .line 255
    .end local v1    # "x$iv":I
    .end local v2    # "y$iv":I
    .end local v3    # "$i$f$IntOffset":I
    return-wide v1
.end method

.method private final getMainAxis--gyyYBs(J)I
    .locals 1
    .param p1, "$this$mainAxis"    # J

    .line 249
    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->isVertical()Z

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

    .line 252
    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->isVertical()Z

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

    .line 170
    move-object/from16 v0, p0

    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->getNonScrollableItem()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 171
    return-void

    .line 173
    :cond_0
    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->getOffset-nOcc-ac()J

    move-result-wide v1

    .local v1, "$this$copy_u2d4Tuh3kE$iv":J
    move-object/from16 v3, p0

    .local v3, "this_$iv":Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;
    const/4 v4, 0x0

    .line 274
    .local v4, "$i$f$copy-4Tuh3kE":I
    invoke-virtual {v3}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->isVertical()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-static {v1, v2}, Landroidx/compose/ui/unit/IntOffset;->getX-impl(J)I

    move-result v5

    goto :goto_0

    :cond_1
    invoke-static {v1, v2}, Landroidx/compose/ui/unit/IntOffset;->getX-impl(J)I

    move-result v5

    .local v5, "it":I
    const/4 v6, 0x0

    .line 173
    .local v6, "$i$a$-copy-4Tuh3kE-LazyGridMeasuredItem$applyScrollDelta$1":I
    add-int v5, v5, p1

    .line 274
    .end local v5    # "it":I
    .end local v6    # "$i$a$-copy-4Tuh3kE-LazyGridMeasuredItem$applyScrollDelta$1":I
    :goto_0
    invoke-virtual {v3}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->isVertical()Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-static {v1, v2}, Landroidx/compose/ui/unit/IntOffset;->getY-impl(J)I

    move-result v6

    .local v6, "it":I
    const/4 v7, 0x0

    .line 173
    .local v7, "$i$a$-copy-4Tuh3kE-LazyGridMeasuredItem$applyScrollDelta$1":I
    add-int v6, v6, p1

    .line 274
    .end local v6    # "it":I
    .end local v7    # "$i$a$-copy-4Tuh3kE-LazyGridMeasuredItem$applyScrollDelta$1":I
    goto :goto_1

    :cond_2
    invoke-static {v1, v2}, Landroidx/compose/ui/unit/IntOffset;->getY-impl(J)I

    move-result v6

    .local v5, "x$iv$iv":I
    .local v6, "y$iv$iv":I
    :goto_1
    const/4 v7, 0x0

    .line 275
    .local v7, "$i$f$IntOffset":I
    const/4 v8, 0x0

    .line 276
    .local v8, "$i$f$packInts":I
    int-to-long v9, v5

    const/16 v11, 0x20

    shl-long/2addr v9, v11

    int-to-long v12, v6

    const-wide v14, 0xffffffffL

    and-long/2addr v12, v14

    or-long v8, v9, v12

    .line 275
    .end local v8    # "$i$f$packInts":I
    invoke-static {v8, v9}, Landroidx/compose/ui/unit/IntOffset;->constructor-impl(J)J

    move-result-wide v5

    .line 274
    .end local v5    # "x$iv$iv":I
    .end local v6    # "y$iv$iv":I
    .end local v7    # "$i$f$IntOffset":I
    nop

    .line 173
    .end local v1    # "$this$copy_u2d4Tuh3kE$iv":J
    .end local v3    # "this_$iv":Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;
    .end local v4    # "$i$f$copy-4Tuh3kE":I
    iput-wide v5, v0, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->offset:J

    .line 174
    if-eqz p2, :cond_6

    .line 175
    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->getPlaceablesCount()I

    move-result v1

    const/4 v2, 0x0

    :goto_2
    if-ge v2, v1, :cond_6

    move v3, v2

    .local v3, "index":I
    const/4 v4, 0x0

    .line 176
    .local v4, "$i$a$-repeat-LazyGridMeasuredItem$applyScrollDelta$2":I
    iget-object v5, v0, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->animator:Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;

    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->getKey()Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v5, v6, v3}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->getAnimation(Ljava/lang/Object;I)Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;

    move-result-object v5

    .line 177
    .local v5, "animation":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;
    if-eqz v5, :cond_5

    .line 178
    invoke-virtual {v5}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;->getRawOffset-nOcc-ac()J

    move-result-wide v6

    .local v6, "$this$copy_u2d4Tuh3kE$iv":J
    move-object/from16 v8, p0

    .local v8, "this_$iv":Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;
    const/4 v9, 0x0

    .line 277
    .local v9, "$i$f$copy-4Tuh3kE":I
    invoke-virtual {v8}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->isVertical()Z

    move-result v10

    if-eqz v10, :cond_3

    invoke-static {v6, v7}, Landroidx/compose/ui/unit/IntOffset;->getX-impl(J)I

    move-result v10

    goto :goto_3

    :cond_3
    invoke-static {v6, v7}, Landroidx/compose/ui/unit/IntOffset;->getX-impl(J)I

    move-result v10

    .local v10, "mainAxis":I
    const/4 v12, 0x0

    .line 178
    .local v12, "$i$a$-copy-4Tuh3kE-LazyGridMeasuredItem$applyScrollDelta$2$1":I
    add-int v10, v10, p1

    .end local v10    # "mainAxis":I
    .end local v12    # "$i$a$-copy-4Tuh3kE-LazyGridMeasuredItem$applyScrollDelta$2$1":I
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    .line 277
    check-cast v10, Ljava/lang/Number;

    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    move-result v10

    :goto_3
    invoke-virtual {v8}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->isVertical()Z

    move-result v12

    if-eqz v12, :cond_4

    invoke-static {v6, v7}, Landroidx/compose/ui/unit/IntOffset;->getY-impl(J)I

    move-result v12

    .local v12, "mainAxis":I
    const/4 v13, 0x0

    .line 178
    .local v13, "$i$a$-copy-4Tuh3kE-LazyGridMeasuredItem$applyScrollDelta$2$1":I
    add-int v12, v12, p1

    .end local v12    # "mainAxis":I
    .end local v13    # "$i$a$-copy-4Tuh3kE-LazyGridMeasuredItem$applyScrollDelta$2$1":I
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    .line 277
    check-cast v12, Ljava/lang/Number;

    invoke-virtual {v12}, Ljava/lang/Number;->intValue()I

    move-result v12

    goto :goto_4

    :cond_4
    invoke-static {v6, v7}, Landroidx/compose/ui/unit/IntOffset;->getY-impl(J)I

    move-result v12

    .local v10, "x$iv$iv":I
    .local v12, "y$iv$iv":I
    :goto_4
    const/4 v13, 0x0

    .line 278
    .local v13, "$i$f$IntOffset":I
    const/16 v16, 0x0

    .line 279
    .local v16, "$i$f$packInts":I
    move-wide/from16 v17, v14

    int-to-long v14, v10

    shl-long/2addr v14, v11

    move/from16 v19, v1

    int-to-long v0, v12

    and-long v0, v0, v17

    or-long/2addr v0, v14

    .line 278
    .end local v16    # "$i$f$packInts":I
    invoke-static {v0, v1}, Landroidx/compose/ui/unit/IntOffset;->constructor-impl(J)J

    move-result-wide v0

    .line 277
    .end local v10    # "x$iv$iv":I
    .end local v12    # "y$iv$iv":I
    .end local v13    # "$i$f$IntOffset":I
    nop

    .line 178
    .end local v6    # "$this$copy_u2d4Tuh3kE$iv":J
    .end local v8    # "this_$iv":Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;
    .end local v9    # "$i$f$copy-4Tuh3kE":I
    invoke-virtual {v5, v0, v1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;->setRawOffset--gyyYBs(J)V

    goto :goto_5

    .line 177
    :cond_5
    move/from16 v19, v1

    move-wide/from16 v17, v14

    .line 180
    :goto_5
    nop

    .line 175
    .end local v3    # "index":I
    .end local v4    # "$i$a$-repeat-LazyGridMeasuredItem$applyScrollDelta$2":I
    .end local v5    # "animation":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;
    add-int/lit8 v2, v2, 0x1

    move-object/from16 v0, p0

    move-wide/from16 v14, v17

    move/from16 v1, v19

    goto :goto_2

    .line 182
    :cond_6
    return-void
.end method

.method public getColumn()I
    .locals 1

    .line 97
    iget v0, p0, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->column:I

    return v0
.end method

.method public getConstraints-msEJaDk()J
    .locals 2

    .line 57
    iget-wide v0, p0, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->constraints:J

    return-wide v0
.end method

.method public getContentType()Ljava/lang/Object;
    .locals 1

    .line 55
    iget-object v0, p0, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->contentType:Ljava/lang/Object;

    return-object v0
.end method

.method public final getCrossAxisSize()I
    .locals 1

    .line 43
    iget v0, p0, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->crossAxisSize:I

    return v0
.end method

.method public getIndex()I
    .locals 1

    .line 36
    iget v0, p0, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->index:I

    return v0
.end method

.method public getKey()Ljava/lang/Object;
    .locals 1

    .line 37
    iget-object v0, p0, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->key:Ljava/lang/Object;

    return-object v0
.end method

.method public getLane()I
    .locals 1

    .line 58
    iget v0, p0, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->lane:I

    return v0
.end method

.method public final getMainAxisSize()I
    .locals 1

    .line 62
    iget v0, p0, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->mainAxisSize:I

    return v0
.end method

.method public getMainAxisSizeWithSpacings()I
    .locals 1

    .line 65
    iget v0, p0, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->mainAxisSizeWithSpacings:I

    return v0
.end method

.method public getNonScrollableItem()Z
    .locals 1

    .line 106
    iget-boolean v0, p0, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->nonScrollableItem:Z

    return v0
.end method

.method public getOffset-Bjo55l4(I)J
    .locals 2
    .param p1, "index"    # I

    .line 100
    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->getOffset-nOcc-ac()J

    move-result-wide v0

    return-wide v0
.end method

.method public getOffset-nOcc-ac()J
    .locals 2

    .line 91
    iget-wide v0, p0, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->offset:J

    return-wide v0
.end method

.method public getParentData(I)Ljava/lang/Object;
    .locals 1
    .param p1, "index"    # I

    .line 74
    iget-object v0, p0, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->placeables:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/ui/layout/Placeable;

    invoke-virtual {v0}, Landroidx/compose/ui/layout/Placeable;->getParentData()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getPlaceablesCount()I
    .locals 1

    .line 68
    iget-object v0, p0, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->placeables:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getRow()I
    .locals 1

    .line 94
    iget v0, p0, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->row:I

    return v0
.end method

.method public getSize-YbymL2g()J
    .locals 2

    .line 85
    iget-wide v0, p0, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->size:J

    return-wide v0
.end method

.method public getSpan()I
    .locals 1

    .line 59
    iget v0, p0, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->span:I

    return v0
.end method

.method public isVertical()Z
    .locals 1

    .line 38
    iget-boolean v0, p0, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->isVertical:Z

    return v0
.end method

.method public final place(Landroidx/compose/ui/layout/Placeable$PlacementScope;Z)V
    .locals 29
    .param p1, "scope"    # Landroidx/compose/ui/layout/Placeable$PlacementScope;
    .param p2, "isLookingAhead"    # Z

    .line 185
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .local v1, "$this$place_u24lambda_u247":Landroidx/compose/ui/layout/Placeable$PlacementScope;
    const/4 v9, 0x0

    .line 186
    .local v9, "$i$a$-with-LazyGridMeasuredItem$place$1":I
    iget v2, v0, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->mainAxisLayoutSize:I

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

    .line 280
    .local v3, "$i$f$requirePrecondition":I
    nop

    .line 281
    if-nez v2, :cond_1

    .line 282
    const/4 v5, 0x0

    .line 186
    .local v5, "$i$a$-requirePrecondition-LazyGridMeasuredItem$place$1$1":I
    nop

    .line 282
    .end local v5    # "$i$a$-requirePrecondition-LazyGridMeasuredItem$place$1$1":I
    const-string/jumbo v5, "position() should be called first"

    invoke-static {v5}, Landroidx/compose/foundation/internal/InlineClassHelperKt;->throwIllegalArgumentException(Ljava/lang/String;)V

    .line 284
    :cond_1
    nop

    .line 187
    .end local v2    # "value$iv":Z
    .end local v3    # "$i$f$requirePrecondition":I
    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->getPlaceablesCount()I

    move-result v10

    move v11, v4

    :goto_1
    if-ge v11, v10, :cond_10

    move v12, v11

    .local v12, "index":I
    const/4 v13, 0x0

    .line 188
    .local v13, "$i$a$-repeat-LazyGridMeasuredItem$place$1$2":I
    iget-object v2, v0, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->placeables:Ljava/util/List;

    invoke-interface {v2, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/compose/ui/layout/Placeable;

    .line 189
    .local v2, "placeable":Landroidx/compose/ui/layout/Placeable;
    iget v3, v0, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->minMainAxisOffset:I

    invoke-direct {v0, v2}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->getMainAxisSize(Landroidx/compose/ui/layout/Placeable;)I

    move-result v4

    sub-int v14, v3, v4

    .line 190
    .local v14, "minOffset":I
    iget v15, v0, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->maxMainAxisOffset:I

    .line 191
    .local v15, "maxOffset":I
    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->getOffset-nOcc-ac()J

    move-result-wide v3

    .line 192
    .local v3, "offset":J
    iget-object v5, v0, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->animator:Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;

    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->getKey()Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v5, v6, v12}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->getAnimation(Ljava/lang/Object;I)Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;

    move-result-object v5

    .line 193
    .local v5, "animation":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;
    const/4 v6, 0x0

    .line 194
    .local v6, "layer":Landroidx/compose/ui/graphics/layer/GraphicsLayer;
    if-eqz v5, :cond_7

    .line 195
    if-eqz p2, :cond_2

    .line 197
    invoke-virtual {v5, v3, v4}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;->setLookaheadOffset--gyyYBs(J)V

    move-object/from16 v16, v1

    move/from16 v17, v9

    move/from16 v18, v10

    goto :goto_3

    .line 200
    :cond_2
    invoke-virtual {v5}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;->getLookaheadOffset-nOcc-ac()J

    move-result-wide v7

    sget-object v16, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;->Companion:Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation$Companion;

    move/from16 v17, v9

    move/from16 v18, v10

    .end local v9    # "$i$a$-with-LazyGridMeasuredItem$place$1":I
    .local v17, "$i$a$-with-LazyGridMeasuredItem$place$1":I
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation$Companion;->getNotInitialized-nOcc-ac()J

    move-result-wide v9

    invoke-static {v7, v8, v9, v10}, Landroidx/compose/ui/unit/IntOffset;->equals-impl0(JJ)Z

    move-result v7

    if-nez v7, :cond_3

    .line 201
    invoke-virtual {v5}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;->getLookaheadOffset-nOcc-ac()J

    move-result-wide v7

    goto :goto_2

    .line 203
    :cond_3
    move-wide v7, v3

    .line 200
    :goto_2
    nop

    .line 199
    nop

    .line 205
    .local v7, "targetOffset":J
    invoke-virtual {v5}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;->getPlacementDelta-nOcc-ac()J

    move-result-wide v9

    invoke-static {v7, v8, v9, v10}, Landroidx/compose/ui/unit/IntOffset;->plus-qkQi6aY(JJ)J

    move-result-wide v9

    .line 208
    .local v9, "animatedOffset":J
    nop

    .line 209
    move-object/from16 v16, v1

    .end local v1    # "$this$place_u24lambda_u247":Landroidx/compose/ui/layout/Placeable$PlacementScope;
    .local v16, "$this$place_u24lambda_u247":Landroidx/compose/ui/layout/Placeable$PlacementScope;
    invoke-direct {v0, v3, v4}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->getMainAxis--gyyYBs(J)I

    move-result v1

    if-gt v1, v14, :cond_4

    .line 210
    invoke-direct {v0, v9, v10}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->getMainAxis--gyyYBs(J)I

    move-result v1

    if-le v1, v14, :cond_5

    .line 211
    :cond_4
    invoke-direct {v0, v3, v4}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->getMainAxis--gyyYBs(J)I

    move-result v1

    if-lt v1, v15, :cond_6

    .line 212
    invoke-direct {v0, v9, v10}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->getMainAxis--gyyYBs(J)I

    move-result v1

    if-lt v1, v15, :cond_6

    .line 214
    :cond_5
    invoke-virtual {v5}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;->cancelPlacementAnimation()V

    .line 216
    :cond_6
    move-wide v3, v9

    .line 218
    .end local v7    # "targetOffset":J
    .end local v9    # "animatedOffset":J
    :goto_3
    invoke-virtual {v5}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;->getLayer()Landroidx/compose/ui/graphics/layer/GraphicsLayer;

    move-result-object v1

    .end local v6    # "layer":Landroidx/compose/ui/graphics/layer/GraphicsLayer;
    .local v1, "layer":Landroidx/compose/ui/graphics/layer/GraphicsLayer;
    goto :goto_4

    .line 220
    .end local v16    # "$this$place_u24lambda_u247":Landroidx/compose/ui/layout/Placeable$PlacementScope;
    .end local v17    # "$i$a$-with-LazyGridMeasuredItem$place$1":I
    .local v1, "$this$place_u24lambda_u247":Landroidx/compose/ui/layout/Placeable$PlacementScope;
    .restart local v6    # "layer":Landroidx/compose/ui/graphics/layer/GraphicsLayer;
    .local v9, "$i$a$-with-LazyGridMeasuredItem$place$1":I
    :cond_7
    move-object/from16 v16, v1

    move/from16 v17, v9

    move/from16 v18, v10

    .end local v1    # "$this$place_u24lambda_u247":Landroidx/compose/ui/layout/Placeable$PlacementScope;
    .end local v9    # "$i$a$-with-LazyGridMeasuredItem$place$1":I
    .restart local v16    # "$this$place_u24lambda_u247":Landroidx/compose/ui/layout/Placeable$PlacementScope;
    .restart local v17    # "$i$a$-with-LazyGridMeasuredItem$place$1":I
    const/4 v1, 0x0

    .line 222
    .end local v6    # "layer":Landroidx/compose/ui/graphics/layer/GraphicsLayer;
    .local v1, "layer":Landroidx/compose/ui/graphics/layer/GraphicsLayer;
    :goto_4
    iget-boolean v6, v0, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->reverseLayout:Z

    if-eqz v6, :cond_a

    .line 224
    move-wide v6, v3

    .local v6, "$this$copy_u2d4Tuh3kE$iv":J
    move-object/from16 v8, p0

    .local v8, "this_$iv":Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;
    const/4 v9, 0x0

    .line 285
    .local v9, "$i$f$copy-4Tuh3kE":I
    invoke-virtual {v8}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->isVertical()Z

    move-result v10

    if-eqz v10, :cond_8

    invoke-static {v6, v7}, Landroidx/compose/ui/unit/IntOffset;->getX-impl(J)I

    move-result v10

    move-object/from16 v20, v1

    goto :goto_5

    :cond_8
    invoke-static {v6, v7}, Landroidx/compose/ui/unit/IntOffset;->getX-impl(J)I

    move-result v10

    .local v10, "mainAxisOffset":I
    const/16 v19, 0x0

    .line 225
    .local v19, "$i$a$-copy-4Tuh3kE-LazyGridMeasuredItem$place$1$2$1":I
    move-object/from16 v20, v1

    .end local v1    # "layer":Landroidx/compose/ui/graphics/layer/GraphicsLayer;
    .local v20, "layer":Landroidx/compose/ui/graphics/layer/GraphicsLayer;
    iget v1, v0, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->mainAxisLayoutSize:I

    sub-int/2addr v1, v10

    invoke-direct {v0, v2}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->getMainAxisSize(Landroidx/compose/ui/layout/Placeable;)I

    move-result v21

    sub-int v1, v1, v21

    move v10, v1

    .line 285
    .end local v10    # "mainAxisOffset":I
    .end local v19    # "$i$a$-copy-4Tuh3kE-LazyGridMeasuredItem$place$1$2$1":I
    :goto_5
    invoke-virtual {v8}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->isVertical()Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-static {v6, v7}, Landroidx/compose/ui/unit/IntOffset;->getY-impl(J)I

    move-result v1

    .local v1, "mainAxisOffset":I
    const/16 v19, 0x0

    .line 225
    .restart local v19    # "$i$a$-copy-4Tuh3kE-LazyGridMeasuredItem$place$1$2$1":I
    move/from16 v21, v1

    .end local v1    # "mainAxisOffset":I
    .local v21, "mainAxisOffset":I
    iget v1, v0, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->mainAxisLayoutSize:I

    sub-int v1, v1, v21

    invoke-direct {v0, v2}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->getMainAxisSize(Landroidx/compose/ui/layout/Placeable;)I

    move-result v22

    sub-int v1, v1, v22

    .line 285
    .end local v19    # "$i$a$-copy-4Tuh3kE-LazyGridMeasuredItem$place$1$2$1":I
    .end local v21    # "mainAxisOffset":I
    goto :goto_6

    :cond_9
    invoke-static {v6, v7}, Landroidx/compose/ui/unit/IntOffset;->getY-impl(J)I

    move-result v1

    .local v1, "y$iv$iv":I
    .local v10, "x$iv$iv":I
    :goto_6
    const/16 v19, 0x0

    .line 286
    .local v19, "$i$f$IntOffset":I
    const/16 v21, 0x0

    .line 287
    .local v21, "$i$f$packInts":I
    move-object/from16 v22, v2

    move-wide/from16 v23, v3

    .end local v2    # "placeable":Landroidx/compose/ui/layout/Placeable;
    .end local v3    # "offset":J
    .local v22, "placeable":Landroidx/compose/ui/layout/Placeable;
    .local v23, "offset":J
    int-to-long v2, v10

    const/16 v4, 0x20

    shl-long/2addr v2, v4

    move-wide/from16 v25, v2

    int-to-long v2, v1

    const-wide v27, 0xffffffffL

    and-long v2, v2, v27

    or-long v2, v25, v2

    .line 286
    .end local v21    # "$i$f$packInts":I
    invoke-static {v2, v3}, Landroidx/compose/ui/unit/IntOffset;->constructor-impl(J)J

    move-result-wide v1

    .line 285
    .end local v1    # "y$iv$iv":I
    .end local v10    # "x$iv$iv":I
    .end local v19    # "$i$f$IntOffset":I
    nop

    .line 223
    .end local v6    # "$this$copy_u2d4Tuh3kE$iv":J
    .end local v8    # "this_$iv":Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;
    .end local v9    # "$i$f$copy-4Tuh3kE":I
    move-wide v3, v1

    .end local v23    # "offset":J
    .restart local v3    # "offset":J
    goto :goto_7

    .line 222
    .end local v20    # "layer":Landroidx/compose/ui/graphics/layer/GraphicsLayer;
    .end local v22    # "placeable":Landroidx/compose/ui/layout/Placeable;
    .local v1, "layer":Landroidx/compose/ui/graphics/layer/GraphicsLayer;
    .restart local v2    # "placeable":Landroidx/compose/ui/layout/Placeable;
    :cond_a
    move-object/from16 v20, v1

    move-object/from16 v22, v2

    move-wide/from16 v23, v3

    .line 228
    .end local v1    # "layer":Landroidx/compose/ui/graphics/layer/GraphicsLayer;
    .end local v2    # "placeable":Landroidx/compose/ui/layout/Placeable;
    .restart local v20    # "layer":Landroidx/compose/ui/graphics/layer/GraphicsLayer;
    .restart local v22    # "placeable":Landroidx/compose/ui/layout/Placeable;
    :goto_7
    iget-wide v1, v0, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->visualOffset:J

    invoke-static {v3, v4, v1, v2}, Landroidx/compose/ui/unit/IntOffset;->plus-qkQi6aY(JJ)J

    move-result-wide v3

    .line 229
    if-nez p2, :cond_c

    .line 230
    if-nez v5, :cond_b

    goto :goto_8

    :cond_b
    invoke-virtual {v5, v3, v4}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;->setFinalOffset--gyyYBs(J)V

    .line 232
    :cond_c
    :goto_8
    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->isVertical()Z

    move-result v1

    if-eqz v1, :cond_e

    .line 233
    if-eqz v20, :cond_d

    .line 234
    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object v9, v5

    move-object/from16 v1, v16

    move-object/from16 v5, v20

    move-object/from16 v2, v22

    .end local v16    # "$this$place_u24lambda_u247":Landroidx/compose/ui/layout/Placeable$PlacementScope;
    .end local v20    # "layer":Landroidx/compose/ui/graphics/layer/GraphicsLayer;
    .end local v22    # "placeable":Landroidx/compose/ui/layout/Placeable;
    .local v1, "$this$place_u24lambda_u247":Landroidx/compose/ui/layout/Placeable$PlacementScope;
    .restart local v2    # "placeable":Landroidx/compose/ui/layout/Placeable;
    .local v5, "layer":Landroidx/compose/ui/graphics/layer/GraphicsLayer;
    .local v9, "animation":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;
    invoke-static/range {v1 .. v8}, Landroidx/compose/ui/layout/Placeable$PlacementScope;->placeWithLayer-aW-9-wM$default(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/ui/layout/Placeable;JLandroidx/compose/ui/graphics/layer/GraphicsLayer;FILjava/lang/Object;)V

    .end local v5    # "layer":Landroidx/compose/ui/graphics/layer/GraphicsLayer;
    .restart local v20    # "layer":Landroidx/compose/ui/graphics/layer/GraphicsLayer;
    goto :goto_9

    .line 236
    .end local v1    # "$this$place_u24lambda_u247":Landroidx/compose/ui/layout/Placeable$PlacementScope;
    .end local v2    # "placeable":Landroidx/compose/ui/layout/Placeable;
    .end local v9    # "animation":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;
    .local v5, "animation":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;
    .restart local v16    # "$this$place_u24lambda_u247":Landroidx/compose/ui/layout/Placeable$PlacementScope;
    .restart local v22    # "placeable":Landroidx/compose/ui/layout/Placeable;
    :cond_d
    move-object v9, v5

    move-object/from16 v1, v16

    move-object/from16 v2, v22

    .end local v5    # "animation":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;
    .end local v16    # "$this$place_u24lambda_u247":Landroidx/compose/ui/layout/Placeable$PlacementScope;
    .end local v22    # "placeable":Landroidx/compose/ui/layout/Placeable;
    .restart local v1    # "$this$place_u24lambda_u247":Landroidx/compose/ui/layout/Placeable$PlacementScope;
    .restart local v2    # "placeable":Landroidx/compose/ui/layout/Placeable;
    .restart local v9    # "animation":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;
    const/4 v7, 0x6

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v1 .. v8}, Landroidx/compose/ui/layout/Placeable$PlacementScope;->placeWithLayer-aW-9-wM$default(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/ui/layout/Placeable;JFLkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    goto :goto_9

    .line 239
    .end local v1    # "$this$place_u24lambda_u247":Landroidx/compose/ui/layout/Placeable$PlacementScope;
    .end local v2    # "placeable":Landroidx/compose/ui/layout/Placeable;
    .end local v9    # "animation":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;
    .restart local v5    # "animation":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;
    .restart local v16    # "$this$place_u24lambda_u247":Landroidx/compose/ui/layout/Placeable$PlacementScope;
    .restart local v22    # "placeable":Landroidx/compose/ui/layout/Placeable;
    :cond_e
    move-object v9, v5

    move-object/from16 v1, v16

    move-object/from16 v2, v22

    .end local v5    # "animation":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;
    .end local v16    # "$this$place_u24lambda_u247":Landroidx/compose/ui/layout/Placeable$PlacementScope;
    .end local v22    # "placeable":Landroidx/compose/ui/layout/Placeable;
    .restart local v1    # "$this$place_u24lambda_u247":Landroidx/compose/ui/layout/Placeable$PlacementScope;
    .restart local v2    # "placeable":Landroidx/compose/ui/layout/Placeable;
    .restart local v9    # "animation":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;
    if-eqz v20, :cond_f

    .line 240
    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object/from16 v5, v20

    .end local v20    # "layer":Landroidx/compose/ui/graphics/layer/GraphicsLayer;
    .local v5, "layer":Landroidx/compose/ui/graphics/layer/GraphicsLayer;
    invoke-static/range {v1 .. v8}, Landroidx/compose/ui/layout/Placeable$PlacementScope;->placeRelativeWithLayer-aW-9-wM$default(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/ui/layout/Placeable;JLandroidx/compose/ui/graphics/layer/GraphicsLayer;FILjava/lang/Object;)V

    .end local v5    # "layer":Landroidx/compose/ui/graphics/layer/GraphicsLayer;
    .restart local v20    # "layer":Landroidx/compose/ui/graphics/layer/GraphicsLayer;
    goto :goto_9

    .line 242
    :cond_f
    const/4 v7, 0x6

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v1 .. v8}, Landroidx/compose/ui/layout/Placeable$PlacementScope;->placeRelativeWithLayer-aW-9-wM$default(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/ui/layout/Placeable;JFLkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    .line 245
    :goto_9
    nop

    .line 187
    .end local v2    # "placeable":Landroidx/compose/ui/layout/Placeable;
    .end local v3    # "offset":J
    .end local v9    # "animation":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;
    .end local v12    # "index":I
    .end local v13    # "$i$a$-repeat-LazyGridMeasuredItem$place$1$2":I
    .end local v14    # "minOffset":I
    .end local v15    # "maxOffset":I
    .end local v20    # "layer":Landroidx/compose/ui/graphics/layer/GraphicsLayer;
    add-int/lit8 v11, v11, 0x1

    move/from16 v9, v17

    move/from16 v10, v18

    goto/16 :goto_1

    .line 246
    .end local v17    # "$i$a$-with-LazyGridMeasuredItem$place$1":I
    .local v9, "$i$a$-with-LazyGridMeasuredItem$place$1":I
    :cond_10
    nop

    .line 185
    .end local v1    # "$this$place_u24lambda_u247":Landroidx/compose/ui/layout/Placeable$PlacementScope;
    .end local v9    # "$i$a$-with-LazyGridMeasuredItem$place$1":I
    nop

    .line 246
    return-void
.end method

.method public position(IIII)V
    .locals 7
    .param p1, "mainAxisOffset"    # I
    .param p2, "crossAxisOffset"    # I
    .param p3, "layoutWidth"    # I
    .param p4, "layoutHeight"    # I

    .line 114
    nop

    .line 115
    nop

    .line 116
    nop

    .line 117
    nop

    .line 118
    nop

    .line 119
    nop

    .line 120
    nop

    .line 114
    const/4 v5, -0x1

    const/4 v6, -0x1

    move-object v0, p0

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    .end local p1    # "mainAxisOffset":I
    .end local p2    # "crossAxisOffset":I
    .end local p3    # "layoutWidth":I
    .end local p4    # "layoutHeight":I
    .local v1, "mainAxisOffset":I
    .local v2, "crossAxisOffset":I
    .local v3, "layoutWidth":I
    .local v4, "layoutHeight":I
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->position(IIIIII)V

    .line 122
    return-void
.end method

.method public final position(IIIIII)V
    .locals 11
    .param p1, "mainAxisOffset"    # I
    .param p2, "crossAxisOffset"    # I
    .param p3, "layoutWidth"    # I
    .param p4, "layoutHeight"    # I
    .param p5, "row"    # I
    .param p6, "column"    # I

    .line 139
    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->isVertical()Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, p4

    goto :goto_0

    :cond_0
    move v0, p3

    :goto_0
    iput v0, p0, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->mainAxisLayoutSize:I

    .line 140
    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->isVertical()Z

    move-result v0

    if-eqz v0, :cond_1

    move v0, p3

    goto :goto_1

    :cond_1
    move v0, p4

    .line 143
    .local v0, "crossAxisLayoutSize":I
    :goto_1
    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->isVertical()Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->layoutDirection:Landroidx/compose/ui/unit/LayoutDirection;

    sget-object v2, Landroidx/compose/ui/unit/LayoutDirection;->Rtl:Landroidx/compose/ui/unit/LayoutDirection;

    if-ne v1, v2, :cond_2

    .line 144
    sub-int v1, v0, p2

    iget v2, p0, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->crossAxisSize:I

    sub-int/2addr v1, v2

    goto :goto_2

    .line 146
    :cond_2
    move v1, p2

    .line 143
    :goto_2
    nop

    .line 142
    nop

    .line 148
    .local v1, "crossAxisOffset":I
    nop

    .line 149
    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->isVertical()Z

    move-result v2

    const-wide v3, 0xffffffffL

    const/16 v5, 0x20

    if-eqz v2, :cond_3

    .line 150
    const/4 v2, 0x0

    .line 270
    .local v2, "$i$f$IntOffset":I
    const/4 v6, 0x0

    .line 271
    .local v6, "$i$f$packInts":I
    int-to-long v7, v1

    shl-long/2addr v7, v5

    int-to-long v9, p1

    and-long/2addr v3, v9

    or-long/2addr v3, v7

    .line 270
    .end local v6    # "$i$f$packInts":I
    invoke-static {v3, v4}, Landroidx/compose/ui/unit/IntOffset;->constructor-impl(J)J

    move-result-wide v2

    .end local v2    # "$i$f$IntOffset":I
    goto :goto_3

    .line 152
    :cond_3
    const/4 v2, 0x0

    .line 272
    .restart local v2    # "$i$f$IntOffset":I
    const/4 v6, 0x0

    .line 273
    .restart local v6    # "$i$f$packInts":I
    int-to-long v7, p1

    shl-long/2addr v7, v5

    int-to-long v9, v1

    and-long/2addr v3, v9

    or-long/2addr v3, v7

    .line 272
    .end local v6    # "$i$f$packInts":I
    invoke-static {v3, v4}, Landroidx/compose/ui/unit/IntOffset;->constructor-impl(J)J

    move-result-wide v3

    move-wide v2, v3

    .line 148
    .end local v2    # "$i$f$IntOffset":I
    :goto_3
    iput-wide v2, p0, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->offset:J

    .line 154
    move/from16 v2, p5

    iput v2, p0, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->row:I

    .line 155
    move/from16 v3, p6

    iput v3, p0, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->column:I

    .line 156
    iget v4, p0, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->beforeContentPadding:I

    neg-int v4, v4

    iput v4, p0, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->minMainAxisOffset:I

    .line 157
    iget v4, p0, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->mainAxisLayoutSize:I

    iget v5, p0, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->afterContentPadding:I

    add-int/2addr v4, v5

    iput v4, p0, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->maxMainAxisOffset:I

    .line 158
    return-void
.end method

.method public setNonScrollableItem(Z)V
    .locals 0
    .param p1, "<set-?>"    # Z

    .line 106
    iput-boolean p1, p0, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->nonScrollableItem:Z

    return-void
.end method

.method public final updateMainAxisLayoutSize(I)V
    .locals 1
    .param p1, "mainAxisLayoutSize"    # I

    .line 165
    iput p1, p0, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->mainAxisLayoutSize:I

    .line 166
    iget v0, p0, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->afterContentPadding:I

    add-int/2addr v0, p1

    iput v0, p0, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->maxMainAxisOffset:I

    .line 167
    return-void
.end method
