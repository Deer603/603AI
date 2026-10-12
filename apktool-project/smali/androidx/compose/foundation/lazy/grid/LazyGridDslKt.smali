.class public final Landroidx/compose/foundation/lazy/grid/LazyGridDslKt;
.super Ljava/lang/Object;
.source "LazyGridDsl.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,656:1\n113#2:657\n113#2:658\n113#2:659\n113#2:660\n1247#3,6:661\n1247#3,6:667\n1#4:673\n*S KotlinDebug\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt\n*L\n71#1:657\n103#1:658\n160#1:659\n192#1:660\n222#1:661,6\n249#1:667,6\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u009c\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010 \n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u008a\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t2\u0008\u0008\u0002\u0010\n\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\r2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000f2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u00112\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u000b2\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0017\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00010\u0016\u00a2\u0006\u0002\u0008\u0018H\u0007\u00a2\u0006\u0002\u0010\u0019\u001a~\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t2\u0008\u0008\u0002\u0010\n\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\r2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000f2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u00112\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u000b2\u0017\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00010\u0016\u00a2\u0006\u0002\u0008\u0018H\u0007\u00a2\u0006\u0002\u0010\u001a\u001a\u008a\u0001\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t2\u0008\u0008\u0002\u0010\n\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000f2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\r2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u00112\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u000b2\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0017\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00010\u0016\u00a2\u0006\u0002\u0008\u0018H\u0007\u00a2\u0006\u0002\u0010\u001d\u001a~\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t2\u0008\u0008\u0002\u0010\n\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000f2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\r2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u00112\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u000b2\u0017\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00010\u0016\u00a2\u0006\u0002\u0008\u0018H\u0007\u00a2\u0006\u0002\u0010\u001e\u001a&\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020!0 2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!2\u0006\u0010$\u001a\u00020!H\u0002\u001a\u001d\u0010%\u001a\u00020&2\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u000c\u001a\u00020\rH\u0003\u00a2\u0006\u0002\u0010\'\u001a\u001d\u0010(\u001a\u00020&2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH\u0003\u00a2\u0006\u0002\u0010)\u001a\u00db\u0001\u0010*\u001a\u00020\u0001\"\u0004\u0008\u0000\u0010+*\u00020\u00172\u000c\u0010*\u001a\u0008\u0012\u0004\u0012\u0002H+0,2%\u0008\n\u0010-\u001a\u001f\u0012\u0013\u0012\u0011H+\u00a2\u0006\u000c\u0008.\u0012\u0008\u0008/\u0012\u0004\u0008\u0008(0\u0012\u0004\u0012\u000201\u0018\u00010\u001620\u0008\n\u00102\u001a*\u0012\u0004\u0012\u000204\u0012\u0013\u0012\u0011H+\u00a2\u0006\u000c\u0008.\u0012\u0008\u0008/\u0012\u0004\u0008\u0008(0\u0012\u0004\u0012\u000205\u0018\u000103\u00a2\u0006\u0002\u0008\u00182%\u0008\n\u00106\u001a\u001f\u0012\u0013\u0012\u0011H+\u00a2\u0006\u000c\u0008.\u0012\u0008\u0008/\u0012\u0004\u0008\u0008(0\u0012\u0006\u0012\u0004\u0018\u0001010\u001623\u0008\u0004\u00107\u001a-\u0012\u0004\u0012\u000208\u0012\u0013\u0012\u0011H+\u00a2\u0006\u000c\u0008.\u0012\u0008\u0008/\u0012\u0004\u0008\u0008(0\u0012\u0004\u0012\u00020\u000103\u00a2\u0006\u0002\u00089\u00a2\u0006\u0002\u0008\u0018H\u0086\u0008\u00a2\u0006\u0002\u0010:\u001a\u00db\u0001\u0010*\u001a\u00020\u0001\"\u0004\u0008\u0000\u0010+*\u00020\u00172\u000c\u0010*\u001a\u0008\u0012\u0004\u0012\u0002H+0 2%\u0008\n\u0010-\u001a\u001f\u0012\u0013\u0012\u0011H+\u00a2\u0006\u000c\u0008.\u0012\u0008\u0008/\u0012\u0004\u0008\u0008(0\u0012\u0004\u0012\u000201\u0018\u00010\u001620\u0008\n\u00102\u001a*\u0012\u0004\u0012\u000204\u0012\u0013\u0012\u0011H+\u00a2\u0006\u000c\u0008.\u0012\u0008\u0008/\u0012\u0004\u0008\u0008(0\u0012\u0004\u0012\u000205\u0018\u000103\u00a2\u0006\u0002\u0008\u00182%\u0008\n\u00106\u001a\u001f\u0012\u0013\u0012\u0011H+\u00a2\u0006\u000c\u0008.\u0012\u0008\u0008/\u0012\u0004\u0008\u0008(0\u0012\u0006\u0012\u0004\u0018\u0001010\u001623\u0008\u0004\u00107\u001a-\u0012\u0004\u0012\u000208\u0012\u0013\u0012\u0011H+\u00a2\u0006\u000c\u0008.\u0012\u0008\u0008/\u0012\u0004\u0008\u0008(0\u0012\u0004\u0012\u00020\u000103\u00a2\u0006\u0002\u00089\u00a2\u0006\u0002\u0008\u0018H\u0086\u0008\u00a2\u0006\u0002\u0010;\u001a\u00af\u0002\u0010<\u001a\u00020\u0001\"\u0004\u0008\u0000\u0010+*\u00020\u00172\u000c\u0010*\u001a\u0008\u0012\u0004\u0012\u0002H+0,2:\u0008\n\u0010-\u001a4\u0012\u0013\u0012\u00110!\u00a2\u0006\u000c\u0008.\u0012\u0008\u0008/\u0012\u0004\u0008\u0008(=\u0012\u0013\u0012\u0011H+\u00a2\u0006\u000c\u0008.\u0012\u0008\u0008/\u0012\u0004\u0008\u0008(0\u0012\u0004\u0012\u000201\u0018\u0001032E\u0008\n\u00102\u001a?\u0012\u0004\u0012\u000204\u0012\u0013\u0012\u00110!\u00a2\u0006\u000c\u0008.\u0012\u0008\u0008/\u0012\u0004\u0008\u0008(=\u0012\u0013\u0012\u0011H+\u00a2\u0006\u000c\u0008.\u0012\u0008\u0008/\u0012\u0004\u0008\u0008(0\u0012\u0004\u0012\u000205\u0018\u00010>\u00a2\u0006\u0002\u0008\u00182:\u0008\u0006\u00106\u001a4\u0012\u0013\u0012\u00110!\u00a2\u0006\u000c\u0008.\u0012\u0008\u0008/\u0012\u0004\u0008\u0008(=\u0012\u0013\u0012\u0011H+\u00a2\u0006\u000c\u0008.\u0012\u0008\u0008/\u0012\u0004\u0008\u0008(0\u0012\u0006\u0012\u0004\u0018\u000101032H\u0008\u0004\u00107\u001aB\u0012\u0004\u0012\u000208\u0012\u0013\u0012\u00110!\u00a2\u0006\u000c\u0008.\u0012\u0008\u0008/\u0012\u0004\u0008\u0008(=\u0012\u0013\u0012\u0011H+\u00a2\u0006\u000c\u0008.\u0012\u0008\u0008/\u0012\u0004\u0008\u0008(0\u0012\u0004\u0012\u00020\u00010>\u00a2\u0006\u0002\u00089\u00a2\u0006\u0002\u0008\u0018H\u0086\u0008\u00a2\u0006\u0002\u0010?\u001a\u00af\u0002\u0010<\u001a\u00020\u0001\"\u0004\u0008\u0000\u0010+*\u00020\u00172\u000c\u0010*\u001a\u0008\u0012\u0004\u0012\u0002H+0 2:\u0008\n\u0010-\u001a4\u0012\u0013\u0012\u00110!\u00a2\u0006\u000c\u0008.\u0012\u0008\u0008/\u0012\u0004\u0008\u0008(=\u0012\u0013\u0012\u0011H+\u00a2\u0006\u000c\u0008.\u0012\u0008\u0008/\u0012\u0004\u0008\u0008(0\u0012\u0004\u0012\u000201\u0018\u0001032E\u0008\n\u00102\u001a?\u0012\u0004\u0012\u000204\u0012\u0013\u0012\u00110!\u00a2\u0006\u000c\u0008.\u0012\u0008\u0008/\u0012\u0004\u0008\u0008(=\u0012\u0013\u0012\u0011H+\u00a2\u0006\u000c\u0008.\u0012\u0008\u0008/\u0012\u0004\u0008\u0008(0\u0012\u0004\u0012\u000205\u0018\u00010>\u00a2\u0006\u0002\u0008\u00182:\u0008\u0006\u00106\u001a4\u0012\u0013\u0012\u00110!\u00a2\u0006\u000c\u0008.\u0012\u0008\u0008/\u0012\u0004\u0008\u0008(=\u0012\u0013\u0012\u0011H+\u00a2\u0006\u000c\u0008.\u0012\u0008\u0008/\u0012\u0004\u0008\u0008(0\u0012\u0006\u0012\u0004\u0018\u000101032H\u0008\u0004\u00107\u001aB\u0012\u0004\u0012\u000208\u0012\u0013\u0012\u00110!\u00a2\u0006\u000c\u0008.\u0012\u0008\u0008/\u0012\u0004\u0008\u0008(=\u0012\u0013\u0012\u0011H+\u00a2\u0006\u000c\u0008.\u0012\u0008\u0008/\u0012\u0004\u0008\u0008(0\u0012\u0004\u0012\u00020\u00010>\u00a2\u0006\u0002\u00089\u00a2\u0006\u0002\u0008\u0018H\u0086\u0008\u00a2\u0006\u0002\u0010@\u00a8\u0006A"
    }
    d2 = {
        "LazyHorizontalGrid",
        "",
        "rows",
        "Landroidx/compose/foundation/lazy/grid/GridCells;",
        "modifier",
        "Landroidx/compose/ui/Modifier;",
        "state",
        "Landroidx/compose/foundation/lazy/grid/LazyGridState;",
        "contentPadding",
        "Landroidx/compose/foundation/layout/PaddingValues;",
        "reverseLayout",
        "",
        "horizontalArrangement",
        "Landroidx/compose/foundation/layout/Arrangement$Horizontal;",
        "verticalArrangement",
        "Landroidx/compose/foundation/layout/Arrangement$Vertical;",
        "flingBehavior",
        "Landroidx/compose/foundation/gestures/FlingBehavior;",
        "userScrollEnabled",
        "overscrollEffect",
        "Landroidx/compose/foundation/OverscrollEffect;",
        "content",
        "Lkotlin/Function1;",
        "Landroidx/compose/foundation/lazy/grid/LazyGridScope;",
        "Lkotlin/ExtensionFunctionType;",
        "(Landroidx/compose/foundation/lazy/grid/GridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/gestures/FlingBehavior;ZLandroidx/compose/foundation/OverscrollEffect;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V",
        "(Landroidx/compose/foundation/lazy/grid/GridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/gestures/FlingBehavior;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "LazyVerticalGrid",
        "columns",
        "(Landroidx/compose/foundation/lazy/grid/GridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;ZLandroidx/compose/foundation/OverscrollEffect;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V",
        "(Landroidx/compose/foundation/lazy/grid/GridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "calculateCellsCrossAxisSizeImpl",
        "",
        "",
        "gridSize",
        "slotCount",
        "spacing",
        "rememberColumnWidthSums",
        "Landroidx/compose/foundation/lazy/grid/LazyGridSlotsProvider;",
        "(Landroidx/compose/foundation/lazy/grid/GridCells;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/lazy/grid/LazyGridSlotsProvider;",
        "rememberRowHeightSums",
        "(Landroidx/compose/foundation/lazy/grid/GridCells;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/lazy/grid/LazyGridSlotsProvider;",
        "items",
        "T",
        "",
        "key",
        "Lkotlin/ParameterName;",
        "name",
        "item",
        "",
        "span",
        "Lkotlin/Function2;",
        "Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;",
        "Landroidx/compose/foundation/lazy/grid/GridItemSpan;",
        "contentType",
        "itemContent",
        "Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;",
        "Landroidx/compose/runtime/Composable;",
        "(Landroidx/compose/foundation/lazy/grid/LazyGridScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V",
        "(Landroidx/compose/foundation/lazy/grid/LazyGridScope;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V",
        "itemsIndexed",
        "index",
        "Lkotlin/Function3;",
        "(Landroidx/compose/foundation/lazy/grid/LazyGridScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;)V",
        "(Landroidx/compose/foundation/lazy/grid/LazyGridScope;Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;)V",
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


# direct methods
.method public static final LazyHorizontalGrid(Landroidx/compose/foundation/lazy/grid/GridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/gestures/FlingBehavior;ZLandroidx/compose/foundation/OverscrollEffect;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V
    .locals 31
    .param p0, "rows"    # Landroidx/compose/foundation/lazy/grid/GridCells;
    .param p1, "modifier"    # Landroidx/compose/ui/Modifier;
    .param p2, "state"    # Landroidx/compose/foundation/lazy/grid/LazyGridState;
    .param p3, "contentPadding"    # Landroidx/compose/foundation/layout/PaddingValues;
    .param p4, "reverseLayout"    # Z
    .param p5, "horizontalArrangement"    # Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .param p6, "verticalArrangement"    # Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .param p7, "flingBehavior"    # Landroidx/compose/foundation/gestures/FlingBehavior;
    .param p8, "userScrollEnabled"    # Z
    .param p9, "overscrollEffect"    # Landroidx/compose/foundation/OverscrollEffect;
    .param p10, "content"    # Lkotlin/jvm/functions/Function1;
    .param p11, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p12, "$changed"    # I
    .param p13, "$changed1"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/lazy/grid/GridCells;",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/foundation/lazy/grid/LazyGridState;",
            "Landroidx/compose/foundation/layout/PaddingValues;",
            "Z",
            "Landroidx/compose/foundation/layout/Arrangement$Horizontal;",
            "Landroidx/compose/foundation/layout/Arrangement$Vertical;",
            "Landroidx/compose/foundation/gestures/FlingBehavior;",
            "Z",
            "Landroidx/compose/foundation/OverscrollEffect;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/foundation/lazy/grid/LazyGridScope;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "III)V"
        }
    .end annotation

    .line 169
    move-object/from16 v1, p0

    move/from16 v12, p12

    move/from16 v14, p14

    const v0, 0x25e7b320

    move-object/from16 v2, p11

    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v2

    .end local p11    # "$composer":Landroidx/compose/runtime/Composer;
    .local v2, "$composer":Landroidx/compose/runtime/Composer;
    const-string v3, "C(LazyHorizontalGrid)P(7,4,8,1,6,3,10,2,9,5)170@7819L48,169@7793L504:LazyGridDsl.kt#7791vq"

    invoke-static {v2, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    move/from16 v3, p12

    .local v3, "$dirty":I
    move/from16 v4, p13

    .local v4, "$dirty1":I
    and-int/lit8 v5, v14, 0x1

    if-eqz v5, :cond_0

    or-int/lit8 v3, v3, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v5, v12, 0x6

    if-nez v5, :cond_2

    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    const/4 v5, 0x4

    goto :goto_0

    :cond_1
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v3, v5

    :cond_2
    :goto_1
    and-int/lit8 v5, v14, 0x2

    if-eqz v5, :cond_3

    or-int/lit8 v3, v3, 0x30

    move-object/from16 v8, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v8, v12, 0x30

    if-nez v8, :cond_5

    move-object/from16 v8, p1

    invoke-interface {v2, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_4

    const/16 v9, 0x20

    goto :goto_2

    :cond_4
    const/16 v9, 0x10

    :goto_2
    or-int/2addr v3, v9

    goto :goto_3

    :cond_5
    move-object/from16 v8, p1

    :goto_3
    and-int/lit16 v9, v12, 0x180

    if-nez v9, :cond_8

    and-int/lit8 v9, v14, 0x4

    if-nez v9, :cond_6

    move-object/from16 v9, p2

    invoke-interface {v2, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_7

    const/16 v10, 0x100

    goto :goto_4

    :cond_6
    move-object/from16 v9, p2

    :cond_7
    const/16 v10, 0x80

    :goto_4
    or-int/2addr v3, v10

    goto :goto_5

    :cond_8
    move-object/from16 v9, p2

    :goto_5
    and-int/lit8 v10, v14, 0x8

    if-eqz v10, :cond_9

    or-int/lit16 v3, v3, 0xc00

    move-object/from16 v11, p3

    goto :goto_7

    :cond_9
    and-int/lit16 v11, v12, 0xc00

    if-nez v11, :cond_b

    move-object/from16 v11, p3

    invoke-interface {v2, v11}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_a

    const/16 v13, 0x800

    goto :goto_6

    :cond_a
    const/16 v13, 0x400

    :goto_6
    or-int/2addr v3, v13

    goto :goto_7

    :cond_b
    move-object/from16 v11, p3

    :goto_7
    and-int/lit8 v13, v14, 0x10

    if-eqz v13, :cond_c

    or-int/lit16 v3, v3, 0x6000

    move/from16 v15, p4

    goto :goto_9

    :cond_c
    and-int/lit16 v15, v12, 0x6000

    if-nez v15, :cond_e

    move/from16 v15, p4

    invoke-interface {v2, v15}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v16

    if-eqz v16, :cond_d

    const/16 v16, 0x4000

    goto :goto_8

    :cond_d
    const/16 v16, 0x2000

    :goto_8
    or-int v3, v3, v16

    goto :goto_9

    :cond_e
    move/from16 v15, p4

    :goto_9
    const/high16 v16, 0x30000

    and-int v17, v12, v16

    if-nez v17, :cond_11

    and-int/lit8 v17, v14, 0x20

    if-nez v17, :cond_f

    move-object/from16 v7, p5

    invoke-interface {v2, v7}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_10

    const/high16 v17, 0x20000

    goto :goto_a

    :cond_f
    move-object/from16 v7, p5

    :cond_10
    const/high16 v17, 0x10000

    :goto_a
    or-int v3, v3, v17

    goto :goto_b

    :cond_11
    move-object/from16 v7, p5

    :goto_b
    and-int/lit8 v17, v14, 0x40

    const/high16 v18, 0x180000

    if-eqz v17, :cond_12

    or-int v3, v3, v18

    move-object/from16 v0, p6

    goto :goto_d

    :cond_12
    and-int v18, v12, v18

    if-nez v18, :cond_14

    move-object/from16 v0, p6

    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_13

    const/high16 v19, 0x100000

    goto :goto_c

    :cond_13
    const/high16 v19, 0x80000

    :goto_c
    or-int v3, v3, v19

    goto :goto_d

    :cond_14
    move-object/from16 v0, p6

    :goto_d
    const/high16 v19, 0xc00000

    and-int v19, v12, v19

    if-nez v19, :cond_17

    and-int/lit16 v6, v14, 0x80

    if-nez v6, :cond_15

    move-object/from16 v6, p7

    invoke-interface {v2, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_16

    const/high16 v20, 0x800000

    goto :goto_e

    :cond_15
    move-object/from16 v6, p7

    :cond_16
    const/high16 v20, 0x400000

    :goto_e
    or-int v3, v3, v20

    goto :goto_f

    :cond_17
    move-object/from16 v6, p7

    :goto_f
    and-int/lit16 v0, v14, 0x100

    const/high16 v20, 0x6000000

    if-eqz v0, :cond_18

    or-int v3, v3, v20

    move/from16 v20, v0

    move/from16 v0, p8

    goto :goto_11

    :cond_18
    and-int v20, v12, v20

    if-nez v20, :cond_1a

    move/from16 v20, v0

    move/from16 v0, p8

    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v21

    if-eqz v21, :cond_19

    const/high16 v21, 0x4000000

    goto :goto_10

    :cond_19
    const/high16 v21, 0x2000000

    :goto_10
    or-int v3, v3, v21

    goto :goto_11

    :cond_1a
    move/from16 v20, v0

    move/from16 v0, p8

    :goto_11
    const/high16 v21, 0x30000000

    and-int v21, v12, v21

    if-nez v21, :cond_1d

    and-int/lit16 v0, v14, 0x200

    if-nez v0, :cond_1b

    move-object/from16 v0, p9

    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_1c

    const/high16 v21, 0x20000000

    goto :goto_12

    :cond_1b
    move-object/from16 v0, p9

    :cond_1c
    const/high16 v21, 0x10000000

    :goto_12
    or-int v3, v3, v21

    goto :goto_13

    :cond_1d
    move-object/from16 v0, p9

    :goto_13
    and-int/lit16 v0, v14, 0x400

    if-eqz v0, :cond_1e

    or-int/lit8 v4, v4, 0x6

    move-object/from16 v0, p10

    goto :goto_15

    :cond_1e
    and-int/lit8 v0, p13, 0x6

    if-nez v0, :cond_20

    move-object/from16 v0, p10

    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_1f

    const/16 v21, 0x4

    goto :goto_14

    :cond_1f
    const/16 v21, 0x2

    :goto_14
    or-int v4, v4, v21

    goto :goto_15

    :cond_20
    move-object/from16 v0, p10

    :goto_15
    const v21, 0x12492493

    and-int v0, v3, v21

    move/from16 p11, v5

    const v5, 0x12492492

    const/4 v6, 0x0

    if-ne v0, v5, :cond_22

    and-int/lit8 v0, v4, 0x3

    const/4 v5, 0x2

    if-eq v0, v5, :cond_21

    goto :goto_16

    :cond_21
    move v0, v6

    goto :goto_17

    :cond_22
    :goto_16
    const/4 v0, 0x1

    :goto_17
    and-int/lit8 v5, v3, 0x1

    invoke-interface {v2, v0, v5}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v0

    if-eqz v0, :cond_35

    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->startDefaults()V

    const-string v0, "158@7264L23,164@7621L15,166@7719L26"

    invoke-static {v2, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 v0, v12, 0x1

    if-eqz v0, :cond_28

    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    move-result v0

    if-eqz v0, :cond_23

    goto :goto_18

    .line 167
    :cond_23
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    and-int/lit8 v0, v14, 0x4

    if-eqz v0, :cond_24

    and-int/lit16 v3, v3, -0x381

    :cond_24
    and-int/lit8 v0, v14, 0x20

    if-eqz v0, :cond_25

    const v0, -0x70001

    and-int/2addr v3, v0

    :cond_25
    and-int/lit16 v0, v14, 0x80

    if-eqz v0, :cond_26

    const v0, -0x1c00001

    and-int/2addr v3, v0

    :cond_26
    and-int/lit16 v0, v14, 0x200

    if-eqz v0, :cond_27

    const v0, -0x70000001

    and-int/2addr v0, v3

    move-object/from16 v21, p7

    move/from16 v22, p8

    move-object/from16 v23, p9

    move v3, v0

    move-object/from16 v25, v7

    move-object/from16 v18, v11

    move/from16 v19, v15

    move/from16 v5, v16

    const v6, 0x25e7b320

    move-object/from16 v0, p6

    move-object v15, v8

    move-object/from16 v16, v9

    .end local v3    # "$dirty":I
    .local v0, "$dirty":I
    goto/16 :goto_1d

    .end local v0    # "$dirty":I
    .restart local v3    # "$dirty":I
    :cond_27
    move-object/from16 v0, p6

    move-object/from16 v21, p7

    move/from16 v22, p8

    move-object/from16 v23, p9

    move-object/from16 v25, v7

    move-object/from16 v18, v11

    move/from16 v19, v15

    move/from16 v5, v16

    const v6, 0x25e7b320

    move-object v15, v8

    move-object/from16 v16, v9

    goto/16 :goto_1d

    .line 169
    :cond_28
    :goto_18
    if-eqz p11, :cond_29

    .line 158
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v0, Landroidx/compose/ui/Modifier;

    move-object v8, v0

    .end local p1    # "modifier":Landroidx/compose/ui/Modifier;
    .local v8, "modifier":Landroidx/compose/ui/Modifier;
    :cond_29
    and-int/lit8 v0, v14, 0x4

    if-eqz v0, :cond_2a

    .line 159
    const/4 v0, 0x3

    invoke-static {v6, v6, v2, v6, v0}, Landroidx/compose/foundation/lazy/grid/LazyGridStateKt;->rememberLazyGridState(IILandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/lazy/grid/LazyGridState;

    move-result-object v0

    .end local p2    # "state":Landroidx/compose/foundation/lazy/grid/LazyGridState;
    .local v0, "state":Landroidx/compose/foundation/lazy/grid/LazyGridState;
    and-int/lit16 v3, v3, -0x381

    move-object v9, v0

    .end local v0    # "state":Landroidx/compose/foundation/lazy/grid/LazyGridState;
    .local v9, "state":Landroidx/compose/foundation/lazy/grid/LazyGridState;
    :cond_2a
    if-eqz v10, :cond_2b

    .line 160
    const/4 v0, 0x0

    .local v0, "$this$dp$iv":I
    const/4 v5, 0x0

    .line 659
    .local v5, "$i$f$getDp":I
    int-to-float v10, v0

    invoke-static {v10}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    .line 160
    .end local v0    # "$this$dp$iv":I
    .end local v5    # "$i$f$getDp":I
    invoke-static {v0}, Landroidx/compose/foundation/layout/PaddingKt;->PaddingValues-0680j_4(F)Landroidx/compose/foundation/layout/PaddingValues;

    move-result-object v0

    move-object v11, v0

    .end local p3    # "contentPadding":Landroidx/compose/foundation/layout/PaddingValues;
    .local v11, "contentPadding":Landroidx/compose/foundation/layout/PaddingValues;
    :cond_2b
    if-eqz v13, :cond_2c

    .line 161
    const/4 v0, 0x0

    move v15, v0

    .end local p4    # "reverseLayout":Z
    .local v15, "reverseLayout":Z
    :cond_2c
    and-int/lit8 v0, v14, 0x20

    if-eqz v0, :cond_2e

    .line 163
    sget-object v0, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    if-nez v15, :cond_2d

    invoke-virtual {v0}, Landroidx/compose/foundation/layout/Arrangement;->getStart()Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    move-result-object v0

    goto :goto_19

    :cond_2d
    invoke-virtual {v0}, Landroidx/compose/foundation/layout/Arrangement;->getEnd()Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    move-result-object v0

    .end local p5    # "horizontalArrangement":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .local v0, "horizontalArrangement":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    :goto_19
    const v5, -0x70001

    and-int/2addr v3, v5

    move-object v7, v0

    .end local v0    # "horizontalArrangement":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .local v7, "horizontalArrangement":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    :cond_2e
    if-eqz v17, :cond_2f

    .line 164
    sget-object v0, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    invoke-virtual {v0}, Landroidx/compose/foundation/layout/Arrangement;->getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    move-result-object v0

    .end local p6    # "verticalArrangement":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .local v0, "verticalArrangement":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    goto :goto_1a

    .line 163
    .end local v0    # "verticalArrangement":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .restart local p6    # "verticalArrangement":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    :cond_2f
    move-object/from16 v0, p6

    .line 164
    .end local p6    # "verticalArrangement":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .restart local v0    # "verticalArrangement":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    :goto_1a
    and-int/lit16 v5, v14, 0x80

    if-eqz v5, :cond_30

    .line 165
    sget-object v5, Landroidx/compose/foundation/gestures/ScrollableDefaults;->INSTANCE:Landroidx/compose/foundation/gestures/ScrollableDefaults;

    const/4 v10, 0x6

    invoke-virtual {v5, v2, v10}, Landroidx/compose/foundation/gestures/ScrollableDefaults;->flingBehavior(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/gestures/FlingBehavior;

    move-result-object v5

    .end local p7    # "flingBehavior":Landroidx/compose/foundation/gestures/FlingBehavior;
    .local v5, "flingBehavior":Landroidx/compose/foundation/gestures/FlingBehavior;
    const v10, -0x1c00001

    and-int/2addr v3, v10

    goto :goto_1b

    .line 164
    .end local v5    # "flingBehavior":Landroidx/compose/foundation/gestures/FlingBehavior;
    .restart local p7    # "flingBehavior":Landroidx/compose/foundation/gestures/FlingBehavior;
    :cond_30
    move-object/from16 v5, p7

    .line 165
    .end local p7    # "flingBehavior":Landroidx/compose/foundation/gestures/FlingBehavior;
    .restart local v5    # "flingBehavior":Landroidx/compose/foundation/gestures/FlingBehavior;
    :goto_1b
    if-eqz v20, :cond_31

    .line 166
    const/4 v10, 0x1

    .end local p8    # "userScrollEnabled":Z
    .local v10, "userScrollEnabled":Z
    goto :goto_1c

    .line 165
    .end local v10    # "userScrollEnabled":Z
    .restart local p8    # "userScrollEnabled":Z
    :cond_31
    move/from16 v10, p8

    .line 166
    .end local p8    # "userScrollEnabled":Z
    .restart local v10    # "userScrollEnabled":Z
    :goto_1c
    and-int/lit16 v13, v14, 0x200

    if-eqz v13, :cond_32

    .line 167
    invoke-static {v2, v6}, Landroidx/compose/foundation/OverscrollKt;->rememberOverscrollEffect(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/OverscrollEffect;

    move-result-object v6

    .end local p9    # "overscrollEffect":Landroidx/compose/foundation/OverscrollEffect;
    .local v6, "overscrollEffect":Landroidx/compose/foundation/OverscrollEffect;
    const v13, -0x70000001

    and-int/2addr v3, v13

    move-object/from16 v21, v5

    move-object/from16 v23, v6

    move-object/from16 v25, v7

    move/from16 v22, v10

    move-object/from16 v18, v11

    move/from16 v19, v15

    move/from16 v5, v16

    const v6, 0x25e7b320

    move-object v15, v8

    move-object/from16 v16, v9

    goto :goto_1d

    .line 166
    .end local v6    # "overscrollEffect":Landroidx/compose/foundation/OverscrollEffect;
    .restart local p9    # "overscrollEffect":Landroidx/compose/foundation/OverscrollEffect;
    :cond_32
    move-object/from16 v23, p9

    move-object/from16 v21, v5

    move-object/from16 v25, v7

    move/from16 v22, v10

    move-object/from16 v18, v11

    move/from16 v19, v15

    move/from16 v5, v16

    const v6, 0x25e7b320

    move-object v15, v8

    move-object/from16 v16, v9

    .line 167
    .end local v5    # "flingBehavior":Landroidx/compose/foundation/gestures/FlingBehavior;
    .end local v7    # "horizontalArrangement":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .end local v8    # "modifier":Landroidx/compose/ui/Modifier;
    .end local v9    # "state":Landroidx/compose/foundation/lazy/grid/LazyGridState;
    .end local v10    # "userScrollEnabled":Z
    .end local v11    # "contentPadding":Landroidx/compose/foundation/layout/PaddingValues;
    .end local p9    # "overscrollEffect":Landroidx/compose/foundation/OverscrollEffect;
    .local v15, "modifier":Landroidx/compose/ui/Modifier;
    .local v16, "state":Landroidx/compose/foundation/lazy/grid/LazyGridState;
    .local v18, "contentPadding":Landroidx/compose/foundation/layout/PaddingValues;
    .local v19, "reverseLayout":Z
    .local v21, "flingBehavior":Landroidx/compose/foundation/gestures/FlingBehavior;
    .local v22, "userScrollEnabled":Z
    .local v23, "overscrollEffect":Landroidx/compose/foundation/OverscrollEffect;
    .local v25, "horizontalArrangement":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    :goto_1d
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endDefaults()V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v7

    if-eqz v7, :cond_33

    .line 169
    const-string v7, "androidx.compose.foundation.lazy.grid.LazyHorizontalGrid (LazyGridDsl.kt:168)"

    invoke-static {v6, v3, v4, v7}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 171
    :cond_33
    and-int/lit8 v6, v3, 0xe

    shr-int/lit8 v7, v3, 0xf

    and-int/lit8 v7, v7, 0x70

    or-int/2addr v6, v7

    invoke-static {v1, v0, v2, v6}, Landroidx/compose/foundation/lazy/grid/LazyGridDslKt;->rememberRowHeightSums(Landroidx/compose/foundation/lazy/grid/GridCells;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/lazy/grid/LazyGridSlotsProvider;

    move-result-object v17

    .line 172
    nop

    .line 173
    nop

    .line 171
    nop

    .line 174
    nop

    .line 175
    nop

    .line 176
    nop

    .line 179
    nop

    .line 180
    nop

    .line 181
    nop

    .line 178
    nop

    .line 177
    nop

    .line 182
    shr-int/lit8 v6, v3, 0x3

    and-int/lit8 v6, v6, 0xe

    or-int/2addr v5, v6

    shr-int/lit8 v6, v3, 0x3

    and-int/lit8 v6, v6, 0x70

    or-int/2addr v5, v6

    and-int/lit16 v6, v3, 0x1c00

    or-int/2addr v5, v6

    const v6, 0xe000

    and-int/2addr v6, v3

    or-int/2addr v5, v6

    shr-int/lit8 v6, v3, 0x3

    const/high16 v7, 0x380000

    and-int/2addr v6, v7

    or-int/2addr v5, v6

    shr-int/lit8 v6, v3, 0x3

    const/high16 v7, 0x1c00000

    and-int/2addr v6, v7

    or-int/2addr v5, v6

    shr-int/lit8 v6, v3, 0x3

    const/high16 v7, 0xe000000

    and-int/2addr v6, v7

    or-int/2addr v5, v6

    shl-int/lit8 v6, v3, 0x9

    const/high16 v7, 0x70000000

    and-int/2addr v6, v7

    or-int v28, v5, v6

    shr-int/lit8 v5, v3, 0xf

    and-int/lit8 v5, v5, 0xe

    shl-int/lit8 v6, v4, 0x3

    and-int/lit8 v6, v6, 0x70

    or-int v29, v5, v6

    .line 170
    const/16 v20, 0x0

    const/16 v30, 0x0

    move-object/from16 v26, p10

    move-object/from16 v24, v0

    move-object/from16 v27, v2

    .end local v0    # "verticalArrangement":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .end local v2    # "$composer":Landroidx/compose/runtime/Composer;
    .local v24, "verticalArrangement":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .local v27, "$composer":Landroidx/compose/runtime/Composer;
    invoke-static/range {v15 .. v30}, Landroidx/compose/foundation/lazy/grid/LazyGridKt;->LazyGrid(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/foundation/lazy/grid/LazyGridSlotsProvider;Landroidx/compose/foundation/layout/PaddingValues;ZZLandroidx/compose/foundation/gestures/FlingBehavior;ZLandroidx/compose/foundation/OverscrollEffect;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_34

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 184
    :cond_34
    move v0, v4

    move-object v2, v15

    move-object/from16 v4, v18

    move/from16 v5, v19

    move-object/from16 v8, v21

    move/from16 v9, v22

    move-object/from16 v10, v23

    move-object/from16 v7, v24

    move-object/from16 v6, v25

    move v15, v3

    move-object/from16 v3, v16

    goto :goto_1e

    .end local v15    # "modifier":Landroidx/compose/ui/Modifier;
    .end local v16    # "state":Landroidx/compose/foundation/lazy/grid/LazyGridState;
    .end local v18    # "contentPadding":Landroidx/compose/foundation/layout/PaddingValues;
    .end local v19    # "reverseLayout":Z
    .end local v21    # "flingBehavior":Landroidx/compose/foundation/gestures/FlingBehavior;
    .end local v22    # "userScrollEnabled":Z
    .end local v23    # "overscrollEffect":Landroidx/compose/foundation/OverscrollEffect;
    .end local v24    # "verticalArrangement":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .end local v25    # "horizontalArrangement":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .end local v27    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v2    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local p1    # "modifier":Landroidx/compose/ui/Modifier;
    .restart local p2    # "state":Landroidx/compose/foundation/lazy/grid/LazyGridState;
    .restart local p3    # "contentPadding":Landroidx/compose/foundation/layout/PaddingValues;
    .restart local p4    # "reverseLayout":Z
    .restart local p5    # "horizontalArrangement":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .restart local p6    # "verticalArrangement":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .restart local p7    # "flingBehavior":Landroidx/compose/foundation/gestures/FlingBehavior;
    .restart local p8    # "userScrollEnabled":Z
    .restart local p9    # "overscrollEffect":Landroidx/compose/foundation/OverscrollEffect;
    :cond_35
    move-object/from16 v27, v2

    .end local v2    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v27    # "$composer":Landroidx/compose/runtime/Composer;
    invoke-interface/range {v27 .. v27}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object/from16 v10, p9

    move v0, v4

    move-object v6, v7

    move-object v2, v8

    move-object v4, v11

    move v5, v15

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move v15, v3

    move-object v3, v9

    move/from16 v9, p8

    .end local p1    # "modifier":Landroidx/compose/ui/Modifier;
    .end local p2    # "state":Landroidx/compose/foundation/lazy/grid/LazyGridState;
    .end local p3    # "contentPadding":Landroidx/compose/foundation/layout/PaddingValues;
    .end local p4    # "reverseLayout":Z
    .end local p5    # "horizontalArrangement":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .end local p6    # "verticalArrangement":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .end local p7    # "flingBehavior":Landroidx/compose/foundation/gestures/FlingBehavior;
    .end local p8    # "userScrollEnabled":Z
    .end local p9    # "overscrollEffect":Landroidx/compose/foundation/OverscrollEffect;
    .local v0, "$dirty1":I
    .local v2, "modifier":Landroidx/compose/ui/Modifier;
    .local v3, "state":Landroidx/compose/foundation/lazy/grid/LazyGridState;
    .local v4, "contentPadding":Landroidx/compose/foundation/layout/PaddingValues;
    .local v5, "reverseLayout":Z
    .local v6, "horizontalArrangement":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .local v7, "verticalArrangement":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .local v8, "flingBehavior":Landroidx/compose/foundation/gestures/FlingBehavior;
    .local v9, "userScrollEnabled":Z
    .local v10, "overscrollEffect":Landroidx/compose/foundation/OverscrollEffect;
    .local v15, "$dirty":I
    :goto_1e
    invoke-interface/range {v27 .. v27}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v11

    if-eqz v11, :cond_36

    move v13, v0

    .end local v0    # "$dirty1":I
    .local v13, "$dirty1":I
    new-instance v0, Landroidx/compose/foundation/lazy/grid/LazyGridDslKt$LazyHorizontalGrid$1;

    move/from16 v16, v13

    move/from16 p1, v15

    move/from16 v13, p13

    move-object v15, v11

    move-object/from16 v11, p10

    .end local v13    # "$dirty1":I
    .end local v15    # "$dirty":I
    .local v16, "$dirty1":I
    .local p1, "$dirty":I
    invoke-direct/range {v0 .. v14}, Landroidx/compose/foundation/lazy/grid/LazyGridDslKt$LazyHorizontalGrid$1;-><init>(Landroidx/compose/foundation/lazy/grid/GridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/gestures/FlingBehavior;ZLandroidx/compose/foundation/OverscrollEffect;Lkotlin/jvm/functions/Function1;III)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    invoke-interface {v15, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    goto :goto_1f

    .end local v16    # "$dirty1":I
    .end local p1    # "$dirty":I
    .restart local v0    # "$dirty1":I
    .restart local v15    # "$dirty":I
    :cond_36
    move/from16 v16, v0

    move/from16 p1, v15

    .end local v0    # "$dirty1":I
    .end local v15    # "$dirty":I
    .restart local v16    # "$dirty1":I
    .restart local p1    # "$dirty":I
    :goto_1f
    return-void
.end method

.method public static final synthetic LazyHorizontalGrid(Landroidx/compose/foundation/lazy/grid/GridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/gestures/FlingBehavior;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 28
    .param p0, "rows"    # Landroidx/compose/foundation/lazy/grid/GridCells;
    .param p1, "modifier"    # Landroidx/compose/ui/Modifier;
    .param p2, "state"    # Landroidx/compose/foundation/lazy/grid/LazyGridState;
    .param p3, "contentPadding"    # Landroidx/compose/foundation/layout/PaddingValues;
    .param p4, "reverseLayout"    # Z
    .param p5, "horizontalArrangement"    # Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .param p6, "verticalArrangement"    # Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .param p7, "flingBehavior"    # Landroidx/compose/foundation/gestures/FlingBehavior;
    .param p8, "userScrollEnabled"    # Z
    .param p9, "content"    # Lkotlin/jvm/functions/Function1;
    .param p10, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p11, "$changed"    # I
    .annotation runtime Lkotlin/Deprecated;
        level = .enum Lkotlin/DeprecationLevel;->HIDDEN:Lkotlin/DeprecationLevel;
        message = "Use the non deprecated overload"
    .end annotation

    .line 200
    move/from16 v11, p11

    move/from16 v12, p12

    const v0, 0x7e93b31a

    move-object/from16 v1, p10

    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v1

    .end local p10    # "$composer":Landroidx/compose/runtime/Composer;
    .local v1, "$composer":Landroidx/compose/runtime/Composer;
    const-string v2, "C(LazyHorizontalGrid)P(6,4,7,1,5,3,9,2,8)210@9351L26,200@8959L451:LazyGridDsl.kt#7791vq"

    invoke-static {v1, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    move/from16 v2, p11

    .local v2, "$dirty":I
    and-int/lit8 v3, v12, 0x1

    if-eqz v3, :cond_0

    or-int/lit8 v2, v2, 0x6

    move-object/from16 v13, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v11, 0x6

    if-nez v3, :cond_2

    move-object/from16 v13, p0

    invoke-interface {v1, v13}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_1
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v2, v3

    goto :goto_1

    :cond_2
    move-object/from16 v13, p0

    :goto_1
    and-int/lit8 v3, v12, 0x2

    if-eqz v3, :cond_3

    or-int/lit8 v2, v2, 0x30

    move-object/from16 v4, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v4, v11, 0x30

    if-nez v4, :cond_5

    move-object/from16 v4, p1

    invoke-interface {v1, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x20

    goto :goto_2

    :cond_4
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v2, v5

    goto :goto_3

    :cond_5
    move-object/from16 v4, p1

    :goto_3
    and-int/lit16 v5, v11, 0x180

    if-nez v5, :cond_8

    and-int/lit8 v5, v12, 0x4

    if-nez v5, :cond_6

    move-object/from16 v5, p2

    invoke-interface {v1, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_7

    const/16 v6, 0x100

    goto :goto_4

    :cond_6
    move-object/from16 v5, p2

    :cond_7
    const/16 v6, 0x80

    :goto_4
    or-int/2addr v2, v6

    goto :goto_5

    :cond_8
    move-object/from16 v5, p2

    :goto_5
    and-int/lit8 v6, v12, 0x8

    if-eqz v6, :cond_9

    or-int/lit16 v2, v2, 0xc00

    move-object/from16 v7, p3

    goto :goto_7

    :cond_9
    and-int/lit16 v7, v11, 0xc00

    if-nez v7, :cond_b

    move-object/from16 v7, p3

    invoke-interface {v1, v7}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_a

    const/16 v8, 0x800

    goto :goto_6

    :cond_a
    const/16 v8, 0x400

    :goto_6
    or-int/2addr v2, v8

    goto :goto_7

    :cond_b
    move-object/from16 v7, p3

    :goto_7
    and-int/lit8 v8, v12, 0x10

    if-eqz v8, :cond_c

    or-int/lit16 v2, v2, 0x6000

    move/from16 v9, p4

    goto :goto_9

    :cond_c
    and-int/lit16 v9, v11, 0x6000

    if-nez v9, :cond_e

    move/from16 v9, p4

    invoke-interface {v1, v9}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v10

    if-eqz v10, :cond_d

    const/16 v10, 0x4000

    goto :goto_8

    :cond_d
    const/16 v10, 0x2000

    :goto_8
    or-int/2addr v2, v10

    goto :goto_9

    :cond_e
    move/from16 v9, p4

    :goto_9
    const/high16 v10, 0x30000

    and-int/2addr v10, v11

    if-nez v10, :cond_11

    and-int/lit8 v10, v12, 0x20

    if-nez v10, :cond_f

    move-object/from16 v10, p5

    invoke-interface {v1, v10}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_10

    const/high16 v14, 0x20000

    goto :goto_a

    :cond_f
    move-object/from16 v10, p5

    :cond_10
    const/high16 v14, 0x10000

    :goto_a
    or-int/2addr v2, v14

    goto :goto_b

    :cond_11
    move-object/from16 v10, p5

    :goto_b
    and-int/lit8 v14, v12, 0x40

    const/high16 v15, 0x180000

    if-eqz v14, :cond_12

    or-int/2addr v2, v15

    move-object/from16 v15, p6

    goto :goto_d

    :cond_12
    and-int/2addr v15, v11

    if-nez v15, :cond_14

    move-object/from16 v15, p6

    invoke-interface {v1, v15}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_13

    const/high16 v16, 0x100000

    goto :goto_c

    :cond_13
    const/high16 v16, 0x80000

    :goto_c
    or-int v2, v2, v16

    goto :goto_d

    :cond_14
    move-object/from16 v15, p6

    :goto_d
    const/high16 v16, 0xc00000

    and-int v16, v11, v16

    if-nez v16, :cond_17

    and-int/lit16 v0, v12, 0x80

    if-nez v0, :cond_15

    move-object/from16 v0, p7

    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_16

    const/high16 v17, 0x800000

    goto :goto_e

    :cond_15
    move-object/from16 v0, p7

    :cond_16
    const/high16 v17, 0x400000

    :goto_e
    or-int v2, v2, v17

    goto :goto_f

    :cond_17
    move-object/from16 v0, p7

    :goto_f
    and-int/lit16 v0, v12, 0x100

    const/high16 v17, 0x6000000

    if-eqz v0, :cond_18

    or-int v2, v2, v17

    move/from16 v17, v0

    move/from16 v0, p8

    goto :goto_11

    :cond_18
    and-int v17, v11, v17

    if-nez v17, :cond_1a

    move/from16 v17, v0

    move/from16 v0, p8

    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v18

    if-eqz v18, :cond_19

    const/high16 v18, 0x4000000

    goto :goto_10

    :cond_19
    const/high16 v18, 0x2000000

    :goto_10
    or-int v2, v2, v18

    goto :goto_11

    :cond_1a
    move/from16 v17, v0

    move/from16 v0, p8

    :goto_11
    and-int/lit16 v0, v12, 0x200

    const/high16 v18, 0x30000000

    if-eqz v0, :cond_1b

    or-int v2, v2, v18

    move-object/from16 v0, p9

    goto :goto_13

    :cond_1b
    and-int v0, v11, v18

    if-nez v0, :cond_1d

    move-object/from16 v0, p9

    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_1c

    const/high16 v18, 0x20000000

    goto :goto_12

    :cond_1c
    const/high16 v18, 0x10000000

    :goto_12
    or-int v2, v2, v18

    goto :goto_13

    :cond_1d
    move-object/from16 v0, p9

    :goto_13
    const v18, 0x12492493

    and-int v0, v2, v18

    move/from16 p10, v3

    const v3, 0x12492492

    const/4 v4, 0x0

    if-eq v0, v3, :cond_1e

    const/4 v0, 0x1

    goto :goto_14

    :cond_1e
    move v0, v4

    :goto_14
    and-int/lit8 v3, v2, 0x1

    invoke-interface {v1, v0, v3}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v0

    if-eqz v0, :cond_2f

    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->startDefaults()V

    const-string v0, "190@8500L23,196@8857L15"

    invoke-static {v1, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 v0, v11, 0x1

    const v3, -0x1c00001

    const v18, -0x70001

    if-eqz v0, :cond_23

    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    move-result v0

    if-eqz v0, :cond_1f

    goto :goto_15

    .line 198
    :cond_1f
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    and-int/lit8 v0, v12, 0x4

    if-eqz v0, :cond_20

    and-int/lit16 v2, v2, -0x381

    :cond_20
    and-int/lit8 v0, v12, 0x20

    if-eqz v0, :cond_21

    and-int v2, v2, v18

    :cond_21
    and-int/lit16 v0, v12, 0x80

    if-eqz v0, :cond_22

    and-int v0, v2, v3

    move-object/from16 v14, p1

    move-object/from16 v20, p7

    move/from16 v21, p8

    move v2, v0

    move v0, v4

    move-object/from16 v16, v7

    move/from16 v17, v9

    move-object/from16 v18, v10

    move-object/from16 v19, v15

    const v3, 0x7e93b31a

    move-object v15, v5

    .end local v2    # "$dirty":I
    .local v0, "$dirty":I
    goto/16 :goto_1e

    .end local v0    # "$dirty":I
    .restart local v2    # "$dirty":I
    :cond_22
    move-object/from16 v14, p1

    move-object/from16 v20, p7

    move/from16 v21, p8

    move v0, v4

    move-object/from16 v16, v7

    move/from16 v17, v9

    move-object/from16 v18, v10

    move-object/from16 v19, v15

    const v3, 0x7e93b31a

    move-object v15, v5

    goto/16 :goto_1e

    .line 200
    :cond_23
    :goto_15
    if-eqz p10, :cond_24

    .line 190
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v0, Landroidx/compose/ui/Modifier;

    .end local p1    # "modifier":Landroidx/compose/ui/Modifier;
    .local v0, "modifier":Landroidx/compose/ui/Modifier;
    goto :goto_16

    .line 200
    .end local v0    # "modifier":Landroidx/compose/ui/Modifier;
    .restart local p1    # "modifier":Landroidx/compose/ui/Modifier;
    :cond_24
    move-object/from16 v0, p1

    .line 190
    .end local p1    # "modifier":Landroidx/compose/ui/Modifier;
    .restart local v0    # "modifier":Landroidx/compose/ui/Modifier;
    :goto_16
    and-int/lit8 v19, v12, 0x4

    if-eqz v19, :cond_25

    .line 191
    move/from16 p10, v3

    const/4 v3, 0x3

    invoke-static {v4, v4, v1, v4, v3}, Landroidx/compose/foundation/lazy/grid/LazyGridStateKt;->rememberLazyGridState(IILandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/lazy/grid/LazyGridState;

    move-result-object v3

    .end local p2    # "state":Landroidx/compose/foundation/lazy/grid/LazyGridState;
    .local v3, "state":Landroidx/compose/foundation/lazy/grid/LazyGridState;
    and-int/lit16 v2, v2, -0x381

    goto :goto_17

    .line 190
    .end local v3    # "state":Landroidx/compose/foundation/lazy/grid/LazyGridState;
    .restart local p2    # "state":Landroidx/compose/foundation/lazy/grid/LazyGridState;
    :cond_25
    move/from16 p10, v3

    move-object v3, v5

    .line 191
    .end local p2    # "state":Landroidx/compose/foundation/lazy/grid/LazyGridState;
    .restart local v3    # "state":Landroidx/compose/foundation/lazy/grid/LazyGridState;
    :goto_17
    if-eqz v6, :cond_26

    .line 192
    const/4 v5, 0x0

    .local v5, "$this$dp$iv":I
    const/4 v6, 0x0

    .line 660
    .local v6, "$i$f$getDp":I
    int-to-float v4, v5

    invoke-static {v4}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v4

    .line 192
    .end local v5    # "$this$dp$iv":I
    .end local v6    # "$i$f$getDp":I
    invoke-static {v4}, Landroidx/compose/foundation/layout/PaddingKt;->PaddingValues-0680j_4(F)Landroidx/compose/foundation/layout/PaddingValues;

    move-result-object v4

    .end local p3    # "contentPadding":Landroidx/compose/foundation/layout/PaddingValues;
    .local v4, "contentPadding":Landroidx/compose/foundation/layout/PaddingValues;
    goto :goto_18

    .line 191
    .end local v4    # "contentPadding":Landroidx/compose/foundation/layout/PaddingValues;
    .restart local p3    # "contentPadding":Landroidx/compose/foundation/layout/PaddingValues;
    :cond_26
    move-object v4, v7

    .line 192
    .end local p3    # "contentPadding":Landroidx/compose/foundation/layout/PaddingValues;
    .restart local v4    # "contentPadding":Landroidx/compose/foundation/layout/PaddingValues;
    :goto_18
    if-eqz v8, :cond_27

    .line 193
    const/4 v5, 0x0

    .end local p4    # "reverseLayout":Z
    .local v5, "reverseLayout":Z
    goto :goto_19

    .line 192
    .end local v5    # "reverseLayout":Z
    .restart local p4    # "reverseLayout":Z
    :cond_27
    move v5, v9

    .line 193
    .end local p4    # "reverseLayout":Z
    .restart local v5    # "reverseLayout":Z
    :goto_19
    and-int/lit8 v6, v12, 0x20

    if-eqz v6, :cond_29

    .line 195
    sget-object v6, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    if-nez v5, :cond_28

    invoke-virtual {v6}, Landroidx/compose/foundation/layout/Arrangement;->getStart()Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    move-result-object v6

    goto :goto_1a

    :cond_28
    invoke-virtual {v6}, Landroidx/compose/foundation/layout/Arrangement;->getEnd()Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    move-result-object v6

    .end local p5    # "horizontalArrangement":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .local v6, "horizontalArrangement":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    :goto_1a
    and-int v2, v2, v18

    goto :goto_1b

    .line 193
    .end local v6    # "horizontalArrangement":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .restart local p5    # "horizontalArrangement":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    :cond_29
    move-object v6, v10

    .line 195
    .end local p5    # "horizontalArrangement":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .restart local v6    # "horizontalArrangement":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    :goto_1b
    if-eqz v14, :cond_2a

    .line 196
    sget-object v7, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    invoke-virtual {v7}, Landroidx/compose/foundation/layout/Arrangement;->getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    move-result-object v7

    .end local p6    # "verticalArrangement":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .local v7, "verticalArrangement":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    goto :goto_1c

    .line 195
    .end local v7    # "verticalArrangement":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .restart local p6    # "verticalArrangement":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    :cond_2a
    move-object v7, v15

    .line 196
    .end local p6    # "verticalArrangement":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .restart local v7    # "verticalArrangement":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    :goto_1c
    and-int/lit16 v8, v12, 0x80

    if-eqz v8, :cond_2b

    .line 197
    sget-object v8, Landroidx/compose/foundation/gestures/ScrollableDefaults;->INSTANCE:Landroidx/compose/foundation/gestures/ScrollableDefaults;

    const/4 v9, 0x6

    invoke-virtual {v8, v1, v9}, Landroidx/compose/foundation/gestures/ScrollableDefaults;->flingBehavior(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/gestures/FlingBehavior;

    move-result-object v8

    .end local p7    # "flingBehavior":Landroidx/compose/foundation/gestures/FlingBehavior;
    .local v8, "flingBehavior":Landroidx/compose/foundation/gestures/FlingBehavior;
    and-int v2, v2, p10

    goto :goto_1d

    .line 196
    .end local v8    # "flingBehavior":Landroidx/compose/foundation/gestures/FlingBehavior;
    .restart local p7    # "flingBehavior":Landroidx/compose/foundation/gestures/FlingBehavior;
    :cond_2b
    move-object/from16 v8, p7

    .line 197
    .end local p7    # "flingBehavior":Landroidx/compose/foundation/gestures/FlingBehavior;
    .restart local v8    # "flingBehavior":Landroidx/compose/foundation/gestures/FlingBehavior;
    :goto_1d
    if-eqz v17, :cond_2c

    .line 198
    const/4 v9, 0x1

    move-object v14, v0

    move-object v15, v3

    move-object/from16 v16, v4

    move/from16 v17, v5

    move-object/from16 v18, v6

    move-object/from16 v19, v7

    move-object/from16 v20, v8

    move/from16 v21, v9

    const/4 v0, 0x0

    const v3, 0x7e93b31a

    .end local p8    # "userScrollEnabled":Z
    .local v9, "userScrollEnabled":Z
    goto :goto_1e

    .line 197
    .end local v9    # "userScrollEnabled":Z
    .restart local p8    # "userScrollEnabled":Z
    :cond_2c
    move/from16 v21, p8

    move-object v14, v0

    move-object v15, v3

    move-object/from16 v16, v4

    move/from16 v17, v5

    move-object/from16 v18, v6

    move-object/from16 v19, v7

    move-object/from16 v20, v8

    const/4 v0, 0x0

    const v3, 0x7e93b31a

    .line 198
    .end local v0    # "modifier":Landroidx/compose/ui/Modifier;
    .end local v3    # "state":Landroidx/compose/foundation/lazy/grid/LazyGridState;
    .end local v4    # "contentPadding":Landroidx/compose/foundation/layout/PaddingValues;
    .end local v5    # "reverseLayout":Z
    .end local v6    # "horizontalArrangement":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .end local v7    # "verticalArrangement":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .end local v8    # "flingBehavior":Landroidx/compose/foundation/gestures/FlingBehavior;
    .end local p8    # "userScrollEnabled":Z
    .local v14, "modifier":Landroidx/compose/ui/Modifier;
    .local v15, "state":Landroidx/compose/foundation/lazy/grid/LazyGridState;
    .local v16, "contentPadding":Landroidx/compose/foundation/layout/PaddingValues;
    .local v17, "reverseLayout":Z
    .local v18, "horizontalArrangement":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .local v19, "verticalArrangement":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .local v20, "flingBehavior":Landroidx/compose/foundation/gestures/FlingBehavior;
    .local v21, "userScrollEnabled":Z
    :goto_1e
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endDefaults()V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v4

    if-eqz v4, :cond_2d

    .line 200
    const/4 v4, -0x1

    const-string v5, "androidx.compose.foundation.lazy.grid.LazyHorizontalGrid (LazyGridDsl.kt:199)"

    invoke-static {v3, v2, v4, v5}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 202
    :cond_2d
    nop

    .line 203
    nop

    .line 204
    nop

    .line 205
    nop

    .line 206
    nop

    .line 207
    nop

    .line 208
    nop

    .line 209
    nop

    .line 210
    nop

    .line 211
    invoke-static {v1, v0}, Landroidx/compose/foundation/OverscrollKt;->rememberOverscrollEffect(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/OverscrollEffect;

    move-result-object v22

    .line 212
    and-int/lit8 v0, v2, 0xe

    and-int/lit8 v3, v2, 0x70

    or-int/2addr v0, v3

    and-int/lit16 v3, v2, 0x380

    or-int/2addr v0, v3

    and-int/lit16 v3, v2, 0x1c00

    or-int/2addr v0, v3

    const v3, 0xe000

    and-int/2addr v3, v2

    or-int/2addr v0, v3

    const/high16 v3, 0x70000

    and-int/2addr v3, v2

    or-int/2addr v0, v3

    const/high16 v3, 0x380000

    and-int/2addr v3, v2

    or-int/2addr v0, v3

    const/high16 v3, 0x1c00000

    and-int/2addr v3, v2

    or-int/2addr v0, v3

    const/high16 v3, 0xe000000

    and-int/2addr v3, v2

    or-int v25, v0, v3

    shr-int/lit8 v0, v2, 0x1b

    and-int/lit8 v26, v0, 0xe

    .line 201
    const/16 v27, 0x0

    move-object/from16 v23, p9

    move-object/from16 v24, v1

    .end local v1    # "$composer":Landroidx/compose/runtime/Composer;
    .local v24, "$composer":Landroidx/compose/runtime/Composer;
    invoke-static/range {v13 .. v27}, Landroidx/compose/foundation/lazy/grid/LazyGridDslKt;->LazyHorizontalGrid(Landroidx/compose/foundation/lazy/grid/GridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/gestures/FlingBehavior;ZLandroidx/compose/foundation/OverscrollEffect;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_2e

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 214
    :cond_2e
    move v13, v2

    move-object v2, v14

    move-object v3, v15

    move-object/from16 v4, v16

    move/from16 v5, v17

    move-object/from16 v6, v18

    move-object/from16 v7, v19

    move-object/from16 v8, v20

    move/from16 v9, v21

    goto :goto_1f

    .end local v14    # "modifier":Landroidx/compose/ui/Modifier;
    .end local v15    # "state":Landroidx/compose/foundation/lazy/grid/LazyGridState;
    .end local v16    # "contentPadding":Landroidx/compose/foundation/layout/PaddingValues;
    .end local v17    # "reverseLayout":Z
    .end local v18    # "horizontalArrangement":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .end local v19    # "verticalArrangement":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .end local v20    # "flingBehavior":Landroidx/compose/foundation/gestures/FlingBehavior;
    .end local v21    # "userScrollEnabled":Z
    .end local v24    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v1    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local p1    # "modifier":Landroidx/compose/ui/Modifier;
    .restart local p2    # "state":Landroidx/compose/foundation/lazy/grid/LazyGridState;
    .restart local p3    # "contentPadding":Landroidx/compose/foundation/layout/PaddingValues;
    .restart local p4    # "reverseLayout":Z
    .restart local p5    # "horizontalArrangement":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .restart local p6    # "verticalArrangement":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .restart local p7    # "flingBehavior":Landroidx/compose/foundation/gestures/FlingBehavior;
    .restart local p8    # "userScrollEnabled":Z
    :cond_2f
    move-object/from16 v24, v1

    .end local v1    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v24    # "$composer":Landroidx/compose/runtime/Composer;
    invoke-interface/range {v24 .. v24}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object/from16 v8, p7

    move v13, v2

    move-object v3, v5

    move-object v4, v7

    move v5, v9

    move-object v6, v10

    move-object v7, v15

    move-object/from16 v2, p1

    move/from16 v9, p8

    .end local p1    # "modifier":Landroidx/compose/ui/Modifier;
    .end local p2    # "state":Landroidx/compose/foundation/lazy/grid/LazyGridState;
    .end local p3    # "contentPadding":Landroidx/compose/foundation/layout/PaddingValues;
    .end local p4    # "reverseLayout":Z
    .end local p5    # "horizontalArrangement":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .end local p6    # "verticalArrangement":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .end local p7    # "flingBehavior":Landroidx/compose/foundation/gestures/FlingBehavior;
    .end local p8    # "userScrollEnabled":Z
    .local v2, "modifier":Landroidx/compose/ui/Modifier;
    .restart local v3    # "state":Landroidx/compose/foundation/lazy/grid/LazyGridState;
    .restart local v4    # "contentPadding":Landroidx/compose/foundation/layout/PaddingValues;
    .restart local v5    # "reverseLayout":Z
    .restart local v6    # "horizontalArrangement":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .restart local v7    # "verticalArrangement":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .restart local v8    # "flingBehavior":Landroidx/compose/foundation/gestures/FlingBehavior;
    .restart local v9    # "userScrollEnabled":Z
    .local v13, "$dirty":I
    :goto_1f
    invoke-interface/range {v24 .. v24}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v14

    if-eqz v14, :cond_30

    new-instance v0, Landroidx/compose/foundation/lazy/grid/LazyGridDslKt$LazyHorizontalGrid$2;

    move-object/from16 v1, p0

    move-object/from16 v10, p9

    invoke-direct/range {v0 .. v12}, Landroidx/compose/foundation/lazy/grid/LazyGridDslKt$LazyHorizontalGrid$2;-><init>(Landroidx/compose/foundation/lazy/grid/GridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/gestures/FlingBehavior;ZLkotlin/jvm/functions/Function1;II)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    invoke-interface {v14, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_30
    return-void
.end method

.method public static final LazyVerticalGrid(Landroidx/compose/foundation/lazy/grid/GridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;ZLandroidx/compose/foundation/OverscrollEffect;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V
    .locals 31
    .param p0, "columns"    # Landroidx/compose/foundation/lazy/grid/GridCells;
    .param p1, "modifier"    # Landroidx/compose/ui/Modifier;
    .param p2, "state"    # Landroidx/compose/foundation/lazy/grid/LazyGridState;
    .param p3, "contentPadding"    # Landroidx/compose/foundation/layout/PaddingValues;
    .param p4, "reverseLayout"    # Z
    .param p5, "verticalArrangement"    # Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .param p6, "horizontalArrangement"    # Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .param p7, "flingBehavior"    # Landroidx/compose/foundation/gestures/FlingBehavior;
    .param p8, "userScrollEnabled"    # Z
    .param p9, "overscrollEffect"    # Landroidx/compose/foundation/OverscrollEffect;
    .param p10, "content"    # Lkotlin/jvm/functions/Function1;
    .param p11, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p12, "$changed"    # I
    .param p13, "$changed1"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/lazy/grid/GridCells;",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/foundation/lazy/grid/LazyGridState;",
            "Landroidx/compose/foundation/layout/PaddingValues;",
            "Z",
            "Landroidx/compose/foundation/layout/Arrangement$Vertical;",
            "Landroidx/compose/foundation/layout/Arrangement$Horizontal;",
            "Landroidx/compose/foundation/gestures/FlingBehavior;",
            "Z",
            "Landroidx/compose/foundation/OverscrollEffect;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/foundation/lazy/grid/LazyGridScope;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "III)V"
        }
    .end annotation

    .line 80
    move-object/from16 v1, p0

    move/from16 v12, p12

    move/from16 v14, p14

    const v0, -0x7b81c7d6

    move-object/from16 v2, p11

    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v2

    .end local p11    # "$composer":Landroidx/compose/runtime/Composer;
    .local v2, "$composer":Landroidx/compose/runtime/Composer;
    const-string v3, "C(LazyVerticalGrid)P(!1,5,8,2,7,10,4,3,9,6)81@3848L55,80@3822L510:LazyGridDsl.kt#7791vq"

    invoke-static {v2, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    move/from16 v3, p12

    .local v3, "$dirty":I
    move/from16 v4, p13

    .local v4, "$dirty1":I
    and-int/lit8 v5, v14, 0x1

    if-eqz v5, :cond_0

    or-int/lit8 v3, v3, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v5, v12, 0x6

    if-nez v5, :cond_2

    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    const/4 v5, 0x4

    goto :goto_0

    :cond_1
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v3, v5

    :cond_2
    :goto_1
    and-int/lit8 v5, v14, 0x2

    if-eqz v5, :cond_3

    or-int/lit8 v3, v3, 0x30

    move-object/from16 v8, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v8, v12, 0x30

    if-nez v8, :cond_5

    move-object/from16 v8, p1

    invoke-interface {v2, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_4

    const/16 v9, 0x20

    goto :goto_2

    :cond_4
    const/16 v9, 0x10

    :goto_2
    or-int/2addr v3, v9

    goto :goto_3

    :cond_5
    move-object/from16 v8, p1

    :goto_3
    and-int/lit16 v9, v12, 0x180

    if-nez v9, :cond_8

    and-int/lit8 v9, v14, 0x4

    if-nez v9, :cond_6

    move-object/from16 v9, p2

    invoke-interface {v2, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_7

    const/16 v10, 0x100

    goto :goto_4

    :cond_6
    move-object/from16 v9, p2

    :cond_7
    const/16 v10, 0x80

    :goto_4
    or-int/2addr v3, v10

    goto :goto_5

    :cond_8
    move-object/from16 v9, p2

    :goto_5
    and-int/lit8 v10, v14, 0x8

    if-eqz v10, :cond_9

    or-int/lit16 v3, v3, 0xc00

    move-object/from16 v11, p3

    goto :goto_7

    :cond_9
    and-int/lit16 v11, v12, 0xc00

    if-nez v11, :cond_b

    move-object/from16 v11, p3

    invoke-interface {v2, v11}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_a

    const/16 v13, 0x800

    goto :goto_6

    :cond_a
    const/16 v13, 0x400

    :goto_6
    or-int/2addr v3, v13

    goto :goto_7

    :cond_b
    move-object/from16 v11, p3

    :goto_7
    and-int/lit8 v13, v14, 0x10

    if-eqz v13, :cond_c

    or-int/lit16 v3, v3, 0x6000

    move/from16 v15, p4

    goto :goto_9

    :cond_c
    and-int/lit16 v15, v12, 0x6000

    if-nez v15, :cond_e

    move/from16 v15, p4

    invoke-interface {v2, v15}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v16

    if-eqz v16, :cond_d

    const/16 v16, 0x4000

    goto :goto_8

    :cond_d
    const/16 v16, 0x2000

    :goto_8
    or-int v3, v3, v16

    goto :goto_9

    :cond_e
    move/from16 v15, p4

    :goto_9
    const/high16 v16, 0x30000

    and-int v17, v12, v16

    if-nez v17, :cond_11

    and-int/lit8 v17, v14, 0x20

    if-nez v17, :cond_f

    move-object/from16 v7, p5

    invoke-interface {v2, v7}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_10

    const/high16 v17, 0x20000

    goto :goto_a

    :cond_f
    move-object/from16 v7, p5

    :cond_10
    const/high16 v17, 0x10000

    :goto_a
    or-int v3, v3, v17

    goto :goto_b

    :cond_11
    move-object/from16 v7, p5

    :goto_b
    and-int/lit8 v17, v14, 0x40

    const/high16 v18, 0x180000

    if-eqz v17, :cond_12

    or-int v3, v3, v18

    move-object/from16 v0, p6

    goto :goto_d

    :cond_12
    and-int v18, v12, v18

    if-nez v18, :cond_14

    move-object/from16 v0, p6

    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_13

    const/high16 v19, 0x100000

    goto :goto_c

    :cond_13
    const/high16 v19, 0x80000

    :goto_c
    or-int v3, v3, v19

    goto :goto_d

    :cond_14
    move-object/from16 v0, p6

    :goto_d
    const/high16 v19, 0xc00000

    and-int v19, v12, v19

    if-nez v19, :cond_17

    and-int/lit16 v6, v14, 0x80

    if-nez v6, :cond_15

    move-object/from16 v6, p7

    invoke-interface {v2, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_16

    const/high16 v20, 0x800000

    goto :goto_e

    :cond_15
    move-object/from16 v6, p7

    :cond_16
    const/high16 v20, 0x400000

    :goto_e
    or-int v3, v3, v20

    goto :goto_f

    :cond_17
    move-object/from16 v6, p7

    :goto_f
    and-int/lit16 v0, v14, 0x100

    const/high16 v20, 0x6000000

    if-eqz v0, :cond_18

    or-int v3, v3, v20

    move/from16 v20, v0

    move/from16 v0, p8

    goto :goto_11

    :cond_18
    and-int v20, v12, v20

    if-nez v20, :cond_1a

    move/from16 v20, v0

    move/from16 v0, p8

    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v21

    if-eqz v21, :cond_19

    const/high16 v21, 0x4000000

    goto :goto_10

    :cond_19
    const/high16 v21, 0x2000000

    :goto_10
    or-int v3, v3, v21

    goto :goto_11

    :cond_1a
    move/from16 v20, v0

    move/from16 v0, p8

    :goto_11
    const/high16 v21, 0x30000000

    and-int v21, v12, v21

    if-nez v21, :cond_1d

    and-int/lit16 v0, v14, 0x200

    if-nez v0, :cond_1b

    move-object/from16 v0, p9

    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_1c

    const/high16 v21, 0x20000000

    goto :goto_12

    :cond_1b
    move-object/from16 v0, p9

    :cond_1c
    const/high16 v21, 0x10000000

    :goto_12
    or-int v3, v3, v21

    goto :goto_13

    :cond_1d
    move-object/from16 v0, p9

    :goto_13
    and-int/lit16 v0, v14, 0x400

    if-eqz v0, :cond_1e

    or-int/lit8 v4, v4, 0x6

    move-object/from16 v0, p10

    goto :goto_15

    :cond_1e
    and-int/lit8 v0, p13, 0x6

    if-nez v0, :cond_20

    move-object/from16 v0, p10

    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_1f

    const/16 v21, 0x4

    goto :goto_14

    :cond_1f
    const/16 v21, 0x2

    :goto_14
    or-int v4, v4, v21

    goto :goto_15

    :cond_20
    move-object/from16 v0, p10

    :goto_15
    const v21, 0x12492493

    and-int v0, v3, v21

    move/from16 p11, v5

    const v5, 0x12492492

    const/4 v6, 0x0

    if-ne v0, v5, :cond_22

    and-int/lit8 v0, v4, 0x3

    const/4 v5, 0x2

    if-eq v0, v5, :cond_21

    goto :goto_16

    :cond_21
    move v0, v6

    goto :goto_17

    :cond_22
    :goto_16
    const/4 v0, 0x1

    :goto_17
    and-int/lit8 v5, v3, 0x1

    invoke-interface {v2, v0, v5}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v0

    if-eqz v0, :cond_35

    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->startDefaults()V

    const-string v0, "69@3290L23,75@3650L15,77@3748L26"

    invoke-static {v2, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 v0, v12, 0x1

    if-eqz v0, :cond_28

    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    move-result v0

    if-eqz v0, :cond_23

    goto :goto_18

    .line 78
    :cond_23
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    and-int/lit8 v0, v14, 0x4

    if-eqz v0, :cond_24

    and-int/lit16 v3, v3, -0x381

    :cond_24
    and-int/lit8 v0, v14, 0x20

    if-eqz v0, :cond_25

    const v0, -0x70001

    and-int/2addr v3, v0

    :cond_25
    and-int/lit16 v0, v14, 0x80

    if-eqz v0, :cond_26

    const v0, -0x1c00001

    and-int/2addr v3, v0

    :cond_26
    and-int/lit16 v0, v14, 0x200

    if-eqz v0, :cond_27

    const v0, -0x70000001

    and-int/2addr v0, v3

    move-object/from16 v21, p7

    move/from16 v22, p8

    move-object/from16 v23, p9

    move v3, v0

    move-object/from16 v24, v7

    move-object/from16 v18, v11

    move/from16 v19, v15

    move/from16 v5, v16

    const v6, -0x7b81c7d6

    move-object/from16 v0, p6

    move-object v15, v8

    move-object/from16 v16, v9

    .end local v3    # "$dirty":I
    .local v0, "$dirty":I
    goto/16 :goto_1d

    .end local v0    # "$dirty":I
    .restart local v3    # "$dirty":I
    :cond_27
    move-object/from16 v0, p6

    move-object/from16 v21, p7

    move/from16 v22, p8

    move-object/from16 v23, p9

    move-object/from16 v24, v7

    move-object/from16 v18, v11

    move/from16 v19, v15

    move/from16 v5, v16

    const v6, -0x7b81c7d6

    move-object v15, v8

    move-object/from16 v16, v9

    goto/16 :goto_1d

    .line 80
    :cond_28
    :goto_18
    if-eqz p11, :cond_29

    .line 69
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v0, Landroidx/compose/ui/Modifier;

    move-object v8, v0

    .end local p1    # "modifier":Landroidx/compose/ui/Modifier;
    .local v8, "modifier":Landroidx/compose/ui/Modifier;
    :cond_29
    and-int/lit8 v0, v14, 0x4

    if-eqz v0, :cond_2a

    .line 70
    const/4 v0, 0x3

    invoke-static {v6, v6, v2, v6, v0}, Landroidx/compose/foundation/lazy/grid/LazyGridStateKt;->rememberLazyGridState(IILandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/lazy/grid/LazyGridState;

    move-result-object v0

    .end local p2    # "state":Landroidx/compose/foundation/lazy/grid/LazyGridState;
    .local v0, "state":Landroidx/compose/foundation/lazy/grid/LazyGridState;
    and-int/lit16 v3, v3, -0x381

    move-object v9, v0

    .end local v0    # "state":Landroidx/compose/foundation/lazy/grid/LazyGridState;
    .local v9, "state":Landroidx/compose/foundation/lazy/grid/LazyGridState;
    :cond_2a
    if-eqz v10, :cond_2b

    .line 71
    const/4 v0, 0x0

    .local v0, "$this$dp$iv":I
    const/4 v5, 0x0

    .line 657
    .local v5, "$i$f$getDp":I
    int-to-float v10, v0

    invoke-static {v10}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    .line 71
    .end local v0    # "$this$dp$iv":I
    .end local v5    # "$i$f$getDp":I
    invoke-static {v0}, Landroidx/compose/foundation/layout/PaddingKt;->PaddingValues-0680j_4(F)Landroidx/compose/foundation/layout/PaddingValues;

    move-result-object v0

    move-object v11, v0

    .end local p3    # "contentPadding":Landroidx/compose/foundation/layout/PaddingValues;
    .local v11, "contentPadding":Landroidx/compose/foundation/layout/PaddingValues;
    :cond_2b
    if-eqz v13, :cond_2c

    .line 72
    const/4 v0, 0x0

    move v15, v0

    .end local p4    # "reverseLayout":Z
    .local v15, "reverseLayout":Z
    :cond_2c
    and-int/lit8 v0, v14, 0x20

    if-eqz v0, :cond_2e

    .line 74
    sget-object v0, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    if-nez v15, :cond_2d

    invoke-virtual {v0}, Landroidx/compose/foundation/layout/Arrangement;->getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    move-result-object v0

    goto :goto_19

    :cond_2d
    invoke-virtual {v0}, Landroidx/compose/foundation/layout/Arrangement;->getBottom()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    move-result-object v0

    .end local p5    # "verticalArrangement":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .local v0, "verticalArrangement":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    :goto_19
    const v5, -0x70001

    and-int/2addr v3, v5

    move-object v7, v0

    .end local v0    # "verticalArrangement":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .local v7, "verticalArrangement":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    :cond_2e
    if-eqz v17, :cond_2f

    .line 75
    sget-object v0, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    invoke-virtual {v0}, Landroidx/compose/foundation/layout/Arrangement;->getStart()Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    move-result-object v0

    .end local p6    # "horizontalArrangement":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .local v0, "horizontalArrangement":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    goto :goto_1a

    .line 74
    .end local v0    # "horizontalArrangement":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .restart local p6    # "horizontalArrangement":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    :cond_2f
    move-object/from16 v0, p6

    .line 75
    .end local p6    # "horizontalArrangement":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .restart local v0    # "horizontalArrangement":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    :goto_1a
    and-int/lit16 v5, v14, 0x80

    if-eqz v5, :cond_30

    .line 76
    sget-object v5, Landroidx/compose/foundation/gestures/ScrollableDefaults;->INSTANCE:Landroidx/compose/foundation/gestures/ScrollableDefaults;

    const/4 v10, 0x6

    invoke-virtual {v5, v2, v10}, Landroidx/compose/foundation/gestures/ScrollableDefaults;->flingBehavior(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/gestures/FlingBehavior;

    move-result-object v5

    .end local p7    # "flingBehavior":Landroidx/compose/foundation/gestures/FlingBehavior;
    .local v5, "flingBehavior":Landroidx/compose/foundation/gestures/FlingBehavior;
    const v10, -0x1c00001

    and-int/2addr v3, v10

    goto :goto_1b

    .line 75
    .end local v5    # "flingBehavior":Landroidx/compose/foundation/gestures/FlingBehavior;
    .restart local p7    # "flingBehavior":Landroidx/compose/foundation/gestures/FlingBehavior;
    :cond_30
    move-object/from16 v5, p7

    .line 76
    .end local p7    # "flingBehavior":Landroidx/compose/foundation/gestures/FlingBehavior;
    .restart local v5    # "flingBehavior":Landroidx/compose/foundation/gestures/FlingBehavior;
    :goto_1b
    if-eqz v20, :cond_31

    .line 77
    const/4 v10, 0x1

    .end local p8    # "userScrollEnabled":Z
    .local v10, "userScrollEnabled":Z
    goto :goto_1c

    .line 76
    .end local v10    # "userScrollEnabled":Z
    .restart local p8    # "userScrollEnabled":Z
    :cond_31
    move/from16 v10, p8

    .line 77
    .end local p8    # "userScrollEnabled":Z
    .restart local v10    # "userScrollEnabled":Z
    :goto_1c
    and-int/lit16 v13, v14, 0x200

    if-eqz v13, :cond_32

    .line 78
    invoke-static {v2, v6}, Landroidx/compose/foundation/OverscrollKt;->rememberOverscrollEffect(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/OverscrollEffect;

    move-result-object v6

    .end local p9    # "overscrollEffect":Landroidx/compose/foundation/OverscrollEffect;
    .local v6, "overscrollEffect":Landroidx/compose/foundation/OverscrollEffect;
    const v13, -0x70000001

    and-int/2addr v3, v13

    move-object/from16 v21, v5

    move-object/from16 v23, v6

    move-object/from16 v24, v7

    move/from16 v22, v10

    move-object/from16 v18, v11

    move/from16 v19, v15

    move/from16 v5, v16

    const v6, -0x7b81c7d6

    move-object v15, v8

    move-object/from16 v16, v9

    goto :goto_1d

    .line 77
    .end local v6    # "overscrollEffect":Landroidx/compose/foundation/OverscrollEffect;
    .restart local p9    # "overscrollEffect":Landroidx/compose/foundation/OverscrollEffect;
    :cond_32
    move-object/from16 v23, p9

    move-object/from16 v21, v5

    move-object/from16 v24, v7

    move/from16 v22, v10

    move-object/from16 v18, v11

    move/from16 v19, v15

    move/from16 v5, v16

    const v6, -0x7b81c7d6

    move-object v15, v8

    move-object/from16 v16, v9

    .line 78
    .end local v5    # "flingBehavior":Landroidx/compose/foundation/gestures/FlingBehavior;
    .end local v7    # "verticalArrangement":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .end local v8    # "modifier":Landroidx/compose/ui/Modifier;
    .end local v9    # "state":Landroidx/compose/foundation/lazy/grid/LazyGridState;
    .end local v10    # "userScrollEnabled":Z
    .end local v11    # "contentPadding":Landroidx/compose/foundation/layout/PaddingValues;
    .end local p9    # "overscrollEffect":Landroidx/compose/foundation/OverscrollEffect;
    .local v15, "modifier":Landroidx/compose/ui/Modifier;
    .local v16, "state":Landroidx/compose/foundation/lazy/grid/LazyGridState;
    .local v18, "contentPadding":Landroidx/compose/foundation/layout/PaddingValues;
    .local v19, "reverseLayout":Z
    .local v21, "flingBehavior":Landroidx/compose/foundation/gestures/FlingBehavior;
    .local v22, "userScrollEnabled":Z
    .local v23, "overscrollEffect":Landroidx/compose/foundation/OverscrollEffect;
    .local v24, "verticalArrangement":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    :goto_1d
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endDefaults()V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v7

    if-eqz v7, :cond_33

    .line 80
    const-string v7, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:79)"

    invoke-static {v6, v3, v4, v7}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 82
    :cond_33
    and-int/lit8 v6, v3, 0xe

    shr-int/lit8 v7, v3, 0xf

    and-int/lit8 v7, v7, 0x70

    or-int/2addr v6, v7

    invoke-static {v1, v0, v2, v6}, Landroidx/compose/foundation/lazy/grid/LazyGridDslKt;->rememberColumnWidthSums(Landroidx/compose/foundation/lazy/grid/GridCells;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/lazy/grid/LazyGridSlotsProvider;

    move-result-object v17

    .line 83
    nop

    .line 84
    nop

    .line 82
    nop

    .line 85
    nop

    .line 86
    nop

    .line 87
    nop

    .line 90
    nop

    .line 91
    nop

    .line 92
    nop

    .line 89
    nop

    .line 88
    nop

    .line 93
    shr-int/lit8 v6, v3, 0x3

    and-int/lit8 v6, v6, 0xe

    or-int/2addr v5, v6

    shr-int/lit8 v6, v3, 0x3

    and-int/lit8 v6, v6, 0x70

    or-int/2addr v5, v6

    and-int/lit16 v6, v3, 0x1c00

    or-int/2addr v5, v6

    const v6, 0xe000

    and-int/2addr v6, v3

    or-int/2addr v5, v6

    shr-int/lit8 v6, v3, 0x3

    const/high16 v7, 0x380000

    and-int/2addr v6, v7

    or-int/2addr v5, v6

    shr-int/lit8 v6, v3, 0x3

    const/high16 v7, 0x1c00000

    and-int/2addr v6, v7

    or-int/2addr v5, v6

    shr-int/lit8 v6, v3, 0x3

    const/high16 v7, 0xe000000

    and-int/2addr v6, v7

    or-int/2addr v5, v6

    shl-int/lit8 v6, v3, 0xc

    const/high16 v7, 0x70000000

    and-int/2addr v6, v7

    or-int v28, v5, v6

    shr-int/lit8 v5, v3, 0x12

    and-int/lit8 v5, v5, 0xe

    shl-int/lit8 v6, v4, 0x3

    and-int/lit8 v6, v6, 0x70

    or-int v29, v5, v6

    .line 81
    const/16 v20, 0x1

    const/16 v30, 0x0

    move-object/from16 v26, p10

    move-object/from16 v25, v0

    move-object/from16 v27, v2

    .end local v0    # "horizontalArrangement":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .end local v2    # "$composer":Landroidx/compose/runtime/Composer;
    .local v25, "horizontalArrangement":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .local v27, "$composer":Landroidx/compose/runtime/Composer;
    invoke-static/range {v15 .. v30}, Landroidx/compose/foundation/lazy/grid/LazyGridKt;->LazyGrid(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/foundation/lazy/grid/LazyGridSlotsProvider;Landroidx/compose/foundation/layout/PaddingValues;ZZLandroidx/compose/foundation/gestures/FlingBehavior;ZLandroidx/compose/foundation/OverscrollEffect;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_34

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 95
    :cond_34
    move v0, v4

    move-object v2, v15

    move-object/from16 v4, v18

    move/from16 v5, v19

    move-object/from16 v8, v21

    move/from16 v9, v22

    move-object/from16 v10, v23

    move-object/from16 v6, v24

    move-object/from16 v7, v25

    move v15, v3

    move-object/from16 v3, v16

    goto :goto_1e

    .end local v15    # "modifier":Landroidx/compose/ui/Modifier;
    .end local v16    # "state":Landroidx/compose/foundation/lazy/grid/LazyGridState;
    .end local v18    # "contentPadding":Landroidx/compose/foundation/layout/PaddingValues;
    .end local v19    # "reverseLayout":Z
    .end local v21    # "flingBehavior":Landroidx/compose/foundation/gestures/FlingBehavior;
    .end local v22    # "userScrollEnabled":Z
    .end local v23    # "overscrollEffect":Landroidx/compose/foundation/OverscrollEffect;
    .end local v24    # "verticalArrangement":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .end local v25    # "horizontalArrangement":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .end local v27    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v2    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local p1    # "modifier":Landroidx/compose/ui/Modifier;
    .restart local p2    # "state":Landroidx/compose/foundation/lazy/grid/LazyGridState;
    .restart local p3    # "contentPadding":Landroidx/compose/foundation/layout/PaddingValues;
    .restart local p4    # "reverseLayout":Z
    .restart local p5    # "verticalArrangement":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .restart local p6    # "horizontalArrangement":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .restart local p7    # "flingBehavior":Landroidx/compose/foundation/gestures/FlingBehavior;
    .restart local p8    # "userScrollEnabled":Z
    .restart local p9    # "overscrollEffect":Landroidx/compose/foundation/OverscrollEffect;
    :cond_35
    move-object/from16 v27, v2

    .end local v2    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v27    # "$composer":Landroidx/compose/runtime/Composer;
    invoke-interface/range {v27 .. v27}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object/from16 v10, p9

    move v0, v4

    move-object v6, v7

    move-object v2, v8

    move-object v4, v11

    move v5, v15

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move v15, v3

    move-object v3, v9

    move/from16 v9, p8

    .end local p1    # "modifier":Landroidx/compose/ui/Modifier;
    .end local p2    # "state":Landroidx/compose/foundation/lazy/grid/LazyGridState;
    .end local p3    # "contentPadding":Landroidx/compose/foundation/layout/PaddingValues;
    .end local p4    # "reverseLayout":Z
    .end local p5    # "verticalArrangement":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .end local p6    # "horizontalArrangement":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .end local p7    # "flingBehavior":Landroidx/compose/foundation/gestures/FlingBehavior;
    .end local p8    # "userScrollEnabled":Z
    .end local p9    # "overscrollEffect":Landroidx/compose/foundation/OverscrollEffect;
    .local v0, "$dirty1":I
    .local v2, "modifier":Landroidx/compose/ui/Modifier;
    .local v3, "state":Landroidx/compose/foundation/lazy/grid/LazyGridState;
    .local v4, "contentPadding":Landroidx/compose/foundation/layout/PaddingValues;
    .local v5, "reverseLayout":Z
    .local v6, "verticalArrangement":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .local v7, "horizontalArrangement":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .local v8, "flingBehavior":Landroidx/compose/foundation/gestures/FlingBehavior;
    .local v9, "userScrollEnabled":Z
    .local v10, "overscrollEffect":Landroidx/compose/foundation/OverscrollEffect;
    .local v15, "$dirty":I
    :goto_1e
    invoke-interface/range {v27 .. v27}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v11

    if-eqz v11, :cond_36

    move v13, v0

    .end local v0    # "$dirty1":I
    .local v13, "$dirty1":I
    new-instance v0, Landroidx/compose/foundation/lazy/grid/LazyGridDslKt$LazyVerticalGrid$1;

    move/from16 v16, v13

    move/from16 p1, v15

    move/from16 v13, p13

    move-object v15, v11

    move-object/from16 v11, p10

    .end local v13    # "$dirty1":I
    .end local v15    # "$dirty":I
    .local v16, "$dirty1":I
    .local p1, "$dirty":I
    invoke-direct/range {v0 .. v14}, Landroidx/compose/foundation/lazy/grid/LazyGridDslKt$LazyVerticalGrid$1;-><init>(Landroidx/compose/foundation/lazy/grid/GridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;ZLandroidx/compose/foundation/OverscrollEffect;Lkotlin/jvm/functions/Function1;III)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    invoke-interface {v15, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    goto :goto_1f

    .end local v16    # "$dirty1":I
    .end local p1    # "$dirty":I
    .restart local v0    # "$dirty1":I
    .restart local v15    # "$dirty":I
    :cond_36
    move/from16 v16, v0

    move/from16 p1, v15

    .end local v0    # "$dirty1":I
    .end local v15    # "$dirty":I
    .restart local v16    # "$dirty1":I
    .restart local p1    # "$dirty":I
    :goto_1f
    return-void
.end method

.method public static final synthetic LazyVerticalGrid(Landroidx/compose/foundation/lazy/grid/GridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 28
    .param p0, "columns"    # Landroidx/compose/foundation/lazy/grid/GridCells;
    .param p1, "modifier"    # Landroidx/compose/ui/Modifier;
    .param p2, "state"    # Landroidx/compose/foundation/lazy/grid/LazyGridState;
    .param p3, "contentPadding"    # Landroidx/compose/foundation/layout/PaddingValues;
    .param p4, "reverseLayout"    # Z
    .param p5, "verticalArrangement"    # Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .param p6, "horizontalArrangement"    # Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .param p7, "flingBehavior"    # Landroidx/compose/foundation/gestures/FlingBehavior;
    .param p8, "userScrollEnabled"    # Z
    .param p9, "content"    # Lkotlin/jvm/functions/Function1;
    .param p10, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p11, "$changed"    # I
    .annotation runtime Lkotlin/Deprecated;
        level = .enum Lkotlin/DeprecationLevel;->HIDDEN:Lkotlin/DeprecationLevel;
        message = "Use the non deprecated overload"
    .end annotation

    .line 111
    move/from16 v11, p11

    move/from16 v12, p12

    const v0, 0x588990d0

    move-object/from16 v1, p10

    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v1

    .end local p10    # "$composer":Landroidx/compose/runtime/Composer;
    .local v1, "$composer":Landroidx/compose/runtime/Composer;
    const-string v2, "C(LazyVerticalGrid)P(!1,5,7,2,6,9,4,3,8)121@5394L26,111@4998L455:LazyGridDsl.kt#7791vq"

    invoke-static {v1, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    move/from16 v2, p11

    .local v2, "$dirty":I
    and-int/lit8 v3, v12, 0x1

    if-eqz v3, :cond_0

    or-int/lit8 v2, v2, 0x6

    move-object/from16 v13, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v11, 0x6

    if-nez v3, :cond_2

    move-object/from16 v13, p0

    invoke-interface {v1, v13}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_1
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v2, v3

    goto :goto_1

    :cond_2
    move-object/from16 v13, p0

    :goto_1
    and-int/lit8 v3, v12, 0x2

    if-eqz v3, :cond_3

    or-int/lit8 v2, v2, 0x30

    move-object/from16 v4, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v4, v11, 0x30

    if-nez v4, :cond_5

    move-object/from16 v4, p1

    invoke-interface {v1, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x20

    goto :goto_2

    :cond_4
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v2, v5

    goto :goto_3

    :cond_5
    move-object/from16 v4, p1

    :goto_3
    and-int/lit16 v5, v11, 0x180

    if-nez v5, :cond_8

    and-int/lit8 v5, v12, 0x4

    if-nez v5, :cond_6

    move-object/from16 v5, p2

    invoke-interface {v1, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_7

    const/16 v6, 0x100

    goto :goto_4

    :cond_6
    move-object/from16 v5, p2

    :cond_7
    const/16 v6, 0x80

    :goto_4
    or-int/2addr v2, v6

    goto :goto_5

    :cond_8
    move-object/from16 v5, p2

    :goto_5
    and-int/lit8 v6, v12, 0x8

    if-eqz v6, :cond_9

    or-int/lit16 v2, v2, 0xc00

    move-object/from16 v7, p3

    goto :goto_7

    :cond_9
    and-int/lit16 v7, v11, 0xc00

    if-nez v7, :cond_b

    move-object/from16 v7, p3

    invoke-interface {v1, v7}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_a

    const/16 v8, 0x800

    goto :goto_6

    :cond_a
    const/16 v8, 0x400

    :goto_6
    or-int/2addr v2, v8

    goto :goto_7

    :cond_b
    move-object/from16 v7, p3

    :goto_7
    and-int/lit8 v8, v12, 0x10

    if-eqz v8, :cond_c

    or-int/lit16 v2, v2, 0x6000

    move/from16 v9, p4

    goto :goto_9

    :cond_c
    and-int/lit16 v9, v11, 0x6000

    if-nez v9, :cond_e

    move/from16 v9, p4

    invoke-interface {v1, v9}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v10

    if-eqz v10, :cond_d

    const/16 v10, 0x4000

    goto :goto_8

    :cond_d
    const/16 v10, 0x2000

    :goto_8
    or-int/2addr v2, v10

    goto :goto_9

    :cond_e
    move/from16 v9, p4

    :goto_9
    const/high16 v10, 0x30000

    and-int/2addr v10, v11

    if-nez v10, :cond_11

    and-int/lit8 v10, v12, 0x20

    if-nez v10, :cond_f

    move-object/from16 v10, p5

    invoke-interface {v1, v10}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_10

    const/high16 v14, 0x20000

    goto :goto_a

    :cond_f
    move-object/from16 v10, p5

    :cond_10
    const/high16 v14, 0x10000

    :goto_a
    or-int/2addr v2, v14

    goto :goto_b

    :cond_11
    move-object/from16 v10, p5

    :goto_b
    and-int/lit8 v14, v12, 0x40

    const/high16 v15, 0x180000

    if-eqz v14, :cond_12

    or-int/2addr v2, v15

    move-object/from16 v15, p6

    goto :goto_d

    :cond_12
    and-int/2addr v15, v11

    if-nez v15, :cond_14

    move-object/from16 v15, p6

    invoke-interface {v1, v15}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_13

    const/high16 v16, 0x100000

    goto :goto_c

    :cond_13
    const/high16 v16, 0x80000

    :goto_c
    or-int v2, v2, v16

    goto :goto_d

    :cond_14
    move-object/from16 v15, p6

    :goto_d
    const/high16 v16, 0xc00000

    and-int v16, v11, v16

    if-nez v16, :cond_17

    and-int/lit16 v0, v12, 0x80

    if-nez v0, :cond_15

    move-object/from16 v0, p7

    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_16

    const/high16 v17, 0x800000

    goto :goto_e

    :cond_15
    move-object/from16 v0, p7

    :cond_16
    const/high16 v17, 0x400000

    :goto_e
    or-int v2, v2, v17

    goto :goto_f

    :cond_17
    move-object/from16 v0, p7

    :goto_f
    and-int/lit16 v0, v12, 0x100

    const/high16 v17, 0x6000000

    if-eqz v0, :cond_18

    or-int v2, v2, v17

    move/from16 v17, v0

    move/from16 v0, p8

    goto :goto_11

    :cond_18
    and-int v17, v11, v17

    if-nez v17, :cond_1a

    move/from16 v17, v0

    move/from16 v0, p8

    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v18

    if-eqz v18, :cond_19

    const/high16 v18, 0x4000000

    goto :goto_10

    :cond_19
    const/high16 v18, 0x2000000

    :goto_10
    or-int v2, v2, v18

    goto :goto_11

    :cond_1a
    move/from16 v17, v0

    move/from16 v0, p8

    :goto_11
    and-int/lit16 v0, v12, 0x200

    const/high16 v18, 0x30000000

    if-eqz v0, :cond_1b

    or-int v2, v2, v18

    move-object/from16 v0, p9

    goto :goto_13

    :cond_1b
    and-int v0, v11, v18

    if-nez v0, :cond_1d

    move-object/from16 v0, p9

    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_1c

    const/high16 v18, 0x20000000

    goto :goto_12

    :cond_1c
    const/high16 v18, 0x10000000

    :goto_12
    or-int v2, v2, v18

    goto :goto_13

    :cond_1d
    move-object/from16 v0, p9

    :goto_13
    const v18, 0x12492493

    and-int v0, v2, v18

    move/from16 p10, v3

    const v3, 0x12492492

    const/4 v4, 0x0

    if-eq v0, v3, :cond_1e

    const/4 v0, 0x1

    goto :goto_14

    :cond_1e
    move v0, v4

    :goto_14
    and-int/lit8 v3, v2, 0x1

    invoke-interface {v1, v0, v3}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v0

    if-eqz v0, :cond_2f

    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->startDefaults()V

    const-string v0, "101@4536L23,107@4896L15"

    invoke-static {v1, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 v0, v11, 0x1

    const v3, -0x1c00001

    const v18, -0x70001

    if-eqz v0, :cond_23

    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    move-result v0

    if-eqz v0, :cond_1f

    goto :goto_15

    .line 109
    :cond_1f
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    and-int/lit8 v0, v12, 0x4

    if-eqz v0, :cond_20

    and-int/lit16 v2, v2, -0x381

    :cond_20
    and-int/lit8 v0, v12, 0x20

    if-eqz v0, :cond_21

    and-int v2, v2, v18

    :cond_21
    and-int/lit16 v0, v12, 0x80

    if-eqz v0, :cond_22

    and-int v0, v2, v3

    move-object/from16 v14, p1

    move-object/from16 v20, p7

    move/from16 v21, p8

    move v2, v0

    move v0, v4

    move-object/from16 v16, v7

    move/from16 v17, v9

    move-object/from16 v18, v10

    move-object/from16 v19, v15

    const v3, 0x588990d0

    move-object v15, v5

    .end local v2    # "$dirty":I
    .local v0, "$dirty":I
    goto/16 :goto_1e

    .end local v0    # "$dirty":I
    .restart local v2    # "$dirty":I
    :cond_22
    move-object/from16 v14, p1

    move-object/from16 v20, p7

    move/from16 v21, p8

    move v0, v4

    move-object/from16 v16, v7

    move/from16 v17, v9

    move-object/from16 v18, v10

    move-object/from16 v19, v15

    const v3, 0x588990d0

    move-object v15, v5

    goto/16 :goto_1e

    .line 111
    :cond_23
    :goto_15
    if-eqz p10, :cond_24

    .line 101
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v0, Landroidx/compose/ui/Modifier;

    .end local p1    # "modifier":Landroidx/compose/ui/Modifier;
    .local v0, "modifier":Landroidx/compose/ui/Modifier;
    goto :goto_16

    .line 111
    .end local v0    # "modifier":Landroidx/compose/ui/Modifier;
    .restart local p1    # "modifier":Landroidx/compose/ui/Modifier;
    :cond_24
    move-object/from16 v0, p1

    .line 101
    .end local p1    # "modifier":Landroidx/compose/ui/Modifier;
    .restart local v0    # "modifier":Landroidx/compose/ui/Modifier;
    :goto_16
    and-int/lit8 v19, v12, 0x4

    if-eqz v19, :cond_25

    .line 102
    move/from16 p10, v3

    const/4 v3, 0x3

    invoke-static {v4, v4, v1, v4, v3}, Landroidx/compose/foundation/lazy/grid/LazyGridStateKt;->rememberLazyGridState(IILandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/lazy/grid/LazyGridState;

    move-result-object v3

    .end local p2    # "state":Landroidx/compose/foundation/lazy/grid/LazyGridState;
    .local v3, "state":Landroidx/compose/foundation/lazy/grid/LazyGridState;
    and-int/lit16 v2, v2, -0x381

    goto :goto_17

    .line 101
    .end local v3    # "state":Landroidx/compose/foundation/lazy/grid/LazyGridState;
    .restart local p2    # "state":Landroidx/compose/foundation/lazy/grid/LazyGridState;
    :cond_25
    move/from16 p10, v3

    move-object v3, v5

    .line 102
    .end local p2    # "state":Landroidx/compose/foundation/lazy/grid/LazyGridState;
    .restart local v3    # "state":Landroidx/compose/foundation/lazy/grid/LazyGridState;
    :goto_17
    if-eqz v6, :cond_26

    .line 103
    const/4 v5, 0x0

    .local v5, "$this$dp$iv":I
    const/4 v6, 0x0

    .line 658
    .local v6, "$i$f$getDp":I
    int-to-float v4, v5

    invoke-static {v4}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v4

    .line 103
    .end local v5    # "$this$dp$iv":I
    .end local v6    # "$i$f$getDp":I
    invoke-static {v4}, Landroidx/compose/foundation/layout/PaddingKt;->PaddingValues-0680j_4(F)Landroidx/compose/foundation/layout/PaddingValues;

    move-result-object v4

    .end local p3    # "contentPadding":Landroidx/compose/foundation/layout/PaddingValues;
    .local v4, "contentPadding":Landroidx/compose/foundation/layout/PaddingValues;
    goto :goto_18

    .line 102
    .end local v4    # "contentPadding":Landroidx/compose/foundation/layout/PaddingValues;
    .restart local p3    # "contentPadding":Landroidx/compose/foundation/layout/PaddingValues;
    :cond_26
    move-object v4, v7

    .line 103
    .end local p3    # "contentPadding":Landroidx/compose/foundation/layout/PaddingValues;
    .restart local v4    # "contentPadding":Landroidx/compose/foundation/layout/PaddingValues;
    :goto_18
    if-eqz v8, :cond_27

    .line 104
    const/4 v5, 0x0

    .end local p4    # "reverseLayout":Z
    .local v5, "reverseLayout":Z
    goto :goto_19

    .line 103
    .end local v5    # "reverseLayout":Z
    .restart local p4    # "reverseLayout":Z
    :cond_27
    move v5, v9

    .line 104
    .end local p4    # "reverseLayout":Z
    .restart local v5    # "reverseLayout":Z
    :goto_19
    and-int/lit8 v6, v12, 0x20

    if-eqz v6, :cond_29

    .line 106
    sget-object v6, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    if-nez v5, :cond_28

    invoke-virtual {v6}, Landroidx/compose/foundation/layout/Arrangement;->getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    move-result-object v6

    goto :goto_1a

    :cond_28
    invoke-virtual {v6}, Landroidx/compose/foundation/layout/Arrangement;->getBottom()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    move-result-object v6

    .end local p5    # "verticalArrangement":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .local v6, "verticalArrangement":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    :goto_1a
    and-int v2, v2, v18

    goto :goto_1b

    .line 104
    .end local v6    # "verticalArrangement":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .restart local p5    # "verticalArrangement":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    :cond_29
    move-object v6, v10

    .line 106
    .end local p5    # "verticalArrangement":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .restart local v6    # "verticalArrangement":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    :goto_1b
    if-eqz v14, :cond_2a

    .line 107
    sget-object v7, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    invoke-virtual {v7}, Landroidx/compose/foundation/layout/Arrangement;->getStart()Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    move-result-object v7

    .end local p6    # "horizontalArrangement":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .local v7, "horizontalArrangement":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    goto :goto_1c

    .line 106
    .end local v7    # "horizontalArrangement":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .restart local p6    # "horizontalArrangement":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    :cond_2a
    move-object v7, v15

    .line 107
    .end local p6    # "horizontalArrangement":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .restart local v7    # "horizontalArrangement":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    :goto_1c
    and-int/lit16 v8, v12, 0x80

    if-eqz v8, :cond_2b

    .line 108
    sget-object v8, Landroidx/compose/foundation/gestures/ScrollableDefaults;->INSTANCE:Landroidx/compose/foundation/gestures/ScrollableDefaults;

    const/4 v9, 0x6

    invoke-virtual {v8, v1, v9}, Landroidx/compose/foundation/gestures/ScrollableDefaults;->flingBehavior(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/gestures/FlingBehavior;

    move-result-object v8

    .end local p7    # "flingBehavior":Landroidx/compose/foundation/gestures/FlingBehavior;
    .local v8, "flingBehavior":Landroidx/compose/foundation/gestures/FlingBehavior;
    and-int v2, v2, p10

    goto :goto_1d

    .line 107
    .end local v8    # "flingBehavior":Landroidx/compose/foundation/gestures/FlingBehavior;
    .restart local p7    # "flingBehavior":Landroidx/compose/foundation/gestures/FlingBehavior;
    :cond_2b
    move-object/from16 v8, p7

    .line 108
    .end local p7    # "flingBehavior":Landroidx/compose/foundation/gestures/FlingBehavior;
    .restart local v8    # "flingBehavior":Landroidx/compose/foundation/gestures/FlingBehavior;
    :goto_1d
    if-eqz v17, :cond_2c

    .line 109
    const/4 v9, 0x1

    move-object v14, v0

    move-object v15, v3

    move-object/from16 v16, v4

    move/from16 v17, v5

    move-object/from16 v18, v6

    move-object/from16 v19, v7

    move-object/from16 v20, v8

    move/from16 v21, v9

    const/4 v0, 0x0

    const v3, 0x588990d0

    .end local p8    # "userScrollEnabled":Z
    .local v9, "userScrollEnabled":Z
    goto :goto_1e

    .line 108
    .end local v9    # "userScrollEnabled":Z
    .restart local p8    # "userScrollEnabled":Z
    :cond_2c
    move/from16 v21, p8

    move-object v14, v0

    move-object v15, v3

    move-object/from16 v16, v4

    move/from16 v17, v5

    move-object/from16 v18, v6

    move-object/from16 v19, v7

    move-object/from16 v20, v8

    const/4 v0, 0x0

    const v3, 0x588990d0

    .line 109
    .end local v0    # "modifier":Landroidx/compose/ui/Modifier;
    .end local v3    # "state":Landroidx/compose/foundation/lazy/grid/LazyGridState;
    .end local v4    # "contentPadding":Landroidx/compose/foundation/layout/PaddingValues;
    .end local v5    # "reverseLayout":Z
    .end local v6    # "verticalArrangement":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .end local v7    # "horizontalArrangement":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .end local v8    # "flingBehavior":Landroidx/compose/foundation/gestures/FlingBehavior;
    .end local p8    # "userScrollEnabled":Z
    .local v14, "modifier":Landroidx/compose/ui/Modifier;
    .local v15, "state":Landroidx/compose/foundation/lazy/grid/LazyGridState;
    .local v16, "contentPadding":Landroidx/compose/foundation/layout/PaddingValues;
    .local v17, "reverseLayout":Z
    .local v18, "verticalArrangement":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .local v19, "horizontalArrangement":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .local v20, "flingBehavior":Landroidx/compose/foundation/gestures/FlingBehavior;
    .local v21, "userScrollEnabled":Z
    :goto_1e
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endDefaults()V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v4

    if-eqz v4, :cond_2d

    .line 111
    const/4 v4, -0x1

    const-string v5, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:110)"

    invoke-static {v3, v2, v4, v5}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 113
    :cond_2d
    nop

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

    .line 121
    nop

    .line 122
    invoke-static {v1, v0}, Landroidx/compose/foundation/OverscrollKt;->rememberOverscrollEffect(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/OverscrollEffect;

    move-result-object v22

    .line 123
    and-int/lit8 v0, v2, 0xe

    and-int/lit8 v3, v2, 0x70

    or-int/2addr v0, v3

    and-int/lit16 v3, v2, 0x380

    or-int/2addr v0, v3

    and-int/lit16 v3, v2, 0x1c00

    or-int/2addr v0, v3

    const v3, 0xe000

    and-int/2addr v3, v2

    or-int/2addr v0, v3

    const/high16 v3, 0x70000

    and-int/2addr v3, v2

    or-int/2addr v0, v3

    const/high16 v3, 0x380000

    and-int/2addr v3, v2

    or-int/2addr v0, v3

    const/high16 v3, 0x1c00000

    and-int/2addr v3, v2

    or-int/2addr v0, v3

    const/high16 v3, 0xe000000

    and-int/2addr v3, v2

    or-int v25, v0, v3

    shr-int/lit8 v0, v2, 0x1b

    and-int/lit8 v26, v0, 0xe

    .line 112
    const/16 v27, 0x0

    move-object/from16 v23, p9

    move-object/from16 v24, v1

    .end local v1    # "$composer":Landroidx/compose/runtime/Composer;
    .local v24, "$composer":Landroidx/compose/runtime/Composer;
    invoke-static/range {v13 .. v27}, Landroidx/compose/foundation/lazy/grid/LazyGridDslKt;->LazyVerticalGrid(Landroidx/compose/foundation/lazy/grid/GridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;ZLandroidx/compose/foundation/OverscrollEffect;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_2e

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 125
    :cond_2e
    move v13, v2

    move-object v2, v14

    move-object v3, v15

    move-object/from16 v4, v16

    move/from16 v5, v17

    move-object/from16 v6, v18

    move-object/from16 v7, v19

    move-object/from16 v8, v20

    move/from16 v9, v21

    goto :goto_1f

    .end local v14    # "modifier":Landroidx/compose/ui/Modifier;
    .end local v15    # "state":Landroidx/compose/foundation/lazy/grid/LazyGridState;
    .end local v16    # "contentPadding":Landroidx/compose/foundation/layout/PaddingValues;
    .end local v17    # "reverseLayout":Z
    .end local v18    # "verticalArrangement":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .end local v19    # "horizontalArrangement":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .end local v20    # "flingBehavior":Landroidx/compose/foundation/gestures/FlingBehavior;
    .end local v21    # "userScrollEnabled":Z
    .end local v24    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v1    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local p1    # "modifier":Landroidx/compose/ui/Modifier;
    .restart local p2    # "state":Landroidx/compose/foundation/lazy/grid/LazyGridState;
    .restart local p3    # "contentPadding":Landroidx/compose/foundation/layout/PaddingValues;
    .restart local p4    # "reverseLayout":Z
    .restart local p5    # "verticalArrangement":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .restart local p6    # "horizontalArrangement":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .restart local p7    # "flingBehavior":Landroidx/compose/foundation/gestures/FlingBehavior;
    .restart local p8    # "userScrollEnabled":Z
    :cond_2f
    move-object/from16 v24, v1

    .end local v1    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v24    # "$composer":Landroidx/compose/runtime/Composer;
    invoke-interface/range {v24 .. v24}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object/from16 v8, p7

    move v13, v2

    move-object v3, v5

    move-object v4, v7

    move v5, v9

    move-object v6, v10

    move-object v7, v15

    move-object/from16 v2, p1

    move/from16 v9, p8

    .end local p1    # "modifier":Landroidx/compose/ui/Modifier;
    .end local p2    # "state":Landroidx/compose/foundation/lazy/grid/LazyGridState;
    .end local p3    # "contentPadding":Landroidx/compose/foundation/layout/PaddingValues;
    .end local p4    # "reverseLayout":Z
    .end local p5    # "verticalArrangement":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .end local p6    # "horizontalArrangement":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .end local p7    # "flingBehavior":Landroidx/compose/foundation/gestures/FlingBehavior;
    .end local p8    # "userScrollEnabled":Z
    .local v2, "modifier":Landroidx/compose/ui/Modifier;
    .restart local v3    # "state":Landroidx/compose/foundation/lazy/grid/LazyGridState;
    .restart local v4    # "contentPadding":Landroidx/compose/foundation/layout/PaddingValues;
    .restart local v5    # "reverseLayout":Z
    .restart local v6    # "verticalArrangement":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .restart local v7    # "horizontalArrangement":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .restart local v8    # "flingBehavior":Landroidx/compose/foundation/gestures/FlingBehavior;
    .restart local v9    # "userScrollEnabled":Z
    .local v13, "$dirty":I
    :goto_1f
    invoke-interface/range {v24 .. v24}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v14

    if-eqz v14, :cond_30

    new-instance v0, Landroidx/compose/foundation/lazy/grid/LazyGridDslKt$LazyVerticalGrid$2;

    move-object/from16 v1, p0

    move-object/from16 v10, p9

    invoke-direct/range {v0 .. v12}, Landroidx/compose/foundation/lazy/grid/LazyGridDslKt$LazyVerticalGrid$2;-><init>(Landroidx/compose/foundation/lazy/grid/GridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;ZLkotlin/jvm/functions/Function1;II)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    invoke-interface {v14, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_30
    return-void
.end method

.method public static final synthetic access$calculateCellsCrossAxisSizeImpl(III)Ljava/util/List;
    .locals 1
    .param p0, "gridSize"    # I
    .param p1, "slotCount"    # I
    .param p2, "spacing"    # I

    .line 1
    invoke-static {p0, p1, p2}, Landroidx/compose/foundation/lazy/grid/LazyGridDslKt;->calculateCellsCrossAxisSizeImpl(III)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private static final calculateCellsCrossAxisSizeImpl(III)Ljava/util/List;
    .locals 9
    .param p0, "gridSize"    # I
    .param p1, "slotCount"    # I
    .param p2, "spacing"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(III)",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 423
    add-int/lit8 v0, p1, -0x1

    mul-int/2addr v0, p2

    sub-int v0, p0, v0

    .line 424
    .local v0, "gridSizeWithoutSpacing":I
    div-int v1, v0, p1

    .line 425
    .local v1, "slotSize":I
    rem-int v2, v0, p1

    .line 426
    .local v2, "remainingPixels":I
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, p1}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v4, 0x0

    move v5, v4

    :goto_0
    if-ge v5, p1, :cond_1

    .line 673
    move v6, v5

    .local v6, "it":I
    const/4 v7, 0x0

    .line 426
    .local v7, "$i$a$-List-LazyGridDslKt$calculateCellsCrossAxisSizeImpl$1":I
    if-ge v6, v2, :cond_0

    const/4 v8, 0x1

    goto :goto_1

    :cond_0
    move v8, v4

    :goto_1
    add-int/2addr v8, v1

    .end local v6    # "it":I
    .end local v7    # "$i$a$-List-LazyGridDslKt$calculateCellsCrossAxisSizeImpl$1":I
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_1
    check-cast v3, Ljava/util/List;

    return-object v3
.end method

.method public static final items(Landroidx/compose/foundation/lazy/grid/LazyGridScope;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V
    .locals 8
    .param p0, "$this$items"    # Landroidx/compose/foundation/lazy/grid/LazyGridScope;
    .param p1, "items"    # Ljava/util/List;
    .param p2, "key"    # Lkotlin/jvm/functions/Function1;
    .param p3, "span"    # Lkotlin/jvm/functions/Function2;
    .param p4, "contentType"    # Lkotlin/jvm/functions/Function1;
    .param p5, "itemContent"    # Lkotlin/jvm/functions/Function4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/compose/foundation/lazy/grid/LazyGridScope;",
            "Ljava/util/List<",
            "+TT;>;",
            "Lkotlin/jvm/functions/Function1<",
            "-TT;+",
            "Ljava/lang/Object;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;",
            "-TT;",
            "Landroidx/compose/foundation/lazy/grid/GridItemSpan;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-TT;+",
            "Ljava/lang/Object;",
            ">;",
            "Lkotlin/jvm/functions/Function4<",
            "-",
            "Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;",
            "-TT;-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 534
    .local v0, "$i$f$items":I
    nop

    .line 535
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    .line 536
    const/4 v1, 0x0

    if-eqz p2, :cond_0

    .line 534
    new-instance v3, Landroidx/compose/foundation/lazy/grid/LazyGridDslKt$items$2;

    invoke-direct {v3, p2, p1}, Landroidx/compose/foundation/lazy/grid/LazyGridDslKt$items$2;-><init>(Lkotlin/jvm/functions/Function1;Ljava/util/List;)V

    check-cast v3, Lkotlin/jvm/functions/Function1;

    goto :goto_0

    .line 536
    :cond_0
    move-object v3, v1

    .line 538
    :goto_0
    if-eqz p3, :cond_1

    .line 534
    new-instance v1, Landroidx/compose/foundation/lazy/grid/LazyGridDslKt$items$3;

    invoke-direct {v1, p3, p1}, Landroidx/compose/foundation/lazy/grid/LazyGridDslKt$items$3;-><init>(Lkotlin/jvm/functions/Function2;Ljava/util/List;)V

    check-cast v1, Lkotlin/jvm/functions/Function2;

    move-object v4, v1

    goto :goto_1

    .line 540
    :cond_1
    move-object v4, v1

    .line 534
    :goto_1
    new-instance v1, Landroidx/compose/foundation/lazy/grid/LazyGridDslKt$items$4;

    invoke-direct {v1, p4, p1}, Landroidx/compose/foundation/lazy/grid/LazyGridDslKt$items$4;-><init>(Lkotlin/jvm/functions/Function1;Ljava/util/List;)V

    move-object v5, v1

    check-cast v5, Lkotlin/jvm/functions/Function1;

    .line 542
    new-instance v1, Landroidx/compose/foundation/lazy/grid/LazyGridDslKt$items$5;

    invoke-direct {v1, p5, p1}, Landroidx/compose/foundation/lazy/grid/LazyGridDslKt$items$5;-><init>(Lkotlin/jvm/functions/Function4;Ljava/util/List;)V

    const v6, 0x29b3c0fe

    const/4 v7, 0x1

    invoke-static {v6, v7, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Lkotlin/jvm/functions/Function4;

    .line 534
    move-object v1, p0

    .end local p0    # "$this$items":Landroidx/compose/foundation/lazy/grid/LazyGridScope;
    .local v1, "$this$items":Landroidx/compose/foundation/lazy/grid/LazyGridScope;
    invoke-interface/range {v1 .. v6}, Landroidx/compose/foundation/lazy/grid/LazyGridScope;->items(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V

    .line 544
    return-void
.end method

.method public static final items(Landroidx/compose/foundation/lazy/grid/LazyGridScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V
    .locals 8
    .param p0, "$this$items"    # Landroidx/compose/foundation/lazy/grid/LazyGridScope;
    .param p1, "items"    # [Ljava/lang/Object;
    .param p2, "key"    # Lkotlin/jvm/functions/Function1;
    .param p3, "span"    # Lkotlin/jvm/functions/Function2;
    .param p4, "contentType"    # Lkotlin/jvm/functions/Function1;
    .param p5, "itemContent"    # Lkotlin/jvm/functions/Function4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/compose/foundation/lazy/grid/LazyGridScope;",
            "[TT;",
            "Lkotlin/jvm/functions/Function1<",
            "-TT;+",
            "Ljava/lang/Object;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;",
            "-TT;",
            "Landroidx/compose/foundation/lazy/grid/GridItemSpan;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-TT;+",
            "Ljava/lang/Object;",
            ">;",
            "Lkotlin/jvm/functions/Function4<",
            "-",
            "Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;",
            "-TT;-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 608
    .local v0, "$i$f$items":I
    nop

    .line 609
    array-length v2, p1

    .line 610
    const/4 v1, 0x0

    if-eqz p2, :cond_0

    .line 608
    new-instance v3, Landroidx/compose/foundation/lazy/grid/LazyGridDslKt$items$7;

    invoke-direct {v3, p2, p1}, Landroidx/compose/foundation/lazy/grid/LazyGridDslKt$items$7;-><init>(Lkotlin/jvm/functions/Function1;[Ljava/lang/Object;)V

    check-cast v3, Lkotlin/jvm/functions/Function1;

    goto :goto_0

    .line 610
    :cond_0
    move-object v3, v1

    .line 612
    :goto_0
    if-eqz p3, :cond_1

    .line 608
    new-instance v1, Landroidx/compose/foundation/lazy/grid/LazyGridDslKt$items$8;

    invoke-direct {v1, p3, p1}, Landroidx/compose/foundation/lazy/grid/LazyGridDslKt$items$8;-><init>(Lkotlin/jvm/functions/Function2;[Ljava/lang/Object;)V

    check-cast v1, Lkotlin/jvm/functions/Function2;

    move-object v4, v1

    goto :goto_1

    .line 614
    :cond_1
    move-object v4, v1

    .line 608
    :goto_1
    new-instance v1, Landroidx/compose/foundation/lazy/grid/LazyGridDslKt$items$9;

    invoke-direct {v1, p4, p1}, Landroidx/compose/foundation/lazy/grid/LazyGridDslKt$items$9;-><init>(Lkotlin/jvm/functions/Function1;[Ljava/lang/Object;)V

    move-object v5, v1

    check-cast v5, Lkotlin/jvm/functions/Function1;

    .line 616
    new-instance v1, Landroidx/compose/foundation/lazy/grid/LazyGridDslKt$items$10;

    invoke-direct {v1, p5, p1}, Landroidx/compose/foundation/lazy/grid/LazyGridDslKt$items$10;-><init>(Lkotlin/jvm/functions/Function4;[Ljava/lang/Object;)V

    const v6, 0x184ae7d1

    const/4 v7, 0x1

    invoke-static {v6, v7, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Lkotlin/jvm/functions/Function4;

    .line 608
    move-object v1, p0

    .end local p0    # "$this$items":Landroidx/compose/foundation/lazy/grid/LazyGridScope;
    .local v1, "$this$items":Landroidx/compose/foundation/lazy/grid/LazyGridScope;
    invoke-interface/range {v1 .. v6}, Landroidx/compose/foundation/lazy/grid/LazyGridScope;->items(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V

    .line 618
    return-void
.end method

.method public static synthetic items$default(Landroidx/compose/foundation/lazy/grid/LazyGridScope;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;ILjava/lang/Object;)V
    .locals 6
    .param p0, "$this$items_u24default"    # Landroidx/compose/foundation/lazy/grid/LazyGridScope;
    .param p1, "items"    # Ljava/util/List;
    .param p2, "key"    # Lkotlin/jvm/functions/Function1;
    .param p3, "span"    # Lkotlin/jvm/functions/Function2;
    .param p4, "contentType"    # Lkotlin/jvm/functions/Function1;
    .param p5, "itemContent"    # Lkotlin/jvm/functions/Function4;

    .line 527
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_0

    .line 529
    const/4 p2, 0x0

    .line 527
    :cond_0
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_1

    .line 530
    const/4 p3, 0x0

    .line 527
    :cond_1
    and-int/lit8 p6, p6, 0x8

    if-eqz p6, :cond_2

    .line 531
    sget-object p6, Landroidx/compose/foundation/lazy/grid/LazyGridDslKt$items$1;->INSTANCE:Landroidx/compose/foundation/lazy/grid/LazyGridDslKt$items$1;

    move-object p4, p6

    check-cast p4, Lkotlin/jvm/functions/Function1;

    .line 527
    :cond_2
    const/4 p6, 0x0

    .line 534
    .local p6, "$i$f$items":I
    nop

    .line 535
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    .line 536
    const/4 p7, 0x0

    if-eqz p2, :cond_3

    .line 534
    new-instance v0, Landroidx/compose/foundation/lazy/grid/LazyGridDslKt$items$2;

    invoke-direct {v0, p2, p1}, Landroidx/compose/foundation/lazy/grid/LazyGridDslKt$items$2;-><init>(Lkotlin/jvm/functions/Function1;Ljava/util/List;)V

    check-cast v0, Lkotlin/jvm/functions/Function1;

    move-object v2, v0

    goto :goto_0

    .line 536
    :cond_3
    move-object v2, p7

    .line 538
    :goto_0
    if-eqz p3, :cond_4

    .line 534
    new-instance p7, Landroidx/compose/foundation/lazy/grid/LazyGridDslKt$items$3;

    invoke-direct {p7, p3, p1}, Landroidx/compose/foundation/lazy/grid/LazyGridDslKt$items$3;-><init>(Lkotlin/jvm/functions/Function2;Ljava/util/List;)V

    check-cast p7, Lkotlin/jvm/functions/Function2;

    move-object v3, p7

    goto :goto_1

    .line 540
    :cond_4
    move-object v3, p7

    .line 534
    :goto_1
    new-instance p7, Landroidx/compose/foundation/lazy/grid/LazyGridDslKt$items$4;

    invoke-direct {p7, p4, p1}, Landroidx/compose/foundation/lazy/grid/LazyGridDslKt$items$4;-><init>(Lkotlin/jvm/functions/Function1;Ljava/util/List;)V

    move-object v4, p7

    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 542
    new-instance p7, Landroidx/compose/foundation/lazy/grid/LazyGridDslKt$items$5;

    invoke-direct {p7, p5, p1}, Landroidx/compose/foundation/lazy/grid/LazyGridDslKt$items$5;-><init>(Lkotlin/jvm/functions/Function4;Ljava/util/List;)V

    const v0, 0x29b3c0fe

    const/4 v5, 0x1

    invoke-static {v0, v5, p7}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object p7

    move-object v5, p7

    check-cast v5, Lkotlin/jvm/functions/Function4;

    .line 534
    move-object v0, p0

    .end local p0    # "$this$items_u24default":Landroidx/compose/foundation/lazy/grid/LazyGridScope;
    .local v0, "$this$items_u24default":Landroidx/compose/foundation/lazy/grid/LazyGridScope;
    invoke-interface/range {v0 .. v5}, Landroidx/compose/foundation/lazy/grid/LazyGridScope;->items(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V

    .line 544
    return-void
.end method

.method public static synthetic items$default(Landroidx/compose/foundation/lazy/grid/LazyGridScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;ILjava/lang/Object;)V
    .locals 6
    .param p0, "$this$items_u24default"    # Landroidx/compose/foundation/lazy/grid/LazyGridScope;
    .param p1, "items"    # [Ljava/lang/Object;
    .param p2, "key"    # Lkotlin/jvm/functions/Function1;
    .param p3, "span"    # Lkotlin/jvm/functions/Function2;
    .param p4, "contentType"    # Lkotlin/jvm/functions/Function1;
    .param p5, "itemContent"    # Lkotlin/jvm/functions/Function4;

    .line 601
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_0

    .line 603
    const/4 p2, 0x0

    .line 601
    :cond_0
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_1

    .line 604
    const/4 p3, 0x0

    .line 601
    :cond_1
    and-int/lit8 p6, p6, 0x8

    if-eqz p6, :cond_2

    .line 605
    sget-object p6, Landroidx/compose/foundation/lazy/grid/LazyGridDslKt$items$6;->INSTANCE:Landroidx/compose/foundation/lazy/grid/LazyGridDslKt$items$6;

    move-object p4, p6

    check-cast p4, Lkotlin/jvm/functions/Function1;

    .line 601
    :cond_2
    const/4 p6, 0x0

    .line 608
    .local p6, "$i$f$items":I
    nop

    .line 609
    array-length v1, p1

    .line 610
    const/4 p7, 0x0

    if-eqz p2, :cond_3

    .line 608
    new-instance v0, Landroidx/compose/foundation/lazy/grid/LazyGridDslKt$items$7;

    invoke-direct {v0, p2, p1}, Landroidx/compose/foundation/lazy/grid/LazyGridDslKt$items$7;-><init>(Lkotlin/jvm/functions/Function1;[Ljava/lang/Object;)V

    check-cast v0, Lkotlin/jvm/functions/Function1;

    move-object v2, v0

    goto :goto_0

    .line 610
    :cond_3
    move-object v2, p7

    .line 612
    :goto_0
    if-eqz p3, :cond_4

    .line 608
    new-instance p7, Landroidx/compose/foundation/lazy/grid/LazyGridDslKt$items$8;

    invoke-direct {p7, p3, p1}, Landroidx/compose/foundation/lazy/grid/LazyGridDslKt$items$8;-><init>(Lkotlin/jvm/functions/Function2;[Ljava/lang/Object;)V

    check-cast p7, Lkotlin/jvm/functions/Function2;

    move-object v3, p7

    goto :goto_1

    .line 614
    :cond_4
    move-object v3, p7

    .line 608
    :goto_1
    new-instance p7, Landroidx/compose/foundation/lazy/grid/LazyGridDslKt$items$9;

    invoke-direct {p7, p4, p1}, Landroidx/compose/foundation/lazy/grid/LazyGridDslKt$items$9;-><init>(Lkotlin/jvm/functions/Function1;[Ljava/lang/Object;)V

    move-object v4, p7

    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 616
    new-instance p7, Landroidx/compose/foundation/lazy/grid/LazyGridDslKt$items$10;

    invoke-direct {p7, p5, p1}, Landroidx/compose/foundation/lazy/grid/LazyGridDslKt$items$10;-><init>(Lkotlin/jvm/functions/Function4;[Ljava/lang/Object;)V

    const v0, 0x184ae7d1

    const/4 v5, 0x1

    invoke-static {v0, v5, p7}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object p7

    move-object v5, p7

    check-cast v5, Lkotlin/jvm/functions/Function4;

    .line 608
    move-object v0, p0

    .end local p0    # "$this$items_u24default":Landroidx/compose/foundation/lazy/grid/LazyGridScope;
    .local v0, "$this$items_u24default":Landroidx/compose/foundation/lazy/grid/LazyGridScope;
    invoke-interface/range {v0 .. v5}, Landroidx/compose/foundation/lazy/grid/LazyGridScope;->items(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V

    .line 618
    return-void
.end method

.method public static final itemsIndexed(Landroidx/compose/foundation/lazy/grid/LazyGridScope;Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;)V
    .locals 8
    .param p0, "$this$itemsIndexed"    # Landroidx/compose/foundation/lazy/grid/LazyGridScope;
    .param p1, "items"    # Ljava/util/List;
    .param p2, "key"    # Lkotlin/jvm/functions/Function2;
    .param p3, "span"    # Lkotlin/jvm/functions/Function3;
    .param p4, "contentType"    # Lkotlin/jvm/functions/Function2;
    .param p5, "itemContent"    # Lkotlin/jvm/functions/Function5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/compose/foundation/lazy/grid/LazyGridScope;",
            "Ljava/util/List<",
            "+TT;>;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Ljava/lang/Integer;",
            "-TT;+",
            "Ljava/lang/Object;",
            ">;",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;",
            "-",
            "Ljava/lang/Integer;",
            "-TT;",
            "Landroidx/compose/foundation/lazy/grid/GridItemSpan;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Ljava/lang/Integer;",
            "-TT;+",
            "Ljava/lang/Object;",
            ">;",
            "Lkotlin/jvm/functions/Function5<",
            "-",
            "Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;",
            "-",
            "Ljava/lang/Integer;",
            "-TT;-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 571
    .local v0, "$i$f$itemsIndexed":I
    nop

    .line 572
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    .line 573
    const/4 v1, 0x0

    if-eqz p2, :cond_0

    .line 571
    new-instance v3, Landroidx/compose/foundation/lazy/grid/LazyGridDslKt$itemsIndexed$2;

    invoke-direct {v3, p2, p1}, Landroidx/compose/foundation/lazy/grid/LazyGridDslKt$itemsIndexed$2;-><init>(Lkotlin/jvm/functions/Function2;Ljava/util/List;)V

    check-cast v3, Lkotlin/jvm/functions/Function1;

    goto :goto_0

    .line 573
    :cond_0
    move-object v3, v1

    .line 575
    :goto_0
    if-eqz p3, :cond_1

    .line 571
    new-instance v1, Landroidx/compose/foundation/lazy/grid/LazyGridDslKt$itemsIndexed$3;

    invoke-direct {v1, p3, p1}, Landroidx/compose/foundation/lazy/grid/LazyGridDslKt$itemsIndexed$3;-><init>(Lkotlin/jvm/functions/Function3;Ljava/util/List;)V

    check-cast v1, Lkotlin/jvm/functions/Function2;

    move-object v4, v1

    goto :goto_1

    .line 577
    :cond_1
    move-object v4, v1

    .line 571
    :goto_1
    new-instance v1, Landroidx/compose/foundation/lazy/grid/LazyGridDslKt$itemsIndexed$4;

    invoke-direct {v1, p4, p1}, Landroidx/compose/foundation/lazy/grid/LazyGridDslKt$itemsIndexed$4;-><init>(Lkotlin/jvm/functions/Function2;Ljava/util/List;)V

    move-object v5, v1

    check-cast v5, Lkotlin/jvm/functions/Function1;

    .line 579
    new-instance v1, Landroidx/compose/foundation/lazy/grid/LazyGridDslKt$itemsIndexed$5;

    invoke-direct {v1, p5, p1}, Landroidx/compose/foundation/lazy/grid/LazyGridDslKt$itemsIndexed$5;-><init>(Lkotlin/jvm/functions/Function5;Ljava/util/List;)V

    const v6, 0x49456f69

    const/4 v7, 0x1

    invoke-static {v6, v7, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Lkotlin/jvm/functions/Function4;

    .line 571
    move-object v1, p0

    .end local p0    # "$this$itemsIndexed":Landroidx/compose/foundation/lazy/grid/LazyGridScope;
    .local v1, "$this$itemsIndexed":Landroidx/compose/foundation/lazy/grid/LazyGridScope;
    invoke-interface/range {v1 .. v6}, Landroidx/compose/foundation/lazy/grid/LazyGridScope;->items(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V

    .line 581
    return-void
.end method

.method public static final itemsIndexed(Landroidx/compose/foundation/lazy/grid/LazyGridScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;)V
    .locals 8
    .param p0, "$this$itemsIndexed"    # Landroidx/compose/foundation/lazy/grid/LazyGridScope;
    .param p1, "items"    # [Ljava/lang/Object;
    .param p2, "key"    # Lkotlin/jvm/functions/Function2;
    .param p3, "span"    # Lkotlin/jvm/functions/Function3;
    .param p4, "contentType"    # Lkotlin/jvm/functions/Function2;
    .param p5, "itemContent"    # Lkotlin/jvm/functions/Function5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/compose/foundation/lazy/grid/LazyGridScope;",
            "[TT;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Ljava/lang/Integer;",
            "-TT;+",
            "Ljava/lang/Object;",
            ">;",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;",
            "-",
            "Ljava/lang/Integer;",
            "-TT;",
            "Landroidx/compose/foundation/lazy/grid/GridItemSpan;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Ljava/lang/Integer;",
            "-TT;+",
            "Ljava/lang/Object;",
            ">;",
            "Lkotlin/jvm/functions/Function5<",
            "-",
            "Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;",
            "-",
            "Ljava/lang/Integer;",
            "-TT;-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 645
    .local v0, "$i$f$itemsIndexed":I
    nop

    .line 646
    array-length v2, p1

    .line 647
    const/4 v1, 0x0

    if-eqz p2, :cond_0

    .line 645
    new-instance v3, Landroidx/compose/foundation/lazy/grid/LazyGridDslKt$itemsIndexed$7;

    invoke-direct {v3, p2, p1}, Landroidx/compose/foundation/lazy/grid/LazyGridDslKt$itemsIndexed$7;-><init>(Lkotlin/jvm/functions/Function2;[Ljava/lang/Object;)V

    check-cast v3, Lkotlin/jvm/functions/Function1;

    goto :goto_0

    .line 647
    :cond_0
    move-object v3, v1

    .line 649
    :goto_0
    if-eqz p3, :cond_1

    .line 645
    new-instance v1, Landroidx/compose/foundation/lazy/grid/LazyGridDslKt$itemsIndexed$8;

    invoke-direct {v1, p3, p1}, Landroidx/compose/foundation/lazy/grid/LazyGridDslKt$itemsIndexed$8;-><init>(Lkotlin/jvm/functions/Function3;[Ljava/lang/Object;)V

    check-cast v1, Lkotlin/jvm/functions/Function2;

    move-object v4, v1

    goto :goto_1

    .line 651
    :cond_1
    move-object v4, v1

    .line 645
    :goto_1
    new-instance v1, Landroidx/compose/foundation/lazy/grid/LazyGridDslKt$itemsIndexed$9;

    invoke-direct {v1, p4, p1}, Landroidx/compose/foundation/lazy/grid/LazyGridDslKt$itemsIndexed$9;-><init>(Lkotlin/jvm/functions/Function2;[Ljava/lang/Object;)V

    move-object v5, v1

    check-cast v5, Lkotlin/jvm/functions/Function1;

    .line 653
    new-instance v1, Landroidx/compose/foundation/lazy/grid/LazyGridDslKt$itemsIndexed$10;

    invoke-direct {v1, p5, p1}, Landroidx/compose/foundation/lazy/grid/LazyGridDslKt$itemsIndexed$10;-><init>(Lkotlin/jvm/functions/Function5;[Ljava/lang/Object;)V

    const v6, -0x3653b6c2

    const/4 v7, 0x1

    invoke-static {v6, v7, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Lkotlin/jvm/functions/Function4;

    .line 645
    move-object v1, p0

    .end local p0    # "$this$itemsIndexed":Landroidx/compose/foundation/lazy/grid/LazyGridScope;
    .local v1, "$this$itemsIndexed":Landroidx/compose/foundation/lazy/grid/LazyGridScope;
    invoke-interface/range {v1 .. v6}, Landroidx/compose/foundation/lazy/grid/LazyGridScope;->items(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V

    .line 655
    return-void
.end method

.method public static synthetic itemsIndexed$default(Landroidx/compose/foundation/lazy/grid/LazyGridScope;Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;ILjava/lang/Object;)V
    .locals 6
    .param p0, "$this$itemsIndexed_u24default"    # Landroidx/compose/foundation/lazy/grid/LazyGridScope;
    .param p1, "items"    # Ljava/util/List;
    .param p2, "key"    # Lkotlin/jvm/functions/Function2;
    .param p3, "span"    # Lkotlin/jvm/functions/Function3;
    .param p4, "contentType"    # Lkotlin/jvm/functions/Function2;
    .param p5, "itemContent"    # Lkotlin/jvm/functions/Function5;

    .line 564
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_0

    .line 566
    const/4 p2, 0x0

    .line 564
    :cond_0
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_1

    .line 567
    const/4 p3, 0x0

    .line 564
    :cond_1
    and-int/lit8 p6, p6, 0x8

    if-eqz p6, :cond_2

    .line 568
    sget-object p6, Landroidx/compose/foundation/lazy/grid/LazyGridDslKt$itemsIndexed$1;->INSTANCE:Landroidx/compose/foundation/lazy/grid/LazyGridDslKt$itemsIndexed$1;

    move-object p4, p6

    check-cast p4, Lkotlin/jvm/functions/Function2;

    .line 564
    :cond_2
    const/4 p6, 0x0

    .line 571
    .local p6, "$i$f$itemsIndexed":I
    nop

    .line 572
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    .line 573
    const/4 p7, 0x0

    if-eqz p2, :cond_3

    .line 571
    new-instance v0, Landroidx/compose/foundation/lazy/grid/LazyGridDslKt$itemsIndexed$2;

    invoke-direct {v0, p2, p1}, Landroidx/compose/foundation/lazy/grid/LazyGridDslKt$itemsIndexed$2;-><init>(Lkotlin/jvm/functions/Function2;Ljava/util/List;)V

    check-cast v0, Lkotlin/jvm/functions/Function1;

    move-object v2, v0

    goto :goto_0

    .line 573
    :cond_3
    move-object v2, p7

    .line 575
    :goto_0
    if-eqz p3, :cond_4

    .line 571
    new-instance p7, Landroidx/compose/foundation/lazy/grid/LazyGridDslKt$itemsIndexed$3;

    invoke-direct {p7, p3, p1}, Landroidx/compose/foundation/lazy/grid/LazyGridDslKt$itemsIndexed$3;-><init>(Lkotlin/jvm/functions/Function3;Ljava/util/List;)V

    check-cast p7, Lkotlin/jvm/functions/Function2;

    move-object v3, p7

    goto :goto_1

    .line 577
    :cond_4
    move-object v3, p7

    .line 571
    :goto_1
    new-instance p7, Landroidx/compose/foundation/lazy/grid/LazyGridDslKt$itemsIndexed$4;

    invoke-direct {p7, p4, p1}, Landroidx/compose/foundation/lazy/grid/LazyGridDslKt$itemsIndexed$4;-><init>(Lkotlin/jvm/functions/Function2;Ljava/util/List;)V

    move-object v4, p7

    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 579
    new-instance p7, Landroidx/compose/foundation/lazy/grid/LazyGridDslKt$itemsIndexed$5;

    invoke-direct {p7, p5, p1}, Landroidx/compose/foundation/lazy/grid/LazyGridDslKt$itemsIndexed$5;-><init>(Lkotlin/jvm/functions/Function5;Ljava/util/List;)V

    const v0, 0x49456f69

    const/4 v5, 0x1

    invoke-static {v0, v5, p7}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object p7

    move-object v5, p7

    check-cast v5, Lkotlin/jvm/functions/Function4;

    .line 571
    move-object v0, p0

    .end local p0    # "$this$itemsIndexed_u24default":Landroidx/compose/foundation/lazy/grid/LazyGridScope;
    .local v0, "$this$itemsIndexed_u24default":Landroidx/compose/foundation/lazy/grid/LazyGridScope;
    invoke-interface/range {v0 .. v5}, Landroidx/compose/foundation/lazy/grid/LazyGridScope;->items(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V

    .line 581
    return-void
.end method

.method public static synthetic itemsIndexed$default(Landroidx/compose/foundation/lazy/grid/LazyGridScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;ILjava/lang/Object;)V
    .locals 6
    .param p0, "$this$itemsIndexed_u24default"    # Landroidx/compose/foundation/lazy/grid/LazyGridScope;
    .param p1, "items"    # [Ljava/lang/Object;
    .param p2, "key"    # Lkotlin/jvm/functions/Function2;
    .param p3, "span"    # Lkotlin/jvm/functions/Function3;
    .param p4, "contentType"    # Lkotlin/jvm/functions/Function2;
    .param p5, "itemContent"    # Lkotlin/jvm/functions/Function5;

    .line 638
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_0

    .line 640
    const/4 p2, 0x0

    .line 638
    :cond_0
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_1

    .line 641
    const/4 p3, 0x0

    .line 638
    :cond_1
    and-int/lit8 p6, p6, 0x8

    if-eqz p6, :cond_2

    .line 642
    sget-object p6, Landroidx/compose/foundation/lazy/grid/LazyGridDslKt$itemsIndexed$6;->INSTANCE:Landroidx/compose/foundation/lazy/grid/LazyGridDslKt$itemsIndexed$6;

    move-object p4, p6

    check-cast p4, Lkotlin/jvm/functions/Function2;

    .line 638
    :cond_2
    const/4 p6, 0x0

    .line 645
    .local p6, "$i$f$itemsIndexed":I
    nop

    .line 646
    array-length v1, p1

    .line 647
    const/4 p7, 0x0

    if-eqz p2, :cond_3

    .line 645
    new-instance v0, Landroidx/compose/foundation/lazy/grid/LazyGridDslKt$itemsIndexed$7;

    invoke-direct {v0, p2, p1}, Landroidx/compose/foundation/lazy/grid/LazyGridDslKt$itemsIndexed$7;-><init>(Lkotlin/jvm/functions/Function2;[Ljava/lang/Object;)V

    check-cast v0, Lkotlin/jvm/functions/Function1;

    move-object v2, v0

    goto :goto_0

    .line 647
    :cond_3
    move-object v2, p7

    .line 649
    :goto_0
    if-eqz p3, :cond_4

    .line 645
    new-instance p7, Landroidx/compose/foundation/lazy/grid/LazyGridDslKt$itemsIndexed$8;

    invoke-direct {p7, p3, p1}, Landroidx/compose/foundation/lazy/grid/LazyGridDslKt$itemsIndexed$8;-><init>(Lkotlin/jvm/functions/Function3;[Ljava/lang/Object;)V

    check-cast p7, Lkotlin/jvm/functions/Function2;

    move-object v3, p7

    goto :goto_1

    .line 651
    :cond_4
    move-object v3, p7

    .line 645
    :goto_1
    new-instance p7, Landroidx/compose/foundation/lazy/grid/LazyGridDslKt$itemsIndexed$9;

    invoke-direct {p7, p4, p1}, Landroidx/compose/foundation/lazy/grid/LazyGridDslKt$itemsIndexed$9;-><init>(Lkotlin/jvm/functions/Function2;[Ljava/lang/Object;)V

    move-object v4, p7

    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 653
    new-instance p7, Landroidx/compose/foundation/lazy/grid/LazyGridDslKt$itemsIndexed$10;

    invoke-direct {p7, p5, p1}, Landroidx/compose/foundation/lazy/grid/LazyGridDslKt$itemsIndexed$10;-><init>(Lkotlin/jvm/functions/Function5;[Ljava/lang/Object;)V

    const v0, -0x3653b6c2

    const/4 v5, 0x1

    invoke-static {v0, v5, p7}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object p7

    move-object v5, p7

    check-cast v5, Lkotlin/jvm/functions/Function4;

    .line 645
    move-object v0, p0

    .end local p0    # "$this$itemsIndexed_u24default":Landroidx/compose/foundation/lazy/grid/LazyGridScope;
    .local v0, "$this$itemsIndexed_u24default":Landroidx/compose/foundation/lazy/grid/LazyGridScope;
    invoke-interface/range {v0 .. v5}, Landroidx/compose/foundation/lazy/grid/LazyGridScope;->items(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V

    .line 655
    return-void
.end method

.method private static final rememberColumnWidthSums(Landroidx/compose/foundation/lazy/grid/GridCells;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/lazy/grid/LazyGridSlotsProvider;
    .locals 8
    .param p0, "columns"    # Landroidx/compose/foundation/lazy/grid/GridCells;
    .param p1, "horizontalArrangement"    # Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .param p2, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p3, "$changed"    # I

    .line 222
    const v0, -0x48f4d41

    const-string v1, "C(rememberColumnWidthSums)221@9590L872:LazyGridDsl.kt#7791vq"

    invoke-static {p2, v0, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "androidx.compose.foundation.lazy.grid.rememberColumnWidthSums (LazyGridDsl.kt:221)"

    invoke-static {v0, p3, v1, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_0
    const v0, -0x7d587655

    const-string v1, "CC(remember):LazyGridDsl.kt#9igjgp"

    invoke-static {p2, v0, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    and-int/lit8 v0, p3, 0xe

    xor-int/lit8 v0, v0, 0x6

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x4

    if-le v0, v3, :cond_1

    .line 223
    invoke-interface {p2, p0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    :cond_1
    and-int/lit8 v0, p3, 0x6

    if-ne v0, v3, :cond_3

    :cond_2
    move v0, v2

    goto :goto_0

    :cond_3
    move v0, v1

    :goto_0
    and-int/lit8 v3, p3, 0x70

    xor-int/lit8 v3, v3, 0x30

    const/16 v4, 0x20

    if-le v3, v4, :cond_4

    .line 224
    invoke-interface {p2, p1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_5

    :cond_4
    and-int/lit8 v3, p3, 0x30

    if-ne v3, v4, :cond_6

    :cond_5
    move v1, v2

    :cond_6
    or-int/2addr v0, v1

    .line 222
    move-object v1, p2

    .local v0, "invalid$iv":Z
    .local v1, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/4 v2, 0x0

    .line 661
    .local v2, "$i$f$cache":I
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v3

    .local v3, "it$iv":Ljava/lang/Object;
    const/4 v4, 0x0

    .line 662
    .local v4, "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez v0, :cond_8

    sget-object v5, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v5}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v5

    if-ne v3, v5, :cond_7

    goto :goto_1

    .line 666
    :cond_7
    goto :goto_2

    .line 663
    :cond_8
    :goto_1
    const/4 v5, 0x0

    .line 226
    .local v5, "$i$a$-cache-LazyGridDslKt$rememberColumnWidthSums$1":I
    new-instance v6, Landroidx/compose/foundation/lazy/grid/GridSlotCache;

    new-instance v7, Landroidx/compose/foundation/lazy/grid/LazyGridDslKt$rememberColumnWidthSums$1$1;

    invoke-direct {v7, p0, p1}, Landroidx/compose/foundation/lazy/grid/LazyGridDslKt$rememberColumnWidthSums$1$1;-><init>(Landroidx/compose/foundation/lazy/grid/GridCells;Landroidx/compose/foundation/layout/Arrangement$Horizontal;)V

    check-cast v7, Lkotlin/jvm/functions/Function2;

    invoke-direct {v6, v7}, Landroidx/compose/foundation/lazy/grid/GridSlotCache;-><init>(Lkotlin/jvm/functions/Function2;)V

    check-cast v6, Landroidx/compose/foundation/lazy/grid/LazyGridSlotsProvider;

    .line 243
    nop

    .line 663
    .end local v5    # "$i$a$-cache-LazyGridDslKt$rememberColumnWidthSums$1":I
    nop

    .line 664
    .local v6, "value$iv":Ljava/lang/Object;
    invoke-interface {v1, v6}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 665
    move-object v3, v6

    .line 661
    .end local v3    # "it$iv":Ljava/lang/Object;
    .end local v4    # "$i$a$-let-ComposerKt$cache$1$iv":I
    .end local v6    # "value$iv":Ljava/lang/Object;
    :goto_2
    nop

    .line 222
    .end local v0    # "invalid$iv":Z
    .end local v1    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v2    # "$i$f$cache":I
    check-cast v3, Landroidx/compose/foundation/lazy/grid/LazyGridSlotsProvider;

    invoke-static {p2}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_9
    invoke-static {p2}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    return-object v3
.end method

.method private static final rememberRowHeightSums(Landroidx/compose/foundation/lazy/grid/GridCells;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/lazy/grid/LazyGridSlotsProvider;
    .locals 8
    .param p0, "rows"    # Landroidx/compose/foundation/lazy/grid/GridCells;
    .param p1, "verticalArrangement"    # Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .param p2, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p3, "$changed"    # I

    .line 249
    const v0, -0x8fd4d60

    const-string v1, "C(rememberRowHeightSums)248@10619L772:LazyGridDsl.kt#7791vq"

    invoke-static {p2, v0, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "androidx.compose.foundation.lazy.grid.rememberRowHeightSums (LazyGridDsl.kt:248)"

    invoke-static {v0, p3, v1, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_0
    const v0, -0x16a7d488

    const-string v1, "CC(remember):LazyGridDsl.kt#9igjgp"

    invoke-static {p2, v0, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    and-int/lit8 v0, p3, 0xe

    xor-int/lit8 v0, v0, 0x6

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x4

    if-le v0, v3, :cond_1

    invoke-interface {p2, p0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    :cond_1
    and-int/lit8 v0, p3, 0x6

    if-ne v0, v3, :cond_3

    :cond_2
    move v0, v2

    goto :goto_0

    :cond_3
    move v0, v1

    :goto_0
    and-int/lit8 v3, p3, 0x70

    xor-int/lit8 v3, v3, 0x30

    const/16 v4, 0x20

    if-le v3, v4, :cond_4

    invoke-interface {p2, p1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_5

    :cond_4
    and-int/lit8 v3, p3, 0x30

    if-ne v3, v4, :cond_6

    :cond_5
    move v1, v2

    :cond_6
    or-int/2addr v0, v1

    .local v0, "invalid$iv":Z
    move-object v1, p2

    .local v1, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/4 v2, 0x0

    .line 667
    .local v2, "$i$f$cache":I
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v3

    .local v3, "it$iv":Ljava/lang/Object;
    const/4 v4, 0x0

    .line 668
    .local v4, "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez v0, :cond_8

    sget-object v5, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v5}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v5

    if-ne v3, v5, :cond_7

    goto :goto_1

    .line 672
    :cond_7
    goto :goto_2

    .line 669
    :cond_8
    :goto_1
    const/4 v5, 0x0

    .line 250
    .local v5, "$i$a$-cache-LazyGridDslKt$rememberRowHeightSums$1":I
    new-instance v6, Landroidx/compose/foundation/lazy/grid/GridSlotCache;

    new-instance v7, Landroidx/compose/foundation/lazy/grid/LazyGridDslKt$rememberRowHeightSums$1$1;

    invoke-direct {v7, p0, p1}, Landroidx/compose/foundation/lazy/grid/LazyGridDslKt$rememberRowHeightSums$1$1;-><init>(Landroidx/compose/foundation/lazy/grid/GridCells;Landroidx/compose/foundation/layout/Arrangement$Vertical;)V

    check-cast v7, Lkotlin/jvm/functions/Function2;

    invoke-direct {v6, v7}, Landroidx/compose/foundation/lazy/grid/GridSlotCache;-><init>(Lkotlin/jvm/functions/Function2;)V

    check-cast v6, Landroidx/compose/foundation/lazy/grid/LazyGridSlotsProvider;

    .line 265
    nop

    .line 669
    .end local v5    # "$i$a$-cache-LazyGridDslKt$rememberRowHeightSums$1":I
    nop

    .line 670
    .local v6, "value$iv":Ljava/lang/Object;
    invoke-interface {v1, v6}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 671
    move-object v3, v6

    .line 667
    .end local v3    # "it$iv":Ljava/lang/Object;
    .end local v4    # "$i$a$-let-ComposerKt$cache$1$iv":I
    .end local v6    # "value$iv":Ljava/lang/Object;
    :goto_2
    nop

    .line 249
    .end local v0    # "invalid$iv":Z
    .end local v1    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v2    # "$i$f$cache":I
    check-cast v3, Landroidx/compose/foundation/lazy/grid/LazyGridSlotsProvider;

    invoke-static {p2}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_9
    invoke-static {p2}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    return-object v3
.end method
