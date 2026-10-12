.class public final Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScopeImpl;
.super Ljava/lang/Object;
.source "LazyLayoutMeasureScope.kt"

# interfaces
.implements Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;
.implements Landroidx/compose/ui/layout/MeasureScope;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLazyLayoutMeasureScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutMeasureScope.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScopeImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,147:1\n1#2:148\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00aa\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0008\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007Je\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e2\u0014\u0008\u0002\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u001e0!2\u001b\u0008\u0002\u0010#\u001a\u0015\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&\u0018\u00010$\u00a2\u0006\u0002\u0008\'2\u0017\u0010(\u001a\u0013\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020&0$\u00a2\u0006\u0002\u0008\'H\u0096\u0001JH\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e2\u0014\u0008\u0002\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u001e0!2\u0017\u0010(\u001a\u0013\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020&0$\u00a2\u0006\u0002\u0008\'H\u0096\u0001J(\u0010*\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010+\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020-H\u0016\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008.\u0010/J\u0017\u00100\u001a\u00020\u001e*\u000201H\u0097\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u00082\u00103J\u0017\u00100\u001a\u00020\u001e*\u000204H\u0097\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u00085\u00106J\u0016\u00107\u001a\u000201*\u000204H\u0016\u00f8\u0001\u0000\u00a2\u0006\u0004\u00088\u00109J\u0019\u00107\u001a\u000201*\u00020\tH\u0016\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008:\u0010;J\u0019\u00107\u001a\u000201*\u00020\u001eH\u0016\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008:\u0010<J\u0016\u0010=\u001a\u00020>*\u00020?H\u0016\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008@\u0010AJ\u0017\u0010B\u001a\u00020\t*\u000201H\u0097\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008C\u0010;J\u0017\u0010B\u001a\u00020\t*\u000204H\u0097\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008D\u00109J\r\u0010E\u001a\u00020F*\u00020GH\u0097\u0001J\u0016\u0010H\u001a\u00020?*\u00020>H\u0016\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008I\u0010AJ\u0016\u0010J\u001a\u000204*\u000201H\u0016\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008K\u0010LJ\u0019\u0010J\u001a\u000204*\u00020\tH\u0016\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008M\u0010LJ\u0019\u0010J\u001a\u000204*\u00020\u001eH\u0016\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008M\u0010NR\u0014\u0010\u0008\u001a\u00020\t8\u0016X\u0097\u0005\u00a2\u0006\u0006\u001a\u0004\u0008\n\u0010\u000bR\u0014\u0010\u000c\u001a\u00020\t8\u0016X\u0097\u0005\u00a2\u0006\u0006\u001a\u0004\u0008\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u000f8VX\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008\u000e\u0010\u0010R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0013\u001a\u00020\u0014X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u001a0\u00190\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006O"
    }
    d2 = {
        "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScopeImpl;",
        "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;",
        "Landroidx/compose/ui/layout/MeasureScope;",
        "itemContentFactory",
        "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;",
        "subcomposeMeasureScope",
        "Landroidx/compose/ui/layout/SubcomposeMeasureScope;",
        "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;Landroidx/compose/ui/layout/SubcomposeMeasureScope;)V",
        "density",
        "",
        "getDensity",
        "()F",
        "fontScale",
        "getFontScale",
        "isLookingAhead",
        "",
        "()Z",
        "itemProvider",
        "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;",
        "layoutDirection",
        "Landroidx/compose/ui/unit/LayoutDirection;",
        "getLayoutDirection",
        "()Landroidx/compose/ui/unit/LayoutDirection;",
        "placeablesCache",
        "Landroidx/collection/MutableIntObjectMap;",
        "",
        "Landroidx/compose/ui/layout/Placeable;",
        "layout",
        "Landroidx/compose/ui/layout/MeasureResult;",
        "width",
        "",
        "height",
        "alignmentLines",
        "",
        "Landroidx/compose/ui/layout/AlignmentLine;",
        "rulers",
        "Lkotlin/Function1;",
        "Landroidx/compose/ui/layout/RulerScope;",
        "",
        "Lkotlin/ExtensionFunctionType;",
        "placementBlock",
        "Landroidx/compose/ui/layout/Placeable$PlacementScope;",
        "measure",
        "index",
        "constraints",
        "Landroidx/compose/ui/unit/Constraints;",
        "measure-0kLqBqw",
        "(IJ)Ljava/util/List;",
        "roundToPx",
        "Landroidx/compose/ui/unit/Dp;",
        "roundToPx-0680j_4",
        "(F)I",
        "Landroidx/compose/ui/unit/TextUnit;",
        "roundToPx--R2X_6o",
        "(J)I",
        "toDp",
        "toDp-GaN1DYA",
        "(J)F",
        "toDp-u2uoSUM",
        "(F)F",
        "(I)F",
        "toDpSize",
        "Landroidx/compose/ui/unit/DpSize;",
        "Landroidx/compose/ui/geometry/Size;",
        "toDpSize-k-rfVVM",
        "(J)J",
        "toPx",
        "toPx-0680j_4",
        "toPx--R2X_6o",
        "toRect",
        "Landroidx/compose/ui/geometry/Rect;",
        "Landroidx/compose/ui/unit/DpRect;",
        "toSize",
        "toSize-XkaWNTQ",
        "toSp",
        "toSp-0xMU5do",
        "(F)J",
        "toSp-kPz2Gy4",
        "(I)J",
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
.field private final itemContentFactory:Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;

.field private final itemProvider:Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;

.field private final placeablesCache:Landroidx/collection/MutableIntObjectMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/collection/MutableIntObjectMap<",
            "Ljava/util/List<",
            "Landroidx/compose/ui/layout/Placeable;",
            ">;>;"
        }
    .end annotation
