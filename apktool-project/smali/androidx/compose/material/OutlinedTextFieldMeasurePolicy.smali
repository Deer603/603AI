.class final Landroidx/compose/material/OutlinedTextFieldMeasurePolicy;
.super Ljava/lang/Object;
.source "OutlinedTextField.kt"

# interfaces
.implements Landroidx/compose/ui/layout/MeasurePolicy;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nOutlinedTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OutlinedTextField.kt\nandroidx/compose/material/OutlinedTextFieldMeasurePolicy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1213:1\n116#2,2:1214\n33#2,6:1216\n118#2:1222\n116#2,2:1223\n33#2,6:1225\n118#2:1231\n116#2,2:1232\n33#2,6:1234\n118#2:1240\n544#2,2:1242\n33#2,6:1244\n546#2:1250\n116#2,2:1251\n33#2,6:1253\n118#2:1259\n544#2,2:1260\n33#2,6:1262\n546#2:1268\n544#2,2:1269\n33#2,6:1271\n546#2:1277\n116#2,2:1278\n33#2,6:1280\n118#2:1286\n116#2,2:1287\n33#2,6:1289\n118#2:1295\n116#2,2:1296\n33#2,6:1298\n118#2:1304\n116#2,2:1305\n33#2,6:1307\n118#2:1313\n116#2,2:1314\n33#2,6:1316\n118#2:1322\n116#2,2:1323\n33#2,6:1325\n118#2:1331\n116#2,2:1332\n33#2,6:1334\n118#2:1340\n544#2,2:1341\n33#2,6:1343\n546#2:1349\n116#2,2:1350\n33#2,6:1352\n118#2:1358\n1#3:1241\n*S KotlinDebug\n*F\n+ 1 OutlinedTextField.kt\nandroidx/compose/material/OutlinedTextFieldMeasurePolicy\n*L\n779#1:1214,2\n779#1:1216,6\n779#1:1222\n785#1:1223,2\n785#1:1225,6\n785#1:1231\n804#1:1232,2\n804#1:1234,6\n804#1:1240\n822#1:1242,2\n822#1:1244,6\n822#1:1250\n828#1:1251,2\n828#1:1253,6\n828#1:1259\n858#1:1260,2\n858#1:1262,6\n858#1:1268\n928#1:1269,2\n928#1:1271,6\n928#1:1277\n931#1:1278,2\n931#1:1280,6\n931#1:1286\n935#1:1287,2\n935#1:1289,6\n935#1:1295\n939#1:1296,2\n939#1:1298,6\n939#1:1304\n943#1:1305,2\n943#1:1307,6\n943#1:1313\n966#1:1314,2\n966#1:1316,6\n966#1:1322\n976#1:1323,2\n976#1:1325,6\n976#1:1331\n987#1:1332,2\n987#1:1334,6\n987#1:1340\n991#1:1341,2\n991#1:1343,6\n991#1:1349\n994#1:1350,2\n994#1:1352,6\n994#1:1358\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0002\u0018\u00002\u00020\u0001B1\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\u000cJ<\u0010\r\u001a\u00020\u000e*\u00020\u000f2\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u000e2\u0018\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\u0015H\u0002J<\u0010\u0016\u001a\u00020\u000e*\u00020\u000f2\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0017\u001a\u00020\u000e2\u0018\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\u0015H\u0002J\"\u0010\u0018\u001a\u00020\u000e*\u00020\u000f2\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u000eH\u0016J\"\u0010\u0019\u001a\u00020\u000e*\u00020\u000f2\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0017\u001a\u00020\u000eH\u0016J,\u0010\u001a\u001a\u00020\u001b*\u00020\u001c2\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u001d0\u00112\u0006\u0010\u001e\u001a\u00020\u001fH\u0016\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008 \u0010!J\"\u0010\"\u001a\u00020\u000e*\u00020\u000f2\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u000eH\u0016J\"\u0010#\u001a\u00020\u000e*\u00020\u000f2\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0017\u001a\u00020\u000eH\u0016R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006$"
    }
    d2 = {
        "Landroidx/compose/material/OutlinedTextFieldMeasurePolicy;",
        "Landroidx/compose/ui/layout/MeasurePolicy;",
        "onLabelMeasured",
        "Lkotlin/Function1;",
        "Landroidx/compose/ui/geometry/Size;",
        "",
        "singleLine",
        "",
        "animationProgress",
        "",
        "paddingValues",
        "Landroidx/compose/foundation/layout/PaddingValues;",
        "(Lkotlin/jvm/functions/Function1;ZFLandroidx/compose/foundation/layout/PaddingValues;)V",
        "intrinsicHeight",
        "",
        "Landroidx/compose/ui/layout/IntrinsicMeasureScope;",
        "measurables",
        "",
        "Landroidx/compose/ui/layout/IntrinsicMeasurable;",
        "width",
        "intrinsicMeasurer",
        "Lkotlin/Function2;",
        "intrinsicWidth",
        "height",
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
        "material_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final animationProgress:F

.field private final onLabelMeasured:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Landroidx/compose/ui/geometry/Size;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final paddingValues:Landroidx/compose/foundation/layout/PaddingValues;

.field private final singleLine:Z


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;ZFLandroidx/compose/foundation/layout/PaddingValues;)V
    .locals 0
    .param p1, "onLabelMeasured"    # Lkotlin/jvm/functions/Function1;
    .param p2, "singleLine"    # Z
    .param p3, "animationProgress"    # F
    .param p4, "paddingValues"    # Landroidx/compose/foundation/layout/PaddingValues;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/ui/geometry/Size;",
            "Lkotlin/Unit;",
            ">;ZF",
            "Landroidx/compose/foundation/layout/PaddingValues;",
            ")V"
        }
    .end annotation

    .line 762
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 763
    iput-object p1, p0, Landroidx/compose/material/OutlinedTextFieldMeasurePolicy;->onLabelMeasured:Lkotlin/jvm/functions/Function1;

    .line 764
    iput-boolean p2, p0, Landroidx/compose/material/OutlinedTextFieldMeasurePolicy;->singleLine:Z

    .line 765
    iput p3, p0, Landroidx/compose/material/OutlinedTextFieldMeasurePolicy;->animationProgress:F

    .line 766
    iput-object p4, p0, Landroidx/compose/material/OutlinedTextFieldMeasurePolicy;->paddingValues:Landroidx/compose/foundation/layout/PaddingValues;

    .line 762
    return-void
.end method

.method public static final synthetic access$getAnimationProgress$p(Landroidx/compose/material/OutlinedTextFieldMeasurePolicy;)F
    .locals 1
    .param p0, "$this"    # Landroidx/compose/material/OutlinedTextFieldMeasurePolicy;

    .line 762
    iget v0, p0, Landroidx/compose/material/OutlinedTextFieldMeasurePolicy;->animationProgress:F

    return v0
.end method

.method public static final synthetic access$getPaddingValues$p(Landroidx/compose/material/OutlinedTextFieldMeasurePolicy;)Landroidx/compose/foundation/layout/PaddingValues;
    .locals 1
    .param p0, "$this"    # Landroidx/compose/material/OutlinedTextFieldMeasurePolicy;

    .line 762
    iget-object v0, p0, Landroidx/compose/material/OutlinedTextFieldMeasurePolicy;->paddingValues:Landroidx/compose/foundation/layout/PaddingValues;

    return-object v0
.end method

.method public static final synthetic access$getSingleLine$p(Landroidx/compose/material/OutlinedTextFieldMeasurePolicy;)Z
    .locals 1
    .param p0, "$this"    # Landroidx/compose/material/OutlinedTextFieldMeasurePolicy;

    .line 762
    iget-boolean v0, p0, Landroidx/compose/material/OutlinedTextFieldMeasurePolicy;->singleLine:Z

    return v0
.end method

