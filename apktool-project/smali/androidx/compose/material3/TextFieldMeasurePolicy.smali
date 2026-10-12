.class final Landroidx/compose/material3/TextFieldMeasurePolicy;
.super Ljava/lang/Object;
.source "TextField.kt"

# interfaces
.implements Landroidx/compose/ui/layout/MeasurePolicy;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextField.kt\nandroidx/compose/material3/TextFieldMeasurePolicy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1140:1\n116#2,2:1141\n33#2,6:1143\n118#2:1149\n116#2,2:1150\n33#2,6:1152\n118#2:1158\n116#2,2:1159\n33#2,6:1161\n118#2:1167\n116#2,2:1168\n33#2,6:1170\n118#2:1176\n116#2,2:1177\n33#2,6:1179\n118#2:1185\n116#2,2:1186\n33#2,6:1188\n118#2:1194\n544#2,2:1195\n33#2,6:1197\n546#2:1203\n116#2,2:1204\n33#2,6:1206\n118#2:1212\n544#2,2:1213\n33#2,6:1215\n546#2:1221\n544#2,2:1222\n33#2,6:1224\n546#2:1230\n116#2,2:1231\n33#2,6:1233\n118#2:1239\n116#2,2:1241\n33#2,6:1243\n118#2:1249\n116#2,2:1250\n33#2,6:1252\n118#2:1258\n116#2,2:1259\n33#2,6:1261\n118#2:1267\n116#2,2:1268\n33#2,6:1270\n118#2:1276\n116#2,2:1277\n33#2,6:1279\n118#2:1285\n116#2,2:1286\n33#2,6:1288\n118#2:1294\n116#2,2:1295\n33#2,6:1297\n118#2:1303\n116#2,2:1304\n33#2,6:1306\n118#2:1312\n116#2,2:1313\n33#2,6:1315\n118#2:1321\n116#2,2:1322\n33#2,6:1324\n118#2:1330\n544#2,2:1331\n33#2,6:1333\n546#2:1339\n116#2,2:1340\n33#2,6:1342\n118#2:1348\n116#2,2:1349\n33#2,6:1351\n118#2:1357\n1#3:1240\n*S KotlinDebug\n*F\n+ 1 TextField.kt\nandroidx/compose/material3/TextFieldMeasurePolicy\n*L\n593#1:1141,2\n593#1:1143,6\n593#1:1149\n600#1:1150,2\n600#1:1152,6\n600#1:1158\n608#1:1159,2\n608#1:1161,6\n608#1:1167\n616#1:1168,2\n616#1:1170,6\n616#1:1176\n628#1:1177,2\n628#1:1179,6\n628#1:1185\n632#1:1186,2\n632#1:1188,6\n632#1:1194\n646#1:1195,2\n646#1:1197,6\n646#1:1203\n652#1:1204,2\n652#1:1206,6\n652#1:1212\n701#1:1213,2\n701#1:1215,6\n701#1:1221\n793#1:1222,2\n793#1:1224,6\n793#1:1230\n796#1:1231,2\n796#1:1233,6\n796#1:1239\n800#1:1241,2\n800#1:1243,6\n800#1:1249\n804#1:1250,2\n804#1:1252,6\n804#1:1258\n808#1:1259,2\n808#1:1261,6\n808#1:1267\n812#1:1268,2\n812#1:1270,6\n812#1:1276\n816#1:1277,2\n816#1:1279,6\n816#1:1285\n838#1:1286,2\n838#1:1288,6\n838#1:1294\n848#1:1295,2\n848#1:1297,6\n848#1:1303\n858#1:1304,2\n858#1:1306,6\n858#1:1312\n863#1:1313,2\n863#1:1315,6\n863#1:1321\n874#1:1322,2\n874#1:1324,6\n874#1:1330\n885#1:1331,2\n885#1:1333,6\n885#1:1339\n888#1:1340,2\n888#1:1342,6\n888#1:1348\n893#1:1349,2\n893#1:1351,6\n893#1:1357\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008J8\u0010\t\u001a\u00020\n2\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c2\u0006\u0010\u000e\u001a\u00020\n2\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u0010H\u0002J<\u0010\u0011\u001a\u00020\n*\u00020\u00122\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c2\u0006\u0010\u0013\u001a\u00020\n2\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u0010H\u0002J\"\u0010\u0014\u001a\u00020\n*\u00020\u00122\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c2\u0006\u0010\u0013\u001a\u00020\nH\u0016J\"\u0010\u0015\u001a\u00020\n*\u00020\u00122\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c2\u0006\u0010\u000e\u001a\u00020\nH\u0016J,\u0010\u0016\u001a\u00020\u0017*\u00020\u00182\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00190\u000c2\u0006\u0010\u001a\u001a\u00020\u001bH\u0016\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\"\u0010\u001e\u001a\u00020\n*\u00020\u00122\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c2\u0006\u0010\u0013\u001a\u00020\nH\u0016J\"\u0010\u001f\u001a\u00020\n*\u00020\u00122\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c2\u0006\u0010\u000e\u001a\u00020\nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006 "
    }
    d2 = {
        "Landroidx/compose/material3/TextFieldMeasurePolicy;",
        "Landroidx/compose/ui/layout/MeasurePolicy;",
        "singleLine",
        "",
        "animationProgress",
        "",
        "paddingValues",
        "Landroidx/compose/foundation/layout/PaddingValues;",
        "(ZFLandroidx/compose/foundation/layout/PaddingValues;)V",
        "intrinsicWidth",
        "",
        "measurables",
        "",
        "Landroidx/compose/ui/layout/IntrinsicMeasurable;",
        "height",
        "intrinsicMeasurer",
        "Lkotlin/Function2;",
        "intrinsicHeight",
        "Landroidx/compose/ui/layout/IntrinsicMeasureScope;",
        "width",
        "maxIntrinsicHeight",
        "maxIntrinsicWidth",
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
        "material3_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final animationProgress:F

.field private final paddingValues:Landroidx/compose/foundation/layout/PaddingValues;

.field private final singleLine:Z


# direct methods
.method public constructor <init>(ZFLandroidx/compose/foundation/layout/PaddingValues;)V
    .locals 0
    .param p1, "singleLine"    # Z
    .param p2, "animationProgress"    # F
    .param p3, "paddingValues"    # Landroidx/compose/foundation/layout/PaddingValues;

    .line 574
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 575
    iput-boolean p1, p0, Landroidx/compose/material3/TextFieldMeasurePolicy;->singleLine:Z

    .line 576
    iput p2, p0, Landroidx/compose/material3/TextFieldMeasurePolicy;->animationProgress:F

    .line 577
    iput-object p3, p0, Landroidx/compose/material3/TextFieldMeasurePolicy;->paddingValues:Landroidx/compose/foundation/layout/PaddingValues;

    .line 574
    return-void
.end method

.method public static final synthetic access$getAnimationProgress$p(Landroidx/compose/material3/TextFieldMeasurePolicy;)F
    .locals 1
    .param p0, "$this"    # Landroidx/compose/material3/TextFieldMeasurePolicy;

    .line 574
    iget v0, p0, Landroidx/compose/material3/TextFieldMeasurePolicy;->animationProgress:F

    return v0
.end method

.method public static final synthetic access$getPaddingValues$p(Landroidx/compose/material3/TextFieldMeasurePolicy;)Landroidx/compose/foundation/layout/PaddingValues;
    .locals 1
    .param p0, "$this"    # Landroidx/compose/material3/TextFieldMeasurePolicy;

    .line 574
    iget-object v0, p0, Landroidx/compose/material3/TextFieldMeasurePolicy;->paddingValues:Landroidx/compose/foundation/layout/PaddingValues;

    return-object v0
.end method

.method public static final synthetic access$getSingleLine$p(Landroidx/compose/material3/TextFieldMeasurePolicy;)Z
    .locals 1
    .param p0, "$this"    # Landroidx/compose/material3/TextFieldMeasurePolicy;

    .line 574
    iget-boolean v0, p0, Landroidx/compose/material3/TextFieldMeasurePolicy;->singleLine:Z

    return v0
.end method

.method private final intrinsicHeight(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;ILkotlin/jvm/functions/Function2;)I
    .locals 30
    .param p1, "$this$intrinsicHeight"    # Landroidx/compose/ui/layout/IntrinsicMeasureScope;
    .param p2, "measurables"    # Ljava/util/List;
    .param p3, "width"    # I
    .param p4, "intrinsicMeasurer"    # Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/layout/IntrinsicMeasureScope;",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/ui/layout/IntrinsicMeasurable;",
            ">;I",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/ui/layout/IntrinsicMeasurable;",
            "-",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;)I"
        }
    .end annotation

    .line 835
    move-object/from16 v0, p0

    move-object/from16 v1, p4

    const/4 v2, 0x0

    .local v2, "remainingWidth":I
    move/from16 v2, p3

    .line 837
    nop

    .line 838
    move-object/from16 v3, p2

    .local v3, "$this$fastFirstOrNull$iv":Ljava/util/List;
    const/4 v4, 0x0

    .line 1286
    .local v4, "$i$f$fastFirstOrNull":I
    nop

    .line 1287
    move-object v5, v3

    .local v5, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v6, 0x0

    .line 1288
    .local v6, "$i$f$fastForEach":I
    nop

    .line 1289
    const/4 v7, 0x0

    .local v7, "index$iv$iv":I
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v8

    :goto_0
    if-ge v7, v8, :cond_1

    .line 1290
    invoke-interface {v5, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    .line 1291
    .local v10, "item$iv$iv":Ljava/lang/Object;
    move-object v11, v10

    .local v11, "it$iv":Ljava/lang/Object;
    const/4 v12, 0x0

    .line 1287
    .local v12, "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    move-object v13, v11

    check-cast v13, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .local v13, "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/4 v14, 0x0

    .line 838
    .local v14, "$i$a$-fastFirstOrNull-TextFieldMeasurePolicy$intrinsicHeight$leadingHeight$1":I
    invoke-static {v13}, Landroidx/compose/material3/internal/TextFieldImplKt;->getLayoutId(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Ljava/lang/Object;

    move-result-object v15

    const-string v9, "Leading"

    invoke-static {v15, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    .line 1287
    .end local v13    # "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .end local v14    # "$i$a$-fastFirstOrNull-TextFieldMeasurePolicy$intrinsicHeight$leadingHeight$1":I
    if-eqz v9, :cond_0

    goto :goto_1

    .line 1291
    .end local v11    # "it$iv":Ljava/lang/Object;
    .end local v12    # "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    :cond_0
    nop

    .line 1289
    .end local v10    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 1293
    .end local v7    # "index$iv$iv":I
    :cond_1
    nop

    .line 1294
    .end local v5    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v6    # "$i$f$fastForEach":I
    const/4 v11, 0x0

    .line 838
    .end local v3    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .end local v4    # "$i$f$fastFirstOrNull":I
    :goto_1
    check-cast v11, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .line 839
    const v3, 0x7fffffff

    if-eqz v11, :cond_2

    .line 838
    nop

    .line 839
    nop

    .local v11, "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/4 v5, 0x0

    .line 840
    .local v5, "$i$a$-let-TextFieldMeasurePolicy$intrinsicHeight$leadingHeight$2":I
    nop

    .line 841
    nop

    .line 842
    invoke-interface {v11, v3}, Landroidx/compose/ui/layout/IntrinsicMeasurable;->maxIntrinsicWidth(I)I

    move-result v6

    .line 841
    invoke-static {v2, v6}, Landroidx/compose/material3/TextFieldKt;->access$substractConstraintSafely(II)I

    move-result v6

    .line 840
    move v2, v6

    .line 844
    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v1, v11, v6}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    move-result v5

    .line 839
    .end local v5    # "$i$a$-let-TextFieldMeasurePolicy$intrinsicHeight$leadingHeight$2":I
    .end local v11    # "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    nop

    .line 837
    goto :goto_2

    .line 845
    :cond_2
    const/4 v5, 0x0

    .line 837
    :goto_2
    nop

    .line 836
    move/from16 v18, v5

    .line 847
    .local v18, "leadingHeight":I
    nop

    .line 848
    move-object/from16 v5, p2

    .local v5, "$this$fastFirstOrNull$iv":Ljava/util/List;
    const/4 v6, 0x0

    .line 1295
    .local v6, "$i$f$fastFirstOrNull":I
    nop

    .line 1296
    move-object v7, v5

    .local v7, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v8, 0x0

    .line 1297
    .local v8, "$i$f$fastForEach":I
    nop

    .line 1298
    const/4 v9, 0x0

    .local v9, "index$iv$iv":I
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v10

    :goto_3
    if-ge v9, v10, :cond_4

    .line 1299
    invoke-interface {v7, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    .line 1300
    .local v11, "item$iv$iv":Ljava/lang/Object;
    move-object v12, v11

    .local v12, "it$iv":Ljava/lang/Object;
    const/4 v13, 0x0

    .line 1296
    .local v13, "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    move-object v14, v12

    check-cast v14, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .local v14, "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/4 v15, 0x0

    .line 848
    .local v15, "$i$a$-fastFirstOrNull-TextFieldMeasurePolicy$intrinsicHeight$trailingHeight$1":I
    invoke-static {v14}, Landroidx/compose/material3/internal/TextFieldImplKt;->getLayoutId(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Ljava/lang/Object;

    move-result-object v4

    const-string v3, "Trailing"

    invoke-static {v4, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    .line 1296
    .end local v14    # "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .end local v15    # "$i$a$-fastFirstOrNull-TextFieldMeasurePolicy$intrinsicHeight$trailingHeight$1":I
    if-eqz v3, :cond_3

    goto :goto_4

    .line 1300
    .end local v12    # "it$iv":Ljava/lang/Object;
    .end local v13    # "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    :cond_3
    nop

    .line 1298
    .end local v11    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v9, v9, 0x1

    const v3, 0x7fffffff

    goto :goto_3

    .line 1302
    .end local v9    # "index$iv$iv":I
    :cond_4
    nop

    .line 1303
    .end local v7    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v8    # "$i$f$fastForEach":I
    const/4 v12, 0x0

    .line 848
    .end local v5    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .end local v6    # "$i$f$fastFirstOrNull":I
    :goto_4
    check-cast v12, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .line 849
    if-eqz v12, :cond_5

    .line 848
    nop

    .line 849
    nop

    .local v12, "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/4 v3, 0x0

    .line 850
    .local v3, "$i$a$-let-TextFieldMeasurePolicy$intrinsicHeight$trailingHeight$2":I
    nop

    .line 851
    nop

    .line 852
    const v4, 0x7fffffff

    invoke-interface {v12, v4}, Landroidx/compose/ui/layout/IntrinsicMeasurable;->maxIntrinsicWidth(I)I

    move-result v5

    .line 851
    invoke-static {v2, v5}, Landroidx/compose/material3/TextFieldKt;->access$substractConstraintSafely(II)I

    move-result v4

    .line 850
    move v2, v4

    .line 854
    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v1, v12, v4}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v3

    .line 849
    .end local v3    # "$i$a$-let-TextFieldMeasurePolicy$intrinsicHeight$trailingHeight$2":I
    .end local v12    # "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    nop

    .line 847
    move/from16 v19, v3

    goto :goto_5

    .line 855
    :cond_5
    const/16 v19, 0x0

    .line 847
    :goto_5
    nop

    .line 846
    nop

    .line 857
    .local v19, "trailingHeight":I
    nop

    .line 858
    move-object/from16 v3, p2

    .local v3, "$this$fastFirstOrNull$iv":Ljava/util/List;
    const/4 v4, 0x0

    .line 1304
    .restart local v4    # "$i$f$fastFirstOrNull":I
    nop

    .line 1305
    move-object v5, v3

    .local v5, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v6, 0x0

    .line 1306
    .local v6, "$i$f$fastForEach":I
    nop

    .line 1307
    const/4 v7, 0x0

    .local v7, "index$iv$iv":I
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v8

    :goto_6
    if-ge v7, v8, :cond_7

    .line 1308
    invoke-interface {v5, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    .line 1309
    .local v9, "item$iv$iv":Ljava/lang/Object;
    move-object v10, v9

    .local v10, "it$iv":Ljava/lang/Object;
    const/4 v11, 0x0

    .line 1305
    .local v11, "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    move-object v12, v10

    check-cast v12, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .restart local v12    # "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/4 v13, 0x0

    .line 858
    .local v13, "$i$a$-fastFirstOrNull-TextFieldMeasurePolicy$intrinsicHeight$labelHeight$1":I
    invoke-static {v12}, Landroidx/compose/material3/internal/TextFieldImplKt;->getLayoutId(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Ljava/lang/Object;

    move-result-object v14

    const-string v15, "Label"

    invoke-static {v14, v15}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    .line 1305
    .end local v12    # "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .end local v13    # "$i$a$-fastFirstOrNull-TextFieldMeasurePolicy$intrinsicHeight$labelHeight$1":I
    if-eqz v12, :cond_6

    goto :goto_7

    .line 1309
    .end local v10    # "it$iv":Ljava/lang/Object;
    .end local v11    # "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    :cond_6
    nop

    .line 1307
    .end local v9    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v7, v7, 0x1

    goto :goto_6

    .line 1311
    .end local v7    # "index$iv$iv":I
    :cond_7
    nop

    .line 1312
    .end local v5    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v6    # "$i$f$fastForEach":I
    const/4 v10, 0x0

    .line 858
    .end local v3    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .end local v4    # "$i$f$fastFirstOrNull":I
    :goto_7
    check-cast v10, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .line 859
    if-eqz v10, :cond_8

    .line 858
    nop

    .line 859
    nop

    .line 1240
    .local v10, "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/4 v3, 0x0

    .line 859
    .local v3, "$i$a$-let-TextFieldMeasurePolicy$intrinsicHeight$labelHeight$2":I
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v1, v10, v4}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v3

    .line 857
    .end local v3    # "$i$a$-let-TextFieldMeasurePolicy$intrinsicHeight$labelHeight$2":I
    .end local v10    # "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    goto :goto_8

    .line 859
    :cond_8
    const/4 v3, 0x0

    .line 857
    :goto_8
    nop

    .line 856
    nop

    .line 862
    .local v3, "labelHeight":I
    nop

    .line 863
    move-object/from16 v4, p2

    .local v4, "$this$fastFirstOrNull$iv":Ljava/util/List;
    const/4 v5, 0x0

    .line 1313
    .local v5, "$i$f$fastFirstOrNull":I
    nop

    .line 1314
    move-object v6, v4

    .local v6, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v7, 0x0

    .line 1315
    .local v7, "$i$f$fastForEach":I
    nop

    .line 1316
    const/4 v8, 0x0

    .local v8, "index$iv$iv":I
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v9

    :goto_9
    if-ge v8, v9, :cond_a

    .line 1317
    invoke-interface {v6, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    .line 1318
    .local v10, "item$iv$iv":Ljava/lang/Object;
    move-object v11, v10

    .local v11, "it$iv":Ljava/lang/Object;
    const/4 v12, 0x0

    .line 1314
    .local v12, "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    move-object v13, v11

    check-cast v13, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .local v13, "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/4 v14, 0x0

    .line 863
    .local v14, "$i$a$-fastFirstOrNull-TextFieldMeasurePolicy$intrinsicHeight$prefixHeight$1":I
    invoke-static {v13}, Landroidx/compose/material3/internal/TextFieldImplKt;->getLayoutId(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Ljava/lang/Object;

    move-result-object v15

    move/from16 v20, v3

    .end local v3    # "labelHeight":I
    .local v20, "labelHeight":I
    const-string v3, "Prefix"

    invoke-static {v15, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    .line 1314
    .end local v13    # "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .end local v14    # "$i$a$-fastFirstOrNull-TextFieldMeasurePolicy$intrinsicHeight$prefixHeight$1":I
    if-eqz v3, :cond_9

    goto :goto_a

    .line 1318
    .end local v11    # "it$iv":Ljava/lang/Object;
    .end local v12    # "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    :cond_9
    nop

    .line 1316
    .end local v10    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v8, v8, 0x1

    move/from16 v3, v20

    goto :goto_9

    .end local v20    # "labelHeight":I
    .restart local v3    # "labelHeight":I
    :cond_a
    move/from16 v20, v3

    .line 1320
    .end local v3    # "labelHeight":I
    .end local v8    # "index$iv$iv":I
    .restart local v20    # "labelHeight":I
    nop

    .line 1321
    .end local v6    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v7    # "$i$f$fastForEach":I
    const/4 v11, 0x0

    .line 863
    .end local v4    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .end local v5    # "$i$f$fastFirstOrNull":I
    :goto_a
    check-cast v11, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .line 864
    if-eqz v11, :cond_b

    .line 863
    nop

    .line 864
    nop

    .local v11, "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/4 v3, 0x0

    .line 865
    .local v3, "$i$a$-let-TextFieldMeasurePolicy$intrinsicHeight$prefixHeight$2":I
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v1, v11, v4}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    .line 866
    .local v4, "height":I
    nop

    .line 867
    nop

    .line 868
    const v5, 0x7fffffff

    invoke-interface {v11, v5}, Landroidx/compose/ui/layout/IntrinsicMeasurable;->maxIntrinsicWidth(I)I

    move-result v6

    .line 867
    invoke-static {v2, v6}, Landroidx/compose/material3/TextFieldKt;->access$substractConstraintSafely(II)I

    move-result v5

    .line 866
    move v2, v5

    .line 870
    nop

    .line 864
    .end local v3    # "$i$a$-let-TextFieldMeasurePolicy$intrinsicHeight$prefixHeight$2":I
    .end local v4    # "height":I
    .end local v11    # "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    nop

    .line 862
    goto :goto_b

    .line 871
    :cond_b
    const/4 v4, 0x0

    .line 862
    :goto_b
    nop

    .line 861
    nop

    .line 873
    .local v4, "prefixHeight":I
    nop

    .line 874
    move-object/from16 v3, p2

    .local v3, "$this$fastFirstOrNull$iv":Ljava/util/List;
    const/4 v5, 0x0

    .line 1322
    .restart local v5    # "$i$f$fastFirstOrNull":I
    nop

    .line 1323
    move-object v6, v3

    .restart local v6    # "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v7, 0x0

    .line 1324
    .restart local v7    # "$i$f$fastForEach":I
    nop

    .line 1325
    const/4 v8, 0x0

    .restart local v8    # "index$iv$iv":I
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v9

    :goto_c
    if-ge v8, v9, :cond_d

    .line 1326
    invoke-interface {v6, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    .line 1327
    .restart local v10    # "item$iv$iv":Ljava/lang/Object;
    move-object v11, v10

    .local v11, "it$iv":Ljava/lang/Object;
    const/4 v12, 0x0

    .line 1323
    .restart local v12    # "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    move-object v13, v11

    check-cast v13, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .restart local v13    # "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/4 v14, 0x0

    .line 874
    .local v14, "$i$a$-fastFirstOrNull-TextFieldMeasurePolicy$intrinsicHeight$suffixHeight$1":I
    invoke-static {v13}, Landroidx/compose/material3/internal/TextFieldImplKt;->getLayoutId(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Ljava/lang/Object;

    move-result-object v15

    move-object/from16 v21, v3

    .end local v3    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .local v21, "$this$fastFirstOrNull$iv":Ljava/util/List;
    const-string v3, "Suffix"

    invoke-static {v15, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    .line 1323
    .end local v13    # "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .end local v14    # "$i$a$-fastFirstOrNull-TextFieldMeasurePolicy$intrinsicHeight$suffixHeight$1":I
    if-eqz v3, :cond_c

    goto :goto_d

    .line 1327
    .end local v11    # "it$iv":Ljava/lang/Object;
    .end local v12    # "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    :cond_c
    nop

    .line 1325
    .end local v10    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v8, v8, 0x1

    move-object/from16 v3, v21

    goto :goto_c

    .end local v21    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .restart local v3    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    :cond_d
    move-object/from16 v21, v3

    .line 1329
    .end local v3    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .end local v8    # "index$iv$iv":I
    .restart local v21    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    nop

    .line 1330
    .end local v6    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v7    # "$i$f$fastForEach":I
    const/4 v11, 0x0

    .line 874
    .end local v5    # "$i$f$fastFirstOrNull":I
    .end local v21    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    :goto_d
    check-cast v11, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .line 875
    if-eqz v11, :cond_e

    .line 874
    nop

    .line 875
    nop

    .local v11, "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/4 v3, 0x0

    .line 876
    .local v3, "$i$a$-let-TextFieldMeasurePolicy$intrinsicHeight$suffixHeight$2":I
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v1, v11, v5}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v5

    .line 877
    .local v5, "height":I
    nop

    .line 878
    nop

    .line 879
    const v6, 0x7fffffff

    invoke-interface {v11, v6}, Landroidx/compose/ui/layout/IntrinsicMeasurable;->maxIntrinsicWidth(I)I

    move-result v6

    .line 878
    invoke-static {v2, v6}, Landroidx/compose/material3/TextFieldKt;->access$substractConstraintSafely(II)I

    move-result v6

    .line 877
    move v2, v6

    .line 881
    nop

    .line 875
    .end local v3    # "$i$a$-let-TextFieldMeasurePolicy$intrinsicHeight$suffixHeight$2":I
    .end local v5    # "height":I
    .end local v11    # "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    nop

    .line 873
    move/from16 v21, v5

    goto :goto_e

    .line 882
    :cond_e
    const/16 v21, 0x0

    .line 873
    :goto_e
    nop

    .line 872
    nop

    .line 885
    .local v21, "suffixHeight":I
    move-object/from16 v3, p2

    .local v3, "$this$fastFirst$iv":Ljava/util/List;
    const/4 v5, 0x0

    .line 1331
    .local v5, "$i$f$fastFirst":I
    nop

    .line 1332
    move-object v6, v3

    .restart local v6    # "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v7, 0x0

    .line 1333
    .restart local v7    # "$i$f$fastForEach":I
    nop

    .line 1334
    const/4 v8, 0x0

    .restart local v8    # "index$iv$iv":I
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v9

    :goto_f
    if-ge v8, v9, :cond_16

    .line 1335
    invoke-interface {v6, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    .line 1336
    .restart local v10    # "item$iv$iv":Ljava/lang/Object;
    move-object v11, v10

    .local v11, "it$iv":Ljava/lang/Object;
    const/4 v12, 0x0

    .line 1332
    .local v12, "$i$a$-fastForEach-ListUtilsKt$fastFirst$2$iv":I
    move-object v13, v11

    check-cast v13, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .restart local v13    # "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/4 v14, 0x0

    .line 885
    .local v14, "$i$a$-fastFirst-TextFieldMeasurePolicy$intrinsicHeight$textFieldHeight$1":I
    invoke-static {v13}, Landroidx/compose/material3/internal/TextFieldImplKt;->getLayoutId(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Ljava/lang/Object;

    move-result-object v15

    move/from16 v29, v2

    .end local v2    # "remainingWidth":I
    .local v29, "remainingWidth":I
    const-string v2, "TextField"

    invoke-static {v15, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    .line 1332
    .end local v13    # "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .end local v14    # "$i$a$-fastFirst-TextFieldMeasurePolicy$intrinsicHeight$textFieldHeight$1":I
    if-eqz v2, :cond_15

    .line 885
    .end local v3    # "$this$fastFirst$iv":Ljava/util/List;
    .end local v5    # "$i$f$fastFirst":I
    .end local v6    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v7    # "$i$f$fastForEach":I
    .end local v8    # "index$iv$iv":I
    .end local v10    # "item$iv$iv":Ljava/lang/Object;
    .end local v11    # "it$iv":Ljava/lang/Object;
    .end local v12    # "$i$a$-fastForEach-ListUtilsKt$fastFirst$2$iv":I
    invoke-static/range {v29 .. v29}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v11, v2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    .line 884
    nop

    .line 887
    .local v2, "textFieldHeight":I
    nop

    .line 888
    move-object/from16 v3, p2

    .local v3, "$this$fastFirstOrNull$iv":Ljava/util/List;
    const/4 v5, 0x0

    .line 1340
    .local v5, "$i$f$fastFirstOrNull":I
    nop

    .line 1341
    move-object v6, v3

    .restart local v6    # "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v7, 0x0

    .line 1342
    .restart local v7    # "$i$f$fastForEach":I
    nop

    .line 1343
    const/4 v8, 0x0

    .restart local v8    # "index$iv$iv":I
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v9

    :goto_10
    if-ge v8, v9, :cond_10

    .line 1344
    invoke-interface {v6, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    .line 1345
    .restart local v10    # "item$iv$iv":Ljava/lang/Object;
    move-object v11, v10

    .restart local v11    # "it$iv":Ljava/lang/Object;
    const/4 v12, 0x0

    .line 1341
    .local v12, "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    move-object v13, v11

    check-cast v13, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .restart local v13    # "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/4 v14, 0x0

    .line 888
    .local v14, "$i$a$-fastFirstOrNull-TextFieldMeasurePolicy$intrinsicHeight$placeholderHeight$1":I
    invoke-static {v13}, Landroidx/compose/material3/internal/TextFieldImplKt;->getLayoutId(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Ljava/lang/Object;

    move-result-object v15

    move/from16 v17, v2

    .end local v2    # "textFieldHeight":I
    .local v17, "textFieldHeight":I
    const-string v2, "Hint"

    invoke-static {v15, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    .line 1341
    .end local v13    # "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .end local v14    # "$i$a$-fastFirstOrNull-TextFieldMeasurePolicy$intrinsicHeight$placeholderHeight$1":I
    if-eqz v2, :cond_f

    goto :goto_11

    .line 1345
    .end local v11    # "it$iv":Ljava/lang/Object;
    .end local v12    # "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    :cond_f
    nop

    .line 1343
    .end local v10    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v8, v8, 0x1

    move/from16 v2, v17

    goto :goto_10

    .end local v17    # "textFieldHeight":I
    .restart local v2    # "textFieldHeight":I
    :cond_10
    move/from16 v17, v2

    .line 1347
    .end local v2    # "textFieldHeight":I
    .end local v8    # "index$iv$iv":I
    .restart local v17    # "textFieldHeight":I
    nop

    .line 1348
    .end local v6    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v7    # "$i$f$fastForEach":I
    const/4 v11, 0x0

    .line 888
    .end local v3    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .end local v5    # "$i$f$fastFirstOrNull":I
    :goto_11
    check-cast v11, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .line 889
    if-eqz v11, :cond_11

    .line 888
    nop

    .line 889
    nop

    .line 1240
    .local v11, "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/4 v2, 0x0

    .line 889
    .local v2, "$i$a$-let-TextFieldMeasurePolicy$intrinsicHeight$placeholderHeight$2":I
    invoke-static/range {v29 .. v29}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v1, v11, v3}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v2

    .line 887
    .end local v2    # "$i$a$-let-TextFieldMeasurePolicy$intrinsicHeight$placeholderHeight$2":I
    .end local v11    # "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    move/from16 v22, v2

    goto :goto_12

    .line 889
    :cond_11
    const/16 v22, 0x0

    .line 887
    :goto_12
    nop

    .line 886
    nop

    .line 892
    .local v22, "placeholderHeight":I
    nop

    .line 893
    move-object/from16 v2, p2

    .local v2, "$this$fastFirstOrNull$iv":Ljava/util/List;
    const/4 v3, 0x0

    .line 1349
    .local v3, "$i$f$fastFirstOrNull":I
    nop

    .line 1350
    move-object v5, v2

    .local v5, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v6, 0x0

    .line 1351
    .local v6, "$i$f$fastForEach":I
    nop

    .line 1352
    const/4 v7, 0x0

    .local v7, "index$iv$iv":I
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v8

    :goto_13
    if-ge v7, v8, :cond_13

    .line 1353
    invoke-interface {v5, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    .line 1354
    .restart local v9    # "item$iv$iv":Ljava/lang/Object;
    move-object v10, v9

    .local v10, "it$iv":Ljava/lang/Object;
    const/4 v11, 0x0

    .line 1350
    .local v11, "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    move-object v12, v10

    check-cast v12, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .local v12, "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/4 v13, 0x0

    .line 893
    .local v13, "$i$a$-fastFirstOrNull-TextFieldMeasurePolicy$intrinsicHeight$supportingHeight$1":I
    invoke-static {v12}, Landroidx/compose/material3/internal/TextFieldImplKt;->getLayoutId(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Ljava/lang/Object;

    move-result-object v14

    const-string v15, "Supporting"

    invoke-static {v14, v15}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    .line 1350
    .end local v12    # "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .end local v13    # "$i$a$-fastFirstOrNull-TextFieldMeasurePolicy$intrinsicHeight$supportingHeight$1":I
    if-eqz v12, :cond_12

    move-object v9, v10

    goto :goto_14

    .line 1354
    .end local v10    # "it$iv":Ljava/lang/Object;
    .end local v11    # "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    :cond_12
    nop

    .line 1352
    .end local v9    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v7, v7, 0x1

    goto :goto_13

    .line 1356
    .end local v7    # "index$iv$iv":I
    :cond_13
    nop

    .line 1357
    .end local v5    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v6    # "$i$f$fastForEach":I
    const/4 v9, 0x0

    .line 893
    .end local v2    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .end local v3    # "$i$f$fastFirstOrNull":I
    :goto_14
    check-cast v9, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .line 894
    if-eqz v9, :cond_14

    .line 893
    nop

    .line 894
    nop

    .line 1240
    .local v9, "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/4 v2, 0x0

    .line 894
    .local v2, "$i$a$-let-TextFieldMeasurePolicy$intrinsicHeight$supportingHeight$2":I
    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v1, v9, v3}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v2

    .line 892
    .end local v2    # "$i$a$-let-TextFieldMeasurePolicy$intrinsicHeight$supportingHeight$2":I
    .end local v9    # "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    move/from16 v23, v2

    goto :goto_15

    .line 894
    :cond_14
    const/16 v23, 0x0

    .line 892
    :goto_15
    nop

    .line 891
    nop

    .line 897
    .local v23, "supportingHeight":I
    nop

    .line 898
    nop

    .line 899
    nop

    .line 900
    nop

    .line 901
    nop

    .line 902
    nop

    .line 903
    nop

    .line 904
    nop

    .line 905
    iget v2, v0, Landroidx/compose/material3/TextFieldMeasurePolicy;->animationProgress:F

    .line 906
    invoke-static {}, Landroidx/compose/material3/internal/TextFieldImplKt;->getZeroConstraints()J

    move-result-wide v25

    .line 907
    invoke-interface/range {p1 .. p1}, Landroidx/compose/ui/layout/IntrinsicMeasureScope;->getDensity()F

    move-result v27

    .line 908
    iget-object v3, v0, Landroidx/compose/material3/TextFieldMeasurePolicy;->paddingValues:Landroidx/compose/foundation/layout/PaddingValues;

    .line 896
    move/from16 v24, v2

    move-object/from16 v28, v3

    move/from16 v16, v17

    move/from16 v17, v20

    move/from16 v20, v4

    .end local v4    # "prefixHeight":I
    .local v16, "textFieldHeight":I
    .local v17, "labelHeight":I
    .local v20, "prefixHeight":I
    invoke-static/range {v16 .. v28}, Landroidx/compose/material3/TextFieldKt;->access$calculateHeight-mKXJcVc(IIIIIIIIFJFLandroidx/compose/foundation/layout/PaddingValues;)I

    move-result v2

    return v2

    .line 1332
    .end local v16    # "textFieldHeight":I
    .end local v17    # "labelHeight":I
    .end local v22    # "placeholderHeight":I
    .end local v23    # "supportingHeight":I
    .local v3, "$this$fastFirst$iv":Ljava/util/List;
    .restart local v4    # "prefixHeight":I
    .local v5, "$i$f$fastFirst":I
    .local v6, "$this$fastForEach$iv$iv":Ljava/util/List;
    .local v7, "$i$f$fastForEach":I
    .restart local v8    # "index$iv$iv":I
    .local v10, "item$iv$iv":Ljava/lang/Object;
    .local v11, "it$iv":Ljava/lang/Object;
    .local v12, "$i$a$-fastForEach-ListUtilsKt$fastFirst$2$iv":I
    .local v20, "labelHeight":I
    :cond_15
    move/from16 v17, v20

    move/from16 v20, v4

    .line 1336
    .end local v4    # "prefixHeight":I
    .end local v11    # "it$iv":Ljava/lang/Object;
    .end local v12    # "$i$a$-fastForEach-ListUtilsKt$fastFirst$2$iv":I
    .restart local v17    # "labelHeight":I
    .local v20, "prefixHeight":I
    nop

    .line 1334
    .end local v10    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v8, v8, 0x1

    move/from16 v2, v29

    move/from16 v20, v17

    goto/16 :goto_f

    .end local v17    # "labelHeight":I
    .end local v29    # "remainingWidth":I
    .local v2, "remainingWidth":I
    .restart local v4    # "prefixHeight":I
    .local v20, "labelHeight":I
    :cond_16
    move/from16 v29, v2

    move/from16 v17, v20

    move/from16 v20, v4

    .line 1338
    .end local v2    # "remainingWidth":I
    .end local v4    # "prefixHeight":I
    .end local v8    # "index$iv$iv":I
    .restart local v17    # "labelHeight":I
    .local v20, "prefixHeight":I
    .restart local v29    # "remainingWidth":I
    nop

    .line 1339
    .end local v6    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v7    # "$i$f$fastForEach":I
    new-instance v2, Ljava/util/NoSuchElementException;

    const-string v4, "Collection contains no element matching the predicate."

    invoke-direct {v2, v4}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v2
.end method

.method private final intrinsicWidth(Ljava/util/List;ILkotlin/jvm/functions/Function2;)I
    .locals 20
    .param p1, "measurables"    # Ljava/util/List;
    .param p2, "height"    # I
    .param p3, "intrinsicMeasurer"    # Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/ui/layout/IntrinsicMeasurable;",
            ">;I",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/ui/layout/IntrinsicMeasurable;",
            "-",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;)I"
        }
    .end annotation

    .line 793
    move-object/from16 v0, p3

    move-object/from16 v1, p1

    .local v1, "$this$fastFirst$iv":Ljava/util/List;
    const/4 v2, 0x0

    .line 1222
    .local v2, "$i$f$fastFirst":I
    nop

    .line 1223
    move-object v3, v1

    .local v3, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v4, 0x0

    .line 1224
    .local v4, "$i$f$fastForEach":I
    nop

    .line 1225
    const/4 v5, 0x0

    .local v5, "index$iv$iv":I
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v6

    :goto_0
    if-ge v5, v6, :cond_13

    .line 1226
    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    .line 1227
    .local v7, "item$iv$iv":Ljava/lang/Object;
    move-object v8, v7

    .local v8, "it$iv":Ljava/lang/Object;
    const/4 v9, 0x0

    .line 1223
    .local v9, "$i$a$-fastForEach-ListUtilsKt$fastFirst$2$iv":I
    move-object v10, v8

    check-cast v10, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .local v10, "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/4 v11, 0x0

    .line 793
    .local v11, "$i$a$-fastFirst-TextFieldMeasurePolicy$intrinsicWidth$textFieldWidth$1":I
    invoke-static {v10}, Landroidx/compose/material3/internal/TextFieldImplKt;->getLayoutId(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Ljava/lang/Object;

    move-result-object v12

    const-string v13, "TextField"

    invoke-static {v12, v13}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    .line 1223
    .end local v10    # "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .end local v11    # "$i$a$-fastFirst-TextFieldMeasurePolicy$intrinsicWidth$textFieldWidth$1":I
    if-eqz v10, :cond_12

    .line 793
    .end local v1    # "$this$fastFirst$iv":Ljava/util/List;
    .end local v2    # "$i$f$fastFirst":I
    .end local v3    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v4    # "$i$f$fastForEach":I
    .end local v5    # "index$iv$iv":I
    .end local v7    # "item$iv$iv":Ljava/lang/Object;
    .end local v8    # "it$iv":Ljava/lang/Object;
    .end local v9    # "$i$a$-fastForEach-ListUtilsKt$fastFirst$2$iv":I
    invoke-static/range {p2 .. p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v8, v1}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    .line 792
    move v6, v1

    .line 795
    .local v6, "textFieldWidth":I
    nop

    .line 796
    move-object/from16 v1, p1

    .local v1, "$this$fastFirstOrNull$iv":Ljava/util/List;
    const/4 v2, 0x0

    .line 1231
    .local v2, "$i$f$fastFirstOrNull":I
    nop

    .line 1232
    move-object v3, v1

    .restart local v3    # "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v4, 0x0

    .line 1233
    .restart local v4    # "$i$f$fastForEach":I
    nop

    .line 1234
    const/4 v5, 0x0

    .restart local v5    # "index$iv$iv":I
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v7

    :goto_1
    if-ge v5, v7, :cond_1

    .line 1235
    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    .line 1236
    .local v9, "item$iv$iv":Ljava/lang/Object;
    move-object v10, v9

    .local v10, "it$iv":Ljava/lang/Object;
    const/4 v11, 0x0

    .line 1232
    .local v11, "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    move-object v12, v10

    check-cast v12, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .local v12, "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/4 v13, 0x0

    .line 796
    .local v13, "$i$a$-fastFirstOrNull-TextFieldMeasurePolicy$intrinsicWidth$labelWidth$1":I
    invoke-static {v12}, Landroidx/compose/material3/internal/TextFieldImplKt;->getLayoutId(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Ljava/lang/Object;

    move-result-object v14

    const-string v15, "Label"

    invoke-static {v14, v15}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    .line 1232
    .end local v12    # "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .end local v13    # "$i$a$-fastFirstOrNull-TextFieldMeasurePolicy$intrinsicWidth$labelWidth$1":I
    if-eqz v12, :cond_0

    goto :goto_2

    .line 1236
    .end local v10    # "it$iv":Ljava/lang/Object;
    .end local v11    # "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    :cond_0
    nop

    .line 1234
    .end local v9    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 1238
    .end local v5    # "index$iv$iv":I
    :cond_1
    nop

    .line 1239
    .end local v3    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v4    # "$i$f$fastForEach":I
    const/4 v10, 0x0

    .line 796
    .end local v1    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .end local v2    # "$i$f$fastFirstOrNull":I
    :goto_2
    check-cast v10, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .line 797
    if-eqz v10, :cond_2

    .line 796
    nop

    .line 797
    nop

    .line 1240
    .local v10, "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/4 v2, 0x0

    .line 797
    .local v2, "$i$a$-let-TextFieldMeasurePolicy$intrinsicWidth$labelWidth$2":I
    invoke-static/range {p2 .. p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v0, v10, v3}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v2

    .line 795
    .end local v2    # "$i$a$-let-TextFieldMeasurePolicy$intrinsicWidth$labelWidth$2":I
    .end local v10    # "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    move v7, v2

    goto :goto_3

    .line 797
    :cond_2
    const/4 v7, 0x0

    .line 795
    :goto_3
    nop

    .line 794
    nop

    .line 799
    .local v7, "labelWidth":I
    nop

    .line 800
    move-object/from16 v2, p1

    .local v2, "$this$fastFirstOrNull$iv":Ljava/util/List;
    const/4 v3, 0x0

    .line 1241
    .local v3, "$i$f$fastFirstOrNull":I
    nop

    .line 1242
    move-object v4, v2

    .local v4, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v5, 0x0

    .line 1243
    .local v5, "$i$f$fastForEach":I
    nop

    .line 1244
    const/4 v9, 0x0

    .local v9, "index$iv$iv":I
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v10

    :goto_4
    if-ge v9, v10, :cond_4

    .line 1245
    invoke-interface {v4, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    .line 1246
    .local v11, "item$iv$iv":Ljava/lang/Object;
    move-object v12, v11

    .local v12, "it$iv":Ljava/lang/Object;
    const/4 v13, 0x0

    .line 1242
    .local v13, "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    move-object v14, v12

    check-cast v14, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .local v14, "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/4 v15, 0x0

    .line 800
    .local v15, "$i$a$-fastFirstOrNull-TextFieldMeasurePolicy$intrinsicWidth$trailingWidth$1":I
    invoke-static {v14}, Landroidx/compose/material3/internal/TextFieldImplKt;->getLayoutId(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Ljava/lang/Object;

    move-result-object v1

    const-string v8, "Trailing"

    invoke-static {v1, v8}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    .line 1242
    .end local v14    # "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .end local v15    # "$i$a$-fastFirstOrNull-TextFieldMeasurePolicy$intrinsicWidth$trailingWidth$1":I
    if-eqz v1, :cond_3

    goto :goto_5

    .line 1246
    .end local v12    # "it$iv":Ljava/lang/Object;
    .end local v13    # "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    :cond_3
    nop

    .line 1244
    .end local v11    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v9, v9, 0x1

    goto :goto_4

    .line 1248
    .end local v9    # "index$iv$iv":I
    :cond_4
    nop

    .line 1249
    .end local v4    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v5    # "$i$f$fastForEach":I
    const/4 v12, 0x0

    .line 800
    .end local v2    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .end local v3    # "$i$f$fastFirstOrNull":I
    :goto_5
    check-cast v12, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .line 801
    if-eqz v12, :cond_5

    .line 800
    nop

    .line 801
    nop

    .line 1240
    .local v12, "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/4 v1, 0x0

    .line 801
    .local v1, "$i$a$-let-TextFieldMeasurePolicy$intrinsicWidth$trailingWidth$2":I
    invoke-static/range {p2 .. p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v12, v2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v1

    .line 799
    .end local v1    # "$i$a$-let-TextFieldMeasurePolicy$intrinsicWidth$trailingWidth$2":I
    .end local v12    # "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    move v3, v1

    goto :goto_6

    .line 801
    :cond_5
    const/4 v3, 0x0

    .line 799
    :goto_6
    nop

    .line 798
    nop

    .line 803
    .local v3, "trailingWidth":I
    nop

    .line 804
    move-object/from16 v1, p1

    .local v1, "$this$fastFirstOrNull$iv":Ljava/util/List;
    const/4 v2, 0x0

    .line 1250
    .local v2, "$i$f$fastFirstOrNull":I
    nop

    .line 1251
    move-object v4, v1

    .restart local v4    # "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v5, 0x0

    .line 1252
    .restart local v5    # "$i$f$fastForEach":I
    nop

    .line 1253
    const/4 v8, 0x0

    .local v8, "index$iv$iv":I
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v9

    :goto_7
    if-ge v8, v9, :cond_7

    .line 1254
    invoke-interface {v4, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    .line 1255
    .local v10, "item$iv$iv":Ljava/lang/Object;
    move-object v11, v10

    .local v11, "it$iv":Ljava/lang/Object;
    const/4 v12, 0x0

    .line 1251
    .local v12, "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    move-object v13, v11

    check-cast v13, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .local v13, "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/4 v14, 0x0

    .line 804
    .local v14, "$i$a$-fastFirstOrNull-TextFieldMeasurePolicy$intrinsicWidth$prefixWidth$1":I
    invoke-static {v13}, Landroidx/compose/material3/internal/TextFieldImplKt;->getLayoutId(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Ljava/lang/Object;

    move-result-object v15

    move-object/from16 v16, v1

    .end local v1    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .local v16, "$this$fastFirstOrNull$iv":Ljava/util/List;
    const-string v1, "Prefix"

    invoke-static {v15, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    .line 1251
    .end local v13    # "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .end local v14    # "$i$a$-fastFirstOrNull-TextFieldMeasurePolicy$intrinsicWidth$prefixWidth$1":I
    if-eqz v1, :cond_6

    goto :goto_8

    .line 1255
    .end local v11    # "it$iv":Ljava/lang/Object;
    .end local v12    # "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    :cond_6
    nop

    .line 1253
    .end local v10    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v8, v8, 0x1

    move-object/from16 v1, v16

    goto :goto_7

    .end local v16    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .restart local v1    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    :cond_7
    move-object/from16 v16, v1

    .line 1257
    .end local v1    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .end local v8    # "index$iv$iv":I
    .restart local v16    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    nop

    .line 1258
    .end local v4    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v5    # "$i$f$fastForEach":I
    const/4 v11, 0x0

    .line 804
    .end local v2    # "$i$f$fastFirstOrNull":I
    .end local v16    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    :goto_8
    check-cast v11, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .line 805
    if-eqz v11, :cond_8

    .line 804
    nop

    .line 805
    nop

    .line 1240
    .local v11, "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/4 v1, 0x0

    .line 805
    .local v1, "$i$a$-let-TextFieldMeasurePolicy$intrinsicWidth$prefixWidth$2":I
    invoke-static/range {p2 .. p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v11, v2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v1

    .line 803
    .end local v1    # "$i$a$-let-TextFieldMeasurePolicy$intrinsicWidth$prefixWidth$2":I
    .end local v11    # "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    move v4, v1

    goto :goto_9

    .line 805
    :cond_8
    const/4 v4, 0x0

    .line 803
    :goto_9
    nop

    .line 802
    nop

    .line 807
    .local v4, "prefixWidth":I
    nop

    .line 808
    move-object/from16 v1, p1

    .local v1, "$this$fastFirstOrNull$iv":Ljava/util/List;
    const/4 v2, 0x0

    .line 1259
    .restart local v2    # "$i$f$fastFirstOrNull":I
    nop

    .line 1260
    move-object v5, v1

    .local v5, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v8, 0x0

    .line 1261
    .local v8, "$i$f$fastForEach":I
    nop

    .line 1262
    const/4 v9, 0x0

    .restart local v9    # "index$iv$iv":I
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v10

    :goto_a
    if-ge v9, v10, :cond_a

    .line 1263
    invoke-interface {v5, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    .line 1264
    .local v11, "item$iv$iv":Ljava/lang/Object;
    move-object v12, v11

    .local v12, "it$iv":Ljava/lang/Object;
    const/4 v13, 0x0

    .line 1260
    .local v13, "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    move-object v14, v12

    check-cast v14, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .local v14, "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/4 v15, 0x0

    .line 808
    .local v15, "$i$a$-fastFirstOrNull-TextFieldMeasurePolicy$intrinsicWidth$suffixWidth$1":I
    move-object/from16 v16, v1

    .end local v1    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .restart local v16    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    invoke-static {v14}, Landroidx/compose/material3/internal/TextFieldImplKt;->getLayoutId(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Ljava/lang/Object;

    move-result-object v1

    move/from16 v17, v2

    .end local v2    # "$i$f$fastFirstOrNull":I
    .local v17, "$i$f$fastFirstOrNull":I
    const-string v2, "Suffix"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    .line 1260
    .end local v14    # "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .end local v15    # "$i$a$-fastFirstOrNull-TextFieldMeasurePolicy$intrinsicWidth$suffixWidth$1":I
    if-eqz v1, :cond_9

    goto :goto_b

    .line 1264
    .end local v12    # "it$iv":Ljava/lang/Object;
    .end local v13    # "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    :cond_9
    nop

    .line 1262
    .end local v11    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v9, v9, 0x1

    move-object/from16 v1, v16

    move/from16 v2, v17

    goto :goto_a

    .end local v16    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .end local v17    # "$i$f$fastFirstOrNull":I
    .restart local v1    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .restart local v2    # "$i$f$fastFirstOrNull":I
    :cond_a
    move-object/from16 v16, v1

    move/from16 v17, v2

    .line 1266
    .end local v1    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .end local v2    # "$i$f$fastFirstOrNull":I
    .end local v9    # "index$iv$iv":I
    .restart local v16    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .restart local v17    # "$i$f$fastFirstOrNull":I
    nop

    .line 1267
    .end local v5    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v8    # "$i$f$fastForEach":I
    const/4 v12, 0x0

    .line 808
    .end local v16    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .end local v17    # "$i$f$fastFirstOrNull":I
    :goto_b
    check-cast v12, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .line 809
    if-eqz v12, :cond_b

    .line 808
    nop

    .line 809
    nop

    .line 1240
    .local v12, "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/4 v1, 0x0

    .line 809
    .local v1, "$i$a$-let-TextFieldMeasurePolicy$intrinsicWidth$suffixWidth$2":I
    invoke-static/range {p2 .. p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v12, v2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v1

    .line 807
    .end local v1    # "$i$a$-let-TextFieldMeasurePolicy$intrinsicWidth$suffixWidth$2":I
    .end local v12    # "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    move v5, v1

    goto :goto_c

    .line 809
    :cond_b
    const/4 v5, 0x0

    .line 807
    :goto_c
    nop

    .line 806
    nop

    .line 811
    .local v5, "suffixWidth":I
    nop

    .line 812
    move-object/from16 v1, p1

    .local v1, "$this$fastFirstOrNull$iv":Ljava/util/List;
    const/4 v2, 0x0

    .line 1268
    .restart local v2    # "$i$f$fastFirstOrNull":I
    nop

    .line 1269
    move-object v8, v1

    .local v8, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v9, 0x0

    .line 1270
    .local v9, "$i$f$fastForEach":I
    nop

    .line 1271
    const/4 v10, 0x0

    .local v10, "index$iv$iv":I
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v11

    :goto_d
    if-ge v10, v11, :cond_d

    .line 1272
    invoke-interface {v8, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    .line 1273
    .local v12, "item$iv$iv":Ljava/lang/Object;
    move-object v13, v12

    .local v13, "it$iv":Ljava/lang/Object;
    const/4 v14, 0x0

    .line 1269
    .local v14, "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    move-object v15, v13

    check-cast v15, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .local v15, "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/16 v16, 0x0

    .line 812
    .local v16, "$i$a$-fastFirstOrNull-TextFieldMeasurePolicy$intrinsicWidth$leadingWidth$1":I
    move-object/from16 v17, v1

    .end local v1    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .local v17, "$this$fastFirstOrNull$iv":Ljava/util/List;
    invoke-static {v15}, Landroidx/compose/material3/internal/TextFieldImplKt;->getLayoutId(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Ljava/lang/Object;

    move-result-object v1

    move/from16 v18, v2

    .end local v2    # "$i$f$fastFirstOrNull":I
    .local v18, "$i$f$fastFirstOrNull":I
    const-string v2, "Leading"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    .line 1269
    .end local v15    # "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .end local v16    # "$i$a$-fastFirstOrNull-TextFieldMeasurePolicy$intrinsicWidth$leadingWidth$1":I
    if-eqz v1, :cond_c

    goto :goto_e

    .line 1273
    .end local v13    # "it$iv":Ljava/lang/Object;
    .end local v14    # "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    :cond_c
    nop

    .line 1271
    .end local v12    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v10, v10, 0x1

    move-object/from16 v1, v17

    move/from16 v2, v18

    goto :goto_d

    .end local v17    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .end local v18    # "$i$f$fastFirstOrNull":I
    .restart local v1    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .restart local v2    # "$i$f$fastFirstOrNull":I
    :cond_d
    move-object/from16 v17, v1

    move/from16 v18, v2

    .line 1275
    .end local v1    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .end local v2    # "$i$f$fastFirstOrNull":I
    .end local v10    # "index$iv$iv":I
    .restart local v17    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .restart local v18    # "$i$f$fastFirstOrNull":I
    nop

    .line 1276
    .end local v8    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v9    # "$i$f$fastForEach":I
    const/4 v13, 0x0

    .line 812
    .end local v17    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .end local v18    # "$i$f$fastFirstOrNull":I
    :goto_e
    check-cast v13, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .line 813
    if-eqz v13, :cond_e

    .line 812
    nop

    .line 813
    nop

    .line 1240
    .local v13, "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/4 v1, 0x0

    .line 813
    .local v1, "$i$a$-let-TextFieldMeasurePolicy$intrinsicWidth$leadingWidth$2":I
    invoke-static/range {p2 .. p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v13, v2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v1

    .line 811
    .end local v1    # "$i$a$-let-TextFieldMeasurePolicy$intrinsicWidth$leadingWidth$2":I
    .end local v13    # "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    move v2, v1

    goto :goto_f

    .line 813
    :cond_e
    const/4 v2, 0x0

    .line 811
    :goto_f
    nop

    .line 810
    nop

    .line 815
    .local v2, "leadingWidth":I
    nop

    .line 816
    move-object/from16 v1, p1

    .local v1, "$this$fastFirstOrNull$iv":Ljava/util/List;
    const/4 v8, 0x0

    .line 1277
    .local v8, "$i$f$fastFirstOrNull":I
    nop

    .line 1278
    move-object v9, v1

    .local v9, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v10, 0x0

    .line 1279
    .local v10, "$i$f$fastForEach":I
    nop

    .line 1280
    const/4 v11, 0x0

    .local v11, "index$iv$iv":I
    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v12

    :goto_10
    if-ge v11, v12, :cond_10

    .line 1281
    invoke-interface {v9, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    .line 1282
    .local v13, "item$iv$iv":Ljava/lang/Object;
    move-object v14, v13

    .local v14, "it$iv":Ljava/lang/Object;
    const/4 v15, 0x0

    .line 1278
    .local v15, "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    move-object/from16 v16, v14

    check-cast v16, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .local v16, "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/16 v17, 0x0

    .line 816
    .local v17, "$i$a$-fastFirstOrNull-TextFieldMeasurePolicy$intrinsicWidth$placeholderWidth$1":I
    move-object/from16 v18, v1

    .end local v1    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .local v18, "$this$fastFirstOrNull$iv":Ljava/util/List;
    invoke-static/range {v16 .. v16}, Landroidx/compose/material3/internal/TextFieldImplKt;->getLayoutId(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Ljava/lang/Object;

    move-result-object v1

    move/from16 v19, v2

    .end local v2    # "leadingWidth":I
    .local v19, "leadingWidth":I
    const-string v2, "Hint"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    .line 1278
    .end local v16    # "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .end local v17    # "$i$a$-fastFirstOrNull-TextFieldMeasurePolicy$intrinsicWidth$placeholderWidth$1":I
    if-eqz v1, :cond_f

    move-object v8, v14

    goto :goto_11

    .line 1282
    .end local v14    # "it$iv":Ljava/lang/Object;
    .end local v15    # "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    :cond_f
    nop

    .line 1280
    .end local v13    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v11, v11, 0x1

    move-object/from16 v1, v18

    move/from16 v2, v19

    goto :goto_10

    .end local v18    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .end local v19    # "leadingWidth":I
    .restart local v1    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .restart local v2    # "leadingWidth":I
    :cond_10
    move-object/from16 v18, v1

    move/from16 v19, v2

    .line 1284
    .end local v1    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .end local v2    # "leadingWidth":I
    .end local v11    # "index$iv$iv":I
    .restart local v18    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .restart local v19    # "leadingWidth":I
    nop

    .line 1285
    .end local v9    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v10    # "$i$f$fastForEach":I
    const/4 v8, 0x0

    .line 816
    .end local v8    # "$i$f$fastFirstOrNull":I
    .end local v18    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    :goto_11
    check-cast v8, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .line 817
    if-eqz v8, :cond_11

    .line 816
    nop

    .line 817
    nop

    .line 1240
    .local v8, "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/4 v1, 0x0

    .line 817
    .local v1, "$i$a$-let-TextFieldMeasurePolicy$intrinsicWidth$placeholderWidth$2":I
    invoke-static/range {p2 .. p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v8, v2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v1

    .line 815
    .end local v1    # "$i$a$-let-TextFieldMeasurePolicy$intrinsicWidth$placeholderWidth$2":I
    .end local v8    # "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    move v8, v1

    goto :goto_12

    .line 817
    :cond_11
    const/4 v8, 0x0

    .line 815
    :goto_12
    nop

    .line 814
    nop

    .line 819
    .local v8, "placeholderWidth":I
    nop

    .line 820
    nop

    .line 821
    nop

    .line 822
    nop

    .line 823
    nop

    .line 824
    nop

    .line 825
    nop

    .line 826
    invoke-static {}, Landroidx/compose/material3/internal/TextFieldImplKt;->getZeroConstraints()J

    move-result-wide v9

    .line 818
    move/from16 v2, v19

    .end local v19    # "leadingWidth":I
    .restart local v2    # "leadingWidth":I
    invoke-static/range {v2 .. v10}, Landroidx/compose/material3/TextFieldKt;->access$calculateWidth-yeHjK3Y(IIIIIIIJ)I

    move-result v1

    return v1

    .line 1227
    .end local v6    # "textFieldWidth":I
    .end local v8    # "placeholderWidth":I
    .local v1, "$this$fastFirst$iv":Ljava/util/List;
    .local v2, "$i$f$fastFirst":I
    .local v3, "$this$fastForEach$iv$iv":Ljava/util/List;
    .local v4, "$i$f$fastForEach":I
    .local v5, "index$iv$iv":I
    .local v7, "item$iv$iv":Ljava/lang/Object;
    :cond_12
    nop

    .line 1225
    .end local v7    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_0

    .line 1229
    .end local v5    # "index$iv$iv":I
    :cond_13
    nop

    .line 1230
    .end local v3    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v4    # "$i$f$fastForEach":I
    new-instance v3, Ljava/util/NoSuchElementException;

    const-string v4, "Collection contains no element matching the predicate."

    invoke-direct {v3, v4}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v3
.end method


# virtual methods
.method public maxIntrinsicHeight(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;I)I
    .locals 1
    .param p1, "$this$maxIntrinsicHeight"    # Landroidx/compose/ui/layout/IntrinsicMeasureScope;
    .param p2, "measurables"    # Ljava/util/List;
    .param p3, "width"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/layout/IntrinsicMeasureScope;",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/ui/layout/IntrinsicMeasurable;",
            ">;I)I"
        }
    .end annotation

    .line 755
    sget-object v0, Landroidx/compose/material3/TextFieldMeasurePolicy$maxIntrinsicHeight$1;->INSTANCE:Landroidx/compose/material3/TextFieldMeasurePolicy$maxIntrinsicHeight$1;

    check-cast v0, Lkotlin/jvm/functions/Function2;

    invoke-direct {p0, p1, p2, p3, v0}, Landroidx/compose/material3/TextFieldMeasurePolicy;->intrinsicHeight(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;ILkotlin/jvm/functions/Function2;)I

    move-result v0

    return v0
.end method

.method public maxIntrinsicWidth(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;I)I
    .locals 1
    .param p1, "$this$maxIntrinsicWidth"    # Landroidx/compose/ui/layout/IntrinsicMeasureScope;
    .param p2, "measurables"    # Ljava/util/List;
    .param p3, "height"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/layout/IntrinsicMeasureScope;",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/ui/layout/IntrinsicMeasurable;",
            ">;I)I"
        }
    .end annotation

    .line 773
    sget-object v0, Landroidx/compose/material3/TextFieldMeasurePolicy$maxIntrinsicWidth$1;->INSTANCE:Landroidx/compose/material3/TextFieldMeasurePolicy$maxIntrinsicWidth$1;

    check-cast v0, Lkotlin/jvm/functions/Function2;

    invoke-direct {p0, p2, p3, v0}, Landroidx/compose/material3/TextFieldMeasurePolicy;->intrinsicWidth(Ljava/util/List;ILkotlin/jvm/functions/Function2;)I

    move-result v0

    return v0
.end method

.method public measure-3p2s80s(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;
    .locals 47
    .param p1, "$this$measure_u2d3p2s80s"    # Landroidx/compose/ui/layout/MeasureScope;
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

    .line 583
    move-object/from16 v12, p0

    move-object/from16 v14, p1

    iget-object v0, v12, Landroidx/compose/material3/TextFieldMeasurePolicy;->paddingValues:Landroidx/compose/foundation/layout/PaddingValues;

    invoke-interface {v0}, Landroidx/compose/foundation/layout/PaddingValues;->calculateTopPadding-D9Ej5fM()F

    move-result v0

    invoke-interface {v14, v0}, Landroidx/compose/ui/layout/MeasureScope;->roundToPx-0680j_4(F)I

    move-result v13

    .line 584
    .local v13, "topPaddingValue":I
    iget-object v0, v12, Landroidx/compose/material3/TextFieldMeasurePolicy;->paddingValues:Landroidx/compose/foundation/layout/PaddingValues;

    invoke-interface {v0}, Landroidx/compose/foundation/layout/PaddingValues;->calculateBottomPadding-D9Ej5fM()F

    move-result v0

    invoke-interface {v14, v0}, Landroidx/compose/ui/layout/MeasureScope;->roundToPx-0680j_4(F)I

    move-result v15

    .line 586
    .local v15, "bottomPaddingValue":I
    const/4 v0, 0x0

    .line 587
    .local v0, "occupiedSpaceHorizontally":I
    const/4 v1, 0x0

    .line 589
    .local v1, "occupiedSpaceVertically":I
    const/16 v8, 0xa

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-wide/from16 v2, p3

    invoke-static/range {v2 .. v9}, Landroidx/compose/ui/unit/Constraints;->copy-Zbe2FdA$default(JIIIIILjava/lang/Object;)J

    move-result-wide v4

    .line 593
    .local v4, "looseConstraints":J
    move-object/from16 v2, p2

    .local v2, "$this$fastFirstOrNull$iv":Ljava/util/List;
    const/4 v3, 0x0

    .line 1141
    .local v3, "$i$f$fastFirstOrNull":I
    nop

    .line 1142
    move-object v6, v2

    .local v6, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v7, 0x0

    .line 1143
    .local v7, "$i$f$fastForEach":I
    nop

    .line 1144
    const/4 v8, 0x0

    .local v8, "index$iv$iv":I
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v9

    :goto_0
    if-ge v8, v9, :cond_1

    .line 1145
    invoke-interface {v6, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    .line 1146
    .local v11, "item$iv$iv":Ljava/lang/Object;
    move-object/from16 v16, v11

    .local v16, "it$iv":Ljava/lang/Object;
    const/16 v17, 0x0

    .line 1142
    .local v17, "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    move-object/from16 v18, v16

    check-cast v18, Landroidx/compose/ui/layout/Measurable;

    .local v18, "it":Landroidx/compose/ui/layout/Measurable;
    const/16 v19, 0x0

    .line 593
    .local v19, "$i$a$-fastFirstOrNull-TextFieldMeasurePolicy$measure$leadingPlaceable$1":I
    invoke-static/range {v18 .. v18}, Landroidx/compose/ui/layout/LayoutIdKt;->getLayoutId(Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;

    move-result-object v10

    move/from16 v20, v0

    .end local v0    # "occupiedSpaceHorizontally":I
    .local v20, "occupiedSpaceHorizontally":I
    const-string v0, "Leading"

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    .line 1142
    .end local v18    # "it":Landroidx/compose/ui/layout/Measurable;
    .end local v19    # "$i$a$-fastFirstOrNull-TextFieldMeasurePolicy$measure$leadingPlaceable$1":I
    if-eqz v0, :cond_0

    goto :goto_1

    .line 1146
    .end local v16    # "it$iv":Ljava/lang/Object;
    .end local v17    # "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    :cond_0
    nop

    .line 1144
    .end local v11    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v8, v8, 0x1

    move/from16 v0, v20

    goto :goto_0

    .end local v20    # "occupiedSpaceHorizontally":I
    .restart local v0    # "occupiedSpaceHorizontally":I
    :cond_1
    move/from16 v20, v0

    .line 1148
    .end local v0    # "occupiedSpaceHorizontally":I
    .end local v8    # "index$iv$iv":I
    .restart local v20    # "occupiedSpaceHorizontally":I
    nop

    .line 1149
    .end local v6    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v7    # "$i$f$fastForEach":I
    const/16 v16, 0x0

    .line 593
    .end local v2    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .end local v3    # "$i$f$fastFirstOrNull":I
    :goto_1
    move-object/from16 v0, v16

    check-cast v0, Landroidx/compose/ui/layout/Measurable;

    if-eqz v0, :cond_2

    invoke-interface {v0, v4, v5}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    move-result-object v0

    move-object v6, v0

    goto :goto_2

    :cond_2
    const/4 v6, 0x0

    .line 592
    :goto_2
    nop

    .line 594
    .local v6, "leadingPlaceable":Landroidx/compose/ui/layout/Placeable;
    invoke-static {v6}, Landroidx/compose/material3/internal/TextFieldImplKt;->widthOrZero(Landroidx/compose/ui/layout/Placeable;)I

    move-result v0

    add-int v0, v20, v0

    .line 595
    .end local v20    # "occupiedSpaceHorizontally":I
    .restart local v0    # "occupiedSpaceHorizontally":I
    invoke-static {v6}, Landroidx/compose/material3/internal/TextFieldImplKt;->heightOrZero(Landroidx/compose/ui/layout/Placeable;)I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 601
    nop

    .line 599
    nop

    .line 600
    move-object/from16 v2, p2

    .restart local v2    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    const/4 v3, 0x0

    .line 1150
    .restart local v3    # "$i$f$fastFirstOrNull":I
    nop

    .line 1151
    move-object v7, v2

    .local v7, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v8, 0x0

    .line 1152
    .local v8, "$i$f$fastForEach":I
    nop

    .line 1153
    const/4 v9, 0x0

    .local v9, "index$iv$iv":I
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v10

    :goto_3
    if-ge v9, v10, :cond_4

    .line 1154
    invoke-interface {v7, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    .line 1155
    .restart local v11    # "item$iv$iv":Ljava/lang/Object;
    move-object/from16 v16, v11

    .restart local v16    # "it$iv":Ljava/lang/Object;
    const/16 v17, 0x0

    .line 1151
    .restart local v17    # "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    move-object/from16 v18, v16

    check-cast v18, Landroidx/compose/ui/layout/Measurable;

    .restart local v18    # "it":Landroidx/compose/ui/layout/Measurable;
    const/16 v19, 0x0

    .line 600
    .local v19, "$i$a$-fastFirstOrNull-TextFieldMeasurePolicy$measure$trailingPlaceable$1":I
    move-object/from16 v20, v2

    .end local v2    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .local v20, "$this$fastFirstOrNull$iv":Ljava/util/List;
    invoke-static/range {v18 .. v18}, Landroidx/compose/ui/layout/LayoutIdKt;->getLayoutId(Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;

    move-result-object v2

    move/from16 v21, v3

    .end local v3    # "$i$f$fastFirstOrNull":I
    .local v21, "$i$f$fastFirstOrNull":I
    const-string v3, "Trailing"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    .line 1151
    .end local v18    # "it":Landroidx/compose/ui/layout/Measurable;
    .end local v19    # "$i$a$-fastFirstOrNull-TextFieldMeasurePolicy$measure$trailingPlaceable$1":I
    if-eqz v2, :cond_3

    goto :goto_4

    .line 1155
    .end local v16    # "it$iv":Ljava/lang/Object;
    .end local v17    # "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    :cond_3
    nop

    .line 1153
    .end local v11    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v9, v9, 0x1

    move-object/from16 v2, v20

    move/from16 v3, v21

    goto :goto_3

    .end local v20    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .end local v21    # "$i$f$fastFirstOrNull":I
    .restart local v2    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .restart local v3    # "$i$f$fastFirstOrNull":I
    :cond_4
    move-object/from16 v20, v2

    move/from16 v21, v3

    .line 1157
    .end local v2    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .end local v3    # "$i$f$fastFirstOrNull":I
    .end local v9    # "index$iv$iv":I
    .restart local v20    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .restart local v21    # "$i$f$fastFirstOrNull":I
    nop

    .line 1158
    .end local v7    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v8    # "$i$f$fastForEach":I
    const/16 v16, 0x0

    .line 600
    .end local v20    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .end local v21    # "$i$f$fastFirstOrNull":I
    :goto_4
    move-object/from16 v2, v16

    check-cast v2, Landroidx/compose/ui/layout/Measurable;

    .line 601
    if-eqz v2, :cond_5

    .line 600
    nop

    .line 601
    neg-int v3, v0

    const/16 v20, 0x2

    const/16 v21, 0x0

    const/16 v19, 0x0

    move/from16 v18, v3

    move-wide/from16 v16, v4

    .end local v4    # "looseConstraints":J
    .local v16, "looseConstraints":J
    invoke-static/range {v16 .. v21}, Landroidx/compose/ui/unit/ConstraintsKt;->offset-NN6Ew-U$default(JIIILjava/lang/Object;)J

    move-result-wide v3

    invoke-interface {v2, v3, v4}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    move-result-object v2

    move-object v7, v2

    goto :goto_5

    .end local v16    # "looseConstraints":J
    .restart local v4    # "looseConstraints":J
    :cond_5
    move-wide/from16 v16, v4

    .end local v4    # "looseConstraints":J
    .restart local v16    # "looseConstraints":J
    const/4 v7, 0x0

    .line 598
    :goto_5
    nop

    .line 602
    .local v7, "trailingPlaceable":Landroidx/compose/ui/layout/Placeable;
    invoke-static {v7}, Landroidx/compose/material3/internal/TextFieldImplKt;->widthOrZero(Landroidx/compose/ui/layout/Placeable;)I

    move-result v2

    add-int/2addr v0, v2

    .line 603
    invoke-static {v7}, Landroidx/compose/material3/internal/TextFieldImplKt;->heightOrZero(Landroidx/compose/ui/layout/Placeable;)I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 609
    nop

    .line 607
    nop

    .line 608
    move-object/from16 v2, p2

    .restart local v2    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    const/4 v3, 0x0

    .line 1159
    .restart local v3    # "$i$f$fastFirstOrNull":I
    nop

    .line 1160
    move-object v4, v2

    .local v4, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v5, 0x0

    .line 1161
    .local v5, "$i$f$fastForEach":I
    nop

    .line 1162
    const/4 v8, 0x0

    .local v8, "index$iv$iv":I
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v9

    :goto_6
    if-ge v8, v9, :cond_7

    .line 1163
    invoke-interface {v4, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    .line 1164
    .local v10, "item$iv$iv":Ljava/lang/Object;
    move-object v11, v10

    .local v11, "it$iv":Ljava/lang/Object;
    const/16 v18, 0x0

    .line 1160
    .local v18, "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    move-object/from16 v19, v11

    check-cast v19, Landroidx/compose/ui/layout/Measurable;

    .local v19, "it":Landroidx/compose/ui/layout/Measurable;
    const/16 v20, 0x0

    .line 608
    .local v20, "$i$a$-fastFirstOrNull-TextFieldMeasurePolicy$measure$prefixPlaceable$1":I
    move-object/from16 v21, v2

    .end local v2    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .local v21, "$this$fastFirstOrNull$iv":Ljava/util/List;
    invoke-static/range {v19 .. v19}, Landroidx/compose/ui/layout/LayoutIdKt;->getLayoutId(Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;

    move-result-object v2

    move/from16 v22, v3

    .end local v3    # "$i$f$fastFirstOrNull":I
    .local v22, "$i$f$fastFirstOrNull":I
    const-string v3, "Prefix"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    .line 1160
    .end local v19    # "it":Landroidx/compose/ui/layout/Measurable;
    .end local v20    # "$i$a$-fastFirstOrNull-TextFieldMeasurePolicy$measure$prefixPlaceable$1":I
    if-eqz v2, :cond_6

    goto :goto_7

    .line 1164
    .end local v11    # "it$iv":Ljava/lang/Object;
    .end local v18    # "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    :cond_6
    nop

    .line 1162
    .end local v10    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v8, v8, 0x1

    move-object/from16 v2, v21

    move/from16 v3, v22

    goto :goto_6

    .end local v21    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .end local v22    # "$i$f$fastFirstOrNull":I
    .restart local v2    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .restart local v3    # "$i$f$fastFirstOrNull":I
    :cond_7
    move-object/from16 v21, v2

    move/from16 v22, v3

    .line 1166
    .end local v2    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .end local v3    # "$i$f$fastFirstOrNull":I
    .end local v8    # "index$iv$iv":I
    .restart local v21    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .restart local v22    # "$i$f$fastFirstOrNull":I
    nop

    .line 1167
    .end local v4    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v5    # "$i$f$fastForEach":I
    const/4 v11, 0x0

    .line 608
    .end local v21    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .end local v22    # "$i$f$fastFirstOrNull":I
    :goto_7
    check-cast v11, Landroidx/compose/ui/layout/Measurable;

    .line 609
    if-eqz v11, :cond_8

    .line 608
    nop

    .line 609
    neg-int v2, v0

    const/16 v20, 0x2

    const/16 v21, 0x0

    const/16 v19, 0x0

    move/from16 v18, v2

    invoke-static/range {v16 .. v21}, Landroidx/compose/ui/unit/ConstraintsKt;->offset-NN6Ew-U$default(JIIILjava/lang/Object;)J

    move-result-wide v2

    invoke-interface {v11, v2, v3}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    move-result-object v2

    move-object v8, v2

    goto :goto_8

    :cond_8
    const/4 v8, 0x0

    .line 606
    :goto_8
    nop

    .line 610
    .local v8, "prefixPlaceable":Landroidx/compose/ui/layout/Placeable;
    invoke-static {v8}, Landroidx/compose/material3/internal/TextFieldImplKt;->widthOrZero(Landroidx/compose/ui/layout/Placeable;)I

    move-result v2

    add-int/2addr v0, v2

    .line 611
    invoke-static {v8}, Landroidx/compose/material3/internal/TextFieldImplKt;->heightOrZero(Landroidx/compose/ui/layout/Placeable;)I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 617
    nop

    .line 615
    nop

    .line 616
    move-object/from16 v2, p2

    .restart local v2    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    const/4 v3, 0x0

    .line 1168
    .restart local v3    # "$i$f$fastFirstOrNull":I
    nop

    .line 1169
    move-object v4, v2

    .restart local v4    # "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v5, 0x0

    .line 1170
    .restart local v5    # "$i$f$fastForEach":I
    nop

    .line 1171
    const/4 v9, 0x0

    .restart local v9    # "index$iv$iv":I
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v10

    :goto_9
    if-ge v9, v10, :cond_a

    .line 1172
    invoke-interface {v4, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    .line 1173
    .local v11, "item$iv$iv":Ljava/lang/Object;
    move-object/from16 v18, v11

    .local v18, "it$iv":Ljava/lang/Object;
    const/16 v19, 0x0

    .line 1169
    .local v19, "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    move-object/from16 v20, v18

    check-cast v20, Landroidx/compose/ui/layout/Measurable;

    .local v20, "it":Landroidx/compose/ui/layout/Measurable;
    const/16 v21, 0x0

    .line 616
    .local v21, "$i$a$-fastFirstOrNull-TextFieldMeasurePolicy$measure$suffixPlaceable$1":I
    move-object/from16 v22, v2

    .end local v2    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .local v22, "$this$fastFirstOrNull$iv":Ljava/util/List;
    invoke-static/range {v20 .. v20}, Landroidx/compose/ui/layout/LayoutIdKt;->getLayoutId(Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;

    move-result-object v2

    move/from16 v23, v3

    .end local v3    # "$i$f$fastFirstOrNull":I
    .local v23, "$i$f$fastFirstOrNull":I
    const-string v3, "Suffix"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    .line 1169
    .end local v20    # "it":Landroidx/compose/ui/layout/Measurable;
    .end local v21    # "$i$a$-fastFirstOrNull-TextFieldMeasurePolicy$measure$suffixPlaceable$1":I
    if-eqz v2, :cond_9

    goto :goto_a

    .line 1173
    .end local v18    # "it$iv":Ljava/lang/Object;
    .end local v19    # "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    :cond_9
    nop

    .line 1171
    .end local v11    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v9, v9, 0x1

    move-object/from16 v2, v22

    move/from16 v3, v23

    goto :goto_9

    .end local v22    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .end local v23    # "$i$f$fastFirstOrNull":I
    .restart local v2    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .restart local v3    # "$i$f$fastFirstOrNull":I
    :cond_a
    move-object/from16 v22, v2

    move/from16 v23, v3

    .line 1175
    .end local v2    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .end local v3    # "$i$f$fastFirstOrNull":I
    .end local v9    # "index$iv$iv":I
    .restart local v22    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .restart local v23    # "$i$f$fastFirstOrNull":I
    nop

    .line 1176
    .end local v4    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v5    # "$i$f$fastForEach":I
    const/16 v18, 0x0

    .line 616
    .end local v22    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .end local v23    # "$i$f$fastFirstOrNull":I
    :goto_a
    move-object/from16 v2, v18

    check-cast v2, Landroidx/compose/ui/layout/Measurable;

    .line 617
    if-eqz v2, :cond_b

    .line 616
    nop

    .line 617
    neg-int v3, v0

    const/16 v20, 0x2

    const/16 v21, 0x0

    const/16 v19, 0x0

    move/from16 v18, v3

    invoke-static/range {v16 .. v21}, Landroidx/compose/ui/unit/ConstraintsKt;->offset-NN6Ew-U$default(JIIILjava/lang/Object;)J

    move-result-wide v3

    move-wide/from16 v9, v16

    .end local v16    # "looseConstraints":J
    .local v9, "looseConstraints":J
    invoke-interface {v2, v3, v4}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    move-result-object v2

    goto :goto_b

    .end local v9    # "looseConstraints":J
    .restart local v16    # "looseConstraints":J
    :cond_b
    move-wide/from16 v9, v16

    .end local v16    # "looseConstraints":J
    .restart local v9    # "looseConstraints":J
    const/4 v2, 0x0

    .line 614
    :goto_b
    nop

    .line 618
    .local v2, "suffixPlaceable":Landroidx/compose/ui/layout/Placeable;
    invoke-static {v2}, Landroidx/compose/material3/internal/TextFieldImplKt;->widthOrZero(Landroidx/compose/ui/layout/Placeable;)I

    move-result v3

    add-int/2addr v0, v3

    .line 619
    invoke-static {v2}, Landroidx/compose/material3/internal/TextFieldImplKt;->heightOrZero(Landroidx/compose/ui/layout/Placeable;)I

    move-result v3

    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 624
    neg-int v3, v15

    .line 625
    neg-int v4, v0

    .line 623
    nop

    .line 625
    nop

    .line 624
    nop

    .line 623
    invoke-static {v9, v10, v4, v3}, Landroidx/compose/ui/unit/ConstraintsKt;->offset-NN6Ew-U(JII)J

    move-result-wide v3

    .line 622
    nop

    .line 628
    .local v3, "labelConstraints":J
    move-object/from16 v5, p2

    .local v5, "$this$fastFirstOrNull$iv":Ljava/util/List;
    const/4 v11, 0x0

    .line 1177
    .local v11, "$i$f$fastFirstOrNull":I
    nop

    .line 1178
    move-object/from16 v16, v5

    .local v16, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/16 v17, 0x0

    .line 1179
    .local v17, "$i$f$fastForEach":I
    nop

    .line 1180
    const/16 v18, 0x0

    move-object/from16 v29, v2

    .end local v2    # "suffixPlaceable":Landroidx/compose/ui/layout/Placeable;
    .local v18, "index$iv$iv":I
    .local v29, "suffixPlaceable":Landroidx/compose/ui/layout/Placeable;
    invoke-interface/range {v16 .. v16}, Ljava/util/List;->size()I

    move-result v2

    move-object/from16 v19, v5

    move/from16 v5, v18

    .end local v18    # "index$iv$iv":I
    .local v5, "index$iv$iv":I
    .local v19, "$this$fastFirstOrNull$iv":Ljava/util/List;
    :goto_c
    if-ge v5, v2, :cond_d

    .line 1181
    move/from16 v18, v2

    move-object/from16 v2, v16

    .end local v16    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .local v2, "$this$fastForEach$iv$iv":Ljava/util/List;
    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v16

    .line 1182
    .local v16, "item$iv$iv":Ljava/lang/Object;
    move-object/from16 v20, v16

    .local v20, "it$iv":Ljava/lang/Object;
    const/16 v21, 0x0

    .line 1178
    .local v21, "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    move-object/from16 v22, v20

    check-cast v22, Landroidx/compose/ui/layout/Measurable;

    .local v22, "it":Landroidx/compose/ui/layout/Measurable;
    const/16 v23, 0x0

    .line 628
    .local v23, "$i$a$-fastFirstOrNull-TextFieldMeasurePolicy$measure$labelPlaceable$1":I
    move-object/from16 v24, v2

    .end local v2    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .local v24, "$this$fastForEach$iv$iv":Ljava/util/List;
    invoke-static/range {v22 .. v22}, Landroidx/compose/ui/layout/LayoutIdKt;->getLayoutId(Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;

    move-result-object v2

    move/from16 v26, v5

    .end local v5    # "index$iv$iv":I
    .local v26, "index$iv$iv":I
    const-string v5, "Label"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    .line 1178
    .end local v22    # "it":Landroidx/compose/ui/layout/Measurable;
    .end local v23    # "$i$a$-fastFirstOrNull-TextFieldMeasurePolicy$measure$labelPlaceable$1":I
    if-eqz v2, :cond_c

    goto :goto_d

    .line 1182
    .end local v20    # "it$iv":Ljava/lang/Object;
    .end local v21    # "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    :cond_c
    nop

    .line 1180
    .end local v16    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v5, v26, 0x1

    move/from16 v2, v18

    move-object/from16 v16, v24

    .end local v26    # "index$iv$iv":I
    .restart local v5    # "index$iv$iv":I
    goto :goto_c

    .end local v24    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .local v16, "$this$fastForEach$iv$iv":Ljava/util/List;
    :cond_d
    move/from16 v26, v5

    move-object/from16 v24, v16

    .line 1184
    .end local v5    # "index$iv$iv":I
    .end local v16    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .restart local v24    # "$this$fastForEach$iv$iv":Ljava/util/List;
    nop

    .line 1185
    .end local v17    # "$i$f$fastForEach":I
    .end local v24    # "$this$fastForEach$iv$iv":Ljava/util/List;
    const/16 v20, 0x0

    .line 628
    .end local v11    # "$i$f$fastFirstOrNull":I
    .end local v19    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    :goto_d
    move-object/from16 v2, v20

    check-cast v2, Landroidx/compose/ui/layout/Measurable;

    if-eqz v2, :cond_e

    invoke-interface {v2, v3, v4}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    move-result-object v2

    goto :goto_e

    :cond_e
    const/4 v2, 0x0

    .line 627
    :goto_e
    nop

    .line 632
    .local v2, "labelPlaceable":Landroidx/compose/ui/layout/Placeable;
    move-object/from16 v5, p2

    .local v5, "$this$fastFirstOrNull$iv":Ljava/util/List;
    const/4 v11, 0x0

    .line 1186
    .restart local v11    # "$i$f$fastFirstOrNull":I
    nop

    .line 1187
    move-object/from16 v16, v5

    .restart local v16    # "$this$fastForEach$iv$iv":Ljava/util/List;
    const/16 v17, 0x0

    .line 1188
    .restart local v17    # "$i$f$fastForEach":I
    nop

    .line 1189
    const/16 v18, 0x0

    move-object/from16 v30, v2

    .end local v2    # "labelPlaceable":Landroidx/compose/ui/layout/Placeable;
    .restart local v18    # "index$iv$iv":I
    .local v30, "labelPlaceable":Landroidx/compose/ui/layout/Placeable;
    invoke-interface/range {v16 .. v16}, Ljava/util/List;->size()I

    move-result v2

    move-wide/from16 v31, v3

    move/from16 v3, v18

    .end local v18    # "index$iv$iv":I
    .local v3, "index$iv$iv":I
    .local v31, "labelConstraints":J
    :goto_f
    if-ge v3, v2, :cond_10

    .line 1190
    move-object/from16 v4, v16

    .end local v16    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .restart local v4    # "$this$fastForEach$iv$iv":Ljava/util/List;
    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v16

    .line 1191
    .local v16, "item$iv$iv":Ljava/lang/Object;
    move-object/from16 v18, v16

    .local v18, "it$iv":Ljava/lang/Object;
    const/16 v19, 0x0

    .line 1187
    .local v19, "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    move-object/from16 v20, v18

    check-cast v20, Landroidx/compose/ui/layout/Measurable;

    .local v20, "it":Landroidx/compose/ui/layout/Measurable;
    const/16 v21, 0x0

    .line 632
    .local v21, "$i$a$-fastFirstOrNull-TextFieldMeasurePolicy$measure$supportingMeasurable$1":I
    move/from16 v22, v2

    invoke-static/range {v20 .. v20}, Landroidx/compose/ui/layout/LayoutIdKt;->getLayoutId(Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;

    move-result-object v2

    move/from16 v23, v3

    .end local v3    # "index$iv$iv":I
    .local v23, "index$iv$iv":I
    const-string v3, "Supporting"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    .line 1187
    .end local v20    # "it":Landroidx/compose/ui/layout/Measurable;
    .end local v21    # "$i$a$-fastFirstOrNull-TextFieldMeasurePolicy$measure$supportingMeasurable$1":I
    if-eqz v2, :cond_f

    goto :goto_10

    .line 1191
    .end local v18    # "it$iv":Ljava/lang/Object;
    .end local v19    # "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    :cond_f
    nop

    .line 1189
    .end local v16    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v3, v23, 0x1

    move-object/from16 v16, v4

    move/from16 v2, v22

    .end local v23    # "index$iv$iv":I
    .restart local v3    # "index$iv$iv":I
    goto :goto_f

    .end local v4    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .local v16, "$this$fastForEach$iv$iv":Ljava/util/List;
    :cond_10
    move/from16 v23, v3

    move-object/from16 v4, v16

    .line 1193
    .end local v3    # "index$iv$iv":I
    .end local v16    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .restart local v4    # "$this$fastForEach$iv$iv":Ljava/util/List;
    nop

    .line 1194
    .end local v4    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v17    # "$i$f$fastForEach":I
    const/16 v18, 0x0

    .line 632
    .end local v5    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .end local v11    # "$i$f$fastFirstOrNull":I
    :goto_10
    move-object/from16 v2, v18

    check-cast v2, Landroidx/compose/ui/layout/Measurable;

    .line 634
    .local v2, "supportingMeasurable":Landroidx/compose/ui/layout/Measurable;
    if-eqz v2, :cond_11

    invoke-static/range {p3 .. p4}, Landroidx/compose/ui/unit/Constraints;->getMinWidth-impl(J)I

    move-result v4

    invoke-interface {v2, v4}, Landroidx/compose/ui/layout/Measurable;->minIntrinsicHeight(I)I

    move-result v4

    goto :goto_11

    :cond_11
    const/4 v4, 0x0

    .line 633
    :goto_11
    move/from16 v33, v4

    .line 637
    .local v33, "supportingIntrinsicHeight":I
    invoke-static/range {v30 .. v30}, Landroidx/compose/material3/internal/TextFieldImplKt;->heightOrZero(Landroidx/compose/ui/layout/Placeable;)I

    move-result v4

    add-int/2addr v4, v13

    .line 639
    .local v4, "effectiveTopOffset":I
    nop

    .line 640
    const/16 v22, 0xb

    const/16 v23, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    move-wide/from16 v16, p3

    move-object v11, v6

    .end local v6    # "leadingPlaceable":Landroidx/compose/ui/layout/Placeable;
    .local v11, "leadingPlaceable":Landroidx/compose/ui/layout/Placeable;
    invoke-static/range {v16 .. v23}, Landroidx/compose/ui/unit/Constraints;->copy-Zbe2FdA$default(JIIIIILjava/lang/Object;)J

    move-result-wide v5

    .line 642
    neg-int v3, v4

    sub-int/2addr v3, v15

    sub-int v3, v3, v33

    .line 643
    move/from16 v34, v4

    .end local v4    # "effectiveTopOffset":I
    .local v34, "effectiveTopOffset":I
    neg-int v4, v0

    .line 640
    nop

    .line 643
    nop

    .line 642
    nop

    .line 641
    invoke-static {v5, v6, v4, v3}, Landroidx/compose/ui/unit/ConstraintsKt;->offset-NN6Ew-U(JII)J

    move-result-wide v3

    .line 638
    nop

    .line 646
    .local v3, "textFieldConstraints":J
    move-object/from16 v5, p2

    .local v5, "$this$fastFirst$iv":Ljava/util/List;
    const/4 v6, 0x0

    .line 1195
    .local v6, "$i$f$fastFirst":I
    nop

    .line 1196
    move-object/from16 v16, v5

    .restart local v16    # "$this$fastForEach$iv$iv":Ljava/util/List;
    const/16 v17, 0x0

    .line 1197
    .restart local v17    # "$i$f$fastForEach":I
    nop

    .line 1198
    const/16 v18, 0x0

    move/from16 v35, v0

    .end local v0    # "occupiedSpaceHorizontally":I
    .local v18, "index$iv$iv":I
    .local v35, "occupiedSpaceHorizontally":I
    invoke-interface/range {v16 .. v16}, Ljava/util/List;->size()I

    move-result v0

    move-object/from16 v19, v5

    move/from16 v5, v18

    .end local v18    # "index$iv$iv":I
    .local v5, "index$iv$iv":I
    .local v19, "$this$fastFirst$iv":Ljava/util/List;
    :goto_12
    move/from16 v18, v6

    .end local v6    # "$i$f$fastFirst":I
    .local v18, "$i$f$fastFirst":I
    const-string v6, "Collection contains no element matching the predicate."

    if-ge v5, v0, :cond_1b

    .line 1199
    move/from16 v20, v0

    move-object/from16 v0, v16

    .end local v16    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .local v0, "$this$fastForEach$iv$iv":Ljava/util/List;
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v16

    .line 1200
    .local v16, "item$iv$iv":Ljava/lang/Object;
    move-object/from16 v21, v16

    .local v21, "it$iv":Ljava/lang/Object;
    const/16 v22, 0x0

    .line 1196
    .local v22, "$i$a$-fastForEach-ListUtilsKt$fastFirst$2$iv":I
    move-object/from16 v23, v21

    check-cast v23, Landroidx/compose/ui/layout/Measurable;

    .local v23, "it":Landroidx/compose/ui/layout/Measurable;
    const/16 v24, 0x0

    .line 646
    .local v24, "$i$a$-fastFirst-TextFieldMeasurePolicy$measure$textFieldPlaceable$1":I
    move-object/from16 v26, v0

    .end local v0    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .local v26, "$this$fastForEach$iv$iv":Ljava/util/List;
    invoke-static/range {v23 .. v23}, Landroidx/compose/ui/layout/LayoutIdKt;->getLayoutId(Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;

    move-result-object v0

    move/from16 v27, v5

    .end local v5    # "index$iv$iv":I
    .local v27, "index$iv$iv":I
    const-string v5, "TextField"

    invoke-static {v0, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    .line 1196
    .end local v23    # "it":Landroidx/compose/ui/layout/Measurable;
    .end local v24    # "$i$a$-fastFirst-TextFieldMeasurePolicy$measure$textFieldPlaceable$1":I
    if-eqz v0, :cond_1a

    .line 1203
    .end local v16    # "item$iv$iv":Ljava/lang/Object;
    .end local v17    # "$i$f$fastForEach":I
    .end local v18    # "$i$f$fastFirst":I
    .end local v19    # "$this$fastFirst$iv":Ljava/util/List;
    .end local v21    # "it$iv":Ljava/lang/Object;
    .end local v22    # "$i$a$-fastForEach-ListUtilsKt$fastFirst$2$iv":I
    .end local v26    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v27    # "index$iv$iv":I
    move-object/from16 v0, v21

    check-cast v0, Landroidx/compose/ui/layout/Measurable;

    .line 646
    invoke-interface {v0, v3, v4}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    move-result-object v0

    .line 645
    nop

    .line 649
    .local v0, "textFieldPlaceable":Landroidx/compose/ui/layout/Placeable;
    const/16 v22, 0xe

    const/16 v23, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    move-wide/from16 v16, v3

    .end local v3    # "textFieldConstraints":J
    .local v16, "textFieldConstraints":J
    invoke-static/range {v16 .. v23}, Landroidx/compose/ui/unit/Constraints;->copy-Zbe2FdA$default(JIIIIILjava/lang/Object;)J

    move-result-wide v3

    .line 653
    move-wide/from16 v36, v16

    .line 651
    .end local v16    # "textFieldConstraints":J
    .local v3, "placeholderConstraints":J
    .local v36, "textFieldConstraints":J
    nop

    .line 652
    move-object/from16 v5, p2

    .local v5, "$this$fastFirstOrNull$iv":Ljava/util/List;
    const/16 v16, 0x0

    .line 1204
    .local v16, "$i$f$fastFirstOrNull":I
    nop

    .line 1205
    move-object/from16 v17, v5

    .local v17, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/16 v18, 0x0

    .line 1206
    .local v18, "$i$f$fastForEach":I
    nop

    .line 1207
    const/16 v19, 0x0

    move-object/from16 v38, v0

    .end local v0    # "textFieldPlaceable":Landroidx/compose/ui/layout/Placeable;
    .local v19, "index$iv$iv":I
    .local v38, "textFieldPlaceable":Landroidx/compose/ui/layout/Placeable;
    invoke-interface/range {v17 .. v17}, Ljava/util/List;->size()I

    move-result v0

    move-object/from16 v20, v5

    move/from16 v5, v19

    .end local v19    # "index$iv$iv":I
    .local v5, "index$iv$iv":I
    .local v20, "$this$fastFirstOrNull$iv":Ljava/util/List;
    :goto_13
    if-ge v5, v0, :cond_13

    .line 1208
    move/from16 v19, v0

    move-object/from16 v0, v17

    .end local v17    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .local v0, "$this$fastForEach$iv$iv":Ljava/util/List;
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v17

    .line 1209
    .local v17, "item$iv$iv":Ljava/lang/Object;
    move-object/from16 v21, v17

    .restart local v21    # "it$iv":Ljava/lang/Object;
    const/16 v22, 0x0

    .line 1205
    .local v22, "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    move-object/from16 v23, v21

    check-cast v23, Landroidx/compose/ui/layout/Measurable;

    .restart local v23    # "it":Landroidx/compose/ui/layout/Measurable;
    const/16 v24, 0x0

    .line 652
    .local v24, "$i$a$-fastFirstOrNull-TextFieldMeasurePolicy$measure$placeholderPlaceable$1":I
    move-object/from16 v26, v0

    .end local v0    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .restart local v26    # "$this$fastForEach$iv$iv":Ljava/util/List;
    invoke-static/range {v23 .. v23}, Landroidx/compose/ui/layout/LayoutIdKt;->getLayoutId(Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;

    move-result-object v0

    move/from16 v27, v5

    .end local v5    # "index$iv$iv":I
    .restart local v27    # "index$iv$iv":I
    const-string v5, "Hint"

    invoke-static {v0, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    .line 1205
    .end local v23    # "it":Landroidx/compose/ui/layout/Measurable;
    .end local v24    # "$i$a$-fastFirstOrNull-TextFieldMeasurePolicy$measure$placeholderPlaceable$1":I
    if-eqz v0, :cond_12

    goto :goto_14

    .line 1209
    .end local v21    # "it$iv":Ljava/lang/Object;
    .end local v22    # "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    :cond_12
    nop

    .line 1207
    .end local v17    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v5, v27, 0x1

    move/from16 v0, v19

    move-object/from16 v17, v26

    .end local v27    # "index$iv$iv":I
    .restart local v5    # "index$iv$iv":I
    goto :goto_13

    .end local v26    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .local v17, "$this$fastForEach$iv$iv":Ljava/util/List;
    :cond_13
    move/from16 v27, v5

    move-object/from16 v26, v17

    .line 1211
    .end local v5    # "index$iv$iv":I
    .end local v17    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .restart local v26    # "$this$fastForEach$iv$iv":Ljava/util/List;
    nop

    .line 1212
    .end local v18    # "$i$f$fastForEach":I
    .end local v26    # "$this$fastForEach$iv$iv":Ljava/util/List;
    const/16 v21, 0x0

    .line 652
    .end local v16    # "$i$f$fastFirstOrNull":I
    .end local v20    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    :goto_14
    move-object/from16 v0, v21

    check-cast v0, Landroidx/compose/ui/layout/Measurable;

    .line 653
    if-eqz v0, :cond_14

    .line 652
    nop

    .line 653
    invoke-interface {v0, v3, v4}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    move-result-object v0

    move-object v5, v0

    goto :goto_15

    :cond_14
    const/4 v5, 0x0

    .line 650
    :goto_15
    nop

    .line 656
    .local v5, "placeholderPlaceable":Landroidx/compose/ui/layout/Placeable;
    nop

    .line 658
    invoke-static/range {v38 .. v38}, Landroidx/compose/material3/internal/TextFieldImplKt;->heightOrZero(Landroidx/compose/ui/layout/Placeable;)I

    move-result v0

    move-wide/from16 v39, v3

    .end local v3    # "placeholderConstraints":J
    .local v39, "placeholderConstraints":J
    invoke-static {v5}, Landroidx/compose/material3/internal/TextFieldImplKt;->heightOrZero(Landroidx/compose/ui/layout/Placeable;)I

    move-result v3

    invoke-static {v0, v3}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 659
    nop

    .line 658
    add-int v0, v0, v34

    .line 660
    nop

    .line 658
    add-int/2addr v0, v15

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 655
    nop

    .line 664
    .end local v1    # "occupiedSpaceVertically":I
    .local v0, "occupiedSpaceVertically":I
    invoke-static {v11}, Landroidx/compose/material3/internal/TextFieldImplKt;->widthOrZero(Landroidx/compose/ui/layout/Placeable;)I

    move-result v16

    .line 665
    invoke-static {v7}, Landroidx/compose/material3/internal/TextFieldImplKt;->widthOrZero(Landroidx/compose/ui/layout/Placeable;)I

    move-result v17

    .line 666
    invoke-static {v8}, Landroidx/compose/material3/internal/TextFieldImplKt;->widthOrZero(Landroidx/compose/ui/layout/Placeable;)I

    move-result v18

    .line 667
    invoke-static/range {v29 .. v29}, Landroidx/compose/material3/internal/TextFieldImplKt;->widthOrZero(Landroidx/compose/ui/layout/Placeable;)I

    move-result v19

    .line 668
    invoke-virtual/range {v38 .. v38}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    move-result v20

    .line 669
    invoke-static/range {v30 .. v30}, Landroidx/compose/material3/internal/TextFieldImplKt;->widthOrZero(Landroidx/compose/ui/layout/Placeable;)I

    move-result v21

    .line 670
    invoke-static {v5}, Landroidx/compose/material3/internal/TextFieldImplKt;->widthOrZero(Landroidx/compose/ui/layout/Placeable;)I

    move-result v22

    .line 671
    nop

    .line 663
    move-wide/from16 v23, p3

    invoke-static/range {v16 .. v24}, Landroidx/compose/material3/TextFieldKt;->access$calculateWidth-yeHjK3Y(IIIIIIIJ)I

    move-result v1

    .line 662
    nop

    .line 676
    .local v1, "width":I
    nop

    .line 677
    neg-int v3, v0

    const/16 v20, 0x1

    const/16 v21, 0x0

    const/16 v18, 0x0

    move/from16 v19, v3

    move-wide/from16 v16, v9

    .end local v9    # "looseConstraints":J
    .local v16, "looseConstraints":J
    invoke-static/range {v16 .. v21}, Landroidx/compose/ui/unit/ConstraintsKt;->offset-NN6Ew-U$default(JIIILjava/lang/Object;)J

    move-result-wide v3

    .line 678
    move-wide/from16 v41, v16

    .end local v16    # "looseConstraints":J
    .local v41, "looseConstraints":J
    const/16 v22, 0x9

    const/16 v23, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    move/from16 v19, v1

    move-wide/from16 v16, v3

    .end local v1    # "width":I
    .local v19, "width":I
    invoke-static/range {v16 .. v23}, Landroidx/compose/ui/unit/Constraints;->copy-Zbe2FdA$default(JIIIIILjava/lang/Object;)J

    move-result-wide v3

    .line 675
    .end local v19    # "width":I
    .restart local v1    # "width":I
    nop

    .line 679
    .local v3, "supportingConstraints":J
    if-eqz v2, :cond_15

    invoke-interface {v2, v3, v4}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    move-result-object v10

    goto :goto_16

    :cond_15
    const/4 v10, 0x0

    .line 680
    .local v10, "supportingPlaceable":Landroidx/compose/ui/layout/Placeable;
    :goto_16
    invoke-static {v10}, Landroidx/compose/material3/internal/TextFieldImplKt;->heightOrZero(Landroidx/compose/ui/layout/Placeable;)I

    move-result v43

    .line 684
    .local v43, "supportingHeight":I
    invoke-virtual/range {v38 .. v38}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    move-result v16

    .line 685
    invoke-static/range {v30 .. v30}, Landroidx/compose/material3/internal/TextFieldImplKt;->heightOrZero(Landroidx/compose/ui/layout/Placeable;)I

    move-result v17

    .line 686
    invoke-static {v11}, Landroidx/compose/material3/internal/TextFieldImplKt;->heightOrZero(Landroidx/compose/ui/layout/Placeable;)I

    move-result v18

    .line 687
    invoke-static {v7}, Landroidx/compose/material3/internal/TextFieldImplKt;->heightOrZero(Landroidx/compose/ui/layout/Placeable;)I

    move-result v19

    .line 688
    invoke-static {v8}, Landroidx/compose/material3/internal/TextFieldImplKt;->heightOrZero(Landroidx/compose/ui/layout/Placeable;)I

    move-result v20

    .line 689
    invoke-static/range {v29 .. v29}, Landroidx/compose/material3/internal/TextFieldImplKt;->heightOrZero(Landroidx/compose/ui/layout/Placeable;)I

    move-result v21

    .line 690
    invoke-static {v5}, Landroidx/compose/material3/internal/TextFieldImplKt;->heightOrZero(Landroidx/compose/ui/layout/Placeable;)I

    move-result v22

    .line 691
    invoke-static {v10}, Landroidx/compose/material3/internal/TextFieldImplKt;->heightOrZero(Landroidx/compose/ui/layout/Placeable;)I

    move-result v23

    .line 692
    iget v9, v12, Landroidx/compose/material3/TextFieldMeasurePolicy;->animationProgress:F

    .line 693
    nop

    .line 694
    invoke-interface {v14}, Landroidx/compose/ui/layout/MeasureScope;->getDensity()F

    move-result v27

    .line 695
    move/from16 v44, v0

    .end local v0    # "occupiedSpaceVertically":I
    .local v44, "occupiedSpaceVertically":I
    iget-object v0, v12, Landroidx/compose/material3/TextFieldMeasurePolicy;->paddingValues:Landroidx/compose/foundation/layout/PaddingValues;

    .line 683
    move-wide/from16 v25, p3

    move-object/from16 v28, v0

    move/from16 v24, v9

    invoke-static/range {v16 .. v28}, Landroidx/compose/material3/TextFieldKt;->access$calculateHeight-mKXJcVc(IIIIIIIIFJFLandroidx/compose/foundation/layout/PaddingValues;)I

    move-result v0

    .line 682
    nop

    .line 697
    .local v0, "totalHeight":I
    sub-int v9, v0, v43

    .line 700
    .local v9, "height":I
    nop

    .line 701
    move-object/from16 v16, p2

    .local v16, "$this$fastFirst$iv":Ljava/util/List;
    const/16 v17, 0x0

    .line 1213
    .local v17, "$i$f$fastFirst":I
    nop

    .line 1214
    move-object/from16 v18, v16

    .local v18, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/16 v19, 0x0

    .line 1215
    .local v19, "$i$f$fastForEach":I
    nop

    .line 1216
    const/16 v20, 0x0

    move/from16 v21, v0

    .end local v0    # "totalHeight":I
    .local v20, "index$iv$iv":I
    .local v21, "totalHeight":I
    invoke-interface/range {v18 .. v18}, Ljava/util/List;->size()I

    move-result v0

    move-object/from16 v23, v2

    move/from16 v2, v20

    .end local v20    # "index$iv$iv":I
    .local v2, "index$iv$iv":I
    .local v23, "supportingMeasurable":Landroidx/compose/ui/layout/Measurable;
    :goto_17
    if-ge v2, v0, :cond_19

    .line 1217
    move/from16 v20, v0

    move-object/from16 v0, v18

    .end local v18    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .local v0, "$this$fastForEach$iv$iv":Ljava/util/List;
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v18

    .line 1218
    .local v18, "item$iv$iv":Ljava/lang/Object;
    move-object/from16 v22, v18

    .local v22, "it$iv":Ljava/lang/Object;
    const/16 v24, 0x0

    .line 1214
    .local v24, "$i$a$-fastForEach-ListUtilsKt$fastFirst$2$iv":I
    move-object/from16 v25, v22

    check-cast v25, Landroidx/compose/ui/layout/Measurable;

    .local v25, "it":Landroidx/compose/ui/layout/Measurable;
    const/16 v26, 0x0

    .line 701
    .local v26, "$i$a$-fastFirst-TextFieldMeasurePolicy$measure$containerPlaceable$1":I
    move-object/from16 v27, v0

    .end local v0    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .local v27, "$this$fastForEach$iv$iv":Ljava/util/List;
    invoke-static/range {v25 .. v25}, Landroidx/compose/ui/layout/LayoutIdKt;->getLayoutId(Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;

    move-result-object v0

    move/from16 v28, v2

    .end local v2    # "index$iv$iv":I
    .local v28, "index$iv$iv":I
    const-string v2, "Container"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    .line 1214
    .end local v25    # "it":Landroidx/compose/ui/layout/Measurable;
    .end local v26    # "$i$a$-fastFirst-TextFieldMeasurePolicy$measure$containerPlaceable$1":I
    if-eqz v0, :cond_18

    .line 1221
    .end local v16    # "$this$fastFirst$iv":Ljava/util/List;
    .end local v17    # "$i$f$fastFirst":I
    .end local v18    # "item$iv$iv":Ljava/lang/Object;
    .end local v19    # "$i$f$fastForEach":I
    .end local v22    # "it$iv":Ljava/lang/Object;
    .end local v24    # "$i$a$-fastForEach-ListUtilsKt$fastFirst$2$iv":I
    .end local v27    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v28    # "index$iv$iv":I
    move-object/from16 v0, v22

    check-cast v0, Landroidx/compose/ui/layout/Measurable;

    .line 704
    const v2, 0x7fffffff

    if-eq v1, v2, :cond_16

    move v6, v1

    goto :goto_18

    :cond_16
    const/4 v6, 0x0

    .line 705
    :goto_18
    nop

    .line 706
    if-eq v9, v2, :cond_17

    move v2, v9

    goto :goto_19

    :cond_17
    const/4 v2, 0x0

    .line 707
    :goto_19
    nop

    .line 703
    move-wide/from16 v45, v3

    .end local v3    # "supportingConstraints":J
    .local v45, "supportingConstraints":J
    invoke-static {v6, v1, v2, v9}, Landroidx/compose/ui/unit/ConstraintsKt;->Constraints(IIII)J

    move-result-wide v2

    .line 702
    invoke-interface {v0, v2, v3}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    move-result-object v0

    .line 699
    nop

    .line 711
    .local v0, "containerPlaceable":Landroidx/compose/ui/layout/Placeable;
    move-object v6, v11

    move-object v11, v10

    move-object v10, v0

    .end local v0    # "containerPlaceable":Landroidx/compose/ui/layout/Placeable;
    .local v6, "leadingPlaceable":Landroidx/compose/ui/layout/Placeable;
    .local v10, "containerPlaceable":Landroidx/compose/ui/layout/Placeable;
    .local v11, "supportingPlaceable":Landroidx/compose/ui/layout/Placeable;
    new-instance v0, Landroidx/compose/material3/TextFieldMeasurePolicy$measure$1;

    move v2, v1

    move/from16 v3, v21

    move-object/from16 v1, v30

    move-object/from16 v4, v38

    move/from16 v21, v9

    move-object/from16 v9, v29

    .end local v29    # "suffixPlaceable":Landroidx/compose/ui/layout/Placeable;
    .end local v30    # "labelPlaceable":Landroidx/compose/ui/layout/Placeable;
    .end local v38    # "textFieldPlaceable":Landroidx/compose/ui/layout/Placeable;
    .local v1, "labelPlaceable":Landroidx/compose/ui/layout/Placeable;
    .local v2, "width":I
    .local v3, "totalHeight":I
    .local v4, "textFieldPlaceable":Landroidx/compose/ui/layout/Placeable;
    .local v9, "suffixPlaceable":Landroidx/compose/ui/layout/Placeable;
    .local v21, "height":I
    invoke-direct/range {v0 .. v14}, Landroidx/compose/material3/TextFieldMeasurePolicy$measure$1;-><init>(Landroidx/compose/ui/layout/Placeable;IILandroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/material3/TextFieldMeasurePolicy;ILandroidx/compose/ui/layout/MeasureScope;)V

    move v1, v2

    move v2, v3

    move-object v12, v10

    move-object v10, v11

    move-object v9, v5

    move-object v11, v6

    .end local v3    # "totalHeight":I
    .end local v4    # "textFieldPlaceable":Landroidx/compose/ui/layout/Placeable;
    .end local v5    # "placeholderPlaceable":Landroidx/compose/ui/layout/Placeable;
    .end local v6    # "leadingPlaceable":Landroidx/compose/ui/layout/Placeable;
    .local v1, "width":I
    .local v2, "totalHeight":I
    .local v9, "placeholderPlaceable":Landroidx/compose/ui/layout/Placeable;
    .local v10, "supportingPlaceable":Landroidx/compose/ui/layout/Placeable;
    .local v11, "leadingPlaceable":Landroidx/compose/ui/layout/Placeable;
    .local v12, "containerPlaceable":Landroidx/compose/ui/layout/Placeable;
    .restart local v29    # "suffixPlaceable":Landroidx/compose/ui/layout/Placeable;
    .restart local v30    # "labelPlaceable":Landroidx/compose/ui/layout/Placeable;
    .restart local v38    # "textFieldPlaceable":Landroidx/compose/ui/layout/Placeable;
    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function1;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v3, 0x0

    move-object/from16 v0, p1

    invoke-static/range {v0 .. v6}, Landroidx/compose/ui/layout/MeasureScope;->layout$default(Landroidx/compose/ui/layout/MeasureScope;IILjava/util/Map;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/compose/ui/layout/MeasureResult;

    move-result-object v3

    return-object v3

    .line 1214
    .end local v2    # "totalHeight":I
    .end local v12    # "containerPlaceable":Landroidx/compose/ui/layout/Placeable;
    .end local v45    # "supportingConstraints":J
    .local v3, "supportingConstraints":J
    .restart local v5    # "placeholderPlaceable":Landroidx/compose/ui/layout/Placeable;
    .local v9, "height":I
    .restart local v16    # "$this$fastFirst$iv":Ljava/util/List;
    .restart local v17    # "$i$f$fastFirst":I
    .restart local v18    # "item$iv$iv":Ljava/lang/Object;
    .restart local v19    # "$i$f$fastForEach":I
    .local v21, "totalHeight":I
    .restart local v22    # "it$iv":Ljava/lang/Object;
    .restart local v24    # "$i$a$-fastForEach-ListUtilsKt$fastFirst$2$iv":I
    .restart local v27    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .restart local v28    # "index$iv$iv":I
    :cond_18
    move-wide/from16 v45, v3

    move/from16 v2, v21

    move/from16 v21, v9

    move-object v9, v5

    .line 1218
    .end local v3    # "supportingConstraints":J
    .end local v5    # "placeholderPlaceable":Landroidx/compose/ui/layout/Placeable;
    .end local v22    # "it$iv":Ljava/lang/Object;
    .end local v24    # "$i$a$-fastForEach-ListUtilsKt$fastFirst$2$iv":I
    .restart local v2    # "totalHeight":I
    .local v9, "placeholderPlaceable":Landroidx/compose/ui/layout/Placeable;
    .local v21, "height":I
    .restart local v45    # "supportingConstraints":J
    nop

    .line 1216
    .end local v18    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v0, v28, 0x1

    move-object/from16 v12, p0

    move-object/from16 v14, p1

    move/from16 v9, v21

    move-object/from16 v18, v27

    move/from16 v21, v2

    move v2, v0

    move/from16 v0, v20

    .end local v28    # "index$iv$iv":I
    .local v0, "index$iv$iv":I
    goto :goto_17

    .line 1220
    .end local v0    # "index$iv$iv":I
    .end local v2    # "totalHeight":I
    .end local v27    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v45    # "supportingConstraints":J
    .restart local v3    # "supportingConstraints":J
    .restart local v5    # "placeholderPlaceable":Landroidx/compose/ui/layout/Placeable;
    .local v9, "height":I
    .local v18, "$this$fastForEach$iv$iv":Ljava/util/List;
    .local v21, "totalHeight":I
    :cond_19
    nop

    .line 1221
    .end local v18    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v19    # "$i$f$fastForEach":I
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0, v6}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1196
    .end local v5    # "placeholderPlaceable":Landroidx/compose/ui/layout/Placeable;
    .end local v10    # "supportingPlaceable":Landroidx/compose/ui/layout/Placeable;
    .end local v23    # "supportingMeasurable":Landroidx/compose/ui/layout/Measurable;
    .end local v36    # "textFieldConstraints":J
    .end local v38    # "textFieldPlaceable":Landroidx/compose/ui/layout/Placeable;
    .end local v39    # "placeholderConstraints":J
    .end local v41    # "looseConstraints":J
    .end local v43    # "supportingHeight":I
    .end local v44    # "occupiedSpaceVertically":I
    .local v1, "occupiedSpaceVertically":I
    .local v2, "supportingMeasurable":Landroidx/compose/ui/layout/Measurable;
    .local v3, "textFieldConstraints":J
    .local v9, "looseConstraints":J
    .local v16, "item$iv$iv":Ljava/lang/Object;
    .local v17, "$i$f$fastForEach":I
    .local v18, "$i$f$fastFirst":I
    .local v19, "$this$fastFirst$iv":Ljava/util/List;
    .local v21, "it$iv":Ljava/lang/Object;
    .local v22, "$i$a$-fastForEach-ListUtilsKt$fastFirst$2$iv":I
    .local v26, "$this$fastForEach$iv$iv":Ljava/util/List;
    .local v27, "index$iv$iv":I
    :cond_1a
    move-object/from16 v23, v2

    move-wide/from16 v36, v3

    move-wide/from16 v41, v9

    .line 1200
    .end local v2    # "supportingMeasurable":Landroidx/compose/ui/layout/Measurable;
    .end local v3    # "textFieldConstraints":J
    .end local v9    # "looseConstraints":J
    .end local v21    # "it$iv":Ljava/lang/Object;
    .end local v22    # "$i$a$-fastForEach-ListUtilsKt$fastFirst$2$iv":I
    .restart local v23    # "supportingMeasurable":Landroidx/compose/ui/layout/Measurable;
    .restart local v36    # "textFieldConstraints":J
    .restart local v41    # "looseConstraints":J
    nop

    .line 1198
    .end local v16    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v5, v27, 0x1

    move-object/from16 v12, p0

    move-object/from16 v14, p1

    move/from16 v6, v18

    move/from16 v0, v20

    move-object/from16 v16, v26

    .end local v27    # "index$iv$iv":I
    .local v5, "index$iv$iv":I
    goto/16 :goto_12

    .line 1202
    .end local v5    # "index$iv$iv":I
    .end local v23    # "supportingMeasurable":Landroidx/compose/ui/layout/Measurable;
    .end local v26    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v36    # "textFieldConstraints":J
    .end local v41    # "looseConstraints":J
    .restart local v2    # "supportingMeasurable":Landroidx/compose/ui/layout/Measurable;
    .restart local v3    # "textFieldConstraints":J
    .restart local v9    # "looseConstraints":J
    .local v16, "$this$fastForEach$iv$iv":Ljava/util/List;
    :cond_1b
    nop

    .line 1203
    .end local v16    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v17    # "$i$f$fastForEach":I
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0, v6}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public minIntrinsicHeight(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;I)I
    .locals 1
    .param p1, "$this$minIntrinsicHeight"    # Landroidx/compose/ui/layout/IntrinsicMeasureScope;
    .param p2, "measurables"    # Ljava/util/List;
    .param p3, "width"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/layout/IntrinsicMeasureScope;",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/ui/layout/IntrinsicMeasurable;",
            ">;I)I"
        }
    .end annotation

    .line 764
    sget-object v0, Landroidx/compose/material3/TextFieldMeasurePolicy$minIntrinsicHeight$1;->INSTANCE:Landroidx/compose/material3/TextFieldMeasurePolicy$minIntrinsicHeight$1;

    check-cast v0, Lkotlin/jvm/functions/Function2;

    invoke-direct {p0, p1, p2, p3, v0}, Landroidx/compose/material3/TextFieldMeasurePolicy;->intrinsicHeight(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;ILkotlin/jvm/functions/Function2;)I

    move-result v0

    return v0
.end method

.method public minIntrinsicWidth(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;I)I
    .locals 1
    .param p1, "$this$minIntrinsicWidth"    # Landroidx/compose/ui/layout/IntrinsicMeasureScope;
    .param p2, "measurables"    # Ljava/util/List;
    .param p3, "height"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/layout/IntrinsicMeasureScope;",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/ui/layout/IntrinsicMeasurable;",
            ">;I)I"
        }
    .end annotation

    .line 782
    sget-object v0, Landroidx/compose/material3/TextFieldMeasurePolicy$minIntrinsicWidth$1;->INSTANCE:Landroidx/compose/material3/TextFieldMeasurePolicy$minIntrinsicWidth$1;

    check-cast v0, Lkotlin/jvm/functions/Function2;

    invoke-direct {p0, p2, p3, v0}, Landroidx/compose/material3/TextFieldMeasurePolicy;->intrinsicWidth(Ljava/util/List;ILkotlin/jvm/functions/Function2;)I

    move-result v0

    return v0
.end method
