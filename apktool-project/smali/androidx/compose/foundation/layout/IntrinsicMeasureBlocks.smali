.class public final Landroidx/compose/foundation/layout/IntrinsicMeasureBlocks;
.super Ljava/lang/Object;
.source "RowColumnImpl.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nRowColumnImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RowColumnImpl.kt\nandroidx/compose/foundation/layout/IntrinsicMeasureBlocks\n+ 2 RowColumnImpl.kt\nandroidx/compose/foundation/layout/RowColumnImplKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,707:1\n421#2,5:708\n426#2,7:717\n434#2:725\n435#2,3:727\n447#2,5:730\n452#2,15:739\n470#2,6:755\n469#2,27:762\n447#2,5:789\n452#2,15:798\n470#2,6:814\n469#2,27:821\n421#2,5:848\n426#2,7:857\n434#2:865\n435#2,3:867\n421#2,5:870\n426#2,7:879\n434#2:887\n435#2,3:889\n447#2,5:892\n452#2,15:901\n470#2,6:917\n469#2,27:924\n447#2,5:951\n452#2,15:960\n470#2,6:976\n469#2,27:983\n421#2,5:1010\n426#2,7:1019\n434#2:1027\n435#2,3:1029\n34#3,4:713\n39#3:726\n34#3,4:735\n39#3:754\n34#3,4:794\n39#3:813\n34#3,4:853\n39#3:866\n34#3,4:875\n39#3:888\n34#3,4:897\n39#3:916\n34#3,4:956\n39#3:975\n34#3,4:1015\n39#3:1028\n26#4:724\n26#4:761\n26#4:820\n26#4:864\n26#4:886\n26#4:923\n26#4:982\n26#4:1026\n*S KotlinDebug\n*F\n+ 1 RowColumnImpl.kt\nandroidx/compose/foundation/layout/IntrinsicMeasureBlocks\n*L\n311#1:708,5\n311#1:717,7\n311#1:725\n311#1:727,3\n324#1:730,5\n324#1:739,15\n324#1:755,6\n324#1:762,27\n338#1:789,5\n338#1:798,15\n338#1:814,6\n338#1:821,27\n352#1:848,5\n352#1:857,7\n352#1:865\n352#1:867,3\n365#1:870,5\n365#1:879,7\n365#1:887\n365#1:889,3\n378#1:892,5\n378#1:901,15\n378#1:917,6\n378#1:924,27\n392#1:951,5\n392#1:960,15\n392#1:976,6\n392#1:983,27\n406#1:1010,5\n406#1:1019,7\n406#1:1027\n406#1:1029,3\n311#1:713,4\n311#1:726\n324#1:735,4\n324#1:754\n338#1:794,4\n338#1:813\n352#1:853,4\n352#1:866\n365#1:875,4\n365#1:888\n378#1:897,4\n378#1:916\n392#1:956,4\n392#1:975\n406#1:1015,4\n406#1:1028\n311#1:724\n324#1:761\n338#1:820\n352#1:864\n365#1:886\n378#1:923\n392#1:982\n406#1:1026\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0008\u00c0\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\u00020\u00042\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0008\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004J$\u0010\n\u001a\u00020\u00042\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004J$\u0010\u000c\u001a\u00020\u00042\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0008\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004J$\u0010\r\u001a\u00020\u00042\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004J$\u0010\u000e\u001a\u00020\u00042\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0008\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004J$\u0010\u000f\u001a\u00020\u00042\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004J$\u0010\u0010\u001a\u00020\u00042\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0008\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004J$\u0010\u0011\u001a\u00020\u00042\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004\u00a8\u0006\u0012"
    }
    d2 = {
        "Landroidx/compose/foundation/layout/IntrinsicMeasureBlocks;",
        "",
        "()V",
        "HorizontalMaxHeight",
        "",
        "measurables",
        "",
        "Landroidx/compose/ui/layout/IntrinsicMeasurable;",
        "availableWidth",
        "mainAxisSpacing",
        "HorizontalMaxWidth",
        "availableHeight",
        "HorizontalMinHeight",
        "HorizontalMinWidth",
        "VerticalMaxHeight",
        "VerticalMaxWidth",
        "VerticalMinHeight",
        "VerticalMinWidth",
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

.field public static final INSTANCE:Landroidx/compose/foundation/layout/IntrinsicMeasureBlocks;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/foundation/layout/IntrinsicMeasureBlocks;

    invoke-direct {v0}, Landroidx/compose/foundation/layout/IntrinsicMeasureBlocks;-><init>()V

    sput-object v0, Landroidx/compose/foundation/layout/IntrinsicMeasureBlocks;->INSTANCE:Landroidx/compose/foundation/layout/IntrinsicMeasureBlocks;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 305
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final HorizontalMaxHeight(Ljava/util/List;II)I
    .locals 19
    .param p1, "measurables"    # Ljava/util/List;
    .param p2, "availableWidth"    # I
    .param p3, "mainAxisSpacing"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/ui/layout/IntrinsicMeasurable;",
            ">;II)I"
        }
    .end annotation

    .line 392
    move/from16 v0, p2

    const/4 v1, 0x0

    .line 951
    .local v1, "$i$f$intrinsicCrossAxisSize":I
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v3, 0x0

    goto/16 :goto_8

    .line 952
    :cond_0
    const/4 v2, 0x0

    .local v2, "fixedSpace$iv":I
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v4

    const/4 v5, 0x1

    sub-int/2addr v4, v5

    mul-int v4, v4, p3

    invoke-static {v4, v0}, Ljava/lang/Math;->min(II)I

    move-result v2

    .line 953
    const/4 v4, 0x0

    .line 954
    .local v4, "crossAxisMax$iv":I
    const/4 v6, 0x0

    .line 955
    .local v6, "totalWeight$iv":F
    move-object/from16 v7, p1

    .local v7, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v8, 0x0

    .line 956
    .local v8, "$i$f$fastForEach":I
    nop

    .line 957
    const/4 v9, 0x0

    .local v9, "index$iv$iv":I
    move-object v10, v7

    check-cast v10, Ljava/util/Collection;

    invoke-interface {v10}, Ljava/util/Collection;->size()I

    move-result v10

    :goto_0
    const/4 v11, 0x0

    const v12, 0x7fffffff

    if-ge v9, v10, :cond_5

    .line 958
    invoke-interface {v7, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    .line 959
    .local v13, "item$iv$iv":Ljava/lang/Object;
    move-object v14, v13

    check-cast v14, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .local v14, "child$iv":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/4 v15, 0x0

    .line 960
    .local v15, "$i$a$-fastForEach-RowColumnImplKt$intrinsicCrossAxisSize$1$iv":I
    invoke-static {v14}, Landroidx/compose/foundation/layout/RowColumnImplKt;->getRowColumnParentData(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Landroidx/compose/foundation/layout/RowColumnParentData;

    move-result-object v16

    invoke-static/range {v16 .. v16}, Landroidx/compose/foundation/layout/RowColumnImplKt;->getWeight(Landroidx/compose/foundation/layout/RowColumnParentData;)F

    move-result v16

    .line 961
    .local v16, "weight$iv":F
    cmpg-float v17, v16, v11

    if-nez v17, :cond_1

    move/from16 v17, v5

    goto :goto_1

    :cond_1
    const/16 v17, 0x0

    :goto_1
    if-eqz v17, :cond_3

    .line 965
    if-ne v0, v12, :cond_2

    goto :goto_2

    .line 966
    :cond_2
    sub-int v12, v0, v2

    .line 965
    :goto_2
    nop

    .line 964
    nop

    .line 967
    .local v12, "remaining$iv":I
    const v11, 0x7fffffff

    .local v11, "h":I
    move-object/from16 v17, v14

    .local v17, "$this$HorizontalMaxHeight_u24lambda_u249":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    move-object/from16 v18, v17

    .end local v17    # "$this$HorizontalMaxHeight_u24lambda_u249":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .local v18, "$this$HorizontalMaxHeight_u24lambda_u249":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/16 v17, 0x0

    .line 394
    .local v17, "$i$a$-intrinsicCrossAxisSize-IntrinsicMeasureBlocks$HorizontalMaxHeight$1":I
    move-object/from16 v5, v18

    .end local v18    # "$this$HorizontalMaxHeight_u24lambda_u249":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .local v5, "$this$HorizontalMaxHeight_u24lambda_u249":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    invoke-interface {v5, v11}, Landroidx/compose/ui/layout/IntrinsicMeasurable;->maxIntrinsicWidth(I)I

    move-result v5

    .line 967
    .end local v5    # "$this$HorizontalMaxHeight_u24lambda_u249":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .end local v11    # "h":I
    .end local v17    # "$i$a$-intrinsicCrossAxisSize-IntrinsicMeasureBlocks$HorizontalMaxHeight$1":I
    invoke-static {v5, v12}, Ljava/lang/Math;->min(II)I

    move-result v5

    .line 968
    .local v5, "mainAxisSpace$iv":I
    add-int/2addr v2, v5

    .line 970
    move v11, v5

    .local v11, "w":I
    move-object/from16 v17, v14

    .local v17, "$this$HorizontalMaxHeight_u24lambda_u2410":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/16 v18, 0x0

    .line 395
    .local v18, "$i$a$-intrinsicCrossAxisSize-IntrinsicMeasureBlocks$HorizontalMaxHeight$2":I
    move-object/from16 v3, v17

    .end local v17    # "$this$HorizontalMaxHeight_u24lambda_u2410":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .local v3, "$this$HorizontalMaxHeight_u24lambda_u2410":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    invoke-interface {v3, v11}, Landroidx/compose/ui/layout/IntrinsicMeasurable;->maxIntrinsicHeight(I)I

    move-result v3

    .line 970
    .end local v3    # "$this$HorizontalMaxHeight_u24lambda_u2410":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .end local v11    # "w":I
    .end local v18    # "$i$a$-intrinsicCrossAxisSize-IntrinsicMeasureBlocks$HorizontalMaxHeight$2":I
    invoke-static {v4, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    move v4, v3

    .end local v4    # "crossAxisMax$iv":I
    .end local v5    # "mainAxisSpace$iv":I
    .end local v12    # "remaining$iv":I
    .local v3, "crossAxisMax$iv":I
    goto :goto_3

    .line 971
    .end local v3    # "crossAxisMax$iv":I
    .restart local v4    # "crossAxisMax$iv":I
    :cond_3
    cmpl-float v3, v16, v11

    if-lez v3, :cond_4

    .line 972
    add-float v6, v6, v16

    .line 974
    :cond_4
    :goto_3
    nop

    .line 959
    .end local v14    # "child$iv":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .end local v15    # "$i$a$-fastForEach-RowColumnImplKt$intrinsicCrossAxisSize$1$iv":I
    .end local v16    # "weight$iv":F
    nop

    .line 957
    .end local v13    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v9, v9, 0x1

    const/4 v5, 0x1

    goto :goto_0

    .line 975
    .end local v9    # "index$iv$iv":I
    :cond_5
    nop

    .line 976
    .end local v7    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v8    # "$i$f$fastForEach":I
    cmpg-float v3, v6, v11

    if-nez v3, :cond_6

    const/4 v5, 0x1

    goto :goto_4

    :cond_6
    const/4 v5, 0x0

    :goto_4
    if-eqz v5, :cond_7

    .line 977
    const/4 v3, 0x0

    goto :goto_5

    .line 978
    :cond_7
    if-ne v0, v12, :cond_8

    .line 979
    move v3, v12

    goto :goto_5

    .line 981
    :cond_8
    sub-int v3, v0, v2

    const/4 v5, 0x0

    invoke-static {v3, v5}, Ljava/lang/Math;->max(II)I

    move-result v3

    int-to-float v3, v3

    div-float/2addr v3, v6

    .local v3, "$this$fastRoundToInt$iv$iv":F
    const/4 v5, 0x0

    .line 982
    .local v5, "$i$f$fastRoundToInt":I
    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v7

    move v3, v7

    .line 976
    .end local v3    # "$this$fastRoundToInt$iv$iv":F
    .end local v5    # "$i$f$fastRoundToInt":I
    :goto_5
    nop

    .line 983
    nop

    .line 992
    .local v3, "weightUnitSpace$iv":I
    move-object/from16 v5, p1

    .local v5, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v7, 0x0

    .line 956
    .local v7, "$i$f$fastForEach":I
    nop

    .line 957
    const/4 v8, 0x0

    .local v8, "index$iv$iv":I
    move-object v9, v5

    check-cast v9, Ljava/util/Collection;

    invoke-interface {v9}, Ljava/util/Collection;->size()I

    move-result v9

    :goto_6
    if-ge v8, v9, :cond_b

    .line 958
    invoke-interface {v5, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    .line 959
    .local v10, "item$iv$iv":Ljava/lang/Object;
    move-object v13, v10

    check-cast v13, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .local v13, "child$iv":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/4 v14, 0x0

    .line 993
    .local v14, "$i$a$-fastForEach-RowColumnImplKt$intrinsicCrossAxisSize$2$iv":I
    invoke-static {v13}, Landroidx/compose/foundation/layout/RowColumnImplKt;->getRowColumnParentData(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Landroidx/compose/foundation/layout/RowColumnParentData;

    move-result-object v15

    invoke-static {v15}, Landroidx/compose/foundation/layout/RowColumnImplKt;->getWeight(Landroidx/compose/foundation/layout/RowColumnParentData;)F

    move-result v15

    .line 995
    .local v15, "weight$iv":F
    cmpl-float v16, v15, v11

    if-lez v16, :cond_a

    .line 996
    nop

    .line 998
    nop

    .line 999
    nop

    .line 1000
    if-eq v3, v12, :cond_9

    .line 1001
    int-to-float v11, v3

    mul-float/2addr v11, v15

    .local v11, "$this$fastRoundToInt$iv$iv":F
    const/16 v17, 0x0

    .line 982
    .local v17, "$i$f$fastRoundToInt":I
    invoke-static {v11}, Ljava/lang/Math;->round(F)I

    move-result v11

    .end local v11    # "$this$fastRoundToInt$iv$iv":F
    .end local v17    # "$i$f$fastRoundToInt":I
    goto :goto_7

    .line 1003
    :cond_9
    move v11, v12

    .line 999
    :goto_7
    move-object/from16 v17, v13

    .local v11, "w":I
    .local v17, "$this$HorizontalMaxHeight_u24lambda_u2410":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    move-object/from16 v18, v17

    .end local v17    # "$this$HorizontalMaxHeight_u24lambda_u2410":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .local v18, "$this$HorizontalMaxHeight_u24lambda_u2410":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/16 v17, 0x0

    .line 395
    .local v17, "$i$a$-intrinsicCrossAxisSize-IntrinsicMeasureBlocks$HorizontalMaxHeight$2":I
    move-object/from16 v12, v18

    .end local v18    # "$this$HorizontalMaxHeight_u24lambda_u2410":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .local v12, "$this$HorizontalMaxHeight_u24lambda_u2410":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    invoke-interface {v12, v11}, Landroidx/compose/ui/layout/IntrinsicMeasurable;->maxIntrinsicHeight(I)I

    move-result v11

    .line 999
    .end local v11    # "w":I
    .end local v12    # "$this$HorizontalMaxHeight_u24lambda_u2410":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .end local v17    # "$i$a$-intrinsicCrossAxisSize-IntrinsicMeasureBlocks$HorizontalMaxHeight$2":I
    nop

    .line 997
    invoke-static {v4, v11}, Ljava/lang/Math;->max(II)I

    move-result v11

    .line 996
    move v4, v11

    .line 1008
    :cond_a
    nop

    .line 959
    .end local v13    # "child$iv":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .end local v14    # "$i$a$-fastForEach-RowColumnImplKt$intrinsicCrossAxisSize$2$iv":I
    .end local v15    # "weight$iv":F
    nop

    .line 957
    .end local v10    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v8, v8, 0x1

    const/4 v11, 0x0

    const v12, 0x7fffffff

    goto :goto_6

    .line 975
    .end local v8    # "index$iv$iv":I
    :cond_b
    nop

    .line 1009
    .end local v5    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v7    # "$i$f$fastForEach":I
    move v3, v4

    .line 392
    .end local v1    # "$i$f$intrinsicCrossAxisSize":I
    .end local v2    # "fixedSpace$iv":I
    .end local v3    # "weightUnitSpace$iv":I
    .end local v4    # "crossAxisMax$iv":I
    .end local v6    # "totalWeight$iv":F
    :goto_8
    return v3
.end method

.method public final HorizontalMaxWidth(Ljava/util/List;II)I
    .locals 17
    .param p1, "measurables"    # Ljava/util/List;
    .param p2, "availableHeight"    # I
    .param p3, "mainAxisSpacing"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/ui/layout/IntrinsicMeasurable;",
            ">;II)I"
        }
    .end annotation

    .line 365
    const/4 v0, 0x0

    .line 870
    .local v0, "$i$f$intrinsicMainAxisSize":I
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    goto :goto_3

    .line 871
    :cond_0
    const/4 v1, 0x0

    .line 872
    .local v1, "weightUnitSpace$iv":I
    const/4 v3, 0x0

    .line 873
    .local v3, "fixedSpace$iv":I
    const/4 v4, 0x0

    .line 874
    .local v4, "totalWeight$iv":F
    move-object/from16 v5, p1

    .local v5, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v6, 0x0

    .line 875
    .local v6, "$i$f$fastForEach":I
    nop

    .line 876
    const/4 v7, 0x0

    .local v7, "index$iv$iv":I
    move-object v8, v5

    check-cast v8, Ljava/util/Collection;

    invoke-interface {v8}, Ljava/util/Collection;->size()I

    move-result v8

    :goto_0
    const/4 v9, 0x1

    if-ge v7, v8, :cond_4

    .line 877
    invoke-interface {v5, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    .line 878
    .local v10, "item$iv$iv":Ljava/lang/Object;
    move-object v11, v10

    check-cast v11, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .local v11, "child$iv":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/4 v12, 0x0

    .line 879
    .local v12, "$i$a$-fastForEach-RowColumnImplKt$intrinsicMainAxisSize$1$iv":I
    invoke-static {v11}, Landroidx/compose/foundation/layout/RowColumnImplKt;->getRowColumnParentData(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Landroidx/compose/foundation/layout/RowColumnParentData;

    move-result-object v13

    invoke-static {v13}, Landroidx/compose/foundation/layout/RowColumnImplKt;->getWeight(Landroidx/compose/foundation/layout/RowColumnParentData;)F

    move-result v13

    .line 880
    .local v13, "weight$iv":F
    move-object v14, v11

    .local v14, "$this$HorizontalMaxWidth_u24lambda_u246":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    move/from16 v15, p2

    .local v15, "h":I
    const/16 v16, 0x0

    .line 367
    .local v16, "$i$a$-intrinsicMainAxisSize-IntrinsicMeasureBlocks$HorizontalMaxWidth$1":I
    invoke-interface {v14, v15}, Landroidx/compose/ui/layout/IntrinsicMeasurable;->maxIntrinsicWidth(I)I

    move-result v14

    .line 880
    .end local v14    # "$this$HorizontalMaxWidth_u24lambda_u246":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .end local v15    # "h":I
    .end local v16    # "$i$a$-intrinsicMainAxisSize-IntrinsicMeasureBlocks$HorizontalMaxWidth$1":I
    nop

    .line 881
    .local v14, "size$iv":I
    const/4 v15, 0x0

    cmpg-float v16, v13, v15

    if-nez v16, :cond_1

    goto :goto_1

    :cond_1
    move v9, v2

    :goto_1
    if-eqz v9, :cond_2

    .line 882
    add-int/2addr v3, v14

    goto :goto_2

    .line 883
    :cond_2
    cmpl-float v9, v13, v15

    if-lez v9, :cond_3

    .line 884
    add-float/2addr v4, v13

    .line 885
    int-to-float v9, v14

    div-float/2addr v9, v13

    .local v9, "$this$fastRoundToInt$iv$iv":F
    const/4 v15, 0x0

    .line 886
    .local v15, "$i$f$fastRoundToInt":I
    invoke-static {v9}, Ljava/lang/Math;->round(F)I

    move-result v9

    .line 885
    .end local v9    # "$this$fastRoundToInt$iv$iv":F
    .end local v15    # "$i$f$fastRoundToInt":I
    invoke-static {v1, v9}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 887
    :cond_3
    :goto_2
    nop

    .line 878
    .end local v11    # "child$iv":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .end local v12    # "$i$a$-fastForEach-RowColumnImplKt$intrinsicMainAxisSize$1$iv":I
    .end local v13    # "weight$iv":F
    .end local v14    # "size$iv":I
    nop

    .line 876
    .end local v10    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 888
    .end local v7    # "index$iv$iv":I
    :cond_4
    nop

    .line 889
    .end local v5    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v6    # "$i$f$fastForEach":I
    int-to-float v2, v1

    mul-float/2addr v2, v4

    .local v2, "$this$fastRoundToInt$iv$iv":F
    const/4 v5, 0x0

    .line 886
    .local v5, "$i$f$fastRoundToInt":I
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    .line 890
    .end local v2    # "$this$fastRoundToInt$iv$iv":F
    .end local v5    # "$i$f$fastRoundToInt":I
    nop

    .line 889
    add-int/2addr v2, v3

    .line 891
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v5

    sub-int/2addr v5, v9

    mul-int v5, v5, p3

    .line 889
    add-int/2addr v2, v5

    .line 365
    .end local v0    # "$i$f$intrinsicMainAxisSize":I
    .end local v1    # "weightUnitSpace$iv":I
    .end local v3    # "fixedSpace$iv":I
    .end local v4    # "totalWeight$iv":F
    :goto_3
    return v2
.end method

.method public final HorizontalMinHeight(Ljava/util/List;II)I
    .locals 19
    .param p1, "measurables"    # Ljava/util/List;
    .param p2, "availableWidth"    # I
    .param p3, "mainAxisSpacing"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/ui/layout/IntrinsicMeasurable;",
            ">;II)I"
        }
    .end annotation

    .line 338
    move/from16 v0, p2

    const/4 v1, 0x0

    .line 789
    .local v1, "$i$f$intrinsicCrossAxisSize":I
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v3, 0x0

    goto/16 :goto_8

    .line 790
    :cond_0
    const/4 v2, 0x0

    .local v2, "fixedSpace$iv":I
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v4

    const/4 v5, 0x1

    sub-int/2addr v4, v5

    mul-int v4, v4, p3

    invoke-static {v4, v0}, Ljava/lang/Math;->min(II)I

    move-result v2

    .line 791
    const/4 v4, 0x0

    .line 792
    .local v4, "crossAxisMax$iv":I
    const/4 v6, 0x0

    .line 793
    .local v6, "totalWeight$iv":F
    move-object/from16 v7, p1

    .local v7, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v8, 0x0

    .line 794
    .local v8, "$i$f$fastForEach":I
    nop

    .line 795
    const/4 v9, 0x0

    .local v9, "index$iv$iv":I
    move-object v10, v7

    check-cast v10, Ljava/util/Collection;

    invoke-interface {v10}, Ljava/util/Collection;->size()I

    move-result v10

    :goto_0
    const/4 v11, 0x0

    const v12, 0x7fffffff

    if-ge v9, v10, :cond_5

    .line 796
    invoke-interface {v7, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    .line 797
    .local v13, "item$iv$iv":Ljava/lang/Object;
    move-object v14, v13

    check-cast v14, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .local v14, "child$iv":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/4 v15, 0x0

    .line 798
    .local v15, "$i$a$-fastForEach-RowColumnImplKt$intrinsicCrossAxisSize$1$iv":I
    invoke-static {v14}, Landroidx/compose/foundation/layout/RowColumnImplKt;->getRowColumnParentData(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Landroidx/compose/foundation/layout/RowColumnParentData;

    move-result-object v16

    invoke-static/range {v16 .. v16}, Landroidx/compose/foundation/layout/RowColumnImplKt;->getWeight(Landroidx/compose/foundation/layout/RowColumnParentData;)F

    move-result v16

    .line 799
    .local v16, "weight$iv":F
    cmpg-float v17, v16, v11

    if-nez v17, :cond_1

    move/from16 v17, v5

    goto :goto_1

    :cond_1
    const/16 v17, 0x0

    :goto_1
    if-eqz v17, :cond_3

    .line 803
    if-ne v0, v12, :cond_2

    goto :goto_2

    .line 804
    :cond_2
    sub-int v12, v0, v2

    .line 803
    :goto_2
    nop

    .line 802
    nop

    .line 805
    .local v12, "remaining$iv":I
    const v11, 0x7fffffff

    .local v11, "h":I
    move-object/from16 v17, v14

    .local v17, "$this$HorizontalMinHeight_u24lambda_u243":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    move-object/from16 v18, v17

    .end local v17    # "$this$HorizontalMinHeight_u24lambda_u243":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .local v18, "$this$HorizontalMinHeight_u24lambda_u243":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/16 v17, 0x0

    .line 340
    .local v17, "$i$a$-intrinsicCrossAxisSize-IntrinsicMeasureBlocks$HorizontalMinHeight$1":I
    move-object/from16 v5, v18

    .end local v18    # "$this$HorizontalMinHeight_u24lambda_u243":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .local v5, "$this$HorizontalMinHeight_u24lambda_u243":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    invoke-interface {v5, v11}, Landroidx/compose/ui/layout/IntrinsicMeasurable;->maxIntrinsicWidth(I)I

    move-result v5

    .line 805
    .end local v5    # "$this$HorizontalMinHeight_u24lambda_u243":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .end local v11    # "h":I
    .end local v17    # "$i$a$-intrinsicCrossAxisSize-IntrinsicMeasureBlocks$HorizontalMinHeight$1":I
    invoke-static {v5, v12}, Ljava/lang/Math;->min(II)I

    move-result v5

    .line 806
    .local v5, "mainAxisSpace$iv":I
    add-int/2addr v2, v5

    .line 808
    move v11, v5

    .local v11, "w":I
    move-object/from16 v17, v14

    .local v17, "$this$HorizontalMinHeight_u24lambda_u244":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/16 v18, 0x0

    .line 341
    .local v18, "$i$a$-intrinsicCrossAxisSize-IntrinsicMeasureBlocks$HorizontalMinHeight$2":I
    move-object/from16 v3, v17

    .end local v17    # "$this$HorizontalMinHeight_u24lambda_u244":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .local v3, "$this$HorizontalMinHeight_u24lambda_u244":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    invoke-interface {v3, v11}, Landroidx/compose/ui/layout/IntrinsicMeasurable;->minIntrinsicHeight(I)I

    move-result v3

    .line 808
    .end local v3    # "$this$HorizontalMinHeight_u24lambda_u244":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .end local v11    # "w":I
    .end local v18    # "$i$a$-intrinsicCrossAxisSize-IntrinsicMeasureBlocks$HorizontalMinHeight$2":I
    invoke-static {v4, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    move v4, v3

    .end local v4    # "crossAxisMax$iv":I
    .end local v5    # "mainAxisSpace$iv":I
    .end local v12    # "remaining$iv":I
    .local v3, "crossAxisMax$iv":I
    goto :goto_3

    .line 809
    .end local v3    # "crossAxisMax$iv":I
    .restart local v4    # "crossAxisMax$iv":I
    :cond_3
    cmpl-float v3, v16, v11

    if-lez v3, :cond_4

    .line 810
    add-float v6, v6, v16

    .line 812
    :cond_4
    :goto_3
    nop

    .line 797
    .end local v14    # "child$iv":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .end local v15    # "$i$a$-fastForEach-RowColumnImplKt$intrinsicCrossAxisSize$1$iv":I
    .end local v16    # "weight$iv":F
    nop

    .line 795
    .end local v13    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v9, v9, 0x1

    const/4 v5, 0x1

    goto :goto_0

    .line 813
    .end local v9    # "index$iv$iv":I
    :cond_5
    nop

    .line 814
    .end local v7    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v8    # "$i$f$fastForEach":I
    cmpg-float v3, v6, v11

    if-nez v3, :cond_6

    const/4 v5, 0x1

    goto :goto_4

    :cond_6
    const/4 v5, 0x0

    :goto_4
    if-eqz v5, :cond_7

    .line 815
    const/4 v3, 0x0

    goto :goto_5

    .line 816
    :cond_7
    if-ne v0, v12, :cond_8

    .line 817
    move v3, v12

    goto :goto_5

    .line 819
    :cond_8
    sub-int v3, v0, v2

    const/4 v5, 0x0

    invoke-static {v3, v5}, Ljava/lang/Math;->max(II)I

    move-result v3

    int-to-float v3, v3

    div-float/2addr v3, v6

    .local v3, "$this$fastRoundToInt$iv$iv":F
    const/4 v5, 0x0

    .line 820
    .local v5, "$i$f$fastRoundToInt":I
    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v7

    move v3, v7

    .line 814
    .end local v3    # "$this$fastRoundToInt$iv$iv":F
    .end local v5    # "$i$f$fastRoundToInt":I
    :goto_5
    nop

    .line 821
    nop

    .line 830
    .local v3, "weightUnitSpace$iv":I
    move-object/from16 v5, p1

    .local v5, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v7, 0x0

    .line 794
    .local v7, "$i$f$fastForEach":I
    nop

    .line 795
    const/4 v8, 0x0

    .local v8, "index$iv$iv":I
    move-object v9, v5

    check-cast v9, Ljava/util/Collection;

    invoke-interface {v9}, Ljava/util/Collection;->size()I

    move-result v9

    :goto_6
    if-ge v8, v9, :cond_b

    .line 796
    invoke-interface {v5, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    .line 797
    .local v10, "item$iv$iv":Ljava/lang/Object;
    move-object v13, v10

    check-cast v13, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .local v13, "child$iv":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/4 v14, 0x0

    .line 831
    .local v14, "$i$a$-fastForEach-RowColumnImplKt$intrinsicCrossAxisSize$2$iv":I
    invoke-static {v13}, Landroidx/compose/foundation/layout/RowColumnImplKt;->getRowColumnParentData(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Landroidx/compose/foundation/layout/RowColumnParentData;

    move-result-object v15

    invoke-static {v15}, Landroidx/compose/foundation/layout/RowColumnImplKt;->getWeight(Landroidx/compose/foundation/layout/RowColumnParentData;)F

    move-result v15

    .line 833
    .local v15, "weight$iv":F
    cmpl-float v16, v15, v11

    if-lez v16, :cond_a

    .line 834
    nop

    .line 836
    nop

    .line 837
    nop

    .line 838
    if-eq v3, v12, :cond_9

    .line 839
    int-to-float v11, v3

    mul-float/2addr v11, v15

    .local v11, "$this$fastRoundToInt$iv$iv":F
    const/16 v17, 0x0

    .line 820
    .local v17, "$i$f$fastRoundToInt":I
    invoke-static {v11}, Ljava/lang/Math;->round(F)I

    move-result v11

    .end local v11    # "$this$fastRoundToInt$iv$iv":F
    .end local v17    # "$i$f$fastRoundToInt":I
    goto :goto_7

    .line 841
    :cond_9
    move v11, v12

    .line 837
    :goto_7
    move-object/from16 v17, v13

    .local v11, "w":I
    .local v17, "$this$HorizontalMinHeight_u24lambda_u244":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    move-object/from16 v18, v17

    .end local v17    # "$this$HorizontalMinHeight_u24lambda_u244":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .local v18, "$this$HorizontalMinHeight_u24lambda_u244":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/16 v17, 0x0

    .line 341
    .local v17, "$i$a$-intrinsicCrossAxisSize-IntrinsicMeasureBlocks$HorizontalMinHeight$2":I
    move-object/from16 v12, v18

    .end local v18    # "$this$HorizontalMinHeight_u24lambda_u244":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .local v12, "$this$HorizontalMinHeight_u24lambda_u244":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    invoke-interface {v12, v11}, Landroidx/compose/ui/layout/IntrinsicMeasurable;->minIntrinsicHeight(I)I

    move-result v11

    .line 837
    .end local v11    # "w":I
    .end local v12    # "$this$HorizontalMinHeight_u24lambda_u244":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .end local v17    # "$i$a$-intrinsicCrossAxisSize-IntrinsicMeasureBlocks$HorizontalMinHeight$2":I
    nop

    .line 835
    invoke-static {v4, v11}, Ljava/lang/Math;->max(II)I

    move-result v11

    .line 834
    move v4, v11

    .line 846
    :cond_a
    nop

    .line 797
    .end local v13    # "child$iv":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .end local v14    # "$i$a$-fastForEach-RowColumnImplKt$intrinsicCrossAxisSize$2$iv":I
    .end local v15    # "weight$iv":F
    nop

    .line 795
    .end local v10    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v8, v8, 0x1

    const/4 v11, 0x0

    const v12, 0x7fffffff

    goto :goto_6

    .line 813
    .end local v8    # "index$iv$iv":I
    :cond_b
    nop

    .line 847
    .end local v5    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v7    # "$i$f$fastForEach":I
    move v3, v4

    .line 338
    .end local v1    # "$i$f$intrinsicCrossAxisSize":I
    .end local v2    # "fixedSpace$iv":I
    .end local v3    # "weightUnitSpace$iv":I
    .end local v4    # "crossAxisMax$iv":I
    .end local v6    # "totalWeight$iv":F
    :goto_8
    return v3
.end method

.method public final HorizontalMinWidth(Ljava/util/List;II)I
    .locals 17
    .param p1, "measurables"    # Ljava/util/List;
    .param p2, "availableHeight"    # I
    .param p3, "mainAxisSpacing"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/ui/layout/IntrinsicMeasurable;",
            ">;II)I"
        }
    .end annotation

    .line 311
    const/4 v0, 0x0

    .line 708
    .local v0, "$i$f$intrinsicMainAxisSize":I
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    goto :goto_3

    .line 709
    :cond_0
    const/4 v1, 0x0

    .line 710
    .local v1, "weightUnitSpace$iv":I
    const/4 v3, 0x0

    .line 711
    .local v3, "fixedSpace$iv":I
    const/4 v4, 0x0

    .line 712
    .local v4, "totalWeight$iv":F
    move-object/from16 v5, p1

    .local v5, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v6, 0x0

    .line 713
    .local v6, "$i$f$fastForEach":I
    nop

    .line 714
    const/4 v7, 0x0

    .local v7, "index$iv$iv":I
    move-object v8, v5

    check-cast v8, Ljava/util/Collection;

    invoke-interface {v8}, Ljava/util/Collection;->size()I

    move-result v8

    :goto_0
    const/4 v9, 0x1

    if-ge v7, v8, :cond_4

    .line 715
    invoke-interface {v5, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    .line 716
    .local v10, "item$iv$iv":Ljava/lang/Object;
    move-object v11, v10

    check-cast v11, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .local v11, "child$iv":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/4 v12, 0x0

    .line 717
    .local v12, "$i$a$-fastForEach-RowColumnImplKt$intrinsicMainAxisSize$1$iv":I
    invoke-static {v11}, Landroidx/compose/foundation/layout/RowColumnImplKt;->getRowColumnParentData(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Landroidx/compose/foundation/layout/RowColumnParentData;

    move-result-object v13

    invoke-static {v13}, Landroidx/compose/foundation/layout/RowColumnImplKt;->getWeight(Landroidx/compose/foundation/layout/RowColumnParentData;)F

    move-result v13

    .line 718
    .local v13, "weight$iv":F
    move-object v14, v11

    .local v14, "$this$HorizontalMinWidth_u24lambda_u240":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    move/from16 v15, p2

    .local v15, "h":I
    const/16 v16, 0x0

    .line 313
    .local v16, "$i$a$-intrinsicMainAxisSize-IntrinsicMeasureBlocks$HorizontalMinWidth$1":I
    invoke-interface {v14, v15}, Landroidx/compose/ui/layout/IntrinsicMeasurable;->minIntrinsicWidth(I)I

    move-result v14

    .line 718
    .end local v14    # "$this$HorizontalMinWidth_u24lambda_u240":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .end local v15    # "h":I
    .end local v16    # "$i$a$-intrinsicMainAxisSize-IntrinsicMeasureBlocks$HorizontalMinWidth$1":I
    nop

    .line 719
    .local v14, "size$iv":I
    const/4 v15, 0x0

    cmpg-float v16, v13, v15

    if-nez v16, :cond_1

    goto :goto_1

    :cond_1
    move v9, v2

    :goto_1
    if-eqz v9, :cond_2

    .line 720
    add-int/2addr v3, v14

    goto :goto_2

    .line 721
    :cond_2
    cmpl-float v9, v13, v15

    if-lez v9, :cond_3

    .line 722
    add-float/2addr v4, v13

    .line 723
    int-to-float v9, v14

    div-float/2addr v9, v13

    .local v9, "$this$fastRoundToInt$iv$iv":F
    const/4 v15, 0x0

    .line 724
    .local v15, "$i$f$fastRoundToInt":I
    invoke-static {v9}, Ljava/lang/Math;->round(F)I

    move-result v9

    .line 723
    .end local v9    # "$this$fastRoundToInt$iv$iv":F
    .end local v15    # "$i$f$fastRoundToInt":I
    invoke-static {v1, v9}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 725
    :cond_3
    :goto_2
    nop

    .line 716
    .end local v11    # "child$iv":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .end local v12    # "$i$a$-fastForEach-RowColumnImplKt$intrinsicMainAxisSize$1$iv":I
    .end local v13    # "weight$iv":F
    .end local v14    # "size$iv":I
    nop

    .line 714
    .end local v10    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 726
    .end local v7    # "index$iv$iv":I
    :cond_4
    nop

    .line 727
    .end local v5    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v6    # "$i$f$fastForEach":I
    int-to-float v2, v1

    mul-float/2addr v2, v4

    .local v2, "$this$fastRoundToInt$iv$iv":F
    const/4 v5, 0x0

    .line 724
    .local v5, "$i$f$fastRoundToInt":I
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    .line 728
    .end local v2    # "$this$fastRoundToInt$iv$iv":F
    .end local v5    # "$i$f$fastRoundToInt":I
    nop

    .line 727
    add-int/2addr v2, v3

    .line 729
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v5

    sub-int/2addr v5, v9

    mul-int v5, v5, p3

    .line 727
    add-int/2addr v2, v5

    .line 311
    .end local v0    # "$i$f$intrinsicMainAxisSize":I
    .end local v1    # "weightUnitSpace$iv":I
    .end local v3    # "fixedSpace$iv":I
    .end local v4    # "totalWeight$iv":F
    :goto_3
    return v2
.end method

.method public final VerticalMaxHeight(Ljava/util/List;II)I
    .locals 17
    .param p1, "measurables"    # Ljava/util/List;
    .param p2, "availableWidth"    # I
    .param p3, "mainAxisSpacing"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/ui/layout/IntrinsicMeasurable;",
            ">;II)I"
        }
    .end annotation

    .line 406
    const/4 v0, 0x0

    .line 1010
    .local v0, "$i$f$intrinsicMainAxisSize":I
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    goto :goto_3

    .line 1011
    :cond_0
    const/4 v1, 0x0

    .line 1012
    .local v1, "weightUnitSpace$iv":I
    const/4 v3, 0x0

    .line 1013
    .local v3, "fixedSpace$iv":I
    const/4 v4, 0x0

    .line 1014
    .local v4, "totalWeight$iv":F
    move-object/from16 v5, p1

    .local v5, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v6, 0x0

    .line 1015
    .local v6, "$i$f$fastForEach":I
    nop

    .line 1016
    const/4 v7, 0x0

    .local v7, "index$iv$iv":I
    move-object v8, v5

    check-cast v8, Ljava/util/Collection;

    invoke-interface {v8}, Ljava/util/Collection;->size()I

    move-result v8

    :goto_0
    const/4 v9, 0x1

    if-ge v7, v8, :cond_4

    .line 1017
    invoke-interface {v5, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    .line 1018
    .local v10, "item$iv$iv":Ljava/lang/Object;
    move-object v11, v10

    check-cast v11, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .local v11, "child$iv":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/4 v12, 0x0

    .line 1019
    .local v12, "$i$a$-fastForEach-RowColumnImplKt$intrinsicMainAxisSize$1$iv":I
    invoke-static {v11}, Landroidx/compose/foundation/layout/RowColumnImplKt;->getRowColumnParentData(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Landroidx/compose/foundation/layout/RowColumnParentData;

    move-result-object v13

    invoke-static {v13}, Landroidx/compose/foundation/layout/RowColumnImplKt;->getWeight(Landroidx/compose/foundation/layout/RowColumnParentData;)F

    move-result v13

    .line 1020
    .local v13, "weight$iv":F
    move-object v14, v11

    .local v14, "$this$VerticalMaxHeight_u24lambda_u2411":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    move/from16 v15, p2

    .local v15, "w":I
    const/16 v16, 0x0

    .line 408
    .local v16, "$i$a$-intrinsicMainAxisSize-IntrinsicMeasureBlocks$VerticalMaxHeight$1":I
    invoke-interface {v14, v15}, Landroidx/compose/ui/layout/IntrinsicMeasurable;->maxIntrinsicHeight(I)I

    move-result v14

    .line 1020
    .end local v14    # "$this$VerticalMaxHeight_u24lambda_u2411":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .end local v15    # "w":I
    .end local v16    # "$i$a$-intrinsicMainAxisSize-IntrinsicMeasureBlocks$VerticalMaxHeight$1":I
    nop

    .line 1021
    .local v14, "size$iv":I
    const/4 v15, 0x0

    cmpg-float v16, v13, v15

    if-nez v16, :cond_1

    goto :goto_1

    :cond_1
    move v9, v2

    :goto_1
    if-eqz v9, :cond_2

    .line 1022
    add-int/2addr v3, v14

    goto :goto_2

    .line 1023
    :cond_2
    cmpl-float v9, v13, v15

    if-lez v9, :cond_3

    .line 1024
    add-float/2addr v4, v13

    .line 1025
    int-to-float v9, v14

    div-float/2addr v9, v13

    .local v9, "$this$fastRoundToInt$iv$iv":F
    const/4 v15, 0x0

    .line 1026
    .local v15, "$i$f$fastRoundToInt":I
    invoke-static {v9}, Ljava/lang/Math;->round(F)I

    move-result v9

    .line 1025
    .end local v9    # "$this$fastRoundToInt$iv$iv":F
    .end local v15    # "$i$f$fastRoundToInt":I
    invoke-static {v1, v9}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 1027
    :cond_3
    :goto_2
    nop

    .line 1018
    .end local v11    # "child$iv":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .end local v12    # "$i$a$-fastForEach-RowColumnImplKt$intrinsicMainAxisSize$1$iv":I
    .end local v13    # "weight$iv":F
    .end local v14    # "size$iv":I
    nop

    .line 1016
    .end local v10    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 1028
    .end local v7    # "index$iv$iv":I
    :cond_4
    nop

    .line 1029
    .end local v5    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v6    # "$i$f$fastForEach":I
    int-to-float v2, v1

    mul-float/2addr v2, v4

    .local v2, "$this$fastRoundToInt$iv$iv":F
    const/4 v5, 0x0

    .line 1026
    .local v5, "$i$f$fastRoundToInt":I
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    .line 1030
    .end local v2    # "$this$fastRoundToInt$iv$iv":F
    .end local v5    # "$i$f$fastRoundToInt":I
    nop

    .line 1029
    add-int/2addr v2, v3

    .line 1031
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v5

    sub-int/2addr v5, v9

    mul-int v5, v5, p3

    .line 1029
    add-int/2addr v2, v5

    .line 406
    .end local v0    # "$i$f$intrinsicMainAxisSize":I
    .end local v1    # "weightUnitSpace$iv":I
    .end local v3    # "fixedSpace$iv":I
    .end local v4    # "totalWeight$iv":F
    :goto_3
    return v2
.end method

.method public final VerticalMaxWidth(Ljava/util/List;II)I
    .locals 19
    .param p1, "measurables"    # Ljava/util/List;
    .param p2, "availableHeight"    # I
    .param p3, "mainAxisSpacing"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/ui/layout/IntrinsicMeasurable;",
            ">;II)I"
        }
    .end annotation

    .line 378
    move/from16 v0, p2

    const/4 v1, 0x0

    .line 892
    .local v1, "$i$f$intrinsicCrossAxisSize":I
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v3, 0x0

    goto/16 :goto_8

    .line 893
    :cond_0
    const/4 v2, 0x0

    .local v2, "fixedSpace$iv":I
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v4

    const/4 v5, 0x1

    sub-int/2addr v4, v5

    mul-int v4, v4, p3

    invoke-static {v4, v0}, Ljava/lang/Math;->min(II)I

    move-result v2

    .line 894
    const/4 v4, 0x0

    .line 895
    .local v4, "crossAxisMax$iv":I
    const/4 v6, 0x0

    .line 896
    .local v6, "totalWeight$iv":F
    move-object/from16 v7, p1

    .local v7, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v8, 0x0

    .line 897
    .local v8, "$i$f$fastForEach":I
    nop

    .line 898
    const/4 v9, 0x0

    .local v9, "index$iv$iv":I
    move-object v10, v7

    check-cast v10, Ljava/util/Collection;

    invoke-interface {v10}, Ljava/util/Collection;->size()I

    move-result v10

    :goto_0
    const/4 v11, 0x0

    const v12, 0x7fffffff

    if-ge v9, v10, :cond_5

    .line 899
    invoke-interface {v7, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    .line 900
    .local v13, "item$iv$iv":Ljava/lang/Object;
    move-object v14, v13

    check-cast v14, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .local v14, "child$iv":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/4 v15, 0x0

    .line 901
    .local v15, "$i$a$-fastForEach-RowColumnImplKt$intrinsicCrossAxisSize$1$iv":I
    invoke-static {v14}, Landroidx/compose/foundation/layout/RowColumnImplKt;->getRowColumnParentData(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Landroidx/compose/foundation/layout/RowColumnParentData;

    move-result-object v16

    invoke-static/range {v16 .. v16}, Landroidx/compose/foundation/layout/RowColumnImplKt;->getWeight(Landroidx/compose/foundation/layout/RowColumnParentData;)F

    move-result v16

    .line 902
    .local v16, "weight$iv":F
    cmpg-float v17, v16, v11

    if-nez v17, :cond_1

    move/from16 v17, v5

    goto :goto_1

    :cond_1
    const/16 v17, 0x0

    :goto_1
    if-eqz v17, :cond_3

    .line 906
    if-ne v0, v12, :cond_2

    goto :goto_2

    .line 907
    :cond_2
    sub-int v12, v0, v2

    .line 906
    :goto_2
    nop

    .line 905
    nop

    .line 908
    .local v12, "remaining$iv":I
    const v11, 0x7fffffff

    .local v11, "w":I
    move-object/from16 v17, v14

    .local v17, "$this$VerticalMaxWidth_u24lambda_u247":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    move-object/from16 v18, v17

    .end local v17    # "$this$VerticalMaxWidth_u24lambda_u247":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .local v18, "$this$VerticalMaxWidth_u24lambda_u247":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/16 v17, 0x0

    .line 380
    .local v17, "$i$a$-intrinsicCrossAxisSize-IntrinsicMeasureBlocks$VerticalMaxWidth$1":I
    move-object/from16 v5, v18

    .end local v18    # "$this$VerticalMaxWidth_u24lambda_u247":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .local v5, "$this$VerticalMaxWidth_u24lambda_u247":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    invoke-interface {v5, v11}, Landroidx/compose/ui/layout/IntrinsicMeasurable;->maxIntrinsicHeight(I)I

    move-result v5

    .line 908
    .end local v5    # "$this$VerticalMaxWidth_u24lambda_u247":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .end local v11    # "w":I
    .end local v17    # "$i$a$-intrinsicCrossAxisSize-IntrinsicMeasureBlocks$VerticalMaxWidth$1":I
    invoke-static {v5, v12}, Ljava/lang/Math;->min(II)I

    move-result v5

    .line 909
    .local v5, "mainAxisSpace$iv":I
    add-int/2addr v2, v5

    .line 911
    move v11, v5

    .local v11, "h":I
    move-object/from16 v17, v14

    .local v17, "$this$VerticalMaxWidth_u24lambda_u248":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/16 v18, 0x0

    .line 381
    .local v18, "$i$a$-intrinsicCrossAxisSize-IntrinsicMeasureBlocks$VerticalMaxWidth$2":I
    move-object/from16 v3, v17

    .end local v17    # "$this$VerticalMaxWidth_u24lambda_u248":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .local v3, "$this$VerticalMaxWidth_u24lambda_u248":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    invoke-interface {v3, v11}, Landroidx/compose/ui/layout/IntrinsicMeasurable;->maxIntrinsicWidth(I)I

    move-result v3

    .line 911
    .end local v3    # "$this$VerticalMaxWidth_u24lambda_u248":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .end local v11    # "h":I
    .end local v18    # "$i$a$-intrinsicCrossAxisSize-IntrinsicMeasureBlocks$VerticalMaxWidth$2":I
    invoke-static {v4, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    move v4, v3

    .end local v4    # "crossAxisMax$iv":I
    .end local v5    # "mainAxisSpace$iv":I
    .end local v12    # "remaining$iv":I
    .local v3, "crossAxisMax$iv":I
    goto :goto_3

    .line 912
    .end local v3    # "crossAxisMax$iv":I
    .restart local v4    # "crossAxisMax$iv":I
    :cond_3
    cmpl-float v3, v16, v11

    if-lez v3, :cond_4

    .line 913
    add-float v6, v6, v16

    .line 915
    :cond_4
    :goto_3
    nop

    .line 900
    .end local v14    # "child$iv":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .end local v15    # "$i$a$-fastForEach-RowColumnImplKt$intrinsicCrossAxisSize$1$iv":I
    .end local v16    # "weight$iv":F
    nop

    .line 898
    .end local v13    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v9, v9, 0x1

    const/4 v5, 0x1

    goto :goto_0

    .line 916
    .end local v9    # "index$iv$iv":I
    :cond_5
    nop

    .line 917
    .end local v7    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v8    # "$i$f$fastForEach":I
    cmpg-float v3, v6, v11

    if-nez v3, :cond_6

    const/4 v5, 0x1

    goto :goto_4

    :cond_6
    const/4 v5, 0x0

    :goto_4
    if-eqz v5, :cond_7

    .line 918
    const/4 v3, 0x0

    goto :goto_5

    .line 919
    :cond_7
    if-ne v0, v12, :cond_8

    .line 920
    move v3, v12

    goto :goto_5

    .line 922
    :cond_8
    sub-int v3, v0, v2

    const/4 v5, 0x0

    invoke-static {v3, v5}, Ljava/lang/Math;->max(II)I

    move-result v3

    int-to-float v3, v3

    div-float/2addr v3, v6

    .local v3, "$this$fastRoundToInt$iv$iv":F
    const/4 v5, 0x0

    .line 923
    .local v5, "$i$f$fastRoundToInt":I
    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v7

    move v3, v7

    .line 917
    .end local v3    # "$this$fastRoundToInt$iv$iv":F
    .end local v5    # "$i$f$fastRoundToInt":I
    :goto_5
    nop

    .line 924
    nop

    .line 933
    .local v3, "weightUnitSpace$iv":I
    move-object/from16 v5, p1

    .local v5, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v7, 0x0

    .line 897
    .local v7, "$i$f$fastForEach":I
    nop

    .line 898
    const/4 v8, 0x0

    .local v8, "index$iv$iv":I
    move-object v9, v5

    check-cast v9, Ljava/util/Collection;

    invoke-interface {v9}, Ljava/util/Collection;->size()I

    move-result v9

    :goto_6
    if-ge v8, v9, :cond_b

    .line 899
    invoke-interface {v5, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    .line 900
    .local v10, "item$iv$iv":Ljava/lang/Object;
    move-object v13, v10

    check-cast v13, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .local v13, "child$iv":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/4 v14, 0x0

    .line 934
    .local v14, "$i$a$-fastForEach-RowColumnImplKt$intrinsicCrossAxisSize$2$iv":I
    invoke-static {v13}, Landroidx/compose/foundation/layout/RowColumnImplKt;->getRowColumnParentData(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Landroidx/compose/foundation/layout/RowColumnParentData;

    move-result-object v15

    invoke-static {v15}, Landroidx/compose/foundation/layout/RowColumnImplKt;->getWeight(Landroidx/compose/foundation/layout/RowColumnParentData;)F

    move-result v15

    .line 936
    .local v15, "weight$iv":F
    cmpl-float v16, v15, v11

    if-lez v16, :cond_a

    .line 937
    nop

    .line 939
    nop

    .line 940
    nop

    .line 941
    if-eq v3, v12, :cond_9

    .line 942
    int-to-float v11, v3

    mul-float/2addr v11, v15

    .local v11, "$this$fastRoundToInt$iv$iv":F
    const/16 v17, 0x0

    .line 923
    .local v17, "$i$f$fastRoundToInt":I
    invoke-static {v11}, Ljava/lang/Math;->round(F)I

    move-result v11

    .end local v11    # "$this$fastRoundToInt$iv$iv":F
    .end local v17    # "$i$f$fastRoundToInt":I
    goto :goto_7

    .line 944
    :cond_9
    move v11, v12

    .line 940
    :goto_7
    move-object/from16 v17, v13

    .local v11, "h":I
    .local v17, "$this$VerticalMaxWidth_u24lambda_u248":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    move-object/from16 v18, v17

    .end local v17    # "$this$VerticalMaxWidth_u24lambda_u248":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .local v18, "$this$VerticalMaxWidth_u24lambda_u248":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/16 v17, 0x0

    .line 381
    .local v17, "$i$a$-intrinsicCrossAxisSize-IntrinsicMeasureBlocks$VerticalMaxWidth$2":I
    move-object/from16 v12, v18

    .end local v18    # "$this$VerticalMaxWidth_u24lambda_u248":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .local v12, "$this$VerticalMaxWidth_u24lambda_u248":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    invoke-interface {v12, v11}, Landroidx/compose/ui/layout/IntrinsicMeasurable;->maxIntrinsicWidth(I)I

    move-result v11

    .line 940
    .end local v11    # "h":I
    .end local v12    # "$this$VerticalMaxWidth_u24lambda_u248":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .end local v17    # "$i$a$-intrinsicCrossAxisSize-IntrinsicMeasureBlocks$VerticalMaxWidth$2":I
    nop

    .line 938
    invoke-static {v4, v11}, Ljava/lang/Math;->max(II)I

    move-result v11

    .line 937
    move v4, v11

    .line 949
    :cond_a
    nop

    .line 900
    .end local v13    # "child$iv":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .end local v14    # "$i$a$-fastForEach-RowColumnImplKt$intrinsicCrossAxisSize$2$iv":I
    .end local v15    # "weight$iv":F
    nop

    .line 898
    .end local v10    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v8, v8, 0x1

    const/4 v11, 0x0

    const v12, 0x7fffffff

    goto :goto_6

    .line 916
    .end local v8    # "index$iv$iv":I
    :cond_b
    nop

    .line 950
    .end local v5    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v7    # "$i$f$fastForEach":I
    move v3, v4

    .line 378
    .end local v1    # "$i$f$intrinsicCrossAxisSize":I
    .end local v2    # "fixedSpace$iv":I
    .end local v3    # "weightUnitSpace$iv":I
    .end local v4    # "crossAxisMax$iv":I
    .end local v6    # "totalWeight$iv":F
    :goto_8
    return v3
.end method

.method public final VerticalMinHeight(Ljava/util/List;II)I
    .locals 17
    .param p1, "measurables"    # Ljava/util/List;
    .param p2, "availableWidth"    # I
    .param p3, "mainAxisSpacing"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/ui/layout/IntrinsicMeasurable;",
            ">;II)I"
        }
    .end annotation

    .line 352
    const/4 v0, 0x0

    .line 848
    .local v0, "$i$f$intrinsicMainAxisSize":I
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    goto :goto_3

    .line 849
    :cond_0
    const/4 v1, 0x0

    .line 850
    .local v1, "weightUnitSpace$iv":I
    const/4 v3, 0x0

    .line 851
    .local v3, "fixedSpace$iv":I
    const/4 v4, 0x0

    .line 852
    .local v4, "totalWeight$iv":F
    move-object/from16 v5, p1

    .local v5, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v6, 0x0

    .line 853
    .local v6, "$i$f$fastForEach":I
    nop

    .line 854
    const/4 v7, 0x0

    .local v7, "index$iv$iv":I
    move-object v8, v5

    check-cast v8, Ljava/util/Collection;

    invoke-interface {v8}, Ljava/util/Collection;->size()I

    move-result v8

    :goto_0
    const/4 v9, 0x1

    if-ge v7, v8, :cond_4

    .line 855
    invoke-interface {v5, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    .line 856
    .local v10, "item$iv$iv":Ljava/lang/Object;
    move-object v11, v10

    check-cast v11, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .local v11, "child$iv":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/4 v12, 0x0

    .line 857
    .local v12, "$i$a$-fastForEach-RowColumnImplKt$intrinsicMainAxisSize$1$iv":I
    invoke-static {v11}, Landroidx/compose/foundation/layout/RowColumnImplKt;->getRowColumnParentData(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Landroidx/compose/foundation/layout/RowColumnParentData;

    move-result-object v13

    invoke-static {v13}, Landroidx/compose/foundation/layout/RowColumnImplKt;->getWeight(Landroidx/compose/foundation/layout/RowColumnParentData;)F

    move-result v13

    .line 858
    .local v13, "weight$iv":F
    move-object v14, v11

    .local v14, "$this$VerticalMinHeight_u24lambda_u245":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    move/from16 v15, p2

    .local v15, "w":I
    const/16 v16, 0x0

    .line 354
    .local v16, "$i$a$-intrinsicMainAxisSize-IntrinsicMeasureBlocks$VerticalMinHeight$1":I
    invoke-interface {v14, v15}, Landroidx/compose/ui/layout/IntrinsicMeasurable;->minIntrinsicHeight(I)I

    move-result v14

    .line 858
    .end local v14    # "$this$VerticalMinHeight_u24lambda_u245":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .end local v15    # "w":I
    .end local v16    # "$i$a$-intrinsicMainAxisSize-IntrinsicMeasureBlocks$VerticalMinHeight$1":I
    nop

    .line 859
    .local v14, "size$iv":I
    const/4 v15, 0x0

    cmpg-float v16, v13, v15

    if-nez v16, :cond_1

    goto :goto_1

    :cond_1
    move v9, v2

    :goto_1
    if-eqz v9, :cond_2

    .line 860
    add-int/2addr v3, v14

    goto :goto_2

    .line 861
    :cond_2
    cmpl-float v9, v13, v15

    if-lez v9, :cond_3

    .line 862
    add-float/2addr v4, v13

    .line 863
    int-to-float v9, v14

    div-float/2addr v9, v13

    .local v9, "$this$fastRoundToInt$iv$iv":F
    const/4 v15, 0x0

    .line 864
    .local v15, "$i$f$fastRoundToInt":I
    invoke-static {v9}, Ljava/lang/Math;->round(F)I

    move-result v9

    .line 863
    .end local v9    # "$this$fastRoundToInt$iv$iv":F
    .end local v15    # "$i$f$fastRoundToInt":I
    invoke-static {v1, v9}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 865
    :cond_3
    :goto_2
    nop

    .line 856
    .end local v11    # "child$iv":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .end local v12    # "$i$a$-fastForEach-RowColumnImplKt$intrinsicMainAxisSize$1$iv":I
    .end local v13    # "weight$iv":F
    .end local v14    # "size$iv":I
    nop

    .line 854
    .end local v10    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 866
    .end local v7    # "index$iv$iv":I
    :cond_4
    nop

    .line 867
    .end local v5    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v6    # "$i$f$fastForEach":I
    int-to-float v2, v1

    mul-float/2addr v2, v4

    .local v2, "$this$fastRoundToInt$iv$iv":F
    const/4 v5, 0x0

    .line 864
    .local v5, "$i$f$fastRoundToInt":I
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    .line 868
    .end local v2    # "$this$fastRoundToInt$iv$iv":F
    .end local v5    # "$i$f$fastRoundToInt":I
    nop

    .line 867
    add-int/2addr v2, v3

    .line 869
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v5

    sub-int/2addr v5, v9

    mul-int v5, v5, p3

    .line 867
    add-int/2addr v2, v5

    .line 352
    .end local v0    # "$i$f$intrinsicMainAxisSize":I
    .end local v1    # "weightUnitSpace$iv":I
    .end local v3    # "fixedSpace$iv":I
    .end local v4    # "totalWeight$iv":F
    :goto_3
    return v2
.end method

.method public final VerticalMinWidth(Ljava/util/List;II)I
    .locals 19
    .param p1, "measurables"    # Ljava/util/List;
    .param p2, "availableHeight"    # I
    .param p3, "mainAxisSpacing"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/ui/layout/IntrinsicMeasurable;",
            ">;II)I"
        }
    .end annotation

    .line 324
    move/from16 v0, p2

    const/4 v1, 0x0

    .line 730
    .local v1, "$i$f$intrinsicCrossAxisSize":I
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v3, 0x0

    goto/16 :goto_8

    .line 731
    :cond_0
    const/4 v2, 0x0

    .local v2, "fixedSpace$iv":I
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v4

    const/4 v5, 0x1

    sub-int/2addr v4, v5

    mul-int v4, v4, p3

    invoke-static {v4, v0}, Ljava/lang/Math;->min(II)I

    move-result v2

    .line 732
    const/4 v4, 0x0

    .line 733
    .local v4, "crossAxisMax$iv":I
    const/4 v6, 0x0

    .line 734
    .local v6, "totalWeight$iv":F
    move-object/from16 v7, p1

    .local v7, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v8, 0x0

    .line 735
    .local v8, "$i$f$fastForEach":I
    nop

    .line 736
    const/4 v9, 0x0

    .local v9, "index$iv$iv":I
    move-object v10, v7

    check-cast v10, Ljava/util/Collection;

    invoke-interface {v10}, Ljava/util/Collection;->size()I

    move-result v10

    :goto_0
    const/4 v11, 0x0

    const v12, 0x7fffffff

    if-ge v9, v10, :cond_5

    .line 737
    invoke-interface {v7, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    .line 738
    .local v13, "item$iv$iv":Ljava/lang/Object;
    move-object v14, v13

    check-cast v14, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .local v14, "child$iv":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/4 v15, 0x0

    .line 739
    .local v15, "$i$a$-fastForEach-RowColumnImplKt$intrinsicCrossAxisSize$1$iv":I
    invoke-static {v14}, Landroidx/compose/foundation/layout/RowColumnImplKt;->getRowColumnParentData(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Landroidx/compose/foundation/layout/RowColumnParentData;

    move-result-object v16

    invoke-static/range {v16 .. v16}, Landroidx/compose/foundation/layout/RowColumnImplKt;->getWeight(Landroidx/compose/foundation/layout/RowColumnParentData;)F

    move-result v16

    .line 740
    .local v16, "weight$iv":F
    cmpg-float v17, v16, v11

    if-nez v17, :cond_1

    move/from16 v17, v5

    goto :goto_1

    :cond_1
    const/16 v17, 0x0

    :goto_1
    if-eqz v17, :cond_3

    .line 744
    if-ne v0, v12, :cond_2

    goto :goto_2

    .line 745
    :cond_2
    sub-int v12, v0, v2

    .line 744
    :goto_2
    nop

    .line 743
    nop

    .line 746
    .local v12, "remaining$iv":I
    const v11, 0x7fffffff

    .local v11, "w":I
    move-object/from16 v17, v14

    .local v17, "$this$VerticalMinWidth_u24lambda_u241":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    move-object/from16 v18, v17

    .end local v17    # "$this$VerticalMinWidth_u24lambda_u241":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .local v18, "$this$VerticalMinWidth_u24lambda_u241":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/16 v17, 0x0

    .line 326
    .local v17, "$i$a$-intrinsicCrossAxisSize-IntrinsicMeasureBlocks$VerticalMinWidth$1":I
    move-object/from16 v5, v18

    .end local v18    # "$this$VerticalMinWidth_u24lambda_u241":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .local v5, "$this$VerticalMinWidth_u24lambda_u241":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    invoke-interface {v5, v11}, Landroidx/compose/ui/layout/IntrinsicMeasurable;->maxIntrinsicHeight(I)I

    move-result v5

    .line 746
    .end local v5    # "$this$VerticalMinWidth_u24lambda_u241":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .end local v11    # "w":I
    .end local v17    # "$i$a$-intrinsicCrossAxisSize-IntrinsicMeasureBlocks$VerticalMinWidth$1":I
    invoke-static {v5, v12}, Ljava/lang/Math;->min(II)I

    move-result v5

    .line 747
    .local v5, "mainAxisSpace$iv":I
    add-int/2addr v2, v5

    .line 749
    move v11, v5

    .local v11, "h":I
    move-object/from16 v17, v14

    .local v17, "$this$VerticalMinWidth_u24lambda_u242":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/16 v18, 0x0

    .line 327
    .local v18, "$i$a$-intrinsicCrossAxisSize-IntrinsicMeasureBlocks$VerticalMinWidth$2":I
    move-object/from16 v3, v17

    .end local v17    # "$this$VerticalMinWidth_u24lambda_u242":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .local v3, "$this$VerticalMinWidth_u24lambda_u242":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    invoke-interface {v3, v11}, Landroidx/compose/ui/layout/IntrinsicMeasurable;->minIntrinsicWidth(I)I

    move-result v3

    .line 749
    .end local v3    # "$this$VerticalMinWidth_u24lambda_u242":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .end local v11    # "h":I
    .end local v18    # "$i$a$-intrinsicCrossAxisSize-IntrinsicMeasureBlocks$VerticalMinWidth$2":I
    invoke-static {v4, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    move v4, v3

    .end local v4    # "crossAxisMax$iv":I
    .end local v5    # "mainAxisSpace$iv":I
    .end local v12    # "remaining$iv":I
    .local v3, "crossAxisMax$iv":I
    goto :goto_3

    .line 750
    .end local v3    # "crossAxisMax$iv":I
    .restart local v4    # "crossAxisMax$iv":I
    :cond_3
    cmpl-float v3, v16, v11

    if-lez v3, :cond_4

    .line 751
    add-float v6, v6, v16

    .line 753
    :cond_4
    :goto_3
    nop

    .line 738
    .end local v14    # "child$iv":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .end local v15    # "$i$a$-fastForEach-RowColumnImplKt$intrinsicCrossAxisSize$1$iv":I
    .end local v16    # "weight$iv":F
    nop

    .line 736
    .end local v13    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v9, v9, 0x1

    const/4 v5, 0x1

    goto :goto_0

    .line 754
    .end local v9    # "index$iv$iv":I
    :cond_5
    nop

    .line 755
    .end local v7    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v8    # "$i$f$fastForEach":I
    cmpg-float v3, v6, v11

    if-nez v3, :cond_6

    const/4 v5, 0x1

    goto :goto_4

    :cond_6
    const/4 v5, 0x0

    :goto_4
    if-eqz v5, :cond_7

    .line 756
    const/4 v3, 0x0

    goto :goto_5

    .line 757
    :cond_7
    if-ne v0, v12, :cond_8

    .line 758
    move v3, v12

    goto :goto_5

    .line 760
    :cond_8
    sub-int v3, v0, v2

    const/4 v5, 0x0

    invoke-static {v3, v5}, Ljava/lang/Math;->max(II)I

    move-result v3

    int-to-float v3, v3

    div-float/2addr v3, v6

    .local v3, "$this$fastRoundToInt$iv$iv":F
    const/4 v5, 0x0

    .line 761
    .local v5, "$i$f$fastRoundToInt":I
    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v7

    move v3, v7

    .line 755
    .end local v3    # "$this$fastRoundToInt$iv$iv":F
    .end local v5    # "$i$f$fastRoundToInt":I
    :goto_5
    nop

    .line 762
    nop

    .line 771
    .local v3, "weightUnitSpace$iv":I
    move-object/from16 v5, p1

    .local v5, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v7, 0x0

    .line 735
    .local v7, "$i$f$fastForEach":I
    nop

    .line 736
    const/4 v8, 0x0

    .local v8, "index$iv$iv":I
    move-object v9, v5

    check-cast v9, Ljava/util/Collection;

    invoke-interface {v9}, Ljava/util/Collection;->size()I

    move-result v9

    :goto_6
    if-ge v8, v9, :cond_b

    .line 737
    invoke-interface {v5, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    .line 738
    .local v10, "item$iv$iv":Ljava/lang/Object;
    move-object v13, v10

    check-cast v13, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .local v13, "child$iv":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/4 v14, 0x0

    .line 772
    .local v14, "$i$a$-fastForEach-RowColumnImplKt$intrinsicCrossAxisSize$2$iv":I
    invoke-static {v13}, Landroidx/compose/foundation/layout/RowColumnImplKt;->getRowColumnParentData(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Landroidx/compose/foundation/layout/RowColumnParentData;

    move-result-object v15

    invoke-static {v15}, Landroidx/compose/foundation/layout/RowColumnImplKt;->getWeight(Landroidx/compose/foundation/layout/RowColumnParentData;)F

    move-result v15

    .line 774
    .local v15, "weight$iv":F
    cmpl-float v16, v15, v11

    if-lez v16, :cond_a

    .line 775
    nop

    .line 777
    nop

    .line 778
    nop

    .line 779
    if-eq v3, v12, :cond_9

    .line 780
    int-to-float v11, v3

    mul-float/2addr v11, v15

    .local v11, "$this$fastRoundToInt$iv$iv":F
    const/16 v17, 0x0

    .line 761
    .local v17, "$i$f$fastRoundToInt":I
    invoke-static {v11}, Ljava/lang/Math;->round(F)I

    move-result v11

    .end local v11    # "$this$fastRoundToInt$iv$iv":F
    .end local v17    # "$i$f$fastRoundToInt":I
    goto :goto_7

    .line 782
    :cond_9
    move v11, v12

    .line 778
    :goto_7
    move-object/from16 v17, v13

    .local v11, "h":I
    .local v17, "$this$VerticalMinWidth_u24lambda_u242":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    move-object/from16 v18, v17

    .end local v17    # "$this$VerticalMinWidth_u24lambda_u242":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .local v18, "$this$VerticalMinWidth_u24lambda_u242":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/16 v17, 0x0

    .line 327
    .local v17, "$i$a$-intrinsicCrossAxisSize-IntrinsicMeasureBlocks$VerticalMinWidth$2":I
    move-object/from16 v12, v18

    .end local v18    # "$this$VerticalMinWidth_u24lambda_u242":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .local v12, "$this$VerticalMinWidth_u24lambda_u242":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    invoke-interface {v12, v11}, Landroidx/compose/ui/layout/IntrinsicMeasurable;->minIntrinsicWidth(I)I

    move-result v11

    .line 778
    .end local v11    # "h":I
    .end local v12    # "$this$VerticalMinWidth_u24lambda_u242":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .end local v17    # "$i$a$-intrinsicCrossAxisSize-IntrinsicMeasureBlocks$VerticalMinWidth$2":I
    nop

    .line 776
    invoke-static {v4, v11}, Ljava/lang/Math;->max(II)I

    move-result v11

    .line 775
    move v4, v11

    .line 787
    :cond_a
    nop

    .line 738
    .end local v13    # "child$iv":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .end local v14    # "$i$a$-fastForEach-RowColumnImplKt$intrinsicCrossAxisSize$2$iv":I
    .end local v15    # "weight$iv":F
    nop

    .line 736
    .end local v10    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v8, v8, 0x1

    const/4 v11, 0x0

    const v12, 0x7fffffff

    goto :goto_6

    .line 754
    .end local v8    # "index$iv$iv":I
    :cond_b
    nop

    .line 788
    .end local v5    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v7    # "$i$f$fastForEach":I
    move v3, v4

    .line 324
    .end local v1    # "$i$f$intrinsicCrossAxisSize":I
    .end local v2    # "fixedSpace$iv":I
    .end local v3    # "weightUnitSpace$iv":I
    .end local v4    # "crossAxisMax$iv":I
    .end local v6    # "totalWeight$iv":F
    :goto_8
    return v3
.end method