.method private final intrinsicHeight(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;ILkotlin/jvm/functions/Function2;)I
    .locals 22
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

    .line 963
    move-object/from16 v0, p0

    move-object/from16 v1, p4

    const/4 v2, 0x0

    .local v2, "remainingWidth":I
    move/from16 v2, p3

    .line 965
    nop

    .line 966
    move-object/from16 v3, p2

    .local v3, "$this$fastFirstOrNull$iv":Ljava/util/List;
    const/4 v4, 0x0

    .line 1314
    .local v4, "$i$f$fastFirstOrNull":I
    nop

    .line 1315
    move-object v5, v3

    .local v5, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v6, 0x0

    .line 1316
    .local v6, "$i$f$fastForEach":I
    nop

    .line 1317
    const/4 v7, 0x0

    .local v7, "index$iv$iv":I
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v8

    :goto_0
    if-ge v7, v8, :cond_1

    .line 1318
    invoke-interface {v5, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    .line 1319
    .local v10, "item$iv$iv":Ljava/lang/Object;
    move-object v11, v10

    .local v11, "it$iv":Ljava/lang/Object;
    const/4 v12, 0x0

    .line 1315
    .local v12, "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    move-object v13, v11

    check-cast v13, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .local v13, "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/4 v14, 0x0

    .line 966
    .local v14, "$i$a$-fastFirstOrNull-OutlinedTextFieldMeasurePolicy$intrinsicHeight$leadingHeight$1":I
    invoke-static {v13}, Landroidx/compose/material/TextFieldImplKt;->getLayoutId(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Ljava/lang/Object;

    move-result-object v15

    const-string v9, "Leading"

    invoke-static {v15, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    .line 1315
    .end local v13    # "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .end local v14    # "$i$a$-fastFirstOrNull-OutlinedTextFieldMeasurePolicy$intrinsicHeight$leadingHeight$1":I
    if-eqz v9, :cond_0

    goto :goto_1

    .line 1319
    .end local v11    # "it$iv":Ljava/lang/Object;
    .end local v12    # "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    :cond_0
    nop

    .line 1317
    .end local v10    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 1321
    .end local v7    # "index$iv$iv":I
    :cond_1
    nop

    .line 1322
    .end local v5    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v6    # "$i$f$fastForEach":I
    const/4 v11, 0x0

    .line 966
    .end local v3    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .end local v4    # "$i$f$fastFirstOrNull":I
    :goto_1
    check-cast v11, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .line 967
    const v3, 0x7fffffff

    if-eqz v11, :cond_2

    .line 966
    nop

    .line 967
    nop

    .local v11, "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/4 v5, 0x0

    .line 968
    .local v5, "$i$a$-let-OutlinedTextFieldMeasurePolicy$intrinsicHeight$leadingHeight$2":I
    nop

    .line 969
    nop

    .line 970
    invoke-interface {v11, v3}, Landroidx/compose/ui/layout/IntrinsicMeasurable;->maxIntrinsicWidth(I)I

    move-result v6

    .line 969
    invoke-static {v2, v6}, Landroidx/compose/material/OutlinedTextFieldKt;->access$substractConstraintSafely(II)I

    move-result v6

    .line 968
    move v2, v6

    .line 972
    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v1, v11, v6}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    move-result v5

    .line 967
    .end local v5    # "$i$a$-let-OutlinedTextFieldMeasurePolicy$intrinsicHeight$leadingHeight$2":I
    .end local v11    # "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    nop

    .line 965
    goto :goto_2

    .line 973
    :cond_2
    const/4 v5, 0x0

    .line 965
    :goto_2
    nop

    .line 964
    move v6, v5

    .line 975
    .local v6, "leadingHeight":I
    nop

    .line 976
    move-object/from16 v5, p2

    .local v5, "$this$fastFirstOrNull$iv":Ljava/util/List;
    const/4 v7, 0x0

    .line 1323
    .local v7, "$i$f$fastFirstOrNull":I
    nop

    .line 1324
    move-object v8, v5

    .local v8, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v9, 0x0

    .line 1325
    .local v9, "$i$f$fastForEach":I
    nop

    .line 1326
    const/4 v10, 0x0

    .local v10, "index$iv$iv":I
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v11

    :goto_3
    if-ge v10, v11, :cond_4

    .line 1327
    invoke-interface {v8, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    .line 1328
    .local v12, "item$iv$iv":Ljava/lang/Object;
    move-object v13, v12

    .local v13, "it$iv":Ljava/lang/Object;
    const/4 v14, 0x0

    .line 1324
    .local v14, "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    move-object v15, v13

    check-cast v15, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .local v15, "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/16 v17, 0x0

    .line 976
    .local v17, "$i$a$-fastFirstOrNull-OutlinedTextFieldMeasurePolicy$intrinsicHeight$trailingHeight$1":I
    invoke-static {v15}, Landroidx/compose/material/TextFieldImplKt;->getLayoutId(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Ljava/lang/Object;

    move-result-object v4

    const-string v3, "Trailing"

    invoke-static {v4, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    .line 1324
    .end local v15    # "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .end local v17    # "$i$a$-fastFirstOrNull-OutlinedTextFieldMeasurePolicy$intrinsicHeight$trailingHeight$1":I
    if-eqz v3, :cond_3

    goto :goto_4

    .line 1328
    .end local v13    # "it$iv":Ljava/lang/Object;
    .end local v14    # "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    :cond_3
    nop

    .line 1326
    .end local v12    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v10, v10, 0x1

    const v3, 0x7fffffff

    goto :goto_3

    .line 1330
    .end local v10    # "index$iv$iv":I
    :cond_4
    nop

    .line 1331
    .end local v8    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v9    # "$i$f$fastForEach":I
    const/4 v13, 0x0

    .line 976
    .end local v5    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .end local v7    # "$i$f$fastFirstOrNull":I
    :goto_4
    check-cast v13, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .line 977
    if-eqz v13, :cond_5

    .line 976
    nop

    .line 977
    nop

    .local v13, "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/4 v3, 0x0

    .line 978
    .local v3, "$i$a$-let-OutlinedTextFieldMeasurePolicy$intrinsicHeight$trailingHeight$2":I
    nop

    .line 979
    nop

    .line 980
    const v4, 0x7fffffff

    invoke-interface {v13, v4}, Landroidx/compose/ui/layout/IntrinsicMeasurable;->maxIntrinsicWidth(I)I

    move-result v4

    .line 979
    invoke-static {v2, v4}, Landroidx/compose/material/OutlinedTextFieldKt;->access$substractConstraintSafely(II)I

    move-result v4

    .line 978
    move v2, v4

    .line 982
    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v1, v13, v4}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v3

    .line 977
    .end local v3    # "$i$a$-let-OutlinedTextFieldMeasurePolicy$intrinsicHeight$trailingHeight$2":I
    .end local v13    # "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    nop

    .line 975
    move v7, v3

    goto :goto_5

    .line 983
    :cond_5
    const/4 v7, 0x0

    .line 975
    :goto_5
    nop

    .line 974
    nop

    .line 986
    .local v7, "trailingHeight":I
    nop

    .line 987
    move-object/from16 v3, p2

    .local v3, "$this$fastFirstOrNull$iv":Ljava/util/List;
    const/4 v4, 0x0

    .line 1332
    .restart local v4    # "$i$f$fastFirstOrNull":I
    nop

    .line 1333
    move-object v5, v3

    .local v5, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v8, 0x0

    .line 1334
    .local v8, "$i$f$fastForEach":I
    nop

    .line 1335
    const/4 v9, 0x0

    .local v9, "index$iv$iv":I
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v10

    :goto_6
    if-ge v9, v10, :cond_7

    .line 1336
    invoke-interface {v5, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    .line 1337
    .local v11, "item$iv$iv":Ljava/lang/Object;
    move-object v12, v11

    .local v12, "it$iv":Ljava/lang/Object;
    const/4 v13, 0x0

    .line 1333
    .local v13, "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    move-object v14, v12

    check-cast v14, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .local v14, "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/4 v15, 0x0

    .line 987
    .local v15, "$i$a$-fastFirstOrNull-OutlinedTextFieldMeasurePolicy$intrinsicHeight$labelHeight$1":I
    move-object/from16 v17, v3

    .end local v3    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .local v17, "$this$fastFirstOrNull$iv":Ljava/util/List;
    invoke-static {v14}, Landroidx/compose/material/TextFieldImplKt;->getLayoutId(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Ljava/lang/Object;

    move-result-object v3

    move/from16 v18, v4

    .end local v4    # "$i$f$fastFirstOrNull":I
    .local v18, "$i$f$fastFirstOrNull":I
    const-string v4, "Label"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    .line 1333
    .end local v14    # "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .end local v15    # "$i$a$-fastFirstOrNull-OutlinedTextFieldMeasurePolicy$intrinsicHeight$labelHeight$1":I
    if-eqz v3, :cond_6

    goto :goto_7

    .line 1337
    .end local v12    # "it$iv":Ljava/lang/Object;
    .end local v13    # "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    :cond_6
    nop

    .line 1335
    .end local v11    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v9, v9, 0x1

    move-object/from16 v3, v17

    move/from16 v4, v18

    goto :goto_6

    .end local v17    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .end local v18    # "$i$f$fastFirstOrNull":I
    .restart local v3    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .restart local v4    # "$i$f$fastFirstOrNull":I
    :cond_7
    move-object/from16 v17, v3

    move/from16 v18, v4

    .line 1339
    .end local v3    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .end local v4    # "$i$f$fastFirstOrNull":I
    .end local v9    # "index$iv$iv":I
    .restart local v17    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .restart local v18    # "$i$f$fastFirstOrNull":I
    nop

    .line 1340
    .end local v5    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v8    # "$i$f$fastForEach":I
    const/4 v12, 0x0

    .line 987
    .end local v17    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .end local v18    # "$i$f$fastFirstOrNull":I
    :goto_7
    check-cast v12, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .line 988
    if-eqz v12, :cond_8

    .line 987
    nop

    .line 988
    nop

    .line 1241
    .local v12, "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/4 v3, 0x0

    .line 988
    .local v3, "$i$a$-let-OutlinedTextFieldMeasurePolicy$intrinsicHeight$labelHeight$2":I
    iget v4, v0, Landroidx/compose/material/OutlinedTextFieldMeasurePolicy;->animationProgress:F

    move/from16 v5, p3

    invoke-static {v2, v5, v4}, Landroidx/compose/ui/util/MathHelpersKt;->lerp(IIF)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v1, v12, v4}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v3

    .line 986
    .end local v3    # "$i$a$-let-OutlinedTextFieldMeasurePolicy$intrinsicHeight$labelHeight$2":I
    .end local v12    # "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    move v9, v3

    goto :goto_8

    .line 988
    :cond_8
    move/from16 v5, p3

    const/4 v9, 0x0

    .line 986
    :goto_8
    nop

    .line 985
    nop

    .line 991
    .local v9, "labelHeight":I
    move-object/from16 v3, p2

    .local v3, "$this$fastFirst$iv":Ljava/util/List;
    const/4 v4, 0x0

    .line 1341
    .local v4, "$i$f$fastFirst":I
    nop

    .line 1342
    move-object v8, v3

    .local v8, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v10, 0x0

    .line 1343
    .local v10, "$i$f$fastForEach":I
    nop

    .line 1344
    const/4 v11, 0x0

    .local v11, "index$iv$iv":I
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v12

    :goto_9
    if-ge v11, v12, :cond_d

    .line 1345
    invoke-interface {v8, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    .line 1346
    .local v13, "item$iv$iv":Ljava/lang/Object;
    move-object v14, v13

    .local v14, "it$iv":Ljava/lang/Object;
    const/4 v15, 0x0

    .line 1342
    .local v15, "$i$a$-fastForEach-ListUtilsKt$fastFirst$2$iv":I
    move-object/from16 v17, v14

    check-cast v17, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .local v17, "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/16 v18, 0x0

    .line 991
    .local v18, "$i$a$-fastFirst-OutlinedTextFieldMeasurePolicy$intrinsicHeight$textFieldHeight$1":I
    move/from16 v19, v2

    .end local v2    # "remainingWidth":I
    .local v19, "remainingWidth":I
    invoke-static/range {v17 .. v17}, Landroidx/compose/material/TextFieldImplKt;->getLayoutId(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v20, v3

    .end local v3    # "$this$fastFirst$iv":Ljava/util/List;
    .local v20, "$this$fastFirst$iv":Ljava/util/List;
    const-string v3, "TextField"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    .line 1342
    .end local v17    # "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .end local v18    # "$i$a$-fastFirst-OutlinedTextFieldMeasurePolicy$intrinsicHeight$textFieldHeight$1":I
    if-eqz v2, :cond_c

    .line 991
    .end local v4    # "$i$f$fastFirst":I
    .end local v8    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v10    # "$i$f$fastForEach":I
    .end local v11    # "index$iv$iv":I
    .end local v13    # "item$iv$iv":Ljava/lang/Object;
    .end local v14    # "it$iv":Ljava/lang/Object;
    .end local v15    # "$i$a$-fastForEach-ListUtilsKt$fastFirst$2$iv":I
    .end local v20    # "$this$fastFirst$iv":Ljava/util/List;
    invoke-static/range {v19 .. v19}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v14, v2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v8

    .line 990
    nop

    .line 993
    .local v8, "textFieldHeight":I
    nop

    .line 994
    move-object/from16 v2, p2

    .local v2, "$this$fastFirstOrNull$iv":Ljava/util/List;
    const/4 v3, 0x0

    .line 1350
    .local v3, "$i$f$fastFirstOrNull":I
    nop

    .line 1351
    move-object v4, v2

    .local v4, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v10, 0x0

    .line 1352
    .restart local v10    # "$i$f$fastForEach":I
    nop

    .line 1353
    const/4 v11, 0x0

    .restart local v11    # "index$iv$iv":I
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v12

    :goto_a
    if-ge v11, v12, :cond_a

    .line 1354
    invoke-interface {v4, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    .line 1355
    .restart local v13    # "item$iv$iv":Ljava/lang/Object;
    move-object v14, v13

    .restart local v14    # "it$iv":Ljava/lang/Object;
    const/4 v15, 0x0

    .line 1351
    .local v15, "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    move-object/from16 v17, v14

    check-cast v17, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .restart local v17    # "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/16 v18, 0x0

    .line 994
    .local v18, "$i$a$-fastFirstOrNull-OutlinedTextFieldMeasurePolicy$intrinsicHeight$placeholderHeight$1":I
    move-object/from16 v20, v2

    .end local v2    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .local v20, "$this$fastFirstOrNull$iv":Ljava/util/List;
    invoke-static/range {v17 .. v17}, Landroidx/compose/material/TextFieldImplKt;->getLayoutId(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Ljava/lang/Object;

    move-result-object v2

    move/from16 v21, v3

    .end local v3    # "$i$f$fastFirstOrNull":I
    .local v21, "$i$f$fastFirstOrNull":I
    const-string v3, "Hint"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    .line 1351
    .end local v17    # "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .end local v18    # "$i$a$-fastFirstOrNull-OutlinedTextFieldMeasurePolicy$intrinsicHeight$placeholderHeight$1":I
    if-eqz v2, :cond_9

    goto :goto_b

    .line 1355
    .end local v14    # "it$iv":Ljava/lang/Object;
    .end local v15    # "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    :cond_9
    nop

    .line 1353
    .end local v13    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v11, v11, 0x1

    move-object/from16 v2, v20

    move/from16 v3, v21

    goto :goto_a

    .end local v20    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .end local v21    # "$i$f$fastFirstOrNull":I
    .restart local v2    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .restart local v3    # "$i$f$fastFirstOrNull":I
    :cond_a
    move-object/from16 v20, v2

    move/from16 v21, v3

    .line 1357
    .end local v2    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .end local v3    # "$i$f$fastFirstOrNull":I
    .end local v11    # "index$iv$iv":I
    .restart local v20    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .restart local v21    # "$i$f$fastFirstOrNull":I
    nop

    .line 1358
    .end local v4    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v10    # "$i$f$fastForEach":I
    const/4 v14, 0x0

    .line 994
    .end local v20    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .end local v21    # "$i$f$fastFirstOrNull":I
    :goto_b
    check-cast v14, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .line 995
    if-eqz v14, :cond_b

    .line 994
    nop

    .line 995
    nop

    .line 1241
    .local v14, "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/4 v2, 0x0

    .line 995
    .local v2, "$i$a$-let-OutlinedTextFieldMeasurePolicy$intrinsicHeight$placeholderHeight$2":I
    invoke-static/range {v19 .. v19}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v1, v14, v3}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v4

    .line 993
    .end local v2    # "$i$a$-let-OutlinedTextFieldMeasurePolicy$intrinsicHeight$placeholderHeight$2":I
    .end local v14    # "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    move v10, v4

    goto :goto_c

    .line 995
    :cond_b
    const/4 v10, 0x0

    .line 993
    :goto_c
    nop

    .line 992
    nop

    .line 998
    .local v10, "placeholderHeight":I
    nop

    .line 999
    nop

    .line 1000
    nop

    .line 1001
    nop

    .line 1002
    nop

    .line 1003
    iget v11, v0, Landroidx/compose/material/OutlinedTextFieldMeasurePolicy;->animationProgress:F

    .line 1004
    const/16 v16, 0xf

    const/16 v17, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static/range {v12 .. v17}, Landroidx/compose/ui/unit/ConstraintsKt;->Constraints$default(IIIIILjava/lang/Object;)J

    move-result-wide v12

    .line 1005
    invoke-interface/range {p1 .. p1}, Landroidx/compose/ui/layout/IntrinsicMeasureScope;->getDensity()F

    move-result v14

    .line 1006
    iget-object v15, v0, Landroidx/compose/material/OutlinedTextFieldMeasurePolicy;->paddingValues:Landroidx/compose/foundation/layout/PaddingValues;

    .line 997
    invoke-static/range {v6 .. v15}, Landroidx/compose/material/OutlinedTextFieldKt;->access$calculateHeight-O3s9Psw(IIIIIFJFLandroidx/compose/foundation/layout/PaddingValues;)I

    move-result v2

    return v2

    .line 1346
    .local v4, "$i$f$fastFirst":I
    .local v8, "$this$fastForEach$iv$iv":Ljava/util/List;
    .local v10, "$i$f$fastForEach":I
    .restart local v11    # "index$iv$iv":I
    .restart local v13    # "item$iv$iv":Ljava/lang/Object;
    .local v20, "$this$fastFirst$iv":Ljava/util/List;
    :cond_c
    nop

    .line 1344
    .end local v13    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v11, v11, 0x1

    move/from16 v2, v19

    move-object/from16 v3, v20

    goto/16 :goto_9

    .end local v19    # "remainingWidth":I
    .end local v20    # "$this$fastFirst$iv":Ljava/util/List;
    .local v2, "remainingWidth":I
    .local v3, "$this$fastFirst$iv":Ljava/util/List;
    :cond_d
    move/from16 v19, v2

    move-object/from16 v20, v3

    .line 1348
    .end local v2    # "remainingWidth":I
    .end local v3    # "$this$fastFirst$iv":Ljava/util/List;
    .end local v11    # "index$iv$iv":I
    .restart local v19    # "remainingWidth":I
    .restart local v20    # "$this$fastFirst$iv":Ljava/util/List;
    nop

    .line 1349
    .end local v8    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v10    # "$i$f$fastForEach":I
    new-instance v2, Ljava/util/NoSuchElementException;

    const-string v3, "Collection contains no element matching the predicate."

    invoke-direct {v2, v3}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v2
.end method

.method private final intrinsicWidth(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;ILkotlin/jvm/functions/Function2;)I
    .locals 19
    .param p1, "$this$intrinsicWidth"    # Landroidx/compose/ui/layout/IntrinsicMeasureScope;
    .param p2, "measurables"    # Ljava/util/List;
    .param p3, "height"    # I
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

    .line 928
    move-object/from16 v0, p0

    move-object/from16 v1, p4

    move-object/from16 v2, p2

    .local v2, "$this$fastFirst$iv":Ljava/util/List;
    const/4 v3, 0x0

    .line 1269
    .local v3, "$i$f$fastFirst":I
    nop

    .line 1270
    move-object v4, v2

    .local v4, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v5, 0x0

    .line 1271
    .local v5, "$i$f$fastForEach":I
    nop

    .line 1272
    const/4 v6, 0x0

    .local v6, "index$iv$iv":I
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v7

    :goto_0
    if-ge v6, v7, :cond_d

    .line 1273
    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    .line 1274
    .local v8, "item$iv$iv":Ljava/lang/Object;
    move-object v9, v8

    .local v9, "it$iv":Ljava/lang/Object;
    const/4 v10, 0x0

    .line 1270
    .local v10, "$i$a$-fastForEach-ListUtilsKt$fastFirst$2$iv":I
    move-object v11, v9

    check-cast v11, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .local v11, "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/4 v12, 0x0

    .line 928
    .local v12, "$i$a$-fastFirst-OutlinedTextFieldMeasurePolicy$intrinsicWidth$textFieldWidth$1":I
    invoke-static {v11}, Landroidx/compose/material/TextFieldImplKt;->getLayoutId(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Ljava/lang/Object;

    move-result-object v13

    const-string v14, "TextField"

    invoke-static {v13, v14}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    .line 1270
    .end local v11    # "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .end local v12    # "$i$a$-fastFirst-OutlinedTextFieldMeasurePolicy$intrinsicWidth$textFieldWidth$1":I
    if-eqz v11, :cond_c

    .line 928
    .end local v2    # "$this$fastFirst$iv":Ljava/util/List;
    .end local v3    # "$i$f$fastFirst":I
    .end local v4    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v5    # "$i$f$fastForEach":I
    .end local v6    # "index$iv$iv":I
    .end local v8    # "item$iv$iv":Ljava/lang/Object;
    .end local v9    # "it$iv":Ljava/lang/Object;
    .end local v10    # "$i$a$-fastForEach-ListUtilsKt$fastFirst$2$iv":I
    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v9, v2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    .line 927
    move v5, v2

    .line 930
    .local v5, "textFieldWidth":I
    nop

    .line 931
    move-object/from16 v2, p2

    .local v2, "$this$fastFirstOrNull$iv":Ljava/util/List;
    const/4 v3, 0x0

    .line 1278
    .local v3, "$i$f$fastFirstOrNull":I
    nop

    .line 1279
    move-object v4, v2

    .restart local v4    # "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v6, 0x0

    .line 1280
    .local v6, "$i$f$fastForEach":I
    nop

    .line 1281
    const/4 v7, 0x0

    .local v7, "index$iv$iv":I
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v8

    :goto_1
    if-ge v7, v8, :cond_1

    .line 1282
    invoke-interface {v4, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    .line 1283
    .local v10, "item$iv$iv":Ljava/lang/Object;
    move-object v11, v10

    .local v11, "it$iv":Ljava/lang/Object;
    const/4 v12, 0x0

    .line 1279
    .local v12, "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    move-object v13, v11

    check-cast v13, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .local v13, "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/4 v14, 0x0

    .line 931
    .local v14, "$i$a$-fastFirstOrNull-OutlinedTextFieldMeasurePolicy$intrinsicWidth$labelWidth$1":I
    invoke-static {v13}, Landroidx/compose/material/TextFieldImplKt;->getLayoutId(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Ljava/lang/Object;

    move-result-object v15

    const-string v9, "Label"

    invoke-static {v15, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    .line 1279
    .end local v13    # "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .end local v14    # "$i$a$-fastFirstOrNull-OutlinedTextFieldMeasurePolicy$intrinsicWidth$labelWidth$1":I
    if-eqz v9, :cond_0

    goto :goto_2

    .line 1283
    .end local v11    # "it$iv":Ljava/lang/Object;
    .end local v12    # "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    :cond_0
    nop

    .line 1281
    .end local v10    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    .line 1285
    .end local v7    # "index$iv$iv":I
    :cond_1
    nop

    .line 1286
    .end local v4    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v6    # "$i$f$fastForEach":I
    const/4 v11, 0x0

    .line 931
    .end local v2    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .end local v3    # "$i$f$fastFirstOrNull":I
    :goto_2
    check-cast v11, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .line 932
    if-eqz v11, :cond_2

    .line 931
    nop

    .line 932
    nop

    .line 1241
    .local v11, "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/4 v3, 0x0

    .line 932
    .local v3, "$i$a$-let-OutlinedTextFieldMeasurePolicy$intrinsicWidth$labelWidth$2":I
    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v1, v11, v4}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v3

    .line 930
    .end local v3    # "$i$a$-let-OutlinedTextFieldMeasurePolicy$intrinsicWidth$labelWidth$2":I
    .end local v11    # "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    move v6, v3

    goto :goto_3

    .line 932
    :cond_2
    const/4 v6, 0x0

    .line 930
    :goto_3
    nop

    .line 929
    nop

    .line 934
    .local v6, "labelWidth":I
    nop

    .line 935
    move-object/from16 v3, p2

    .local v3, "$this$fastFirstOrNull$iv":Ljava/util/List;
    const/4 v4, 0x0

    .line 1287
    .local v4, "$i$f$fastFirstOrNull":I
    nop

    .line 1288
    move-object v7, v3

    .local v7, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v8, 0x0

    .line 1289
    .local v8, "$i$f$fastForEach":I
    nop

    .line 1290
    const/4 v9, 0x0

    .local v9, "index$iv$iv":I
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v10

    :goto_4
    if-ge v9, v10, :cond_4

    .line 1291
    invoke-interface {v7, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    .line 1292
    .local v11, "item$iv$iv":Ljava/lang/Object;
    move-object v12, v11

    .local v12, "it$iv":Ljava/lang/Object;
    const/4 v13, 0x0

    .line 1288
    .local v13, "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    move-object v14, v12

    check-cast v14, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .local v14, "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/4 v15, 0x0

    .line 935
    .local v15, "$i$a$-fastFirstOrNull-OutlinedTextFieldMeasurePolicy$intrinsicWidth$trailingWidth$1":I
    invoke-static {v14}, Landroidx/compose/material/TextFieldImplKt;->getLayoutId(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v16, v3

    .end local v3    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .local v16, "$this$fastFirstOrNull$iv":Ljava/util/List;
    const-string v3, "Trailing"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    .line 1288
    .end local v14    # "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .end local v15    # "$i$a$-fastFirstOrNull-OutlinedTextFieldMeasurePolicy$intrinsicWidth$trailingWidth$1":I
    if-eqz v2, :cond_3

    goto :goto_5

    .line 1292
    .end local v12    # "it$iv":Ljava/lang/Object;
    .end local v13    # "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    :cond_3
    nop

    .line 1290
    .end local v11    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v9, v9, 0x1

    move-object/from16 v3, v16

    goto :goto_4

    .end local v16    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .restart local v3    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    :cond_4
    move-object/from16 v16, v3

    .line 1294
    .end local v3    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .end local v9    # "index$iv$iv":I
    .restart local v16    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    nop

    .line 1295
    .end local v7    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v8    # "$i$f$fastForEach":I
    const/4 v12, 0x0

    .line 935
    .end local v4    # "$i$f$fastFirstOrNull":I
    .end local v16    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    :goto_5
    check-cast v12, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .line 936
    if-eqz v12, :cond_5

    .line 935
    nop

    .line 936
    nop

    .line 1241
    .local v12, "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/4 v2, 0x0

    .line 936
    .local v2, "$i$a$-let-OutlinedTextFieldMeasurePolicy$intrinsicWidth$trailingWidth$2":I
    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v1, v12, v3}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v2

    .line 934
    .end local v2    # "$i$a$-let-OutlinedTextFieldMeasurePolicy$intrinsicWidth$trailingWidth$2":I
    .end local v12    # "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    move v4, v2

    goto :goto_6

    .line 936
    :cond_5
    const/4 v4, 0x0

    .line 934
    :goto_6
    nop

    .line 933
    nop

    .line 938
    .local v4, "trailingWidth":I
    nop

    .line 939
    move-object/from16 v2, p2

    .local v2, "$this$fastFirstOrNull$iv":Ljava/util/List;
    const/4 v3, 0x0

    .line 1296
    .local v3, "$i$f$fastFirstOrNull":I
    nop

    .line 1297
    move-object v7, v2

    .restart local v7    # "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v8, 0x0

    .line 1298
    .restart local v8    # "$i$f$fastForEach":I
    nop

    .line 1299
    const/4 v9, 0x0

    .restart local v9    # "index$iv$iv":I
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v10

    :goto_7
    if-ge v9, v10, :cond_7

    .line 1300
    invoke-interface {v7, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    .line 1301
    .restart local v11    # "item$iv$iv":Ljava/lang/Object;
    move-object v12, v11

    .local v12, "it$iv":Ljava/lang/Object;
    const/4 v13, 0x0

    .line 1297
    .restart local v13    # "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    move-object v14, v12

    check-cast v14, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .restart local v14    # "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/4 v15, 0x0

    .line 939
    .local v15, "$i$a$-fastFirstOrNull-OutlinedTextFieldMeasurePolicy$intrinsicWidth$leadingWidth$1":I
    move-object/from16 v16, v2

    .end local v2    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .restart local v16    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    invoke-static {v14}, Landroidx/compose/material/TextFieldImplKt;->getLayoutId(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Ljava/lang/Object;

    move-result-object v2

    move/from16 v17, v3

    .end local v3    # "$i$f$fastFirstOrNull":I
    .local v17, "$i$f$fastFirstOrNull":I
    const-string v3, "Leading"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    .line 1297
    .end local v14    # "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .end local v15    # "$i$a$-fastFirstOrNull-OutlinedTextFieldMeasurePolicy$intrinsicWidth$leadingWidth$1":I
    if-eqz v2, :cond_6

    goto :goto_8

    .line 1301
    .end local v12    # "it$iv":Ljava/lang/Object;
    .end local v13    # "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    :cond_6
    nop

    .line 1299
    .end local v11    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v9, v9, 0x1

    move-object/from16 v2, v16

    move/from16 v3, v17

    goto :goto_7

    .end local v16    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .end local v17    # "$i$f$fastFirstOrNull":I
    .restart local v2    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .restart local v3    # "$i$f$fastFirstOrNull":I
    :cond_7
    move-object/from16 v16, v2

    move/from16 v17, v3

    .line 1303
    .end local v2    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .end local v3    # "$i$f$fastFirstOrNull":I
    .end local v9    # "index$iv$iv":I
    .restart local v16    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .restart local v17    # "$i$f$fastFirstOrNull":I
    nop

    .line 1304
    .end local v7    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v8    # "$i$f$fastForEach":I
    const/4 v12, 0x0

    .line 939
    .end local v16    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .end local v17    # "$i$f$fastFirstOrNull":I
    :goto_8
    check-cast v12, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .line 940
    if-eqz v12, :cond_8

    .line 939
    nop

    .line 940
    nop

    .line 1241
    .local v12, "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/4 v2, 0x0

    .line 940
    .local v2, "$i$a$-let-OutlinedTextFieldMeasurePolicy$intrinsicWidth$leadingWidth$2":I
    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v1, v12, v3}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v2

    .line 938
    .end local v2    # "$i$a$-let-OutlinedTextFieldMeasurePolicy$intrinsicWidth$leadingWidth$2":I
    .end local v12    # "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    move v3, v2

    goto :goto_9

    .line 940
    :cond_8
    const/4 v3, 0x0

    .line 938
    :goto_9
    nop

    .line 937
    nop

    .line 942
    .local v3, "leadingWidth":I
    nop

    .line 943
    move-object/from16 v2, p2

    .local v2, "$this$fastFirstOrNull$iv":Ljava/util/List;
    const/4 v7, 0x0

    .line 1305
    .local v7, "$i$f$fastFirstOrNull":I
    nop

    .line 1306
    move-object v8, v2

    .local v8, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v9, 0x0

    .line 1307
    .local v9, "$i$f$fastForEach":I
    nop

    .line 1308
    const/4 v10, 0x0

    .local v10, "index$iv$iv":I
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v11

    :goto_a
    if-ge v10, v11, :cond_a

    .line 1309
    invoke-interface {v8, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    .line 1310
    .local v12, "item$iv$iv":Ljava/lang/Object;
    move-object v13, v12

    .local v13, "it$iv":Ljava/lang/Object;
    const/4 v14, 0x0

    .line 1306
    .local v14, "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    move-object v15, v13

    check-cast v15, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .local v15, "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/16 v16, 0x0

    .line 943
    .local v16, "$i$a$-fastFirstOrNull-OutlinedTextFieldMeasurePolicy$intrinsicWidth$placeholderWidth$1":I
    move-object/from16 v17, v2

    .end local v2    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .local v17, "$this$fastFirstOrNull$iv":Ljava/util/List;
    invoke-static {v15}, Landroidx/compose/material/TextFieldImplKt;->getLayoutId(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Ljava/lang/Object;

    move-result-object v2

    move/from16 v18, v3

    .end local v3    # "leadingWidth":I
    .local v18, "leadingWidth":I
    const-string v3, "Hint"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    .line 1306
    .end local v15    # "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .end local v16    # "$i$a$-fastFirstOrNull-OutlinedTextFieldMeasurePolicy$intrinsicWidth$placeholderWidth$1":I
    if-eqz v2, :cond_9

    move-object v9, v13

    goto :goto_b

    .line 1310
    .end local v13    # "it$iv":Ljava/lang/Object;
    .end local v14    # "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    :cond_9
    nop

    .line 1308
    .end local v12    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v10, v10, 0x1

    move-object/from16 v2, v17

    move/from16 v3, v18

    goto :goto_a

    .end local v17    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .end local v18    # "leadingWidth":I
    .restart local v2    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .restart local v3    # "leadingWidth":I
    :cond_a
    move-object/from16 v17, v2

    move/from16 v18, v3

    .line 1312
    .end local v2    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .end local v3    # "leadingWidth":I
    .end local v10    # "index$iv$iv":I
    .restart local v17    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .restart local v18    # "leadingWidth":I
    nop

    .line 1313
    .end local v8    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v9    # "$i$f$fastForEach":I
    const/4 v9, 0x0

    .line 943
    .end local v7    # "$i$f$fastFirstOrNull":I
    .end local v17    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    :goto_b
    check-cast v9, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .line 944
    if-eqz v9, :cond_b

    .line 943
    nop

    .line 944
    nop

    .line 1241
    .local v9, "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/4 v2, 0x0

    .line 944
    .local v2, "$i$a$-let-OutlinedTextFieldMeasurePolicy$intrinsicWidth$placeholderWidth$2":I
    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v1, v9, v3}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v2

    .line 942
    .end local v2    # "$i$a$-let-OutlinedTextFieldMeasurePolicy$intrinsicWidth$placeholderWidth$2":I
    .end local v9    # "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    move v7, v2

    goto :goto_c

    .line 944
    :cond_b
    const/4 v7, 0x0

    .line 942
    :goto_c
    nop

    .line 941
    nop

    .line 946
    .local v7, "placeholderWidth":I
    nop

    .line 947
    nop

    .line 948
    nop

    .line 949
    nop

    .line 950
    nop

    .line 951
    iget v8, v0, Landroidx/compose/material/OutlinedTextFieldMeasurePolicy;->animationProgress:F

    .line 952
    const/16 v13, 0xf

    const/4 v14, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static/range {v9 .. v14}, Landroidx/compose/ui/unit/ConstraintsKt;->Constraints$default(IIIIILjava/lang/Object;)J

    move-result-wide v9

    .line 953
    invoke-interface/range {p1 .. p1}, Landroidx/compose/ui/layout/IntrinsicMeasureScope;->getDensity()F

    move-result v11

    .line 954
    iget-object v12, v0, Landroidx/compose/material/OutlinedTextFieldMeasurePolicy;->paddingValues:Landroidx/compose/foundation/layout/PaddingValues;

    .line 945
    move/from16 v3, v18

    .end local v18    # "leadingWidth":I
    .restart local v3    # "leadingWidth":I
    invoke-static/range {v3 .. v12}, Landroidx/compose/material/OutlinedTextFieldKt;->access$calculateWidth-O3s9Psw(IIIIIFJFLandroidx/compose/foundation/layout/PaddingValues;)I

    move-result v2

    return v2

    .line 1274
    .end local v7    # "placeholderWidth":I
    .local v2, "$this$fastFirst$iv":Ljava/util/List;
    .local v3, "$i$f$fastFirst":I
    .local v4, "$this$fastForEach$iv$iv":Ljava/util/List;
    .local v5, "$i$f$fastForEach":I
    .local v6, "index$iv$iv":I
    .local v8, "item$iv$iv":Ljava/lang/Object;
    :cond_c
    nop

    .line 1272
    .end local v8    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_0

    .line 1276
    .end local v6    # "index$iv$iv":I
    :cond_d
    nop

    .line 1277
    .end local v4    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v5    # "$i$f$fastForEach":I
    new-instance v4, Ljava/util/NoSuchElementException;

    const-string v5, "Collection contains no element matching the predicate."

    invoke-direct {v4, v5}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v4
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

    .line 890
    sget-object v0, Landroidx/compose/material/OutlinedTextFieldMeasurePolicy$maxIntrinsicHeight$1;->INSTANCE:Landroidx/compose/material/OutlinedTextFieldMeasurePolicy$maxIntrinsicHeight$1;

    check-cast v0, Lkotlin/jvm/functions/Function2;

    invoke-direct {p0, p1, p2, p3, v0}, Landroidx/compose/material/OutlinedTextFieldMeasurePolicy;->intrinsicHeight(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;ILkotlin/jvm/functions/Function2;)I

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

    .line 908
    sget-object v0, Landroidx/compose/material/OutlinedTextFieldMeasurePolicy$maxIntrinsicWidth$1;->INSTANCE:Landroidx/compose/material/OutlinedTextFieldMeasurePolicy$maxIntrinsicWidth$1;

    check-cast v0, Lkotlin/jvm/functions/Function2;

    invoke-direct {p0, p1, p2, p3, v0}, Landroidx/compose/material/OutlinedTextFieldMeasurePolicy;->intrinsicWidth(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;ILkotlin/jvm/functions/Function2;)I

    move-result v0

    return v0
.end method

.method public measure-3p2s80s(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;
    .locals 40
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

    .line 773
    move-object/from16 v9, p0

    move-object/from16 v0, p1

    const/4 v1, 0x0

    .line 774
    .local v1, "occupiedSpaceHorizontally":I
    iget-object v2, v9, Landroidx/compose/material/OutlinedTextFieldMeasurePolicy;->paddingValues:Landroidx/compose/foundation/layout/PaddingValues;

    invoke-interface {v2}, Landroidx/compose/foundation/layout/PaddingValues;->calculateBottomPadding-D9Ej5fM()F

    move-result v2

    invoke-interface {v0, v2}, Landroidx/compose/ui/layout/MeasureScope;->roundToPx-0680j_4(F)I

    move-result v11

    .line 777
    .local v11, "bottomPadding":I
    const/16 v18, 0xa

    const/16 v19, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-wide/from16 v12, p3

    invoke-static/range {v12 .. v19}, Landroidx/compose/ui/unit/Constraints;->copy-Zbe2FdA$default(JIIIIILjava/lang/Object;)J

    move-result-wide v2

    .line 779
    .local v2, "relaxedConstraints":J
    move-object/from16 v4, p2

    .local v4, "$this$fastFirstOrNull$iv":Ljava/util/List;
    const/4 v5, 0x0

    .line 1214
    .local v5, "$i$f$fastFirstOrNull":I
    nop

    .line 1215
    move-object v6, v4

    .local v6, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v7, 0x0

    .line 1216
    .local v7, "$i$f$fastForEach":I
    nop

    .line 1217
    const/4 v8, 0x0

    .local v8, "index$iv$iv":I
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v10

    :goto_0
    if-ge v8, v10, :cond_1

    .line 1218
    invoke-interface {v6, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    .line 1219
    .local v13, "item$iv$iv":Ljava/lang/Object;
    move-object v14, v13

    .local v14, "it$iv":Ljava/lang/Object;
    const/4 v15, 0x0

    .line 1215
    .local v15, "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    move-object/from16 v16, v14

    check-cast v16, Landroidx/compose/ui/layout/Measurable;

    .local v16, "it":Landroidx/compose/ui/layout/Measurable;
    const/16 v17, 0x0

    .line 779
    .local v17, "$i$a$-fastFirstOrNull-OutlinedTextFieldMeasurePolicy$measure$leadingPlaceable$1":I
    invoke-static/range {v16 .. v16}, Landroidx/compose/ui/layout/LayoutIdKt;->getLayoutId(Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;

    move-result-object v12

    move/from16 v19, v1

    .end local v1    # "occupiedSpaceHorizontally":I
    .local v19, "occupiedSpaceHorizontally":I
    const-string v1, "Leading"

    invoke-static {v12, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    .line 1215
    .end local v16    # "it":Landroidx/compose/ui/layout/Measurable;
    .end local v17    # "$i$a$-fastFirstOrNull-OutlinedTextFieldMeasurePolicy$measure$leadingPlaceable$1":I
    if-eqz v1, :cond_0

    goto :goto_1

    .line 1219
    .end local v14    # "it$iv":Ljava/lang/Object;
    .end local v15    # "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    :cond_0
    nop

    .line 1217
    .end local v13    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v8, v8, 0x1

    move/from16 v1, v19

    goto :goto_0

    .end local v19    # "occupiedSpaceHorizontally":I
    .restart local v1    # "occupiedSpaceHorizontally":I
    :cond_1
    move/from16 v19, v1

    .line 1221
    .end local v1    # "occupiedSpaceHorizontally":I
    .end local v8    # "index$iv$iv":I
    .restart local v19    # "occupiedSpaceHorizontally":I
    nop

    .line 1222
    .end local v6    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v7    # "$i$f$fastForEach":I
    const/4 v14, 0x0

    .line 779
    .end local v4    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .end local v5    # "$i$f$fastFirstOrNull":I
    :goto_1
    check-cast v14, Landroidx/compose/ui/layout/Measurable;

    if-eqz v14, :cond_2

    invoke-interface {v14, v2, v3}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    move-result-object v1

    goto :goto_2

    :cond_2
    const/4 v1, 0x0

    .line 778
    :goto_2
    nop

    .line 780
    .local v1, "leadingPlaceable":Landroidx/compose/ui/layout/Placeable;
    invoke-static {v1}, Landroidx/compose/material/TextFieldImplKt;->widthOrZero(Landroidx/compose/ui/layout/Placeable;)I

    move-result v4

    add-int v8, v19, v4

    .line 786
    .end local v19    # "occupiedSpaceHorizontally":I
    .local v8, "occupiedSpaceHorizontally":I
    nop

    .line 784
    nop

    .line 785
    move-object/from16 v4, p2

    .restart local v4    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    const/4 v5, 0x0

    .line 1223
    .restart local v5    # "$i$f$fastFirstOrNull":I
    nop

    .line 1224
    move-object v6, v4

    .restart local v6    # "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v7, 0x0

    .line 1225
    .restart local v7    # "$i$f$fastForEach":I
    nop

    .line 1226
    const/4 v10, 0x0

    .local v10, "index$iv$iv":I
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v12

    :goto_3
    if-ge v10, v12, :cond_4

    .line 1227
    invoke-interface {v6, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    .line 1228
    .restart local v13    # "item$iv$iv":Ljava/lang/Object;
    move-object v14, v13

    .restart local v14    # "it$iv":Ljava/lang/Object;
    const/4 v15, 0x0

    .line 1224
    .restart local v15    # "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    move-object/from16 v16, v14

    check-cast v16, Landroidx/compose/ui/layout/Measurable;

    .restart local v16    # "it":Landroidx/compose/ui/layout/Measurable;
    const/16 v17, 0x0

    .line 785
    .local v17, "$i$a$-fastFirstOrNull-OutlinedTextFieldMeasurePolicy$measure$trailingPlaceable$1":I
    move-object/from16 v22, v1

    .end local v1    # "leadingPlaceable":Landroidx/compose/ui/layout/Placeable;
    .local v22, "leadingPlaceable":Landroidx/compose/ui/layout/Placeable;
    invoke-static/range {v16 .. v16}, Landroidx/compose/ui/layout/LayoutIdKt;->getLayoutId(Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;

    move-result-object v1

    move-wide/from16 v19, v2

    .end local v2    # "relaxedConstraints":J
    .local v19, "relaxedConstraints":J
    const-string v2, "Trailing"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    .line 1224
    .end local v16    # "it":Landroidx/compose/ui/layout/Measurable;
    .end local v17    # "$i$a$-fastFirstOrNull-OutlinedTextFieldMeasurePolicy$measure$trailingPlaceable$1":I
    if-eqz v1, :cond_3

    goto :goto_4

    .line 1228
    .end local v14    # "it$iv":Ljava/lang/Object;
    .end local v15    # "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    :cond_3
    nop

    .line 1226
    .end local v13    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v10, v10, 0x1

    move-wide/from16 v2, v19

    move-object/from16 v1, v22

    goto :goto_3

    .end local v19    # "relaxedConstraints":J
    .end local v22    # "leadingPlaceable":Landroidx/compose/ui/layout/Placeable;
    .restart local v1    # "leadingPlaceable":Landroidx/compose/ui/layout/Placeable;
    .restart local v2    # "relaxedConstraints":J
    :cond_4
    move-object/from16 v22, v1

    move-wide/from16 v19, v2

    .line 1230
    .end local v1    # "leadingPlaceable":Landroidx/compose/ui/layout/Placeable;
    .end local v2    # "relaxedConstraints":J
    .end local v10    # "index$iv$iv":I
    .restart local v19    # "relaxedConstraints":J
    .restart local v22    # "leadingPlaceable":Landroidx/compose/ui/layout/Placeable;
    nop

    .line 1231
    .end local v6    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v7    # "$i$f$fastForEach":I
    const/4 v14, 0x0

    .line 785
    .end local v4    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .end local v5    # "$i$f$fastFirstOrNull":I
    :goto_4
    check-cast v14, Landroidx/compose/ui/layout/Measurable;

    .line 786
    if-eqz v14, :cond_5

    .line 785
    nop

    .line 786
    neg-int v4, v8

    const/4 v6, 0x2

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-wide/from16 v2, v19

    .end local v19    # "relaxedConstraints":J
    .restart local v2    # "relaxedConstraints":J
    invoke-static/range {v2 .. v7}, Landroidx/compose/ui/unit/ConstraintsKt;->offset-NN6Ew-U$default(JIIILjava/lang/Object;)J

    move-result-wide v4

    move-wide v1, v2

    .end local v2    # "relaxedConstraints":J
    .local v1, "relaxedConstraints":J
    invoke-interface {v14, v4, v5}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    move-result-object v3

    move-object v4, v3

    goto :goto_5

    .end local v1    # "relaxedConstraints":J
    .restart local v19    # "relaxedConstraints":J
    :cond_5
    move-wide/from16 v1, v19

    .end local v19    # "relaxedConstraints":J
    .restart local v1    # "relaxedConstraints":J
    const/4 v4, 0x0

    .line 783
    :goto_5
    nop

    .line 787
    .local v4, "trailingPlaceable":Landroidx/compose/ui/layout/Placeable;
    invoke-static {v4}, Landroidx/compose/material/TextFieldImplKt;->widthOrZero(Landroidx/compose/ui/layout/Placeable;)I

    move-result v3

    add-int/2addr v3, v8

    .line 791
    .end local v8    # "occupiedSpaceHorizontally":I
    .local v3, "occupiedSpaceHorizontally":I
    iget-object v5, v9, Landroidx/compose/material/OutlinedTextFieldMeasurePolicy;->paddingValues:Landroidx/compose/foundation/layout/PaddingValues;

    invoke-interface {v0}, Landroidx/compose/ui/layout/MeasureScope;->getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;

    move-result-object v6

    invoke-interface {v5, v6}, Landroidx/compose/foundation/layout/PaddingValues;->calculateLeftPadding-u2uoSUM(Landroidx/compose/ui/unit/LayoutDirection;)F

    move-result v5

    invoke-interface {v0, v5}, Landroidx/compose/ui/layout/MeasureScope;->roundToPx-0680j_4(F)I

    move-result v5

    .line 792
    iget-object v6, v9, Landroidx/compose/material/OutlinedTextFieldMeasurePolicy;->paddingValues:Landroidx/compose/foundation/layout/PaddingValues;

    invoke-interface {v0}, Landroidx/compose/ui/layout/MeasureScope;->getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;

    move-result-object v7

    invoke-interface {v6, v7}, Landroidx/compose/foundation/layout/PaddingValues;->calculateRightPadding-u2uoSUM(Landroidx/compose/ui/unit/LayoutDirection;)F

    move-result v6

    invoke-interface {v0, v6}, Landroidx/compose/ui/layout/MeasureScope;->roundToPx-0680j_4(F)I

    move-result v6

    .line 791
    add-int/2addr v5, v6

    .line 790
    nop

    .line 794
    .local v5, "labelHorizontalPaddingOffset":I
    nop

    .line 797
    neg-int v6, v3

    sub-int/2addr v6, v5

    .line 798
    neg-int v7, v5

    .line 799
    iget v8, v9, Landroidx/compose/material/OutlinedTextFieldMeasurePolicy;->animationProgress:F

    .line 796
    invoke-static {v6, v7, v8}, Landroidx/compose/ui/util/MathHelpersKt;->lerp(IIF)I

    move-result v6

    .line 801
    neg-int v7, v11

    .line 794
    invoke-static {v1, v2, v6, v7}, Landroidx/compose/ui/unit/ConstraintsKt;->offset-NN6Ew-U(JII)J

    move-result-wide v6

    .line 793
    nop

    .line 804
    .local v6, "labelConstraints":J
    move-object/from16 v8, p2

    .local v8, "$this$fastFirstOrNull$iv":Ljava/util/List;
    const/4 v10, 0x0

    .line 1232
    .local v10, "$i$f$fastFirstOrNull":I
    nop

    .line 1233
    move-object v12, v8

    .local v12, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v13, 0x0

    .line 1234
    .local v13, "$i$f$fastForEach":I
    nop

    .line 1235
    const/4 v14, 0x0

    .local v14, "index$iv$iv":I
    invoke-interface {v12}, Ljava/util/List;->size()I

    move-result v15

    :goto_6
    if-ge v14, v15, :cond_7

    .line 1236
    invoke-interface {v12, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v16

    .line 1237
    .local v16, "item$iv$iv":Ljava/lang/Object;
    move-object/from16 v17, v16

    .local v17, "it$iv":Ljava/lang/Object;
    const/16 v19, 0x0

    .line 1233
    .local v19, "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    move-object/from16 v20, v17

    check-cast v20, Landroidx/compose/ui/layout/Measurable;

    .local v20, "it":Landroidx/compose/ui/layout/Measurable;
    const/16 v21, 0x0

    .line 804
    .local v21, "$i$a$-fastFirstOrNull-OutlinedTextFieldMeasurePolicy$measure$labelPlaceable$1":I
    move-wide/from16 v23, v1

    .end local v1    # "relaxedConstraints":J
    .local v23, "relaxedConstraints":J
    invoke-static/range {v20 .. v20}, Landroidx/compose/ui/layout/LayoutIdKt;->getLayoutId(Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;

    move-result-object v1

    const-string v2, "Label"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    .line 1233
    .end local v20    # "it":Landroidx/compose/ui/layout/Measurable;
    .end local v21    # "$i$a$-fastFirstOrNull-OutlinedTextFieldMeasurePolicy$measure$labelPlaceable$1":I
    if-eqz v1, :cond_6

    goto :goto_7

    .line 1237
    .end local v17    # "it$iv":Ljava/lang/Object;
    .end local v19    # "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    :cond_6
    nop

    .line 1235
    .end local v16    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v14, v14, 0x1

    move-wide/from16 v1, v23

    goto :goto_6

    .end local v23    # "relaxedConstraints":J
    .restart local v1    # "relaxedConstraints":J
    :cond_7
    move-wide/from16 v23, v1

    .line 1239
    .end local v1    # "relaxedConstraints":J
    .end local v14    # "index$iv$iv":I
    .restart local v23    # "relaxedConstraints":J
    nop

    .line 1240
    .end local v12    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v13    # "$i$f$fastForEach":I
    const/16 v17, 0x0

    .line 804
    .end local v8    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .end local v10    # "$i$f$fastFirstOrNull":I
    :goto_7
    move-object/from16 v1, v17

    check-cast v1, Landroidx/compose/ui/layout/Measurable;

    if-eqz v1, :cond_8

    invoke-interface {v1, v6, v7}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    move-result-object v1

    goto :goto_8

    :cond_8
    const/4 v1, 0x0

    .line 803
    :goto_8
    nop

    .line 806
    .local v1, "labelPlaceable":Landroidx/compose/ui/layout/Placeable;
    if-eqz v1, :cond_9

    move-object v2, v1

    .line 1241
    .local v2, "it":Landroidx/compose/ui/layout/Placeable;
    const/4 v8, 0x0

    .line 806
    .local v8, "$i$a$-let-OutlinedTextFieldMeasurePolicy$measure$labelSize$1":I
    invoke-virtual {v2}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    move-result v10

    int-to-float v10, v10

    invoke-virtual {v2}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    move-result v12

    int-to-float v12, v12

    invoke-static {v10, v12}, Landroidx/compose/ui/geometry/SizeKt;->Size(FF)J

    move-result-wide v12

    .end local v2    # "it":Landroidx/compose/ui/layout/Placeable;
    .end local v8    # "$i$a$-let-OutlinedTextFieldMeasurePolicy$measure$labelSize$1":I
    goto :goto_9

    :cond_9
    sget-object v2, Landroidx/compose/ui/geometry/Size;->Companion:Landroidx/compose/ui/geometry/Size$Companion;

    invoke-virtual {v2}, Landroidx/compose/ui/geometry/Size$Companion;->getZero-NH-jbRc()J

    move-result-wide v12

    .line 805
    :goto_9
    move-wide/from16 v25, v12

    .line 807
    .local v25, "labelSize":J
    iget-object v2, v9, Landroidx/compose/material/OutlinedTextFieldMeasurePolicy;->onLabelMeasured:Lkotlin/jvm/functions/Function1;

    invoke-static/range {v25 .. v26}, Landroidx/compose/ui/geometry/Size;->box-impl(J)Landroidx/compose/ui/geometry/Size;

    move-result-object v8

    invoke-interface {v2, v8}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 813
    invoke-static {v1}, Landroidx/compose/material/TextFieldImplKt;->heightOrZero(Landroidx/compose/ui/layout/Placeable;)I

    move-result v2

    div-int/lit8 v2, v2, 0x2

    iget-object v8, v9, Landroidx/compose/material/OutlinedTextFieldMeasurePolicy;->paddingValues:Landroidx/compose/foundation/layout/PaddingValues;

    invoke-interface {v8}, Landroidx/compose/foundation/layout/PaddingValues;->calculateTopPadding-D9Ej5fM()F

    move-result v8

    invoke-interface {v0, v8}, Landroidx/compose/ui/layout/MeasureScope;->roundToPx-0680j_4(F)I

    move-result v8

    invoke-static {v2, v8}, Ljava/lang/Math;->max(II)I

    move-result v2

    .line 812
    move/from16 v27, v2

    .line 815
    .local v27, "topPadding":I
    nop

    .line 817
    neg-int v2, v3

    .line 818
    neg-int v8, v11

    sub-int v8, v8, v27

    .line 816
    move-wide/from16 v12, p3

    invoke-static {v12, v13, v2, v8}, Landroidx/compose/ui/unit/ConstraintsKt;->offset-NN6Ew-U(JII)J

    move-result-wide v28

    .line 820
    const/16 v34, 0xb

    const/16 v35, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    invoke-static/range {v28 .. v35}, Landroidx/compose/ui/unit/Constraints;->copy-Zbe2FdA$default(JIIIIILjava/lang/Object;)J

    move-result-wide v14

    .line 814
    nop

    .line 822
    .local v14, "textConstraints":J
    move-object/from16 v2, p2

    .local v2, "$this$fastFirst$iv":Ljava/util/List;
    const/4 v8, 0x0

    .line 1242
    .local v8, "$i$f$fastFirst":I
    nop

    .line 1243
    move-object v10, v2

    .local v10, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/16 v16, 0x0

    .line 1244
    .local v16, "$i$f$fastForEach":I
    nop

    .line 1245
    const/16 v17, 0x0

    .local v17, "index$iv$iv":I
    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v0

    move-object/from16 v36, v1

    move/from16 v1, v17

    .end local v17    # "index$iv$iv":I
    .local v1, "index$iv$iv":I
    .local v36, "labelPlaceable":Landroidx/compose/ui/layout/Placeable;
    :goto_a
    move-object/from16 v17, v2

    .end local v2    # "$this$fastFirst$iv":Ljava/util/List;
    .local v17, "$this$fastFirst$iv":Ljava/util/List;
    const-string v2, "Collection contains no element matching the predicate."

    if-ge v1, v0, :cond_12

    .line 1246
    invoke-interface {v10, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v19

    .line 1247
    .local v19, "item$iv$iv":Ljava/lang/Object;
    move-object/from16 v20, v19

    .local v20, "it$iv":Ljava/lang/Object;
    const/16 v21, 0x0

    .line 1243
    .local v21, "$i$a$-fastForEach-ListUtilsKt$fastFirst$2$iv":I
    move-object/from16 v28, v20

    check-cast v28, Landroidx/compose/ui/layout/Measurable;

    .local v28, "it":Landroidx/compose/ui/layout/Measurable;
    const/16 v29, 0x0

    .line 822
    .local v29, "$i$a$-fastFirst-OutlinedTextFieldMeasurePolicy$measure$textFieldPlaceable$1":I
    move/from16 v30, v0

    invoke-static/range {v28 .. v28}, Landroidx/compose/ui/layout/LayoutIdKt;->getLayoutId(Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;

    move-result-object v0

    move/from16 v31, v1

    .end local v1    # "index$iv$iv":I
    .local v31, "index$iv$iv":I
    const-string v1, "TextField"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    .line 1243
    .end local v28    # "it":Landroidx/compose/ui/layout/Measurable;
    .end local v29    # "$i$a$-fastFirst-OutlinedTextFieldMeasurePolicy$measure$textFieldPlaceable$1":I
    if-eqz v0, :cond_11

    .line 1250
    .end local v8    # "$i$f$fastFirst":I
    .end local v10    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v16    # "$i$f$fastForEach":I
    .end local v17    # "$this$fastFirst$iv":Ljava/util/List;
    .end local v19    # "item$iv$iv":Ljava/lang/Object;
    .end local v20    # "it$iv":Ljava/lang/Object;
    .end local v21    # "$i$a$-fastForEach-ListUtilsKt$fastFirst$2$iv":I
    .end local v31    # "index$iv$iv":I
    move-object/from16 v0, v20

    check-cast v0, Landroidx/compose/ui/layout/Measurable;

    .line 822
    invoke-interface {v0, v14, v15}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    move-result-object v0

    .line 821
    nop

    .line 825
    .local v0, "textFieldPlaceable":Landroidx/compose/ui/layout/Placeable;
    const/16 v34, 0xe

    const/16 v35, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    move-wide/from16 v28, v14

    .end local v14    # "textConstraints":J
    .local v28, "textConstraints":J
    invoke-static/range {v28 .. v35}, Landroidx/compose/ui/unit/Constraints;->copy-Zbe2FdA$default(JIIIIILjava/lang/Object;)J

    move-result-wide v14

    .line 829
    .local v14, "placeholderConstraints":J
    nop

    .line 827
    nop

    .line 828
    move-object/from16 v1, p2

    .local v1, "$this$fastFirstOrNull$iv":Ljava/util/List;
    const/4 v8, 0x0

    .line 1251
    .local v8, "$i$f$fastFirstOrNull":I
    nop

    .line 1252
    move-object v10, v1

    .restart local v10    # "$this$fastForEach$iv$iv":Ljava/util/List;
    const/16 v16, 0x0

    .line 1253
    .restart local v16    # "$i$f$fastForEach":I
    nop

    .line 1254
    const/16 v17, 0x0

    move-object/from16 v30, v0

    .end local v0    # "textFieldPlaceable":Landroidx/compose/ui/layout/Placeable;
    .local v17, "index$iv$iv":I
    .local v30, "textFieldPlaceable":Landroidx/compose/ui/layout/Placeable;
    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v0

    move-object/from16 v19, v1

    move/from16 v1, v17

    .end local v17    # "index$iv$iv":I
    .local v1, "index$iv$iv":I
    .local v19, "$this$fastFirstOrNull$iv":Ljava/util/List;
    :goto_b
    if-ge v1, v0, :cond_b

    .line 1255
    invoke-interface {v10, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v17

    .line 1256
    .local v17, "item$iv$iv":Ljava/lang/Object;
    move-object/from16 v20, v17

    .restart local v20    # "it$iv":Ljava/lang/Object;
    const/16 v21, 0x0

    .line 1252
    .local v21, "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    move-object/from16 v31, v20

    check-cast v31, Landroidx/compose/ui/layout/Measurable;

    .local v31, "it":Landroidx/compose/ui/layout/Measurable;
    const/16 v32, 0x0

    .line 828
    .local v32, "$i$a$-fastFirstOrNull-OutlinedTextFieldMeasurePolicy$measure$placeholderPlaceable$1":I
    move/from16 v33, v0

    invoke-static/range {v31 .. v31}, Landroidx/compose/ui/layout/LayoutIdKt;->getLayoutId(Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;

    move-result-object v0

    move/from16 v34, v1

    .end local v1    # "index$iv$iv":I
    .local v34, "index$iv$iv":I
    const-string v1, "Hint"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    .line 1252
    .end local v31    # "it":Landroidx/compose/ui/layout/Measurable;
    .end local v32    # "$i$a$-fastFirstOrNull-OutlinedTextFieldMeasurePolicy$measure$placeholderPlaceable$1":I
    if-eqz v0, :cond_a

    goto :goto_c

    .line 1256
    .end local v20    # "it$iv":Ljava/lang/Object;
    .end local v21    # "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    :cond_a
    nop

    .line 1254
    .end local v17    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v1, v34, 0x1

    move/from16 v0, v33

    .end local v34    # "index$iv$iv":I
    .restart local v1    # "index$iv$iv":I
    goto :goto_b

    :cond_b
    move/from16 v34, v1

    .line 1258
    .end local v1    # "index$iv$iv":I
    nop

    .line 1259
    .end local v10    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v16    # "$i$f$fastForEach":I
    const/16 v20, 0x0

    .line 828
    .end local v8    # "$i$f$fastFirstOrNull":I
    .end local v19    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    :goto_c
    move-object/from16 v0, v20

    check-cast v0, Landroidx/compose/ui/layout/Measurable;

    .line 829
    if-eqz v0, :cond_c

    .line 828
    nop

    .line 829
    invoke-interface {v0, v14, v15}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    move-result-object v0

    goto :goto_d

    :cond_c
    const/4 v0, 0x0

    .line 826
    :goto_d
    nop

    .line 833
    .local v0, "placeholderPlaceable":Landroidx/compose/ui/layout/Placeable;
    invoke-static/range {v22 .. v22}, Landroidx/compose/material/TextFieldImplKt;->widthOrZero(Landroidx/compose/ui/layout/Placeable;)I

    move-result v12

    .line 834
    invoke-static {v4}, Landroidx/compose/material/TextFieldImplKt;->widthOrZero(Landroidx/compose/ui/layout/Placeable;)I

    move-result v13

    .line 835
    move-wide v15, v14

    .end local v14    # "placeholderConstraints":J
    .local v15, "placeholderConstraints":J
    invoke-virtual/range {v30 .. v30}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    move-result v14

    .line 836
    move-wide/from16 v16, v15

    .end local v15    # "placeholderConstraints":J
    .local v16, "placeholderConstraints":J
    invoke-static/range {v36 .. v36}, Landroidx/compose/material/TextFieldImplKt;->widthOrZero(Landroidx/compose/ui/layout/Placeable;)I

    move-result v15

    .line 837
    move-wide/from16 v17, v16

    .end local v16    # "placeholderConstraints":J
    .local v17, "placeholderConstraints":J
    invoke-static {v0}, Landroidx/compose/material/TextFieldImplKt;->widthOrZero(Landroidx/compose/ui/layout/Placeable;)I

    move-result v16

    .line 838
    iget v1, v9, Landroidx/compose/material/OutlinedTextFieldMeasurePolicy;->animationProgress:F

    .line 839
    nop

    .line 840
    invoke-interface/range {p1 .. p1}, Landroidx/compose/ui/layout/MeasureScope;->getDensity()F

    move-result v20

    .line 841
    iget-object v8, v9, Landroidx/compose/material/OutlinedTextFieldMeasurePolicy;->paddingValues:Landroidx/compose/foundation/layout/PaddingValues;

    .line 832
    move-object/from16 v21, v8

    move-wide/from16 v31, v17

    move-wide/from16 v18, p3

    move/from16 v17, v1

    .end local v17    # "placeholderConstraints":J
    .local v31, "placeholderConstraints":J
    invoke-static/range {v12 .. v21}, Landroidx/compose/material/OutlinedTextFieldKt;->access$calculateWidth-O3s9Psw(IIIIIFJFLandroidx/compose/foundation/layout/PaddingValues;)I

    move-result v1

    .line 831
    nop

    .line 845
    .local v1, "width":I
    invoke-static/range {v22 .. v22}, Landroidx/compose/material/TextFieldImplKt;->heightOrZero(Landroidx/compose/ui/layout/Placeable;)I

    move-result v12

    .line 846
    invoke-static {v4}, Landroidx/compose/material/TextFieldImplKt;->heightOrZero(Landroidx/compose/ui/layout/Placeable;)I

    move-result v13

    .line 847
    invoke-virtual/range {v30 .. v30}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    move-result v14

    .line 848
    invoke-static/range {v36 .. v36}, Landroidx/compose/material/TextFieldImplKt;->heightOrZero(Landroidx/compose/ui/layout/Placeable;)I

    move-result v15

    .line 849
    invoke-static {v0}, Landroidx/compose/material/TextFieldImplKt;->heightOrZero(Landroidx/compose/ui/layout/Placeable;)I

    move-result v16

    .line 850
    iget v8, v9, Landroidx/compose/material/OutlinedTextFieldMeasurePolicy;->animationProgress:F

    .line 851
    nop

    .line 852
    invoke-interface/range {p1 .. p1}, Landroidx/compose/ui/layout/MeasureScope;->getDensity()F

    move-result v20

    .line 853
    iget-object v10, v9, Landroidx/compose/material/OutlinedTextFieldMeasurePolicy;->paddingValues:Landroidx/compose/foundation/layout/PaddingValues;

    .line 844
    move/from16 v17, v8

    move-object/from16 v21, v10

    invoke-static/range {v12 .. v21}, Landroidx/compose/material/OutlinedTextFieldKt;->access$calculateHeight-O3s9Psw(IIIIIFJFLandroidx/compose/foundation/layout/PaddingValues;)I

    move-result v8

    .line 843
    nop

    .line 857
    .local v8, "height":I
    nop

    .line 858
    move-object/from16 v10, p2

    .local v10, "$this$fastFirst$iv":Ljava/util/List;
    const/4 v12, 0x0

    .line 1260
    .local v12, "$i$f$fastFirst":I
    nop

    .line 1261
    move-object v13, v10

    .local v13, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v14, 0x0

    .line 1262
    .local v14, "$i$f$fastForEach":I
    nop

    .line 1263
    const/4 v15, 0x0

    move-object/from16 v16, v0

    .end local v0    # "placeholderPlaceable":Landroidx/compose/ui/layout/Placeable;
    .local v15, "index$iv$iv":I
    .local v16, "placeholderPlaceable":Landroidx/compose/ui/layout/Placeable;
    invoke-interface {v13}, Ljava/util/List;->size()I

    move-result v0

    :goto_e
    if-ge v15, v0, :cond_10

    .line 1264
    invoke-interface {v13, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v17

    .line 1265
    .local v17, "item$iv$iv":Ljava/lang/Object;
    move-object/from16 v18, v17

    .local v18, "it$iv":Ljava/lang/Object;
    const/16 v19, 0x0

    .line 1261
    .local v19, "$i$a$-fastForEach-ListUtilsKt$fastFirst$2$iv":I
    move-object/from16 v20, v18

    check-cast v20, Landroidx/compose/ui/layout/Measurable;

    .local v20, "it":Landroidx/compose/ui/layout/Measurable;
    const/16 v21, 0x0

    .line 858
    .local v21, "$i$a$-fastFirst-OutlinedTextFieldMeasurePolicy$measure$borderPlaceable$1":I
    move/from16 v33, v0

    invoke-static/range {v20 .. v20}, Landroidx/compose/ui/layout/LayoutIdKt;->getLayoutId(Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;

    move-result-object v0

    move/from16 v34, v3

    .end local v3    # "occupiedSpaceHorizontally":I
    .local v34, "occupiedSpaceHorizontally":I
    const-string v3, "border"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    .line 1261
    .end local v20    # "it":Landroidx/compose/ui/layout/Measurable;
    .end local v21    # "$i$a$-fastFirst-OutlinedTextFieldMeasurePolicy$measure$borderPlaceable$1":I
    if-eqz v0, :cond_f

    .line 1268
    .end local v10    # "$this$fastFirst$iv":Ljava/util/List;
    .end local v12    # "$i$f$fastFirst":I
    .end local v13    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v14    # "$i$f$fastForEach":I
    .end local v15    # "index$iv$iv":I
    .end local v17    # "item$iv$iv":Ljava/lang/Object;
    .end local v18    # "it$iv":Ljava/lang/Object;
    .end local v19    # "$i$a$-fastForEach-ListUtilsKt$fastFirst$2$iv":I
    move-object/from16 v0, v18

    check-cast v0, Landroidx/compose/ui/layout/Measurable;

    .line 861
    const/4 v2, 0x0

    const v3, 0x7fffffff

    if-eq v1, v3, :cond_d

    move v10, v1

    goto :goto_f

    :cond_d
    move v10, v2

    .line 862
    :goto_f
    nop

    .line 863
    if-eq v8, v3, :cond_e

    move v2, v8

    .line 864
    :cond_e
    nop

    .line 860
    invoke-static {v10, v1, v2, v8}, Landroidx/compose/ui/unit/ConstraintsKt;->Constraints(IIII)J

    move-result-wide v2

    .line 859
    invoke-interface {v0, v2, v3}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    move-result-object v0

    .line 856
    nop

    .line 867
    .local v0, "borderPlaceable":Landroidx/compose/ui/layout/Placeable;
    move v2, v8

    move-object v8, v0

    .end local v0    # "borderPlaceable":Landroidx/compose/ui/layout/Placeable;
    .local v2, "height":I
    .local v8, "borderPlaceable":Landroidx/compose/ui/layout/Placeable;
    new-instance v0, Landroidx/compose/material/OutlinedTextFieldMeasurePolicy$measure$1;

    move v3, v2

    move v2, v1

    move v1, v3

    move-wide/from16 v38, v6

    move-object/from16 v6, v36

    move-wide/from16 v35, v38

    move-object/from16 v10, p1

    move-object/from16 v7, v16

    move-object/from16 v3, v22

    move/from16 v22, v5

    move-object/from16 v5, v30

    .end local v16    # "placeholderPlaceable":Landroidx/compose/ui/layout/Placeable;
    .end local v30    # "textFieldPlaceable":Landroidx/compose/ui/layout/Placeable;
    .end local v36    # "labelPlaceable":Landroidx/compose/ui/layout/Placeable;
    .local v1, "height":I
    .local v2, "width":I
    .local v3, "leadingPlaceable":Landroidx/compose/ui/layout/Placeable;
    .local v5, "textFieldPlaceable":Landroidx/compose/ui/layout/Placeable;
    .local v6, "labelPlaceable":Landroidx/compose/ui/layout/Placeable;
    .local v7, "placeholderPlaceable":Landroidx/compose/ui/layout/Placeable;
    .local v22, "labelHorizontalPaddingOffset":I
    .local v35, "labelConstraints":J
    invoke-direct/range {v0 .. v10}, Landroidx/compose/material/OutlinedTextFieldMeasurePolicy$measure$1;-><init>(IILandroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/material/OutlinedTextFieldMeasurePolicy;Landroidx/compose/ui/layout/MeasureScope;)V

    move v9, v2

    move v2, v1

    move v1, v9

    move-object v9, v4

    move-object/from16 v37, v6

    move-object v7, v3

    .end local v3    # "leadingPlaceable":Landroidx/compose/ui/layout/Placeable;
    .end local v4    # "trailingPlaceable":Landroidx/compose/ui/layout/Placeable;
    .end local v5    # "textFieldPlaceable":Landroidx/compose/ui/layout/Placeable;
    .end local v6    # "labelPlaceable":Landroidx/compose/ui/layout/Placeable;
    .local v1, "width":I
    .local v2, "height":I
    .local v7, "leadingPlaceable":Landroidx/compose/ui/layout/Placeable;
    .local v9, "trailingPlaceable":Landroidx/compose/ui/layout/Placeable;
    .restart local v16    # "placeholderPlaceable":Landroidx/compose/ui/layout/Placeable;
    .restart local v30    # "textFieldPlaceable":Landroidx/compose/ui/layout/Placeable;
    .local v37, "labelPlaceable":Landroidx/compose/ui/layout/Placeable;
    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function1;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v3, 0x0

    move-object/from16 v0, p1

    invoke-static/range {v0 .. v6}, Landroidx/compose/ui/layout/MeasureScope;->layout$default(Landroidx/compose/ui/layout/MeasureScope;IILjava/util/Map;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/compose/ui/layout/MeasureResult;

    move-result-object v3

    move v0, v2

    .end local v2    # "height":I
    .local v0, "height":I
    return-object v3

    .line 1261
    .end local v0    # "height":I
    .end local v7    # "leadingPlaceable":Landroidx/compose/ui/layout/Placeable;
    .end local v9    # "trailingPlaceable":Landroidx/compose/ui/layout/Placeable;
    .end local v35    # "labelConstraints":J
    .end local v37    # "labelPlaceable":Landroidx/compose/ui/layout/Placeable;
    .restart local v4    # "trailingPlaceable":Landroidx/compose/ui/layout/Placeable;
    .local v5, "labelHorizontalPaddingOffset":I
    .local v6, "labelConstraints":J
    .local v8, "height":I
    .restart local v10    # "$this$fastFirst$iv":Ljava/util/List;
    .restart local v12    # "$i$f$fastFirst":I
    .restart local v13    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .restart local v14    # "$i$f$fastForEach":I
    .restart local v15    # "index$iv$iv":I
    .restart local v17    # "item$iv$iv":Ljava/lang/Object;
    .restart local v18    # "it$iv":Ljava/lang/Object;
    .restart local v19    # "$i$a$-fastForEach-ListUtilsKt$fastFirst$2$iv":I
    .local v22, "leadingPlaceable":Landroidx/compose/ui/layout/Placeable;
    .restart local v36    # "labelPlaceable":Landroidx/compose/ui/layout/Placeable;
    :cond_f
    move-object v9, v4

    move v0, v8

    move-object/from16 v37, v36

    move-wide/from16 v35, v6

    move-object/from16 v7, v22

    move/from16 v22, v5

    .line 1265
    .end local v4    # "trailingPlaceable":Landroidx/compose/ui/layout/Placeable;
    .end local v5    # "labelHorizontalPaddingOffset":I
    .end local v6    # "labelConstraints":J
    .end local v8    # "height":I
    .end local v18    # "it$iv":Ljava/lang/Object;
    .end local v19    # "$i$a$-fastForEach-ListUtilsKt$fastFirst$2$iv":I
    .end local v36    # "labelPlaceable":Landroidx/compose/ui/layout/Placeable;
    .restart local v0    # "height":I
    .restart local v7    # "leadingPlaceable":Landroidx/compose/ui/layout/Placeable;
    .restart local v9    # "trailingPlaceable":Landroidx/compose/ui/layout/Placeable;
    .local v22, "labelHorizontalPaddingOffset":I
    .restart local v35    # "labelConstraints":J
    .restart local v37    # "labelPlaceable":Landroidx/compose/ui/layout/Placeable;
    nop

    .line 1263
    .end local v17    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v15, v15, 0x1

    move/from16 v0, v33

    move/from16 v3, v34

    move-object/from16 v9, p0

    move-object/from16 v22, v7

    move-wide/from16 v6, v35

    move-object/from16 v36, v37

    goto/16 :goto_e

    .end local v0    # "height":I
    .end local v7    # "leadingPlaceable":Landroidx/compose/ui/layout/Placeable;
    .end local v9    # "trailingPlaceable":Landroidx/compose/ui/layout/Placeable;
    .end local v34    # "occupiedSpaceHorizontally":I
    .end local v35    # "labelConstraints":J
    .end local v37    # "labelPlaceable":Landroidx/compose/ui/layout/Placeable;
    .local v3, "occupiedSpaceHorizontally":I
    .restart local v4    # "trailingPlaceable":Landroidx/compose/ui/layout/Placeable;
    .restart local v5    # "labelHorizontalPaddingOffset":I
    .restart local v6    # "labelConstraints":J
    .restart local v8    # "height":I
    .local v22, "leadingPlaceable":Landroidx/compose/ui/layout/Placeable;
    .restart local v36    # "labelPlaceable":Landroidx/compose/ui/layout/Placeable;
    :cond_10
    move/from16 v34, v3

    .line 1267
    .end local v3    # "occupiedSpaceHorizontally":I
    .end local v15    # "index$iv$iv":I
    .restart local v34    # "occupiedSpaceHorizontally":I
    nop

    .line 1268
    .end local v13    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v14    # "$i$f$fastForEach":I
    new-instance v3, Ljava/util/NoSuchElementException;

    invoke-direct {v3, v2}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v3

    .line 1243
    .end local v1    # "width":I
    .end local v12    # "$i$f$fastFirst":I
    .end local v28    # "textConstraints":J
    .end local v30    # "textFieldPlaceable":Landroidx/compose/ui/layout/Placeable;
    .end local v34    # "occupiedSpaceHorizontally":I
    .restart local v3    # "occupiedSpaceHorizontally":I
    .local v8, "$i$f$fastFirst":I
    .local v10, "$this$fastForEach$iv$iv":Ljava/util/List;
    .local v14, "textConstraints":J
    .local v16, "$i$f$fastForEach":I
    .local v17, "$this$fastFirst$iv":Ljava/util/List;
    .local v19, "item$iv$iv":Ljava/lang/Object;
    .local v20, "it$iv":Ljava/lang/Object;
    .local v21, "$i$a$-fastForEach-ListUtilsKt$fastFirst$2$iv":I
    .local v31, "index$iv$iv":I
    :cond_11
    move/from16 v34, v3

    move-object v9, v4

    move-wide/from16 v28, v14

    move-object/from16 v37, v36

    move-wide/from16 v35, v6

    move-object/from16 v7, v22

    move/from16 v22, v5

    .line 1247
    .end local v3    # "occupiedSpaceHorizontally":I
    .end local v4    # "trailingPlaceable":Landroidx/compose/ui/layout/Placeable;
    .end local v5    # "labelHorizontalPaddingOffset":I
    .end local v6    # "labelConstraints":J
    .end local v14    # "textConstraints":J
    .end local v20    # "it$iv":Ljava/lang/Object;
    .end local v21    # "$i$a$-fastForEach-ListUtilsKt$fastFirst$2$iv":I
    .end local v36    # "labelPlaceable":Landroidx/compose/ui/layout/Placeable;
    .restart local v7    # "leadingPlaceable":Landroidx/compose/ui/layout/Placeable;
    .restart local v9    # "trailingPlaceable":Landroidx/compose/ui/layout/Placeable;
    .local v22, "labelHorizontalPaddingOffset":I
    .restart local v28    # "textConstraints":J
    .restart local v34    # "occupiedSpaceHorizontally":I
    .restart local v35    # "labelConstraints":J
    .restart local v37    # "labelPlaceable":Landroidx/compose/ui/layout/Placeable;
    nop

    .line 1245
    .end local v19    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v1, v31, 0x1

    move-wide/from16 v12, p3

    move-object/from16 v2, v17

    move/from16 v0, v30

    move-object/from16 v9, p0

    move-object/from16 v22, v7

    move-wide/from16 v6, v35

    move-object/from16 v36, v37

    .end local v31    # "index$iv$iv":I
    .local v1, "index$iv$iv":I
    goto/16 :goto_a

    .line 1249
    .end local v1    # "index$iv$iv":I
    .end local v7    # "leadingPlaceable":Landroidx/compose/ui/layout/Placeable;
    .end local v9    # "trailingPlaceable":Landroidx/compose/ui/layout/Placeable;
    .end local v28    # "textConstraints":J
    .end local v34    # "occupiedSpaceHorizontally":I
    .end local v35    # "labelConstraints":J
    .end local v37    # "labelPlaceable":Landroidx/compose/ui/layout/Placeable;
    .restart local v3    # "occupiedSpaceHorizontally":I
    .restart local v4    # "trailingPlaceable":Landroidx/compose/ui/layout/Placeable;
    .restart local v5    # "labelHorizontalPaddingOffset":I
    .restart local v6    # "labelConstraints":J
    .restart local v14    # "textConstraints":J
    .local v22, "leadingPlaceable":Landroidx/compose/ui/layout/Placeable;
    .restart local v36    # "labelPlaceable":Landroidx/compose/ui/layout/Placeable;
    :cond_12
    nop

    .line 1250
    .end local v10    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v16    # "$i$f$fastForEach":I
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0, v2}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

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

    .line 899
    sget-object v0, Landroidx/compose/material/OutlinedTextFieldMeasurePolicy$minIntrinsicHeight$1;->INSTANCE:Landroidx/compose/material/OutlinedTextFieldMeasurePolicy$minIntrinsicHeight$1;

    check-cast v0, Lkotlin/jvm/functions/Function2;

    invoke-direct {p0, p1, p2, p3, v0}, Landroidx/compose/material/OutlinedTextFieldMeasurePolicy;->intrinsicHeight(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;ILkotlin/jvm/functions/Function2;)I

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

    .line 917
    sget-object v0, Landroidx/compose/material/OutlinedTextFieldMeasurePolicy$minIntrinsicWidth$1;->INSTANCE:Landroidx/compose/material/OutlinedTextFieldMeasurePolicy$minIntrinsicWidth$1;

    check-cast v0, Lkotlin/jvm/functions/Function2;

    invoke-direct {p0, p1, p2, p3, v0}, Landroidx/compose/material/OutlinedTextFieldMeasurePolicy;->intrinsicWidth(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;ILkotlin/jvm/functions/Function2;)I

    move-result v0

    return v0
.end method