.end field

.field private final subcomposeMeasureScope:Landroidx/compose/ui/layout/SubcomposeMeasureScope;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;Landroidx/compose/ui/layout/SubcomposeMeasureScope;)V
    .locals 1
    .param p1, "itemContentFactory"    # Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;
    .param p2, "subcomposeMeasureScope"    # Landroidx/compose/ui/layout/SubcomposeMeasureScope;

    .line 101
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 104
    iput-object p1, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScopeImpl;->itemContentFactory:Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;

    .line 105
    iput-object p2, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScopeImpl;->subcomposeMeasureScope:Landroidx/compose/ui/layout/SubcomposeMeasureScope;

    .line 108
    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScopeImpl;->itemContentFactory:Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;

    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;->getItemProvider()Lkotlin/jvm/functions/Function0;

    move-result-object v0

    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;

    iput-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScopeImpl;->itemProvider:Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;

    .line 114
    invoke-static {}, Landroidx/collection/IntObjectMapKt;->mutableIntObjectMapOf()Landroidx/collection/MutableIntObjectMap;

    move-result-object v0

    iput-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScopeImpl;->placeablesCache:Landroidx/collection/MutableIntObjectMap;

    .line 103
    return-void
.end method


# virtual methods
.method public getDensity()F
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScopeImpl;->subcomposeMeasureScope:Landroidx/compose/ui/layout/SubcomposeMeasureScope;

    invoke-interface {v0}, Landroidx/compose/ui/layout/SubcomposeMeasureScope;->getDensity()F

    move-result v0

    return v0
.end method

.method public getFontScale()F
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScopeImpl;->subcomposeMeasureScope:Landroidx/compose/ui/layout/SubcomposeMeasureScope;

    invoke-interface {v0}, Landroidx/compose/ui/layout/SubcomposeMeasureScope;->getFontScale()F

    move-result v0

    return v0
.end method

.method public getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScopeImpl;->subcomposeMeasureScope:Landroidx/compose/ui/layout/SubcomposeMeasureScope;

    invoke-interface {v0}, Landroidx/compose/ui/layout/SubcomposeMeasureScope;->getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;

    move-result-object v0

    return-object v0
.end method

