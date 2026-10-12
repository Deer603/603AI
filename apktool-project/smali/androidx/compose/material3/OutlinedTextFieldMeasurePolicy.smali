.class final Landroidx/compose/material3/OutlinedTextFieldMeasurePolicy;
.super Ljava/lang/Object;
.source "OutlinedTextField.kt"

# interfaces
.implements Landroidx/compose/ui/layout/MeasurePolicy;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nOutlinedTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OutlinedTextField.kt\nandroidx/compose/material3/OutlinedTextFieldMeasurePolicy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1155:1\n116#2,2:1156\n33#2,6:1158\n118#2:1164\n116#2,2:1165\n33#2,6:1167\n118#2:1173\n116#2,2:1174\n33#2,6:1176\n118#2:1182\n116#2,2:1183\n33#2,6:1185\n118#2:1191\n116#2,2:1192\n33#2,6:1194\n118#2:1200\n116#2,2:1202\n33#2,6:1204\n118#2:1210\n544#2,2:1211\n33#2,6:1213\n546#2:1219\n116#2,2:1220\n33#2,6:1222\n118#2:1228\n544#2,2:1229\n33#2,6:1231\n546#2:1237\n544#2,2:1238\n33#2,6:1240\n546#2:1246\n116#2,2:1247\n33#2,6:1249\n118#2:1255\n116#2,2:1256\n33#2,6:1258\n118#2:1264\n116#2,2:1265\n33#2,6:1267\n118#2:1273\n116#2,2:1274\n33#2,6:1276\n118#2:1282\n116#2,2:1283\n33#2,6:1285\n118#2:1291\n116#2,2:1292\n33#2,6:1294\n118#2:1300\n116#2,2:1301\n33#2,6:1303\n118#2:1309\n116#2,2:1310\n33#2,6:1312\n118#2:1318\n116#2,2:1319\n33#2,6:1321\n118#2:1327\n116#2,2:1328\n33#2,6:1330\n118#2:1336\n116#2,2:1337\n33#2,6:1339\n118#2:1345\n544#2,2:1346\n33#2,6:1348\n546#2:1354\n116#2,2:1355\n33#2,6:1357\n118#2:1363\n116#2,2:1364\n33#2,6:1366\n118#2:1372\n1#3:1201\n*S KotlinDebug\n*F\n+ 1 OutlinedTextField.kt\nandroidx/compose/material3/OutlinedTextFieldMeasurePolicy\n*L\n608#1:1156,2\n608#1:1158,6\n608#1:1164\n615#1:1165,2\n615#1:1167,6\n615#1:1173\n623#1:1174,2\n623#1:1176,6\n623#1:1182\n631#1:1183,2\n631#1:1185,6\n631#1:1191\n652#1:1192,2\n652#1:1194,6\n652#1:1200\n659#1:1202,2\n659#1:1204,6\n659#1:1210\n674#1:1211,2\n674#1:1213,6\n674#1:1219\n680#1:1220,2\n680#1:1222,6\n680#1:1228\n733#1:1229,2\n733#1:1231,6\n733#1:1237\n806#1:1238,2\n806#1:1240,6\n806#1:1246\n809#1:1247,2\n809#1:1249,6\n809#1:1255\n813#1:1256,2\n813#1:1258,6\n813#1:1264\n817#1:1265,2\n817#1:1267,6\n817#1:1273\n821#1:1274,2\n821#1:1276,6\n821#1:1282\n825#1:1283,2\n825#1:1285,6\n825#1:1291\n829#1:1292,2\n829#1:1294,6\n829#1:1300\n854#1:1301,2\n854#1:1303,6\n854#1:1309\n864#1:1310,2\n864#1:1312,6\n864#1:1318\n875#1:1319,2\n875#1:1321,6\n875#1:1327\n880#1:1328,2\n880#1:1330,6\n880#1:1336\n891#1:1337,2\n891#1:1339,6\n891#1:1345\n902#1:1346,2\n902#1:1348,6\n902#1:1354\n906#1:1355,2\n906#1:1357,6\n906#1:1363\n911#1:1364,2\n911#1:1366,6\n911#1:1372\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0002\u0018\u00002\u00020\u0001B1\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\u000cJ<\u0010\r\u001a\u00020\u000e*\u00020\u000f2\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u000e2\u0018\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\u0015H\u0002J<\u0010\u0016\u001a\u00020\u000e*\u00020\u000f2\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0017\u001a\u00020\u000e2\u0018\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\u0015H\u0002J\"\u0010\u0018\u001a\u00020\u000e*\u00020\u000f2\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u000eH\u0016J\"\u0010\u0019\u001a\u00020\u000e*\u00020\u000f2\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0017\u001a\u00020\u000eH\u0016J,\u0010\u001a\u001a\u00020\u001b*\u00020\u001c2\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u001d0\u00112\u0006\u0010\u001e\u001a\u00020\u001fH\u0016\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008 \u0010!J\"\u0010\"\u001a\u00020\u000e*\u00020\u000f2\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u000eH\u0016J\"\u0010#\u001a\u00020\u000e*\u00020\u000f2\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0017\u001a\u00020\u000eH\u0016R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006$"
    }
    d2 = {
        "Landroidx/compose/material3/OutlinedTextFieldMeasurePolicy;",
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

    .line 590
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 591
    iput-object p1, p0, Landroidx/compose/material3/OutlinedTextFieldMeasurePolicy;->onLabelMeasured:Lkotlin/jvm/functions/Function1;

    .line 592
    iput-boolean p2, p0, Landroidx/compose/material3/OutlinedTextFieldMeasurePolicy;->singleLine:Z

    .line 593
    iput p3, p0, Landroidx/compose/material3/OutlinedTextFieldMeasurePolicy;->animationProgress:F

    .line 594
    iput-object p4, p0, Landroidx/compose/material3/OutlinedTextFieldMeasurePolicy;->paddingValues:Landroidx/compose/foundation/layout/PaddingValues;

    .line 590
    return-void
.end method

.method public static final synthetic access$getAnimationProgress$p(Landroidx/compose/material3/OutlinedTextFieldMeasurePolicy;)F
    .locals 1
    .param p0, "$this"    # Landroidx/compose/material3/OutlinedTextFieldMeasurePolicy;

    .line 590
    iget v0, p0, Landroidx/compose/material3/OutlinedTextFieldMeasurePolicy;->animationProgress:F

    return v0
.end method

.method public static final synthetic access$getPaddingValues$p(Landroidx/compose/material3/OutlinedTextFieldMeasurePolicy;)Landroidx/compose/foundation/layout/PaddingValues;
    .locals 1
    .param p0, "$this"    # Landroidx/compose/material3/OutlinedTextFieldMeasurePolicy;

    .line 590
    iget-object v0, p0, Landroidx/compose/material3/OutlinedTextFieldMeasurePolicy;->paddingValues:Landroidx/compose/foundation/layout/PaddingValues;

    return-object v0
.end method

.method public static final synthetic access$getSingleLine$p(Landroidx/compose/material3/OutlinedTextFieldMeasurePolicy;)Z
    .locals 1
    .param p0, "$this"    # Landroidx/compose/material3/OutlinedTextFieldMeasurePolicy;

    .line 590
    iget-boolean v0, p0, Landroidx/compose/material3/OutlinedTextFieldMeasurePolicy;->singleLine:Z

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

    .line 851
    move-object/from16 v0, p0

    move-object/from16 v1, p4

    const/4 v2, 0x0

    .local v2, "remainingWidth":I
    move/from16 v2, p3

    .line 853
    nop

    .line 854
    move-object/from16 v3, p2

    .local v3, "$this$fastFirstOrNull$iv":Ljava/util/List;
    const/4 v4, 0x0

    .line 1301
    .local v4, "$i$f$fastFirstOrNull":I
    nop

    .line 1302
    move-object v5, v3

    .local v5, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v6, 0x0

    .line 1303
    .local v6, "$i$f$fastForEach":I
    nop

    .line 1304
    const/4 v7, 0x0

    .local v7, "index$iv$iv":I
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v8

    :goto_0
    if-ge v7, v8, :cond_1

    .line 1305
    invoke-interface {v5, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    .line 1306
    .local v10, "item$iv$iv":Ljava/lang/Object;
    move-object v11, v10

    .local v11, "it$iv":Ljava/lang/Object;
    const/4 v12, 0x0

    .line 1302
    .local v12, "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    move-object v13, v11

    check-cast v13, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .local v13, "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/4 v14, 0x0

    .line 854
    .local v14, "$i$a$-fastFirstOrNull-OutlinedTextFieldMeasurePolicy$intrinsicHeight$leadingHeight$1":I
    invoke-static {v13}, Landroidx/compose/material3/internal/TextFieldImplKt;->getLayoutId(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Ljava/lang/Object;

    move-result-object v15

    const-string v9, "Leading"

    invoke-static {v15, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    .line 1302
    .end local v13    # "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .end local v14    # "$i$a$-fastFirstOrNull-OutlinedTextFieldMeasurePolicy$intrinsicHeight$leadingHeight$1":I
    if-eqz v9, :cond_0

    goto :goto_1

    .line 1306
    .end local v11    # "it$iv":Ljava/lang/Object;
    .end local v12    # "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    :cond_0
    nop

    .line 1304
    .end local v10    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 1308
    .end local v7    # "index$iv$iv":I
    :cond_1
    nop

    .line 1309
    .end local v5    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v6    # "$i$f$fastForEach":I
    const/4 v11, 0x0

    .line 854
    .end local v3    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .end local v4    # "$i$f$fastFirstOrNull":I
    :goto_1
    check-cast v11, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .line 855
    const v3, 0x7fffffff

    if-eqz v11, :cond_2

    .line 854
    nop

    .line 855
    nop

    .local v11, "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/4 v5, 0x0

    .line 856
    .local v5, "$i$a$-let-OutlinedTextFieldMeasurePolicy$intrinsicHeight$leadingHeight$2":I
    nop

    .line 857
    nop

    .line 858
    invoke-interface {v11, v3}, Landroidx/compose/ui/layout/IntrinsicMeasurable;->maxIntrinsicWidth(I)I

    move-result v6

    .line 857
    invoke-static {v2, v6}, Landroidx/compose/material3/OutlinedTextFieldKt;->access$substractConstraintSafely(II)I

    move-result v6

    .line 856
    move v2, v6

    .line 860
    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v1, v11, v6}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    move-result v5

    .line 855
    .end local v5    # "$i$a$-let-OutlinedTextFieldMeasurePolicy$intrinsicHeight$leadingHeight$2":I
    .end local v11    # "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    nop

    .line 853
    goto :goto_2

    .line 861
    :cond_2
    const/4 v5, 0x0

    .line 853
    :goto_2
    nop

    .line 852
    move/from16 v16, v5

    .line 863
    .local v16, "leadingHeight":I
    nop

    .line 864
    move-object/from16 v5, p2

    .local v5, "$this$fastFirstOrNull$iv":Ljava/util/List;
    const/4 v6, 0x0

    .line 1310
    .local v6, "$i$f$fastFirstOrNull":I
    nop

    .line 1311
    move-object v7, v5

    .local v7, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v8, 0x0

    .line 1312
    .local v8, "$i$f$fastForEach":I
    nop

    .line 1313
    const/4 v9, 0x0

    .local v9, "index$iv$iv":I
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v10

    :goto_3
    if-ge v9, v10, :cond_4

    .line 1314
    invoke-interface {v7, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    .line 1315
    .local v11, "item$iv$iv":Ljava/lang/Object;
    move-object v12, v11

    .local v12, "it$iv":Ljava/lang/Object;
    const/4 v13, 0x0

    .line 1311
    .local v13, "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    move-object v14, v12

    check-cast v14, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .local v14, "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/4 v15, 0x0

    .line 864
    .local v15, "$i$a$-fastFirstOrNull-OutlinedTextFieldMeasurePolicy$intrinsicHeight$trailingHeight$1":I
    invoke-static {v14}, Landroidx/compose/material3/internal/TextFieldImplKt;->getLayoutId(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Ljava/lang/Object;

    move-result-object v4

    const-string v3, "Trailing"

    invoke-static {v4, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    .line 1311
    .end local v14    # "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .end local v15    # "$i$a$-fastFirstOrNull-OutlinedTextFieldMeasurePolicy$intrinsicHeight$trailingHeight$1":I
    if-eqz v3, :cond_3

    goto :goto_4

    .line 1315
    .end local v12    # "it$iv":Ljava/lang/Object;
    .end local v13    # "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    :cond_3
    nop

    .line 1313
    .end local v11    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v9, v9, 0x1

    const v3, 0x7fffffff

    goto :goto_3

    .line 1317
    .end local v9    # "index$iv$iv":I
    :cond_4
    nop

    .line 1318
    .end local v7    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v8    # "$i$f$fastForEach":I
    const/4 v12, 0x0

    .line 864
    .end local v5    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .end local v6    # "$i$f$fastFirstOrNull":I
    :goto_4
    check-cast v12, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .line 865
    if-eqz v12, :cond_5

    .line 864
    nop

    .line 865
    nop

    .local v12, "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/4 v3, 0x0

    .line 866
    .local v3, "$i$a$-let-OutlinedTextFieldMeasurePolicy$intrinsicHeight$trailingHeight$2":I
    nop

    .line 867
    nop

    .line 868
    const v4, 0x7fffffff

    invoke-interface {v12, v4}, Landroidx/compose/ui/layout/IntrinsicMeasurable;->maxIntrinsicWidth(I)I

    move-result v5

    .line 867
    invoke-static {v2, v5}, Landroidx/compose/material3/OutlinedTextFieldKt;->access$substractConstraintSafely(II)I

    move-result v4

    .line 866
    move v2, v4

    .line 870
    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v1, v12, v4}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v3

    .line 865
    .end local v3    # "$i$a$-let-OutlinedTextFieldMeasurePolicy$intrinsicHeight$trailingHeight$2":I
    .end local v12    # "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    nop

    .line 863
    goto :goto_5

    .line 871
    :cond_5
    const/4 v3, 0x0

    .line 863
    :goto_5
    nop

    .line 862
    nop

    .line 874
    .local v3, "trailingHeight":I
    nop

    .line 875
    move-object/from16 v4, p2

    .local v4, "$this$fastFirstOrNull$iv":Ljava/util/List;
    const/4 v5, 0x0

    .line 1319
    .local v5, "$i$f$fastFirstOrNull":I
    nop

    .line 1320
    move-object v6, v4

    .local v6, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v7, 0x0

    .line 1321
    .local v7, "$i$f$fastForEach":I
    nop

    .line 1322
    const/4 v8, 0x0

    .local v8, "index$iv$iv":I
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v9

    :goto_6
    if-ge v8, v9, :cond_7

    .line 1323
    invoke-interface {v6, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    .line 1324
    .restart local v10    # "item$iv$iv":Ljava/lang/Object;
    move-object v11, v10

    .local v11, "it$iv":Ljava/lang/Object;
    const/4 v12, 0x0

    .line 1320
    .local v12, "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    move-object v13, v11

    check-cast v13, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .local v13, "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/4 v14, 0x0

    .line 875
    .local v14, "$i$a$-fastFirstOrNull-OutlinedTextFieldMeasurePolicy$intrinsicHeight$labelHeight$1":I
    invoke-static {v13}, Landroidx/compose/material3/internal/TextFieldImplKt;->getLayoutId(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Ljava/lang/Object;

    move-result-object v15

    move/from16 v19, v3

    .end local v3    # "trailingHeight":I
    .local v19, "trailingHeight":I
    const-string v3, "Label"

    invoke-static {v15, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    .line 1320
    .end local v13    # "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .end local v14    # "$i$a$-fastFirstOrNull-OutlinedTextFieldMeasurePolicy$intrinsicHeight$labelHeight$1":I
    if-eqz v3, :cond_6

    goto :goto_7

    .line 1324
    .end local v11    # "it$iv":Ljava/lang/Object;
    .end local v12    # "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    :cond_6
    nop

    .line 1322
    .end local v10    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v8, v8, 0x1

    move/from16 v3, v19

    goto :goto_6

    .end local v19    # "trailingHeight":I
    .restart local v3    # "trailingHeight":I
    :cond_7
    move/from16 v19, v3

    .line 1326
    .end local v3    # "trailingHeight":I
    .end local v8    # "index$iv$iv":I
    .restart local v19    # "trailingHeight":I
    nop

    .line 1327
    .end local v6    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v7    # "$i$f$fastForEach":I
    const/4 v11, 0x0

    .line 875
    .end local v4    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .end local v5    # "$i$f$fastFirstOrNull":I
    :goto_7
    check-cast v11, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .line 876
    if-eqz v11, :cond_8

    .line 875
    nop

    .line 876
    nop

    .line 1201
    .local v11, "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/4 v3, 0x0

    .line 876
    .local v3, "$i$a$-let-OutlinedTextFieldMeasurePolicy$intrinsicHeight$labelHeight$2":I
    iget v4, v0, Landroidx/compose/material3/OutlinedTextFieldMeasurePolicy;->animationProgress:F

    move/from16 v5, p3

    invoke-static {v2, v5, v4}, Landroidx/compose/ui/util/MathHelpersKt;->lerp(IIF)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v1, v11, v4}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v3

    .line 874
    .end local v3    # "$i$a$-let-OutlinedTextFieldMeasurePolicy$intrinsicHeight$labelHeight$2":I
    .end local v11    # "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    move/from16 v21, v3

    goto :goto_8

    .line 876
    :cond_8
    move/from16 v5, p3

    const/16 v21, 0x0

    .line 874
    :goto_8
    nop

    .line 873
    nop

    .line 879
    .local v21, "labelHeight":I
    nop

    .line 880
    move-object/from16 v3, p2

    .local v3, "$this$fastFirstOrNull$iv":Ljava/util/List;
    const/4 v4, 0x0

    .line 1328
    .local v4, "$i$f$fastFirstOrNull":I
    nop

    .line 1329
    move-object v6, v3

    .restart local v6    # "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v7, 0x0

    .line 1330
    .restart local v7    # "$i$f$fastForEach":I
    nop

    .line 1331
    const/4 v8, 0x0

    .restart local v8    # "index$iv$iv":I
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v9

    :goto_9
    if-ge v8, v9, :cond_a

    .line 1332
    invoke-interface {v6, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    .line 1333
    .restart local v10    # "item$iv$iv":Ljava/lang/Object;
    move-object v11, v10

    .local v11, "it$iv":Ljava/lang/Object;
    const/4 v12, 0x0

    .line 1329
    .restart local v12    # "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    move-object v13, v11

    check-cast v13, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .restart local v13    # "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/4 v14, 0x0

    .line 880
    .local v14, "$i$a$-fastFirstOrNull-OutlinedTextFieldMeasurePolicy$intrinsicHeight$prefixHeight$1":I
    invoke-static {v13}, Landroidx/compose/material3/internal/TextFieldImplKt;->getLayoutId(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Ljava/lang/Object;

    move-result-object v15

    move-object/from16 v20, v3

    .end local v3    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .local v20, "$this$fastFirstOrNull$iv":Ljava/util/List;
    const-string v3, "Prefix"

    invoke-static {v15, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    .line 1329
    .end local v13    # "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .end local v14    # "$i$a$-fastFirstOrNull-OutlinedTextFieldMeasurePolicy$intrinsicHeight$prefixHeight$1":I
    if-eqz v3, :cond_9

    goto :goto_a

    .line 1333
    .end local v11    # "it$iv":Ljava/lang/Object;
    .end local v12    # "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    :cond_9
    nop

    .line 1331
    .end local v10    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v8, v8, 0x1

    move-object/from16 v3, v20

    goto :goto_9

    .end local v20    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .restart local v3    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    :cond_a
    move-object/from16 v20, v3

    .line 1335
    .end local v3    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .end local v8    # "index$iv$iv":I
    .restart local v20    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    nop

    .line 1336
    .end local v6    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v7    # "$i$f$fastForEach":I
    const/4 v11, 0x0

    .line 880
    .end local v4    # "$i$f$fastFirstOrNull":I
    .end local v20    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    :goto_a
    check-cast v11, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .line 881
    if-eqz v11, :cond_b

    .line 880
    nop

    .line 881
    nop

    .local v11, "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/4 v3, 0x0

    .line 882
    .local v3, "$i$a$-let-OutlinedTextFieldMeasurePolicy$intrinsicHeight$prefixHeight$2":I
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v1, v11, v4}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    .line 883
    .local v4, "height":I
    nop

    .line 884
    nop

    .line 885
    const v6, 0x7fffffff

    invoke-interface {v11, v6}, Landroidx/compose/ui/layout/IntrinsicMeasurable;->maxIntrinsicWidth(I)I

    move-result v7

    .line 884
    invoke-static {v2, v7}, Landroidx/compose/material3/OutlinedTextFieldKt;->access$substractConstraintSafely(II)I

    move-result v6

    .line 883
    move v2, v6

    .line 887
    nop

    .line 881
    .end local v3    # "$i$a$-let-OutlinedTextFieldMeasurePolicy$intrinsicHeight$prefixHeight$2":I
    .end local v4    # "height":I
    .end local v11    # "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    nop

    .line 879
    goto :goto_b

    .line 888
    :cond_b
    const/4 v4, 0x0

    .line 879
    :goto_b
    nop

    .line 878
    nop

    .line 890
    .local v4, "prefixHeight":I
    nop

    .line 891
    move-object/from16 v3, p2

    .local v3, "$this$fastFirstOrNull$iv":Ljava/util/List;
    const/4 v6, 0x0

    .line 1337
    .local v6, "$i$f$fastFirstOrNull":I
    nop

    .line 1338
    move-object v7, v3

    .local v7, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v8, 0x0

    .line 1339
    .local v8, "$i$f$fastForEach":I
    nop

    .line 1340
    const/4 v9, 0x0

    .restart local v9    # "index$iv$iv":I
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v10

    :goto_c
    if-ge v9, v10, :cond_d

    .line 1341
    invoke-interface {v7, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    .line 1342
    .local v11, "item$iv$iv":Ljava/lang/Object;
    move-object v12, v11

    .local v12, "it$iv":Ljava/lang/Object;
    const/4 v13, 0x0

    .line 1338
    .local v13, "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    move-object v14, v12

    check-cast v14, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .local v14, "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/4 v15, 0x0

    .line 891
    .local v15, "$i$a$-fastFirstOrNull-OutlinedTextFieldMeasurePolicy$intrinsicHeight$suffixHeight$1":I
    move-object/from16 v20, v3

    .end local v3    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .restart local v20    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    invoke-static {v14}, Landroidx/compose/material3/internal/TextFieldImplKt;->getLayoutId(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Ljava/lang/Object;

    move-result-object v3

    move/from16 v22, v4

    .end local v4    # "prefixHeight":I
    .local v22, "prefixHeight":I
    const-string v4, "Suffix"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    .line 1338
    .end local v14    # "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .end local v15    # "$i$a$-fastFirstOrNull-OutlinedTextFieldMeasurePolicy$intrinsicHeight$suffixHeight$1":I
    if-eqz v3, :cond_c

    goto :goto_d

    .line 1342
    .end local v12    # "it$iv":Ljava/lang/Object;
    .end local v13    # "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    :cond_c
    nop

    .line 1340
    .end local v11    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v9, v9, 0x1

    move-object/from16 v3, v20

    move/from16 v4, v22

    goto :goto_c

    .end local v20    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .end local v22    # "prefixHeight":I
    .restart local v3    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .restart local v4    # "prefixHeight":I
    :cond_d
    move-object/from16 v20, v3

    move/from16 v22, v4

    .line 1344
    .end local v3    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .end local v4    # "prefixHeight":I
    .end local v9    # "index$iv$iv":I
    .restart local v20    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .restart local v22    # "prefixHeight":I
    nop

    .line 1345
    .end local v7    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v8    # "$i$f$fastForEach":I
    const/4 v12, 0x0

    .line 891
    .end local v6    # "$i$f$fastFirstOrNull":I
    .end local v20    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    :goto_d
    check-cast v12, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .line 892
    if-eqz v12, :cond_e

    .line 891
    nop

    .line 892
    nop

    .local v12, "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/4 v3, 0x0

    .line 893
    .local v3, "$i$a$-let-OutlinedTextFieldMeasurePolicy$intrinsicHeight$suffixHeight$2":I
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v1, v12, v4}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    .line 894
    .local v4, "height":I
    nop

    .line 895
    nop

    .line 896
    const v6, 0x7fffffff

    invoke-interface {v12, v6}, Landroidx/compose/ui/layout/IntrinsicMeasurable;->maxIntrinsicWidth(I)I

    move-result v6

    .line 895
    invoke-static {v2, v6}, Landroidx/compose/material3/OutlinedTextFieldKt;->access$substractConstraintSafely(II)I

    move-result v6

    .line 894
    move v2, v6

    .line 898
    nop

    .line 892
    .end local v3    # "$i$a$-let-OutlinedTextFieldMeasurePolicy$intrinsicHeight$suffixHeight$2":I
    .end local v4    # "height":I
    .end local v12    # "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    nop

    .line 890
    goto :goto_e

    .line 899
    :cond_e
    const/4 v4, 0x0

    .line 890
    :goto_e
    nop

    .line 889
    nop

    .line 902
    .local v4, "suffixHeight":I
    move-object/from16 v3, p2

    .local v3, "$this$fastFirst$iv":Ljava/util/List;
    const/4 v6, 0x0

    .line 1346
    .local v6, "$i$f$fastFirst":I
    nop

    .line 1347
    move-object v7, v3

    .restart local v7    # "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v8, 0x0

    .line 1348
    .restart local v8    # "$i$f$fastForEach":I
    nop

    .line 1349
    const/4 v9, 0x0

    .restart local v9    # "index$iv$iv":I
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v10

    :goto_f
    if-ge v9, v10, :cond_16

    .line 1350
    invoke-interface {v7, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    .line 1351
    .restart local v11    # "item$iv$iv":Ljava/lang/Object;
    move-object v12, v11

    .local v12, "it$iv":Ljava/lang/Object;
    const/4 v13, 0x0

    .line 1347
    .local v13, "$i$a$-fastForEach-ListUtilsKt$fastFirst$2$iv":I
    move-object v14, v12

    check-cast v14, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .restart local v14    # "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/4 v15, 0x0

    .line 902
    .local v15, "$i$a$-fastFirst-OutlinedTextFieldMeasurePolicy$intrinsicHeight$textFieldHeight$1":I
    move/from16 v29, v2

    .end local v2    # "remainingWidth":I
    .local v29, "remainingWidth":I
    invoke-static {v14}, Landroidx/compose/material3/internal/TextFieldImplKt;->getLayoutId(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v18, v3

    .end local v3    # "$this$fastFirst$iv":Ljava/util/List;
    .local v18, "$this$fastFirst$iv":Ljava/util/List;
    const-string v3, "TextField"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    .line 1347
    .end local v14    # "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .end local v15    # "$i$a$-fastFirst-OutlinedTextFieldMeasurePolicy$intrinsicHeight$textFieldHeight$1":I
    if-eqz v2, :cond_15

    .line 902
    .end local v6    # "$i$f$fastFirst":I
    .end local v7    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v8    # "$i$f$fastForEach":I
    .end local v9    # "index$iv$iv":I
    .end local v11    # "item$iv$iv":Ljava/lang/Object;
    .end local v12    # "it$iv":Ljava/lang/Object;
    .end local v13    # "$i$a$-fastForEach-ListUtilsKt$fastFirst$2$iv":I
    .end local v18    # "$this$fastFirst$iv":Ljava/util/List;
    invoke-static/range {v29 .. v29}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v12, v2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v20

    .line 901
    nop

    .line 905
    .local v20, "textFieldHeight":I
    nop

    .line 906
    move-object/from16 v2, p2

    .local v2, "$this$fastFirstOrNull$iv":Ljava/util/List;
    const/4 v3, 0x0

    .line 1355
    .local v3, "$i$f$fastFirstOrNull":I
    nop

    .line 1356
    move-object v6, v2

    .local v6, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v7, 0x0

    .line 1357
    .local v7, "$i$f$fastForEach":I
    nop

    .line 1358
    const/4 v8, 0x0

    .local v8, "index$iv$iv":I
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v9

    :goto_10
    if-ge v8, v9, :cond_10

    .line 1359
    invoke-interface {v6, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    .line 1360
    .restart local v10    # "item$iv$iv":Ljava/lang/Object;
    move-object v11, v10

    .local v11, "it$iv":Ljava/lang/Object;
    const/4 v12, 0x0

    .line 1356
    .local v12, "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    move-object v13, v11

    check-cast v13, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .local v13, "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/4 v14, 0x0

    .line 906
    .local v14, "$i$a$-fastFirstOrNull-OutlinedTextFieldMeasurePolicy$intrinsicHeight$placeholderHeight$1":I
    invoke-static {v13}, Landroidx/compose/material3/internal/TextFieldImplKt;->getLayoutId(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Ljava/lang/Object;

    move-result-object v15

    move-object/from16 v18, v2

    .end local v2    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .local v18, "$this$fastFirstOrNull$iv":Ljava/util/List;
    const-string v2, "Hint"

    invoke-static {v15, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    .line 1356
    .end local v13    # "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .end local v14    # "$i$a$-fastFirstOrNull-OutlinedTextFieldMeasurePolicy$intrinsicHeight$placeholderHeight$1":I
    if-eqz v2, :cond_f

    goto :goto_11

    .line 1360
    .end local v11    # "it$iv":Ljava/lang/Object;
    .end local v12    # "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    :cond_f
    nop

    .line 1358
    .end local v10    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v8, v8, 0x1

    move-object/from16 v2, v18

    goto :goto_10

    .end local v18    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .restart local v2    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    :cond_10
    move-object/from16 v18, v2

    .line 1362
    .end local v2    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .end local v8    # "index$iv$iv":I
    .restart local v18    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    nop

    .line 1363
    .end local v6    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v7    # "$i$f$fastForEach":I
    const/4 v11, 0x0

    .line 906
    .end local v3    # "$i$f$fastFirstOrNull":I
    .end local v18    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    :goto_11
    check-cast v11, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .line 907
    if-eqz v11, :cond_11

    .line 906
    nop

    .line 907
    nop

    .line 1201
    .local v11, "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/4 v2, 0x0

    .line 907
    .local v2, "$i$a$-let-OutlinedTextFieldMeasurePolicy$intrinsicHeight$placeholderHeight$2":I
    invoke-static/range {v29 .. v29}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v1, v11, v3}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v2

    .line 905
    .end local v2    # "$i$a$-let-OutlinedTextFieldMeasurePolicy$intrinsicHeight$placeholderHeight$2":I
    .end local v11    # "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    goto :goto_12

    .line 907
    :cond_11
    const/4 v2, 0x0

    .line 905
    :goto_12
    nop

    .line 904
    nop

    .line 910
    .local v2, "placeholderHeight":I
    nop

    .line 911
    move-object/from16 v3, p2

    .local v3, "$this$fastFirstOrNull$iv":Ljava/util/List;
    const/4 v6, 0x0

    .line 1364
    .local v6, "$i$f$fastFirstOrNull":I
    nop

    .line 1365
    move-object v7, v3

    .local v7, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v8, 0x0

    .line 1366
    .local v8, "$i$f$fastForEach":I
    nop

    .line 1367
    const/4 v9, 0x0

    .restart local v9    # "index$iv$iv":I
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v10

    :goto_13
    if-ge v9, v10, :cond_13

    .line 1368
    invoke-interface {v7, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    .line 1369
    .local v11, "item$iv$iv":Ljava/lang/Object;
    move-object v12, v11

    .local v12, "it$iv":Ljava/lang/Object;
    const/4 v13, 0x0

    .line 1365
    .local v13, "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    move-object v14, v12

    check-cast v14, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .local v14, "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/4 v15, 0x0

    .line 911
    .local v15, "$i$a$-fastFirstOrNull-OutlinedTextFieldMeasurePolicy$intrinsicHeight$supportingHeight$1":I
    move/from16 v18, v2

    .end local v2    # "placeholderHeight":I
    .local v18, "placeholderHeight":I
    invoke-static {v14}, Landroidx/compose/material3/internal/TextFieldImplKt;->getLayoutId(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v23, v3

    .end local v3    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .local v23, "$this$fastFirstOrNull$iv":Ljava/util/List;
    const-string v3, "Supporting"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    .line 1365
    .end local v14    # "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .end local v15    # "$i$a$-fastFirstOrNull-OutlinedTextFieldMeasurePolicy$intrinsicHeight$supportingHeight$1":I
    if-eqz v2, :cond_12

    move-object v9, v12

    goto :goto_14

    .line 1369
    .end local v12    # "it$iv":Ljava/lang/Object;
    .end local v13    # "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    :cond_12
    nop

    .line 1367
    .end local v11    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v9, v9, 0x1

    move/from16 v2, v18

    move-object/from16 v3, v23

    goto :goto_13

    .end local v18    # "placeholderHeight":I
    .end local v23    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .restart local v2    # "placeholderHeight":I
    .restart local v3    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    :cond_13
    move/from16 v18, v2

    move-object/from16 v23, v3

    .line 1371
    .end local v2    # "placeholderHeight":I
    .end local v3    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .end local v9    # "index$iv$iv":I
    .restart local v18    # "placeholderHeight":I
    .restart local v23    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    nop

    .line 1372
    .end local v7    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v8    # "$i$f$fastForEach":I
    const/4 v9, 0x0

    .line 911
    .end local v6    # "$i$f$fastFirstOrNull":I
    .end local v23    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    :goto_14
    check-cast v9, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .line 912
    if-eqz v9, :cond_14

    .line 911
    nop

    .line 912
    nop

    .line 1201
    .local v9, "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/4 v2, 0x0

    .line 912
    .local v2, "$i$a$-let-OutlinedTextFieldMeasurePolicy$intrinsicHeight$supportingHeight$2":I
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v1, v9, v3}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v2

    .line 910
    .end local v2    # "$i$a$-let-OutlinedTextFieldMeasurePolicy$intrinsicHeight$supportingHeight$2":I
    .end local v9    # "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    move/from16 v23, v2

    goto :goto_15

    .line 912
    :cond_14
    const/16 v23, 0x0

    .line 910
    :goto_15
    nop

    .line 909
    nop

    .line 915
    .local v23, "supportingHeight":I
    nop

    .line 916
    nop

    .line 917
    nop

    .line 918
    nop

    .line 919
    nop

    .line 920
    nop

    .line 921
    nop

    .line 922
    nop

    .line 923
    iget v2, v0, Landroidx/compose/material3/OutlinedTextFieldMeasurePolicy;->animationProgress:F

    .line 924
    invoke-static {}, Landroidx/compose/material3/internal/TextFieldImplKt;->getZeroConstraints()J

    move-result-wide v25

    .line 925
    invoke-interface/range {p1 .. p1}, Landroidx/compose/ui/layout/IntrinsicMeasureScope;->getDensity()F

    move-result v27

    .line 926
    iget-object v3, v0, Landroidx/compose/material3/OutlinedTextFieldMeasurePolicy;->paddingValues:Landroidx/compose/foundation/layout/PaddingValues;

    .line 914
    move/from16 v17, v22

    move/from16 v22, v18

    move/from16 v18, v17

    move/from16 v24, v2

    move-object/from16 v28, v3

    move/from16 v17, v19

    move/from16 v19, v4

    .end local v4    # "suffixHeight":I
    .local v17, "trailingHeight":I
    .local v18, "prefixHeight":I
    .local v19, "suffixHeight":I
    .local v22, "placeholderHeight":I
    invoke-static/range {v16 .. v28}, Landroidx/compose/material3/OutlinedTextFieldKt;->access$calculateHeight-mKXJcVc(IIIIIIIIFJFLandroidx/compose/foundation/layout/PaddingValues;)I

    move-result v2

    move/from16 v4, v22

    move/from16 v22, v18

    move/from16 v18, v4

    move/from16 v4, v19

    move/from16 v19, v17

    .end local v17    # "trailingHeight":I
    .restart local v4    # "suffixHeight":I
    .local v18, "placeholderHeight":I
    .local v19, "trailingHeight":I
    .local v22, "prefixHeight":I
    return v2

    .line 1351
    .end local v20    # "textFieldHeight":I
    .end local v23    # "supportingHeight":I
    .local v6, "$i$f$fastFirst":I
    .restart local v7    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .restart local v8    # "$i$f$fastForEach":I
    .local v9, "index$iv$iv":I
    .restart local v11    # "item$iv$iv":Ljava/lang/Object;
    .local v18, "$this$fastFirst$iv":Ljava/util/List;
    :cond_15
    nop

    .line 1349
    .end local v11    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v9, v9, 0x1

    move-object/from16 v3, v18

    move/from16 v2, v29

    goto/16 :goto_f

    .end local v18    # "$this$fastFirst$iv":Ljava/util/List;
    .end local v29    # "remainingWidth":I
    .local v2, "remainingWidth":I
    .local v3, "$this$fastFirst$iv":Ljava/util/List;
    :cond_16
    move/from16 v29, v2

    move-object/from16 v18, v3

    .line 1353
    .end local v2    # "remainingWidth":I
    .end local v3    # "$this$fastFirst$iv":Ljava/util/List;
    .end local v9    # "index$iv$iv":I
    .restart local v18    # "$this$fastFirst$iv":Ljava/util/List;
    .restart local v29    # "remainingWidth":I
    nop

    .line 1354
    .end local v7    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v8    # "$i$f$fastForEach":I
    new-instance v2, Ljava/util/NoSuchElementException;

    const-string v3, "Collection contains no element matching the predicate."

    invoke-direct {v2, v3}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v2
.end method

.method private final intrinsicWidth(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;ILkotlin/jvm/functions/Function2;)I
    .locals 21
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

    .line 806
    move-object/from16 v0, p0

    move-object/from16 v1, p4

    move-object/from16 v2, p2

    .local v2, "$this$fastFirst$iv":Ljava/util/List;
    const/4 v3, 0x0

    .line 1238
    .local v3, "$i$f$fastFirst":I
    nop

    .line 1239
    move-object v4, v2

    .local v4, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v5, 0x0

    .line 1240
    .local v5, "$i$f$fastForEach":I
    nop

    .line 1241
    const/4 v6, 0x0

    .local v6, "index$iv$iv":I
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v7

    :goto_0
    if-ge v6, v7, :cond_13

    .line 1242
    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    .line 1243
    .local v8, "item$iv$iv":Ljava/lang/Object;
    move-object v9, v8

    .local v9, "it$iv":Ljava/lang/Object;
    const/4 v10, 0x0

    .line 1239
    .local v10, "$i$a$-fastForEach-ListUtilsKt$fastFirst$2$iv":I
    move-object v11, v9

    check-cast v11, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .local v11, "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/4 v12, 0x0

    .line 806
    .local v12, "$i$a$-fastFirst-OutlinedTextFieldMeasurePolicy$intrinsicWidth$textFieldWidth$1":I
    invoke-static {v11}, Landroidx/compose/material3/internal/TextFieldImplKt;->getLayoutId(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Ljava/lang/Object;

    move-result-object v13

    const-string v14, "TextField"

    invoke-static {v13, v14}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    .line 1239
    .end local v11    # "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .end local v12    # "$i$a$-fastFirst-OutlinedTextFieldMeasurePolicy$intrinsicWidth$textFieldWidth$1":I
    if-eqz v11, :cond_12

    .line 806
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

    .line 805
    move v7, v2

    .line 808
    .local v7, "textFieldWidth":I
    nop

    .line 809
    move-object/from16 v2, p2

    .local v2, "$this$fastFirstOrNull$iv":Ljava/util/List;
    const/4 v3, 0x0

    .line 1247
    .local v3, "$i$f$fastFirstOrNull":I
    nop

    .line 1248
    move-object v4, v2

    .restart local v4    # "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v5, 0x0

    .line 1249
    .restart local v5    # "$i$f$fastForEach":I
    nop

    .line 1250
    const/4 v6, 0x0

    .restart local v6    # "index$iv$iv":I
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v8

    :goto_1
    if-ge v6, v8, :cond_1

    .line 1251
    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    .line 1252
    .local v10, "item$iv$iv":Ljava/lang/Object;
    move-object v11, v10

    .local v11, "it$iv":Ljava/lang/Object;
    const/4 v12, 0x0

    .line 1248
    .local v12, "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    move-object v13, v11

    check-cast v13, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .local v13, "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/4 v14, 0x0

    .line 809
    .local v14, "$i$a$-fastFirstOrNull-OutlinedTextFieldMeasurePolicy$intrinsicWidth$labelWidth$1":I
    invoke-static {v13}, Landroidx/compose/material3/internal/TextFieldImplKt;->getLayoutId(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Ljava/lang/Object;

    move-result-object v15

    const-string v9, "Label"

    invoke-static {v15, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    .line 1248
    .end local v13    # "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .end local v14    # "$i$a$-fastFirstOrNull-OutlinedTextFieldMeasurePolicy$intrinsicWidth$labelWidth$1":I
    if-eqz v9, :cond_0

    goto :goto_2

    .line 1252
    .end local v11    # "it$iv":Ljava/lang/Object;
    .end local v12    # "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    :cond_0
    nop

    .line 1250
    .end local v10    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 1254
    .end local v6    # "index$iv$iv":I
    :cond_1
    nop

    .line 1255
    .end local v4    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v5    # "$i$f$fastForEach":I
    const/4 v11, 0x0

    .line 809
    .end local v2    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .end local v3    # "$i$f$fastFirstOrNull":I
    :goto_2
    check-cast v11, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .line 810
    if-eqz v11, :cond_2

    .line 809
    nop

    .line 810
    nop

    .line 1201
    .local v11, "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/4 v3, 0x0

    .line 810
    .local v3, "$i$a$-let-OutlinedTextFieldMeasurePolicy$intrinsicWidth$labelWidth$2":I
    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v1, v11, v4}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v3

    .line 808
    .end local v3    # "$i$a$-let-OutlinedTextFieldMeasurePolicy$intrinsicWidth$labelWidth$2":I
    .end local v11    # "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    move v8, v3

    goto :goto_3

    .line 810
    :cond_2
    const/4 v8, 0x0

    .line 808
    :goto_3
    nop

    .line 807
    nop

    .line 812
    .local v8, "labelWidth":I
    nop

    .line 813
    move-object/from16 v3, p2

    .local v3, "$this$fastFirstOrNull$iv":Ljava/util/List;
    const/4 v4, 0x0

    .line 1256
    .local v4, "$i$f$fastFirstOrNull":I
    nop

    .line 1257
    move-object v5, v3

    .local v5, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v6, 0x0

    .line 1258
    .local v6, "$i$f$fastForEach":I
    nop

    .line 1259
    const/4 v9, 0x0

    .local v9, "index$iv$iv":I
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v10

    :goto_4
    if-ge v9, v10, :cond_4

    .line 1260
    invoke-interface {v5, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    .line 1261
    .local v11, "item$iv$iv":Ljava/lang/Object;
    move-object v12, v11

    .local v12, "it$iv":Ljava/lang/Object;
    const/4 v13, 0x0

    .line 1257
    .local v13, "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    move-object v14, v12

    check-cast v14, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .local v14, "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/4 v15, 0x0

    .line 813
    .local v15, "$i$a$-fastFirstOrNull-OutlinedTextFieldMeasurePolicy$intrinsicWidth$trailingWidth$1":I
    invoke-static {v14}, Landroidx/compose/material3/internal/TextFieldImplKt;->getLayoutId(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v16, v3

    .end local v3    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .local v16, "$this$fastFirstOrNull$iv":Ljava/util/List;
    const-string v3, "Trailing"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    .line 1257
    .end local v14    # "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .end local v15    # "$i$a$-fastFirstOrNull-OutlinedTextFieldMeasurePolicy$intrinsicWidth$trailingWidth$1":I
    if-eqz v2, :cond_3

    goto :goto_5

    .line 1261
    .end local v12    # "it$iv":Ljava/lang/Object;
    .end local v13    # "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    :cond_3
    nop

    .line 1259
    .end local v11    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v9, v9, 0x1

    move-object/from16 v3, v16

    goto :goto_4

    .end local v16    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .restart local v3    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    :cond_4
    move-object/from16 v16, v3

    .line 1263
    .end local v3    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .end local v9    # "index$iv$iv":I
    .restart local v16    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    nop

    .line 1264
    .end local v5    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v6    # "$i$f$fastForEach":I
    const/4 v12, 0x0

    .line 813
    .end local v4    # "$i$f$fastFirstOrNull":I
    .end local v16    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    :goto_5
    check-cast v12, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .line 814
    if-eqz v12, :cond_5

    .line 813
    nop

    .line 814
    nop

    .line 1201
    .local v12, "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/4 v2, 0x0

    .line 814
    .local v2, "$i$a$-let-OutlinedTextFieldMeasurePolicy$intrinsicWidth$trailingWidth$2":I
    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v1, v12, v3}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v2

    .line 812
    .end local v2    # "$i$a$-let-OutlinedTextFieldMeasurePolicy$intrinsicWidth$trailingWidth$2":I
    .end local v12    # "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    move v4, v2

    goto :goto_6

    .line 814
    :cond_5
    const/4 v4, 0x0

    .line 812
    :goto_6
    nop

    .line 811
    nop

    .line 816
    .local v4, "trailingWidth":I
    nop

    .line 817
    move-object/from16 v2, p2

    .local v2, "$this$fastFirstOrNull$iv":Ljava/util/List;
    const/4 v3, 0x0

    .line 1265
    .local v3, "$i$f$fastFirstOrNull":I
    nop

    .line 1266
    move-object v5, v2

    .restart local v5    # "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v6, 0x0

    .line 1267
    .restart local v6    # "$i$f$fastForEach":I
    nop

    .line 1268
    const/4 v9, 0x0

    .restart local v9    # "index$iv$iv":I
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v10

    :goto_7
    if-ge v9, v10, :cond_7

    .line 1269
    invoke-interface {v5, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    .line 1270
    .restart local v11    # "item$iv$iv":Ljava/lang/Object;
    move-object v12, v11

    .local v12, "it$iv":Ljava/lang/Object;
    const/4 v13, 0x0

    .line 1266
    .restart local v13    # "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    move-object v14, v12

    check-cast v14, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .restart local v14    # "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/4 v15, 0x0

    .line 817
    .local v15, "$i$a$-fastFirstOrNull-OutlinedTextFieldMeasurePolicy$intrinsicWidth$leadingWidth$1":I
    move-object/from16 v16, v2

    .end local v2    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .restart local v16    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    invoke-static {v14}, Landroidx/compose/material3/internal/TextFieldImplKt;->getLayoutId(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Ljava/lang/Object;

    move-result-object v2

    move/from16 v17, v3

    .end local v3    # "$i$f$fastFirstOrNull":I
    .local v17, "$i$f$fastFirstOrNull":I
    const-string v3, "Leading"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    .line 1266
    .end local v14    # "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .end local v15    # "$i$a$-fastFirstOrNull-OutlinedTextFieldMeasurePolicy$intrinsicWidth$leadingWidth$1":I
    if-eqz v2, :cond_6

    goto :goto_8

    .line 1270
    .end local v12    # "it$iv":Ljava/lang/Object;
    .end local v13    # "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    :cond_6
    nop

    .line 1268
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

    .line 1272
    .end local v2    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .end local v3    # "$i$f$fastFirstOrNull":I
    .end local v9    # "index$iv$iv":I
    .restart local v16    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .restart local v17    # "$i$f$fastFirstOrNull":I
    nop

    .line 1273
    .end local v5    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v6    # "$i$f$fastForEach":I
    const/4 v12, 0x0

    .line 817
    .end local v16    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .end local v17    # "$i$f$fastFirstOrNull":I
    :goto_8
    check-cast v12, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .line 818
    if-eqz v12, :cond_8

    .line 817
    nop

    .line 818
    nop

    .line 1201
    .local v12, "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/4 v2, 0x0

    .line 818
    .local v2, "$i$a$-let-OutlinedTextFieldMeasurePolicy$intrinsicWidth$leadingWidth$2":I
    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v1, v12, v3}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v2

    .line 816
    .end local v2    # "$i$a$-let-OutlinedTextFieldMeasurePolicy$intrinsicWidth$leadingWidth$2":I
    .end local v12    # "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    move v3, v2

    goto :goto_9

    .line 818
    :cond_8
    const/4 v3, 0x0

    .line 816
    :goto_9
    nop

    .line 815
    nop

    .line 820
    .local v3, "leadingWidth":I
    nop

    .line 821
    move-object/from16 v2, p2

    .local v2, "$this$fastFirstOrNull$iv":Ljava/util/List;
    const/4 v5, 0x0

    .line 1274
    .local v5, "$i$f$fastFirstOrNull":I
    nop

    .line 1275
    move-object v6, v2

    .local v6, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v9, 0x0

    .line 1276
    .local v9, "$i$f$fastForEach":I
    nop

    .line 1277
    const/4 v10, 0x0

    .local v10, "index$iv$iv":I
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v11

    :goto_a
    if-ge v10, v11, :cond_a

    .line 1278
    invoke-interface {v6, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    .line 1279
    .local v12, "item$iv$iv":Ljava/lang/Object;
    move-object v13, v12

    .local v13, "it$iv":Ljava/lang/Object;
    const/4 v14, 0x0

    .line 1275
    .local v14, "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    move-object v15, v13

    check-cast v15, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .local v15, "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/16 v16, 0x0

    .line 821
    .local v16, "$i$a$-fastFirstOrNull-OutlinedTextFieldMeasurePolicy$intrinsicWidth$prefixWidth$1":I
    move-object/from16 v17, v2

    .end local v2    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .local v17, "$this$fastFirstOrNull$iv":Ljava/util/List;
    invoke-static {v15}, Landroidx/compose/material3/internal/TextFieldImplKt;->getLayoutId(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Ljava/lang/Object;

    move-result-object v2

    move/from16 v18, v3

    .end local v3    # "leadingWidth":I
    .local v18, "leadingWidth":I
    const-string v3, "Prefix"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    .line 1275
    .end local v15    # "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .end local v16    # "$i$a$-fastFirstOrNull-OutlinedTextFieldMeasurePolicy$intrinsicWidth$prefixWidth$1":I
    if-eqz v2, :cond_9

    goto :goto_b

    .line 1279
    .end local v13    # "it$iv":Ljava/lang/Object;
    .end local v14    # "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    :cond_9
    nop

    .line 1277
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

    .line 1281
    .end local v2    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .end local v3    # "leadingWidth":I
    .end local v10    # "index$iv$iv":I
    .restart local v17    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .restart local v18    # "leadingWidth":I
    nop

    .line 1282
    .end local v6    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v9    # "$i$f$fastForEach":I
    const/4 v13, 0x0

    .line 821
    .end local v5    # "$i$f$fastFirstOrNull":I
    .end local v17    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    :goto_b
    check-cast v13, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .line 822
    if-eqz v13, :cond_b

    .line 821
    nop

    .line 822
    nop

    .line 1201
    .local v13, "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/4 v2, 0x0

    .line 822
    .local v2, "$i$a$-let-OutlinedTextFieldMeasurePolicy$intrinsicWidth$prefixWidth$2":I
    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v1, v13, v3}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v2

    .line 820
    .end local v2    # "$i$a$-let-OutlinedTextFieldMeasurePolicy$intrinsicWidth$prefixWidth$2":I
    .end local v13    # "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    move v5, v2

    goto :goto_c

    .line 822
    :cond_b
    const/4 v5, 0x0

    .line 820
    :goto_c
    nop

    .line 819
    nop

    .line 824
    .local v5, "prefixWidth":I
    nop

    .line 825
    move-object/from16 v2, p2

    .local v2, "$this$fastFirstOrNull$iv":Ljava/util/List;
    const/4 v3, 0x0

    .line 1283
    .local v3, "$i$f$fastFirstOrNull":I
    nop

    .line 1284
    move-object v6, v2

    .restart local v6    # "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v9, 0x0

    .line 1285
    .restart local v9    # "$i$f$fastForEach":I
    nop

    .line 1286
    const/4 v10, 0x0

    .restart local v10    # "index$iv$iv":I
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v11

    :goto_d
    if-ge v10, v11, :cond_d

    .line 1287
    invoke-interface {v6, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    .line 1288
    .restart local v12    # "item$iv$iv":Ljava/lang/Object;
    move-object v13, v12

    .local v13, "it$iv":Ljava/lang/Object;
    const/4 v14, 0x0

    .line 1284
    .restart local v14    # "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    move-object v15, v13

    check-cast v15, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .restart local v15    # "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/16 v16, 0x0

    .line 825
    .local v16, "$i$a$-fastFirstOrNull-OutlinedTextFieldMeasurePolicy$intrinsicWidth$suffixWidth$1":I
    move-object/from16 v17, v2

    .end local v2    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .restart local v17    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    invoke-static {v15}, Landroidx/compose/material3/internal/TextFieldImplKt;->getLayoutId(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Ljava/lang/Object;

    move-result-object v2

    move/from16 v19, v3

    .end local v3    # "$i$f$fastFirstOrNull":I
    .local v19, "$i$f$fastFirstOrNull":I
    const-string v3, "Suffix"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    .line 1284
    .end local v15    # "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .end local v16    # "$i$a$-fastFirstOrNull-OutlinedTextFieldMeasurePolicy$intrinsicWidth$suffixWidth$1":I
    if-eqz v2, :cond_c

    goto :goto_e

    .line 1288
    .end local v13    # "it$iv":Ljava/lang/Object;
    .end local v14    # "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    :cond_c
    nop

    .line 1286
    .end local v12    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v10, v10, 0x1

    move-object/from16 v2, v17

    move/from16 v3, v19

    goto :goto_d

    .end local v17    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .end local v19    # "$i$f$fastFirstOrNull":I
    .restart local v2    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .restart local v3    # "$i$f$fastFirstOrNull":I
    :cond_d
    move-object/from16 v17, v2

    move/from16 v19, v3

    .line 1290
    .end local v2    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .end local v3    # "$i$f$fastFirstOrNull":I
    .end local v10    # "index$iv$iv":I
    .restart local v17    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .restart local v19    # "$i$f$fastFirstOrNull":I
    nop

    .line 1291
    .end local v6    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v9    # "$i$f$fastForEach":I
    const/4 v13, 0x0

    .line 825
    .end local v17    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .end local v19    # "$i$f$fastFirstOrNull":I
    :goto_e
    check-cast v13, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .line 826
    if-eqz v13, :cond_e

    .line 825
    nop

    .line 826
    nop

    .line 1201
    .local v13, "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/4 v2, 0x0

    .line 826
    .local v2, "$i$a$-let-OutlinedTextFieldMeasurePolicy$intrinsicWidth$suffixWidth$2":I
    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v1, v13, v3}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v2

    .line 824
    .end local v2    # "$i$a$-let-OutlinedTextFieldMeasurePolicy$intrinsicWidth$suffixWidth$2":I
    .end local v13    # "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    move v6, v2

    goto :goto_f

    .line 826
    :cond_e
    const/4 v6, 0x0

    .line 824
    :goto_f
    nop

    .line 823
    nop

    .line 828
    .local v6, "suffixWidth":I
    nop

    .line 829
    move-object/from16 v2, p2

    .local v2, "$this$fastFirstOrNull$iv":Ljava/util/List;
    const/4 v3, 0x0

    .line 1292
    .restart local v3    # "$i$f$fastFirstOrNull":I
    nop

    .line 1293
    move-object v9, v2

    .local v9, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v10, 0x0

    .line 1294
    .local v10, "$i$f$fastForEach":I
    nop

    .line 1295
    const/4 v11, 0x0

    .local v11, "index$iv$iv":I
    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v12

    :goto_10
    if-ge v11, v12, :cond_10

    .line 1296
    invoke-interface {v9, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    .line 1297
    .local v13, "item$iv$iv":Ljava/lang/Object;
    move-object v14, v13

    .local v14, "it$iv":Ljava/lang/Object;
    const/4 v15, 0x0

    .line 1293
    .local v15, "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    move-object/from16 v16, v14

    check-cast v16, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .local v16, "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/16 v17, 0x0

    .line 829
    .local v17, "$i$a$-fastFirstOrNull-OutlinedTextFieldMeasurePolicy$intrinsicWidth$placeholderWidth$1":I
    move-object/from16 v19, v2

    .end local v2    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .local v19, "$this$fastFirstOrNull$iv":Ljava/util/List;
    invoke-static/range {v16 .. v16}, Landroidx/compose/material3/internal/TextFieldImplKt;->getLayoutId(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Ljava/lang/Object;

    move-result-object v2

    move/from16 v20, v3

    .end local v3    # "$i$f$fastFirstOrNull":I
    .local v20, "$i$f$fastFirstOrNull":I
    const-string v3, "Hint"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    .line 1293
    .end local v16    # "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .end local v17    # "$i$a$-fastFirstOrNull-OutlinedTextFieldMeasurePolicy$intrinsicWidth$placeholderWidth$1":I
    if-eqz v2, :cond_f

    move-object v9, v14

    goto :goto_11

    .line 1297
    .end local v14    # "it$iv":Ljava/lang/Object;
    .end local v15    # "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    :cond_f
    nop

    .line 1295
    .end local v13    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v11, v11, 0x1

    move-object/from16 v2, v19

    move/from16 v3, v20

    goto :goto_10

    .end local v19    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .end local v20    # "$i$f$fastFirstOrNull":I
    .restart local v2    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .restart local v3    # "$i$f$fastFirstOrNull":I
    :cond_10
    move-object/from16 v19, v2

    move/from16 v20, v3

    .line 1299
    .end local v2    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .end local v3    # "$i$f$fastFirstOrNull":I
    .end local v11    # "index$iv$iv":I
    .restart local v19    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .restart local v20    # "$i$f$fastFirstOrNull":I
    nop

    .line 1300
    .end local v9    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v10    # "$i$f$fastForEach":I
    const/4 v9, 0x0

    .line 829
    .end local v19    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .end local v20    # "$i$f$fastFirstOrNull":I
    :goto_11
    check-cast v9, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .line 830
    if-eqz v9, :cond_11

    .line 829
    nop

    .line 830
    nop

    .line 1201
    .local v9, "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/4 v2, 0x0

    .line 830
    .local v2, "$i$a$-let-OutlinedTextFieldMeasurePolicy$intrinsicWidth$placeholderWidth$2":I
    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v1, v9, v3}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v2

    .line 828
    .end local v2    # "$i$a$-let-OutlinedTextFieldMeasurePolicy$intrinsicWidth$placeholderWidth$2":I
    .end local v9    # "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    move v9, v2

    goto :goto_12

    .line 830
    :cond_11
    const/4 v9, 0x0

    .line 828
    :goto_12
    nop

    .line 827
    nop

    .line 832
    .local v9, "placeholderWidth":I
    nop

    .line 833
    nop

    .line 834
    nop

    .line 835
    nop

    .line 836
    nop

    .line 837
    nop

    .line 838
    nop

    .line 839
    iget v10, v0, Landroidx/compose/material3/OutlinedTextFieldMeasurePolicy;->animationProgress:F

    .line 840
    invoke-static {}, Landroidx/compose/material3/internal/TextFieldImplKt;->getZeroConstraints()J

    move-result-wide v11

    .line 841
    invoke-interface/range {p1 .. p1}, Landroidx/compose/ui/layout/IntrinsicMeasureScope;->getDensity()F

    move-result v13

    .line 842
    iget-object v14, v0, Landroidx/compose/material3/OutlinedTextFieldMeasurePolicy;->paddingValues:Landroidx/compose/foundation/layout/PaddingValues;

    .line 831
    move/from16 v3, v18

    .end local v18    # "leadingWidth":I
    .local v3, "leadingWidth":I
    invoke-static/range {v3 .. v14}, Landroidx/compose/material3/OutlinedTextFieldKt;->access$calculateWidth-DHJA7U0(IIIIIIIFJFLandroidx/compose/foundation/layout/PaddingValues;)I

    move-result v2

    return v2

    .line 1243
    .end local v7    # "textFieldWidth":I
    .end local v9    # "placeholderWidth":I
    .local v2, "$this$fastFirst$iv":Ljava/util/List;
    .local v3, "$i$f$fastFirst":I
    .local v4, "$this$fastForEach$iv$iv":Ljava/util/List;
    .local v5, "$i$f$fastForEach":I
    .local v6, "index$iv$iv":I
    .local v8, "item$iv$iv":Ljava/lang/Object;
    :cond_12
    nop

    .line 1241
    .end local v8    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_0

    .line 1245
    .end local v6    # "index$iv$iv":I
    :cond_13
    nop

    .line 1246
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

    .line 768
    sget-object v0, Landroidx/compose/material3/OutlinedTextFieldMeasurePolicy$maxIntrinsicHeight$1;->INSTANCE:Landroidx/compose/material3/OutlinedTextFieldMeasurePolicy$maxIntrinsicHeight$1;

    check-cast v0, Lkotlin/jvm/functions/Function2;

    invoke-direct {p0, p1, p2, p3, v0}, Landroidx/compose/material3/OutlinedTextFieldMeasurePolicy;->intrinsicHeight(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;ILkotlin/jvm/functions/Function2;)I

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

    .line 786
    sget-object v0, Landroidx/compose/material3/OutlinedTextFieldMeasurePolicy$maxIntrinsicWidth$1;->INSTANCE:Landroidx/compose/material3/OutlinedTextFieldMeasurePolicy$maxIntrinsicWidth$1;

    check-cast v0, Lkotlin/jvm/functions/Function2;

    invoke-direct {p0, p1, p2, p3, v0}, Landroidx/compose/material3/OutlinedTextFieldMeasurePolicy;->intrinsicWidth(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;ILkotlin/jvm/functions/Function2;)I

    move-result v0

    return v0
.end method

.method public measure-3p2s80s(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;
    .locals 49
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

    .line 600
    move-object/from16 v12, p0

    move-object/from16 v13, p1

    const/4 v0, 0x0

    .line 601
    .local v0, "occupiedSpaceHorizontally":I
    const/4 v1, 0x0

    .line 602
    .local v1, "occupiedSpaceVertically":I
    iget-object v2, v12, Landroidx/compose/material3/OutlinedTextFieldMeasurePolicy;->paddingValues:Landroidx/compose/foundation/layout/PaddingValues;

    invoke-interface {v2}, Landroidx/compose/foundation/layout/PaddingValues;->calculateBottomPadding-D9Ej5fM()F

    move-result v2

    invoke-interface {v13, v2}, Landroidx/compose/ui/layout/MeasureScope;->roundToPx-0680j_4(F)I

    move-result v14

    .line 604
    .local v14, "bottomPadding":I
    const/16 v8, 0xa

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-wide/from16 v2, p3

    invoke-static/range {v2 .. v9}, Landroidx/compose/ui/unit/Constraints;->copy-Zbe2FdA$default(JIIIIILjava/lang/Object;)J

    move-result-wide v4

    .line 608
    .local v4, "relaxedConstraints":J
    move-object/from16 v2, p2

    .local v2, "$this$fastFirstOrNull$iv":Ljava/util/List;
    const/4 v3, 0x0

    .line 1156
    .local v3, "$i$f$fastFirstOrNull":I
    nop

    .line 1157
    move-object v6, v2

    .local v6, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v7, 0x0

    .line 1158
    .local v7, "$i$f$fastForEach":I
    nop

    .line 1159
    const/4 v8, 0x0

    .local v8, "index$iv$iv":I
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v9

    :goto_0
    if-ge v8, v9, :cond_1

    .line 1160
    invoke-interface {v6, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    .line 1161
    .local v11, "item$iv$iv":Ljava/lang/Object;
    move-object v15, v11

    .local v15, "it$iv":Ljava/lang/Object;
    const/16 v16, 0x0

    .line 1157
    .local v16, "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    move-object/from16 v17, v15

    check-cast v17, Landroidx/compose/ui/layout/Measurable;

    .local v17, "it":Landroidx/compose/ui/layout/Measurable;
    const/16 v18, 0x0

    .line 608
    .local v18, "$i$a$-fastFirstOrNull-OutlinedTextFieldMeasurePolicy$measure$leadingPlaceable$1":I
    invoke-static/range {v17 .. v17}, Landroidx/compose/ui/layout/LayoutIdKt;->getLayoutId(Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;

    move-result-object v10

    move/from16 v19, v0

    .end local v0    # "occupiedSpaceHorizontally":I
    .local v19, "occupiedSpaceHorizontally":I
    const-string v0, "Leading"

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    .line 1157
    .end local v17    # "it":Landroidx/compose/ui/layout/Measurable;
    .end local v18    # "$i$a$-fastFirstOrNull-OutlinedTextFieldMeasurePolicy$measure$leadingPlaceable$1":I
    if-eqz v0, :cond_0

    goto :goto_1

    .line 1161
    .end local v15    # "it$iv":Ljava/lang/Object;
    .end local v16    # "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    :cond_0
    nop

    .line 1159
    .end local v11    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v8, v8, 0x1

    move/from16 v0, v19

    goto :goto_0

    .end local v19    # "occupiedSpaceHorizontally":I
    .restart local v0    # "occupiedSpaceHorizontally":I
    :cond_1
    move/from16 v19, v0

    .line 1163
    .end local v0    # "occupiedSpaceHorizontally":I
    .end local v8    # "index$iv$iv":I
    .restart local v19    # "occupiedSpaceHorizontally":I
    nop

    .line 1164
    .end local v6    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v7    # "$i$f$fastForEach":I
    const/4 v15, 0x0

    .line 608
    .end local v2    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .end local v3    # "$i$f$fastFirstOrNull":I
    :goto_1
    check-cast v15, Landroidx/compose/ui/layout/Measurable;

    if-eqz v15, :cond_2

    invoke-interface {v15, v4, v5}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    move-result-object v0

    move-object v3, v0

    goto :goto_2

    :cond_2
    const/4 v3, 0x0

    .line 607
    :goto_2
    nop

    .line 609
    .local v3, "leadingPlaceable":Landroidx/compose/ui/layout/Placeable;
    invoke-static {v3}, Landroidx/compose/material3/internal/TextFieldImplKt;->widthOrZero(Landroidx/compose/ui/layout/Placeable;)I

    move-result v0

    add-int v0, v19, v0

    .line 610
    .end local v19    # "occupiedSpaceHorizontally":I
    .restart local v0    # "occupiedSpaceHorizontally":I
    invoke-static {v3}, Landroidx/compose/material3/internal/TextFieldImplKt;->heightOrZero(Landroidx/compose/ui/layout/Placeable;)I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 616
    nop

    .line 614
    nop

    .line 615
    move-object/from16 v2, p2

    .restart local v2    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    const/4 v6, 0x0

    .line 1165
    .local v6, "$i$f$fastFirstOrNull":I
    nop

    .line 1166
    move-object v7, v2

    .local v7, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v8, 0x0

    .line 1167
    .local v8, "$i$f$fastForEach":I
    nop

    .line 1168
    const/4 v9, 0x0

    .local v9, "index$iv$iv":I
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v10

    :goto_3
    if-ge v9, v10, :cond_4

    .line 1169
    invoke-interface {v7, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    .line 1170
    .restart local v11    # "item$iv$iv":Ljava/lang/Object;
    move-object v15, v11

    .restart local v15    # "it$iv":Ljava/lang/Object;
    const/16 v16, 0x0

    .line 1166
    .restart local v16    # "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    move-object/from16 v17, v15

    check-cast v17, Landroidx/compose/ui/layout/Measurable;

    .restart local v17    # "it":Landroidx/compose/ui/layout/Measurable;
    const/16 v18, 0x0

    .line 615
    .local v18, "$i$a$-fastFirstOrNull-OutlinedTextFieldMeasurePolicy$measure$trailingPlaceable$1":I
    move-object/from16 v19, v2

    .end local v2    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .local v19, "$this$fastFirstOrNull$iv":Ljava/util/List;
    invoke-static/range {v17 .. v17}, Landroidx/compose/ui/layout/LayoutIdKt;->getLayoutId(Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v28, v3

    .end local v3    # "leadingPlaceable":Landroidx/compose/ui/layout/Placeable;
    .local v28, "leadingPlaceable":Landroidx/compose/ui/layout/Placeable;
    const-string v3, "Trailing"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    .line 1166
    .end local v17    # "it":Landroidx/compose/ui/layout/Measurable;
    .end local v18    # "$i$a$-fastFirstOrNull-OutlinedTextFieldMeasurePolicy$measure$trailingPlaceable$1":I
    if-eqz v2, :cond_3

    goto :goto_4

    .line 1170
    .end local v15    # "it$iv":Ljava/lang/Object;
    .end local v16    # "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    :cond_3
    nop

    .line 1168
    .end local v11    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v9, v9, 0x1

    move-object/from16 v2, v19

    move-object/from16 v3, v28

    goto :goto_3

    .end local v19    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .end local v28    # "leadingPlaceable":Landroidx/compose/ui/layout/Placeable;
    .restart local v2    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .restart local v3    # "leadingPlaceable":Landroidx/compose/ui/layout/Placeable;
    :cond_4
    move-object/from16 v19, v2

    move-object/from16 v28, v3

    .line 1172
    .end local v2    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .end local v3    # "leadingPlaceable":Landroidx/compose/ui/layout/Placeable;
    .end local v9    # "index$iv$iv":I
    .restart local v19    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .restart local v28    # "leadingPlaceable":Landroidx/compose/ui/layout/Placeable;
    nop

    .line 1173
    .end local v7    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v8    # "$i$f$fastForEach":I
    const/4 v15, 0x0

    .line 615
    .end local v6    # "$i$f$fastFirstOrNull":I
    .end local v19    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    :goto_4
    move-object v2, v15

    check-cast v2, Landroidx/compose/ui/layout/Measurable;

    .line 616
    if-eqz v2, :cond_5

    .line 615
    nop

    .line 616
    neg-int v3, v0

    const/16 v19, 0x2

    const/16 v20, 0x0

    const/16 v18, 0x0

    move/from16 v17, v3

    move-wide v15, v4

    .end local v4    # "relaxedConstraints":J
    .local v15, "relaxedConstraints":J
    invoke-static/range {v15 .. v20}, Landroidx/compose/ui/unit/ConstraintsKt;->offset-NN6Ew-U$default(JIIILjava/lang/Object;)J

    move-result-wide v3

    invoke-interface {v2, v3, v4}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    move-result-object v2

    move-object v4, v2

    goto :goto_5

    .end local v15    # "relaxedConstraints":J
    .restart local v4    # "relaxedConstraints":J
    :cond_5
    move-wide v15, v4

    .end local v4    # "relaxedConstraints":J
    .restart local v15    # "relaxedConstraints":J
    const/4 v4, 0x0

    .line 613
    :goto_5
    nop

    .line 617
    .local v4, "trailingPlaceable":Landroidx/compose/ui/layout/Placeable;
    invoke-static {v4}, Landroidx/compose/material3/internal/TextFieldImplKt;->widthOrZero(Landroidx/compose/ui/layout/Placeable;)I

    move-result v2

    add-int/2addr v0, v2

    .line 618
    invoke-static {v4}, Landroidx/compose/material3/internal/TextFieldImplKt;->heightOrZero(Landroidx/compose/ui/layout/Placeable;)I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 624
    nop

    .line 622
    nop

    .line 623
    move-object/from16 v2, p2

    .restart local v2    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    const/4 v3, 0x0

    .line 1174
    .local v3, "$i$f$fastFirstOrNull":I
    nop

    .line 1175
    move-object v5, v2

    .local v5, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v6, 0x0

    .line 1176
    .local v6, "$i$f$fastForEach":I
    nop

    .line 1177
    const/4 v7, 0x0

    .local v7, "index$iv$iv":I
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v8

    :goto_6
    if-ge v7, v8, :cond_7

    .line 1178
    invoke-interface {v5, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    .line 1179
    .local v9, "item$iv$iv":Ljava/lang/Object;
    move-object v10, v9

    .local v10, "it$iv":Ljava/lang/Object;
    const/4 v11, 0x0

    .line 1175
    .local v11, "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    move-object/from16 v17, v10

    check-cast v17, Landroidx/compose/ui/layout/Measurable;

    .restart local v17    # "it":Landroidx/compose/ui/layout/Measurable;
    const/16 v18, 0x0

    .line 623
    .local v18, "$i$a$-fastFirstOrNull-OutlinedTextFieldMeasurePolicy$measure$prefixPlaceable$1":I
    move-object/from16 v19, v2

    .end local v2    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .restart local v19    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    invoke-static/range {v17 .. v17}, Landroidx/compose/ui/layout/LayoutIdKt;->getLayoutId(Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;

    move-result-object v2

    move/from16 v20, v3

    .end local v3    # "$i$f$fastFirstOrNull":I
    .local v20, "$i$f$fastFirstOrNull":I
    const-string v3, "Prefix"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    .line 1175
    .end local v17    # "it":Landroidx/compose/ui/layout/Measurable;
    .end local v18    # "$i$a$-fastFirstOrNull-OutlinedTextFieldMeasurePolicy$measure$prefixPlaceable$1":I
    if-eqz v2, :cond_6

    goto :goto_7

    .line 1179
    .end local v10    # "it$iv":Ljava/lang/Object;
    .end local v11    # "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    :cond_6
    nop

    .line 1177
    .end local v9    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v7, v7, 0x1

    move-object/from16 v2, v19

    move/from16 v3, v20

    goto :goto_6

    .end local v19    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .end local v20    # "$i$f$fastFirstOrNull":I
    .restart local v2    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .restart local v3    # "$i$f$fastFirstOrNull":I
    :cond_7
    move-object/from16 v19, v2

    move/from16 v20, v3

    .line 1181
    .end local v2    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .end local v3    # "$i$f$fastFirstOrNull":I
    .end local v7    # "index$iv$iv":I
    .restart local v19    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .restart local v20    # "$i$f$fastFirstOrNull":I
    nop

    .line 1182
    .end local v5    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v6    # "$i$f$fastForEach":I
    const/4 v10, 0x0

    .line 623
    .end local v19    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .end local v20    # "$i$f$fastFirstOrNull":I
    :goto_7
    check-cast v10, Landroidx/compose/ui/layout/Measurable;

    .line 624
    if-eqz v10, :cond_8

    .line 623
    nop

    .line 624
    neg-int v2, v0

    const/16 v19, 0x2

    const/16 v20, 0x0

    const/16 v18, 0x0

    move/from16 v17, v2

    invoke-static/range {v15 .. v20}, Landroidx/compose/ui/unit/ConstraintsKt;->offset-NN6Ew-U$default(JIIILjava/lang/Object;)J

    move-result-wide v2

    invoke-interface {v10, v2, v3}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    move-result-object v2

    move-object v5, v2

    goto :goto_8

    :cond_8
    const/4 v5, 0x0

    .line 621
    :goto_8
    nop

    .line 625
    .local v5, "prefixPlaceable":Landroidx/compose/ui/layout/Placeable;
    invoke-static {v5}, Landroidx/compose/material3/internal/TextFieldImplKt;->widthOrZero(Landroidx/compose/ui/layout/Placeable;)I

    move-result v2

    add-int/2addr v0, v2

    .line 626
    invoke-static {v5}, Landroidx/compose/material3/internal/TextFieldImplKt;->heightOrZero(Landroidx/compose/ui/layout/Placeable;)I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 632
    nop

    .line 630
    nop

    .line 631
    move-object/from16 v2, p2

    .restart local v2    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    const/4 v3, 0x0

    .line 1183
    .restart local v3    # "$i$f$fastFirstOrNull":I
    nop

    .line 1184
    move-object v6, v2

    .local v6, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v7, 0x0

    .line 1185
    .local v7, "$i$f$fastForEach":I
    nop

    .line 1186
    const/4 v8, 0x0

    .local v8, "index$iv$iv":I
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v9

    :goto_9
    if-ge v8, v9, :cond_a

    .line 1187
    invoke-interface {v6, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    .line 1188
    .local v10, "item$iv$iv":Ljava/lang/Object;
    move-object v11, v10

    .local v11, "it$iv":Ljava/lang/Object;
    const/16 v17, 0x0

    .line 1184
    .local v17, "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    move-object/from16 v18, v11

    check-cast v18, Landroidx/compose/ui/layout/Measurable;

    .local v18, "it":Landroidx/compose/ui/layout/Measurable;
    const/16 v19, 0x0

    .line 631
    .local v19, "$i$a$-fastFirstOrNull-OutlinedTextFieldMeasurePolicy$measure$suffixPlaceable$1":I
    move-object/from16 v20, v2

    .end local v2    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .local v20, "$this$fastFirstOrNull$iv":Ljava/util/List;
    invoke-static/range {v18 .. v18}, Landroidx/compose/ui/layout/LayoutIdKt;->getLayoutId(Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;

    move-result-object v2

    move/from16 v21, v3

    .end local v3    # "$i$f$fastFirstOrNull":I
    .local v21, "$i$f$fastFirstOrNull":I
    const-string v3, "Suffix"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    .line 1184
    .end local v18    # "it":Landroidx/compose/ui/layout/Measurable;
    .end local v19    # "$i$a$-fastFirstOrNull-OutlinedTextFieldMeasurePolicy$measure$suffixPlaceable$1":I
    if-eqz v2, :cond_9

    goto :goto_a

    .line 1188
    .end local v11    # "it$iv":Ljava/lang/Object;
    .end local v17    # "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    :cond_9
    nop

    .line 1186
    .end local v10    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v8, v8, 0x1

    move-object/from16 v2, v20

    move/from16 v3, v21

    goto :goto_9

    .end local v20    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .end local v21    # "$i$f$fastFirstOrNull":I
    .restart local v2    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .restart local v3    # "$i$f$fastFirstOrNull":I
    :cond_a
    move-object/from16 v20, v2

    move/from16 v21, v3

    .line 1190
    .end local v2    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .end local v3    # "$i$f$fastFirstOrNull":I
    .end local v8    # "index$iv$iv":I
    .restart local v20    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .restart local v21    # "$i$f$fastFirstOrNull":I
    nop

    .line 1191
    .end local v6    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v7    # "$i$f$fastForEach":I
    const/4 v11, 0x0

    .line 631
    .end local v20    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .end local v21    # "$i$f$fastFirstOrNull":I
    :goto_a
    check-cast v11, Landroidx/compose/ui/layout/Measurable;

    .line 632
    if-eqz v11, :cond_b

    .line 631
    nop

    .line 632
    neg-int v2, v0

    const/16 v19, 0x2

    const/16 v20, 0x0

    const/16 v18, 0x0

    move/from16 v17, v2

    invoke-static/range {v15 .. v20}, Landroidx/compose/ui/unit/ConstraintsKt;->offset-NN6Ew-U$default(JIIILjava/lang/Object;)J

    move-result-wide v2

    move-wide v6, v15

    .end local v15    # "relaxedConstraints":J
    .local v6, "relaxedConstraints":J
    invoke-interface {v11, v2, v3}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    move-result-object v2

    goto :goto_b

    .end local v6    # "relaxedConstraints":J
    .restart local v15    # "relaxedConstraints":J
    :cond_b
    move-wide v6, v15

    .end local v15    # "relaxedConstraints":J
    .restart local v6    # "relaxedConstraints":J
    const/4 v2, 0x0

    .line 629
    :goto_b
    nop

    .line 633
    .local v2, "suffixPlaceable":Landroidx/compose/ui/layout/Placeable;
    invoke-static {v2}, Landroidx/compose/material3/internal/TextFieldImplKt;->widthOrZero(Landroidx/compose/ui/layout/Placeable;)I

    move-result v3

    add-int/2addr v0, v3

    .line 634
    invoke-static {v2}, Landroidx/compose/material3/internal/TextFieldImplKt;->heightOrZero(Landroidx/compose/ui/layout/Placeable;)I

    move-result v3

    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 638
    iget-object v3, v12, Landroidx/compose/material3/OutlinedTextFieldMeasurePolicy;->paddingValues:Landroidx/compose/foundation/layout/PaddingValues;

    invoke-interface {v13}, Landroidx/compose/ui/layout/MeasureScope;->getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;

    move-result-object v8

    invoke-interface {v3, v8}, Landroidx/compose/foundation/layout/PaddingValues;->calculateLeftPadding-u2uoSUM(Landroidx/compose/ui/unit/LayoutDirection;)F

    move-result v3

    invoke-interface {v13, v3}, Landroidx/compose/ui/layout/MeasureScope;->roundToPx-0680j_4(F)I

    move-result v3

    .line 639
    iget-object v8, v12, Landroidx/compose/material3/OutlinedTextFieldMeasurePolicy;->paddingValues:Landroidx/compose/foundation/layout/PaddingValues;

    invoke-interface {v13}, Landroidx/compose/ui/layout/MeasureScope;->getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;

    move-result-object v9

    invoke-interface {v8, v9}, Landroidx/compose/foundation/layout/PaddingValues;->calculateRightPadding-u2uoSUM(Landroidx/compose/ui/unit/LayoutDirection;)F

    move-result v8

    invoke-interface {v13, v8}, Landroidx/compose/ui/layout/MeasureScope;->roundToPx-0680j_4(F)I

    move-result v8

    .line 638
    add-int/2addr v3, v8

    .line 637
    nop

    .line 641
    .local v3, "labelHorizontalPaddingOffset":I
    nop

    .line 644
    neg-int v8, v0

    .line 645
    nop

    .line 644
    sub-int/2addr v8, v3

    .line 646
    neg-int v9, v3

    .line 647
    iget v10, v12, Landroidx/compose/material3/OutlinedTextFieldMeasurePolicy;->animationProgress:F

    .line 643
    invoke-static {v8, v9, v10}, Landroidx/compose/ui/util/MathHelpersKt;->lerp(IIF)I

    move-result v8

    .line 649
    neg-int v9, v14

    .line 641
    invoke-static {v6, v7, v8, v9}, Landroidx/compose/ui/unit/ConstraintsKt;->offset-NN6Ew-U(JII)J

    move-result-wide v8

    .line 640
    nop

    .line 652
    .local v8, "labelConstraints":J
    move-object/from16 v10, p2

    .local v10, "$this$fastFirstOrNull$iv":Ljava/util/List;
    const/4 v11, 0x0

    .line 1192
    .local v11, "$i$f$fastFirstOrNull":I
    nop

    .line 1193
    move-object v15, v10

    .local v15, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/16 v16, 0x0

    .line 1194
    .local v16, "$i$f$fastForEach":I
    nop

    .line 1195
    const/16 v17, 0x0

    move-object/from16 v29, v2

    .end local v2    # "suffixPlaceable":Landroidx/compose/ui/layout/Placeable;
    .local v17, "index$iv$iv":I
    .local v29, "suffixPlaceable":Landroidx/compose/ui/layout/Placeable;
    invoke-interface {v15}, Ljava/util/List;->size()I

    move-result v2

    move/from16 v30, v3

    move/from16 v3, v17

    .end local v17    # "index$iv$iv":I
    .local v3, "index$iv$iv":I
    .local v30, "labelHorizontalPaddingOffset":I
    :goto_c
    if-ge v3, v2, :cond_d

    .line 1196
    invoke-interface {v15, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v17

    .line 1197
    .local v17, "item$iv$iv":Ljava/lang/Object;
    move-object/from16 v18, v17

    .local v18, "it$iv":Ljava/lang/Object;
    const/16 v19, 0x0

    .line 1193
    .local v19, "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    move-object/from16 v20, v18

    check-cast v20, Landroidx/compose/ui/layout/Measurable;

    .local v20, "it":Landroidx/compose/ui/layout/Measurable;
    const/16 v21, 0x0

    .line 652
    .local v21, "$i$a$-fastFirstOrNull-OutlinedTextFieldMeasurePolicy$measure$labelPlaceable$1":I
    move/from16 v22, v2

    invoke-static/range {v20 .. v20}, Landroidx/compose/ui/layout/LayoutIdKt;->getLayoutId(Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;

    move-result-object v2

    move/from16 v23, v3

    .end local v3    # "index$iv$iv":I
    .local v23, "index$iv$iv":I
    const-string v3, "Label"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    .line 1193
    .end local v20    # "it":Landroidx/compose/ui/layout/Measurable;
    .end local v21    # "$i$a$-fastFirstOrNull-OutlinedTextFieldMeasurePolicy$measure$labelPlaceable$1":I
    if-eqz v2, :cond_c

    goto :goto_d

    .line 1197
    .end local v18    # "it$iv":Ljava/lang/Object;
    .end local v19    # "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    :cond_c
    nop

    .line 1195
    .end local v17    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v3, v23, 0x1

    move/from16 v2, v22

    .end local v23    # "index$iv$iv":I
    .restart local v3    # "index$iv$iv":I
    goto :goto_c

    :cond_d
    move/from16 v23, v3

    .line 1199
    .end local v3    # "index$iv$iv":I
    nop

    .line 1200
    .end local v15    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v16    # "$i$f$fastForEach":I
    const/16 v18, 0x0

    .line 652
    .end local v10    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .end local v11    # "$i$f$fastFirstOrNull":I
    :goto_d
    move-object/from16 v2, v18

    check-cast v2, Landroidx/compose/ui/layout/Measurable;

    if-eqz v2, :cond_e

    invoke-interface {v2, v8, v9}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    move-result-object v2

    goto :goto_e

    :cond_e
    const/4 v2, 0x0

    .line 651
    :goto_e
    nop

    .line 654
    .local v2, "labelPlaceable":Landroidx/compose/ui/layout/Placeable;
    if-eqz v2, :cond_f

    move-object v3, v2

    .line 1201
    .local v3, "it":Landroidx/compose/ui/layout/Placeable;
    const/4 v10, 0x0

    .line 654
    .local v10, "$i$a$-let-OutlinedTextFieldMeasurePolicy$measure$labelSize$1":I
    invoke-virtual {v3}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    move-result v11

    int-to-float v11, v11

    invoke-virtual {v3}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    move-result v15

    int-to-float v15, v15

    invoke-static {v11, v15}, Landroidx/compose/ui/geometry/SizeKt;->Size(FF)J

    move-result-wide v10

    .end local v3    # "it":Landroidx/compose/ui/layout/Placeable;
    .end local v10    # "$i$a$-let-OutlinedTextFieldMeasurePolicy$measure$labelSize$1":I
    goto :goto_f

    :cond_f
    sget-object v3, Landroidx/compose/ui/geometry/Size;->Companion:Landroidx/compose/ui/geometry/Size$Companion;

    invoke-virtual {v3}, Landroidx/compose/ui/geometry/Size$Companion;->getZero-NH-jbRc()J

    move-result-wide v10

    .line 653
    :goto_f
    move-wide/from16 v31, v10

    .line 655
    .local v31, "labelSize":J
    iget-object v3, v12, Landroidx/compose/material3/OutlinedTextFieldMeasurePolicy;->onLabelMeasured:Lkotlin/jvm/functions/Function1;

    invoke-static/range {v31 .. v32}, Landroidx/compose/ui/geometry/Size;->box-impl(J)Landroidx/compose/ui/geometry/Size;

    move-result-object v10

    invoke-interface {v3, v10}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 659
    move-object/from16 v3, p2

    .local v3, "$this$fastFirstOrNull$iv":Ljava/util/List;
    const/4 v10, 0x0

    .line 1202
    .local v10, "$i$f$fastFirstOrNull":I
    nop

    .line 1203
    move-object v11, v3

    .local v11, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v15, 0x0

    .line 1204
    .local v15, "$i$f$fastForEach":I
    nop

    .line 1205
    const/16 v16, 0x0

    move-object/from16 v33, v2

    .end local v2    # "labelPlaceable":Landroidx/compose/ui/layout/Placeable;
    .local v16, "index$iv$iv":I
    .local v33, "labelPlaceable":Landroidx/compose/ui/layout/Placeable;
    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v2

    move-object/from16 v17, v3

    move/from16 v3, v16

    .end local v16    # "index$iv$iv":I
    .local v3, "index$iv$iv":I
    .local v17, "$this$fastFirstOrNull$iv":Ljava/util/List;
    :goto_10
    if-ge v3, v2, :cond_11

    .line 1206
    invoke-interface {v11, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v16

    .line 1207
    .local v16, "item$iv$iv":Ljava/lang/Object;
    move-object/from16 v18, v16

    .restart local v18    # "it$iv":Ljava/lang/Object;
    const/16 v19, 0x0

    .line 1203
    .restart local v19    # "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    move-object/from16 v20, v18

    check-cast v20, Landroidx/compose/ui/layout/Measurable;

    .restart local v20    # "it":Landroidx/compose/ui/layout/Measurable;
    const/16 v21, 0x0

    .line 659
    .local v21, "$i$a$-fastFirstOrNull-OutlinedTextFieldMeasurePolicy$measure$supportingMeasurable$1":I
    move/from16 v22, v2

    invoke-static/range {v20 .. v20}, Landroidx/compose/ui/layout/LayoutIdKt;->getLayoutId(Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;

    move-result-object v2

    move/from16 v23, v3

    .end local v3    # "index$iv$iv":I
    .restart local v23    # "index$iv$iv":I
    const-string v3, "Supporting"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    .line 1203
    .end local v20    # "it":Landroidx/compose/ui/layout/Measurable;
    .end local v21    # "$i$a$-fastFirstOrNull-OutlinedTextFieldMeasurePolicy$measure$supportingMeasurable$1":I
    if-eqz v2, :cond_10

    goto :goto_11

    .line 1207
    .end local v18    # "it$iv":Ljava/lang/Object;
    .end local v19    # "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    :cond_10
    nop

    .line 1205
    .end local v16    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v3, v23, 0x1

    move/from16 v2, v22

    .end local v23    # "index$iv$iv":I
    .restart local v3    # "index$iv$iv":I
    goto :goto_10

    :cond_11
    move/from16 v23, v3

    .line 1209
    .end local v3    # "index$iv$iv":I
    nop

    .line 1210
    .end local v11    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v15    # "$i$f$fastForEach":I
    const/16 v18, 0x0

    .line 659
    .end local v10    # "$i$f$fastFirstOrNull":I
    .end local v17    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    :goto_11
    move-object/from16 v2, v18

    check-cast v2, Landroidx/compose/ui/layout/Measurable;

    .line 661
    .local v2, "supportingMeasurable":Landroidx/compose/ui/layout/Measurable;
    if-eqz v2, :cond_12

    invoke-static/range {p3 .. p4}, Landroidx/compose/ui/unit/Constraints;->getMinWidth-impl(J)I

    move-result v10

    invoke-interface {v2, v10}, Landroidx/compose/ui/layout/Measurable;->minIntrinsicHeight(I)I

    move-result v10

    goto :goto_12

    :cond_12
    const/4 v10, 0x0

    .line 660
    :goto_12
    move/from16 v34, v10

    .line 665
    .local v34, "supportingIntrinsicHeight":I
    invoke-static/range {v33 .. v33}, Landroidx/compose/material3/internal/TextFieldImplKt;->heightOrZero(Landroidx/compose/ui/layout/Placeable;)I

    move-result v10

    div-int/lit8 v10, v10, 0x2

    iget-object v11, v12, Landroidx/compose/material3/OutlinedTextFieldMeasurePolicy;->paddingValues:Landroidx/compose/foundation/layout/PaddingValues;

    invoke-interface {v11}, Landroidx/compose/foundation/layout/PaddingValues;->calculateTopPadding-D9Ej5fM()F

    move-result v11

    invoke-interface {v13, v11}, Landroidx/compose/ui/layout/MeasureScope;->roundToPx-0680j_4(F)I

    move-result v11

    invoke-static {v10, v11}, Ljava/lang/Math;->max(II)I

    move-result v10

    .line 664
    move/from16 v35, v10

    .line 667
    .local v35, "topPadding":I
    nop

    .line 669
    neg-int v10, v0

    .line 670
    neg-int v11, v14

    sub-int v11, v11, v35

    sub-int v11, v11, v34

    .line 668
    move-object/from16 v36, v4

    move-wide/from16 v3, p3

    .end local v4    # "trailingPlaceable":Landroidx/compose/ui/layout/Placeable;
    .local v36, "trailingPlaceable":Landroidx/compose/ui/layout/Placeable;
    invoke-static {v3, v4, v10, v11}, Landroidx/compose/ui/unit/ConstraintsKt;->offset-NN6Ew-U(JII)J

    move-result-wide v15

    .line 672
    const/16 v21, 0xb

    const/16 v22, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-static/range {v15 .. v22}, Landroidx/compose/ui/unit/Constraints;->copy-Zbe2FdA$default(JIIIIILjava/lang/Object;)J

    move-result-wide v10

    .line 666
    nop

    .line 674
    .local v10, "textConstraints":J
    move-object/from16 v15, p2

    .local v15, "$this$fastFirst$iv":Ljava/util/List;
    const/16 v16, 0x0

    .line 1211
    .local v16, "$i$f$fastFirst":I
    nop

    .line 1212
    move-object/from16 v17, v15

    .local v17, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/16 v18, 0x0

    .line 1213
    .local v18, "$i$f$fastForEach":I
    nop

    .line 1214
    const/16 v19, 0x0

    move/from16 v37, v0

    .end local v0    # "occupiedSpaceHorizontally":I
    .local v19, "index$iv$iv":I
    .local v37, "occupiedSpaceHorizontally":I
    invoke-interface/range {v17 .. v17}, Ljava/util/List;->size()I

    move-result v0

    move/from16 v3, v19

    .end local v19    # "index$iv$iv":I
    .restart local v3    # "index$iv$iv":I
    :goto_13
    const-string v4, "Collection contains no element matching the predicate."

    if-ge v3, v0, :cond_1c

    .line 1215
    move/from16 v19, v0

    move-object/from16 v0, v17

    .end local v17    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .local v0, "$this$fastForEach$iv$iv":Ljava/util/List;
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v17

    .line 1216
    .local v17, "item$iv$iv":Ljava/lang/Object;
    move-object/from16 v20, v17

    .local v20, "it$iv":Ljava/lang/Object;
    const/16 v21, 0x0

    .line 1212
    .local v21, "$i$a$-fastForEach-ListUtilsKt$fastFirst$2$iv":I
    move-object/from16 v22, v20

    check-cast v22, Landroidx/compose/ui/layout/Measurable;

    .local v22, "it":Landroidx/compose/ui/layout/Measurable;
    const/16 v23, 0x0

    .line 674
    .local v23, "$i$a$-fastFirst-OutlinedTextFieldMeasurePolicy$measure$textFieldPlaceable$1":I
    move-object/from16 v24, v0

    .end local v0    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .local v24, "$this$fastForEach$iv$iv":Ljava/util/List;
    invoke-static/range {v22 .. v22}, Landroidx/compose/ui/layout/LayoutIdKt;->getLayoutId(Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;

    move-result-object v0

    move/from16 v25, v3

    .end local v3    # "index$iv$iv":I
    .local v25, "index$iv$iv":I
    const-string v3, "TextField"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    .line 1212
    .end local v22    # "it":Landroidx/compose/ui/layout/Measurable;
    .end local v23    # "$i$a$-fastFirst-OutlinedTextFieldMeasurePolicy$measure$textFieldPlaceable$1":I
    if-eqz v0, :cond_1b

    .line 1219
    .end local v15    # "$this$fastFirst$iv":Ljava/util/List;
    .end local v16    # "$i$f$fastFirst":I
    .end local v17    # "item$iv$iv":Ljava/lang/Object;
    .end local v18    # "$i$f$fastForEach":I
    .end local v20    # "it$iv":Ljava/lang/Object;
    .end local v21    # "$i$a$-fastForEach-ListUtilsKt$fastFirst$2$iv":I
    .end local v24    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v25    # "index$iv$iv":I
    move-object/from16 v0, v20

    check-cast v0, Landroidx/compose/ui/layout/Measurable;

    .line 674
    invoke-interface {v0, v10, v11}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    move-result-object v0

    .line 673
    nop

    .line 677
    .local v0, "textFieldPlaceable":Landroidx/compose/ui/layout/Placeable;
    const/16 v21, 0xe

    const/16 v22, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-wide v15, v10

    .end local v10    # "textConstraints":J
    .local v15, "textConstraints":J
    invoke-static/range {v15 .. v22}, Landroidx/compose/ui/unit/Constraints;->copy-Zbe2FdA$default(JIIIIILjava/lang/Object;)J

    move-result-wide v10

    .line 681
    move-wide/from16 v38, v15

    .line 679
    .end local v15    # "textConstraints":J
    .local v10, "placeholderConstraints":J
    .local v38, "textConstraints":J
    nop

    .line 680
    move-object/from16 v3, p2

    .local v3, "$this$fastFirstOrNull$iv":Ljava/util/List;
    const/4 v15, 0x0

    .line 1220
    .local v15, "$i$f$fastFirstOrNull":I
    nop

    .line 1221
    move-object/from16 v16, v3

    .local v16, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/16 v17, 0x0

    .line 1222
    .local v17, "$i$f$fastForEach":I
    nop

    .line 1223
    const/16 v18, 0x0

    move-object/from16 v40, v0

    .end local v0    # "textFieldPlaceable":Landroidx/compose/ui/layout/Placeable;
    .local v18, "index$iv$iv":I
    .local v40, "textFieldPlaceable":Landroidx/compose/ui/layout/Placeable;
    invoke-interface/range {v16 .. v16}, Ljava/util/List;->size()I

    move-result v0

    move-object/from16 v19, v3

    move/from16 v3, v18

    .end local v18    # "index$iv$iv":I
    .local v3, "index$iv$iv":I
    .local v19, "$this$fastFirstOrNull$iv":Ljava/util/List;
    :goto_14
    if-ge v3, v0, :cond_14

    .line 1224
    move/from16 v18, v0

    move-object/from16 v0, v16

    .end local v16    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .local v0, "$this$fastForEach$iv$iv":Ljava/util/List;
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v16

    .line 1225
    .local v16, "item$iv$iv":Ljava/lang/Object;
    move-object/from16 v20, v16

    .restart local v20    # "it$iv":Ljava/lang/Object;
    const/16 v21, 0x0

    .line 1221
    .local v21, "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    move-object/from16 v22, v20

    check-cast v22, Landroidx/compose/ui/layout/Measurable;

    .restart local v22    # "it":Landroidx/compose/ui/layout/Measurable;
    const/16 v23, 0x0

    .line 680
    .local v23, "$i$a$-fastFirstOrNull-OutlinedTextFieldMeasurePolicy$measure$placeholderPlaceable$1":I
    move-object/from16 v24, v0

    .end local v0    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .restart local v24    # "$this$fastForEach$iv$iv":Ljava/util/List;
    invoke-static/range {v22 .. v22}, Landroidx/compose/ui/layout/LayoutIdKt;->getLayoutId(Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;

    move-result-object v0

    move/from16 v25, v3

    .end local v3    # "index$iv$iv":I
    .restart local v25    # "index$iv$iv":I
    const-string v3, "Hint"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    .line 1221
    .end local v22    # "it":Landroidx/compose/ui/layout/Measurable;
    .end local v23    # "$i$a$-fastFirstOrNull-OutlinedTextFieldMeasurePolicy$measure$placeholderPlaceable$1":I
    if-eqz v0, :cond_13

    goto :goto_15

    .line 1225
    .end local v20    # "it$iv":Ljava/lang/Object;
    .end local v21    # "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    :cond_13
    nop

    .line 1223
    .end local v16    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v3, v25, 0x1

    move/from16 v0, v18

    move-object/from16 v16, v24

    .end local v25    # "index$iv$iv":I
    .restart local v3    # "index$iv$iv":I
    goto :goto_14

    .end local v24    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .local v16, "$this$fastForEach$iv$iv":Ljava/util/List;
    :cond_14
    move/from16 v25, v3

    move-object/from16 v24, v16

    .line 1227
    .end local v3    # "index$iv$iv":I
    .end local v16    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .restart local v24    # "$this$fastForEach$iv$iv":Ljava/util/List;
    nop

    .line 1228
    .end local v17    # "$i$f$fastForEach":I
    .end local v24    # "$this$fastForEach$iv$iv":Ljava/util/List;
    const/16 v20, 0x0

    .line 680
    .end local v15    # "$i$f$fastFirstOrNull":I
    .end local v19    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    :goto_15
    move-object/from16 v0, v20

    check-cast v0, Landroidx/compose/ui/layout/Measurable;

    .line 681
    if-eqz v0, :cond_15

    .line 680
    nop

    .line 681
    invoke-interface {v0, v10, v11}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    move-result-object v0

    goto :goto_16

    :cond_15
    const/4 v0, 0x0

    .line 678
    :goto_16
    nop

    .line 684
    .local v0, "placeholderPlaceable":Landroidx/compose/ui/layout/Placeable;
    nop

    .line 686
    invoke-static/range {v40 .. v40}, Landroidx/compose/material3/internal/TextFieldImplKt;->heightOrZero(Landroidx/compose/ui/layout/Placeable;)I

    move-result v3

    invoke-static {v0}, Landroidx/compose/material3/internal/TextFieldImplKt;->heightOrZero(Landroidx/compose/ui/layout/Placeable;)I

    move-result v15

    invoke-static {v3, v15}, Ljava/lang/Math;->max(II)I

    move-result v3

    .line 687
    nop

    .line 686
    add-int v3, v3, v35

    .line 688
    nop

    .line 686
    add-int/2addr v3, v14

    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    .line 683
    move v1, v3

    .line 693
    invoke-static/range {v28 .. v28}, Landroidx/compose/material3/internal/TextFieldImplKt;->widthOrZero(Landroidx/compose/ui/layout/Placeable;)I

    move-result v15

    .line 694
    invoke-static/range {v36 .. v36}, Landroidx/compose/material3/internal/TextFieldImplKt;->widthOrZero(Landroidx/compose/ui/layout/Placeable;)I

    move-result v16

    .line 695
    invoke-static {v5}, Landroidx/compose/material3/internal/TextFieldImplKt;->widthOrZero(Landroidx/compose/ui/layout/Placeable;)I

    move-result v17

    .line 696
    invoke-static/range {v29 .. v29}, Landroidx/compose/material3/internal/TextFieldImplKt;->widthOrZero(Landroidx/compose/ui/layout/Placeable;)I

    move-result v18

    .line 697
    invoke-virtual/range {v40 .. v40}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    move-result v19

    .line 698
    invoke-static/range {v33 .. v33}, Landroidx/compose/material3/internal/TextFieldImplKt;->widthOrZero(Landroidx/compose/ui/layout/Placeable;)I

    move-result v20

    .line 699
    invoke-static {v0}, Landroidx/compose/material3/internal/TextFieldImplKt;->widthOrZero(Landroidx/compose/ui/layout/Placeable;)I

    move-result v21

    .line 700
    iget v3, v12, Landroidx/compose/material3/OutlinedTextFieldMeasurePolicy;->animationProgress:F

    .line 701
    nop

    .line 702
    invoke-interface {v13}, Landroidx/compose/ui/layout/MeasureScope;->getDensity()F

    move-result v25

    .line 703
    move-object/from16 v41, v0

    .end local v0    # "placeholderPlaceable":Landroidx/compose/ui/layout/Placeable;
    .local v41, "placeholderPlaceable":Landroidx/compose/ui/layout/Placeable;
    iget-object v0, v12, Landroidx/compose/material3/OutlinedTextFieldMeasurePolicy;->paddingValues:Landroidx/compose/foundation/layout/PaddingValues;

    .line 692
    move-wide/from16 v23, p3

    move-object/from16 v26, v0

    move/from16 v22, v3

    invoke-static/range {v15 .. v26}, Landroidx/compose/material3/OutlinedTextFieldKt;->access$calculateWidth-DHJA7U0(IIIIIIIFJFLandroidx/compose/foundation/layout/PaddingValues;)I

    move-result v0

    .line 691
    nop

    .line 708
    .local v0, "width":I
    nop

    .line 709
    neg-int v3, v1

    const/16 v19, 0x1

    const/16 v20, 0x0

    const/16 v17, 0x0

    move/from16 v18, v3

    move-wide v15, v6

    .end local v6    # "relaxedConstraints":J
    .local v15, "relaxedConstraints":J
    invoke-static/range {v15 .. v20}, Landroidx/compose/ui/unit/ConstraintsKt;->offset-NN6Ew-U$default(JIIILjava/lang/Object;)J

    move-result-wide v6

    .line 710
    move-wide/from16 v42, v15

    .end local v15    # "relaxedConstraints":J
    .local v42, "relaxedConstraints":J
    const/16 v21, 0x9

    const/16 v22, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    move/from16 v18, v0

    move-wide v15, v6

    .end local v0    # "width":I
    .local v18, "width":I
    invoke-static/range {v15 .. v22}, Landroidx/compose/ui/unit/Constraints;->copy-Zbe2FdA$default(JIIIIILjava/lang/Object;)J

    move-result-wide v6

    .line 707
    .end local v18    # "width":I
    .restart local v0    # "width":I
    nop

    .line 711
    .local v6, "supportingConstraints":J
    if-eqz v2, :cond_16

    invoke-interface {v2, v6, v7}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    move-result-object v3

    move-object/from16 v27, v3

    goto :goto_17

    :cond_16
    const/16 v27, 0x0

    :goto_17
    move-object/from16 v3, v27

    .line 712
    .local v3, "supportingPlaceable":Landroidx/compose/ui/layout/Placeable;
    invoke-static {v3}, Landroidx/compose/material3/internal/TextFieldImplKt;->heightOrZero(Landroidx/compose/ui/layout/Placeable;)I

    move-result v44

    .line 716
    .local v44, "supportingHeight":I
    invoke-static/range {v28 .. v28}, Landroidx/compose/material3/internal/TextFieldImplKt;->heightOrZero(Landroidx/compose/ui/layout/Placeable;)I

    move-result v15

    .line 717
    invoke-static/range {v36 .. v36}, Landroidx/compose/material3/internal/TextFieldImplKt;->heightOrZero(Landroidx/compose/ui/layout/Placeable;)I

    move-result v16

    .line 718
    invoke-static {v5}, Landroidx/compose/material3/internal/TextFieldImplKt;->heightOrZero(Landroidx/compose/ui/layout/Placeable;)I

    move-result v17

    .line 719
    invoke-static/range {v29 .. v29}, Landroidx/compose/material3/internal/TextFieldImplKt;->heightOrZero(Landroidx/compose/ui/layout/Placeable;)I

    move-result v18

    .line 720
    invoke-virtual/range {v40 .. v40}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    move-result v19

    .line 721
    invoke-static/range {v33 .. v33}, Landroidx/compose/material3/internal/TextFieldImplKt;->heightOrZero(Landroidx/compose/ui/layout/Placeable;)I

    move-result v20

    .line 722
    invoke-static/range {v41 .. v41}, Landroidx/compose/material3/internal/TextFieldImplKt;->heightOrZero(Landroidx/compose/ui/layout/Placeable;)I

    move-result v21

    .line 723
    invoke-static {v3}, Landroidx/compose/material3/internal/TextFieldImplKt;->heightOrZero(Landroidx/compose/ui/layout/Placeable;)I

    move-result v22

    .line 724
    move/from16 v45, v1

    .end local v1    # "occupiedSpaceVertically":I
    .local v45, "occupiedSpaceVertically":I
    iget v1, v12, Landroidx/compose/material3/OutlinedTextFieldMeasurePolicy;->animationProgress:F

    .line 725
    nop

    .line 726
    invoke-interface {v13}, Landroidx/compose/ui/layout/MeasureScope;->getDensity()F

    move-result v26

    .line 727
    move/from16 v23, v1

    iget-object v1, v12, Landroidx/compose/material3/OutlinedTextFieldMeasurePolicy;->paddingValues:Landroidx/compose/foundation/layout/PaddingValues;

    .line 715
    move-wide/from16 v24, p3

    move-object/from16 v27, v1

    invoke-static/range {v15 .. v27}, Landroidx/compose/material3/OutlinedTextFieldKt;->access$calculateHeight-mKXJcVc(IIIIIIIIFJFLandroidx/compose/foundation/layout/PaddingValues;)I

    move-result v1

    .line 714
    nop

    .line 729
    .local v1, "totalHeight":I
    sub-int v15, v1, v44

    .line 732
    .local v15, "height":I
    nop

    .line 733
    move-object/from16 v16, p2

    .local v16, "$this$fastFirst$iv":Ljava/util/List;
    const/16 v17, 0x0

    .line 1229
    .local v17, "$i$f$fastFirst":I
    nop

    .line 1230
    move-object/from16 v18, v16

    .local v18, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/16 v19, 0x0

    .line 1231
    .local v19, "$i$f$fastForEach":I
    nop

    .line 1232
    const/16 v20, 0x0

    move/from16 v21, v1

    .end local v1    # "totalHeight":I
    .local v20, "index$iv$iv":I
    .local v21, "totalHeight":I
    invoke-interface/range {v18 .. v18}, Ljava/util/List;->size()I

    move-result v1

    move-object/from16 v22, v2

    move/from16 v2, v20

    .end local v20    # "index$iv$iv":I
    .local v2, "index$iv$iv":I
    .local v22, "supportingMeasurable":Landroidx/compose/ui/layout/Measurable;
    :goto_18
    if-ge v2, v1, :cond_1a

    .line 1233
    move/from16 v20, v1

    move-object/from16 v1, v18

    .end local v18    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .local v1, "$this$fastForEach$iv$iv":Ljava/util/List;
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v18

    .line 1234
    .local v18, "item$iv$iv":Ljava/lang/Object;
    move-object/from16 v23, v18

    .local v23, "it$iv":Ljava/lang/Object;
    const/16 v24, 0x0

    .line 1230
    .local v24, "$i$a$-fastForEach-ListUtilsKt$fastFirst$2$iv":I
    move-object/from16 v25, v23

    check-cast v25, Landroidx/compose/ui/layout/Measurable;

    .local v25, "it":Landroidx/compose/ui/layout/Measurable;
    const/16 v26, 0x0

    .line 733
    .local v26, "$i$a$-fastFirst-OutlinedTextFieldMeasurePolicy$measure$containerPlaceable$1":I
    move-object/from16 v27, v1

    .end local v1    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .local v27, "$this$fastForEach$iv$iv":Ljava/util/List;
    invoke-static/range {v25 .. v25}, Landroidx/compose/ui/layout/LayoutIdKt;->getLayoutId(Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;

    move-result-object v1

    move/from16 v46, v2

    .end local v2    # "index$iv$iv":I
    .local v46, "index$iv$iv":I
    const-string v2, "Container"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    .line 1230
    .end local v25    # "it":Landroidx/compose/ui/layout/Measurable;
    .end local v26    # "$i$a$-fastFirst-OutlinedTextFieldMeasurePolicy$measure$containerPlaceable$1":I
    if-eqz v1, :cond_19

    .line 1237
    .end local v16    # "$this$fastFirst$iv":Ljava/util/List;
    .end local v17    # "$i$f$fastFirst":I
    .end local v18    # "item$iv$iv":Ljava/lang/Object;
    .end local v19    # "$i$f$fastForEach":I
    .end local v23    # "it$iv":Ljava/lang/Object;
    .end local v24    # "$i$a$-fastForEach-ListUtilsKt$fastFirst$2$iv":I
    .end local v27    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v46    # "index$iv$iv":I
    move-object/from16 v1, v23

    check-cast v1, Landroidx/compose/ui/layout/Measurable;

    .line 736
    const v2, 0x7fffffff

    if-eq v0, v2, :cond_17

    move v4, v0

    goto :goto_19

    :cond_17
    const/4 v4, 0x0

    .line 737
    :goto_19
    nop

    .line 738
    if-eq v15, v2, :cond_18

    move v2, v15

    goto :goto_1a

    :cond_18
    const/4 v2, 0x0

    .line 739
    :goto_1a
    nop

    .line 735
    move-object/from16 v25, v3

    .end local v3    # "supportingPlaceable":Landroidx/compose/ui/layout/Placeable;
    .local v25, "supportingPlaceable":Landroidx/compose/ui/layout/Placeable;
    invoke-static {v4, v0, v2, v15}, Landroidx/compose/ui/unit/ConstraintsKt;->Constraints(IIII)J

    move-result-wide v2

    .line 734
    invoke-interface {v1, v2, v3}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    move-result-object v1

    .line 731
    nop

    .line 742
    .local v1, "containerPlaceable":Landroidx/compose/ui/layout/Placeable;
    move/from16 v18, v0

    .end local v0    # "width":I
    .local v18, "width":I
    new-instance v0, Landroidx/compose/material3/OutlinedTextFieldMeasurePolicy$measure$1;

    move-wide v2, v10

    move-object/from16 v11, v25

    move-wide/from16 v25, v2

    move-object v10, v1

    move/from16 v2, v18

    move/from16 v1, v21

    move-object/from16 v3, v28

    move-object/from16 v4, v36

    move-wide/from16 v47, v6

    move-object/from16 v6, v29

    move-wide/from16 v28, v8

    move-object/from16 v8, v33

    move-object/from16 v7, v40

    move-object/from16 v9, v41

    move-wide/from16 v40, v47

    .end local v18    # "width":I
    .end local v21    # "totalHeight":I
    .end local v29    # "suffixPlaceable":Landroidx/compose/ui/layout/Placeable;
    .end local v33    # "labelPlaceable":Landroidx/compose/ui/layout/Placeable;
    .end local v36    # "trailingPlaceable":Landroidx/compose/ui/layout/Placeable;
    .end local v41    # "placeholderPlaceable":Landroidx/compose/ui/layout/Placeable;
    .local v1, "totalHeight":I
    .local v2, "width":I
    .local v3, "leadingPlaceable":Landroidx/compose/ui/layout/Placeable;
    .restart local v4    # "trailingPlaceable":Landroidx/compose/ui/layout/Placeable;
    .local v6, "suffixPlaceable":Landroidx/compose/ui/layout/Placeable;
    .local v7, "textFieldPlaceable":Landroidx/compose/ui/layout/Placeable;
    .local v8, "labelPlaceable":Landroidx/compose/ui/layout/Placeable;
    .local v9, "placeholderPlaceable":Landroidx/compose/ui/layout/Placeable;
    .local v10, "containerPlaceable":Landroidx/compose/ui/layout/Placeable;
    .local v11, "supportingPlaceable":Landroidx/compose/ui/layout/Placeable;
    .local v25, "placeholderConstraints":J
    .local v28, "labelConstraints":J
    .local v40, "supportingConstraints":J
    invoke-direct/range {v0 .. v13}, Landroidx/compose/material3/OutlinedTextFieldMeasurePolicy$measure$1;-><init>(IILandroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/material3/OutlinedTextFieldMeasurePolicy;Landroidx/compose/ui/layout/MeasureScope;)V

    move-object v13, v10

    move-object v12, v11

    move-object v8, v5

    move-object v10, v7

    move-object v11, v9

    move-object v7, v3

    move-object v9, v6

    .end local v2    # "width":I
    .end local v3    # "leadingPlaceable":Landroidx/compose/ui/layout/Placeable;
    .end local v4    # "trailingPlaceable":Landroidx/compose/ui/layout/Placeable;
    .end local v5    # "prefixPlaceable":Landroidx/compose/ui/layout/Placeable;
    .end local v6    # "suffixPlaceable":Landroidx/compose/ui/layout/Placeable;
    .local v7, "leadingPlaceable":Landroidx/compose/ui/layout/Placeable;
    .local v8, "prefixPlaceable":Landroidx/compose/ui/layout/Placeable;
    .local v9, "suffixPlaceable":Landroidx/compose/ui/layout/Placeable;
    .local v10, "textFieldPlaceable":Landroidx/compose/ui/layout/Placeable;
    .local v11, "placeholderPlaceable":Landroidx/compose/ui/layout/Placeable;
    .local v12, "supportingPlaceable":Landroidx/compose/ui/layout/Placeable;
    .local v13, "containerPlaceable":Landroidx/compose/ui/layout/Placeable;
    .restart local v18    # "width":I
    .restart local v33    # "labelPlaceable":Landroidx/compose/ui/layout/Placeable;
    .restart local v36    # "trailingPlaceable":Landroidx/compose/ui/layout/Placeable;
    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function1;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v3, 0x0

    move-object/from16 v0, p1

    move v2, v1

    move/from16 v1, v18

    .end local v18    # "width":I
    .local v1, "width":I
    .local v2, "totalHeight":I
    invoke-static/range {v0 .. v6}, Landroidx/compose/ui/layout/MeasureScope;->layout$default(Landroidx/compose/ui/layout/MeasureScope;IILjava/util/Map;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/compose/ui/layout/MeasureResult;

    move-result-object v3

    move v0, v1

    move v1, v2

    .end local v2    # "totalHeight":I
    .restart local v0    # "width":I
    .local v1, "totalHeight":I
    return-object v3

    .line 1230
    .end local v1    # "totalHeight":I
    .end local v7    # "leadingPlaceable":Landroidx/compose/ui/layout/Placeable;
    .end local v9    # "suffixPlaceable":Landroidx/compose/ui/layout/Placeable;
    .end local v11    # "placeholderPlaceable":Landroidx/compose/ui/layout/Placeable;
    .end local v12    # "supportingPlaceable":Landroidx/compose/ui/layout/Placeable;
    .end local v13    # "containerPlaceable":Landroidx/compose/ui/layout/Placeable;
    .end local v25    # "placeholderConstraints":J
    .local v3, "supportingPlaceable":Landroidx/compose/ui/layout/Placeable;
    .restart local v5    # "prefixPlaceable":Landroidx/compose/ui/layout/Placeable;
    .local v6, "supportingConstraints":J
    .local v8, "labelConstraints":J
    .local v10, "placeholderConstraints":J
    .restart local v16    # "$this$fastFirst$iv":Ljava/util/List;
    .restart local v17    # "$i$f$fastFirst":I
    .local v18, "item$iv$iv":Ljava/lang/Object;
    .restart local v19    # "$i$f$fastForEach":I
    .restart local v21    # "totalHeight":I
    .restart local v23    # "it$iv":Ljava/lang/Object;
    .restart local v24    # "$i$a$-fastForEach-ListUtilsKt$fastFirst$2$iv":I
    .restart local v27    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .local v28, "leadingPlaceable":Landroidx/compose/ui/layout/Placeable;
    .restart local v29    # "suffixPlaceable":Landroidx/compose/ui/layout/Placeable;
    .local v40, "textFieldPlaceable":Landroidx/compose/ui/layout/Placeable;
    .restart local v41    # "placeholderPlaceable":Landroidx/compose/ui/layout/Placeable;
    .restart local v46    # "index$iv$iv":I
    :cond_19
    move-object v12, v3

    move-wide/from16 v25, v10

    move/from16 v1, v21

    move-object/from16 v10, v40

    move-object/from16 v11, v41

    move-wide/from16 v40, v6

    move-object/from16 v7, v28

    move-wide/from16 v47, v8

    move-object v8, v5

    move-object/from16 v9, v29

    move-wide/from16 v28, v47

    .line 1234
    .end local v3    # "supportingPlaceable":Landroidx/compose/ui/layout/Placeable;
    .end local v5    # "prefixPlaceable":Landroidx/compose/ui/layout/Placeable;
    .end local v6    # "supportingConstraints":J
    .end local v21    # "totalHeight":I
    .end local v23    # "it$iv":Ljava/lang/Object;
    .end local v24    # "$i$a$-fastForEach-ListUtilsKt$fastFirst$2$iv":I
    .end local v29    # "suffixPlaceable":Landroidx/compose/ui/layout/Placeable;
    .end local v41    # "placeholderPlaceable":Landroidx/compose/ui/layout/Placeable;
    .restart local v1    # "totalHeight":I
    .restart local v7    # "leadingPlaceable":Landroidx/compose/ui/layout/Placeable;
    .local v8, "prefixPlaceable":Landroidx/compose/ui/layout/Placeable;
    .restart local v9    # "suffixPlaceable":Landroidx/compose/ui/layout/Placeable;
    .local v10, "textFieldPlaceable":Landroidx/compose/ui/layout/Placeable;
    .restart local v11    # "placeholderPlaceable":Landroidx/compose/ui/layout/Placeable;
    .restart local v12    # "supportingPlaceable":Landroidx/compose/ui/layout/Placeable;
    .restart local v25    # "placeholderConstraints":J
    .local v28, "labelConstraints":J
    .local v40, "supportingConstraints":J
    nop

    .line 1232
    .end local v18    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v2, v46, 0x1

    move-object/from16 v13, p1

    move/from16 v1, v20

    move-object/from16 v18, v27

    move-object/from16 v12, p0

    move-object/from16 v28, v7

    move-object/from16 v29, v9

    move-wide/from16 v8, v47

    move-wide/from16 v6, v40

    move-object/from16 v40, v10

    move-object/from16 v41, v11

    move-wide/from16 v10, v25

    .end local v46    # "index$iv$iv":I
    .local v2, "index$iv$iv":I
    goto/16 :goto_18

    .end local v1    # "totalHeight":I
    .end local v7    # "leadingPlaceable":Landroidx/compose/ui/layout/Placeable;
    .end local v9    # "suffixPlaceable":Landroidx/compose/ui/layout/Placeable;
    .end local v11    # "placeholderPlaceable":Landroidx/compose/ui/layout/Placeable;
    .end local v12    # "supportingPlaceable":Landroidx/compose/ui/layout/Placeable;
    .end local v25    # "placeholderConstraints":J
    .end local v27    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .restart local v3    # "supportingPlaceable":Landroidx/compose/ui/layout/Placeable;
    .restart local v5    # "prefixPlaceable":Landroidx/compose/ui/layout/Placeable;
    .restart local v6    # "supportingConstraints":J
    .local v8, "labelConstraints":J
    .local v10, "placeholderConstraints":J
    .local v18, "$this$fastForEach$iv$iv":Ljava/util/List;
    .restart local v21    # "totalHeight":I
    .local v28, "leadingPlaceable":Landroidx/compose/ui/layout/Placeable;
    .restart local v29    # "suffixPlaceable":Landroidx/compose/ui/layout/Placeable;
    .local v40, "textFieldPlaceable":Landroidx/compose/ui/layout/Placeable;
    .restart local v41    # "placeholderPlaceable":Landroidx/compose/ui/layout/Placeable;
    :cond_1a
    move/from16 v46, v2

    .line 1236
    .end local v2    # "index$iv$iv":I
    nop

    .line 1237
    .end local v18    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v19    # "$i$f$fastForEach":I
    new-instance v2, Ljava/util/NoSuchElementException;

    invoke-direct {v2, v4}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 1212
    .end local v0    # "width":I
    .end local v3    # "supportingPlaceable":Landroidx/compose/ui/layout/Placeable;
    .end local v22    # "supportingMeasurable":Landroidx/compose/ui/layout/Measurable;
    .end local v38    # "textConstraints":J
    .end local v40    # "textFieldPlaceable":Landroidx/compose/ui/layout/Placeable;
    .end local v41    # "placeholderPlaceable":Landroidx/compose/ui/layout/Placeable;
    .end local v42    # "relaxedConstraints":J
    .end local v44    # "supportingHeight":I
    .end local v45    # "occupiedSpaceVertically":I
    .local v1, "occupiedSpaceVertically":I
    .local v2, "supportingMeasurable":Landroidx/compose/ui/layout/Measurable;
    .local v6, "relaxedConstraints":J
    .local v10, "textConstraints":J
    .local v15, "$this$fastFirst$iv":Ljava/util/List;
    .local v16, "$i$f$fastFirst":I
    .local v17, "item$iv$iv":Ljava/lang/Object;
    .local v18, "$i$f$fastForEach":I
    .local v20, "it$iv":Ljava/lang/Object;
    .local v21, "$i$a$-fastForEach-ListUtilsKt$fastFirst$2$iv":I
    .local v24, "$this$fastForEach$iv$iv":Ljava/util/List;
    .local v25, "index$iv$iv":I
    :cond_1b
    move-object/from16 v22, v2

    move-wide/from16 v42, v6

    move-wide/from16 v38, v10

    move-object/from16 v7, v28

    move-wide/from16 v47, v8

    move-object v8, v5

    move-object/from16 v9, v29

    move-wide/from16 v28, v47

    .line 1216
    .end local v2    # "supportingMeasurable":Landroidx/compose/ui/layout/Measurable;
    .end local v5    # "prefixPlaceable":Landroidx/compose/ui/layout/Placeable;
    .end local v6    # "relaxedConstraints":J
    .end local v10    # "textConstraints":J
    .end local v20    # "it$iv":Ljava/lang/Object;
    .end local v21    # "$i$a$-fastForEach-ListUtilsKt$fastFirst$2$iv":I
    .end local v29    # "suffixPlaceable":Landroidx/compose/ui/layout/Placeable;
    .restart local v7    # "leadingPlaceable":Landroidx/compose/ui/layout/Placeable;
    .local v8, "prefixPlaceable":Landroidx/compose/ui/layout/Placeable;
    .restart local v9    # "suffixPlaceable":Landroidx/compose/ui/layout/Placeable;
    .restart local v22    # "supportingMeasurable":Landroidx/compose/ui/layout/Measurable;
    .local v28, "labelConstraints":J
    .restart local v38    # "textConstraints":J
    .restart local v42    # "relaxedConstraints":J
    nop

    .line 1214
    .end local v17    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v3, v25, 0x1

    move-object/from16 v12, p0

    move-object/from16 v13, p1

    move/from16 v0, v19

    move-object/from16 v17, v24

    move-object/from16 v28, v7

    move-object/from16 v29, v9

    move-wide/from16 v8, v47

    move-wide/from16 v6, v42

    .end local v25    # "index$iv$iv":I
    .local v3, "index$iv$iv":I
    goto/16 :goto_13

    .line 1218
    .end local v3    # "index$iv$iv":I
    .end local v7    # "leadingPlaceable":Landroidx/compose/ui/layout/Placeable;
    .end local v9    # "suffixPlaceable":Landroidx/compose/ui/layout/Placeable;
    .end local v22    # "supportingMeasurable":Landroidx/compose/ui/layout/Measurable;
    .end local v24    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v38    # "textConstraints":J
    .end local v42    # "relaxedConstraints":J
    .restart local v2    # "supportingMeasurable":Landroidx/compose/ui/layout/Measurable;
    .restart local v5    # "prefixPlaceable":Landroidx/compose/ui/layout/Placeable;
    .restart local v6    # "relaxedConstraints":J
    .local v8, "labelConstraints":J
    .restart local v10    # "textConstraints":J
    .local v17, "$this$fastForEach$iv$iv":Ljava/util/List;
    .local v28, "leadingPlaceable":Landroidx/compose/ui/layout/Placeable;
    .restart local v29    # "suffixPlaceable":Landroidx/compose/ui/layout/Placeable;
    :cond_1c
    nop

    .line 1219
    .end local v17    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v18    # "$i$f$fastForEach":I
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0, v4}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

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

    .line 777
    sget-object v0, Landroidx/compose/material3/OutlinedTextFieldMeasurePolicy$minIntrinsicHeight$1;->INSTANCE:Landroidx/compose/material3/OutlinedTextFieldMeasurePolicy$minIntrinsicHeight$1;

    check-cast v0, Lkotlin/jvm/functions/Function2;

    invoke-direct {p0, p1, p2, p3, v0}, Landroidx/compose/material3/OutlinedTextFieldMeasurePolicy;->intrinsicHeight(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;ILkotlin/jvm/functions/Function2;)I

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

    .line 795
    sget-object v0, Landroidx/compose/material3/OutlinedTextFieldMeasurePolicy$minIntrinsicWidth$1;->INSTANCE:Landroidx/compose/material3/OutlinedTextFieldMeasurePolicy$minIntrinsicWidth$1;

    check-cast v0, Lkotlin/jvm/functions/Function2;

    invoke-direct {p0, p1, p2, p3, v0}, Landroidx/compose/material3/OutlinedTextFieldMeasurePolicy;->intrinsicWidth(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;ILkotlin/jvm/functions/Function2;)I

    move-result v0

    return v0
.end method
