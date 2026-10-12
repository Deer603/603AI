.class final Landroidx/compose/material3/SearchBar_androidKt$SearchBarLayout$2$1;
.super Ljava/lang/Object;
.source "SearchBar.android.kt"

# interfaces
.implements Landroidx/compose/ui/layout/MeasurePolicy;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material3/SearchBar_androidKt;->SearchBarLayout(Landroidx/compose/animation/core/Animatable;Landroidx/compose/runtime/MutableFloatState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSearchBar.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchBar.android.kt\nandroidx/compose/material3/SearchBar_androidKt$SearchBarLayout$2$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,1243:1\n544#2,2:1244\n33#2,6:1246\n546#2:1252\n544#2,2:1253\n33#2,6:1255\n546#2:1261\n116#2,2:1262\n33#2,6:1264\n118#2:1270\n*S KotlinDebug\n*F\n+ 1 SearchBar.android.kt\nandroidx/compose/material3/SearchBar_androidKt$SearchBarLayout$2$1\n*L\n969#1:1244,2\n969#1:1246,6\n969#1:1252\n970#1:1253,2\n970#1:1255,6\n970#1:1261\n971#1:1262,2\n971#1:1264,6\n971#1:1270\n*E\n"
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


# instance fields
.field final synthetic $animationProgress:Landroidx/compose/animation/core/Animatable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/animation/core/Animatable<",
            "Ljava/lang/Float;",
            "Landroidx/compose/animation/core/AnimationVector1D;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $currentBackEvent:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Landroidx/activity/BackEventCompat;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $finalBackProgress:Landroidx/compose/runtime/MutableFloatState;

.field final synthetic $firstBackEvent:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Landroidx/activity/BackEventCompat;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $unconsumedInsets:Landroidx/compose/material3/internal/MutableWindowInsets;


# direct methods
.method constructor <init>(Landroidx/compose/animation/core/Animatable;Landroidx/compose/material3/internal/MutableWindowInsets;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableFloatState;Landroidx/compose/runtime/MutableState;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/animation/core/Animatable<",
            "Ljava/lang/Float;",
            "Landroidx/compose/animation/core/AnimationVector1D;",
            ">;",
            "Landroidx/compose/material3/internal/MutableWindowInsets;",
            "Landroidx/compose/runtime/MutableState<",
            "Landroidx/activity/BackEventCompat;",
            ">;",
            "Landroidx/compose/runtime/MutableFloatState;",
            "Landroidx/compose/runtime/MutableState<",
            "Landroidx/activity/BackEventCompat;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/material3/SearchBar_androidKt$SearchBarLayout$2$1;->$animationProgress:Landroidx/compose/animation/core/Animatable;

    iput-object p2, p0, Landroidx/compose/material3/SearchBar_androidKt$SearchBarLayout$2$1;->$unconsumedInsets:Landroidx/compose/material3/internal/MutableWindowInsets;

    iput-object p3, p0, Landroidx/compose/material3/SearchBar_androidKt$SearchBarLayout$2$1;->$currentBackEvent:Landroidx/compose/runtime/MutableState;

    iput-object p4, p0, Landroidx/compose/material3/SearchBar_androidKt$SearchBarLayout$2$1;->$finalBackProgress:Landroidx/compose/runtime/MutableFloatState;

    iput-object p5, p0, Landroidx/compose/material3/SearchBar_androidKt$SearchBarLayout$2$1;->$firstBackEvent:Landroidx/compose/runtime/MutableState;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final measure-3p2s80s(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;
    .locals 31
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

    .line 967
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-wide/from16 v3, p3

    iget-object v2, v0, Landroidx/compose/material3/SearchBar_androidKt$SearchBarLayout$2$1;->$animationProgress:Landroidx/compose/animation/core/Animatable;

    invoke-virtual {v2}, Landroidx/compose/animation/core/Animatable;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v6

    .line 969
    .local v6, "animationProgress":F
    move-object/from16 v2, p2

    .local v2, "$this$fastFirst$iv":Ljava/util/List;
    const/4 v5, 0x0

    .line 1244
    .local v5, "$i$f$fastFirst":I
    nop

    .line 1245
    move-object v7, v2

    .local v7, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v8, 0x0

    .line 1246
    .local v8, "$i$f$fastForEach":I
    nop

    .line 1247
    const/4 v9, 0x0

    .local v9, "index$iv$iv":I
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v10

    :goto_0
    const-string v11, "Collection contains no element matching the predicate."

    if-ge v9, v10, :cond_7

    .line 1248
    invoke-interface {v7, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    .line 1249
    .local v12, "item$iv$iv":Ljava/lang/Object;
    move-object v13, v12

    .local v13, "it$iv":Ljava/lang/Object;
    const/4 v14, 0x0

    .line 1245
    .local v14, "$i$a$-fastForEach-ListUtilsKt$fastFirst$2$iv":I
    move-object v15, v13

    check-cast v15, Landroidx/compose/ui/layout/Measurable;

    .local v15, "it":Landroidx/compose/ui/layout/Measurable;
    const/16 v16, 0x0

    .line 969
    .local v16, "$i$a$-fastFirst-SearchBar_androidKt$SearchBarLayout$2$1$inputFieldMeasurable$1":I
    move-object/from16 v17, v2

    .end local v2    # "$this$fastFirst$iv":Ljava/util/List;
    .local v17, "$this$fastFirst$iv":Ljava/util/List;
    invoke-static {v15}, Landroidx/compose/ui/layout/LayoutIdKt;->getLayoutId(Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;

    move-result-object v2

    move/from16 v18, v5

    .end local v5    # "$i$f$fastFirst":I
    .local v18, "$i$f$fastFirst":I
    const-string v5, "InputField"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    .line 1245
    .end local v15    # "it":Landroidx/compose/ui/layout/Measurable;
    .end local v16    # "$i$a$-fastFirst-SearchBar_androidKt$SearchBarLayout$2$1$inputFieldMeasurable$1":I
    if-eqz v2, :cond_6

    .line 969
    .end local v7    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v8    # "$i$f$fastForEach":I
    .end local v9    # "index$iv$iv":I
    .end local v12    # "item$iv$iv":Ljava/lang/Object;
    .end local v13    # "it$iv":Ljava/lang/Object;
    .end local v14    # "$i$a$-fastForEach-ListUtilsKt$fastFirst$2$iv":I
    .end local v17    # "$this$fastFirst$iv":Ljava/util/List;
    .end local v18    # "$i$f$fastFirst":I
    move-object v2, v13

    check-cast v2, Landroidx/compose/ui/layout/Measurable;

    .line 970
    .local v2, "inputFieldMeasurable":Landroidx/compose/ui/layout/Measurable;
    move-object/from16 v5, p2

    .local v5, "$this$fastFirst$iv":Ljava/util/List;
    const/4 v7, 0x0

    .line 1253
    .local v7, "$i$f$fastFirst":I
    nop

    .line 1254
    move-object v8, v5

    .local v8, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v9, 0x0

    .line 1255
    .local v9, "$i$f$fastForEach":I
    nop

    .line 1256
    const/4 v10, 0x0

    .local v10, "index$iv$iv":I
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v12

    :goto_1
    if-ge v10, v12, :cond_5

    .line 1257
    invoke-interface {v8, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    .line 1258
    .local v13, "item$iv$iv":Ljava/lang/Object;
    move-object v14, v13

    .local v14, "it$iv":Ljava/lang/Object;
    const/4 v15, 0x0

    .line 1254
    .local v15, "$i$a$-fastForEach-ListUtilsKt$fastFirst$2$iv":I
    move-object/from16 v16, v14

    check-cast v16, Landroidx/compose/ui/layout/Measurable;

    .local v16, "it":Landroidx/compose/ui/layout/Measurable;
    const/16 v17, 0x0

    .line 970
    .local v17, "$i$a$-fastFirst-SearchBar_androidKt$SearchBarLayout$2$1$surfaceMeasurable$1":I
    move-object/from16 v18, v5

    .end local v5    # "$this$fastFirst$iv":Ljava/util/List;
    .local v18, "$this$fastFirst$iv":Ljava/util/List;
    invoke-static/range {v16 .. v16}, Landroidx/compose/ui/layout/LayoutIdKt;->getLayoutId(Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;

    move-result-object v5

    move/from16 v19, v7

    .end local v7    # "$i$f$fastFirst":I
    .local v19, "$i$f$fastFirst":I
    const-string v7, "Surface"

    invoke-static {v5, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    .line 1254
    .end local v16    # "it":Landroidx/compose/ui/layout/Measurable;
    .end local v17    # "$i$a$-fastFirst-SearchBar_androidKt$SearchBarLayout$2$1$surfaceMeasurable$1":I
    if-eqz v5, :cond_4

    .line 970
    .end local v8    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v9    # "$i$f$fastForEach":I
    .end local v10    # "index$iv$iv":I
    .end local v13    # "item$iv$iv":Ljava/lang/Object;
    .end local v14    # "it$iv":Ljava/lang/Object;
    .end local v15    # "$i$a$-fastForEach-ListUtilsKt$fastFirst$2$iv":I
    .end local v18    # "$this$fastFirst$iv":Ljava/util/List;
    .end local v19    # "$i$f$fastFirst":I
    move-object v5, v14

    check-cast v5, Landroidx/compose/ui/layout/Measurable;

    .line 971
    .local v5, "surfaceMeasurable":Landroidx/compose/ui/layout/Measurable;
    move-object/from16 v7, p2

    .local v7, "$this$fastFirstOrNull$iv":Ljava/util/List;
    const/4 v8, 0x0

    .line 1262
    .local v8, "$i$f$fastFirstOrNull":I
    nop

    .line 1263
    move-object v9, v7

    .local v9, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v10, 0x0

    .line 1264
    .local v10, "$i$f$fastForEach":I
    nop

    .line 1265
    const/4 v11, 0x0

    .local v11, "index$iv$iv":I
    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v12

    :goto_2
    if-ge v11, v12, :cond_1

    .line 1266
    invoke-interface {v9, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    .line 1267
    .local v14, "item$iv$iv":Ljava/lang/Object;
    move-object v15, v14

    .local v15, "it$iv":Ljava/lang/Object;
    const/16 v16, 0x0

    .line 1263
    .local v16, "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    move-object/from16 v17, v15

    check-cast v17, Landroidx/compose/ui/layout/Measurable;

    .local v17, "it":Landroidx/compose/ui/layout/Measurable;
    const/16 v18, 0x0

    .line 971
    .local v18, "$i$a$-fastFirstOrNull-SearchBar_androidKt$SearchBarLayout$2$1$contentMeasurable$1":I
    invoke-static/range {v17 .. v17}, Landroidx/compose/ui/layout/LayoutIdKt;->getLayoutId(Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;

    move-result-object v13

    move-object/from16 v20, v7

    .end local v7    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .local v20, "$this$fastFirstOrNull$iv":Ljava/util/List;
    const-string v7, "Content"

    invoke-static {v13, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    .line 1263
    .end local v17    # "it":Landroidx/compose/ui/layout/Measurable;
    .end local v18    # "$i$a$-fastFirstOrNull-SearchBar_androidKt$SearchBarLayout$2$1$contentMeasurable$1":I
    if-eqz v7, :cond_0

    goto :goto_3

    .line 1267
    .end local v15    # "it$iv":Ljava/lang/Object;
    .end local v16    # "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    :cond_0
    nop

    .line 1265
    .end local v14    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v11, v11, 0x1

    move-object/from16 v7, v20

    goto :goto_2

    .end local v20    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .restart local v7    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    :cond_1
    move-object/from16 v20, v7

    .line 1269
    .end local v7    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .end local v11    # "index$iv$iv":I
    .restart local v20    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    nop

    .line 1270
    .end local v9    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v10    # "$i$f$fastForEach":I
    const/4 v15, 0x0

    .line 971
    .end local v8    # "$i$f$fastFirstOrNull":I
    .end local v20    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    :goto_3
    move-object v7, v15

    check-cast v7, Landroidx/compose/ui/layout/Measurable;

    .line 973
    .local v7, "contentMeasurable":Landroidx/compose/ui/layout/Measurable;
    iget-object v8, v0, Landroidx/compose/material3/SearchBar_androidKt$SearchBarLayout$2$1;->$unconsumedInsets:Landroidx/compose/material3/internal/MutableWindowInsets;

    move-object v9, v1

    check-cast v9, Landroidx/compose/ui/unit/Density;

    invoke-virtual {v8, v9}, Landroidx/compose/material3/internal/MutableWindowInsets;->getTop(Landroidx/compose/ui/unit/Density;)I

    move-result v8

    invoke-static {}, Landroidx/compose/material3/SearchBar_androidKt;->getSearchBarVerticalPadding()F

    move-result v9

    invoke-interface {v1, v9}, Landroidx/compose/ui/layout/MeasureScope;->roundToPx-0680j_4(F)I

    move-result v9

    add-int v13, v8, v9

    .line 974
    .local v13, "topPadding":I
    invoke-static {}, Landroidx/compose/material3/SearchBar_androidKt;->getSearchBarVerticalPadding()F

    move-result v8

    invoke-interface {v1, v8}, Landroidx/compose/ui/layout/MeasureScope;->roundToPx-0680j_4(F)I

    move-result v8

    .line 977
    .local v8, "bottomPadding":I
    nop

    .line 978
    invoke-static {v3, v4}, Landroidx/compose/ui/unit/Constraints;->getMaxHeight-impl(J)I

    move-result v9

    invoke-interface {v2, v9}, Landroidx/compose/ui/layout/Measurable;->maxIntrinsicWidth(I)I

    move-result v9

    .line 977
    invoke-static {v3, v4, v9}, Landroidx/compose/ui/unit/ConstraintsKt;->constrainWidth-K40F9xA(JI)I

    move-result v9

    .line 976
    nop

    .line 981
    .local v9, "defaultStartWidth":I
    nop

    .line 982
    invoke-static {v3, v4}, Landroidx/compose/ui/unit/Constraints;->getMaxWidth-impl(J)I

    move-result v10

    invoke-interface {v2, v10}, Landroidx/compose/ui/layout/Measurable;->minIntrinsicHeight(I)I

    move-result v10

    .line 981
    invoke-static {v3, v4, v10}, Landroidx/compose/ui/unit/ConstraintsKt;->constrainHeight-K40F9xA(JI)I

    move-result v10

    .line 980
    nop

    .line 986
    .local v10, "defaultStartHeight":I
    invoke-static {v3, v4}, Landroidx/compose/ui/unit/Constraints;->getMaxWidth-impl(J)I

    move-result v11

    int-to-float v11, v11

    const v12, 0x3f666666    # 0.9f

    mul-float/2addr v11, v12

    invoke-static {v11}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v11

    .line 985
    nop

    .line 988
    .local v11, "predictiveBackStartWidth":I
    invoke-static {v3, v4}, Landroidx/compose/ui/unit/Constraints;->getMaxHeight-impl(J)I

    move-result v14

    int-to-float v14, v14

    mul-float/2addr v14, v12

    invoke-static {v14}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v12

    .line 987
    nop

    .line 991
    .local v12, "predictiveBackStartHeight":I
    iget-object v14, v0, Landroidx/compose/material3/SearchBar_androidKt$SearchBarLayout$2$1;->$currentBackEvent:Landroidx/compose/runtime/MutableState;

    invoke-interface {v14}, Landroidx/compose/runtime/MutableState;->getValue()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Landroidx/activity/BackEventCompat;

    .line 992
    nop

    .line 993
    iget-object v15, v0, Landroidx/compose/material3/SearchBar_androidKt$SearchBarLayout$2$1;->$finalBackProgress:Landroidx/compose/runtime/MutableFloatState;

    invoke-interface {v15}, Landroidx/compose/runtime/MutableFloatState;->getFloatValue()F

    move-result v15

    .line 990
    invoke-static {v14, v6, v15}, Landroidx/compose/material3/SearchBar_androidKt;->access$calculatePredictiveBackMultiplier(Landroidx/activity/BackEventCompat;FF)F

    move-result v14

    .line 989
    nop

    .line 996
    .local v14, "predictiveBackMultiplier":F
    invoke-static {v9, v11, v14}, Landroidx/compose/ui/util/MathHelpersKt;->lerp(IIF)I

    move-result v15

    .line 999
    .local v15, "startWidth":I
    add-int v1, v13, v10

    .line 1000
    nop

    .line 1001
    nop

    .line 998
    invoke-static {v1, v12, v14}, Landroidx/compose/ui/util/MathHelpersKt;->lerp(IIF)I

    move-result v1

    .line 997
    nop

    .line 1004
    .local v1, "startHeight":I
    invoke-static/range {p3 .. p4}, Landroidx/compose/ui/unit/Constraints;->getMaxWidth-impl(J)I

    move-result v3

    .line 1005
    .local v3, "maxWidth":I
    invoke-static/range {p3 .. p4}, Landroidx/compose/ui/unit/Constraints;->getMaxHeight-impl(J)I

    move-result v4

    .line 1007
    .local v4, "maxHeight":I
    move/from16 v16, v9

    .end local v9    # "defaultStartWidth":I
    .local v16, "defaultStartWidth":I
    invoke-static {v15, v3, v6}, Landroidx/compose/ui/util/MathHelpersKt;->lerp(IIF)I

    move-result v9

    .line 1008
    .local v9, "minWidth":I
    invoke-static {v1, v4, v6}, Landroidx/compose/ui/util/MathHelpersKt;->lerp(IIF)I

    move-result v17

    .line 1011
    .local v17, "height":I
    move/from16 v18, v1

    .end local v1    # "startHeight":I
    .local v18, "startHeight":I
    const/4 v1, 0x0

    move/from16 v20, v11

    .end local v11    # "predictiveBackStartWidth":I
    .local v20, "predictiveBackStartWidth":I
    invoke-static {v13, v1, v6}, Landroidx/compose/ui/util/MathHelpersKt;->lerp(IIF)I

    move-result v11

    .line 1012
    .local v11, "animatedTopPadding":I
    move/from16 v21, v15

    .end local v15    # "startWidth":I
    .local v21, "startWidth":I
    invoke-static {v1, v8, v6}, Landroidx/compose/ui/util/MathHelpersKt;->lerp(IIF)I

    move-result v15

    .line 1015
    .local v15, "animatedBottomPadding":I
    nop

    .line 1017
    nop

    .line 1018
    nop

    .line 1019
    nop

    .line 1020
    nop

    .line 1016
    move/from16 v23, v11

    move/from16 v22, v12

    .end local v11    # "animatedTopPadding":I
    .end local v12    # "predictiveBackStartHeight":I
    .local v22, "predictiveBackStartHeight":I
    .local v23, "animatedTopPadding":I
    invoke-static {v9, v3, v10, v10}, Landroidx/compose/ui/unit/ConstraintsKt;->Constraints(IIII)J

    move-result-wide v11

    .line 1015
    invoke-interface {v2, v11, v12}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    move-result-object v12

    .line 1014
    nop

    .line 1023
    .local v12, "inputFieldPlaceable":Landroidx/compose/ui/layout/Placeable;
    invoke-virtual {v12}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    move-result v11

    .line 1028
    .local v11, "width":I
    sget-object v1, Landroidx/compose/ui/unit/Constraints;->Companion:Landroidx/compose/ui/unit/Constraints$Companion;

    move-object/from16 v25, v2

    .end local v2    # "inputFieldMeasurable":Landroidx/compose/ui/layout/Measurable;
    .local v25, "inputFieldMeasurable":Landroidx/compose/ui/layout/Measurable;
    sub-int v2, v17, v23

    invoke-virtual {v1, v11, v2}, Landroidx/compose/ui/unit/Constraints$Companion;->fixed-JhjzzOo(II)J

    move-result-wide v1

    invoke-interface {v5, v1, v2}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    move-result-object v1

    .line 1027
    nop

    .line 1030
    .local v1, "surfacePlaceable":Landroidx/compose/ui/layout/Placeable;
    if-eqz v7, :cond_3

    .line 1032
    nop

    .line 1033
    nop

    .line 1034
    nop

    .line 1036
    invoke-static/range {p3 .. p4}, Landroidx/compose/ui/unit/Constraints;->getHasBoundedHeight-impl(J)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 1037
    invoke-static/range {p3 .. p4}, Landroidx/compose/ui/unit/Constraints;->getMaxHeight-impl(J)I

    move-result v2

    .line 1038
    add-int v19, v13, v10

    add-int v19, v19, v8

    .line 1037
    sub-int v2, v2, v19

    .line 1039
    move-object/from16 v26, v1

    const/4 v1, 0x0

    .end local v1    # "surfacePlaceable":Landroidx/compose/ui/layout/Placeable;
    .local v26, "surfacePlaceable":Landroidx/compose/ui/layout/Placeable;
    invoke-static {v2, v1}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v2

    goto :goto_4

    .line 1041
    .end local v26    # "surfacePlaceable":Landroidx/compose/ui/layout/Placeable;
    .restart local v1    # "surfacePlaceable":Landroidx/compose/ui/layout/Placeable;
    :cond_2
    move-object/from16 v26, v1

    const/4 v1, 0x0

    .end local v1    # "surfacePlaceable":Landroidx/compose/ui/layout/Placeable;
    .restart local v26    # "surfacePlaceable":Landroidx/compose/ui/layout/Placeable;
    invoke-static/range {p3 .. p4}, Landroidx/compose/ui/unit/Constraints;->getMaxHeight-impl(J)I

    move-result v2

    .line 1031
    :goto_4
    invoke-static {v11, v11, v1, v2}, Landroidx/compose/ui/unit/ConstraintsKt;->Constraints(IIII)J

    move-result-wide v1

    .line 1030
    invoke-interface {v7, v1, v2}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    move-result-object v1

    goto :goto_5

    .end local v26    # "surfacePlaceable":Landroidx/compose/ui/layout/Placeable;
    .restart local v1    # "surfacePlaceable":Landroidx/compose/ui/layout/Placeable;
    :cond_3
    move-object/from16 v26, v1

    .end local v1    # "surfacePlaceable":Landroidx/compose/ui/layout/Placeable;
    .restart local v26    # "surfacePlaceable":Landroidx/compose/ui/layout/Placeable;
    const/4 v1, 0x0

    .line 1029
    :goto_5
    nop

    .line 1046
    .local v1, "contentPlaceable":Landroidx/compose/ui/layout/Placeable;
    move-object v2, v7

    move v7, v14

    move-object v14, v1

    .end local v1    # "contentPlaceable":Landroidx/compose/ui/layout/Placeable;
    .local v2, "contentMeasurable":Landroidx/compose/ui/layout/Measurable;
    .local v7, "predictiveBackMultiplier":F
    .local v14, "contentPlaceable":Landroidx/compose/ui/layout/Placeable;
    new-instance v1, Landroidx/compose/material3/SearchBar_androidKt$SearchBarLayout$2$1$1;

    move-object/from16 v19, v5

    .end local v5    # "surfaceMeasurable":Landroidx/compose/ui/layout/Measurable;
    .local v19, "surfaceMeasurable":Landroidx/compose/ui/layout/Measurable;
    iget-object v5, v0, Landroidx/compose/material3/SearchBar_androidKt$SearchBarLayout$2$1;->$currentBackEvent:Landroidx/compose/runtime/MutableState;

    move/from16 v24, v8

    .end local v8    # "bottomPadding":I
    .local v24, "bottomPadding":I
    iget-object v8, v0, Landroidx/compose/material3/SearchBar_androidKt$SearchBarLayout$2$1;->$firstBackEvent:Landroidx/compose/runtime/MutableState;

    move/from16 v27, v4

    move/from16 v28, v9

    move/from16 v29, v11

    move/from16 v9, v17

    move/from16 v11, v23

    move/from16 v17, v16

    move/from16 v23, v18

    move-object/from16 v16, v2

    move/from16 v18, v10

    move-object/from16 v10, v26

    move-object/from16 v2, p1

    move/from16 v26, v3

    move-wide/from16 v3, p3

    .end local v2    # "contentMeasurable":Landroidx/compose/ui/layout/Measurable;
    .end local v3    # "maxWidth":I
    .end local v4    # "maxHeight":I
    .local v9, "height":I
    .local v10, "surfacePlaceable":Landroidx/compose/ui/layout/Placeable;
    .local v11, "animatedTopPadding":I
    .local v16, "contentMeasurable":Landroidx/compose/ui/layout/Measurable;
    .local v17, "defaultStartWidth":I
    .local v18, "defaultStartHeight":I
    .local v23, "startHeight":I
    .local v26, "maxWidth":I
    .local v27, "maxHeight":I
    .local v28, "minWidth":I
    .local v29, "width":I
    invoke-direct/range {v1 .. v15}, Landroidx/compose/material3/SearchBar_androidKt$SearchBarLayout$2$1$1;-><init>(Landroidx/compose/ui/layout/MeasureScope;JLandroidx/compose/runtime/MutableState;FFLandroidx/compose/runtime/MutableState;ILandroidx/compose/ui/layout/Placeable;ILandroidx/compose/ui/layout/Placeable;ILandroidx/compose/ui/layout/Placeable;I)V

    move/from16 v30, v6

    move v3, v9

    move-object v8, v14

    move v14, v7

    .end local v6    # "animationProgress":F
    .end local v7    # "predictiveBackMultiplier":F
    .end local v9    # "height":I
    .local v3, "height":I
    .local v8, "contentPlaceable":Landroidx/compose/ui/layout/Placeable;
    .local v14, "predictiveBackMultiplier":F
    .local v30, "animationProgress":F
    move-object v5, v1

    check-cast v5, Lkotlin/jvm/functions/Function1;

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v4, 0x0

    move-object/from16 v1, p1

    move/from16 v2, v29

    .end local v29    # "width":I
    .local v2, "width":I
    invoke-static/range {v1 .. v7}, Landroidx/compose/ui/layout/MeasureScope;->layout$default(Landroidx/compose/ui/layout/MeasureScope;IILjava/util/Map;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/compose/ui/layout/MeasureResult;

    move-result-object v4

    .end local v2    # "width":I
    .restart local v29    # "width":I
    return-object v4

    .line 1254
    .end local v3    # "height":I
    .end local v11    # "animatedTopPadding":I
    .end local v12    # "inputFieldPlaceable":Landroidx/compose/ui/layout/Placeable;
    .end local v16    # "contentMeasurable":Landroidx/compose/ui/layout/Measurable;
    .end local v17    # "defaultStartWidth":I
    .end local v20    # "predictiveBackStartWidth":I
    .end local v21    # "startWidth":I
    .end local v22    # "predictiveBackStartHeight":I
    .end local v23    # "startHeight":I
    .end local v24    # "bottomPadding":I
    .end local v25    # "inputFieldMeasurable":Landroidx/compose/ui/layout/Measurable;
    .end local v26    # "maxWidth":I
    .end local v27    # "maxHeight":I
    .end local v28    # "minWidth":I
    .end local v29    # "width":I
    .end local v30    # "animationProgress":F
    .local v2, "inputFieldMeasurable":Landroidx/compose/ui/layout/Measurable;
    .restart local v6    # "animationProgress":F
    .local v8, "$this$fastForEach$iv$iv":Ljava/util/List;
    .local v9, "$i$f$fastForEach":I
    .local v10, "index$iv$iv":I
    .local v13, "item$iv$iv":Ljava/lang/Object;
    .local v14, "it$iv":Ljava/lang/Object;
    .local v15, "$i$a$-fastForEach-ListUtilsKt$fastFirst$2$iv":I
    .local v18, "$this$fastFirst$iv":Ljava/util/List;
    .local v19, "$i$f$fastFirst":I
    :cond_4
    move-object/from16 v25, v2

    move/from16 v30, v6

    .line 1258
    .end local v2    # "inputFieldMeasurable":Landroidx/compose/ui/layout/Measurable;
    .end local v6    # "animationProgress":F
    .end local v14    # "it$iv":Ljava/lang/Object;
    .end local v15    # "$i$a$-fastForEach-ListUtilsKt$fastFirst$2$iv":I
    .restart local v25    # "inputFieldMeasurable":Landroidx/compose/ui/layout/Measurable;
    .restart local v30    # "animationProgress":F
    nop

    .line 1256
    .end local v13    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v10, v10, 0x1

    move-object/from16 v1, p1

    move-wide/from16 v3, p3

    move-object/from16 v5, v18

    move/from16 v7, v19

    goto/16 :goto_1

    .line 1260
    .end local v10    # "index$iv$iv":I
    .end local v18    # "$this$fastFirst$iv":Ljava/util/List;
    .end local v19    # "$i$f$fastFirst":I
    .end local v25    # "inputFieldMeasurable":Landroidx/compose/ui/layout/Measurable;
    .end local v30    # "animationProgress":F
    .restart local v2    # "inputFieldMeasurable":Landroidx/compose/ui/layout/Measurable;
    .local v5, "$this$fastFirst$iv":Ljava/util/List;
    .restart local v6    # "animationProgress":F
    .local v7, "$i$f$fastFirst":I
    :cond_5
    nop

    .line 1261
    .end local v8    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v9    # "$i$f$fastForEach":I
    new-instance v1, Ljava/util/NoSuchElementException;

    invoke-direct {v1, v11}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 1245
    .end local v2    # "inputFieldMeasurable":Landroidx/compose/ui/layout/Measurable;
    .end local v5    # "$this$fastFirst$iv":Ljava/util/List;
    .local v7, "$this$fastForEach$iv$iv":Ljava/util/List;
    .local v8, "$i$f$fastForEach":I
    .local v9, "index$iv$iv":I
    .local v12, "item$iv$iv":Ljava/lang/Object;
    .local v13, "it$iv":Ljava/lang/Object;
    .local v14, "$i$a$-fastForEach-ListUtilsKt$fastFirst$2$iv":I
    .local v17, "$this$fastFirst$iv":Ljava/util/List;
    .local v18, "$i$f$fastFirst":I
    :cond_6
    move/from16 v30, v6

    .line 1249
    .end local v6    # "animationProgress":F
    .end local v13    # "it$iv":Ljava/lang/Object;
    .end local v14    # "$i$a$-fastForEach-ListUtilsKt$fastFirst$2$iv":I
    .restart local v30    # "animationProgress":F
    nop

    .line 1247
    .end local v12    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v9, v9, 0x1

    move-object/from16 v1, p1

    move-wide/from16 v3, p3

    move-object/from16 v2, v17

    move/from16 v5, v18

    goto/16 :goto_0

    .line 1251
    .end local v9    # "index$iv$iv":I
    .end local v17    # "$this$fastFirst$iv":Ljava/util/List;
    .end local v18    # "$i$f$fastFirst":I
    .end local v30    # "animationProgress":F
    .local v2, "$this$fastFirst$iv":Ljava/util/List;
    .local v5, "$i$f$fastFirst":I
    .restart local v6    # "animationProgress":F
    :cond_7
    nop

    .line 1252
    .end local v7    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v8    # "$i$f$fastForEach":I
    new-instance v1, Ljava/util/NoSuchElementException;

    invoke-direct {v1, v11}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
