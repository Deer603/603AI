.class final Landroidx/compose/material3/SliderDefaults$Track$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "Slider.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material3/SliderDefaults;->Track(Landroidx/compose/material3/SliderPositions;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SliderColors;ZLandroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Landroidx/compose/ui/graphics/drawscope/DrawScope;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderDefaults$Track$1$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,2263:1\n10843#2:2264\n11093#2,3:2265\n11096#2,3:2275\n361#3,7:2268\n215#4:2278\n216#4:2290\n151#5,3:2279\n33#5,4:2282\n154#5,2:2286\n38#5:2288\n156#5:2289\n*S KotlinDebug\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderDefaults$Track$1$1\n*L\n1036#1:2264\n1036#1:2265,3\n1036#1:2275,3\n1036#1:2268,7\n1040#1:2278\n1040#1:2290\n1042#1:2279,3\n1042#1:2282,4\n1042#1:2286,2\n1042#1:2288\n1042#1:2289\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n\u00a2\u0006\u0002\u0008\u0003"
    }
    d2 = {
        "<anonymous>",
        "",
        "Landroidx/compose/ui/graphics/drawscope/DrawScope;",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $activeTickColor:J

.field final synthetic $activeTrackColor:J

.field final synthetic $inactiveTickColor:J

.field final synthetic $inactiveTrackColor:J

.field final synthetic $sliderPositions:Landroidx/compose/material3/SliderPositions;


# direct methods
.method constructor <init>(JLandroidx/compose/material3/SliderPositions;JJJ)V
    .locals 1

    iput-wide p1, p0, Landroidx/compose/material3/SliderDefaults$Track$1$1;->$inactiveTrackColor:J

    iput-object p3, p0, Landroidx/compose/material3/SliderDefaults$Track$1$1;->$sliderPositions:Landroidx/compose/material3/SliderPositions;

    iput-wide p4, p0, Landroidx/compose/material3/SliderDefaults$Track$1$1;->$activeTrackColor:J

    iput-wide p6, p0, Landroidx/compose/material3/SliderDefaults$Track$1$1;->$inactiveTickColor:J

    iput-wide p8, p0, Landroidx/compose/material3/SliderDefaults$Track$1$1;->$activeTickColor:J

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p1, "p1"    # Ljava/lang/Object;

    .line 1005
    move-object v0, p1

    check-cast v0, Landroidx/compose/ui/graphics/drawscope/DrawScope;

    invoke-virtual {p0, v0}, Landroidx/compose/material3/SliderDefaults$Track$1$1;->invoke(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V
    .locals 43
    .param p1, "$this$Canvas"    # Landroidx/compose/ui/graphics/drawscope/DrawScope;

    .line 1006
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-interface {v1}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;

    move-result-object v2

    sget-object v3, Landroidx/compose/ui/unit/LayoutDirection;->Rtl:Landroidx/compose/ui/unit/LayoutDirection;

    const/16 v16, 0x0

    const/16 v17, 0x1

    if-ne v2, v3, :cond_0

    move/from16 v2, v17

    goto :goto_0

    :cond_0
    move/from16 v2, v16

    :goto_0
    move/from16 v18, v2

    .line 1007
    .local v18, "isRtl":Z
    invoke-interface {v1}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getCenter-F1C5BW0()J

    move-result-wide v2

    invoke-static {v2, v3}, Landroidx/compose/ui/geometry/Offset;->getY-impl(J)F

    move-result v2

    const/4 v3, 0x0

    invoke-static {v3, v2}, Landroidx/compose/ui/geometry/OffsetKt;->Offset(FF)J

    move-result-wide v19

    .line 1008
    .local v19, "sliderLeft":J
    invoke-interface {v1}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getSize-NH-jbRc()J

    move-result-wide v2

    invoke-static {v2, v3}, Landroidx/compose/ui/geometry/Size;->getWidth-impl(J)F

    move-result v2

    invoke-interface {v1}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getCenter-F1C5BW0()J

    move-result-wide v3

    invoke-static {v3, v4}, Landroidx/compose/ui/geometry/Offset;->getY-impl(J)F

    move-result v3

    invoke-static {v2, v3}, Landroidx/compose/ui/geometry/OffsetKt;->Offset(FF)J

    move-result-wide v21

    .line 1009
    .local v21, "sliderRight":J
    if-eqz v18, :cond_1

    move-wide/from16 v4, v21

    goto :goto_1

    :cond_1
    move-wide/from16 v4, v19

    .line 1010
    .local v4, "sliderStart":J
    :goto_1
    if-eqz v18, :cond_2

    move-wide/from16 v6, v19

    goto :goto_2

    :cond_2
    move-wide/from16 v6, v21

    .line 1011
    .local v6, "sliderEnd":J
    :goto_2
    sget-object v2, Landroidx/compose/material3/SliderDefaults;->INSTANCE:Landroidx/compose/material3/SliderDefaults;

    invoke-virtual {v2}, Landroidx/compose/material3/SliderDefaults;->getTickSize-D9Ej5fM()F

    move-result v2

    invoke-interface {v1, v2}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->toPx-0680j_4(F)F

    move-result v23

    .line 1012
    .local v23, "tickSize":F
    invoke-static {}, Landroidx/compose/material3/SliderKt;->getTrackHeight()F

    move-result v2

    invoke-interface {v1, v2}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->toPx-0680j_4(F)F

    move-result v8

    .line 1013
    .local v8, "trackStrokeWidth":F
    iget-wide v2, v0, Landroidx/compose/material3/SliderDefaults$Track$1$1;->$inactiveTrackColor:J

    sget-object v9, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    invoke-virtual {v9}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getRound-KaPHkGw()I

    move-result v9

    const/16 v14, 0x1e0

    const/4 v15, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v1 .. v15}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->drawLine-NGM6Ib0$default(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;IILjava/lang/Object;)V

    .line 1016
    invoke-static {v4, v5}, Landroidx/compose/ui/geometry/Offset;->getX-impl(J)F

    move-result v1

    .line 1017
    invoke-static {v6, v7}, Landroidx/compose/ui/geometry/Offset;->getX-impl(J)F

    move-result v2

    invoke-static {v4, v5}, Landroidx/compose/ui/geometry/Offset;->getX-impl(J)F

    move-result v3

    sub-float/2addr v2, v3

    iget-object v3, v0, Landroidx/compose/material3/SliderDefaults$Track$1$1;->$sliderPositions:Landroidx/compose/material3/SliderPositions;

    invoke-virtual {v3}, Landroidx/compose/material3/SliderPositions;->getActiveRange()Lkotlin/ranges/ClosedFloatingPointRange;

    move-result-object v3

    invoke-interface {v3}, Lkotlin/ranges/ClosedFloatingPointRange;->getEndInclusive()Ljava/lang/Comparable;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    move-result v3

    mul-float/2addr v2, v3

    .line 1016
    add-float/2addr v1, v2

    .line 1018
    invoke-interface/range {p1 .. p1}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getCenter-F1C5BW0()J

    move-result-wide v2

    invoke-static {v2, v3}, Landroidx/compose/ui/geometry/Offset;->getY-impl(J)F

    move-result v2

    .line 1015
    invoke-static {v1, v2}, Landroidx/compose/ui/geometry/OffsetKt;->Offset(FF)J

    move-result-wide v1

    .line 1014
    nop

    .line 1023
    .local v1, "sliderValueEnd":J
    invoke-static {v4, v5}, Landroidx/compose/ui/geometry/Offset;->getX-impl(J)F

    move-result v3

    .line 1024
    invoke-static {v6, v7}, Landroidx/compose/ui/geometry/Offset;->getX-impl(J)F

    move-result v9

    invoke-static {v4, v5}, Landroidx/compose/ui/geometry/Offset;->getX-impl(J)F

    move-result v10

    sub-float/2addr v9, v10

    iget-object v10, v0, Landroidx/compose/material3/SliderDefaults$Track$1$1;->$sliderPositions:Landroidx/compose/material3/SliderPositions;

    invoke-virtual {v10}, Landroidx/compose/material3/SliderPositions;->getActiveRange()Lkotlin/ranges/ClosedFloatingPointRange;

    move-result-object v10

    invoke-interface {v10}, Lkotlin/ranges/ClosedFloatingPointRange;->getStart()Ljava/lang/Comparable;

    move-result-object v10

    check-cast v10, Ljava/lang/Number;

    invoke-virtual {v10}, Ljava/lang/Number;->floatValue()F

    move-result v10

    mul-float/2addr v9, v10

    .line 1023
    add-float/2addr v3, v9

    .line 1025
    invoke-interface/range {p1 .. p1}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getCenter-F1C5BW0()J

    move-result-wide v9

    invoke-static {v9, v10}, Landroidx/compose/ui/geometry/Offset;->getY-impl(J)F

    move-result v9

    .line 1022
    invoke-static {v3, v9}, Landroidx/compose/ui/geometry/OffsetKt;->Offset(FF)J

    move-result-wide v9

    .line 1021
    nop

    .line 1028
    .local v9, "sliderValueStart":J
    nop

    .line 1029
    move-wide v11, v6

    move-wide v6, v1

    .end local v1    # "sliderValueEnd":J
    .local v6, "sliderValueEnd":J
    .local v11, "sliderEnd":J
    iget-wide v2, v0, Landroidx/compose/material3/SliderDefaults$Track$1$1;->$activeTrackColor:J

    .line 1030
    nop

    .line 1031
    nop

    .line 1032
    nop

    .line 1033
    sget-object v1, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    invoke-virtual {v1}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getRound-KaPHkGw()I

    move-result v1

    .line 1028
    move-wide/from16 v24, v4

    move-wide v4, v9

    .end local v9    # "sliderValueStart":J
    .local v4, "sliderValueStart":J
    .local v24, "sliderStart":J
    const/4 v10, 0x0

    move-wide v12, v11

    .end local v11    # "sliderEnd":J
    .local v12, "sliderEnd":J
    const/4 v11, 0x0

    move-wide/from16 v26, v12

    .end local v12    # "sliderEnd":J
    .local v26, "sliderEnd":J
    const/4 v12, 0x0

    const/4 v13, 0x0

    move v9, v1

    move-wide/from16 v28, v24

    move-wide/from16 v30, v26

    move-object/from16 v1, p1

    .end local v24    # "sliderStart":J
    .end local v26    # "sliderEnd":J
    .local v28, "sliderStart":J
    .local v30, "sliderEnd":J
    invoke-static/range {v1 .. v15}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->drawLine-NGM6Ib0$default(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;IILjava/lang/Object;)V

    .line 1035
    move-wide/from16 v26, v4

    move-wide/from16 v24, v6

    move v14, v8

    .end local v4    # "sliderValueStart":J
    .end local v6    # "sliderValueEnd":J
    .end local v8    # "trackStrokeWidth":F
    .local v14, "trackStrokeWidth":F
    .local v24, "sliderValueEnd":J
    .local v26, "sliderValueStart":J
    iget-object v1, v0, Landroidx/compose/material3/SliderDefaults$Track$1$1;->$sliderPositions:Landroidx/compose/material3/SliderPositions;

    invoke-virtual {v1}, Landroidx/compose/material3/SliderPositions;->getTickFractions()[F

    move-result-object v1

    .line 1036
    iget-object v2, v0, Landroidx/compose/material3/SliderDefaults$Track$1$1;->$sliderPositions:Landroidx/compose/material3/SliderPositions;

    .local v1, "$this$groupBy$iv":[F
    const/4 v3, 0x0

    .line 2264
    .local v3, "$i$f$groupBy":I
    new-instance v4, Ljava/util/LinkedHashMap;

    invoke-direct {v4}, Ljava/util/LinkedHashMap;-><init>()V

    check-cast v4, Ljava/util/Map;

    .local v4, "destination$iv$iv":Ljava/util/Map;
    move-object v5, v1

    .local v5, "$this$groupByTo$iv$iv":[F
    const/4 v6, 0x0

    .line 2265
    .local v6, "$i$f$groupByTo":I
    array-length v7, v5

    move/from16 v8, v16

    :goto_3
    if-ge v8, v7, :cond_6

    aget v9, v5, v8

    .line 2266
    .local v9, "element$iv$iv":F
    move v10, v9

    .local v10, "it":F
    const/4 v11, 0x0

    .line 1037
    .local v11, "$i$a$-groupBy-SliderDefaults$Track$1$1$1":I
    invoke-virtual {v2}, Landroidx/compose/material3/SliderPositions;->getActiveRange()Lkotlin/ranges/ClosedFloatingPointRange;

    move-result-object v12

    invoke-interface {v12}, Lkotlin/ranges/ClosedFloatingPointRange;->getEndInclusive()Ljava/lang/Comparable;

    move-result-object v12

    check-cast v12, Ljava/lang/Number;

    invoke-virtual {v12}, Ljava/lang/Number;->floatValue()F

    move-result v12

    cmpl-float v12, v10, v12

    if-gtz v12, :cond_4

    .line 1038
    invoke-virtual {v2}, Landroidx/compose/material3/SliderPositions;->getActiveRange()Lkotlin/ranges/ClosedFloatingPointRange;

    move-result-object v12

    invoke-interface {v12}, Lkotlin/ranges/ClosedFloatingPointRange;->getStart()Ljava/lang/Comparable;

    move-result-object v12

    check-cast v12, Ljava/lang/Number;

    invoke-virtual {v12}, Ljava/lang/Number;->floatValue()F

    move-result v12

    cmpg-float v12, v10, v12

    if-gez v12, :cond_3

    goto :goto_4

    :cond_3
    move/from16 v12, v16

    goto :goto_5

    :cond_4
    :goto_4
    move/from16 v12, v17

    .line 1037
    :goto_5
    nop

    .end local v10    # "it":F
    .end local v11    # "$i$a$-groupBy-SliderDefaults$Track$1$1$1":I
    invoke-static {v12}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v10

    .line 2266
    nop

    .line 2267
    .local v10, "key$iv$iv":Ljava/lang/Object;
    move-object v11, v4

    .local v11, "$this$getOrPut$iv$iv$iv":Ljava/util/Map;
    const/4 v12, 0x0

    .line 2268
    .local v12, "$i$f$getOrPut":I
    invoke-interface {v11, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    .line 2269
    .local v13, "value$iv$iv$iv":Ljava/lang/Object;
    if-nez v13, :cond_5

    .line 2270
    const/4 v15, 0x0

    .line 2267
    .local v15, "$i$a$-getOrPut-ArraysKt___ArraysKt$groupByTo$list$6$iv$iv":I
    new-instance v32, Ljava/util/ArrayList;

    invoke-direct/range {v32 .. v32}, Ljava/util/ArrayList;-><init>()V

    check-cast v32, Ljava/util/List;

    .line 2270
    .end local v15    # "$i$a$-getOrPut-ArraysKt___ArraysKt$groupByTo$list$6$iv$iv":I
    move-object/from16 v15, v32

    .line 2271
    .local v15, "answer$iv$iv$iv":Ljava/lang/Object;
    invoke-interface {v11, v10, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2272
    nop

    .end local v15    # "answer$iv$iv$iv":Ljava/lang/Object;
    goto :goto_6

    .line 2274
    :cond_5
    move-object v15, v13

    .line 2269
    :goto_6
    nop

    .line 2267
    .end local v11    # "$this$getOrPut$iv$iv$iv":Ljava/util/Map;
    .end local v12    # "$i$f$getOrPut":I
    .end local v13    # "value$iv$iv$iv":Ljava/lang/Object;
    move-object v11, v15

    check-cast v11, Ljava/util/List;

    .line 2275
    .local v11, "list$iv$iv":Ljava/util/List;
    invoke-static {v9}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v12

    invoke-interface {v11, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2265
    .end local v9    # "element$iv$iv":F
    .end local v10    # "key$iv$iv":Ljava/lang/Object;
    .end local v11    # "list$iv$iv":Ljava/util/List;
    add-int/lit8 v8, v8, 0x1

    goto :goto_3

    .line 2277
    :cond_6
    nop

    .line 2264
    .end local v4    # "destination$iv$iv":Ljava/util/Map;
    .end local v5    # "$this$groupByTo$iv$iv":[F
    .end local v6    # "$i$f$groupByTo":I
    nop

    .line 1040
    .end local v1    # "$this$groupBy$iv":[F
    .end local v3    # "$i$f$groupBy":I
    iget-wide v1, v0, Landroidx/compose/material3/SliderDefaults$Track$1$1;->$inactiveTickColor:J

    iget-wide v5, v0, Landroidx/compose/material3/SliderDefaults$Track$1$1;->$activeTickColor:J

    move-object v15, v4

    .local v15, "$this$forEach$iv":Ljava/util/Map;
    const/16 v16, 0x0

    .line 2278
    .local v16, "$i$f$forEach":I
    invoke-interface {v15}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v17

    :goto_7
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_9

    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v32, v3

    check-cast v32, Ljava/util/Map$Entry;

    .local v32, "element$iv":Ljava/util/Map$Entry;
    const/16 v33, 0x0

    .line 1040
    .local v33, "$i$a$-forEach-SliderDefaults$Track$1$1$2":I
    invoke-interface/range {v32 .. v32}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v34

    .local v34, "outsideFraction":Z
    invoke-interface/range {v32 .. v32}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v35, v3

    check-cast v35, Ljava/util/List;

    .line 1041
    .local v35, "list":Ljava/util/List;
    nop

    .line 1042
    move-object/from16 v3, v35

    .local v3, "$this$fastMap$iv":Ljava/util/List;
    const/4 v4, 0x0

    .line 2279
    .local v4, "$i$f$fastMap":I
    nop

    .line 2280
    new-instance v7, Ljava/util/ArrayList;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v8

    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 2281
    .local v7, "target$iv":Ljava/util/ArrayList;
    move-object v8, v3

    .local v8, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v9, 0x0

    .line 2282
    .local v9, "$i$f$fastForEach":I
    nop

    .line 2283
    const/4 v10, 0x0

    .local v10, "index$iv$iv":I
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v11

    :goto_8
    if-ge v10, v11, :cond_7

    .line 2284
    invoke-interface {v8, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    .line 2285
    .local v12, "item$iv$iv":Ljava/lang/Object;
    move-object v13, v12

    .local v13, "it$iv":Ljava/lang/Object;
    const/16 v36, 0x0

    .line 2286
    .local v36, "$i$a$-fastForEach-ListUtilsKt$fastMap$2$iv":I
    move-object v0, v7

    check-cast v0, Ljava/util/Collection;

    move-object/from16 v37, v13

    check-cast v37, Ljava/lang/Number;

    move-wide/from16 v38, v1

    invoke-virtual/range {v37 .. v37}, Ljava/lang/Number;->floatValue()F

    move-result v1

    .local v1, "it":F
    const/4 v2, 0x0

    .line 1042
    .local v2, "$i$a$-fastMap-SliderDefaults$Track$1$1$2$1":I
    move-object/from16 v37, v8

    move/from16 v40, v9

    move-wide/from16 v8, v28

    move/from16 v29, v10

    move/from16 v28, v11

    move-wide/from16 v10, v30

    .end local v9    # "$i$f$fastForEach":I
    .end local v28    # "sliderStart":J
    .end local v30    # "sliderEnd":J
    .local v8, "sliderStart":J
    .local v10, "sliderEnd":J
    .local v29, "index$iv$iv":I
    .local v37, "$this$fastForEach$iv$iv":Ljava/util/List;
    .local v40, "$i$f$fastForEach":I
    invoke-static {v8, v9, v10, v11, v1}, Landroidx/compose/ui/geometry/OffsetKt;->lerp-Wko1d7g(JJF)J

    move-result-wide v30

    move/from16 v41, v1

    .end local v1    # "it":F
    .local v41, "it":F
    invoke-static/range {v30 .. v31}, Landroidx/compose/ui/geometry/Offset;->getX-impl(J)F

    move-result v1

    invoke-interface/range {p1 .. p1}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getCenter-F1C5BW0()J

    move-result-wide v30

    move/from16 v42, v2

    .end local v2    # "$i$a$-fastMap-SliderDefaults$Track$1$1$2$1":I
    .local v42, "$i$a$-fastMap-SliderDefaults$Track$1$1$2$1":I
    invoke-static/range {v30 .. v31}, Landroidx/compose/ui/geometry/Offset;->getY-impl(J)F

    move-result v2

    invoke-static {v1, v2}, Landroidx/compose/ui/geometry/OffsetKt;->Offset(FF)J

    move-result-wide v1

    .end local v41    # "it":F
    .end local v42    # "$i$a$-fastMap-SliderDefaults$Track$1$1$2$1":I
    invoke-static {v1, v2}, Landroidx/compose/ui/geometry/Offset;->box-impl(J)Landroidx/compose/ui/geometry/Offset;

    move-result-object v1

    .line 2286
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 2287
    nop

    .line 2285
    .end local v13    # "it$iv":Ljava/lang/Object;
    .end local v36    # "$i$a$-fastForEach-ListUtilsKt$fastMap$2$iv":I
    nop

    .line 2283
    .end local v12    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v0, v29, 0x1

    move-wide/from16 v30, v10

    move/from16 v11, v28

    move-wide/from16 v1, v38

    move v10, v0

    move-wide/from16 v28, v8

    move-object/from16 v8, v37

    move/from16 v9, v40

    move-object/from16 v0, p0

    .end local v29    # "index$iv$iv":I
    .local v0, "index$iv$iv":I
    goto :goto_8

    .end local v0    # "index$iv$iv":I
    .end local v37    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v40    # "$i$f$fastForEach":I
    .local v8, "$this$fastForEach$iv$iv":Ljava/util/List;
    .restart local v9    # "$i$f$fastForEach":I
    .local v10, "index$iv$iv":I
    .restart local v28    # "sliderStart":J
    .restart local v30    # "sliderEnd":J
    :cond_7
    move-wide/from16 v38, v1

    move-object/from16 v37, v8

    move/from16 v40, v9

    move-wide/from16 v8, v28

    move/from16 v29, v10

    move-wide/from16 v10, v30

    .line 2288
    .end local v9    # "$i$f$fastForEach":I
    .end local v28    # "sliderStart":J
    .end local v30    # "sliderEnd":J
    .local v8, "sliderStart":J
    .local v10, "sliderEnd":J
    .restart local v37    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .restart local v40    # "$i$f$fastForEach":I
    nop

    .line 2289
    .end local v37    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v40    # "$i$f$fastForEach":I
    move-object v2, v7

    check-cast v2, Ljava/util/List;

    .line 1043
    .end local v3    # "$this$fastMap$iv":Ljava/util/List;
    .end local v4    # "$i$f$fastMap":I
    .end local v7    # "target$iv":Ljava/util/ArrayList;
    sget-object v0, Landroidx/compose/ui/graphics/PointMode;->Companion:Landroidx/compose/ui/graphics/PointMode$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/graphics/PointMode$Companion;->getPoints-r_lszbg()I

    move-result v3

    .line 1044
    move-wide v0, v5

    if-eqz v34, :cond_8

    move-wide/from16 v4, v38

    goto :goto_9

    :cond_8
    move-wide v4, v0

    .line 1045
    :goto_9
    nop

    .line 1046
    sget-object v6, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    invoke-virtual {v6}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getRound-KaPHkGw()I

    move-result v7

    .line 1041
    const/16 v12, 0x1e0

    const/4 v13, 0x0

    move-wide/from16 v28, v8

    .end local v8    # "sliderStart":J
    .restart local v28    # "sliderStart":J
    const/4 v8, 0x0

    const/4 v9, 0x0

    move-wide/from16 v30, v10

    .end local v10    # "sliderEnd":J
    .restart local v30    # "sliderEnd":J
    const/4 v10, 0x0

    const/4 v11, 0x0

    move-wide/from16 v36, v0

    move/from16 v6, v23

    move-object/from16 v1, p1

    .end local v23    # "tickSize":F
    .local v6, "tickSize":F
    invoke-static/range {v1 .. v13}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->drawPoints-F8ZwMP8$default(Landroidx/compose/ui/graphics/drawscope/DrawScope;Ljava/util/List;IJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;IILjava/lang/Object;)V

    .line 1048
    nop

    .line 2278
    .end local v33    # "$i$a$-forEach-SliderDefaults$Track$1$1$2":I
    .end local v34    # "outsideFraction":Z
    .end local v35    # "list":Ljava/util/List;
    move-object/from16 v0, p0

    move-wide/from16 v5, v36

    move-wide/from16 v1, v38

    .end local v32    # "element$iv":Ljava/util/Map$Entry;
    goto/16 :goto_7

    .line 2290
    .end local v6    # "tickSize":F
    .restart local v23    # "tickSize":F
    :cond_9
    nop

    .line 1049
    .end local v15    # "$this$forEach$iv":Ljava/util/Map;
    .end local v16    # "$i$f$forEach":I
    return-void
.end method
