.class public interface abstract Landroidx/compose/ui/layout/MultiContentMeasurePolicy;
.super Ljava/lang/Object;
.source "MultiContentMeasurePolicy.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nMultiContentMeasurePolicy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiContentMeasurePolicy.kt\nandroidx/compose/ui/layout/MultiContentMeasurePolicy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,240:1\n150#2,3:241\n34#2,4:244\n150#2,3:248\n34#2,6:251\n153#2:257\n39#2:258\n153#2:259\n150#2,3:260\n34#2,4:263\n150#2,3:267\n34#2,6:270\n153#2:276\n39#2:277\n153#2:278\n150#2,3:279\n34#2,4:282\n150#2,3:286\n34#2,6:289\n153#2:295\n39#2:296\n153#2:297\n150#2,3:298\n34#2,4:301\n150#2,3:305\n34#2,6:308\n153#2:314\n39#2:315\n153#2:316\n*S KotlinDebug\n*F\n+ 1 MultiContentMeasurePolicy.kt\nandroidx/compose/ui/layout/MultiContentMeasurePolicy\n*L\n111#1:241,3\n111#1:244,4\n112#1:248,3\n112#1:251,6\n112#1:257\n111#1:258\n111#1:259\n137#1:260,3\n137#1:263,4\n138#1:267,3\n138#1:270,6\n138#1:276\n137#1:277\n137#1:278\n162#1:279,3\n162#1:282,4\n163#1:286,3\n163#1:289,6\n163#1:295\n162#1:296\n162#1:297\n187#1:298,3\n187#1:301,4\n188#1:305,3\n188#1:308,6\n188#1:314\n187#1:315\n187#1:316\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00e7\u0080\u0001\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u00060\u00062\u0006\u0010\u0008\u001a\u00020\u0003H\u0016J(\u0010\t\u001a\u00020\u0003*\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u00060\u00062\u0006\u0010\n\u001a\u00020\u0003H\u0016J2\u0010\u000b\u001a\u00020\u000c*\u00020\r2\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000e0\u00060\u00062\u0006\u0010\u000f\u001a\u00020\u0010H&\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J(\u0010\u0013\u001a\u00020\u0003*\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u00060\u00062\u0006\u0010\u0008\u001a\u00020\u0003H\u0016J(\u0010\u0014\u001a\u00020\u0003*\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u00060\u00062\u0006\u0010\n\u001a\u00020\u0003H\u0016\u00f8\u0001\u0001\u0082\u0002\r\n\u0005\u0008\u00a1\u001e0\u0001\n\u0004\u0008!0\u0001\u00a8\u0006\u0015\u00c0\u0006\u0001"
    }
    d2 = {
        "Landroidx/compose/ui/layout/MultiContentMeasurePolicy;",
        "",
        "maxIntrinsicHeight",
        "",
        "Landroidx/compose/ui/layout/IntrinsicMeasureScope;",
        "measurables",
        "",
        "Landroidx/compose/ui/layout/IntrinsicMeasurable;",
        "width",
        "maxIntrinsicWidth",
        "height",
        "measure",
        "Landroidx/compose/ui/layout/MeasureResult;",
        "Landroidx/compose/ui/layout/MeasureScope;",
        "Landroidx/compose/ui/layout/Measurable;",
        "constraints",
        "Landroidx/compose/ui/unit/Constraints;",
        "measure-3p2s80s",
        "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;",
        "minIntrinsicHeight",
        "minIntrinsicWidth",
        "ui_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public maxIntrinsicHeight(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;I)I
    .locals 29
    .param p1, "$this$maxIntrinsicHeight"    # Landroidx/compose/ui/layout/IntrinsicMeasureScope;
    .param p2, "measurables"    # Ljava/util/List;
    .param p3, "width"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/layout/IntrinsicMeasureScope;",
            "Ljava/util/List<",
            "+",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/ui/layout/IntrinsicMeasurable;",
            ">;>;I)I"
        }
    .end annotation

    .line 187
    move-object/from16 v0, p2

    .local v0, "$this$fastMap$iv":Ljava/util/List;
    const/4 v1, 0x0

    .line 298
    .local v1, "$i$f$fastMap":I
    nop

    .line 299
    new-instance v2, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 300
    .local v2, "target$iv":Ljava/util/ArrayList;
    move-object v3, v0

    .local v3, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v4, 0x0

    .line 301
    .local v4, "$i$f$fastForEach":I
    nop

    .line 302
    const/4 v5, 0x0

    .local v5, "index$iv$iv":I
    move-object v6, v3

    check-cast v6, Ljava/util/Collection;

    invoke-interface {v6}, Ljava/util/Collection;->size()I

    move-result v6

    :goto_0
    if-ge v5, v6, :cond_1

    .line 303
    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    .line 304
    .local v7, "item$iv$iv":Ljava/lang/Object;
    move-object v8, v7

    .local v8, "it$iv":Ljava/lang/Object;
    const/4 v9, 0x0

    .line 300
    .local v9, "$i$a$-fastForEach-ListUtilsKt$fastMap$2$iv":I
    move-object v10, v2

    check-cast v10, Ljava/util/Collection;

    move-object v11, v8

    check-cast v11, Ljava/util/List;

    .local v11, "list":Ljava/util/List;
    const/4 v12, 0x0

    .line 188
    .local v12, "$i$a$-fastMap-MultiContentMeasurePolicy$maxIntrinsicHeight$mapped$1":I
    move-object v13, v11

    .local v13, "$this$fastMap$iv":Ljava/util/List;
    const/4 v14, 0x0

    .line 305
    .local v14, "$i$f$fastMap":I
    nop

    .line 306
    new-instance v15, Ljava/util/ArrayList;

    move-object/from16 v16, v0

    .end local v0    # "$this$fastMap$iv":Ljava/util/List;
    .local v16, "$this$fastMap$iv":Ljava/util/List;
    invoke-interface {v13}, Ljava/util/List;->size()I

    move-result v0

    invoke-direct {v15, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 307
    .local v15, "target$iv":Ljava/util/ArrayList;
    move-object v0, v13

    .local v0, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/16 v17, 0x0

    .line 308
    .local v17, "$i$f$fastForEach":I
    nop

    .line 309
    const/16 v18, 0x0

    .local v18, "index$iv$iv":I
    move-object/from16 v19, v0

    check-cast v19, Ljava/util/Collection;

    move/from16 v20, v1

    .end local v1    # "$i$f$fastMap":I
    .local v20, "$i$f$fastMap":I
    invoke-interface/range {v19 .. v19}, Ljava/util/Collection;->size()I

    move-result v1

    move-object/from16 v19, v2

    move/from16 v2, v18

    .end local v18    # "index$iv$iv":I
    .local v2, "index$iv$iv":I
    .local v19, "target$iv":Ljava/util/ArrayList;
    :goto_1
    if-ge v2, v1, :cond_0

    .line 310
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v18

    .line 311
    .local v18, "item$iv$iv":Ljava/lang/Object;
    move-object/from16 v21, v18

    .local v21, "it$iv":Ljava/lang/Object;
    const/16 v22, 0x0

    .line 307
    .local v22, "$i$a$-fastForEach-ListUtilsKt$fastMap$2$iv":I
    move-object/from16 v23, v0

    .end local v0    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .local v23, "$this$fastForEach$iv$iv":Ljava/util/List;
    move-object v0, v15

    check-cast v0, Ljava/util/Collection;

    move/from16 v24, v1

    move-object/from16 v1, v21

    check-cast v1, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .local v1, "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/16 v25, 0x0

    .line 189
    .local v25, "$i$a$-fastMap-MultiContentMeasurePolicy$maxIntrinsicHeight$mapped$1$1":I
    move/from16 v26, v2

    .end local v2    # "index$iv$iv":I
    .local v26, "index$iv$iv":I
    new-instance v2, Landroidx/compose/ui/layout/DefaultIntrinsicMeasurable;

    move-object/from16 v27, v3

    .end local v3    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .local v27, "$this$fastForEach$iv$iv":Ljava/util/List;
    sget-object v3, Landroidx/compose/ui/layout/IntrinsicMinMax;->Max:Landroidx/compose/ui/layout/IntrinsicMinMax;

    move/from16 v28, v4

    .end local v4    # "$i$f$fastForEach":I
    .local v28, "$i$f$fastForEach":I
    sget-object v4, Landroidx/compose/ui/layout/IntrinsicWidthHeight;->Height:Landroidx/compose/ui/layout/IntrinsicWidthHeight;

    invoke-direct {v2, v1, v3, v4}, Landroidx/compose/ui/layout/DefaultIntrinsicMeasurable;-><init>(Landroidx/compose/ui/layout/IntrinsicMeasurable;Landroidx/compose/ui/layout/IntrinsicMinMax;Landroidx/compose/ui/layout/IntrinsicWidthHeight;)V

    .line 307
    .end local v1    # "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .end local v25    # "$i$a$-fastMap-MultiContentMeasurePolicy$maxIntrinsicHeight$mapped$1$1":I
    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 311
    .end local v21    # "it$iv":Ljava/lang/Object;
    .end local v22    # "$i$a$-fastForEach-ListUtilsKt$fastMap$2$iv":I
    nop

    .line 309
    .end local v18    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v2, v26, 0x1

    move-object/from16 v0, v23

    move/from16 v1, v24

    move-object/from16 v3, v27

    move/from16 v4, v28

    .end local v26    # "index$iv$iv":I
    .restart local v2    # "index$iv$iv":I
    goto :goto_1

    .end local v23    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v27    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v28    # "$i$f$fastForEach":I
    .restart local v0    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .restart local v3    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .restart local v4    # "$i$f$fastForEach":I
    :cond_0
    move-object/from16 v23, v0

    move/from16 v26, v2

    move-object/from16 v27, v3

    move/from16 v28, v4

    .line 313
    .end local v0    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v2    # "index$iv$iv":I
    .end local v3    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v4    # "$i$f$fastForEach":I
    .restart local v23    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .restart local v27    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .restart local v28    # "$i$f$fastForEach":I
    nop

    .line 314
    .end local v17    # "$i$f$fastForEach":I
    .end local v23    # "$this$fastForEach$iv$iv":Ljava/util/List;
    move-object v0, v15

    check-cast v0, Ljava/util/List;

    .line 190
    .end local v13    # "$this$fastMap$iv":Ljava/util/List;
    .end local v14    # "$i$f$fastMap":I
    .end local v15    # "target$iv":Ljava/util/ArrayList;
    nop

    .line 300
    .end local v11    # "list":Ljava/util/List;
    .end local v12    # "$i$a$-fastMap-MultiContentMeasurePolicy$maxIntrinsicHeight$mapped$1":I
    invoke-interface {v10, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 304
    .end local v8    # "it$iv":Ljava/lang/Object;
    .end local v9    # "$i$a$-fastForEach-ListUtilsKt$fastMap$2$iv":I
    nop

    .line 302
    .end local v7    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v5, v5, 0x1

    move-object/from16 v0, v16

    move-object/from16 v2, v19

    move/from16 v1, v20

    goto :goto_0

    .end local v16    # "$this$fastMap$iv":Ljava/util/List;
    .end local v19    # "target$iv":Ljava/util/ArrayList;
    .end local v20    # "$i$f$fastMap":I
    .end local v27    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v28    # "$i$f$fastForEach":I
    .local v0, "$this$fastMap$iv":Ljava/util/List;
    .local v1, "$i$f$fastMap":I
    .local v2, "target$iv":Ljava/util/ArrayList;
    .restart local v3    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .restart local v4    # "$i$f$fastForEach":I
    :cond_1
    move-object/from16 v16, v0

    move/from16 v20, v1

    move-object/from16 v19, v2

    move-object/from16 v27, v3

    move/from16 v28, v4

    .line 315
    .end local v0    # "$this$fastMap$iv":Ljava/util/List;
    .end local v1    # "$i$f$fastMap":I
    .end local v2    # "target$iv":Ljava/util/ArrayList;
    .end local v3    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v4    # "$i$f$fastForEach":I
    .end local v5    # "index$iv$iv":I
    .restart local v16    # "$this$fastMap$iv":Ljava/util/List;
    .restart local v19    # "target$iv":Ljava/util/ArrayList;
    .restart local v20    # "$i$f$fastMap":I
    .restart local v27    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .restart local v28    # "$i$f$fastForEach":I
    nop

    .line 316
    .end local v27    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v28    # "$i$f$fastForEach":I
    move-object/from16 v0, v19

    check-cast v0, Ljava/util/List;

    .line 187
    .end local v16    # "$this$fastMap$iv":Ljava/util/List;
    .end local v19    # "target$iv":Ljava/util/ArrayList;
    .end local v20    # "$i$f$fastMap":I
    nop

    .line 186
    nop

    .line 192
    .local v0, "mapped":Ljava/util/List;
    const/16 v5, 0xd

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move/from16 v2, p3

    invoke-static/range {v1 .. v6}, Landroidx/compose/ui/unit/ConstraintsKt;->Constraints$default(IIIIILjava/lang/Object;)J

    move-result-wide v3

    .line 193
    .local v3, "constraints":J
    new-instance v1, Landroidx/compose/ui/layout/IntrinsicsMeasureScope;

    invoke-interface/range {p1 .. p1}, Landroidx/compose/ui/layout/IntrinsicMeasureScope;->getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;

    move-result-object v2

    move-object/from16 v5, p1

    invoke-direct {v1, v5, v2}, Landroidx/compose/ui/layout/IntrinsicsMeasureScope;-><init>(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Landroidx/compose/ui/unit/LayoutDirection;)V

    .line 194
    .local v1, "layoutReceiver":Landroidx/compose/ui/layout/IntrinsicsMeasureScope;
    move-object v2, v1

    check-cast v2, Landroidx/compose/ui/layout/MeasureScope;

    move-object/from16 v6, p0

    invoke-interface {v6, v2, v0, v3, v4}, Landroidx/compose/ui/layout/MultiContentMeasurePolicy;->measure-3p2s80s(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;

    move-result-object v2

    .line 195
    .local v2, "layoutResult":Landroidx/compose/ui/layout/MeasureResult;
    invoke-interface {v2}, Landroidx/compose/ui/layout/MeasureResult;->getHeight()I

    move-result v7

    return v7
.end method

.method public maxIntrinsicWidth(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;I)I
    .locals 29
    .param p1, "$this$maxIntrinsicWidth"    # Landroidx/compose/ui/layout/IntrinsicMeasureScope;
    .param p2, "measurables"    # Ljava/util/List;
    .param p3, "height"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/layout/IntrinsicMeasureScope;",
            "Ljava/util/List<",
            "+",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/ui/layout/IntrinsicMeasurable;",
            ">;>;I)I"
        }
    .end annotation

    .line 162
    move-object/from16 v0, p2

    .local v0, "$this$fastMap$iv":Ljava/util/List;
    const/4 v1, 0x0

    .line 279
    .local v1, "$i$f$fastMap":I
    nop

    .line 280
    new-instance v2, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 281
    .local v2, "target$iv":Ljava/util/ArrayList;
    move-object v3, v0

    .local v3, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v4, 0x0

    .line 282
    .local v4, "$i$f$fastForEach":I
    nop

    .line 283
    const/4 v5, 0x0

    .local v5, "index$iv$iv":I
    move-object v6, v3

    check-cast v6, Ljava/util/Collection;

    invoke-interface {v6}, Ljava/util/Collection;->size()I

    move-result v6

    :goto_0
    if-ge v5, v6, :cond_1

    .line 284
    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    .line 285
    .local v7, "item$iv$iv":Ljava/lang/Object;
    move-object v8, v7

    .local v8, "it$iv":Ljava/lang/Object;
    const/4 v9, 0x0

    .line 281
    .local v9, "$i$a$-fastForEach-ListUtilsKt$fastMap$2$iv":I
    move-object v10, v2

    check-cast v10, Ljava/util/Collection;

    move-object v11, v8

    check-cast v11, Ljava/util/List;

    .local v11, "list":Ljava/util/List;
    const/4 v12, 0x0

    .line 163
    .local v12, "$i$a$-fastMap-MultiContentMeasurePolicy$maxIntrinsicWidth$mapped$1":I
    move-object v13, v11

    .local v13, "$this$fastMap$iv":Ljava/util/List;
    const/4 v14, 0x0

    .line 286
    .local v14, "$i$f$fastMap":I
    nop

    .line 287
    new-instance v15, Ljava/util/ArrayList;

    move-object/from16 v16, v0

    .end local v0    # "$this$fastMap$iv":Ljava/util/List;
    .local v16, "$this$fastMap$iv":Ljava/util/List;
    invoke-interface {v13}, Ljava/util/List;->size()I

    move-result v0

    invoke-direct {v15, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 288
    .local v15, "target$iv":Ljava/util/ArrayList;
    move-object v0, v13

    .local v0, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/16 v17, 0x0

    .line 289
    .local v17, "$i$f$fastForEach":I
    nop

    .line 290
    const/16 v18, 0x0

    .local v18, "index$iv$iv":I
    move-object/from16 v19, v0

    check-cast v19, Ljava/util/Collection;

    move/from16 v20, v1

    .end local v1    # "$i$f$fastMap":I
    .local v20, "$i$f$fastMap":I
    invoke-interface/range {v19 .. v19}, Ljava/util/Collection;->size()I

    move-result v1

    move-object/from16 v19, v2

    move/from16 v2, v18

    .end local v18    # "index$iv$iv":I
    .local v2, "index$iv$iv":I
    .local v19, "target$iv":Ljava/util/ArrayList;
    :goto_1
    if-ge v2, v1, :cond_0

    .line 291
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v18

    .line 292
    .local v18, "item$iv$iv":Ljava/lang/Object;
    move-object/from16 v21, v18

    .local v21, "it$iv":Ljava/lang/Object;
    const/16 v22, 0x0

    .line 288
    .local v22, "$i$a$-fastForEach-ListUtilsKt$fastMap$2$iv":I
    move-object/from16 v23, v0

    .end local v0    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .local v23, "$this$fastForEach$iv$iv":Ljava/util/List;
    move-object v0, v15

    check-cast v0, Ljava/util/Collection;

    move/from16 v24, v1

    move-object/from16 v1, v21

    check-cast v1, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .local v1, "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/16 v25, 0x0

    .line 164
    .local v25, "$i$a$-fastMap-MultiContentMeasurePolicy$maxIntrinsicWidth$mapped$1$1":I
    move/from16 v26, v2

    .end local v2    # "index$iv$iv":I
    .local v26, "index$iv$iv":I
    new-instance v2, Landroidx/compose/ui/layout/DefaultIntrinsicMeasurable;

    move-object/from16 v27, v3

    .end local v3    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .local v27, "$this$fastForEach$iv$iv":Ljava/util/List;
    sget-object v3, Landroidx/compose/ui/layout/IntrinsicMinMax;->Max:Landroidx/compose/ui/layout/IntrinsicMinMax;

    move/from16 v28, v4

    .end local v4    # "$i$f$fastForEach":I
    .local v28, "$i$f$fastForEach":I
    sget-object v4, Landroidx/compose/ui/layout/IntrinsicWidthHeight;->Width:Landroidx/compose/ui/layout/IntrinsicWidthHeight;

    invoke-direct {v2, v1, v3, v4}, Landroidx/compose/ui/layout/DefaultIntrinsicMeasurable;-><init>(Landroidx/compose/ui/layout/IntrinsicMeasurable;Landroidx/compose/ui/layout/IntrinsicMinMax;Landroidx/compose/ui/layout/IntrinsicWidthHeight;)V

    .line 288
    .end local v1    # "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .end local v25    # "$i$a$-fastMap-MultiContentMeasurePolicy$maxIntrinsicWidth$mapped$1$1":I
    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 292
    .end local v21    # "it$iv":Ljava/lang/Object;
    .end local v22    # "$i$a$-fastForEach-ListUtilsKt$fastMap$2$iv":I
    nop

    .line 290
    .end local v18    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v2, v26, 0x1

    move-object/from16 v0, v23

    move/from16 v1, v24

    move-object/from16 v3, v27

    move/from16 v4, v28

    .end local v26    # "index$iv$iv":I
    .restart local v2    # "index$iv$iv":I
    goto :goto_1

    .end local v23    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v27    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v28    # "$i$f$fastForEach":I
    .restart local v0    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .restart local v3    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .restart local v4    # "$i$f$fastForEach":I
    :cond_0
    move-object/from16 v23, v0

    move/from16 v26, v2

    move-object/from16 v27, v3

    move/from16 v28, v4

    .line 294
    .end local v0    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v2    # "index$iv$iv":I
    .end local v3    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v4    # "$i$f$fastForEach":I
    .restart local v23    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .restart local v27    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .restart local v28    # "$i$f$fastForEach":I
    nop

    .line 295
    .end local v17    # "$i$f$fastForEach":I
    .end local v23    # "$this$fastForEach$iv$iv":Ljava/util/List;
    move-object v0, v15

    check-cast v0, Ljava/util/List;

    .line 165
    .end local v13    # "$this$fastMap$iv":Ljava/util/List;
    .end local v14    # "$i$f$fastMap":I
    .end local v15    # "target$iv":Ljava/util/ArrayList;
    nop

    .line 281
    .end local v11    # "list":Ljava/util/List;
    .end local v12    # "$i$a$-fastMap-MultiContentMeasurePolicy$maxIntrinsicWidth$mapped$1":I
    invoke-interface {v10, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 285
    .end local v8    # "it$iv":Ljava/lang/Object;
    .end local v9    # "$i$a$-fastForEach-ListUtilsKt$fastMap$2$iv":I
    nop

    .line 283
    .end local v7    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v5, v5, 0x1

    move-object/from16 v0, v16

    move-object/from16 v2, v19

    move/from16 v1, v20

    goto :goto_0

    .end local v16    # "$this$fastMap$iv":Ljava/util/List;
    .end local v19    # "target$iv":Ljava/util/ArrayList;
    .end local v20    # "$i$f$fastMap":I
    .end local v27    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v28    # "$i$f$fastForEach":I
    .local v0, "$this$fastMap$iv":Ljava/util/List;
    .local v1, "$i$f$fastMap":I
    .local v2, "target$iv":Ljava/util/ArrayList;
    .restart local v3    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .restart local v4    # "$i$f$fastForEach":I
    :cond_1
    move-object/from16 v16, v0

    move/from16 v20, v1

    move-object/from16 v19, v2

    move-object/from16 v27, v3

    move/from16 v28, v4

    .line 296
    .end local v0    # "$this$fastMap$iv":Ljava/util/List;
    .end local v1    # "$i$f$fastMap":I
    .end local v2    # "target$iv":Ljava/util/ArrayList;
    .end local v3    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v4    # "$i$f$fastForEach":I
    .end local v5    # "index$iv$iv":I
    .restart local v16    # "$this$fastMap$iv":Ljava/util/List;
    .restart local v19    # "target$iv":Ljava/util/ArrayList;
    .restart local v20    # "$i$f$fastMap":I
    .restart local v27    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .restart local v28    # "$i$f$fastForEach":I
    nop

    .line 297
    .end local v27    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v28    # "$i$f$fastForEach":I
    move-object/from16 v0, v19

    check-cast v0, Ljava/util/List;

    .line 162
    .end local v16    # "$this$fastMap$iv":Ljava/util/List;
    .end local v19    # "target$iv":Ljava/util/ArrayList;
    .end local v20    # "$i$f$fastMap":I
    nop

    .line 161
    nop

    .line 167
    .local v0, "mapped":Ljava/util/List;
    const/4 v5, 0x7

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move/from16 v4, p3

    invoke-static/range {v1 .. v6}, Landroidx/compose/ui/unit/ConstraintsKt;->Constraints$default(IIIIILjava/lang/Object;)J

    move-result-wide v1

    .line 168
    .local v1, "constraints":J
    new-instance v3, Landroidx/compose/ui/layout/IntrinsicsMeasureScope;

    invoke-interface/range {p1 .. p1}, Landroidx/compose/ui/layout/IntrinsicMeasureScope;->getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;

    move-result-object v4

    move-object/from16 v5, p1

    invoke-direct {v3, v5, v4}, Landroidx/compose/ui/layout/IntrinsicsMeasureScope;-><init>(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Landroidx/compose/ui/unit/LayoutDirection;)V

    .line 169
    .local v3, "layoutReceiver":Landroidx/compose/ui/layout/IntrinsicsMeasureScope;
    move-object v4, v3

    check-cast v4, Landroidx/compose/ui/layout/MeasureScope;

    move-object/from16 v6, p0

    invoke-interface {v6, v4, v0, v1, v2}, Landroidx/compose/ui/layout/MultiContentMeasurePolicy;->measure-3p2s80s(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;

    move-result-object v4

    .line 170
    .local v4, "layoutResult":Landroidx/compose/ui/layout/MeasureResult;
    invoke-interface {v4}, Landroidx/compose/ui/layout/MeasureResult;->getWidth()I

    move-result v7

    return v7
.end method

.method public abstract measure-3p2s80s(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/layout/MeasureScope;",
            "Ljava/util/List<",
            "+",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/ui/layout/Measurable;",
            ">;>;J)",
            "Landroidx/compose/ui/layout/MeasureResult;"
        }
    .end annotation
.end method

.method public minIntrinsicHeight(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;I)I
    .locals 29
    .param p1, "$this$minIntrinsicHeight"    # Landroidx/compose/ui/layout/IntrinsicMeasureScope;
    .param p2, "measurables"    # Ljava/util/List;
    .param p3, "width"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/layout/IntrinsicMeasureScope;",
            "Ljava/util/List<",
            "+",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/ui/layout/IntrinsicMeasurable;",
            ">;>;I)I"
        }
    .end annotation

    .line 137
    move-object/from16 v0, p2

    .local v0, "$this$fastMap$iv":Ljava/util/List;
    const/4 v1, 0x0

    .line 260
    .local v1, "$i$f$fastMap":I
    nop

    .line 261
    new-instance v2, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 262
    .local v2, "target$iv":Ljava/util/ArrayList;
    move-object v3, v0

    .local v3, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v4, 0x0

    .line 263
    .local v4, "$i$f$fastForEach":I
    nop

    .line 264
    const/4 v5, 0x0

    .local v5, "index$iv$iv":I
    move-object v6, v3

    check-cast v6, Ljava/util/Collection;

    invoke-interface {v6}, Ljava/util/Collection;->size()I

    move-result v6

    :goto_0
    if-ge v5, v6, :cond_1

    .line 265
    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    .line 266
    .local v7, "item$iv$iv":Ljava/lang/Object;
    move-object v8, v7

    .local v8, "it$iv":Ljava/lang/Object;
    const/4 v9, 0x0

    .line 262
    .local v9, "$i$a$-fastForEach-ListUtilsKt$fastMap$2$iv":I
    move-object v10, v2

    check-cast v10, Ljava/util/Collection;

    move-object v11, v8

    check-cast v11, Ljava/util/List;

    .local v11, "list":Ljava/util/List;
    const/4 v12, 0x0

    .line 138
    .local v12, "$i$a$-fastMap-MultiContentMeasurePolicy$minIntrinsicHeight$mapped$1":I
    move-object v13, v11

    .local v13, "$this$fastMap$iv":Ljava/util/List;
    const/4 v14, 0x0

    .line 267
    .local v14, "$i$f$fastMap":I
    nop

    .line 268
    new-instance v15, Ljava/util/ArrayList;

    move-object/from16 v16, v0

    .end local v0    # "$this$fastMap$iv":Ljava/util/List;
    .local v16, "$this$fastMap$iv":Ljava/util/List;
    invoke-interface {v13}, Ljava/util/List;->size()I

    move-result v0

    invoke-direct {v15, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 269
    .local v15, "target$iv":Ljava/util/ArrayList;
    move-object v0, v13

    .local v0, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/16 v17, 0x0

    .line 270
    .local v17, "$i$f$fastForEach":I
    nop

    .line 271
    const/16 v18, 0x0

    .local v18, "index$iv$iv":I
    move-object/from16 v19, v0

    check-cast v19, Ljava/util/Collection;

    move/from16 v20, v1

    .end local v1    # "$i$f$fastMap":I
    .local v20, "$i$f$fastMap":I
    invoke-interface/range {v19 .. v19}, Ljava/util/Collection;->size()I

    move-result v1

    move-object/from16 v19, v2

    move/from16 v2, v18

    .end local v18    # "index$iv$iv":I
    .local v2, "index$iv$iv":I
    .local v19, "target$iv":Ljava/util/ArrayList;
    :goto_1
    if-ge v2, v1, :cond_0

    .line 272
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v18

    .line 273
    .local v18, "item$iv$iv":Ljava/lang/Object;
    move-object/from16 v21, v18

    .local v21, "it$iv":Ljava/lang/Object;
    const/16 v22, 0x0

    .line 269
    .local v22, "$i$a$-fastForEach-ListUtilsKt$fastMap$2$iv":I
    move-object/from16 v23, v0

    .end local v0    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .local v23, "$this$fastForEach$iv$iv":Ljava/util/List;
    move-object v0, v15

    check-cast v0, Ljava/util/Collection;

    move/from16 v24, v1

    move-object/from16 v1, v21

    check-cast v1, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .local v1, "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/16 v25, 0x0

    .line 139
    .local v25, "$i$a$-fastMap-MultiContentMeasurePolicy$minIntrinsicHeight$mapped$1$1":I
    move/from16 v26, v2

    .end local v2    # "index$iv$iv":I
    .local v26, "index$iv$iv":I
    new-instance v2, Landroidx/compose/ui/layout/DefaultIntrinsicMeasurable;

    move-object/from16 v27, v3

    .end local v3    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .local v27, "$this$fastForEach$iv$iv":Ljava/util/List;
    sget-object v3, Landroidx/compose/ui/layout/IntrinsicMinMax;->Min:Landroidx/compose/ui/layout/IntrinsicMinMax;

    move/from16 v28, v4

    .end local v4    # "$i$f$fastForEach":I
    .local v28, "$i$f$fastForEach":I
    sget-object v4, Landroidx/compose/ui/layout/IntrinsicWidthHeight;->Height:Landroidx/compose/ui/layout/IntrinsicWidthHeight;

    invoke-direct {v2, v1, v3, v4}, Landroidx/compose/ui/layout/DefaultIntrinsicMeasurable;-><init>(Landroidx/compose/ui/layout/IntrinsicMeasurable;Landroidx/compose/ui/layout/IntrinsicMinMax;Landroidx/compose/ui/layout/IntrinsicWidthHeight;)V

    .line 269
    .end local v1    # "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .end local v25    # "$i$a$-fastMap-MultiContentMeasurePolicy$minIntrinsicHeight$mapped$1$1":I
    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 273
    .end local v21    # "it$iv":Ljava/lang/Object;
    .end local v22    # "$i$a$-fastForEach-ListUtilsKt$fastMap$2$iv":I
    nop

    .line 271
    .end local v18    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v2, v26, 0x1

    move-object/from16 v0, v23

    move/from16 v1, v24

    move-object/from16 v3, v27

    move/from16 v4, v28

    .end local v26    # "index$iv$iv":I
    .restart local v2    # "index$iv$iv":I
    goto :goto_1

    .end local v23    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v27    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v28    # "$i$f$fastForEach":I
    .restart local v0    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .restart local v3    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .restart local v4    # "$i$f$fastForEach":I
    :cond_0
    move-object/from16 v23, v0

    move/from16 v26, v2

    move-object/from16 v27, v3

    move/from16 v28, v4

    .line 275
    .end local v0    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v2    # "index$iv$iv":I
    .end local v3    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v4    # "$i$f$fastForEach":I
    .restart local v23    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .restart local v27    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .restart local v28    # "$i$f$fastForEach":I
    nop

    .line 276
    .end local v17    # "$i$f$fastForEach":I
    .end local v23    # "$this$fastForEach$iv$iv":Ljava/util/List;
    move-object v0, v15

    check-cast v0, Ljava/util/List;

    .line 140
    .end local v13    # "$this$fastMap$iv":Ljava/util/List;
    .end local v14    # "$i$f$fastMap":I
    .end local v15    # "target$iv":Ljava/util/ArrayList;
    nop

    .line 262
    .end local v11    # "list":Ljava/util/List;
    .end local v12    # "$i$a$-fastMap-MultiContentMeasurePolicy$minIntrinsicHeight$mapped$1":I
    invoke-interface {v10, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 266
    .end local v8    # "it$iv":Ljava/lang/Object;
    .end local v9    # "$i$a$-fastForEach-ListUtilsKt$fastMap$2$iv":I
    nop

    .line 264
    .end local v7    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v5, v5, 0x1

    move-object/from16 v0, v16

    move-object/from16 v2, v19

    move/from16 v1, v20

    goto :goto_0

    .end local v16    # "$this$fastMap$iv":Ljava/util/List;
    .end local v19    # "target$iv":Ljava/util/ArrayList;
    .end local v20    # "$i$f$fastMap":I
    .end local v27    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v28    # "$i$f$fastForEach":I
    .local v0, "$this$fastMap$iv":Ljava/util/List;
    .local v1, "$i$f$fastMap":I
    .local v2, "target$iv":Ljava/util/ArrayList;
    .restart local v3    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .restart local v4    # "$i$f$fastForEach":I
    :cond_1
    move-object/from16 v16, v0

    move/from16 v20, v1

    move-object/from16 v19, v2

    move-object/from16 v27, v3

    move/from16 v28, v4

    .line 277
    .end local v0    # "$this$fastMap$iv":Ljava/util/List;
    .end local v1    # "$i$f$fastMap":I
    .end local v2    # "target$iv":Ljava/util/ArrayList;
    .end local v3    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v4    # "$i$f$fastForEach":I
    .end local v5    # "index$iv$iv":I
    .restart local v16    # "$this$fastMap$iv":Ljava/util/List;
    .restart local v19    # "target$iv":Ljava/util/ArrayList;
    .restart local v20    # "$i$f$fastMap":I
    .restart local v27    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .restart local v28    # "$i$f$fastForEach":I
    nop

    .line 278
    .end local v27    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v28    # "$i$f$fastForEach":I
    move-object/from16 v0, v19

    check-cast v0, Ljava/util/List;

    .line 137
    .end local v16    # "$this$fastMap$iv":Ljava/util/List;
    .end local v19    # "target$iv":Ljava/util/ArrayList;
    .end local v20    # "$i$f$fastMap":I
    nop

    .line 136
    nop

    .line 142
    .local v0, "mapped":Ljava/util/List;
    const/16 v5, 0xd

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move/from16 v2, p3

    invoke-static/range {v1 .. v6}, Landroidx/compose/ui/unit/ConstraintsKt;->Constraints$default(IIIIILjava/lang/Object;)J

    move-result-wide v3

    .line 143
    .local v3, "constraints":J
    new-instance v1, Landroidx/compose/ui/layout/IntrinsicsMeasureScope;

    invoke-interface/range {p1 .. p1}, Landroidx/compose/ui/layout/IntrinsicMeasureScope;->getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;

    move-result-object v2

    move-object/from16 v5, p1

    invoke-direct {v1, v5, v2}, Landroidx/compose/ui/layout/IntrinsicsMeasureScope;-><init>(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Landroidx/compose/ui/unit/LayoutDirection;)V

    .line 144
    .local v1, "layoutReceiver":Landroidx/compose/ui/layout/IntrinsicsMeasureScope;
    move-object v2, v1

    check-cast v2, Landroidx/compose/ui/layout/MeasureScope;

    move-object/from16 v6, p0

    invoke-interface {v6, v2, v0, v3, v4}, Landroidx/compose/ui/layout/MultiContentMeasurePolicy;->measure-3p2s80s(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;

    move-result-object v2

    .line 145
    .local v2, "layoutResult":Landroidx/compose/ui/layout/MeasureResult;
    invoke-interface {v2}, Landroidx/compose/ui/layout/MeasureResult;->getHeight()I

    move-result v7

    return v7
.end method

.method public minIntrinsicWidth(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;I)I
    .locals 29
    .param p1, "$this$minIntrinsicWidth"    # Landroidx/compose/ui/layout/IntrinsicMeasureScope;
    .param p2, "measurables"    # Ljava/util/List;
    .param p3, "height"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/layout/IntrinsicMeasureScope;",
            "Ljava/util/List<",
            "+",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/ui/layout/IntrinsicMeasurable;",
            ">;>;I)I"
        }
    .end annotation

    .line 111
    move-object/from16 v0, p2

    .local v0, "$this$fastMap$iv":Ljava/util/List;
    const/4 v1, 0x0

    .line 241
    .local v1, "$i$f$fastMap":I
    nop

    .line 242
    new-instance v2, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 243
    .local v2, "target$iv":Ljava/util/ArrayList;
    move-object v3, v0

    .local v3, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v4, 0x0

    .line 244
    .local v4, "$i$f$fastForEach":I
    nop

    .line 245
    const/4 v5, 0x0

    .local v5, "index$iv$iv":I
    move-object v6, v3

    check-cast v6, Ljava/util/Collection;

    invoke-interface {v6}, Ljava/util/Collection;->size()I

    move-result v6

    :goto_0
    if-ge v5, v6, :cond_1

    .line 246
    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    .line 247
    .local v7, "item$iv$iv":Ljava/lang/Object;
    move-object v8, v7

    .local v8, "it$iv":Ljava/lang/Object;
    const/4 v9, 0x0

    .line 243
    .local v9, "$i$a$-fastForEach-ListUtilsKt$fastMap$2$iv":I
    move-object v10, v2

    check-cast v10, Ljava/util/Collection;

    move-object v11, v8

    check-cast v11, Ljava/util/List;

    .local v11, "list":Ljava/util/List;
    const/4 v12, 0x0

    .line 112
    .local v12, "$i$a$-fastMap-MultiContentMeasurePolicy$minIntrinsicWidth$mapped$1":I
    move-object v13, v11

    .local v13, "$this$fastMap$iv":Ljava/util/List;
    const/4 v14, 0x0

    .line 248
    .local v14, "$i$f$fastMap":I
    nop

    .line 249
    new-instance v15, Ljava/util/ArrayList;

    move-object/from16 v16, v0

    .end local v0    # "$this$fastMap$iv":Ljava/util/List;
    .local v16, "$this$fastMap$iv":Ljava/util/List;
    invoke-interface {v13}, Ljava/util/List;->size()I

    move-result v0

    invoke-direct {v15, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 250
    .local v15, "target$iv":Ljava/util/ArrayList;
    move-object v0, v13

    .local v0, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/16 v17, 0x0

    .line 251
    .local v17, "$i$f$fastForEach":I
    nop

    .line 252
    const/16 v18, 0x0

    .local v18, "index$iv$iv":I
    move-object/from16 v19, v0

    check-cast v19, Ljava/util/Collection;

    move/from16 v20, v1

    .end local v1    # "$i$f$fastMap":I
    .local v20, "$i$f$fastMap":I
    invoke-interface/range {v19 .. v19}, Ljava/util/Collection;->size()I

    move-result v1

    move-object/from16 v19, v2

    move/from16 v2, v18

    .end local v18    # "index$iv$iv":I
    .local v2, "index$iv$iv":I
    .local v19, "target$iv":Ljava/util/ArrayList;
    :goto_1
    if-ge v2, v1, :cond_0

    .line 253
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v18

    .line 254
    .local v18, "item$iv$iv":Ljava/lang/Object;
    move-object/from16 v21, v18

    .local v21, "it$iv":Ljava/lang/Object;
    const/16 v22, 0x0

    .line 250
    .local v22, "$i$a$-fastForEach-ListUtilsKt$fastMap$2$iv":I
    move-object/from16 v23, v0

    .end local v0    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .local v23, "$this$fastForEach$iv$iv":Ljava/util/List;
    move-object v0, v15

    check-cast v0, Ljava/util/Collection;

    move/from16 v24, v1

    move-object/from16 v1, v21

    check-cast v1, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .local v1, "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/16 v25, 0x0

    .line 113
    .local v25, "$i$a$-fastMap-MultiContentMeasurePolicy$minIntrinsicWidth$mapped$1$1":I
    move/from16 v26, v2

    .end local v2    # "index$iv$iv":I
    .local v26, "index$iv$iv":I
    new-instance v2, Landroidx/compose/ui/layout/DefaultIntrinsicMeasurable;

    move-object/from16 v27, v3

    .end local v3    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .local v27, "$this$fastForEach$iv$iv":Ljava/util/List;
    sget-object v3, Landroidx/compose/ui/layout/IntrinsicMinMax;->Min:Landroidx/compose/ui/layout/IntrinsicMinMax;

    move/from16 v28, v4

    .end local v4    # "$i$f$fastForEach":I
    .local v28, "$i$f$fastForEach":I
    sget-object v4, Landroidx/compose/ui/layout/IntrinsicWidthHeight;->Width:Landroidx/compose/ui/layout/IntrinsicWidthHeight;

    invoke-direct {v2, v1, v3, v4}, Landroidx/compose/ui/layout/DefaultIntrinsicMeasurable;-><init>(Landroidx/compose/ui/layout/IntrinsicMeasurable;Landroidx/compose/ui/layout/IntrinsicMinMax;Landroidx/compose/ui/layout/IntrinsicWidthHeight;)V

    .line 250
    .end local v1    # "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .end local v25    # "$i$a$-fastMap-MultiContentMeasurePolicy$minIntrinsicWidth$mapped$1$1":I
    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 254
    .end local v21    # "it$iv":Ljava/lang/Object;
    .end local v22    # "$i$a$-fastForEach-ListUtilsKt$fastMap$2$iv":I
    nop

    .line 252
    .end local v18    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v2, v26, 0x1

    move-object/from16 v0, v23

    move/from16 v1, v24

    move-object/from16 v3, v27

    move/from16 v4, v28

    .end local v26    # "index$iv$iv":I
    .restart local v2    # "index$iv$iv":I
    goto :goto_1

    .end local v23    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v27    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v28    # "$i$f$fastForEach":I
    .restart local v0    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .restart local v3    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .restart local v4    # "$i$f$fastForEach":I
    :cond_0
    move-object/from16 v23, v0

    move/from16 v26, v2

    move-object/from16 v27, v3

    move/from16 v28, v4

    .line 256
    .end local v0    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v2    # "index$iv$iv":I
    .end local v3    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v4    # "$i$f$fastForEach":I
    .restart local v23    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .restart local v27    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .restart local v28    # "$i$f$fastForEach":I
    nop

    .line 257
    .end local v17    # "$i$f$fastForEach":I
    .end local v23    # "$this$fastForEach$iv$iv":Ljava/util/List;
    move-object v0, v15

    check-cast v0, Ljava/util/List;

    .line 114
    .end local v13    # "$this$fastMap$iv":Ljava/util/List;
    .end local v14    # "$i$f$fastMap":I
    .end local v15    # "target$iv":Ljava/util/ArrayList;
    nop

    .line 243
    .end local v11    # "list":Ljava/util/List;
    .end local v12    # "$i$a$-fastMap-MultiContentMeasurePolicy$minIntrinsicWidth$mapped$1":I
    invoke-interface {v10, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 247
    .end local v8    # "it$iv":Ljava/lang/Object;
    .end local v9    # "$i$a$-fastForEach-ListUtilsKt$fastMap$2$iv":I
    nop

    .line 245
    .end local v7    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v5, v5, 0x1

    move-object/from16 v0, v16

    move-object/from16 v2, v19

    move/from16 v1, v20

    goto :goto_0

    .end local v16    # "$this$fastMap$iv":Ljava/util/List;
    .end local v19    # "target$iv":Ljava/util/ArrayList;
    .end local v20    # "$i$f$fastMap":I
    .end local v27    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v28    # "$i$f$fastForEach":I
    .local v0, "$this$fastMap$iv":Ljava/util/List;
    .local v1, "$i$f$fastMap":I
    .local v2, "target$iv":Ljava/util/ArrayList;
    .restart local v3    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .restart local v4    # "$i$f$fastForEach":I
    :cond_1
    move-object/from16 v16, v0

    move/from16 v20, v1

    move-object/from16 v19, v2

    move-object/from16 v27, v3

    move/from16 v28, v4

    .line 258
    .end local v0    # "$this$fastMap$iv":Ljava/util/List;
    .end local v1    # "$i$f$fastMap":I
    .end local v2    # "target$iv":Ljava/util/ArrayList;
    .end local v3    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v4    # "$i$f$fastForEach":I
    .end local v5    # "index$iv$iv":I
    .restart local v16    # "$this$fastMap$iv":Ljava/util/List;
    .restart local v19    # "target$iv":Ljava/util/ArrayList;
    .restart local v20    # "$i$f$fastMap":I
    .restart local v27    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .restart local v28    # "$i$f$fastForEach":I
    nop

    .line 259
    .end local v27    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v28    # "$i$f$fastForEach":I
    move-object/from16 v0, v19

    check-cast v0, Ljava/util/List;

    .line 111
    .end local v16    # "$this$fastMap$iv":Ljava/util/List;
    .end local v19    # "target$iv":Ljava/util/ArrayList;
    .end local v20    # "$i$f$fastMap":I
    nop

    .line 110
    nop

    .line 116
    .local v0, "mapped":Ljava/util/List;
    const/4 v5, 0x7

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move/from16 v4, p3

    invoke-static/range {v1 .. v6}, Landroidx/compose/ui/unit/ConstraintsKt;->Constraints$default(IIIIILjava/lang/Object;)J

    move-result-wide v1

    .line 117
    .local v1, "constraints":J
    new-instance v3, Landroidx/compose/ui/layout/IntrinsicsMeasureScope;

    invoke-interface/range {p1 .. p1}, Landroidx/compose/ui/layout/IntrinsicMeasureScope;->getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;

    move-result-object v4

    move-object/from16 v5, p1

    invoke-direct {v3, v5, v4}, Landroidx/compose/ui/layout/IntrinsicsMeasureScope;-><init>(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Landroidx/compose/ui/unit/LayoutDirection;)V

    .line 118
    .local v3, "layoutReceiver":Landroidx/compose/ui/layout/IntrinsicsMeasureScope;
    move-object v4, v3

    check-cast v4, Landroidx/compose/ui/layout/MeasureScope;

    move-object/from16 v6, p0

    invoke-interface {v6, v4, v0, v1, v2}, Landroidx/compose/ui/layout/MultiContentMeasurePolicy;->measure-3p2s80s(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;

    move-result-object v4

    .line 119
    .local v4, "layoutResult":Landroidx/compose/ui/layout/MeasureResult;
    invoke-interface {v4}, Landroidx/compose/ui/layout/MeasureResult;->getWidth()I

    move-result v7

    return v7
.end method
