.class public final Landroidx/compose/material/TextFieldImplKt;
.super Ljava/lang/Object;
.source "TextFieldImpl.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nTextFieldImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material/TextFieldImplKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,381:1\n1247#2,6:382\n708#3:388\n696#3:389\n708#3:390\n696#3:391\n149#4:392\n149#4:393\n*S KotlinDebug\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material/TextFieldImplKt\n*L\n81#1:382,6\n118#1:388\n118#1:389\n123#1:390\n123#1:391\n379#1:392\n380#1:393\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0090\u0001\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\t\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u00d9\u0001\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00082\u0011\u0010\u001b\u001a\r\u0012\u0004\u0012\u00020\u00170\u001c\u00a2\u0006\u0002\u0008\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0013\u0010 \u001a\u000f\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001c\u00a2\u0006\u0002\u0008\u001d2\u0013\u0010!\u001a\u000f\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001c\u00a2\u0006\u0002\u0008\u001d2\u0013\u0010\"\u001a\u000f\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001c\u00a2\u0006\u0002\u0008\u001d2\u0013\u0010#\u001a\u000f\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001c\u00a2\u0006\u0002\u0008\u001d2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020%2\u0006\u0010\'\u001a\u00020%2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0013\u00100\u001a\u000f\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001c\u00a2\u0006\u0002\u0008\u001dH\u0001\u00a2\u0006\u0002\u00101\u001aT\u00102\u001a\u00020\u00172\u0006\u00103\u001a\u0002042\n\u0008\u0002\u00105\u001a\u0004\u0018\u0001062\n\u0008\u0002\u00107\u001a\u0004\u0018\u0001082 \u00109\u001a\u001c\u0012\u0004\u0012\u00020\u00170\u001c\u00a2\u0006\u0002\u0008\u001d\u00a2\u0006\u000c\u0008:\u0012\u0008\u0008;\u0012\u0004\u0008\u0003\u0010\u0000H\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008<\u0010=\u001a\u0012\u0010>\u001a\u00020\u00012\u0008\u0010?\u001a\u0004\u0018\u00010@H\u0000\u001a\u0012\u0010A\u001a\u00020\u00012\u0008\u0010?\u001a\u0004\u0018\u00010@H\u0000\u001a\u001c\u0010B\u001a\u00020C*\u00020C2\u0006\u0010\'\u001a\u00020%2\u0006\u0010D\u001a\u00020\u0008H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T\u00a2\u0006\u0002\n\u0000\"\u0016\u0010\u0002\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\n\n\u0002\u0010\u0006\u001a\u0004\u0008\u0004\u0010\u0005\"\u000e\u0010\u0007\u001a\u00020\u0008X\u0080T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0008X\u0080T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000c\u001a\u00020\u0008X\u0080T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0008X\u0080T\u00a2\u0006\u0002\n\u0000\"\u0016\u0010\u000e\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\n\n\u0002\u0010\u0006\u001a\u0004\u0008\u000f\u0010\u0005\"\u000e\u0010\u0010\u001a\u00020\u0008X\u0080T\u00a2\u0006\u0002\n\u0000\"\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u0012*\u00020\u00138@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0014\u0010\u0015\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006E"
    }
    d2 = {
        "AnimationDuration",
        "",
        "HorizontalIconPadding",
        "Landroidx/compose/ui/unit/Dp;",
        "getHorizontalIconPadding",
        "()F",
        "F",
        "LabelId",
        "",
        "LeadingId",
        "PlaceholderAnimationDelayOrDuration",
        "PlaceholderAnimationDuration",
        "PlaceholderId",
        "TextFieldId",
        "TextFieldPadding",
        "getTextFieldPadding",
        "TrailingId",
        "layoutId",
        "",
        "Landroidx/compose/ui/layout/IntrinsicMeasurable;",
        "getLayoutId",
        "(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Ljava/lang/Object;",
        "CommonDecorationBox",
        "",
        "type",
        "Landroidx/compose/material/TextFieldType;",
        "value",
        "innerTextField",
        "Lkotlin/Function0;",
        "Landroidx/compose/runtime/Composable;",
        "visualTransformation",
        "Landroidx/compose/ui/text/input/VisualTransformation;",
        "label",
        "placeholder",
        "leadingIcon",
        "trailingIcon",
        "singleLine",
        "",
        "enabled",
        "isError",
        "interactionSource",
        "Landroidx/compose/foundation/interaction/InteractionSource;",
        "contentPadding",
        "Landroidx/compose/foundation/layout/PaddingValues;",
        "shape",
        "Landroidx/compose/ui/graphics/Shape;",
        "colors",
        "Landroidx/compose/material/TextFieldColors;",
        "border",
        "(Landroidx/compose/material/TextFieldType;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V",
        "Decoration",
        "contentColor",
        "Landroidx/compose/ui/graphics/Color;",
        "typography",
        "Landroidx/compose/ui/text/TextStyle;",
        "contentAlpha",
        "",
        "content",
        "Landroidx/compose/runtime/ComposableOpenTarget;",
        "index",
        "Decoration-euL9pac",
        "(JLandroidx/compose/ui/text/TextStyle;Ljava/lang/Float;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V",
        "heightOrZero",
        "placeable",
        "Landroidx/compose/ui/layout/Placeable;",
        "widthOrZero",
        "defaultErrorSemantics",
        "Landroidx/compose/ui/Modifier;",
        "defaultErrorMessage",
        "material_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final AnimationDuration:I = 0x96

.field private static final HorizontalIconPadding:F

.field public static final LabelId:Ljava/lang/String; = "Label"

.field public static final LeadingId:Ljava/lang/String; = "Leading"

.field private static final PlaceholderAnimationDelayOrDuration:I = 0x43

.field private static final PlaceholderAnimationDuration:I = 0x53

.field public static final PlaceholderId:Ljava/lang/String; = "Hint"

.field public static final TextFieldId:Ljava/lang/String; = "TextField"

.field private static final TextFieldPadding:F

.field public static final TrailingId:Ljava/lang/String; = "Trailing"


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 379
    const/16 v0, 0x10

    .local v0, "$this$dp$iv":I
    const/4 v1, 0x0

    .line 392
    .local v1, "$i$f$getDp":I
    int-to-float v2, v0

    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    .line 379
    .end local v0    # "$this$dp$iv":I
    .end local v1    # "$i$f$getDp":I
    sput v0, Landroidx/compose/material/TextFieldImplKt;->TextFieldPadding:F

    .line 380
    const/16 v0, 0xc

    .restart local v0    # "$this$dp$iv":I
    const/4 v1, 0x0

    .line 393
    .restart local v1    # "$i$f$getDp":I
    int-to-float v2, v0

    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    .line 380
    .end local v0    # "$this$dp$iv":I
    .end local v1    # "$i$f$getDp":I
    sput v0, Landroidx/compose/material/TextFieldImplKt;->HorizontalIconPadding:F

    return-void
.end method

.method public static final CommonDecorationBox(Landroidx/compose/material/TextFieldType;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V
    .locals 35
    .param p0, "type"    # Landroidx/compose/material/TextFieldType;
    .param p1, "value"    # Ljava/lang/String;
    .param p2, "innerTextField"    # Lkotlin/jvm/functions/Function2;
    .param p3, "visualTransformation"    # Landroidx/compose/ui/text/input/VisualTransformation;
    .param p4, "label"    # Lkotlin/jvm/functions/Function2;
    .param p5, "placeholder"    # Lkotlin/jvm/functions/Function2;
    .param p6, "leadingIcon"    # Lkotlin/jvm/functions/Function2;
    .param p7, "trailingIcon"    # Lkotlin/jvm/functions/Function2;
    .param p8, "singleLine"    # Z
    .param p9, "enabled"    # Z
    .param p10, "isError"    # Z
    .param p11, "interactionSource"    # Landroidx/compose/foundation/interaction/InteractionSource;
    .param p12, "contentPadding"    # Landroidx/compose/foundation/layout/PaddingValues;
    .param p13, "shape"    # Landroidx/compose/ui/graphics/Shape;
    .param p14, "colors"    # Landroidx/compose/material/TextFieldColors;
    .param p15, "border"    # Lkotlin/jvm/functions/Function2;
    .param p16, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p17, "$changed"    # I
    .param p18, "$changed1"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/material/TextFieldType;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/ui/text/input/VisualTransformation;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;ZZZ",
            "Landroidx/compose/foundation/interaction/InteractionSource;",
            "Landroidx/compose/foundation/layout/PaddingValues;",
            "Landroidx/compose/ui/graphics/Shape;",
            "Landroidx/compose/material/TextFieldColors;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    .line 79
    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v10, p9

    move/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v15, p14

    move/from16 v0, p17

    move/from16 v1, p18

    const v2, 0x145f34c6

    move-object/from16 v3, p16

    invoke-interface {v3, v2}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v3

    .end local p16    # "$composer":Landroidx/compose/runtime/Composer;
    .local v3, "$composer":Landroidx/compose/runtime/Composer;
    const-string v6, "C(CommonDecorationBox)P(13,14,4,15,7,9,8,12,11,3,6,5,2,10,1)80@3059L121,86@3256L25,106@3940L10,127@4849L4431,113@4275L5005:TextFieldImpl.kt#jmzs0o"

    invoke-static {v3, v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    move/from16 v6, p17

    .local v6, "$dirty":I
    move/from16 v7, p18

    .local v7, "$dirty1":I
    and-int/lit8 v8, v0, 0x6

    if-nez v8, :cond_1

    move-object/from16 v8, p0

    invoke-interface {v3, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_0

    const/4 v14, 0x4

    goto :goto_0

    :cond_0
    const/4 v14, 0x2

    :goto_0
    or-int/2addr v6, v14

    goto :goto_1

    :cond_1
    move-object/from16 v8, p0

    :goto_1
    and-int/lit8 v14, v0, 0x30

    const/16 v16, 0x10

    if-nez v14, :cond_3

    move-object/from16 v14, p1

    invoke-interface {v3, v14}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_2

    const/16 v17, 0x20

    goto :goto_2

    :cond_2
    move/from16 v17, v16

    :goto_2
    or-int v6, v6, v17

    goto :goto_3

    :cond_3
    move-object/from16 v14, p1

    :goto_3
    and-int/lit16 v13, v0, 0x180

    const/16 v18, 0x100

    const/16 v19, 0x80

    if-nez v13, :cond_5

    move-object/from16 v13, p2

    invoke-interface {v3, v13}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_4

    move/from16 v20, v18

    goto :goto_4

    :cond_4
    move/from16 v20, v19

    :goto_4
    or-int v6, v6, v20

    goto :goto_5

    :cond_5
    move-object/from16 v13, p2

    :goto_5
    and-int/lit16 v9, v0, 0xc00

    const/16 v21, 0x400

    if-nez v9, :cond_7

    invoke-interface {v3, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_6

    const/16 v9, 0x800

    goto :goto_6

    :cond_6
    move/from16 v9, v21

    :goto_6
    or-int/2addr v6, v9

    :cond_7
    and-int/lit16 v9, v0, 0x6000

    const/16 v23, 0x4000

    const/16 v24, 0x2000

    if-nez v9, :cond_9

    invoke-interface {v3, v5}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_8

    move/from16 v9, v23

    goto :goto_7

    :cond_8
    move/from16 v9, v24

    :goto_7
    or-int/2addr v6, v9

    :cond_9
    const/high16 v9, 0x30000

    and-int v25, v0, v9

    const/high16 v26, 0x20000

    const/high16 v27, 0x10000

    if-nez v25, :cond_b

    move/from16 v25, v9

    move-object/from16 v9, p5

    invoke-interface {v3, v9}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v28

    if-eqz v28, :cond_a

    move/from16 v28, v26

    goto :goto_8

    :cond_a
    move/from16 v28, v27

    :goto_8
    or-int v6, v6, v28

    goto :goto_9

    :cond_b
    move/from16 v25, v9

    move-object/from16 v9, p5

    :goto_9
    const/high16 v28, 0x180000

    and-int v28, v0, v28

    if-nez v28, :cond_d

    move-object/from16 v2, p6

    invoke-interface {v3, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v29

    if-eqz v29, :cond_c

    const/high16 v29, 0x100000

    goto :goto_a

    :cond_c
    const/high16 v29, 0x80000

    :goto_a
    or-int v6, v6, v29

    goto :goto_b

    :cond_d
    move-object/from16 v2, p6

    :goto_b
    const/high16 v29, 0xc00000

    and-int v29, v0, v29

    if-nez v29, :cond_f

    move-object/from16 v0, p7

    invoke-interface {v3, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v29

    if-eqz v29, :cond_e

    const/high16 v29, 0x800000

    goto :goto_c

    :cond_e
    const/high16 v29, 0x400000

    :goto_c
    or-int v6, v6, v29

    goto :goto_d

    :cond_f
    move-object/from16 v0, p7

    :goto_d
    const/high16 v29, 0x6000000

    and-int v29, p17, v29

    if-nez v29, :cond_11

    move/from16 v0, p8

    invoke-interface {v3, v0}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v29

    if-eqz v29, :cond_10

    const/high16 v29, 0x4000000

    goto :goto_e

    :cond_10
    const/high16 v29, 0x2000000

    :goto_e
    or-int v6, v6, v29

    goto :goto_f

    :cond_11
    move/from16 v0, p8

    :goto_f
    const/high16 v29, 0x30000000

    and-int v29, p17, v29

    if-nez v29, :cond_13

    invoke-interface {v3, v10}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v29

    if-eqz v29, :cond_12

    const/high16 v29, 0x20000000

    goto :goto_10

    :cond_12
    const/high16 v29, 0x10000000

    :goto_10
    or-int v6, v6, v29

    :cond_13
    and-int/lit8 v29, v1, 0x6

    if-nez v29, :cond_15

    invoke-interface {v3, v11}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v29

    if-eqz v29, :cond_14

    const/16 v17, 0x4

    goto :goto_11

    :cond_14
    const/16 v17, 0x2

    :goto_11
    or-int v7, v7, v17

    :cond_15
    and-int/lit8 v17, v1, 0x30

    if-nez v17, :cond_17

    invoke-interface {v3, v12}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_16

    const/16 v16, 0x20

    :cond_16
    or-int v7, v7, v16

    :cond_17
    and-int/lit16 v0, v1, 0x180

    if-nez v0, :cond_19

    move-object/from16 v0, p12

    invoke-interface {v3, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_18

    goto :goto_12

    :cond_18
    move/from16 v18, v19

    :goto_12
    or-int v7, v7, v18

    goto :goto_13

    :cond_19
    move-object/from16 v0, p12

    :goto_13
    and-int/lit16 v0, v1, 0xc00

    if-nez v0, :cond_1b

    move-object/from16 v0, p13

    invoke-interface {v3, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_1a

    const/16 v21, 0x800

    :cond_1a
    or-int v7, v7, v21

    goto :goto_14

    :cond_1b
    move-object/from16 v0, p13

    :goto_14
    and-int/lit16 v0, v1, 0x6000

    if-nez v0, :cond_1d

    invoke-interface {v3, v15}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1c

    goto :goto_15

    :cond_1c
    move/from16 v23, v24

    :goto_15
    or-int v7, v7, v23

    :cond_1d
    and-int v0, v1, v25

    if-nez v0, :cond_1f

    move-object/from16 v0, p15

    invoke-interface {v3, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_1e

    goto :goto_16

    :cond_1e
    move/from16 v26, v27

    :goto_16
    or-int v7, v7, v26

    goto :goto_17

    :cond_1f
    move-object/from16 v0, p15

    :goto_17
    const v16, 0x12492493

    and-int v0, v6, v16

    const v1, 0x12492492

    const/16 v16, 0x0

    if-ne v0, v1, :cond_21

    const v0, 0x12493

    and-int/2addr v0, v7

    const v1, 0x12492

    if-eq v0, v1, :cond_20

    goto :goto_18

    :cond_20
    move/from16 v0, v16

    goto :goto_19

    :cond_21
    :goto_18
    const/4 v0, 0x1

    :goto_19
    and-int/lit8 v1, v6, 0x1

    invoke-interface {v3, v0, v1}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v0

    if-eqz v0, :cond_34

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_22

    const-string v0, "androidx.compose.material.CommonDecorationBox (TextFieldImpl.kt:78)"

    const v1, 0x145f34c6

    invoke-static {v1, v6, v7, v0}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 81
    :cond_22
    const v0, 0x5e1af583

    const-string v1, "CC(remember):TextFieldImpl.kt#9igjgp"

    invoke-static {v3, v0, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    and-int/lit8 v0, v6, 0x70

    const/16 v1, 0x20

    if-ne v0, v1, :cond_23

    const/4 v0, 0x1

    goto :goto_1a

    :cond_23
    move/from16 v0, v16

    :goto_1a
    and-int/lit16 v1, v6, 0x1c00

    const/16 v2, 0x800

    if-ne v1, v2, :cond_24

    const/4 v1, 0x1

    goto :goto_1b

    :cond_24
    move/from16 v1, v16

    :goto_1b
    or-int/2addr v0, v1

    .local v0, "invalid$iv":Z
    move-object v1, v3

    .local v1, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/4 v2, 0x0

    .line 382
    .local v2, "$i$f$cache":I
    move/from16 v23, v0

    .end local v0    # "invalid$iv":Z
    .local v23, "invalid$iv":Z
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v0

    .local v0, "it$iv":Ljava/lang/Object;
    const/16 v24, 0x0

    .line 383
    .local v24, "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez v23, :cond_26

    sget-object v17, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move/from16 v25, v2

    .end local v2    # "$i$f$cache":I
    .local v25, "$i$f$cache":I
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v2

    if-ne v0, v2, :cond_25

    goto :goto_1c

    .line 387
    :cond_25
    goto :goto_1d

    .line 383
    .end local v25    # "$i$f$cache":I
    .restart local v2    # "$i$f$cache":I
    :cond_26
    move/from16 v25, v2

    .line 384
    .end local v2    # "$i$f$cache":I
    .restart local v25    # "$i$f$cache":I
    :goto_1c
    const/4 v2, 0x0

    .line 82
    .local v2, "$i$a$-cache-TextFieldImplKt$CommonDecorationBox$transformedText$1":I
    new-instance v17, Landroidx/compose/ui/text/AnnotatedString;

    const/16 v21, 0x6

    const/16 v22, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object/from16 v18, v14

    invoke-direct/range {v17 .. v22}, Landroidx/compose/ui/text/AnnotatedString;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v14, v17

    invoke-interface {v4, v14}, Landroidx/compose/ui/text/input/VisualTransformation;->filter(Landroidx/compose/ui/text/AnnotatedString;)Landroidx/compose/ui/text/input/TransformedText;

    move-result-object v2

    .line 384
    .end local v2    # "$i$a$-cache-TextFieldImplKt$CommonDecorationBox$transformedText$1":I
    nop

    .line 385
    .local v2, "value$iv":Ljava/lang/Object;
    invoke-interface {v1, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 386
    move-object v0, v2

    .line 382
    .end local v0    # "it$iv":Ljava/lang/Object;
    .end local v2    # "value$iv":Ljava/lang/Object;
    .end local v24    # "$i$a$-let-ComposerKt$cache$1$iv":I
    :goto_1d
    nop

    .line 81
    .end local v1    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v23    # "invalid$iv":Z
    .end local v25    # "$i$f$cache":I
    check-cast v0, Landroidx/compose/ui/text/input/TransformedText;

    invoke-static {v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 84
    invoke-virtual {v0}, Landroidx/compose/ui/text/input/TransformedText;->getText()Landroidx/compose/ui/text/AnnotatedString;

    move-result-object v0

    .line 85
    invoke-virtual {v0}, Landroidx/compose/ui/text/AnnotatedString;->getText()Ljava/lang/String;

    move-result-object v0

    .line 80
    nop

    .line 87
    .local v0, "transformedText":Ljava/lang/String;
    shr-int/lit8 v1, v7, 0x3

    and-int/lit8 v1, v1, 0xe

    invoke-static {v12, v3, v1}, Landroidx/compose/foundation/interaction/FocusInteractionKt;->collectIsFocusedAsState(Landroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    move-result-object v1

    invoke-interface {v1}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    .line 89
    .local v1, "isFocused":Z
    nop

    .line 90
    if-eqz v1, :cond_27

    sget-object v2, Landroidx/compose/material/InputPhase;->Focused:Landroidx/compose/material/InputPhase;

    goto :goto_1f

    .line 91
    :cond_27
    move-object v2, v0

    check-cast v2, Ljava/lang/CharSequence;

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-nez v2, :cond_28

    const/4 v2, 0x1

    goto :goto_1e

    :cond_28
    move/from16 v2, v16

    :goto_1e
    if-eqz v2, :cond_29

    sget-object v2, Landroidx/compose/material/InputPhase;->UnfocusedEmpty:Landroidx/compose/material/InputPhase;

    goto :goto_1f

    .line 92
    :cond_29
    sget-object v2, Landroidx/compose/material/InputPhase;->UnfocusedNotEmpty:Landroidx/compose/material/InputPhase;

    .line 89
    :goto_1f
    nop

    .line 88
    nop

    .line 95
    .local v2, "inputState":Landroidx/compose/material/InputPhase;
    new-instance v14, Landroidx/compose/material/TextFieldImplKt$CommonDecorationBox$labelColor$1;

    invoke-direct {v14, v15, v10, v11, v12}, Landroidx/compose/material/TextFieldImplKt$CommonDecorationBox$labelColor$1;-><init>(Landroidx/compose/material/TextFieldColors;ZZLandroidx/compose/foundation/interaction/InteractionSource;)V

    check-cast v14, Lkotlin/jvm/functions/Function3;

    .line 107
    .local v14, "labelColor":Lkotlin/jvm/functions/Function3;
    move-object/from16 v17, v0

    .end local v0    # "transformedText":Ljava/lang/String;
    .local v17, "transformedText":Ljava/lang/String;
    sget-object v0, Landroidx/compose/material/MaterialTheme;->INSTANCE:Landroidx/compose/material/MaterialTheme;

    move/from16 v22, v1

    .end local v1    # "isFocused":Z
    .local v22, "isFocused":Z
    const/4 v1, 0x6

    invoke-virtual {v0, v3, v1}, Landroidx/compose/material/MaterialTheme;->getTypography(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/Typography;

    move-result-object v0

    .line 108
    .local v0, "typography":Landroidx/compose/material/Typography;
    invoke-virtual {v0}, Landroidx/compose/material/Typography;->getSubtitle1()Landroidx/compose/ui/text/TextStyle;

    move-result-object v23

    .line 109
    .local v23, "subtitle1":Landroidx/compose/ui/text/TextStyle;
    invoke-virtual {v0}, Landroidx/compose/material/Typography;->getCaption()Landroidx/compose/ui/text/TextStyle;

    move-result-object v24

    .line 111
    .local v24, "caption":Landroidx/compose/ui/text/TextStyle;
    move-object/from16 v25, v2

    .end local v2    # "inputState":Landroidx/compose/material/InputPhase;
    .local v25, "inputState":Landroidx/compose/material/InputPhase;
    invoke-virtual/range {v23 .. v23}, Landroidx/compose/ui/text/TextStyle;->getColor-0d7_KjU()J

    move-result-wide v1

    sget-object v19, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    move-result-wide v4

    invoke-static {v1, v2, v4, v5}, Landroidx/compose/ui/graphics/Color;->equals-impl0(JJ)Z

    move-result v1

    if-eqz v1, :cond_2a

    invoke-virtual/range {v24 .. v24}, Landroidx/compose/ui/text/TextStyle;->getColor-0d7_KjU()J

    move-result-wide v1

    sget-object v4, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    invoke-virtual {v4}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    move-result-wide v4

    invoke-static {v1, v2, v4, v5}, Landroidx/compose/ui/graphics/Color;->equals-impl0(JJ)Z

    move-result v1

    if-eqz v1, :cond_2b

    .line 112
    :cond_2a
    invoke-virtual/range {v23 .. v23}, Landroidx/compose/ui/text/TextStyle;->getColor-0d7_KjU()J

    move-result-wide v1

    sget-object v4, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    invoke-virtual {v4}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    move-result-wide v4

    invoke-static {v1, v2, v4, v5}, Landroidx/compose/ui/graphics/Color;->equals-impl0(JJ)Z

    move-result v1

    if-nez v1, :cond_2c

    invoke-virtual/range {v24 .. v24}, Landroidx/compose/ui/text/TextStyle;->getColor-0d7_KjU()J

    move-result-wide v1

    sget-object v4, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    invoke-virtual {v4}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    move-result-wide v4

    invoke-static {v1, v2, v4, v5}, Landroidx/compose/ui/graphics/Color;->equals-impl0(JJ)Z

    move-result v1

    if-eqz v1, :cond_2c

    :cond_2b
    const/16 v20, 0x1

    goto :goto_20

    :cond_2c
    move/from16 v20, v16

    .line 110
    :goto_20
    nop

    .line 114
    .local v20, "shouldOverrideTextStyleColor":Z
    sget-object v1, Landroidx/compose/material/TextFieldTransitionScope;->INSTANCE:Landroidx/compose/material/TextFieldTransitionScope;

    .line 115
    const v2, 0x5e1b98dd

    invoke-interface {v3, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v2, "*116@4383L10"

    invoke-static {v3, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 117
    sget-object v2, Landroidx/compose/material/MaterialTheme;->INSTANCE:Landroidx/compose/material/MaterialTheme;

    const/4 v4, 0x6

    invoke-virtual {v2, v3, v4}, Landroidx/compose/material/MaterialTheme;->getTypography(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/Typography;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/compose/material/Typography;->getCaption()Landroidx/compose/ui/text/TextStyle;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/compose/ui/text/TextStyle;->getColor-0d7_KjU()J

    move-result-wide v4

    .local v4, "$this$CommonDecorationBox_u24lambda_u242":J
    const/4 v2, 0x0

    .line 118
    .local v2, "$i$a$-with-TextFieldImplKt$CommonDecorationBox$1":I
    const-wide/16 v26, 0x10

    if-eqz v20, :cond_2f

    move-object/from16 v28, v0

    .end local v0    # "typography":Landroidx/compose/material/Typography;
    .local v28, "typography":Landroidx/compose/material/Typography;
    const v0, -0x5dbf364c

    invoke-interface {v3, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v0, "*117@4479L22"

    invoke-static {v3, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    move-wide/from16 v29, v4

    .local v29, "$this$takeOrElse_u2dDxMtmZc$iv":J
    const/4 v0, 0x0

    .line 388
    .local v0, "$i$f$takeOrElse-DxMtmZc":I
    move-wide/from16 v31, v29

    .local v31, "$this$isSpecified$iv$iv":J
    const/16 v19, 0x0

    .line 389
    .local v19, "$i$f$isSpecified-8_81llA":I
    cmp-long v21, v31, v26

    if-eqz v21, :cond_2d

    const/16 v19, 0x1

    goto :goto_21

    :cond_2d
    move/from16 v19, v16

    .line 388
    .end local v19    # "$i$f$isSpecified-8_81llA":I
    .end local v31    # "$this$isSpecified$iv$iv":J
    :goto_21
    if-eqz v19, :cond_2e

    move-object/from16 v31, v1

    move-object/from16 v1, v25

    goto :goto_22

    :cond_2e
    const/16 v19, 0x0

    .line 118
    .local v19, "$i$a$-takeOrElse-DxMtmZc-TextFieldImplKt$CommonDecorationBox$1$1":I
    move/from16 v21, v0

    .end local v0    # "$i$f$takeOrElse-DxMtmZc":I
    .local v21, "$i$f$takeOrElse-DxMtmZc":I
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    move-object/from16 v31, v1

    move-object/from16 v1, v25

    .end local v25    # "inputState":Landroidx/compose/material/InputPhase;
    .local v1, "inputState":Landroidx/compose/material/InputPhase;
    invoke-interface {v14, v1, v3, v0}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/ui/graphics/Color;

    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color;->unbox-impl()J

    move-result-wide v32

    .line 388
    .end local v19    # "$i$a$-takeOrElse-DxMtmZc-TextFieldImplKt$CommonDecorationBox$1$1":I
    move-wide/from16 v29, v32

    .line 118
    .end local v21    # "$i$f$takeOrElse-DxMtmZc":I
    .end local v29    # "$this$takeOrElse_u2dDxMtmZc$iv":J
    :goto_22
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    goto :goto_23

    .line 119
    .end local v1    # "inputState":Landroidx/compose/material/InputPhase;
    .end local v28    # "typography":Landroidx/compose/material/Typography;
    .local v0, "typography":Landroidx/compose/material/Typography;
    .restart local v25    # "inputState":Landroidx/compose/material/InputPhase;
    :cond_2f
    move-object/from16 v28, v0

    move-object/from16 v31, v1

    move-object/from16 v1, v25

    .end local v0    # "typography":Landroidx/compose/material/Typography;
    .end local v25    # "inputState":Landroidx/compose/material/InputPhase;
    .restart local v1    # "inputState":Landroidx/compose/material/InputPhase;
    .restart local v28    # "typography":Landroidx/compose/material/Typography;
    const v0, 0x2e863f4d

    invoke-interface {v3, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    move-wide/from16 v29, v4

    .line 118
    :goto_23
    nop

    .line 119
    nop

    .line 117
    .end local v2    # "$i$a$-with-TextFieldImplKt$CommonDecorationBox$1":I
    .end local v4    # "$this$CommonDecorationBox_u24lambda_u242":J
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    const v0, 0x5e1bb53f

    invoke-interface {v3, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v0, "*121@4610L10"

    invoke-static {v3, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 122
    sget-object v0, Landroidx/compose/material/MaterialTheme;->INSTANCE:Landroidx/compose/material/MaterialTheme;

    const/4 v4, 0x6

    invoke-virtual {v0, v3, v4}, Landroidx/compose/material/MaterialTheme;->getTypography(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/Typography;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/material/Typography;->getSubtitle1()Landroidx/compose/ui/text/TextStyle;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/ui/text/TextStyle;->getColor-0d7_KjU()J

    move-result-wide v4

    .local v4, "$this$CommonDecorationBox_u24lambda_u244":J
    const/4 v0, 0x0

    .line 123
    .local v0, "$i$a$-with-TextFieldImplKt$CommonDecorationBox$2":I
    if-eqz v20, :cond_32

    const v2, -0x5dbbbeec

    invoke-interface {v3, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v2, "*122@4708L22"

    invoke-static {v3, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    move-wide/from16 v18, v4

    .local v18, "$this$takeOrElse_u2dDxMtmZc$iv":J
    const/4 v2, 0x0

    .line 390
    .local v2, "$i$f$takeOrElse-DxMtmZc":I
    move-wide/from16 v32, v18

    .local v32, "$this$isSpecified$iv$iv":J
    const/16 v21, 0x0

    .line 391
    .local v21, "$i$f$isSpecified-8_81llA":I
    cmp-long v25, v32, v26

    if-eqz v25, :cond_30

    const/16 v21, 0x1

    goto :goto_24

    :cond_30
    move/from16 v21, v16

    .line 390
    .end local v21    # "$i$f$isSpecified-8_81llA":I
    .end local v32    # "$this$isSpecified$iv$iv":J
    :goto_24
    if-eqz v21, :cond_31

    move/from16 v25, v0

    goto :goto_25

    :cond_31
    const/16 v21, 0x0

    .line 123
    .local v21, "$i$a$-takeOrElse-DxMtmZc-TextFieldImplKt$CommonDecorationBox$2$1":I
    move/from16 v25, v0

    .end local v0    # "$i$a$-with-TextFieldImplKt$CommonDecorationBox$2":I
    .local v25, "$i$a$-with-TextFieldImplKt$CommonDecorationBox$2":I
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v14, v1, v3, v0}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/ui/graphics/Color;

    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color;->unbox-impl()J

    move-result-wide v26

    .line 390
    .end local v21    # "$i$a$-takeOrElse-DxMtmZc-TextFieldImplKt$CommonDecorationBox$2$1":I
    move-wide/from16 v18, v26

    .line 123
    .end local v2    # "$i$f$takeOrElse-DxMtmZc":I
    .end local v18    # "$this$takeOrElse_u2dDxMtmZc$iv":J
    :goto_25
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    move-wide/from16 v26, v18

    goto :goto_26

    .line 124
    .end local v25    # "$i$a$-with-TextFieldImplKt$CommonDecorationBox$2":I
    .restart local v0    # "$i$a$-with-TextFieldImplKt$CommonDecorationBox$2":I
    :cond_32
    move/from16 v25, v0

    .end local v0    # "$i$a$-with-TextFieldImplKt$CommonDecorationBox$2":I
    .restart local v25    # "$i$a$-with-TextFieldImplKt$CommonDecorationBox$2":I
    const v0, 0x2e865bed

    invoke-interface {v3, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    move-wide/from16 v26, v4

    .line 123
    :goto_26
    nop

    .line 124
    nop

    .line 122
    .end local v4    # "$this$CommonDecorationBox_u24lambda_u244":J
    .end local v25    # "$i$a$-with-TextFieldImplKt$CommonDecorationBox$2":I
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 126
    nop

    .line 127
    if-eqz p4, :cond_33

    const/4 v0, 0x1

    goto :goto_27

    :cond_33
    move/from16 v0, v16

    .line 128
    :goto_27
    new-instance v5, Landroidx/compose/material/TextFieldImplKt$CommonDecorationBox$3;

    move/from16 v18, p8

    move-object/from16 v19, p12

    move-object/from16 v21, p15

    move/from16 v32, v6

    move/from16 v25, v7

    move-object/from16 v16, v8

    move-object v7, v9

    move-object v2, v14

    move-object v9, v15

    move-object/from16 v8, v17

    move-object/from16 v6, p4

    move-object/from16 v14, p7

    move-object/from16 v15, p13

    move-object/from16 v17, v13

    move-object/from16 v13, p6

    .end local v6    # "$dirty":I
    .end local v7    # "$dirty1":I
    .end local v14    # "labelColor":Lkotlin/jvm/functions/Function3;
    .end local v17    # "transformedText":Ljava/lang/String;
    .local v2, "labelColor":Lkotlin/jvm/functions/Function3;
    .local v8, "transformedText":Ljava/lang/String;
    .local v25, "$dirty1":I
    .local v32, "$dirty":I
    invoke-direct/range {v5 .. v21}, Landroidx/compose/material/TextFieldImplKt$CommonDecorationBox$3;-><init>(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Ljava/lang/String;Landroidx/compose/material/TextFieldColors;ZZLandroidx/compose/foundation/interaction/InteractionSource;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldType;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/foundation/layout/PaddingValues;ZLkotlin/jvm/functions/Function2;)V

    move-object/from16 v17, v8

    .end local v8    # "transformedText":Ljava/lang/String;
    .restart local v17    # "transformedText":Ljava/lang/String;
    const/16 v4, 0x36

    const v6, 0xd71bbe3

    const/4 v7, 0x1

    invoke-static {v6, v7, v5, v3, v4}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v4

    move-object v13, v4

    check-cast v13, Lkotlin/jvm/functions/Function6;

    .line 114
    const/high16 v15, 0x1b0000

    move v12, v0

    move-object v6, v1

    move-object v11, v2

    move-object v14, v3

    move-wide/from16 v9, v26

    move-wide/from16 v7, v29

    move-object/from16 v5, v31

    .end local v1    # "inputState":Landroidx/compose/material/InputPhase;
    .end local v2    # "labelColor":Lkotlin/jvm/functions/Function3;
    .end local v3    # "$composer":Landroidx/compose/runtime/Composer;
    .local v6, "inputState":Landroidx/compose/material/InputPhase;
    .local v11, "labelColor":Lkotlin/jvm/functions/Function3;
    .local v14, "$composer":Landroidx/compose/runtime/Composer;
    invoke-virtual/range {v5 .. v15}, Landroidx/compose/material/TextFieldTransitionScope;->Transition-DTcfvLk(Landroidx/compose/material/InputPhase;JJLkotlin/jvm/functions/Function3;ZLkotlin/jvm/functions/Function6;Landroidx/compose/runtime/Composer;I)V

    move-object/from16 v19, v14

    .end local v6    # "inputState":Landroidx/compose/material/InputPhase;
    .end local v11    # "labelColor":Lkotlin/jvm/functions/Function3;
    .end local v14    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v1    # "inputState":Landroidx/compose/material/InputPhase;
    .restart local v2    # "labelColor":Lkotlin/jvm/functions/Function3;
    .local v19, "$composer":Landroidx/compose/runtime/Composer;
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_35

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .end local v1    # "inputState":Landroidx/compose/material/InputPhase;
    .end local v2    # "labelColor":Lkotlin/jvm/functions/Function3;
    .end local v17    # "transformedText":Ljava/lang/String;
    .end local v20    # "shouldOverrideTextStyleColor":Z
    .end local v22    # "isFocused":Z
    .end local v23    # "subtitle1":Landroidx/compose/ui/text/TextStyle;
    .end local v24    # "caption":Landroidx/compose/ui/text/TextStyle;
    .end local v28    # "typography":Landroidx/compose/material/Typography;
    goto :goto_28

    .line 227
    .end local v19    # "$composer":Landroidx/compose/runtime/Composer;
    .end local v25    # "$dirty1":I
    .end local v32    # "$dirty":I
    .restart local v3    # "$composer":Landroidx/compose/runtime/Composer;
    .local v6, "$dirty":I
    .restart local v7    # "$dirty1":I
    :cond_34
    move-object/from16 v19, v3

    move/from16 v32, v6

    move/from16 v25, v7

    .end local v3    # "$composer":Landroidx/compose/runtime/Composer;
    .end local v6    # "$dirty":I
    .end local v7    # "$dirty1":I
    .restart local v19    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v25    # "$dirty1":I
    .restart local v32    # "$dirty":I
    invoke-interface/range {v19 .. v19}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    :cond_35
    :goto_28
    invoke-interface/range {v19 .. v19}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v0

    if-eqz v0, :cond_36

    move-object v1, v0

    new-instance v0, Landroidx/compose/material/TextFieldImplKt$CommonDecorationBox$4;

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move/from16 v9, p8

    move/from16 v10, p9

    move/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    move-object/from16 v16, p15

    move/from16 v17, p17

    move/from16 v18, p18

    move-object/from16 v34, v1

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v18}, Landroidx/compose/material/TextFieldImplKt$CommonDecorationBox$4;-><init>(Landroidx/compose/material/TextFieldType;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Lkotlin/jvm/functions/Function2;II)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    move-object/from16 v1, v34

    invoke-interface {v1, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_36
    return-void
.end method

.method public static final Decoration-euL9pac(JLandroidx/compose/ui/text/TextStyle;Ljava/lang/Float;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V
    .locals 12
    .param p0, "contentColor"    # J
    .param p2, "typography"    # Landroidx/compose/ui/text/TextStyle;
    .param p3, "contentAlpha"    # Ljava/lang/Float;
    .param p4, "content"    # Lkotlin/jvm/functions/Function2;
    .param p5, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p6, "$changed"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Landroidx/compose/ui/text/TextStyle;",
            "Ljava/lang/Float;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    .line 237
    move-object/from16 v5, p4

    move/from16 v6, p6

    const v0, -0x17cfc8dc

    move-object/from16 v1, p5

    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v8

    .end local p5    # "$composer":Landroidx/compose/runtime/Composer;
    .local v8, "$composer":Landroidx/compose/runtime/Composer;
    const-string v1, "C(Decoration)P(2:c#ui.graphics.Color,3,1)238@9666L548:TextFieldImpl.kt#jmzs0o"

    invoke-static {v8, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    move/from16 v1, p6

    .local v1, "$dirty":I
    and-int/lit8 v2, p7, 0x1

    if-eqz v2, :cond_0

    or-int/lit8 v1, v1, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v2, v6, 0x6

    if-nez v2, :cond_2

    invoke-interface {v8, p0, p1}, Landroidx/compose/runtime/Composer;->changed(J)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x4

    goto :goto_0

    :cond_1
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v1, v2

    :cond_2
    :goto_1
    and-int/lit8 v2, p7, 0x2

    if-eqz v2, :cond_3

    or-int/lit8 v1, v1, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v3, v6, 0x30

    if-nez v3, :cond_5

    invoke-interface {v8, p2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    const/16 v4, 0x20

    goto :goto_2

    :cond_4
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v1, v4

    :cond_5
    :goto_3
    and-int/lit8 v4, p7, 0x4

    if-eqz v4, :cond_6

    or-int/lit16 v1, v1, 0x180

    goto :goto_5

    :cond_6
    and-int/lit16 v7, v6, 0x180

    if-nez v7, :cond_8

    invoke-interface {v8, p3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_7

    const/16 v9, 0x100

    goto :goto_4

    :cond_7
    const/16 v9, 0x80

    :goto_4
    or-int/2addr v1, v9

    :cond_8
    :goto_5
    and-int/lit8 v9, p7, 0x8

    if-eqz v9, :cond_9

    or-int/lit16 v1, v1, 0xc00

    goto :goto_7

    :cond_9
    and-int/lit16 v9, v6, 0xc00

    if-nez v9, :cond_b

    invoke-interface {v8, v5}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_a

    const/16 v9, 0x800

    goto :goto_6

    :cond_a
    const/16 v9, 0x400

    :goto_6
    or-int/2addr v1, v9

    :cond_b
    :goto_7
    move v9, v1

    .end local v1    # "$dirty":I
    .local v9, "$dirty":I
    and-int/lit16 v1, v9, 0x493

    const/16 v10, 0x492

    const/4 v11, 0x1

    if-eq v1, v10, :cond_c

    move v1, v11

    goto :goto_8

    :cond_c
    const/4 v1, 0x0

    :goto_8
    and-int/lit8 v10, v9, 0x1

    invoke-interface {v8, v1, v10}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v1

    if-eqz v1, :cond_12

    if-eqz v2, :cond_d

    .line 234
    const/4 v1, 0x0

    .end local p2    # "typography":Landroidx/compose/ui/text/TextStyle;
    .local v1, "typography":Landroidx/compose/ui/text/TextStyle;
    goto :goto_9

    .line 237
    .end local v1    # "typography":Landroidx/compose/ui/text/TextStyle;
    .restart local p2    # "typography":Landroidx/compose/ui/text/TextStyle;
    :cond_d
    move-object v1, p2

    .line 234
    .end local p2    # "typography":Landroidx/compose/ui/text/TextStyle;
    .restart local v1    # "typography":Landroidx/compose/ui/text/TextStyle;
    :goto_9
    if-eqz v4, :cond_e

    .line 235
    const/4 v2, 0x0

    .end local p3    # "contentAlpha":Ljava/lang/Float;
    .local v2, "contentAlpha":Ljava/lang/Float;
    goto :goto_a

    .line 234
    .end local v2    # "contentAlpha":Ljava/lang/Float;
    .restart local p3    # "contentAlpha":Ljava/lang/Float;
    :cond_e
    move-object v2, p3

    .line 235
    .end local p3    # "contentAlpha":Ljava/lang/Float;
    .restart local v2    # "contentAlpha":Ljava/lang/Float;
    :goto_a
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v3

    if-eqz v3, :cond_f

    .line 237
    const/4 v3, -0x1

    const-string v4, "androidx.compose.material.Decoration (TextFieldImpl.kt:236)"

    invoke-static {v0, v9, v3, v4}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 239
    :cond_f
    new-instance v0, Landroidx/compose/material/TextFieldImplKt$Decoration$colorAndEmphasis$1;

    invoke-direct {v0, p0, p1, v2, v5}, Landroidx/compose/material/TextFieldImplKt$Decoration$colorAndEmphasis$1;-><init>(JLjava/lang/Float;Lkotlin/jvm/functions/Function2;)V

    const/16 v3, 0x36

    const v4, 0x1d7c49ae

    invoke-static {v4, v11, v0, v8, v3}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v0

    check-cast v0, Lkotlin/jvm/functions/Function2;

    .line 238
    nop

    .line 254
    .local v0, "colorAndEmphasis":Lkotlin/jvm/functions/Function2;
    if-eqz v1, :cond_10

    const v3, 0x7e1f5024

    invoke-interface {v8, v3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v3, "253@10243L46"

    invoke-static {v8, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    shr-int/lit8 v3, v9, 0x3

    and-int/lit8 v3, v3, 0xe

    or-int/lit8 v3, v3, 0x30

    invoke-static {v1, v0, v8, v3}, Landroidx/compose/material/TextKt;->ProvideTextStyle(Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    goto :goto_b

    :cond_10
    const v3, 0x7e1f5688

    invoke-interface {v8, v3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v3, "253@10295L18"

    invoke-static {v8, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    const/4 v3, 0x6

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v0, v8, v3}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_b
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v3

    if-eqz v3, :cond_11

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 255
    .end local v0    # "colorAndEmphasis":Lkotlin/jvm/functions/Function2;
    :cond_11
    move-object v3, v1

    move-object v4, v2

    goto :goto_c

    .end local v1    # "typography":Landroidx/compose/ui/text/TextStyle;
    .end local v2    # "contentAlpha":Ljava/lang/Float;
    .restart local p2    # "typography":Landroidx/compose/ui/text/TextStyle;
    .restart local p3    # "contentAlpha":Ljava/lang/Float;
    :cond_12
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object v3, p2

    move-object v4, p3

    .end local p2    # "typography":Landroidx/compose/ui/text/TextStyle;
    .end local p3    # "contentAlpha":Ljava/lang/Float;
    .local v3, "typography":Landroidx/compose/ui/text/TextStyle;
    .local v4, "contentAlpha":Ljava/lang/Float;
    :goto_c
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v10

    if-eqz v10, :cond_13

    new-instance v0, Landroidx/compose/material/TextFieldImplKt$Decoration$1;

    move-wide v1, p0

    move/from16 v7, p7

    invoke-direct/range {v0 .. v7}, Landroidx/compose/material/TextFieldImplKt$Decoration$1;-><init>(JLandroidx/compose/ui/text/TextStyle;Ljava/lang/Float;Lkotlin/jvm/functions/Function2;II)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    invoke-interface {v10, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_13
    return-void
.end method

.method public static final defaultErrorSemantics(Landroidx/compose/ui/Modifier;ZLjava/lang/String;)Landroidx/compose/ui/Modifier;
    .locals 4
    .param p0, "$this$defaultErrorSemantics"    # Landroidx/compose/ui/Modifier;
    .param p1, "isError"    # Z
    .param p2, "defaultErrorMessage"    # Ljava/lang/String;

    .line 262
    if-eqz p1, :cond_0

    new-instance v0, Landroidx/compose/material/TextFieldImplKt$defaultErrorSemantics$1;

    invoke-direct {v0, p2}, Landroidx/compose/material/TextFieldImplKt$defaultErrorSemantics$1;-><init>(Ljava/lang/String;)V

    check-cast v0, Lkotlin/jvm/functions/Function1;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {p0, v3, v0, v1, v2}, Landroidx/compose/ui/semantics/SemanticsModifierKt;->semantics$default(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, p0

    :goto_0
    return-object v0
.end method

.method public static final getHorizontalIconPadding()F
    .locals 1

    .line 380
    sget v0, Landroidx/compose/material/TextFieldImplKt;->HorizontalIconPadding:F

    return v0
.end method

.method public static final getLayoutId(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Ljava/lang/Object;
    .locals 3
    .param p0, "$this$layoutId"    # Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .line 367
    invoke-interface {p0}, Landroidx/compose/ui/layout/IntrinsicMeasurable;->getParentData()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Landroidx/compose/ui/layout/LayoutIdParentData;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Landroidx/compose/ui/layout/LayoutIdParentData;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_1

    invoke-interface {v0}, Landroidx/compose/ui/layout/LayoutIdParentData;->getLayoutId()Ljava/lang/Object;

    move-result-object v2

    :cond_1
    return-object v2
.end method

.method public static final getTextFieldPadding()F
    .locals 1

    .line 379
    sget v0, Landroidx/compose/material/TextFieldImplKt;->TextFieldPadding:F

    return v0
.end method

.method public static final heightOrZero(Landroidx/compose/ui/layout/Placeable;)I
    .locals 1
    .param p0, "placeable"    # Landroidx/compose/ui/layout/Placeable;

    .line 266
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static final widthOrZero(Landroidx/compose/ui/layout/Placeable;)I
    .locals 1
    .param p0, "placeable"    # Landroidx/compose/ui/layout/Placeable;

    .line 264
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
