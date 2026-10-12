.class final Landroidx/compose/material3/ChipKt$ChipContent$1$1;
.super Ljava/lang/Object;
.source "Chip.kt"

# interfaces
.implements Landroidx/compose/ui/layout/MeasurePolicy;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material3/ChipKt$ChipContent$1;->invoke(Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nChip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Chip.kt\nandroidx/compose/material3/ChipKt$ChipContent$1$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,2787:1\n116#2,2:2788\n33#2,6:2790\n118#2:2796\n116#2,2:2797\n33#2,6:2799\n118#2:2805\n544#2,2:2806\n33#2,6:2808\n546#2:2814\n*S KotlinDebug\n*F\n+ 1 Chip.kt\nandroidx/compose/material3/ChipKt$ChipContent$1$1\n*L\n2099#1:2788,2\n2099#1:2790,6\n2099#1:2796\n2106#1:2797,2\n2106#1:2799,6\n2106#1:2805\n2113#1:2806,2\n2113#1:2808,6\n2113#1:2814\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\n\u00a2\u0006\u0004\u0008\u0008\u0010\t"
    }
    d2 = {
        "<anonymous>",
        "Landroidx/compose/ui/layout/MeasureResult;",
        "Landroidx/compose/ui/layout/MeasureScope;",
        "measurables",
        "",
        "Landroidx/compose/ui/layout/Measurable;",
        "constraints",
        "Landroidx/compose/ui/unit/Constraints;",
        "measure-3p2s80s",
        "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Landroidx/compose/material3/ChipKt$ChipContent$1$1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/material3/ChipKt$ChipContent$1$1;

    invoke-direct {v0}, Landroidx/compose/material3/ChipKt$ChipContent$1$1;-><init>()V

    sput-object v0, Landroidx/compose/material3/ChipKt$ChipContent$1$1;->INSTANCE:Landroidx/compose/material3/ChipKt$ChipContent$1$1;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final measure-3p2s80s(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;
    .locals 26
    .param p1, "$this$Layout"    # Landroidx/compose/ui/layout/MeasureScope;
    .param p2, "measurables"    # Ljava/util/List;
    .param p3, "constraints"    # J
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/layout/MeasureScope;",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/ui/layout/Measurable;",
            ">;J)",
            "Landroidx/compose/ui/layout/MeasureResult;"
        }
    .end annotation

    .line 2100
    nop

    .line 2098
    nop

    .line 2099
    move-object/from16 v0, p2

    .local v0, "$this$fastFirstOrNull$iv":Ljava/util/List;
    const/4 v1, 0x0

    .line 2788
    .local v1, "$i$f$fastFirstOrNull":I
    nop

    .line 2789
    move-object v2, v0

    .local v2, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v3, 0x0

    .line 2790
    .local v3, "$i$f$fastForEach":I
    nop

    .line 2791
    const/4 v4, 0x0

    .local v4, "index$iv$iv":I
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v5

    :goto_0
    if-ge v4, v5, :cond_1

    .line 2792
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    .line 2793
    .local v7, "item$iv$iv":Ljava/lang/Object;
    move-object v8, v7

    .local v8, "it$iv":Ljava/lang/Object;
    const/4 v9, 0x0

    .line 2789
    .local v9, "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    move-object v10, v8

    check-cast v10, Landroidx/compose/ui/layout/Measurable;

    .local v10, "it":Landroidx/compose/ui/layout/Measurable;
    const/4 v11, 0x0

    .line 2099
    .local v11, "$i$a$-fastFirstOrNull-ChipKt$ChipContent$1$1$leadingIconPlaceable$1":I
    invoke-static {v10}, Landroidx/compose/ui/layout/LayoutIdKt;->getLayoutId(Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;

    move-result-object v12

    const-string/jumbo v13, "leadingIcon"

    invoke-static {v12, v13}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    .line 2789
    .end local v10    # "it":Landroidx/compose/ui/layout/Measurable;
    .end local v11    # "$i$a$-fastFirstOrNull-ChipKt$ChipContent$1$1$leadingIconPlaceable$1":I
    if-eqz v10, :cond_0

    goto :goto_1

    .line 2793
    .end local v8    # "it$iv":Ljava/lang/Object;
    .end local v9    # "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    :cond_0
    nop

    .line 2791
    .end local v7    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 2795
    .end local v4    # "index$iv$iv":I
    :cond_1
    nop

    .line 2796
    .end local v2    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v3    # "$i$f$fastForEach":I
    const/4 v8, 0x0

    .line 2099
    .end local v0    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .end local v1    # "$i$f$fastFirstOrNull":I
    :goto_1
    check-cast v8, Landroidx/compose/ui/layout/Measurable;

    .line 2100
    if-eqz v8, :cond_2

    .line 2099
    nop

    .line 2100
    const/16 v15, 0xa

    const/16 v16, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-wide/from16 v9, p3

    invoke-static/range {v9 .. v16}, Landroidx/compose/ui/unit/Constraints;->copy-Zbe2FdA$default(JIIIIILjava/lang/Object;)J

    move-result-wide v0

    invoke-interface {v8, v0, v1}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    move-result-object v0

    goto :goto_2

    :cond_2
    const/4 v0, 0x0

    .line 2097
    :goto_2
    move-object v8, v0

    .line 2101
    .local v8, "leadingIconPlaceable":Landroidx/compose/ui/layout/Placeable;
    invoke-static {v8}, Landroidx/compose/material3/internal/TextFieldImplKt;->widthOrZero(Landroidx/compose/ui/layout/Placeable;)I

    move-result v0

    .line 2102
    .local v0, "leadingIconWidth":I
    invoke-static {v8}, Landroidx/compose/material3/internal/TextFieldImplKt;->heightOrZero(Landroidx/compose/ui/layout/Placeable;)I

    move-result v1

    .line 2107
    .local v1, "leadingIconHeight":I
    nop

    .line 2105
    nop

    .line 2106
    move-object/from16 v2, p2

    .local v2, "$this$fastFirstOrNull$iv":Ljava/util/List;
    const/4 v3, 0x0

    .line 2797
    .local v3, "$i$f$fastFirstOrNull":I
    nop

    .line 2798
    move-object v4, v2

    .local v4, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v5, 0x0

    .line 2799
    .local v5, "$i$f$fastForEach":I
    nop

    .line 2800
    const/4 v7, 0x0

    .local v7, "index$iv$iv":I
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v9

    :goto_3
    if-ge v7, v9, :cond_4

    .line 2801
    invoke-interface {v4, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    .line 2802
    .local v10, "item$iv$iv":Ljava/lang/Object;
    move-object v11, v10

    .local v11, "it$iv":Ljava/lang/Object;
    const/4 v12, 0x0

    .line 2798
    .local v12, "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    move-object v13, v11

    check-cast v13, Landroidx/compose/ui/layout/Measurable;

    .local v13, "it":Landroidx/compose/ui/layout/Measurable;
    const/4 v14, 0x0

    .line 2106
    .local v14, "$i$a$-fastFirstOrNull-ChipKt$ChipContent$1$1$trailingIconPlaceable$1":I
    invoke-static {v13}, Landroidx/compose/ui/layout/LayoutIdKt;->getLayoutId(Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;

    move-result-object v15

    const-string/jumbo v6, "trailingIcon"

    invoke-static {v15, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    .line 2798
    .end local v13    # "it":Landroidx/compose/ui/layout/Measurable;
    .end local v14    # "$i$a$-fastFirstOrNull-ChipKt$ChipContent$1$1$trailingIconPlaceable$1":I
    if-eqz v6, :cond_3

    goto :goto_4

    .line 2802
    .end local v11    # "it$iv":Ljava/lang/Object;
    .end local v12    # "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    :cond_3
    nop

    .line 2800
    .end local v10    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v7, v7, 0x1

    goto :goto_3

    .line 2804
    .end local v7    # "index$iv$iv":I
    :cond_4
    nop

    .line 2805
    .end local v4    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v5    # "$i$f$fastForEach":I
    const/4 v11, 0x0

    .line 2106
    .end local v2    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .end local v3    # "$i$f$fastFirstOrNull":I
    :goto_4
    move-object v2, v11

    check-cast v2, Landroidx/compose/ui/layout/Measurable;

    .line 2107
    if-eqz v2, :cond_5

    .line 2106
    nop

    .line 2107
    const/16 v15, 0xa

    const/16 v16, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-wide/from16 v9, p3

    invoke-static/range {v9 .. v16}, Landroidx/compose/ui/unit/Constraints;->copy-Zbe2FdA$default(JIIIIILjava/lang/Object;)J

    move-result-wide v3

    invoke-interface {v2, v3, v4}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    move-result-object v6

    move-object v13, v6

    goto :goto_5

    :cond_5
    const/4 v13, 0x0

    .line 2104
    :goto_5
    move-object v2, v13

    .line 2108
    .local v2, "trailingIconPlaceable":Landroidx/compose/ui/layout/Placeable;
    invoke-static {v2}, Landroidx/compose/material3/internal/TextFieldImplKt;->widthOrZero(Landroidx/compose/ui/layout/Placeable;)I

    move-result v3

    .line 2109
    .local v3, "trailingIconWidth":I
    invoke-static {v2}, Landroidx/compose/material3/internal/TextFieldImplKt;->heightOrZero(Landroidx/compose/ui/layout/Placeable;)I

    move-result v4

    .line 2112
    .local v4, "trailingIconHeight":I
    nop

    .line 2113
    move-object/from16 v5, p2

    .local v5, "$this$fastFirst$iv":Ljava/util/List;
    const/4 v6, 0x0

    .line 2806
    .local v6, "$i$f$fastFirst":I
    nop

    .line 2807
    move-object v7, v5

    .local v7, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v9, 0x0

    .line 2808
    .local v9, "$i$f$fastForEach":I
    nop

    .line 2809
    const/4 v10, 0x0

    .local v10, "index$iv$iv":I
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v11

    :goto_6
    if-ge v10, v11, :cond_7

    .line 2810
    invoke-interface {v7, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    .line 2811
    .local v12, "item$iv$iv":Ljava/lang/Object;
    move-object v13, v12

    .local v13, "it$iv":Ljava/lang/Object;
    const/4 v14, 0x0

    .line 2807
    .local v14, "$i$a$-fastForEach-ListUtilsKt$fastFirst$2$iv":I
    move-object v15, v13

    check-cast v15, Landroidx/compose/ui/layout/Measurable;

    .local v15, "it":Landroidx/compose/ui/layout/Measurable;
    const/16 v16, 0x0

    .line 2113
    .local v16, "$i$a$-fastFirst-ChipKt$ChipContent$1$1$labelPlaceable$1":I
    move/from16 v17, v0

    .end local v0    # "leadingIconWidth":I
    .local v17, "leadingIconWidth":I
    invoke-static {v15}, Landroidx/compose/ui/layout/LayoutIdKt;->getLayoutId(Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v18, v2

    .end local v2    # "trailingIconPlaceable":Landroidx/compose/ui/layout/Placeable;
    .local v18, "trailingIconPlaceable":Landroidx/compose/ui/layout/Placeable;
    const-string/jumbo v2, "label"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    .line 2807
    .end local v15    # "it":Landroidx/compose/ui/layout/Measurable;
    .end local v16    # "$i$a$-fastFirst-ChipKt$ChipContent$1$1$labelPlaceable$1":I
    if-eqz v0, :cond_6

    .line 2814
    .end local v5    # "$this$fastFirst$iv":Ljava/util/List;
    .end local v6    # "$i$f$fastFirst":I
    .end local v7    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v9    # "$i$f$fastForEach":I
    .end local v10    # "index$iv$iv":I
    .end local v12    # "item$iv$iv":Ljava/lang/Object;
    .end local v13    # "it$iv":Ljava/lang/Object;
    .end local v14    # "$i$a$-fastForEach-ListUtilsKt$fastFirst$2$iv":I
    move-object v0, v13

    check-cast v0, Landroidx/compose/ui/layout/Measurable;

    .line 2115
    add-int v2, v17, v3

    neg-int v11, v2

    const/4 v13, 0x2

    const/4 v14, 0x0

    const/4 v12, 0x0

    move-wide/from16 v9, p3

    invoke-static/range {v9 .. v14}, Landroidx/compose/ui/unit/ConstraintsKt;->offset-NN6Ew-U$default(JIIILjava/lang/Object;)J

    move-result-wide v5

    .line 2114
    invoke-interface {v0, v5, v6}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    move-result-object v11

    .line 2111
    nop

    .line 2118
    .local v11, "labelPlaceable":Landroidx/compose/ui/layout/Placeable;
    invoke-virtual {v11}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    move-result v0

    add-int v0, v17, v0

    add-int v20, v0, v3

    .line 2119
    .local v20, "width":I
    invoke-virtual {v11}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    move-result v0

    invoke-static {v0, v4}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v21

    .line 2121
    .local v21, "height":I
    new-instance v7, Landroidx/compose/material3/ChipKt$ChipContent$1$1$1;

    move v9, v1

    move v14, v4

    move/from16 v12, v17

    move-object/from16 v13, v18

    move/from16 v10, v21

    .end local v1    # "leadingIconHeight":I
    .end local v4    # "trailingIconHeight":I
    .end local v17    # "leadingIconWidth":I
    .end local v18    # "trailingIconPlaceable":Landroidx/compose/ui/layout/Placeable;
    .end local v21    # "height":I
    .local v9, "leadingIconHeight":I
    .local v10, "height":I
    .local v12, "leadingIconWidth":I
    .local v13, "trailingIconPlaceable":Landroidx/compose/ui/layout/Placeable;
    .local v14, "trailingIconHeight":I
    invoke-direct/range {v7 .. v14}, Landroidx/compose/material3/ChipKt$ChipContent$1$1$1;-><init>(Landroidx/compose/ui/layout/Placeable;IILandroidx/compose/ui/layout/Placeable;ILandroidx/compose/ui/layout/Placeable;I)V

    move v0, v9

    move v1, v14

    .end local v9    # "leadingIconHeight":I
    .end local v10    # "height":I
    .end local v12    # "leadingIconWidth":I
    .end local v13    # "trailingIconPlaceable":Landroidx/compose/ui/layout/Placeable;
    .end local v14    # "trailingIconHeight":I
    .local v0, "leadingIconHeight":I
    .local v1, "trailingIconHeight":I
    .restart local v17    # "leadingIconWidth":I
    .restart local v18    # "trailingIconPlaceable":Landroidx/compose/ui/layout/Placeable;
    .restart local v21    # "height":I
    move-object/from16 v23, v7

    check-cast v23, Lkotlin/jvm/functions/Function1;

    const/16 v24, 0x4

    const/16 v25, 0x0

    const/16 v22, 0x0

    move-object/from16 v19, p1

    invoke-static/range {v19 .. v25}, Landroidx/compose/ui/layout/MeasureScope;->layout$default(Landroidx/compose/ui/layout/MeasureScope;IILjava/util/Map;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/compose/ui/layout/MeasureResult;

    move-result-object v2

    return-object v2

    .line 2807
    .end local v0    # "leadingIconHeight":I
    .end local v11    # "labelPlaceable":Landroidx/compose/ui/layout/Placeable;
    .end local v20    # "width":I
    .end local v21    # "height":I
    .local v1, "leadingIconHeight":I
    .restart local v4    # "trailingIconHeight":I
    .restart local v5    # "$this$fastFirst$iv":Ljava/util/List;
    .restart local v6    # "$i$f$fastFirst":I
    .restart local v7    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .local v9, "$i$f$fastForEach":I
    .local v10, "index$iv$iv":I
    .local v12, "item$iv$iv":Ljava/lang/Object;
    .local v13, "it$iv":Ljava/lang/Object;
    .local v14, "$i$a$-fastForEach-ListUtilsKt$fastFirst$2$iv":I
    :cond_6
    move v0, v1

    move v1, v4

    .line 2811
    .end local v4    # "trailingIconHeight":I
    .end local v13    # "it$iv":Ljava/lang/Object;
    .end local v14    # "$i$a$-fastForEach-ListUtilsKt$fastFirst$2$iv":I
    .restart local v0    # "leadingIconHeight":I
    .local v1, "trailingIconHeight":I
    nop

    .line 2809
    .end local v12    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v10, v10, 0x1

    move-object/from16 v2, v18

    move v1, v0

    move/from16 v0, v17

    goto :goto_6

    .end local v17    # "leadingIconWidth":I
    .end local v18    # "trailingIconPlaceable":Landroidx/compose/ui/layout/Placeable;
    .local v0, "leadingIconWidth":I
    .local v1, "leadingIconHeight":I
    .restart local v2    # "trailingIconPlaceable":Landroidx/compose/ui/layout/Placeable;
    .restart local v4    # "trailingIconHeight":I
    :cond_7
    move/from16 v17, v0

    move v0, v1

    move-object/from16 v18, v2

    move v1, v4

    .line 2813
    .end local v2    # "trailingIconPlaceable":Landroidx/compose/ui/layout/Placeable;
    .end local v4    # "trailingIconHeight":I
    .end local v10    # "index$iv$iv":I
    .local v0, "leadingIconHeight":I
    .local v1, "trailingIconHeight":I
    .restart local v17    # "leadingIconWidth":I
    .restart local v18    # "trailingIconPlaceable":Landroidx/compose/ui/layout/Placeable;
    nop

    .line 2814
    .end local v7    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v9    # "$i$f$fastForEach":I
    new-instance v2, Ljava/util/NoSuchElementException;

    const-string v4, "Collection contains no element matching the predicate."

    invoke-direct {v2, v4}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v2
.end method