.method public isLookingAhead()Z
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScopeImpl;->subcomposeMeasureScope:Landroidx/compose/ui/layout/SubcomposeMeasureScope;

    invoke-interface {v0}, Landroidx/compose/ui/layout/SubcomposeMeasureScope;->isLookingAhead()Z

    move-result v0

    return v0
.end method

.method public layout(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/layout/MeasureResult;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/util/Map<",
            "Landroidx/compose/ui/layout/AlignmentLine;",
            "Ljava/lang/Integer;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/ui/layout/Placeable$PlacementScope;",
            "Lkotlin/Unit;",
            ">;)",
            "Landroidx/compose/ui/layout/MeasureResult;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScopeImpl;->subcomposeMeasureScope:Landroidx/compose/ui/layout/SubcomposeMeasureScope;

    invoke-interface {v0, p1, p2, p3, p4}, Landroidx/compose/ui/layout/SubcomposeMeasureScope;->layout(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/layout/MeasureResult;

    move-result-object v0

    return-object v0
.end method

.method public layout(IILjava/util/Map;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/layout/MeasureResult;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/util/Map<",
            "Landroidx/compose/ui/layout/AlignmentLine;",
            "Ljava/lang/Integer;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/ui/layout/RulerScope;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/ui/layout/Placeable$PlacementScope;",
            "Lkotlin/Unit;",
            ">;)",
            "Landroidx/compose/ui/layout/MeasureResult;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScopeImpl;->subcomposeMeasureScope:Landroidx/compose/ui/layout/SubcomposeMeasureScope;

    move v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-interface/range {v0 .. v5}, Landroidx/compose/ui/layout/SubcomposeMeasureScope;->layout(IILjava/util/Map;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/layout/MeasureResult;

    move-result-object p1

    return-object p1
.end method

.method public measure-0kLqBqw(IJ)Ljava/util/List;
    .locals 11
    .param p1, "index"    # I
    .param p2, "constraints"    # J
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IJ)",
            "Ljava/util/List<",
            "Landroidx/compose/ui/layout/Placeable;",
            ">;"
        }
    .end annotation

    .line 117
    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScopeImpl;->placeablesCache:Landroidx/collection/MutableIntObjectMap;

    invoke-virtual {v0, p1}, Landroidx/collection/MutableIntObjectMap;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .line 118
    .local v0, "cachedPlaceable":Ljava/util/List;
    if-eqz v0, :cond_0

    .line 119
    move-object v6, v0

    goto :goto_1

    .line 121
    :cond_0
    iget-object v1, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScopeImpl;->itemProvider:Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;

    invoke-interface {v1, p1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;->getKey(I)Ljava/lang/Object;

    move-result-object v1

    .line 122
    .local v1, "key":Ljava/lang/Object;
    iget-object v2, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScopeImpl;->itemProvider:Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;

    invoke-interface {v2, p1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;->getContentType(I)Ljava/lang/Object;

    move-result-object v2

    .line 123
    .local v2, "contentType":Ljava/lang/Object;
    iget-object v3, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScopeImpl;->itemContentFactory:Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;

    invoke-virtual {v3, p1, v1, v2}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;->getContent(ILjava/lang/Object;Ljava/lang/Object;)Lkotlin/jvm/functions/Function2;

    move-result-object v3

    .line 124
    .local v3, "itemContent":Lkotlin/jvm/functions/Function2;
    iget-object v4, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScopeImpl;->subcomposeMeasureScope:Landroidx/compose/ui/layout/SubcomposeMeasureScope;

    invoke-interface {v4, v1, v3}, Landroidx/compose/ui/layout/SubcomposeMeasureScope;->subcompose(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/List;

    move-result-object v4

    .line 125
    .local v4, "measurables":Ljava/util/List;
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v5

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6, v5}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v7, 0x0

    :goto_0
    if-ge v7, v5, :cond_1

    .line 148
    move v8, v7

    .local v8, "i":I
    const/4 v9, 0x0

    .line 125
    .local v9, "$i$a$-List-LazyLayoutMeasureScopeImpl$measure$1":I
    invoke-interface {v4, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Landroidx/compose/ui/layout/Measurable;

    invoke-interface {v10, p2, p3}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    move-result-object v8

    .end local v8    # "i":I
    .end local v9    # "$i$a$-List-LazyLayoutMeasureScopeImpl$measure$1":I
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_1
    check-cast v6, Ljava/util/List;

    .line 126
    move-object v5, v6

    .line 148
    .local v5, "it":Ljava/util/List;
    const/4 v7, 0x0

    .line 126
    .local v7, "$i$a$-also-LazyLayoutMeasureScopeImpl$measure$2":I
    iget-object v8, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScopeImpl;->placeablesCache:Landroidx/collection/MutableIntObjectMap;

    invoke-virtual {v8, p1, v5}, Landroidx/collection/MutableIntObjectMap;->set(ILjava/lang/Object;)V

    .line 118
    .end local v1    # "key":Ljava/lang/Object;
    .end local v2    # "contentType":Ljava/lang/Object;
    .end local v3    # "itemContent":Lkotlin/jvm/functions/Function2;
    .end local v4    # "measurables":Ljava/util/List;
    .end local v5    # "it":Ljava/util/List;
    .end local v7    # "$i$a$-also-LazyLayoutMeasureScopeImpl$measure$2":I
    :goto_1
    return-object v6
.end method

.method public roundToPx--R2X_6o(J)I
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScopeImpl;->subcomposeMeasureScope:Landroidx/compose/ui/layout/SubcomposeMeasureScope;

    invoke-interface {v0, p1, p2}, Landroidx/compose/ui/layout/SubcomposeMeasureScope;->roundToPx--R2X_6o(J)I

    move-result v0

    return v0
.end method

.method public roundToPx-0680j_4(F)I
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScopeImpl;->subcomposeMeasureScope:Landroidx/compose/ui/layout/SubcomposeMeasureScope;

    invoke-interface {v0, p1}, Landroidx/compose/ui/layout/SubcomposeMeasureScope;->roundToPx-0680j_4(F)I

    move-result v0

    return v0
.end method

.method public toDp-GaN1DYA(J)F
    .locals 2
    .param p1, "$this$toDp_u2dGaN1DYA"    # J

    .line 131
    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScopeImpl;->subcomposeMeasureScope:Landroidx/compose/ui/layout/SubcomposeMeasureScope;

    .line 148
    .local v0, "$this$toDp_GaN1DYA_u24lambda_u242":Landroidx/compose/ui/layout/SubcomposeMeasureScope;
    const/4 v1, 0x0

    .line 131
    .local v1, "$i$a$-with-LazyLayoutMeasureScopeImpl$toDp$1":I
    invoke-interface {v0, p1, p2}, Landroidx/compose/ui/layout/SubcomposeMeasureScope;->toDp-GaN1DYA(J)F

    move-result v0

    .end local v0    # "$this$toDp_GaN1DYA_u24lambda_u242":Landroidx/compose/ui/layout/SubcomposeMeasureScope;
    .end local v1    # "$i$a$-with-LazyLayoutMeasureScopeImpl$toDp$1":I
    return v0
.end method

.method public toDp-u2uoSUM(F)F
    .locals 2
    .param p1, "$this$toDp_u2du2uoSUM"    # F

    .line 135
    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScopeImpl;->subcomposeMeasureScope:Landroidx/compose/ui/layout/SubcomposeMeasureScope;

    .line 148
    .local v0, "$this$toDp_u2uoSUM_u24lambda_u244":Landroidx/compose/ui/layout/SubcomposeMeasureScope;
    const/4 v1, 0x0

    .line 135
    .local v1, "$i$a$-with-LazyLayoutMeasureScopeImpl$toDp$3":I
    invoke-interface {v0, p1}, Landroidx/compose/ui/layout/SubcomposeMeasureScope;->toDp-u2uoSUM(F)F

    move-result v0

    .end local v0    # "$this$toDp_u2uoSUM_u24lambda_u244":Landroidx/compose/ui/layout/SubcomposeMeasureScope;
    .end local v1    # "$i$a$-with-LazyLayoutMeasureScopeImpl$toDp$3":I
    return v0
.end method

.method public toDp-u2uoSUM(I)F
    .locals 2
    .param p1, "$this$toDp_u2du2uoSUM"    # I

    .line 133
    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScopeImpl;->subcomposeMeasureScope:Landroidx/compose/ui/layout/SubcomposeMeasureScope;

    .line 148
    .local v0, "$this$toDp_u2uoSUM_u24lambda_u243":Landroidx/compose/ui/layout/SubcomposeMeasureScope;
    const/4 v1, 0x0

    .line 133
    .local v1, "$i$a$-with-LazyLayoutMeasureScopeImpl$toDp$2":I
    invoke-interface {v0, p1}, Landroidx/compose/ui/layout/SubcomposeMeasureScope;->toDp-u2uoSUM(I)F

    move-result v0

    .end local v0    # "$this$toDp_u2uoSUM_u24lambda_u243":Landroidx/compose/ui/layout/SubcomposeMeasureScope;
    .end local v1    # "$i$a$-with-LazyLayoutMeasureScopeImpl$toDp$2":I
    return v0
.end method

.method public toDpSize-k-rfVVM(J)J
    .locals 2
    .param p1, "$this$toDpSize_u2dk_u2drfVVM"    # J

    .line 145
    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScopeImpl;->subcomposeMeasureScope:Landroidx/compose/ui/layout/SubcomposeMeasureScope;

    .line 148
    .local v0, "$this$toDpSize_k_rfVVM_u24lambda_u249":Landroidx/compose/ui/layout/SubcomposeMeasureScope;
    const/4 v1, 0x0

    .line 145
    .local v1, "$i$a$-with-LazyLayoutMeasureScopeImpl$toDpSize$1":I
    invoke-interface {v0, p1, p2}, Landroidx/compose/ui/layout/SubcomposeMeasureScope;->toDpSize-k-rfVVM(J)J

    move-result-wide v0

    .end local v0    # "$this$toDpSize_k_rfVVM_u24lambda_u249":Landroidx/compose/ui/layout/SubcomposeMeasureScope;
    .end local v1    # "$i$a$-with-LazyLayoutMeasureScopeImpl$toDpSize$1":I
    return-wide v0
.end method

.method public toPx--R2X_6o(J)F
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScopeImpl;->subcomposeMeasureScope:Landroidx/compose/ui/layout/SubcomposeMeasureScope;

    invoke-interface {v0, p1, p2}, Landroidx/compose/ui/layout/SubcomposeMeasureScope;->toPx--R2X_6o(J)F

    move-result v0

    return v0
.end method

.method public toPx-0680j_4(F)F
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScopeImpl;->subcomposeMeasureScope:Landroidx/compose/ui/layout/SubcomposeMeasureScope;

    invoke-interface {v0, p1}, Landroidx/compose/ui/layout/SubcomposeMeasureScope;->toPx-0680j_4(F)F

    move-result v0

    return v0
.end method

.method public toRect(Landroidx/compose/ui/unit/DpRect;)Landroidx/compose/ui/geometry/Rect;
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScopeImpl;->subcomposeMeasureScope:Landroidx/compose/ui/layout/SubcomposeMeasureScope;

    invoke-interface {v0, p1}, Landroidx/compose/ui/layout/SubcomposeMeasureScope;->toRect(Landroidx/compose/ui/unit/DpRect;)Landroidx/compose/ui/geometry/Rect;

    move-result-object v0

    return-object v0
.end method

.method public toSize-XkaWNTQ(J)J
    .locals 2
    .param p1, "$this$toSize_u2dXkaWNTQ"    # J

    .line 143
    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScopeImpl;->subcomposeMeasureScope:Landroidx/compose/ui/layout/SubcomposeMeasureScope;

    .line 148
    .local v0, "$this$toSize_XkaWNTQ_u24lambda_u248":Landroidx/compose/ui/layout/SubcomposeMeasureScope;
    const/4 v1, 0x0

    .line 143
    .local v1, "$i$a$-with-LazyLayoutMeasureScopeImpl$toSize$1":I
    invoke-interface {v0, p1, p2}, Landroidx/compose/ui/layout/SubcomposeMeasureScope;->toSize-XkaWNTQ(J)J

    move-result-wide v0

    .end local v0    # "$this$toSize_XkaWNTQ_u24lambda_u248":Landroidx/compose/ui/layout/SubcomposeMeasureScope;
    .end local v1    # "$i$a$-with-LazyLayoutMeasureScopeImpl$toSize$1":I
    return-wide v0
.end method

.method public toSp-0xMU5do(F)J
    .locals 2
    .param p1, "$this$toSp_u2d0xMU5do"    # F

    .line 141
    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScopeImpl;->subcomposeMeasureScope:Landroidx/compose/ui/layout/SubcomposeMeasureScope;

    .line 148
    .local v0, "$this$toSp_0xMU5do_u24lambda_u247":Landroidx/compose/ui/layout/SubcomposeMeasureScope;
    const/4 v1, 0x0

    .line 141
    .local v1, "$i$a$-with-LazyLayoutMeasureScopeImpl$toSp$3":I
    invoke-interface {v0, p1}, Landroidx/compose/ui/layout/SubcomposeMeasureScope;->toSp-0xMU5do(F)J

    move-result-wide v0

    .end local v0    # "$this$toSp_0xMU5do_u24lambda_u247":Landroidx/compose/ui/layout/SubcomposeMeasureScope;
    .end local v1    # "$i$a$-with-LazyLayoutMeasureScopeImpl$toSp$3":I
    return-wide v0
.end method

.method public toSp-kPz2Gy4(F)J
    .locals 2
    .param p1, "$this$toSp_u2dkPz2Gy4"    # F

    .line 137
    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScopeImpl;->subcomposeMeasureScope:Landroidx/compose/ui/layout/SubcomposeMeasureScope;

    .line 148
    .local v0, "$this$toSp_kPz2Gy4_u24lambda_u245":Landroidx/compose/ui/layout/SubcomposeMeasureScope;
    const/4 v1, 0x0

    .line 137
    .local v1, "$i$a$-with-LazyLayoutMeasureScopeImpl$toSp$1":I
    invoke-interface {v0, p1}, Landroidx/compose/ui/layout/SubcomposeMeasureScope;->toSp-kPz2Gy4(F)J

    move-result-wide v0

    .end local v0    # "$this$toSp_kPz2Gy4_u24lambda_u245":Landroidx/compose/ui/layout/SubcomposeMeasureScope;
    .end local v1    # "$i$a$-with-LazyLayoutMeasureScopeImpl$toSp$1":I
    return-wide v0
.end method

.method public toSp-kPz2Gy4(I)J
    .locals 2
    .param p1, "$this$toSp_u2dkPz2Gy4"    # I

    .line 139
    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScopeImpl;->subcomposeMeasureScope:Landroidx/compose/ui/layout/SubcomposeMeasureScope;

    .line 148
    .local v0, "$this$toSp_kPz2Gy4_u24lambda_u246":Landroidx/compose/ui/layout/SubcomposeMeasureScope;
    const/4 v1, 0x0

    .line 139
    .local v1, "$i$a$-with-LazyLayoutMeasureScopeImpl$toSp$2":I
    invoke-interface {v0, p1}, Landroidx/compose/ui/layout/SubcomposeMeasureScope;->toSp-kPz2Gy4(I)J

    move-result-wide v0

    .end local v0    # "$this$toSp_kPz2Gy4_u24lambda_u246":Landroidx/compose/ui/layout/SubcomposeMeasureScope;
    .end local v1    # "$i$a$-with-LazyLayoutMeasureScopeImpl$toSp$2":I
    return-wide v0
.end method
