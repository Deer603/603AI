.class public final Landroidx/compose/foundation/text/CoreTextFieldKt;
.super Ljava/lang/Object;
.source "CoreTextField.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCoreTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/CoreTextFieldKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 9 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 10 Composer.kt\nandroidx/compose/runtime/Updater\n+ 11 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 12 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 13 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 14 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1129:1\n1247#2,6:1130\n1247#2,6:1136\n1247#2,6:1142\n1247#2,6:1154\n1247#2,3:1160\n1250#2,3:1164\n1247#2,6:1167\n1247#2,6:1173\n1247#2,3:1186\n1250#2,3:1190\n1247#2,6:1193\n1247#2,6:1199\n1247#2,6:1208\n1247#2,6:1214\n1247#2,6:1220\n1247#2,6:1226\n1247#2,6:1232\n1247#2,6:1238\n1247#2,6:1244\n1247#2,6:1250\n1247#2,6:1256\n1247#2,6:1263\n1247#2,6:1312\n1247#2,6:1319\n1247#2,6:1325\n1247#2,6:1331\n75#3:1148\n75#3:1149\n75#3:1150\n75#3:1151\n75#3:1152\n75#3:1153\n75#3:1205\n75#3:1206\n75#3:1207\n75#3:1262\n75#3:1318\n1#4:1163\n557#5:1179\n554#5,6:1180\n555#6:1189\n70#7:1269\n67#7,9:1270\n77#7:1309\n79#8,6:1279\n86#8,3:1294\n89#8,2:1303\n93#8:1308\n347#9,9:1285\n356#9,3:1305\n4206#10,6:1297\n59#11:1310\n90#12:1311\n602#13,8:1337\n85#14:1345\n*S KotlinDebug\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/CoreTextFieldKt\n*L\n206#1:1130,6\n207#1:1136,6\n208#1:1142,6\n225#1:1154,6\n239#1:1160,3\n239#1:1164,3\n253#1:1167,6\n282#1:1173,6\n285#1:1186,3\n285#1:1190,3\n286#1:1193,6\n288#1:1199,6\n308#1:1208,6\n344#1:1214,6\n370#1:1220,6\n371#1:1226,6\n400#1:1232,6\n418#1:1238,6\n471#1:1244,6\n473#1:1250,6\n505#1:1256,6\n524#1:1263,6\n1068#1:1312,6\n1071#1:1319,6\n1073#1:1325,6\n1085#1:1331,6\n213#1:1148\n214#1:1149\n215#1:1150\n216#1:1151\n217#1:1152\n218#1:1153\n294#1:1205\n296#1:1206\n297#1:1207\n522#1:1262\n1069#1:1318\n285#1:1179\n285#1:1180,6\n285#1:1189\n670#1:1269\n670#1:1270,9\n670#1:1309\n670#1:1279,6\n670#1:1294,3\n670#1:1303,2\n670#1:1308\n670#1:1285,9\n670#1:1305,3\n670#1:1297,6\n1012#1:1310\n1012#1:1311\n1114#1:1337,8\n343#1:1345\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00a2\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001a\u00fa\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t2\u0008\u0008\u0002\u0010\n\u001a\u00020\u000b2\u0014\u0008\u0002\u0010\u000c\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\u00052\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u00112\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u00132\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u00152\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u00152\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u00182\u0008\u0008\u0002\u0010\u0019\u001a\u00020\u001a2\u0008\u0008\u0002\u0010\u001b\u001a\u00020\u00132\u0008\u0008\u0002\u0010\u001c\u001a\u00020\u001323\u0008\u0002\u0010\u001d\u001a-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00010\u001e\u00a2\u0006\u0002\u0008\u001f\u00a2\u0006\u000c\u0008 \u0012\u0008\u0008!\u0012\u0004\u0008\u0008(\"\u0012\u0004\u0012\u00020\u00010\u0005\u00a2\u0006\u0002\u0008\u001f2\n\u0008\u0002\u0010#\u001a\u0004\u0018\u00010$H\u0001\u00a2\u0006\u0002\u0010%\u001a0\u0010&\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\'\u001a\u00020(2\u0011\u0010)\u001a\r\u0012\u0004\u0012\u00020\u00010\u001e\u00a2\u0006\u0002\u0008\u001fH\u0003\u00a2\u0006\u0002\u0010*\u001a\u001d\u0010+\u001a\u00020\u00012\u0006\u0010\'\u001a\u00020(2\u0006\u0010,\u001a\u00020\u0013H\u0003\u00a2\u0006\u0002\u0010-\u001a\u0015\u0010.\u001a\u00020\u00012\u0006\u0010\'\u001a\u00020(H\u0001\u00a2\u0006\u0002\u0010/\u001a\u0010\u00100\u001a\u00020\u00012\u0006\u00101\u001a\u000202H\u0002\u001a \u00103\u001a\u00020\u00012\u0006\u00101\u001a\u0002022\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u00104\u001a\u000205H\u0002\u001a0\u00106\u001a\u00020\u00012\u0006\u00107\u001a\u0002082\u0006\u00101\u001a\u0002022\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u00104\u001a\u000205H\u0002\u001a \u00109\u001a\u00020\u00012\u0006\u00101\u001a\u0002022\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020\u0013H\u0000\u001a2\u0010=\u001a\u00020\u0001*\u00020>2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020\r2\u0006\u00104\u001a\u000205H\u0080@\u00a2\u0006\u0002\u0010B\u001a\u001c\u0010C\u001a\u00020\u0007*\u00020\u00072\u0006\u00101\u001a\u0002022\u0006\u0010\'\u001a\u00020(H\u0002\u00a8\u0006D\u00b2\u0006\n\u0010E\u001a\u00020\u0013X\u008a\u0084\u0002"
    }
    d2 = {
        "CoreTextField",
        "",
        "value",
        "Landroidx/compose/ui/text/input/TextFieldValue;",
        "onValueChange",
        "Lkotlin/Function1;",
        "modifier",
        "Landroidx/compose/ui/Modifier;",
        "textStyle",
        "Landroidx/compose/ui/text/TextStyle;",
        "visualTransformation",
        "Landroidx/compose/ui/text/input/VisualTransformation;",
        "onTextLayout",
        "Landroidx/compose/ui/text/TextLayoutResult;",
        "interactionSource",
        "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
        "cursorBrush",
        "Landroidx/compose/ui/graphics/Brush;",
        "softWrap",
        "",
        "maxLines",
        "",
        "minLines",
        "imeOptions",
        "Landroidx/compose/ui/text/input/ImeOptions;",
        "keyboardActions",
        "Landroidx/compose/foundation/text/KeyboardActions;",
        "enabled",
        "readOnly",
        "decorationBox",
        "Lkotlin/Function0;",
        "Landroidx/compose/runtime/Composable;",
        "Lkotlin/ParameterName;",
        "name",
        "innerTextField",
        "textScrollerPosition",
        "Landroidx/compose/foundation/text/TextFieldScrollerPosition;",
        "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;ZIILandroidx/compose/ui/text/input/ImeOptions;Landroidx/compose/foundation/text/KeyboardActions;ZZLkotlin/jvm/functions/Function3;Landroidx/compose/foundation/text/TextFieldScrollerPosition;Landroidx/compose/runtime/Composer;III)V",
        "CoreTextFieldRootBox",
        "manager",
        "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;",
        "content",
        "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V",
        "SelectionToolbarAndHandles",
        "show",
        "(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;ZLandroidx/compose/runtime/Composer;I)V",
        "TextFieldCursorHandle",
        "(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroidx/compose/runtime/Composer;I)V",
        "endInputSession",
        "state",
        "Landroidx/compose/foundation/text/LegacyTextFieldState;",
        "notifyFocusedRect",
        "offsetMapping",
        "Landroidx/compose/ui/text/input/OffsetMapping;",
        "startInputSession",
        "textInputService",
        "Landroidx/compose/ui/text/input/TextInputService;",
        "tapToFocus",
        "focusRequester",
        "Landroidx/compose/ui/focus/FocusRequester;",
        "allowKeyboard",
        "bringSelectionEndIntoView",
        "Landroidx/compose/foundation/relocation/BringIntoViewRequester;",
        "textDelegate",
        "Landroidx/compose/foundation/text/TextDelegate;",
        "textLayoutResult",
        "(Landroidx/compose/foundation/relocation/BringIntoViewRequester;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/foundation/text/TextDelegate;Landroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/text/input/OffsetMapping;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "previewKeyEventToDeselectOnBack",
        "foundation_release",
        "writeable"
    }
    k = 0x2
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final CoreTextField(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;ZIILandroidx/compose/ui/text/input/ImeOptions;Landroidx/compose/foundation/text/KeyboardActions;ZZLkotlin/jvm/functions/Function3;Landroidx/compose/foundation/text/TextFieldScrollerPosition;Landroidx/compose/runtime/Composer;III)V
    .locals 61
    .param p0, "value"    # Landroidx/compose/ui/text/input/TextFieldValue;
    .param p1, "onValueChange"    # Lkotlin/jvm/functions/Function1;
    .param p2, "modifier"    # Landroidx/compose/ui/Modifier;
    .param p3, "textStyle"    # Landroidx/compose/ui/text/TextStyle;
    .param p4, "visualTransformation"    # Landroidx/compose/ui/text/input/VisualTransformation;
    .param p5, "onTextLayout"    # Lkotlin/jvm/functions/Function1;
    .param p6, "interactionSource"    # Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .param p7, "cursorBrush"    # Landroidx/compose/ui/graphics/Brush;
    .param p8, "softWrap"    # Z
    .param p9, "maxLines"    # I
    .param p10, "minLines"    # I
    .param p11, "imeOptions"    # Landroidx/compose/ui/text/input/ImeOptions;
    .param p12, "keyboardActions"    # Landroidx/compose/foundation/text/KeyboardActions;
    .param p13, "enabled"    # Z
    .param p14, "readOnly"    # Z
    .param p15, "decorationBox"    # Lkotlin/jvm/functions/Function3;
    .param p16, "textScrollerPosition"    # Landroidx/compose/foundation/text/TextFieldScrollerPosition;
    .param p17, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p18, "$changed"    # I
    .param p19, "$changed1"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/text/input/TextFieldValue;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/ui/text/input/TextFieldValue;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/ui/text/TextStyle;",
            "Landroidx/compose/ui/text/input/VisualTransformation;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/ui/text/TextLayoutResult;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
            "Landroidx/compose/ui/graphics/Brush;",
            "ZII",
            "Landroidx/compose/ui/text/input/ImeOptions;",
            "Landroidx/compose/foundation/text/KeyboardActions;",
            "ZZ",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/foundation/text/TextFieldScrollerPosition;",
            "Landroidx/compose/runtime/Composer;",
            "III)V"
        }
    .end annotation

    .line 205
    move-object/from16 v1, p0

    move/from16 v0, p18

    move/from16 v2, p19

    move/from16 v3, p20

    const v4, -0xe934732

    move-object/from16 v5, p17

    invoke-interface {v5, v4}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v4

    .end local p17    # "$composer":Landroidx/compose/runtime/Composer;
    .local v4, "$composer":Landroidx/compose/runtime/Composer;
    const-string v5, "C(CoreTextField)P(15,10,8,14,16,9,4!1,12,6,7,3,5,2,11)205@11555L29,206@11625L58,207@11729L72,212@11859L7,213@11920L7,214@11988L7,215@12053L7,216@12098L7,217@12167L7,238@13009L277,250@13591L21,252@13637L451,281@14487L26,284@14580L24,285@14638L37,287@14695L51,293@14984L7,295@15079L7,296@15136L7,307@15466L1513,342@17086L42,343@17154L970,343@17133L991,369@18194L28,370@18290L991,399@19571L576,417@20218L1605,470@22434L48,470@22408L74,472@22517L502,472@22488L531,504@23693L987,521@24743L7,523@24812L151,554@26109L5402,554@26056L5455:CoreTextField.kt#423gt5"

    invoke-static {v4, v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    move/from16 v5, p18

    .local v5, "$dirty":I
    move/from16 v6, p19

    .local v6, "$dirty1":I
    and-int/lit8 v7, v3, 0x1

    if-eqz v7, :cond_0

    or-int/lit8 v5, v5, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v7, v0, 0x6

    if-nez v7, :cond_2

    invoke-interface {v4, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    const/4 v7, 0x4

    goto :goto_0

    :cond_1
    const/4 v7, 0x2

    :goto_0
    or-int/2addr v5, v7

    :cond_2
    :goto_1
    and-int/lit8 v7, v3, 0x2

    if-eqz v7, :cond_3

    or-int/lit8 v5, v5, 0x30

    move-object/from16 v7, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v7, v0, 0x30

    if-nez v7, :cond_5

    move-object/from16 v7, p1

    invoke-interface {v4, v7}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_4

    const/16 v12, 0x20

    goto :goto_2

    :cond_4
    const/16 v12, 0x10

    :goto_2
    or-int/2addr v5, v12

    goto :goto_3

    :cond_5
    move-object/from16 v7, p1

    :goto_3
    and-int/lit8 v12, v3, 0x4

    if-eqz v12, :cond_6

    or-int/lit16 v5, v5, 0x180

    move-object/from16 v15, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v15, v0, 0x180

    if-nez v15, :cond_8

    move-object/from16 v15, p2

    invoke-interface {v4, v15}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_7

    const/16 v16, 0x100

    goto :goto_4

    :cond_7
    const/16 v16, 0x80

    :goto_4
    or-int v5, v5, v16

    goto :goto_5

    :cond_8
    move-object/from16 v15, p2

    :goto_5
    and-int/lit8 v16, v3, 0x8

    const/16 v17, 0x400

    if-eqz v16, :cond_9

    or-int/lit16 v5, v5, 0xc00

    move-object/from16 v13, p3

    goto :goto_7

    :cond_9
    and-int/lit16 v13, v0, 0xc00

    if-nez v13, :cond_b

    move-object/from16 v13, p3

    invoke-interface {v4, v13}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_a

    const/16 v19, 0x800

    goto :goto_6

    :cond_a
    move/from16 v19, v17

    :goto_6
    or-int v5, v5, v19

    goto :goto_7

    :cond_b
    move-object/from16 v13, p3

    :goto_7
    and-int/lit8 v19, v3, 0x10

    if-eqz v19, :cond_c

    or-int/lit16 v5, v5, 0x6000

    move-object/from16 v8, p4

    goto :goto_9

    :cond_c
    and-int/lit16 v8, v0, 0x6000

    if-nez v8, :cond_e

    move-object/from16 v8, p4

    invoke-interface {v4, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v22

    if-eqz v22, :cond_d

    const/16 v22, 0x4000

    goto :goto_8

    :cond_d
    const/16 v22, 0x2000

    :goto_8
    or-int v5, v5, v22

    goto :goto_9

    :cond_e
    move-object/from16 v8, p4

    :goto_9
    and-int/lit8 v22, v3, 0x20

    const/high16 v23, 0x30000

    if-eqz v22, :cond_f

    or-int v5, v5, v23

    move-object/from16 v11, p5

    goto :goto_b

    :cond_f
    and-int v24, v0, v23

    if-nez v24, :cond_11

    move-object/from16 v11, p5

    invoke-interface {v4, v11}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v25

    if-eqz v25, :cond_10

    const/high16 v25, 0x20000

    goto :goto_a

    :cond_10
    const/high16 v25, 0x10000

    :goto_a
    or-int v5, v5, v25

    goto :goto_b

    :cond_11
    move-object/from16 v11, p5

    :goto_b
    and-int/lit8 v25, v3, 0x40

    const/high16 v26, 0x180000

    if-eqz v25, :cond_12

    or-int v5, v5, v26

    move-object/from16 v10, p6

    goto :goto_d

    :cond_12
    and-int v27, v0, v26

    if-nez v27, :cond_14

    move-object/from16 v10, p6

    invoke-interface {v4, v10}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v28

    if-eqz v28, :cond_13

    const/high16 v28, 0x100000

    goto :goto_c

    :cond_13
    const/high16 v28, 0x80000

    :goto_c
    or-int v5, v5, v28

    goto :goto_d

    :cond_14
    move-object/from16 v10, p6

    :goto_d
    and-int/lit16 v14, v3, 0x80

    const/high16 v29, 0xc00000

    if-eqz v14, :cond_15

    or-int v5, v5, v29

    move-object/from16 v9, p7

    goto :goto_f

    :cond_15
    and-int v29, v0, v29

    if-nez v29, :cond_17

    move-object/from16 v9, p7

    invoke-interface {v4, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v30

    if-eqz v30, :cond_16

    const/high16 v30, 0x800000

    goto :goto_e

    :cond_16
    const/high16 v30, 0x400000

    :goto_e
    or-int v5, v5, v30

    goto :goto_f

    :cond_17
    move-object/from16 v9, p7

    :goto_f
    and-int/lit16 v0, v3, 0x100

    const/high16 v30, 0x6000000

    if-eqz v0, :cond_18

    or-int v5, v5, v30

    move/from16 v30, v0

    move/from16 v0, p8

    goto :goto_11

    :cond_18
    and-int v30, p18, v30

    if-nez v30, :cond_1a

    move/from16 v30, v0

    move/from16 v0, p8

    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v31

    if-eqz v31, :cond_19

    const/high16 v31, 0x4000000

    goto :goto_10

    :cond_19
    const/high16 v31, 0x2000000

    :goto_10
    or-int v5, v5, v31

    goto :goto_11

    :cond_1a
    move/from16 v30, v0

    move/from16 v0, p8

    :goto_11
    and-int/lit16 v0, v3, 0x200

    const/high16 v31, 0x30000000

    if-eqz v0, :cond_1b

    or-int v5, v5, v31

    move/from16 v31, v0

    move/from16 v0, p9

    goto :goto_13

    :cond_1b
    and-int v31, p18, v31

    if-nez v31, :cond_1d

    move/from16 v31, v0

    move/from16 v0, p9

    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v32

    if-eqz v32, :cond_1c

    const/high16 v32, 0x20000000

    goto :goto_12

    :cond_1c
    const/high16 v32, 0x10000000

    :goto_12
    or-int v5, v5, v32

    goto :goto_13

    :cond_1d
    move/from16 v31, v0

    move/from16 v0, p9

    :goto_13
    and-int/lit16 v0, v3, 0x400

    if-eqz v0, :cond_1e

    or-int/lit8 v6, v6, 0x6

    move/from16 v32, v0

    move/from16 v0, p10

    goto :goto_15

    :cond_1e
    and-int/lit8 v32, v2, 0x6

    if-nez v32, :cond_20

    move/from16 v32, v0

    move/from16 v0, p10

    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v33

    if-eqz v33, :cond_1f

    const/16 v33, 0x4

    goto :goto_14

    :cond_1f
    const/16 v33, 0x2

    :goto_14
    or-int v6, v6, v33

    goto :goto_15

    :cond_20
    move/from16 v32, v0

    move/from16 v0, p10

    :goto_15
    and-int/lit8 v33, v2, 0x30

    if-nez v33, :cond_23

    and-int/lit16 v0, v3, 0x800

    if-nez v0, :cond_21

    move-object/from16 v0, p11

    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v33

    if-eqz v33, :cond_22

    const/16 v33, 0x20

    goto :goto_16

    :cond_21
    move-object/from16 v0, p11

    :cond_22
    const/16 v33, 0x10

    :goto_16
    or-int v6, v6, v33

    goto :goto_17

    :cond_23
    move-object/from16 v0, p11

    :goto_17
    and-int/lit16 v0, v3, 0x1000

    if-eqz v0, :cond_24

    or-int/lit16 v6, v6, 0x180

    move/from16 v33, v0

    move-object/from16 v0, p12

    goto :goto_19

    :cond_24
    move/from16 v33, v0

    and-int/lit16 v0, v2, 0x180

    if-nez v0, :cond_26

    move-object/from16 v0, p12

    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v34

    if-eqz v34, :cond_25

    const/16 v18, 0x100

    goto :goto_18

    :cond_25
    const/16 v18, 0x80

    :goto_18
    or-int v6, v6, v18

    goto :goto_19

    :cond_26
    move-object/from16 v0, p12

    :goto_19
    and-int/lit16 v0, v3, 0x2000

    if-eqz v0, :cond_27

    or-int/lit16 v6, v6, 0xc00

    move/from16 v18, v0

    move/from16 v0, p13

    goto :goto_1a

    :cond_27
    move/from16 v18, v0

    and-int/lit16 v0, v2, 0xc00

    if-nez v0, :cond_29

    move/from16 v0, p13

    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v20

    if-eqz v20, :cond_28

    const/16 v17, 0x800

    :cond_28
    or-int v6, v6, v17

    goto :goto_1a

    :cond_29
    move/from16 v0, p13

    :goto_1a
    and-int/lit16 v0, v3, 0x4000

    if-eqz v0, :cond_2a

    or-int/lit16 v6, v6, 0x6000

    move/from16 v17, v0

    move/from16 v0, p14

    goto :goto_1c

    :cond_2a
    move/from16 v17, v0

    and-int/lit16 v0, v2, 0x6000

    if-nez v0, :cond_2c

    move/from16 v0, p14

    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v20

    if-eqz v20, :cond_2b

    const/16 v20, 0x4000

    goto :goto_1b

    :cond_2b
    const/16 v20, 0x2000

    :goto_1b
    or-int v6, v6, v20

    goto :goto_1c

    :cond_2c
    move/from16 v0, p14

    :goto_1c
    const v20, 0x8000

    and-int v20, v3, v20

    if-eqz v20, :cond_2d

    or-int v6, v6, v23

    move-object/from16 v0, p15

    goto :goto_1e

    :cond_2d
    and-int v23, v2, v23

    if-nez v23, :cond_2f

    move-object/from16 v0, p15

    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v23

    if-eqz v23, :cond_2e

    const/high16 v23, 0x20000

    goto :goto_1d

    :cond_2e
    const/high16 v23, 0x10000

    :goto_1d
    or-int v6, v6, v23

    goto :goto_1e

    :cond_2f
    move-object/from16 v0, p15

    :goto_1e
    const/high16 v23, 0x10000

    and-int v23, v3, v23

    if-eqz v23, :cond_30

    or-int v6, v6, v26

    move-object/from16 v0, p16

    goto :goto_20

    :cond_30
    and-int v26, v2, v26

    if-nez v26, :cond_32

    move-object/from16 v0, p16

    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v26

    if-eqz v26, :cond_31

    const/high16 v26, 0x100000

    goto :goto_1f

    :cond_31
    const/high16 v26, 0x80000

    :goto_1f
    or-int v6, v6, v26

    goto :goto_20

    :cond_32
    move-object/from16 v0, p16

    :goto_20
    const v26, 0x12492493

    and-int v0, v5, v26

    const v2, 0x12492492

    move/from16 p17, v6

    .end local v6    # "$dirty1":I
    .local p17, "$dirty1":I
    if-ne v0, v2, :cond_34

    const v0, 0x92493

    and-int v0, p17, v0

    const v2, 0x92492

    if-eq v0, v2, :cond_33

    goto :goto_21

    :cond_33
    const/4 v0, 0x0

    goto :goto_22

    :cond_34
    :goto_21
    const/4 v0, 0x1

    :goto_22
    and-int/lit8 v2, v5, 0x1

    invoke-interface {v4, v0, v2}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v0

    if-eqz v0, :cond_8c

    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->startDefaults()V

    const-string v0, ""

    invoke-static {v4, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 v0, p18, 0x1

    if-eqz v0, :cond_37

    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    move-result v0

    if-eqz v0, :cond_35

    goto :goto_23

    .line 204
    :cond_35
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    and-int/lit16 v0, v3, 0x800

    if-eqz v0, :cond_36

    and-int/lit8 v0, p17, -0x71

    move/from16 v7, p8

    move-object/from16 v16, p12

    move/from16 v14, p13

    move-object/from16 v19, p15

    move-object/from16 v20, p16

    move v3, v0

    move-object v6, v9

    move-object v2, v10

    move-object/from16 v17, v11

    move-object v0, v15

    move/from16 v9, p9

    move/from16 v10, p10

    move-object/from16 v11, p11

    move/from16 v15, p14

    .end local p17    # "$dirty1":I
    .local v0, "$dirty1":I
    goto/16 :goto_2f

    .end local v0    # "$dirty1":I
    .restart local p17    # "$dirty1":I
    :cond_36
    move/from16 v7, p8

    move-object/from16 v16, p12

    move/from16 v14, p13

    move-object/from16 v19, p15

    move-object/from16 v20, p16

    move/from16 v3, p17

    move-object v6, v9

    move-object v2, v10

    move-object/from16 v17, v11

    move-object v0, v15

    move/from16 v9, p9

    move/from16 v10, p10

    move-object/from16 v11, p11

    move/from16 v15, p14

    goto/16 :goto_2f

    .line 205
    :cond_37
    :goto_23
    if-eqz v12, :cond_38

    .line 188
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v0, Landroidx/compose/ui/Modifier;

    move-object v15, v0

    .end local p2    # "modifier":Landroidx/compose/ui/Modifier;
    .local v15, "modifier":Landroidx/compose/ui/Modifier;
    :cond_38
    if-eqz v16, :cond_39

    .line 189
    sget-object v0, Landroidx/compose/ui/text/TextStyle;->Companion:Landroidx/compose/ui/text/TextStyle$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/text/TextStyle$Companion;->getDefault()Landroidx/compose/ui/text/TextStyle;

    move-result-object v0

    move-object v13, v0

    .end local p3    # "textStyle":Landroidx/compose/ui/text/TextStyle;
    .local v13, "textStyle":Landroidx/compose/ui/text/TextStyle;
    :cond_39
    if-eqz v19, :cond_3a

    .line 190
    sget-object v0, Landroidx/compose/ui/text/input/VisualTransformation;->Companion:Landroidx/compose/ui/text/input/VisualTransformation$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/text/input/VisualTransformation$Companion;->getNone()Landroidx/compose/ui/text/input/VisualTransformation;

    move-result-object v0

    .end local p4    # "visualTransformation":Landroidx/compose/ui/text/input/VisualTransformation;
    .local v0, "visualTransformation":Landroidx/compose/ui/text/input/VisualTransformation;
    goto :goto_24

    .line 189
    .end local v0    # "visualTransformation":Landroidx/compose/ui/text/input/VisualTransformation;
    .restart local p4    # "visualTransformation":Landroidx/compose/ui/text/input/VisualTransformation;
    :cond_3a
    move-object v0, v8

    .line 190
    .end local p4    # "visualTransformation":Landroidx/compose/ui/text/input/VisualTransformation;
    .restart local v0    # "visualTransformation":Landroidx/compose/ui/text/input/VisualTransformation;
    :goto_24
    if-eqz v22, :cond_3b

    .line 191
    sget-object v2, Landroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$1;->INSTANCE:Landroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$1;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object v11, v2

    .end local p5    # "onTextLayout":Lkotlin/jvm/functions/Function1;
    .local v11, "onTextLayout":Lkotlin/jvm/functions/Function1;
    :cond_3b
    if-eqz v25, :cond_3c

    .line 192
    const/4 v2, 0x0

    .end local p6    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .local v2, "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    goto :goto_25

    .line 191
    .end local v2    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .restart local p6    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    :cond_3c
    move-object v2, v10

    .line 192
    .end local p6    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .restart local v2    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    :goto_25
    if-eqz v14, :cond_3d

    .line 193
    new-instance v8, Landroidx/compose/ui/graphics/SolidColor;

    sget-object v10, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    invoke-virtual {v10}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    move-result-wide v6

    const/4 v10, 0x0

    invoke-direct {v8, v6, v7, v10}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v6, v8

    check-cast v6, Landroidx/compose/ui/graphics/Brush;

    .end local p7    # "cursorBrush":Landroidx/compose/ui/graphics/Brush;
    .local v6, "cursorBrush":Landroidx/compose/ui/graphics/Brush;
    goto :goto_26

    .line 192
    .end local v6    # "cursorBrush":Landroidx/compose/ui/graphics/Brush;
    .restart local p7    # "cursorBrush":Landroidx/compose/ui/graphics/Brush;
    :cond_3d
    move-object v6, v9

    .line 193
    .end local p7    # "cursorBrush":Landroidx/compose/ui/graphics/Brush;
    .restart local v6    # "cursorBrush":Landroidx/compose/ui/graphics/Brush;
    :goto_26
    if-eqz v30, :cond_3e

    .line 194
    const/4 v7, 0x1

    .end local p8    # "softWrap":Z
    .local v7, "softWrap":Z
    goto :goto_27

    .line 193
    .end local v7    # "softWrap":Z
    .restart local p8    # "softWrap":Z
    :cond_3e
    move/from16 v7, p8

    .line 194
    .end local p8    # "softWrap":Z
    .restart local v7    # "softWrap":Z
    :goto_27
    if-eqz v31, :cond_3f

    .line 195
    const v8, 0x7fffffff

    .end local p9    # "maxLines":I
    .local v8, "maxLines":I
    goto :goto_28

    .line 194
    .end local v8    # "maxLines":I
    .restart local p9    # "maxLines":I
    :cond_3f
    move/from16 v8, p9

    .line 195
    .end local p9    # "maxLines":I
    .restart local v8    # "maxLines":I
    :goto_28
    if-eqz v32, :cond_40

    .line 196
    const/4 v9, 0x1

    .end local p10    # "minLines":I
    .local v9, "minLines":I
    goto :goto_29

    .line 195
    .end local v9    # "minLines":I
    .restart local p10    # "minLines":I
    :cond_40
    move/from16 v9, p10

    .line 196
    .end local p10    # "minLines":I
    .restart local v9    # "minLines":I
    :goto_29
    and-int/lit16 v10, v3, 0x800

    if-eqz v10, :cond_41

    .line 197
    sget-object v10, Landroidx/compose/ui/text/input/ImeOptions;->Companion:Landroidx/compose/ui/text/input/ImeOptions$Companion;

    invoke-virtual {v10}, Landroidx/compose/ui/text/input/ImeOptions$Companion;->getDefault()Landroidx/compose/ui/text/input/ImeOptions;

    move-result-object v10

    .end local p11    # "imeOptions":Landroidx/compose/ui/text/input/ImeOptions;
    .local v10, "imeOptions":Landroidx/compose/ui/text/input/ImeOptions;
    and-int/lit8 v14, p17, -0x71

    .end local p17    # "$dirty1":I
    .local v14, "$dirty1":I
    goto :goto_2a

    .line 196
    .end local v10    # "imeOptions":Landroidx/compose/ui/text/input/ImeOptions;
    .end local v14    # "$dirty1":I
    .restart local p11    # "imeOptions":Landroidx/compose/ui/text/input/ImeOptions;
    .restart local p17    # "$dirty1":I
    :cond_41
    move-object/from16 v10, p11

    move/from16 v14, p17

    .line 197
    .end local p11    # "imeOptions":Landroidx/compose/ui/text/input/ImeOptions;
    .end local p17    # "$dirty1":I
    .restart local v10    # "imeOptions":Landroidx/compose/ui/text/input/ImeOptions;
    .restart local v14    # "$dirty1":I
    :goto_2a
    if-eqz v33, :cond_42

    .line 198
    sget-object v16, Landroidx/compose/foundation/text/KeyboardActions;->Companion:Landroidx/compose/foundation/text/KeyboardActions$Companion;

    invoke-virtual/range {v16 .. v16}, Landroidx/compose/foundation/text/KeyboardActions$Companion;->getDefault()Landroidx/compose/foundation/text/KeyboardActions;

    move-result-object v16

    .end local p12    # "keyboardActions":Landroidx/compose/foundation/text/KeyboardActions;
    .local v16, "keyboardActions":Landroidx/compose/foundation/text/KeyboardActions;
    goto :goto_2b

    .line 197
    .end local v16    # "keyboardActions":Landroidx/compose/foundation/text/KeyboardActions;
    .restart local p12    # "keyboardActions":Landroidx/compose/foundation/text/KeyboardActions;
    :cond_42
    move-object/from16 v16, p12

    .line 198
    .end local p12    # "keyboardActions":Landroidx/compose/foundation/text/KeyboardActions;
    .restart local v16    # "keyboardActions":Landroidx/compose/foundation/text/KeyboardActions;
    :goto_2b
    if-eqz v18, :cond_43

    .line 199
    const/16 v18, 0x1

    .end local p13    # "enabled":Z
    .local v18, "enabled":Z
    goto :goto_2c

    .line 198
    .end local v18    # "enabled":Z
    .restart local p13    # "enabled":Z
    :cond_43
    move/from16 v18, p13

    .line 199
    .end local p13    # "enabled":Z
    .restart local v18    # "enabled":Z
    :goto_2c
    if-eqz v17, :cond_44

    .line 200
    const/16 v17, 0x0

    .end local p14    # "readOnly":Z
    .local v17, "readOnly":Z
    goto :goto_2d

    .line 199
    .end local v17    # "readOnly":Z
    .restart local p14    # "readOnly":Z
    :cond_44
    move/from16 v17, p14

    .line 200
    .end local p14    # "readOnly":Z
    .restart local v17    # "readOnly":Z
    :goto_2d
    if-eqz v20, :cond_45

    sget-object v19, Landroidx/compose/foundation/text/ComposableSingletons$CoreTextFieldKt;->INSTANCE:Landroidx/compose/foundation/text/ComposableSingletons$CoreTextFieldKt;

    invoke-virtual/range {v19 .. v19}, Landroidx/compose/foundation/text/ComposableSingletons$CoreTextFieldKt;->getLambda-1$foundation_release()Lkotlin/jvm/functions/Function3;

    move-result-object v19

    .end local p15    # "decorationBox":Lkotlin/jvm/functions/Function3;
    .local v19, "decorationBox":Lkotlin/jvm/functions/Function3;
    goto :goto_2e

    .end local v19    # "decorationBox":Lkotlin/jvm/functions/Function3;
    .restart local p15    # "decorationBox":Lkotlin/jvm/functions/Function3;
    :cond_45
    move-object/from16 v19, p15

    .end local p15    # "decorationBox":Lkotlin/jvm/functions/Function3;
    .restart local v19    # "decorationBox":Lkotlin/jvm/functions/Function3;
    :goto_2e
    if-eqz v23, :cond_46

    .line 204
    const/16 v20, 0x0

    move v3, v8

    move-object v8, v0

    move-object v0, v15

    move/from16 v15, v17

    move-object/from16 v17, v11

    move-object v11, v10

    move v10, v9

    move v9, v3

    move v3, v14

    move/from16 v14, v18

    .end local p16    # "textScrollerPosition":Landroidx/compose/foundation/text/TextFieldScrollerPosition;
    .local v20, "textScrollerPosition":Landroidx/compose/foundation/text/TextFieldScrollerPosition;
    goto :goto_2f

    .line 200
    .end local v20    # "textScrollerPosition":Landroidx/compose/foundation/text/TextFieldScrollerPosition;
    .restart local p16    # "textScrollerPosition":Landroidx/compose/foundation/text/TextFieldScrollerPosition;
    :cond_46
    move v3, v8

    move-object v8, v0

    move-object v0, v15

    move/from16 v15, v17

    move-object/from16 v17, v11

    move-object v11, v10

    move v10, v9

    move v9, v3

    move-object/from16 v20, p16

    move v3, v14

    move/from16 v14, v18

    .line 204
    .end local v18    # "enabled":Z
    .end local p16    # "textScrollerPosition":Landroidx/compose/foundation/text/TextFieldScrollerPosition;
    .local v0, "modifier":Landroidx/compose/ui/Modifier;
    .local v3, "$dirty1":I
    .local v8, "visualTransformation":Landroidx/compose/ui/text/input/VisualTransformation;
    .local v9, "maxLines":I
    .local v10, "minLines":I
    .local v11, "imeOptions":Landroidx/compose/ui/text/input/ImeOptions;
    .local v14, "enabled":Z
    .local v15, "readOnly":Z
    .local v17, "onTextLayout":Lkotlin/jvm/functions/Function1;
    .restart local v20    # "textScrollerPosition":Landroidx/compose/foundation/text/TextFieldScrollerPosition;
    :goto_2f
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endDefaults()V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v18

    if-eqz v18, :cond_47

    .line 205
    const v12, -0xe934732

    move-object/from16 p14, v6

    .end local v6    # "cursorBrush":Landroidx/compose/ui/graphics/Brush;
    .local p14, "cursorBrush":Landroidx/compose/ui/graphics/Brush;
    const-string v6, "androidx.compose.foundation.text.CoreTextField (CoreTextField.kt:204)"

    invoke-static {v12, v5, v3, v6}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    goto :goto_30

    .line 204
    .end local p14    # "cursorBrush":Landroidx/compose/ui/graphics/Brush;
    .restart local v6    # "cursorBrush":Landroidx/compose/ui/graphics/Brush;
    :cond_47
    move-object/from16 p14, v6

    .line 205
    .end local v6    # "cursorBrush":Landroidx/compose/ui/graphics/Brush;
    .restart local p14    # "cursorBrush":Landroidx/compose/ui/graphics/Brush;
    :goto_30
    nop

    .line 206
    const v6, -0x65a60dfc

    const-string v12, "CC(remember):CoreTextField.kt#9igjgp"

    invoke-static {v4, v6, v12}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    const/4 v6, 0x0

    .local v6, "invalid$iv":Z
    move-object/from16 p3, v4

    .local p3, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/16 v18, 0x0

    .line 1130
    .local v18, "$i$f$cache":I
    move/from16 v22, v5

    .end local v5    # "$dirty":I
    .local v22, "$dirty":I
    invoke-interface/range {p3 .. p3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v5

    .local v5, "it$iv":Ljava/lang/Object;
    const/16 v23, 0x0

    .line 1131
    .local v23, "$i$a$-let-ComposerKt$cache$1$iv":I
    sget-object v25, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move/from16 p4, v6

    .end local v6    # "invalid$iv":Z
    .local p4, "invalid$iv":Z
    invoke-virtual/range {v25 .. v25}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v6

    if-ne v5, v6, :cond_48

    .line 1132
    const/4 v6, 0x0

    .line 206
    .local v6, "$i$a$-cache-CoreTextFieldKt$CoreTextField$focusRequester$1":I
    new-instance v25, Landroidx/compose/ui/focus/FocusRequester;

    invoke-direct/range {v25 .. v25}, Landroidx/compose/ui/focus/FocusRequester;-><init>()V

    .line 1132
    .end local v6    # "$i$a$-cache-CoreTextFieldKt$CoreTextField$focusRequester$1":I
    move-object/from16 v6, v25

    .line 1133
    .local v6, "value$iv":Ljava/lang/Object;
    move-object/from16 p5, v5

    move-object/from16 v5, p3

    .end local p3    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .local v5, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .local p5, "it$iv":Ljava/lang/Object;
    invoke-interface {v5, v6}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1134
    nop

    .end local v6    # "value$iv":Ljava/lang/Object;
    goto :goto_31

    .line 1135
    .end local p5    # "it$iv":Ljava/lang/Object;
    .local v5, "it$iv":Ljava/lang/Object;
    .restart local p3    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    :cond_48
    move-object/from16 p5, v5

    move-object/from16 v5, p3

    .end local p3    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .local v5, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .restart local p5    # "it$iv":Ljava/lang/Object;
    move-object/from16 v6, p5

    .line 1130
    .end local v23    # "$i$a$-let-ComposerKt$cache$1$iv":I
    .end local p5    # "it$iv":Ljava/lang/Object;
    :goto_31
    nop

    .line 206
    .end local v5    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v18    # "$i$f$cache":I
    .end local p4    # "invalid$iv":Z
    move-object v5, v6

    check-cast v5, Landroidx/compose/ui/focus/FocusRequester;

    .local v5, "focusRequester":Landroidx/compose/ui/focus/FocusRequester;
    invoke-static {v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 207
    const v6, -0x65a6051f

    invoke-static {v4, v6, v12}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    const/4 v6, 0x0

    .local v6, "invalid$iv":Z
    move-object/from16 p3, v4

    .restart local p3    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/16 v18, 0x0

    .line 1136
    .restart local v18    # "$i$f$cache":I
    move/from16 p4, v6

    .end local v6    # "invalid$iv":Z
    .restart local p4    # "invalid$iv":Z
    invoke-interface/range {p3 .. p3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v6

    .local v6, "it$iv":Ljava/lang/Object;
    const/16 v23, 0x0

    .line 1137
    .restart local v23    # "$i$a$-let-ComposerKt$cache$1$iv":I
    sget-object v25, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move/from16 p9, v7

    .end local v7    # "softWrap":Z
    .local p9, "softWrap":Z
    invoke-virtual/range {v25 .. v25}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v7

    if-ne v6, v7, :cond_49

    .line 1138
    const/4 v7, 0x0

    .line 207
    .local v7, "$i$a$-cache-CoreTextFieldKt$CoreTextField$legacyTextInputServiceAdapter$1":I
    invoke-static {}, Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter_androidKt;->createLegacyPlatformTextInputServiceAdapter()Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter;

    move-result-object v7

    .line 1138
    .end local v7    # "$i$a$-cache-CoreTextFieldKt$CoreTextField$legacyTextInputServiceAdapter$1":I
    nop

    .line 1139
    .local v7, "value$iv":Ljava/lang/Object;
    move-object/from16 p5, v6

    move-object/from16 v6, p3

    .end local p3    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .local v6, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .restart local p5    # "it$iv":Ljava/lang/Object;
    invoke-interface {v6, v7}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1140
    nop

    .end local v7    # "value$iv":Ljava/lang/Object;
    goto :goto_32

    .line 1141
    .end local p5    # "it$iv":Ljava/lang/Object;
    .local v6, "it$iv":Ljava/lang/Object;
    .restart local p3    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    :cond_49
    move-object/from16 p5, v6

    move-object/from16 v6, p3

    .end local p3    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .local v6, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .restart local p5    # "it$iv":Ljava/lang/Object;
    move-object/from16 v7, p5

    .line 1136
    .end local v23    # "$i$a$-let-ComposerKt$cache$1$iv":I
    .end local p5    # "it$iv":Ljava/lang/Object;
    :goto_32
    nop

    .line 207
    .end local v6    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v18    # "$i$f$cache":I
    .end local p4    # "invalid$iv":Z
    move-object v6, v7

    check-cast v6, Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter;

    .local v6, "legacyTextInputServiceAdapter":Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter;
    invoke-static {v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 208
    const v7, -0x65a5f811

    invoke-static {v4, v7, v12}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    const/4 v7, 0x0

    .local v7, "invalid$iv":Z
    move-object/from16 p3, v4

    .restart local p3    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/16 v18, 0x0

    .line 1142
    .restart local v18    # "$i$f$cache":I
    move/from16 p4, v7

    .end local v7    # "invalid$iv":Z
    .restart local p4    # "invalid$iv":Z
    invoke-interface/range {p3 .. p3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v7

    .local v7, "it$iv":Ljava/lang/Object;
    const/16 v23, 0x0

    .line 1143
    .restart local v23    # "$i$a$-let-ComposerKt$cache$1$iv":I
    sget-object v25, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move/from16 p15, v10

    .end local v10    # "minLines":I
    .local p15, "minLines":I
    invoke-virtual/range {v25 .. v25}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v10

    if-ne v7, v10, :cond_4a

    .line 1144
    const/4 v10, 0x0

    .line 209
    .local v10, "$i$a$-cache-CoreTextFieldKt$CoreTextField$textInputService$1":I
    move-object/from16 p5, v7

    .end local v7    # "it$iv":Ljava/lang/Object;
    .restart local p5    # "it$iv":Ljava/lang/Object;
    new-instance v7, Landroidx/compose/ui/text/input/TextInputService;

    move/from16 p6, v10

    .end local v10    # "$i$a$-cache-CoreTextFieldKt$CoreTextField$textInputService$1":I
    .local p6, "$i$a$-cache-CoreTextFieldKt$CoreTextField$textInputService$1":I
    move-object v10, v6

    check-cast v10, Landroidx/compose/ui/text/input/PlatformTextInputService;

    invoke-direct {v7, v10}, Landroidx/compose/ui/text/input/TextInputService;-><init>(Landroidx/compose/ui/text/input/PlatformTextInputService;)V

    .line 1144
    .end local p6    # "$i$a$-cache-CoreTextFieldKt$CoreTextField$textInputService$1":I
    nop

    .line 1145
    .local v7, "value$iv":Ljava/lang/Object;
    move-object/from16 v10, p3

    .end local p3    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .local v10, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    invoke-interface {v10, v7}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1146
    nop

    .end local v7    # "value$iv":Ljava/lang/Object;
    goto :goto_33

    .line 1147
    .end local v10    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local p5    # "it$iv":Ljava/lang/Object;
    .local v7, "it$iv":Ljava/lang/Object;
    .restart local p3    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    :cond_4a
    move-object/from16 v10, p3

    move-object/from16 p5, v7

    .line 1142
    .end local v7    # "it$iv":Ljava/lang/Object;
    .end local v23    # "$i$a$-let-ComposerKt$cache$1$iv":I
    .end local p3    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .restart local v10    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    :goto_33
    nop

    .line 208
    .end local v10    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v18    # "$i$f$cache":I
    .end local p4    # "invalid$iv":Z
    check-cast v7, Landroidx/compose/ui/text/input/TextInputService;

    .local v7, "textInputService":Landroidx/compose/ui/text/input/TextInputService;
    invoke-static {v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 213
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalDensity()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v10

    check-cast v10, Landroidx/compose/runtime/CompositionLocal;

    .local v10, "this_$iv":Landroidx/compose/runtime/CompositionLocal;
    const/16 v18, 0x0

    .local v18, "$changed$iv":I
    const/16 v23, 0x0

    .line 1148
    .local v23, "$i$f$getCurrent":I
    move-object/from16 p3, v12

    const v12, 0x789c5f52

    move-object/from16 p10, v13

    .end local v13    # "textStyle":Landroidx/compose/ui/text/TextStyle;
    .local p10, "textStyle":Landroidx/compose/ui/text/TextStyle;
    const-string v13, "CC(<get-current>):CompositionLocal.kt#9igjgp"

    invoke-static {v4, v12, v13}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v4, v10}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v25

    invoke-static {v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 213
    .end local v10    # "this_$iv":Landroidx/compose/runtime/CompositionLocal;
    .end local v18    # "$changed$iv":I
    .end local v23    # "$i$f$getCurrent":I
    move-object/from16 v10, v25

    check-cast v10, Landroidx/compose/ui/unit/Density;

    .line 214
    .local v10, "density":Landroidx/compose/ui/unit/Density;
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalFontFamilyResolver()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v18

    move-object/from16 v12, v18

    check-cast v12, Landroidx/compose/runtime/CompositionLocal;

    .local v12, "this_$iv":Landroidx/compose/runtime/CompositionLocal;
    const/16 v18, 0x0

    .restart local v18    # "$changed$iv":I
    const/16 v23, 0x0

    .line 1149
    .restart local v23    # "$i$f$getCurrent":I
    move-object/from16 p11, v10

    const v10, 0x789c5f52

    .end local v10    # "density":Landroidx/compose/ui/unit/Density;
    .local p11, "density":Landroidx/compose/ui/unit/Density;
    invoke-static {v4, v10, v13}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v4, v12}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v10

    invoke-static {v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 214
    .end local v12    # "this_$iv":Landroidx/compose/runtime/CompositionLocal;
    .end local v18    # "$changed$iv":I
    .end local v23    # "$i$f$getCurrent":I
    check-cast v10, Landroidx/compose/ui/text/font/FontFamily$Resolver;

    .line 215
    .local v10, "fontFamilyResolver":Landroidx/compose/ui/text/font/FontFamily$Resolver;
    invoke-static {}, Landroidx/compose/foundation/text/selection/TextSelectionColorsKt;->getLocalTextSelectionColors()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v12

    check-cast v12, Landroidx/compose/runtime/CompositionLocal;

    .restart local v12    # "this_$iv":Landroidx/compose/runtime/CompositionLocal;
    const/16 v18, 0x6

    .restart local v18    # "$changed$iv":I
    const/16 v23, 0x0

    .line 1150
    .restart local v23    # "$i$f$getCurrent":I
    move-object/from16 p12, v10

    const v10, 0x789c5f52

    .end local v10    # "fontFamilyResolver":Landroidx/compose/ui/text/font/FontFamily$Resolver;
    .local p12, "fontFamilyResolver":Landroidx/compose/ui/text/font/FontFamily$Resolver;
    invoke-static {v4, v10, v13}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v4, v12}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v10

    invoke-static {v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .end local v12    # "this_$iv":Landroidx/compose/runtime/CompositionLocal;
    .end local v18    # "$changed$iv":I
    .end local v23    # "$i$f$getCurrent":I
    check-cast v10, Landroidx/compose/foundation/text/selection/TextSelectionColors;

    .line 215
    invoke-virtual {v10}, Landroidx/compose/foundation/text/selection/TextSelectionColors;->getBackgroundColor-0d7_KjU()J

    move-result-wide v30

    .line 216
    .local v30, "selectionBackgroundColor":J
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalFocusManager()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v10

    check-cast v10, Landroidx/compose/runtime/CompositionLocal;

    .local v10, "this_$iv":Landroidx/compose/runtime/CompositionLocal;
    const/4 v12, 0x0

    .local v12, "$changed$iv":I
    const/16 v18, 0x0

    .line 1151
    .local v18, "$i$f$getCurrent":I
    move/from16 p4, v12

    const v12, 0x789c5f52

    .end local v12    # "$changed$iv":I
    .local p4, "$changed$iv":I
    invoke-static {v4, v12, v13}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v4, v10}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v12

    invoke-static {v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 216
    .end local v10    # "this_$iv":Landroidx/compose/runtime/CompositionLocal;
    .end local v18    # "$i$f$getCurrent":I
    .end local p4    # "$changed$iv":I
    move-object v10, v12

    check-cast v10, Landroidx/compose/ui/focus/FocusManager;

    .line 217
    .local v10, "focusManager":Landroidx/compose/ui/focus/FocusManager;
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalWindowInfo()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v12

    check-cast v12, Landroidx/compose/runtime/CompositionLocal;

    .local v12, "this_$iv":Landroidx/compose/runtime/CompositionLocal;
    const/16 v18, 0x0

    .local v18, "$changed$iv":I
    const/16 v23, 0x0

    .line 1152
    .restart local v23    # "$i$f$getCurrent":I
    move-object/from16 p17, v10

    const v10, 0x789c5f52

    .end local v10    # "focusManager":Landroidx/compose/ui/focus/FocusManager;
    .local p17, "focusManager":Landroidx/compose/ui/focus/FocusManager;
    invoke-static {v4, v10, v13}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v4, v12}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v10

    invoke-static {v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 217
    .end local v12    # "this_$iv":Landroidx/compose/runtime/CompositionLocal;
    .end local v18    # "$changed$iv":I
    .end local v23    # "$i$f$getCurrent":I
    check-cast v10, Landroidx/compose/ui/platform/WindowInfo;

    .line 218
    .local v10, "windowInfo":Landroidx/compose/ui/platform/WindowInfo;
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalSoftwareKeyboardController()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v12

    check-cast v12, Landroidx/compose/runtime/CompositionLocal;

    .restart local v12    # "this_$iv":Landroidx/compose/runtime/CompositionLocal;
    const/16 v18, 0x0

    .restart local v18    # "$changed$iv":I
    const/16 v23, 0x0

    .line 1153
    .restart local v23    # "$i$f$getCurrent":I
    move/from16 v25, v15

    const v15, 0x789c5f52

    .end local v15    # "readOnly":Z
    .local v25, "readOnly":Z
    invoke-static {v4, v15, v13}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v4, v12}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v15

    invoke-static {v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 218
    .end local v12    # "this_$iv":Landroidx/compose/runtime/CompositionLocal;
    .end local v18    # "$changed$iv":I
    .end local v23    # "$i$f$getCurrent":I
    move-object v12, v15

    check-cast v12, Landroidx/compose/ui/platform/SoftwareKeyboardController;

    .line 221
    .local v12, "keyboardController":Landroidx/compose/ui/platform/SoftwareKeyboardController;
    const/4 v15, 0x1

    if-ne v9, v15, :cond_4b

    move-object/from16 v15, p3

    if-nez p9, :cond_4c

    invoke-virtual {v11}, Landroidx/compose/ui/text/input/ImeOptions;->getSingleLine()Z

    move-result v23

    if-eqz v23, :cond_4c

    const/16 v23, 0x1

    goto :goto_34

    :cond_4b
    move-object/from16 v15, p3

    :cond_4c
    const/16 v23, 0x0

    .line 222
    .local v23, "singleLine":Z
    :goto_34
    if-eqz v23, :cond_4d

    sget-object v32, Landroidx/compose/foundation/gestures/Orientation;->Horizontal:Landroidx/compose/foundation/gestures/Orientation;

    goto :goto_35

    :cond_4d
    sget-object v32, Landroidx/compose/foundation/gestures/Orientation;->Vertical:Landroidx/compose/foundation/gestures/Orientation;

    :goto_35
    move-object/from16 v33, v32

    .line 224
    .local v33, "orientation":Landroidx/compose/foundation/gestures/Orientation;
    if-nez v20, :cond_50

    .line 225
    move-object/from16 v32, v0

    .end local v0    # "modifier":Landroidx/compose/ui/Modifier;
    .local v32, "modifier":Landroidx/compose/ui/Modifier;
    const v0, -0x65a5a08c

    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v0, "224@12498L70,224@12427L141"

    invoke-static {v4, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    filled-new-array/range {v33 .. v33}, [Ljava/lang/Object;

    move-result-object v0

    sget-object v34, Landroidx/compose/foundation/text/TextFieldScrollerPosition;->Companion:Landroidx/compose/foundation/text/TextFieldScrollerPosition$Companion;

    invoke-virtual/range {v34 .. v34}, Landroidx/compose/foundation/text/TextFieldScrollerPosition$Companion;->getSaver()Landroidx/compose/runtime/saveable/Saver;

    move-result-object v34

    move-object/from16 p2, v0

    const v0, -0x65a597f3

    invoke-static {v4, v0, v15}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    move-object/from16 v0, v33

    .end local v33    # "orientation":Landroidx/compose/foundation/gestures/Orientation;
    .local v0, "orientation":Landroidx/compose/foundation/gestures/Orientation;
    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v33

    .local v33, "invalid$iv":Z
    move-object/from16 p3, v4

    .restart local p3    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/16 v35, 0x0

    .line 1154
    .local v35, "$i$f$cache":I
    move-object/from16 v36, v4

    .end local v4    # "$composer":Landroidx/compose/runtime/Composer;
    .local v36, "$composer":Landroidx/compose/runtime/Composer;
    invoke-interface/range {p3 .. p3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v4

    .local v4, "it$iv":Ljava/lang/Object;
    const/16 v37, 0x0

    .line 1155
    .local v37, "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez v33, :cond_4f

    sget-object v38, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move-object/from16 v39, v6

    .end local v6    # "legacyTextInputServiceAdapter":Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter;
    .local v39, "legacyTextInputServiceAdapter":Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter;
    invoke-virtual/range {v38 .. v38}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v6

    if-ne v4, v6, :cond_4e

    goto :goto_36

    .line 1159
    :cond_4e
    move-object/from16 v6, p3

    goto :goto_37

    .line 1155
    .end local v39    # "legacyTextInputServiceAdapter":Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter;
    .restart local v6    # "legacyTextInputServiceAdapter":Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter;
    :cond_4f
    move-object/from16 v39, v6

    .line 1156
    .end local v6    # "legacyTextInputServiceAdapter":Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter;
    .restart local v39    # "legacyTextInputServiceAdapter":Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter;
    :goto_36
    const/4 v6, 0x0

    .line 225
    .local v6, "$i$a$-cache-CoreTextFieldKt$CoreTextField$scrollerPosition$1":I
    move-object/from16 p4, v4

    .end local v4    # "it$iv":Ljava/lang/Object;
    .local p4, "it$iv":Ljava/lang/Object;
    new-instance v4, Landroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$scrollerPosition$1$1;

    invoke-direct {v4, v0}, Landroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$scrollerPosition$1$1;-><init>(Landroidx/compose/foundation/gestures/Orientation;)V

    check-cast v4, Lkotlin/jvm/functions/Function0;

    .line 1156
    .end local v6    # "$i$a$-cache-CoreTextFieldKt$CoreTextField$scrollerPosition$1":I
    nop

    .line 1157
    .local v4, "value$iv":Ljava/lang/Object;
    move-object/from16 v6, p3

    .end local p3    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .local v6, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    invoke-interface {v6, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1158
    nop

    .line 1154
    .end local v4    # "value$iv":Ljava/lang/Object;
    .end local v37    # "$i$a$-let-ComposerKt$cache$1$iv":I
    .end local p4    # "it$iv":Ljava/lang/Object;
    :goto_37
    nop

    .line 225
    .end local v6    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v33    # "invalid$iv":Z
    .end local v35    # "$i$f$cache":I
    check-cast v4, Lkotlin/jvm/functions/Function0;

    invoke-static/range {v36 .. v36}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    const/4 v6, 0x0

    const/16 v33, 0x4

    const/16 v35, 0x0

    move-object/from16 p5, v4

    move/from16 p7, v6

    move/from16 p8, v33

    move-object/from16 p3, v34

    move-object/from16 p4, v35

    move-object/from16 p6, v36

    .end local v36    # "$composer":Landroidx/compose/runtime/Composer;
    .local p6, "$composer":Landroidx/compose/runtime/Composer;
    invoke-static/range {p2 .. p8}, Landroidx/compose/runtime/saveable/RememberSaveableKt;->rememberSaveable([Ljava/lang/Object;Landroidx/compose/runtime/saveable/Saver;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Ljava/lang/Object;

    move-result-object v4

    move-object/from16 v6, p6

    .end local p6    # "$composer":Landroidx/compose/runtime/Composer;
    .local v6, "$composer":Landroidx/compose/runtime/Composer;
    check-cast v4, Landroidx/compose/foundation/text/TextFieldScrollerPosition;

    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    goto :goto_38

    .line 224
    .end local v32    # "modifier":Landroidx/compose/ui/Modifier;
    .end local v39    # "legacyTextInputServiceAdapter":Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter;
    .local v0, "modifier":Landroidx/compose/ui/Modifier;
    .local v4, "$composer":Landroidx/compose/runtime/Composer;
    .local v6, "legacyTextInputServiceAdapter":Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter;
    .local v33, "orientation":Landroidx/compose/foundation/gestures/Orientation;
    :cond_50
    move-object/from16 v32, v0

    move-object/from16 v39, v6

    move-object/from16 v0, v33

    move-object v6, v4

    .end local v4    # "$composer":Landroidx/compose/runtime/Composer;
    .end local v33    # "orientation":Landroidx/compose/foundation/gestures/Orientation;
    .local v0, "orientation":Landroidx/compose/foundation/gestures/Orientation;
    .local v6, "$composer":Landroidx/compose/runtime/Composer;
    .restart local v32    # "modifier":Landroidx/compose/ui/Modifier;
    .restart local v39    # "legacyTextInputServiceAdapter":Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter;
    const v4, -0x65a5a4e8

    invoke-interface {v6, v4}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    move-object/from16 v4, v20

    .line 223
    :goto_38
    nop

    .line 228
    .local v4, "scrollerPosition":Landroidx/compose/foundation/text/TextFieldScrollerPosition;
    move-object/from16 v33, v4

    .end local v4    # "scrollerPosition":Landroidx/compose/foundation/text/TextFieldScrollerPosition;
    .local v33, "scrollerPosition":Landroidx/compose/foundation/text/TextFieldScrollerPosition;
    invoke-virtual/range {v33 .. v33}, Landroidx/compose/foundation/text/TextFieldScrollerPosition;->getOrientation()Landroidx/compose/foundation/gestures/Orientation;

    move-result-object v4

    if-eq v4, v0, :cond_52

    .line 229
    new-instance v4, Ljava/lang/IllegalArgumentException;

    .line 230
    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    const-string v15, "Mismatching scroller orientation; "

    invoke-virtual {v13, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    .line 231
    sget-object v15, Landroidx/compose/foundation/gestures/Orientation;->Vertical:Landroidx/compose/foundation/gestures/Orientation;

    if-ne v0, v15, :cond_51

    .line 232
    const-string/jumbo v15, "only single-line, non-wrap text fields can scroll horizontally"

    goto :goto_39

    .line 233
    :cond_51
    const-string/jumbo v15, "single-line, non-wrap text fields can only scroll horizontally"

    .line 230
    :goto_39
    invoke-virtual {v13, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    .line 229
    invoke-direct {v4, v13}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v4

    :cond_52
    nop

    .line 239
    const v4, -0x65a55744

    invoke-static {v6, v4, v15}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    and-int/lit8 v4, v22, 0xe

    move-object/from16 v34, v0

    const/4 v0, 0x4

    .end local v0    # "orientation":Landroidx/compose/foundation/gestures/Orientation;
    .local v34, "orientation":Landroidx/compose/foundation/gestures/Orientation;
    if-ne v4, v0, :cond_53

    const/4 v0, 0x1

    goto :goto_3a

    :cond_53
    const/4 v0, 0x0

    :goto_3a
    const v4, 0xe000

    and-int v4, v22, v4

    move/from16 p2, v0

    const/16 v0, 0x4000

    if-ne v4, v0, :cond_54

    const/4 v0, 0x1

    goto :goto_3b

    :cond_54
    const/4 v0, 0x0

    :goto_3b
    or-int v0, p2, v0

    .local v0, "invalid$iv":Z
    move-object v4, v6

    .local v4, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/16 v35, 0x0

    .line 1160
    .restart local v35    # "$i$f$cache":I
    move/from16 p2, v0

    .end local v0    # "invalid$iv":Z
    .local p2, "invalid$iv":Z
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v0

    .local v0, "it$iv":Ljava/lang/Object;
    const/16 v36, 0x0

    .line 1161
    .local v36, "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez p2, :cond_56

    sget-object v37, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move/from16 v38, v9

    .end local v9    # "maxLines":I
    .local v38, "maxLines":I
    invoke-virtual/range {v37 .. v37}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v9

    if-ne v0, v9, :cond_55

    goto :goto_3c

    .line 1166
    :cond_55
    move-object/from16 v41, v2

    move-object/from16 v40, v10

    goto :goto_3f

    .line 1161
    .end local v38    # "maxLines":I
    .restart local v9    # "maxLines":I
    :cond_56
    move/from16 v38, v9

    .line 1162
    .end local v9    # "maxLines":I
    .restart local v38    # "maxLines":I
    :goto_3c
    const/4 v9, 0x0

    .line 240
    .local v9, "$i$a$-cache-CoreTextFieldKt$CoreTextField$transformedText$1":I
    move-object/from16 p3, v0

    .end local v0    # "it$iv":Ljava/lang/Object;
    .local p3, "it$iv":Ljava/lang/Object;
    invoke-virtual {v1}, Landroidx/compose/ui/text/input/TextFieldValue;->getAnnotatedString()Landroidx/compose/ui/text/AnnotatedString;

    move-result-object v0

    invoke-static {v8, v0}, Landroidx/compose/foundation/text/ValidatingOffsetMappingKt;->filterWithValidation(Landroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/ui/text/AnnotatedString;)Landroidx/compose/ui/text/input/TransformedText;

    move-result-object v0

    .line 242
    .local v0, "transformed":Landroidx/compose/ui/text/input/TransformedText;
    invoke-virtual {v1}, Landroidx/compose/ui/text/input/TextFieldValue;->getComposition-MzsxiRA()Landroidx/compose/ui/text/TextRange;

    move-result-object v37

    if-eqz v37, :cond_58

    move/from16 p4, v9

    move-object/from16 v40, v10

    .end local v9    # "$i$a$-cache-CoreTextFieldKt$CoreTextField$transformedText$1":I
    .end local v10    # "windowInfo":Landroidx/compose/ui/platform/WindowInfo;
    .local v40, "windowInfo":Landroidx/compose/ui/platform/WindowInfo;
    .local p4, "$i$a$-cache-CoreTextFieldKt$CoreTextField$transformedText$1":I
    invoke-virtual/range {v37 .. v37}, Landroidx/compose/ui/text/TextRange;->unbox-impl()J

    move-result-wide v9

    .line 1163
    .local v9, "it":J
    const/16 v37, 0x0

    .line 242
    .local v37, "$i$a$-let-CoreTextFieldKt$CoreTextField$transformedText$1$1":I
    move-object/from16 v41, v2

    .end local v2    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .local v41, "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    sget-object v2, Landroidx/compose/foundation/text/TextFieldDelegate;->Companion:Landroidx/compose/foundation/text/TextFieldDelegate$Companion;

    invoke-virtual {v2, v9, v10, v0}, Landroidx/compose/foundation/text/TextFieldDelegate$Companion;->applyCompositionDecoration-72CqOWE(JLandroidx/compose/ui/text/input/TransformedText;)Landroidx/compose/ui/text/input/TransformedText;

    move-result-object v2

    .end local v9    # "it":J
    .end local v37    # "$i$a$-let-CoreTextFieldKt$CoreTextField$transformedText$1$1":I
    if-nez v2, :cond_57

    goto :goto_3d

    :cond_57
    move-object v0, v2

    goto :goto_3e

    .end local v40    # "windowInfo":Landroidx/compose/ui/platform/WindowInfo;
    .end local v41    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .end local p4    # "$i$a$-cache-CoreTextFieldKt$CoreTextField$transformedText$1":I
    .restart local v2    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .local v9, "$i$a$-cache-CoreTextFieldKt$CoreTextField$transformedText$1":I
    .restart local v10    # "windowInfo":Landroidx/compose/ui/platform/WindowInfo;
    :cond_58
    move-object/from16 v41, v2

    move/from16 p4, v9

    move-object/from16 v40, v10

    .line 243
    .end local v2    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .end local v9    # "$i$a$-cache-CoreTextFieldKt$CoreTextField$transformedText$1":I
    .end local v10    # "windowInfo":Landroidx/compose/ui/platform/WindowInfo;
    .restart local v40    # "windowInfo":Landroidx/compose/ui/platform/WindowInfo;
    .restart local v41    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .restart local p4    # "$i$a$-cache-CoreTextFieldKt$CoreTextField$transformedText$1":I
    :goto_3d
    nop

    .line 1162
    .end local v0    # "transformed":Landroidx/compose/ui/text/input/TransformedText;
    .end local p4    # "$i$a$-cache-CoreTextFieldKt$CoreTextField$transformedText$1":I
    :goto_3e
    nop

    .line 1164
    .local v0, "value$iv":Ljava/lang/Object;
    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1165
    nop

    .line 1160
    .end local v0    # "value$iv":Ljava/lang/Object;
    .end local v36    # "$i$a$-let-ComposerKt$cache$1$iv":I
    .end local p3    # "it$iv":Ljava/lang/Object;
    :goto_3f
    nop

    .line 239
    .end local v4    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v35    # "$i$f$cache":I
    .end local p2    # "invalid$iv":Z
    check-cast v0, Landroidx/compose/ui/text/input/TransformedText;

    invoke-static {v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 238
    nop

    .line 246
    .local v0, "transformedText":Landroidx/compose/ui/text/input/TransformedText;
    invoke-virtual {v0}, Landroidx/compose/ui/text/input/TransformedText;->getText()Landroidx/compose/ui/text/AnnotatedString;

    move-result-object v2

    .line 247
    .local v2, "visualText":Landroidx/compose/ui/text/AnnotatedString;
    invoke-virtual {v0}, Landroidx/compose/ui/text/input/TransformedText;->getOffsetMapping()Landroidx/compose/ui/text/input/OffsetMapping;

    move-result-object v4

    .line 251
    .local v4, "offsetMapping":Landroidx/compose/ui/text/input/OffsetMapping;
    const/4 v9, 0x0

    invoke-static {v6, v9}, Landroidx/compose/runtime/ComposablesKt;->getCurrentRecomposeScope(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/RecomposeScope;

    move-result-object v10

    .line 253
    .local v10, "scope":Landroidx/compose/runtime/RecomposeScope;
    const v9, -0x65a50816

    invoke-static {v6, v9, v15}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v6, v12}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v9

    .local v9, "invalid$iv":Z
    move-object/from16 v35, v6

    .local v35, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/16 v36, 0x0

    .line 1167
    .local v36, "$i$f$cache":I
    move-object/from16 v37, v0

    .end local v0    # "transformedText":Landroidx/compose/ui/text/input/TransformedText;
    .local v37, "transformedText":Landroidx/compose/ui/text/input/TransformedText;
    invoke-interface/range {v35 .. v35}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v0

    .local v0, "it$iv":Ljava/lang/Object;
    const/16 v42, 0x0

    .line 1168
    .local v42, "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez v9, :cond_5a

    sget-object v43, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move-object/from16 p3, v2

    .end local v2    # "visualText":Landroidx/compose/ui/text/AnnotatedString;
    .local p3, "visualText":Landroidx/compose/ui/text/AnnotatedString;
    invoke-virtual/range {v43 .. v43}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v2

    if-ne v0, v2, :cond_59

    goto :goto_40

    .line 1172
    :cond_59
    move-object/from16 v48, p3

    move/from16 v46, p9

    move-object/from16 v47, p10

    move-object/from16 v44, p11

    move-object/from16 v45, p12

    move-object/from16 v2, v35

    goto :goto_41

    .line 1168
    .end local p3    # "visualText":Landroidx/compose/ui/text/AnnotatedString;
    .restart local v2    # "visualText":Landroidx/compose/ui/text/AnnotatedString;
    :cond_5a
    move-object/from16 p3, v2

    .line 1169
    .end local v2    # "visualText":Landroidx/compose/ui/text/AnnotatedString;
    .restart local p3    # "visualText":Landroidx/compose/ui/text/AnnotatedString;
    :goto_40
    const/4 v2, 0x0

    .line 254
    .local v2, "$i$a$-cache-CoreTextFieldKt$CoreTextField$state$1":I
    move-object/from16 v43, v0

    .end local v0    # "it$iv":Ljava/lang/Object;
    .local v43, "it$iv":Ljava/lang/Object;
    new-instance v0, Landroidx/compose/foundation/text/LegacyTextFieldState;

    .line 255
    new-instance v44, Landroidx/compose/foundation/text/TextDelegate;

    .line 256
    nop

    .line 257
    nop

    .line 255
    nop

    .line 258
    nop

    .line 255
    nop

    .line 259
    nop

    .line 260
    nop

    .line 255
    const/16 v45, 0x12c

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    move/from16 p7, p9

    move-object/from16 p4, p10

    move-object/from16 p9, p11

    move-object/from16 p10, p12

    move-object/from16 p2, v44

    move/from16 p12, v45

    move-object/from16 p13, v46

    move/from16 p5, v47

    move/from16 p6, v48

    move/from16 p8, v49

    move-object/from16 p11, v50

    .end local p11    # "density":Landroidx/compose/ui/unit/Density;
    .end local p12    # "fontFamilyResolver":Landroidx/compose/ui/text/font/FontFamily$Resolver;
    .local p4, "textStyle":Landroidx/compose/ui/text/TextStyle;
    .local p7, "softWrap":Z
    .local p9, "density":Landroidx/compose/ui/unit/Density;
    .local p10, "fontFamilyResolver":Landroidx/compose/ui/text/font/FontFamily$Resolver;
    invoke-direct/range {p2 .. p13}, Landroidx/compose/foundation/text/TextDelegate;-><init>(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;IIZILandroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 262
    move/from16 v44, v2

    move-object/from16 v2, p2

    move/from16 p2, v44

    move-object/from16 v48, p3

    move-object/from16 v47, p4

    move/from16 v46, p7

    move-object/from16 v44, p9

    move-object/from16 v45, p10

    .line 263
    .end local v2    # "$i$a$-cache-CoreTextFieldKt$CoreTextField$state$1":I
    .end local p3    # "visualText":Landroidx/compose/ui/text/AnnotatedString;
    .end local p4    # "textStyle":Landroidx/compose/ui/text/TextStyle;
    .end local p7    # "softWrap":Z
    .end local p9    # "density":Landroidx/compose/ui/unit/Density;
    .end local p10    # "fontFamilyResolver":Landroidx/compose/ui/text/font/FontFamily$Resolver;
    .local v44, "density":Landroidx/compose/ui/unit/Density;
    .local v45, "fontFamilyResolver":Landroidx/compose/ui/text/font/FontFamily$Resolver;
    .local v46, "softWrap":Z
    .local v47, "textStyle":Landroidx/compose/ui/text/TextStyle;
    .local v48, "visualText":Landroidx/compose/ui/text/AnnotatedString;
    .local p2, "$i$a$-cache-CoreTextFieldKt$CoreTextField$state$1":I
    nop

    .line 254
    invoke-direct {v0, v2, v10, v12}, Landroidx/compose/foundation/text/LegacyTextFieldState;-><init>(Landroidx/compose/foundation/text/TextDelegate;Landroidx/compose/runtime/RecomposeScope;Landroidx/compose/ui/platform/SoftwareKeyboardController;)V

    .line 264
    nop

    .line 1169
    .end local p2    # "$i$a$-cache-CoreTextFieldKt$CoreTextField$state$1":I
    nop

    .line 1170
    .local v0, "value$iv":Ljava/lang/Object;
    move-object/from16 v2, v35

    .end local v35    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .local v2, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1171
    nop

    .line 1167
    .end local v0    # "value$iv":Ljava/lang/Object;
    .end local v42    # "$i$a$-let-ComposerKt$cache$1$iv":I
    .end local v43    # "it$iv":Ljava/lang/Object;
    :goto_41
    nop

    .line 253
    .end local v2    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v9    # "invalid$iv":Z
    .end local v36    # "$i$f$cache":I
    move-object v2, v0

    check-cast v2, Landroidx/compose/foundation/text/LegacyTextFieldState;

    invoke-static {v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 252
    nop

    .line 266
    .local v2, "state":Landroidx/compose/foundation/text/LegacyTextFieldState;
    nop

    .line 267
    invoke-virtual {v1}, Landroidx/compose/ui/text/input/TextFieldValue;->getAnnotatedString()Landroidx/compose/ui/text/AnnotatedString;

    move-result-object v0

    .line 268
    nop

    .line 269
    nop

    .line 270
    nop

    .line 271
    nop

    .line 272
    nop

    .line 273
    nop

    .line 274
    nop

    .line 275
    nop

    .line 276
    nop

    .line 266
    move-object/from16 p9, p1

    move-object/from16 p11, p17

    move-object/from16 p3, v0

    move-object/from16 p2, v2

    move-object/from16 p10, v16

    move-wide/from16 p12, v30

    move-object/from16 p7, v44

    move-object/from16 p8, v45

    move/from16 p6, v46

    move-object/from16 p5, v47

    move-object/from16 p4, v48

    .end local v2    # "state":Landroidx/compose/foundation/text/LegacyTextFieldState;
    .end local v16    # "keyboardActions":Landroidx/compose/foundation/text/KeyboardActions;
    .end local v30    # "selectionBackgroundColor":J
    .end local v44    # "density":Landroidx/compose/ui/unit/Density;
    .end local v45    # "fontFamilyResolver":Landroidx/compose/ui/text/font/FontFamily$Resolver;
    .end local v46    # "softWrap":Z
    .end local v47    # "textStyle":Landroidx/compose/ui/text/TextStyle;
    .end local v48    # "visualText":Landroidx/compose/ui/text/AnnotatedString;
    .end local p17    # "focusManager":Landroidx/compose/ui/focus/FocusManager;
    .local p2, "state":Landroidx/compose/foundation/text/LegacyTextFieldState;
    .local p4, "visualText":Landroidx/compose/ui/text/AnnotatedString;
    .local p5, "textStyle":Landroidx/compose/ui/text/TextStyle;
    .local p6, "softWrap":Z
    .local p7, "density":Landroidx/compose/ui/unit/Density;
    .local p8, "fontFamilyResolver":Landroidx/compose/ui/text/font/FontFamily$Resolver;
    .local p10, "keyboardActions":Landroidx/compose/foundation/text/KeyboardActions;
    .local p11, "focusManager":Landroidx/compose/ui/focus/FocusManager;
    .local p12, "selectionBackgroundColor":J
    invoke-virtual/range {p2 .. p13}, Landroidx/compose/foundation/text/LegacyTextFieldState;->update-fnh65Uc(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;ZLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/text/KeyboardActions;Landroidx/compose/ui/focus/FocusManager;J)V

    .line 280
    move-object/from16 v35, p10

    move-object/from16 v0, p11

    .end local p2    # "state":Landroidx/compose/foundation/text/LegacyTextFieldState;
    .end local p4    # "visualText":Landroidx/compose/ui/text/AnnotatedString;
    .end local p5    # "textStyle":Landroidx/compose/ui/text/TextStyle;
    .end local p6    # "softWrap":Z
    .end local p7    # "density":Landroidx/compose/ui/unit/Density;
    .end local p8    # "fontFamilyResolver":Landroidx/compose/ui/text/font/FontFamily$Resolver;
    .end local p10    # "keyboardActions":Landroidx/compose/foundation/text/KeyboardActions;
    .end local p11    # "focusManager":Landroidx/compose/ui/focus/FocusManager;
    .end local p12    # "selectionBackgroundColor":J
    .local v0, "focusManager":Landroidx/compose/ui/focus/FocusManager;
    .restart local v2    # "state":Landroidx/compose/foundation/text/LegacyTextFieldState;
    .restart local v30    # "selectionBackgroundColor":J
    .local v35, "keyboardActions":Landroidx/compose/foundation/text/KeyboardActions;
    .restart local v44    # "density":Landroidx/compose/ui/unit/Density;
    .restart local v45    # "fontFamilyResolver":Landroidx/compose/ui/text/font/FontFamily$Resolver;
    .restart local v46    # "softWrap":Z
    .restart local v47    # "textStyle":Landroidx/compose/ui/text/TextStyle;
    .restart local v48    # "visualText":Landroidx/compose/ui/text/AnnotatedString;
    invoke-virtual {v2}, Landroidx/compose/foundation/text/LegacyTextFieldState;->getProcessor()Landroidx/compose/ui/text/input/EditProcessor;

    move-result-object v9

    move-object/from16 p13, v10

    .end local v10    # "scope":Landroidx/compose/runtime/RecomposeScope;
    .local p13, "scope":Landroidx/compose/runtime/RecomposeScope;
    invoke-virtual {v2}, Landroidx/compose/foundation/text/LegacyTextFieldState;->getInputSession()Landroidx/compose/ui/text/input/TextInputSession;

    move-result-object v10

    invoke-virtual {v9, v1, v10}, Landroidx/compose/ui/text/input/EditProcessor;->reset(Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/TextInputSession;)V

    .line 282
    const v9, -0x65a49f7f

    invoke-static {v6, v9, v15}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    const/4 v9, 0x0

    .restart local v9    # "invalid$iv":Z
    move-object v10, v6

    .local v10, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/16 v16, 0x0

    .line 1173
    .local v16, "$i$f$cache":I
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v1

    .local v1, "it$iv":Ljava/lang/Object;
    const/16 v36, 0x0

    .line 1174
    .local v36, "$i$a$-let-ComposerKt$cache$1$iv":I
    sget-object v42, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move/from16 p2, v9

    .end local v9    # "invalid$iv":Z
    .local p2, "invalid$iv":Z
    invoke-virtual/range {v42 .. v42}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v9

    if-ne v1, v9, :cond_5b

    .line 1175
    const/4 v9, 0x0

    .line 282
    .local v9, "$i$a$-cache-CoreTextFieldKt$CoreTextField$undoManager$1":I
    move-object/from16 p3, v1

    .end local v1    # "it$iv":Ljava/lang/Object;
    .local p3, "it$iv":Ljava/lang/Object;
    new-instance v1, Landroidx/compose/foundation/text/UndoManager;

    move/from16 p4, v9

    .end local v9    # "$i$a$-cache-CoreTextFieldKt$CoreTextField$undoManager$1":I
    .local p4, "$i$a$-cache-CoreTextFieldKt$CoreTextField$undoManager$1":I
    const/4 v9, 0x0

    move-object/from16 v18, v0

    move-object/from16 p17, v12

    const/4 v0, 0x1

    const/4 v12, 0x0

    .end local v0    # "focusManager":Landroidx/compose/ui/focus/FocusManager;
    .end local v12    # "keyboardController":Landroidx/compose/ui/platform/SoftwareKeyboardController;
    .local v18, "focusManager":Landroidx/compose/ui/focus/FocusManager;
    .local p17, "keyboardController":Landroidx/compose/ui/platform/SoftwareKeyboardController;
    invoke-direct {v1, v12, v0, v9}, Landroidx/compose/foundation/text/UndoManager;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 1175
    .end local p4    # "$i$a$-cache-CoreTextFieldKt$CoreTextField$undoManager$1":I
    nop

    .line 1176
    .local v1, "value$iv":Ljava/lang/Object;
    invoke-interface {v10, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1177
    nop

    .end local v1    # "value$iv":Ljava/lang/Object;
    goto :goto_42

    .line 1178
    .end local v18    # "focusManager":Landroidx/compose/ui/focus/FocusManager;
    .end local p3    # "it$iv":Ljava/lang/Object;
    .end local p17    # "keyboardController":Landroidx/compose/ui/platform/SoftwareKeyboardController;
    .restart local v0    # "focusManager":Landroidx/compose/ui/focus/FocusManager;
    .local v1, "it$iv":Ljava/lang/Object;
    .restart local v12    # "keyboardController":Landroidx/compose/ui/platform/SoftwareKeyboardController;
    :cond_5b
    move-object/from16 v18, v0

    move-object/from16 p3, v1

    move-object/from16 p17, v12

    .line 1173
    .end local v0    # "focusManager":Landroidx/compose/ui/focus/FocusManager;
    .end local v1    # "it$iv":Ljava/lang/Object;
    .end local v12    # "keyboardController":Landroidx/compose/ui/platform/SoftwareKeyboardController;
    .end local v36    # "$i$a$-let-ComposerKt$cache$1$iv":I
    .restart local v18    # "focusManager":Landroidx/compose/ui/focus/FocusManager;
    .restart local p17    # "keyboardController":Landroidx/compose/ui/platform/SoftwareKeyboardController;
    :goto_42
    nop

    .line 282
    .end local v10    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v16    # "$i$f$cache":I
    .end local p2    # "invalid$iv":Z
    move-object v0, v1

    check-cast v0, Landroidx/compose/foundation/text/UndoManager;

    .local v0, "undoManager":Landroidx/compose/foundation/text/UndoManager;
    invoke-static {v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 283
    const/4 v1, 0x2

    const/4 v9, 0x0

    const-wide/16 v42, 0x0

    move-object/from16 p3, p0

    move-object/from16 p2, v0

    move/from16 p6, v1

    move-object/from16 p7, v9

    move-wide/from16 p4, v42

    .end local v0    # "undoManager":Landroidx/compose/foundation/text/UndoManager;
    .local p2, "undoManager":Landroidx/compose/foundation/text/UndoManager;
    invoke-static/range {p2 .. p7}, Landroidx/compose/foundation/text/UndoManager;->snapshotIfNeeded$default(Landroidx/compose/foundation/text/UndoManager;Landroidx/compose/ui/text/input/TextFieldValue;JILjava/lang/Object;)V

    .line 285
    move-object/from16 v1, p3

    .end local p2    # "undoManager":Landroidx/compose/foundation/text/UndoManager;
    .restart local v0    # "undoManager":Landroidx/compose/foundation/text/UndoManager;
    const/16 v26, 0x0

    move/from16 v9, v26

    .local v9, "$changed$iv":I
    const/4 v10, 0x0

    .line 1179
    .local v10, "$i$f$rememberCoroutineScope":I
    const v12, 0x2e20b340

    move/from16 p2, v9

    .end local v9    # "$changed$iv":I
    .local p2, "$changed$iv":I
    const-string v9, "CC(rememberCoroutineScope)558@25470L68:Effects.kt#9igjgp"

    invoke-static {v6, v12, v9}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 1180
    nop

    .line 1184
    move-object v9, v6

    .line 1185
    .local v9, "composer$iv":Landroidx/compose/runtime/Composer;
    const v12, -0x38dffd5c

    move/from16 p3, v10

    .end local v10    # "$i$f$rememberCoroutineScope":I
    .local p3, "$i$f$rememberCoroutineScope":I
    const-string v10, "CC(remember):Effects.kt#9igjgp"

    invoke-static {v6, v12, v10}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    const/4 v10, 0x0

    .local v10, "invalid$iv$iv":Z
    move-object v12, v6

    .local v12, "$this$cache$iv$iv":Landroidx/compose/runtime/Composer;
    const/16 v36, 0x0

    .line 1186
    .local v36, "$i$f$cache":I
    move/from16 p4, v10

    .end local v10    # "invalid$iv$iv":Z
    .local p4, "invalid$iv$iv":Z
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v10

    .local v10, "it$iv$iv":Ljava/lang/Object;
    const/16 v42, 0x0

    .line 1187
    .local v42, "$i$a$-let-ComposerKt$cache$1$iv$iv":I
    sget-object v43, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move-object/from16 p8, v11

    .end local v11    # "imeOptions":Landroidx/compose/ui/text/input/ImeOptions;
    .local p8, "imeOptions":Landroidx/compose/ui/text/input/ImeOptions;
    invoke-virtual/range {v43 .. v43}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v11

    if-ne v10, v11, :cond_5c

    .line 1188
    const/4 v11, 0x0

    .line 1185
    .local v11, "$i$a$-cache-EffectsKt$rememberCoroutineScope$2$iv":I
    const/16 v43, 0x0

    .line 1189
    .local v43, "$i$a$-rememberCoroutineScope-EffectsKt$rememberCoroutineScope$1":I
    sget-object v43, Lkotlin/coroutines/EmptyCoroutineContext;->INSTANCE:Lkotlin/coroutines/EmptyCoroutineContext;

    .line 1185
    .end local v43    # "$i$a$-rememberCoroutineScope-EffectsKt$rememberCoroutineScope$1":I
    move-object/from16 p5, v10

    .end local v10    # "it$iv$iv":Ljava/lang/Object;
    .local p5, "it$iv$iv":Ljava/lang/Object;
    move-object/from16 v10, v43

    check-cast v10, Lkotlin/coroutines/CoroutineContext;

    invoke-static {v10, v9}, Landroidx/compose/runtime/EffectsKt;->createCompositionCoroutineScope(Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v10

    .line 1188
    .end local v11    # "$i$a$-cache-EffectsKt$rememberCoroutineScope$2$iv":I
    nop

    .line 1190
    .local v10, "value$iv$iv":Ljava/lang/Object;
    invoke-interface {v12, v10}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1191
    nop

    .end local v10    # "value$iv$iv":Ljava/lang/Object;
    goto :goto_43

    .line 1192
    .end local p5    # "it$iv$iv":Ljava/lang/Object;
    .local v10, "it$iv$iv":Ljava/lang/Object;
    :cond_5c
    move-object/from16 p5, v10

    .line 1186
    .end local v10    # "it$iv$iv":Ljava/lang/Object;
    .end local v42    # "$i$a$-let-ComposerKt$cache$1$iv$iv":I
    :goto_43
    nop

    .line 1185
    .end local v12    # "$this$cache$iv$iv":Landroidx/compose/runtime/Composer;
    .end local v36    # "$i$f$cache":I
    .end local p4    # "invalid$iv$iv":Z
    check-cast v10, Lkotlinx/coroutines/CoroutineScope;

    invoke-static {v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 1179
    invoke-static {v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 1185
    nop

    .line 285
    .end local v9    # "composer$iv":Landroidx/compose/runtime/Composer;
    .end local p2    # "$changed$iv":I
    .end local p3    # "$i$f$rememberCoroutineScope":I
    nop

    .line 286
    .local v10, "coroutineScope":Lkotlinx/coroutines/CoroutineScope;
    const v9, -0x65a48c94

    invoke-static {v6, v9, v15}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    const/4 v9, 0x0

    .local v9, "invalid$iv":Z
    move-object v11, v6

    .local v11, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/4 v12, 0x0

    .line 1193
    .local v12, "$i$f$cache":I
    move/from16 p2, v9

    .end local v9    # "invalid$iv":Z
    .local p2, "invalid$iv":Z
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v9

    .local v9, "it$iv":Ljava/lang/Object;
    const/16 v36, 0x0

    .line 1194
    .local v36, "$i$a$-let-ComposerKt$cache$1$iv":I
    sget-object v42, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move/from16 p3, v12

    .end local v12    # "$i$f$cache":I
    .local p3, "$i$f$cache":I
    invoke-virtual/range {v42 .. v42}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v12

    if-ne v9, v12, :cond_5d

    .line 1195
    const/4 v12, 0x0

    .line 286
    .local v12, "$i$a$-cache-CoreTextFieldKt$CoreTextField$bringIntoViewRequester$1":I
    invoke-static {}, Landroidx/compose/foundation/relocation/BringIntoViewRequesterKt;->BringIntoViewRequester()Landroidx/compose/foundation/relocation/BringIntoViewRequester;

    move-result-object v12

    .line 1195
    .end local v12    # "$i$a$-cache-CoreTextFieldKt$CoreTextField$bringIntoViewRequester$1":I
    nop

    .line 1196
    .local v12, "value$iv":Ljava/lang/Object;
    invoke-interface {v11, v12}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1197
    move-object v9, v12

    .end local v12    # "value$iv":Ljava/lang/Object;
    goto :goto_44

    .line 1198
    :cond_5d
    nop

    .line 1193
    .end local v9    # "it$iv":Ljava/lang/Object;
    .end local v36    # "$i$a$-let-ComposerKt$cache$1$iv":I
    :goto_44
    nop

    .line 286
    .end local v11    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local p2    # "invalid$iv":Z
    .end local p3    # "$i$f$cache":I
    check-cast v9, Landroidx/compose/foundation/relocation/BringIntoViewRequester;

    .local v9, "bringIntoViewRequester":Landroidx/compose/foundation/relocation/BringIntoViewRequester;
    invoke-static {v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 288
    const v11, -0x65a48566

    invoke-static {v6, v11, v15}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    const/4 v11, 0x0

    .local v11, "invalid$iv":Z
    move-object v12, v6

    .local v12, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/16 v36, 0x0

    .line 1199
    .local v36, "$i$f$cache":I
    move/from16 p2, v11

    .end local v11    # "invalid$iv":Z
    .restart local p2    # "invalid$iv":Z
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v11

    .local v11, "it$iv":Ljava/lang/Object;
    const/16 v42, 0x0

    .line 1200
    .local v42, "$i$a$-let-ComposerKt$cache$1$iv":I
    sget-object v43, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move-object/from16 p12, v9

    .end local v9    # "bringIntoViewRequester":Landroidx/compose/foundation/relocation/BringIntoViewRequester;
    .local p12, "bringIntoViewRequester":Landroidx/compose/foundation/relocation/BringIntoViewRequester;
    invoke-virtual/range {v43 .. v43}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v9

    if-ne v11, v9, :cond_5e

    .line 1201
    const/4 v9, 0x0

    .line 288
    .local v9, "$i$a$-cache-CoreTextFieldKt$CoreTextField$manager$1":I
    move/from16 p3, v9

    .end local v9    # "$i$a$-cache-CoreTextFieldKt$CoreTextField$manager$1":I
    .local p3, "$i$a$-cache-CoreTextFieldKt$CoreTextField$manager$1":I
    new-instance v9, Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;

    invoke-direct {v9, v0}, Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;-><init>(Landroidx/compose/foundation/text/UndoManager;)V

    .line 1201
    .end local p3    # "$i$a$-cache-CoreTextFieldKt$CoreTextField$manager$1":I
    nop

    .line 1202
    .local v9, "value$iv":Ljava/lang/Object;
    invoke-interface {v12, v9}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1203
    move-object v11, v9

    .end local v9    # "value$iv":Ljava/lang/Object;
    goto :goto_45

    .line 1204
    :cond_5e
    nop

    .line 1199
    .end local v11    # "it$iv":Ljava/lang/Object;
    .end local v42    # "$i$a$-let-ComposerKt$cache$1$iv":I
    :goto_45
    nop

    .line 288
    .end local v12    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v36    # "$i$f$cache":I
    .end local p2    # "invalid$iv":Z
    move-object v9, v11

    check-cast v9, Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;

    .local v9, "manager":Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;
    invoke-static {v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 289
    invoke-virtual {v9, v4}, Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;->setOffsetMapping$foundation_release(Landroidx/compose/ui/text/input/OffsetMapping;)V

    .line 290
    invoke-virtual {v9, v8}, Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;->setVisualTransformation$foundation_release(Landroidx/compose/ui/text/input/VisualTransformation;)V

    .line 291
    invoke-virtual {v2}, Landroidx/compose/foundation/text/LegacyTextFieldState;->getOnValueChange()Lkotlin/jvm/functions/Function1;

    move-result-object v11

    invoke-virtual {v9, v11}, Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;->setOnValueChange$foundation_release(Lkotlin/jvm/functions/Function1;)V

    .line 292
    invoke-virtual {v9, v2}, Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;->setState$foundation_release(Landroidx/compose/foundation/text/LegacyTextFieldState;)V

    .line 293
    invoke-virtual {v9, v1}, Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;->setValue$foundation_release(Landroidx/compose/ui/text/input/TextFieldValue;)V

    .line 294
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalClipboard()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v11

    check-cast v11, Landroidx/compose/runtime/CompositionLocal;

    .local v11, "this_$iv":Landroidx/compose/runtime/CompositionLocal;
    const/4 v12, 0x0

    .local v12, "$changed$iv":I
    const/16 v36, 0x0

    .line 1205
    .local v36, "$i$f$getCurrent":I
    move-object/from16 v42, v0

    const v0, 0x789c5f52

    .end local v0    # "undoManager":Landroidx/compose/foundation/text/UndoManager;
    .local v42, "undoManager":Landroidx/compose/foundation/text/UndoManager;
    invoke-static {v6, v0, v13}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v6, v11}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .end local v11    # "this_$iv":Landroidx/compose/runtime/CompositionLocal;
    .end local v12    # "$changed$iv":I
    .end local v36    # "$i$f$getCurrent":I
    check-cast v0, Landroidx/compose/ui/platform/Clipboard;

    .line 294
    invoke-virtual {v9, v0}, Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;->setClipboard$foundation_release(Landroidx/compose/ui/platform/Clipboard;)V

    .line 295
    invoke-virtual {v9, v10}, Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;->setCoroutineScope$foundation_release(Lkotlinx/coroutines/CoroutineScope;)V

    .line 296
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalTextToolbar()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v0

    check-cast v0, Landroidx/compose/runtime/CompositionLocal;

    .local v0, "this_$iv":Landroidx/compose/runtime/CompositionLocal;
    const/4 v11, 0x0

    .local v11, "$changed$iv":I
    const/4 v12, 0x0

    .line 1206
    .local v12, "$i$f$getCurrent":I
    const v1, 0x789c5f52

    invoke-static {v6, v1, v13}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v6, v0}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .end local v0    # "this_$iv":Landroidx/compose/runtime/CompositionLocal;
    .end local v11    # "$changed$iv":I
    .end local v12    # "$i$f$getCurrent":I
    check-cast v1, Landroidx/compose/ui/platform/TextToolbar;

    .line 296
    invoke-virtual {v9, v1}, Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;->setTextToolbar(Landroidx/compose/ui/platform/TextToolbar;)V

    .line 297
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalHapticFeedback()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v0

    check-cast v0, Landroidx/compose/runtime/CompositionLocal;

    .restart local v0    # "this_$iv":Landroidx/compose/runtime/CompositionLocal;
    const/4 v1, 0x0

    .local v1, "$changed$iv":I
    const/4 v11, 0x0

    .line 1207
    .local v11, "$i$f$getCurrent":I
    const v12, 0x789c5f52

    invoke-static {v6, v12, v13}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v6, v0}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v12

    invoke-static {v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .end local v0    # "this_$iv":Landroidx/compose/runtime/CompositionLocal;
    .end local v1    # "$changed$iv":I
    .end local v11    # "$i$f$getCurrent":I
    check-cast v12, Landroidx/compose/ui/hapticfeedback/HapticFeedback;

    .line 297
    invoke-virtual {v9, v12}, Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;->setHapticFeedBack(Landroidx/compose/ui/hapticfeedback/HapticFeedback;)V

    .line 298
    invoke-virtual {v9, v5}, Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;->setFocusRequester(Landroidx/compose/ui/focus/FocusRequester;)V

    .line 299
    xor-int/lit8 v0, v25, 0x1

    invoke-virtual {v9, v0}, Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;->setEditable(Z)V

    .line 300
    invoke-virtual {v9, v14}, Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;->setEnabled(Z)V

    .line 304
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v0, Landroidx/compose/ui/Modifier;

    .line 305
    nop

    .line 306
    nop

    .line 307
    nop

    .line 308
    const v1, -0x65a41f50

    invoke-static {v6, v1, v15}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v6, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v1

    and-int/lit16 v11, v3, 0x1c00

    const/16 v12, 0x800

    if-ne v11, v12, :cond_5f

    const/4 v11, 0x1

    goto :goto_46

    :cond_5f
    const/4 v11, 0x0

    :goto_46
    or-int/2addr v1, v11

    const v11, 0xe000

    and-int/2addr v11, v3

    const/16 v12, 0x4000

    if-ne v11, v12, :cond_60

    const/4 v11, 0x1

    goto :goto_47

    :cond_60
    const/4 v11, 0x0

    :goto_47
    or-int/2addr v1, v11

    invoke-interface {v6, v7}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v11

    or-int/2addr v1, v11

    and-int/lit8 v11, v22, 0xe

    const/4 v12, 0x4

    if-ne v11, v12, :cond_61

    const/4 v11, 0x1

    goto :goto_48

    :cond_61
    const/4 v11, 0x0

    :goto_48
    or-int/2addr v1, v11

    and-int/lit8 v11, v3, 0x70

    xor-int/lit8 v11, v11, 0x30

    const/16 v12, 0x20

    if-le v11, v12, :cond_63

    move-object/from16 v11, p8

    .end local p8    # "imeOptions":Landroidx/compose/ui/text/input/ImeOptions;
    .local v11, "imeOptions":Landroidx/compose/ui/text/input/ImeOptions;
    invoke-interface {v6, v11}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_62

    goto :goto_49

    :cond_62
    move/from16 p2, v1

    goto :goto_4a

    .end local v11    # "imeOptions":Landroidx/compose/ui/text/input/ImeOptions;
    .restart local p8    # "imeOptions":Landroidx/compose/ui/text/input/ImeOptions;
    :cond_63
    move-object/from16 v11, p8

    .end local p8    # "imeOptions":Landroidx/compose/ui/text/input/ImeOptions;
    .restart local v11    # "imeOptions":Landroidx/compose/ui/text/input/ImeOptions;
    :goto_49
    and-int/lit8 v12, v3, 0x30

    move/from16 p2, v1

    const/16 v1, 0x20

    if-ne v12, v1, :cond_64

    :goto_4a
    const/4 v1, 0x1

    goto :goto_4b

    :cond_64
    const/4 v1, 0x0

    :goto_4b
    or-int v1, p2, v1

    invoke-interface {v6, v4}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v12

    or-int/2addr v1, v12

    invoke-interface {v6, v10}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v12

    or-int/2addr v1, v12

    move-object/from16 v12, p12

    .end local p12    # "bringIntoViewRequester":Landroidx/compose/foundation/relocation/BringIntoViewRequester;
    .local v12, "bringIntoViewRequester":Landroidx/compose/foundation/relocation/BringIntoViewRequester;
    invoke-interface {v6, v12}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v36

    or-int v1, v1, v36

    invoke-interface {v6, v9}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v36

    or-int v1, v1, v36

    .local v1, "invalid$iv":Z
    move-object/from16 v36, v6

    .local v36, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/16 v43, 0x0

    .line 1208
    .local v43, "$i$f$cache":I
    move/from16 v49, v1

    .end local v1    # "invalid$iv":Z
    .local v49, "invalid$iv":Z
    invoke-interface/range {v36 .. v36}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v1

    .local v1, "it$iv":Ljava/lang/Object;
    const/16 v50, 0x0

    .line 1209
    .local v50, "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez v49, :cond_66

    sget-object v51, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move-object/from16 p2, v2

    .end local v2    # "state":Landroidx/compose/foundation/text/LegacyTextFieldState;
    .local p2, "state":Landroidx/compose/foundation/text/LegacyTextFieldState;
    invoke-virtual/range {v51 .. v51}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v2

    if-ne v1, v2, :cond_65

    goto :goto_4c

    .line 1213
    :cond_65
    move-object v2, v1

    move-object v1, v9

    move-object/from16 v51, v10

    move-object/from16 v52, v12

    move v9, v14

    move-object/from16 v14, v36

    move-object/from16 v12, p2

    move-object v10, v4

    move-object v4, v7

    move-object/from16 v7, p0

    goto :goto_4d

    .line 1209
    .end local p2    # "state":Landroidx/compose/foundation/text/LegacyTextFieldState;
    .restart local v2    # "state":Landroidx/compose/foundation/text/LegacyTextFieldState;
    :cond_66
    move-object/from16 p2, v2

    .line 1210
    .end local v2    # "state":Landroidx/compose/foundation/text/LegacyTextFieldState;
    .restart local p2    # "state":Landroidx/compose/foundation/text/LegacyTextFieldState;
    :goto_4c
    const/4 v2, 0x0

    .line 308
    .local v2, "$i$a$-cache-CoreTextFieldKt$CoreTextField$focusModifier$1":I
    new-instance v51, Landroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$focusModifier$1$1;

    move-object/from16 p7, p0

    move-object/from16 p3, p2

    move-object/from16 p9, v4

    move-object/from16 p6, v7

    move-object/from16 p10, v9

    move-object/from16 p11, v10

    move-object/from16 p8, v11

    move-object/from16 p12, v12

    move/from16 p4, v14

    move/from16 p5, v25

    move-object/from16 p2, v51

    .end local v4    # "offsetMapping":Landroidx/compose/ui/text/input/OffsetMapping;
    .end local v7    # "textInputService":Landroidx/compose/ui/text/input/TextInputService;
    .end local v9    # "manager":Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;
    .end local v10    # "coroutineScope":Lkotlinx/coroutines/CoroutineScope;
    .end local v11    # "imeOptions":Landroidx/compose/ui/text/input/ImeOptions;
    .end local v12    # "bringIntoViewRequester":Landroidx/compose/foundation/relocation/BringIntoViewRequester;
    .end local v14    # "enabled":Z
    .end local v25    # "readOnly":Z
    .end local p2    # "state":Landroidx/compose/foundation/text/LegacyTextFieldState;
    .local p3, "state":Landroidx/compose/foundation/text/LegacyTextFieldState;
    .local p4, "enabled":Z
    .local p5, "readOnly":Z
    .local p6, "textInputService":Landroidx/compose/ui/text/input/TextInputService;
    .restart local p8    # "imeOptions":Landroidx/compose/ui/text/input/ImeOptions;
    .local p9, "offsetMapping":Landroidx/compose/ui/text/input/OffsetMapping;
    .local p10, "manager":Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;
    .local p11, "coroutineScope":Lkotlinx/coroutines/CoroutineScope;
    .restart local p12    # "bringIntoViewRequester":Landroidx/compose/foundation/relocation/BringIntoViewRequester;
    invoke-direct/range {p2 .. p12}, Landroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$focusModifier$1$1;-><init>(Landroidx/compose/foundation/text/LegacyTextFieldState;ZZLandroidx/compose/ui/text/input/TextInputService;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/ImeOptions;Landroidx/compose/ui/text/input/OffsetMapping;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/foundation/relocation/BringIntoViewRequester;)V

    move-object/from16 v52, p2

    move-object/from16 v12, p3

    move/from16 v9, p4

    move-object/from16 v4, p6

    move-object/from16 v7, p7

    move-object/from16 v10, p9

    move-object/from16 v51, p11

    move-object/from16 v14, p12

    move-object/from16 p2, v1

    move-object/from16 v1, p10

    .end local p3    # "state":Landroidx/compose/foundation/text/LegacyTextFieldState;
    .end local p4    # "enabled":Z
    .end local p5    # "readOnly":Z
    .end local p6    # "textInputService":Landroidx/compose/ui/text/input/TextInputService;
    .end local p8    # "imeOptions":Landroidx/compose/ui/text/input/ImeOptions;
    .end local p9    # "offsetMapping":Landroidx/compose/ui/text/input/OffsetMapping;
    .end local p10    # "manager":Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;
    .end local p11    # "coroutineScope":Lkotlinx/coroutines/CoroutineScope;
    .end local p12    # "bringIntoViewRequester":Landroidx/compose/foundation/relocation/BringIntoViewRequester;
    .local v1, "manager":Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;
    .local v4, "textInputService":Landroidx/compose/ui/text/input/TextInputService;
    .local v9, "enabled":Z
    .local v10, "offsetMapping":Landroidx/compose/ui/text/input/OffsetMapping;
    .restart local v11    # "imeOptions":Landroidx/compose/ui/text/input/ImeOptions;
    .local v12, "state":Landroidx/compose/foundation/text/LegacyTextFieldState;
    .local v14, "bringIntoViewRequester":Landroidx/compose/foundation/relocation/BringIntoViewRequester;
    .restart local v25    # "readOnly":Z
    .local v51, "coroutineScope":Lkotlinx/coroutines/CoroutineScope;
    .local p2, "it$iv":Ljava/lang/Object;
    move-object/from16 v2, v52

    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 1210
    .end local v2    # "$i$a$-cache-CoreTextFieldKt$CoreTextField$focusModifier$1":I
    nop

    .line 1211
    .local v2, "value$iv":Ljava/lang/Object;
    move-object/from16 v52, v14

    move-object/from16 v14, v36

    .end local v36    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .local v14, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .local v52, "bringIntoViewRequester":Landroidx/compose/foundation/relocation/BringIntoViewRequester;
    invoke-interface {v14, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1212
    nop

    .line 1208
    .end local v2    # "value$iv":Ljava/lang/Object;
    .end local v50    # "$i$a$-let-ComposerKt$cache$1$iv":I
    .end local p2    # "it$iv":Ljava/lang/Object;
    :goto_4d
    nop

    .line 308
    .end local v14    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v43    # "$i$f$cache":I
    .end local v49    # "invalid$iv":Z
    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 304
    move-object/from16 v14, v41

    .end local v41    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .local v14, "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    invoke-static {v0, v9, v5, v14, v2}, Landroidx/compose/foundation/text/TextFieldGestureModifiersKt;->textFieldFocusModifier(Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/focus/FocusRequester;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    .line 303
    nop

    .line 343
    .local v0, "focusModifier":Landroidx/compose/ui/Modifier;
    if-eqz v9, :cond_67

    if-nez v25, :cond_67

    const/4 v2, 0x1

    goto :goto_4e

    :cond_67
    const/4 v2, 0x0

    :goto_4e
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    move-object/from16 p12, v5

    const/4 v5, 0x0

    .end local v5    # "focusRequester":Landroidx/compose/ui/focus/FocusRequester;
    .local p12, "focusRequester":Landroidx/compose/ui/focus/FocusRequester;
    invoke-static {v2, v6, v5}, Landroidx/compose/runtime/SnapshotStateKt;->rememberUpdatedState(Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    move-result-object v2

    .line 344
    .local v2, "writeable$delegate":Landroidx/compose/runtime/State;
    sget-object v5, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    move/from16 v36, v9

    .end local v9    # "enabled":Z
    .local v36, "enabled":Z
    const v9, -0x65a34e6f

    invoke-static {v6, v9, v15}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v6, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v9

    invoke-interface {v6, v12}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v41

    or-int v9, v9, v41

    invoke-interface {v6, v4}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v41

    or-int v9, v9, v41

    invoke-interface {v6, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v41

    or-int v9, v9, v41

    and-int/lit8 v41, v3, 0x70

    move-object/from16 p10, v1

    .end local v1    # "manager":Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;
    .restart local p10    # "manager":Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;
    xor-int/lit8 v1, v41, 0x30

    move-object/from16 p4, v2

    const/16 v2, 0x20

    .end local v2    # "writeable$delegate":Landroidx/compose/runtime/State;
    .local p4, "writeable$delegate":Landroidx/compose/runtime/State;
    if-le v1, v2, :cond_68

    invoke-interface {v6, v11}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_69

    :cond_68
    and-int/lit8 v1, v3, 0x30

    const/16 v2, 0x20

    if-ne v1, v2, :cond_6a

    :cond_69
    const/4 v1, 0x1

    goto :goto_4f

    :cond_6a
    const/4 v1, 0x0

    :goto_4f
    or-int/2addr v1, v9

    .local v1, "invalid$iv":Z
    move-object v2, v6

    .local v2, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/4 v9, 0x0

    .line 1214
    .local v9, "$i$f$cache":I
    move/from16 p9, v1

    .end local v1    # "invalid$iv":Z
    .local p9, "invalid$iv":Z
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v1

    .local v1, "it$iv":Ljava/lang/Object;
    const/16 v41, 0x0

    .line 1215
    .local v41, "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez p9, :cond_6c

    sget-object v43, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move-object/from16 p6, v4

    .end local v4    # "textInputService":Landroidx/compose/ui/text/input/TextInputService;
    .restart local p6    # "textInputService":Landroidx/compose/ui/text/input/TextInputService;
    invoke-virtual/range {v43 .. v43}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v4

    if-ne v1, v4, :cond_6b

    goto :goto_50

    .line 1219
    :cond_6b
    move-object/from16 v43, p4

    move-object/from16 v4, p10

    move/from16 p4, v9

    move-object v9, v1

    move-object v1, v12

    move-object v12, v11

    move-object/from16 v11, p6

    goto :goto_51

    .line 1215
    .end local p6    # "textInputService":Landroidx/compose/ui/text/input/TextInputService;
    .restart local v4    # "textInputService":Landroidx/compose/ui/text/input/TextInputService;
    :cond_6c
    move-object/from16 p6, v4

    .line 1216
    .end local v4    # "textInputService":Landroidx/compose/ui/text/input/TextInputService;
    .restart local p6    # "textInputService":Landroidx/compose/ui/text/input/TextInputService;
    :goto_50
    const/4 v4, 0x0

    .line 344
    .local v4, "$i$a$-cache-CoreTextFieldKt$CoreTextField$2":I
    new-instance v43, Landroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$2$1;

    const/16 v49, 0x0

    move-object/from16 p5, p6

    move-object/from16 p6, p10

    move-object/from16 p7, v11

    move-object/from16 p3, v12

    move-object/from16 p2, v43

    move-object/from16 p8, v49

    .end local v11    # "imeOptions":Landroidx/compose/ui/text/input/ImeOptions;
    .end local v12    # "state":Landroidx/compose/foundation/text/LegacyTextFieldState;
    .end local p10    # "manager":Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;
    .restart local p3    # "state":Landroidx/compose/foundation/text/LegacyTextFieldState;
    .local p5, "textInputService":Landroidx/compose/ui/text/input/TextInputService;
    .local p6, "manager":Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;
    .local p7, "imeOptions":Landroidx/compose/ui/text/input/ImeOptions;
    invoke-direct/range {p2 .. p8}, Landroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$2$1;-><init>(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroidx/compose/runtime/State;Landroidx/compose/ui/text/input/TextInputService;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroidx/compose/ui/text/input/ImeOptions;Lkotlin/coroutines/Continuation;)V

    move-object/from16 v49, p2

    move-object/from16 v43, p4

    move-object/from16 v11, p5

    move-object/from16 v12, p7

    move-object/from16 p2, v1

    move-object/from16 v1, p3

    move/from16 p3, v4

    move-object/from16 v4, p6

    .end local p4    # "writeable$delegate":Landroidx/compose/runtime/State;
    .end local p5    # "textInputService":Landroidx/compose/ui/text/input/TextInputService;
    .end local p6    # "manager":Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;
    .end local p7    # "imeOptions":Landroidx/compose/ui/text/input/ImeOptions;
    .local v1, "state":Landroidx/compose/foundation/text/LegacyTextFieldState;
    .local v4, "manager":Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;
    .local v11, "textInputService":Landroidx/compose/ui/text/input/TextInputService;
    .local v12, "imeOptions":Landroidx/compose/ui/text/input/ImeOptions;
    .local v43, "writeable$delegate":Landroidx/compose/runtime/State;
    .restart local p2    # "it$iv":Ljava/lang/Object;
    .local p3, "$i$a$-cache-CoreTextFieldKt$CoreTextField$2":I
    check-cast v49, Lkotlin/jvm/functions/Function2;

    .line 1216
    .end local p3    # "$i$a$-cache-CoreTextFieldKt$CoreTextField$2":I
    move-object/from16 p3, v49

    .line 1217
    .local p3, "value$iv":Ljava/lang/Object;
    move/from16 p4, v9

    move-object/from16 v9, p3

    .end local p3    # "value$iv":Ljava/lang/Object;
    .local v9, "value$iv":Ljava/lang/Object;
    .local p4, "$i$f$cache":I
    invoke-interface {v2, v9}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1218
    nop

    .line 1214
    .end local v9    # "value$iv":Ljava/lang/Object;
    .end local v41    # "$i$a$-let-ComposerKt$cache$1$iv":I
    .end local p2    # "it$iv":Ljava/lang/Object;
    :goto_51
    nop

    .line 344
    .end local v2    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local p4    # "$i$f$cache":I
    .end local p9    # "invalid$iv":Z
    check-cast v9, Lkotlin/jvm/functions/Function2;

    invoke-static {v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    const/4 v2, 0x6

    invoke-static {v5, v9, v6, v2}, Landroidx/compose/runtime/EffectsKt;->LaunchedEffect(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    .line 370
    sget-object v2, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v2, Landroidx/compose/ui/Modifier;

    const v5, -0x65a2d01d

    invoke-static {v6, v5, v15}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v6, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v5

    .local v5, "invalid$iv":Z
    move-object v9, v6

    .local v9, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/16 v41, 0x0

    .line 1220
    .local v41, "$i$f$cache":I
    move/from16 p2, v5

    .end local v5    # "invalid$iv":Z
    .local p2, "invalid$iv":Z
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v5

    .local v5, "it$iv":Ljava/lang/Object;
    const/16 v49, 0x0

    .line 1221
    .local v49, "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez p2, :cond_6e

    sget-object v50, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move-object/from16 p11, v12

    .end local v12    # "imeOptions":Landroidx/compose/ui/text/input/ImeOptions;
    .local p11, "imeOptions":Landroidx/compose/ui/text/input/ImeOptions;
    invoke-virtual/range {v50 .. v50}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v12

    if-ne v5, v12, :cond_6d

    goto :goto_52

    .line 1225
    :cond_6d
    goto :goto_53

    .line 1221
    .end local p11    # "imeOptions":Landroidx/compose/ui/text/input/ImeOptions;
    .restart local v12    # "imeOptions":Landroidx/compose/ui/text/input/ImeOptions;
    :cond_6e
    move-object/from16 p11, v12

    .line 1222
    .end local v12    # "imeOptions":Landroidx/compose/ui/text/input/ImeOptions;
    .restart local p11    # "imeOptions":Landroidx/compose/ui/text/input/ImeOptions;
    :goto_52
    const/4 v12, 0x0

    .line 370
    .local v12, "$i$a$-cache-CoreTextFieldKt$CoreTextField$pointerModifier$1":I
    move-object/from16 p3, v5

    .end local v5    # "it$iv":Ljava/lang/Object;
    .local p3, "it$iv":Ljava/lang/Object;
    new-instance v5, Landroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$pointerModifier$1$1;

    invoke-direct {v5, v1}, Landroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$pointerModifier$1$1;-><init>(Landroidx/compose/foundation/text/LegacyTextFieldState;)V

    check-cast v5, Lkotlin/jvm/functions/Function1;

    .line 1222
    .end local v12    # "$i$a$-cache-CoreTextFieldKt$CoreTextField$pointerModifier$1":I
    nop

    .line 1223
    .local v5, "value$iv":Ljava/lang/Object;
    invoke-interface {v9, v5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1224
    nop

    .line 1220
    .end local v5    # "value$iv":Ljava/lang/Object;
    .end local v49    # "$i$a$-let-ComposerKt$cache$1$iv":I
    .end local p3    # "it$iv":Ljava/lang/Object;
    :goto_53
    nop

    .line 370
    .end local v9    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v41    # "$i$f$cache":I
    .end local p2    # "invalid$iv":Z
    check-cast v5, Lkotlin/jvm/functions/Function1;

    invoke-static {v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    invoke-static {v2, v5}, Landroidx/compose/foundation/text/selection/SelectionGesturesKt;->updateSelectionTouchMode(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    .line 371
    const v5, -0x65a2c05a

    invoke-static {v6, v5, v15}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v6, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v5

    const v9, 0xe000

    and-int/2addr v9, v3

    const/16 v12, 0x4000

    if-ne v9, v12, :cond_6f

    const/4 v9, 0x1

    goto :goto_54

    :cond_6f
    const/4 v9, 0x0

    :goto_54
    or-int/2addr v5, v9

    and-int/lit16 v9, v3, 0x1c00

    const/16 v12, 0x800

    if-ne v9, v12, :cond_70

    const/4 v9, 0x1

    goto :goto_55

    :cond_70
    const/4 v9, 0x0

    :goto_55
    or-int/2addr v5, v9

    invoke-interface {v6, v10}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v5, v9

    invoke-interface {v6, v4}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v5, v9

    .local v5, "invalid$iv":Z
    move-object v9, v6

    .restart local v9    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/4 v12, 0x0

    .line 1226
    .local v12, "$i$f$cache":I
    move-object/from16 p2, v1

    .end local v1    # "state":Landroidx/compose/foundation/text/LegacyTextFieldState;
    .local p2, "state":Landroidx/compose/foundation/text/LegacyTextFieldState;
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v1

    .local v1, "it$iv":Ljava/lang/Object;
    const/16 v28, 0x0

    .line 1227
    .local v28, "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez v5, :cond_72

    sget-object v41, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move-object/from16 p10, v4

    .end local v4    # "manager":Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;
    .restart local p10    # "manager":Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;
    invoke-virtual/range {v41 .. v41}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v4

    if-ne v1, v4, :cond_71

    goto :goto_56

    .line 1231
    :cond_71
    move/from16 p4, v5

    move-object v4, v10

    move-object/from16 v5, p2

    move-object v10, v1

    move/from16 v1, v36

    goto :goto_57

    .line 1227
    .end local p10    # "manager":Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;
    .restart local v4    # "manager":Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;
    :cond_72
    move-object/from16 p10, v4

    .line 1228
    .end local v4    # "manager":Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;
    .restart local p10    # "manager":Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;
    :goto_56
    const/4 v4, 0x0

    .line 371
    .local v4, "$i$a$-cache-CoreTextFieldKt$CoreTextField$pointerModifier$2":I
    new-instance v41, Landroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$pointerModifier$2$1;

    move-object/from16 p3, p2

    move-object/from16 p7, p10

    move-object/from16 p4, p12

    move-object/from16 p8, v10

    move/from16 p5, v25

    move/from16 p6, v36

    move-object/from16 p2, v41

    .end local v10    # "offsetMapping":Landroidx/compose/ui/text/input/OffsetMapping;
    .end local v25    # "readOnly":Z
    .end local v36    # "enabled":Z
    .end local p2    # "state":Landroidx/compose/foundation/text/LegacyTextFieldState;
    .end local p10    # "manager":Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;
    .end local p12    # "focusRequester":Landroidx/compose/ui/focus/FocusRequester;
    .local p3, "state":Landroidx/compose/foundation/text/LegacyTextFieldState;
    .local p4, "focusRequester":Landroidx/compose/ui/focus/FocusRequester;
    .local p5, "readOnly":Z
    .local p6, "enabled":Z
    .local p7, "manager":Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;
    .local p8, "offsetMapping":Landroidx/compose/ui/text/input/OffsetMapping;
    invoke-direct/range {p2 .. p8}, Landroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$pointerModifier$2$1;-><init>(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroidx/compose/ui/focus/FocusRequester;ZZLandroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroidx/compose/ui/text/input/OffsetMapping;)V

    move-object/from16 v36, p2

    move-object/from16 v10, p4

    move-object/from16 p2, v1

    move/from16 p4, v5

    move-object/from16 v5, p3

    move/from16 v1, p6

    move/from16 p3, v4

    move-object/from16 v4, p8

    .end local p5    # "readOnly":Z
    .end local p6    # "enabled":Z
    .end local p7    # "manager":Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;
    .end local p8    # "offsetMapping":Landroidx/compose/ui/text/input/OffsetMapping;
    .local v1, "enabled":Z
    .local v4, "offsetMapping":Landroidx/compose/ui/text/input/OffsetMapping;
    .local v5, "state":Landroidx/compose/foundation/text/LegacyTextFieldState;
    .local v10, "focusRequester":Landroidx/compose/ui/focus/FocusRequester;
    .restart local v25    # "readOnly":Z
    .local p2, "it$iv":Ljava/lang/Object;
    .local p3, "$i$a$-cache-CoreTextFieldKt$CoreTextField$pointerModifier$2":I
    .local p4, "invalid$iv":Z
    .restart local p10    # "manager":Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;
    move-object/from16 v41, v36

    check-cast v41, Lkotlin/jvm/functions/Function1;

    .line 1228
    .end local p3    # "$i$a$-cache-CoreTextFieldKt$CoreTextField$pointerModifier$2":I
    move-object/from16 p3, v41

    .line 1229
    .local p3, "value$iv":Ljava/lang/Object;
    move-object/from16 p12, v10

    move-object/from16 v10, p3

    .end local p3    # "value$iv":Ljava/lang/Object;
    .local v10, "value$iv":Ljava/lang/Object;
    .restart local p12    # "focusRequester":Landroidx/compose/ui/focus/FocusRequester;
    invoke-interface {v9, v10}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1230
    nop

    .line 1226
    .end local v10    # "value$iv":Ljava/lang/Object;
    .end local v28    # "$i$a$-let-ComposerKt$cache$1$iv":I
    .end local p2    # "it$iv":Ljava/lang/Object;
    :goto_57
    nop

    .line 371
    .end local v9    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v12    # "$i$f$cache":I
    .end local p4    # "invalid$iv":Z
    check-cast v10, Lkotlin/jvm/functions/Function1;

    invoke-static {v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    invoke-static {v2, v14, v1, v10}, Landroidx/compose/foundation/text/TextFieldPressGestureFilterKt;->tapPressTextFieldModifier(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/interaction/MutableInteractionSource;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    .line 394
    invoke-virtual/range {p10 .. p10}, Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;->getMouseSelectionObserver$foundation_release()Landroidx/compose/foundation/text/selection/MouseSelectionObserver;

    move-result-object v9

    .line 395
    invoke-virtual/range {p10 .. p10}, Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;->getTouchSelectionObserver$foundation_release()Landroidx/compose/foundation/text/TextDragObserver;

    move-result-object v10

    .line 393
    invoke-static {v2, v9, v10}, Landroidx/compose/foundation/text/selection/SelectionGesturesKt;->selectionGestureInput(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/text/selection/MouseSelectionObserver;Landroidx/compose/foundation/text/TextDragObserver;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    .line 397
    invoke-static {}, Landroidx/compose/foundation/text/TextPointerIcon_androidKt;->getTextPointerIcon()Landroidx/compose/ui/input/pointer/PointerIcon;

    move-result-object v9

    const/4 v10, 0x0

    move/from16 p4, v1

    const/4 v1, 0x0

    const/4 v12, 0x2

    .end local v1    # "enabled":Z
    .local p4, "enabled":Z
    invoke-static {v2, v9, v1, v12, v10}, Landroidx/compose/ui/input/pointer/PointerIconKt;->pointerHoverIcon$default(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/input/pointer/PointerIcon;ZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    .line 369
    move-object v1, v2

    .line 400
    .local v1, "pointerModifier":Landroidx/compose/ui/Modifier;
    sget-object v2, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v2, Landroidx/compose/ui/Modifier;

    const v9, -0x65a221d9

    invoke-static {v6, v9, v15}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v6, v5}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v9

    and-int/lit8 v10, v22, 0xe

    const/4 v12, 0x4

    if-ne v10, v12, :cond_73

    const/4 v10, 0x1

    goto :goto_58

    :cond_73
    const/4 v10, 0x0

    :goto_58
    or-int/2addr v9, v10

    invoke-interface {v6, v4}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v10

    or-int/2addr v9, v10

    .local v9, "invalid$iv":Z
    move-object v10, v6

    .local v10, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/4 v12, 0x0

    .line 1232
    .restart local v12    # "$i$f$cache":I
    move/from16 p2, v9

    .end local v9    # "invalid$iv":Z
    .local p2, "invalid$iv":Z
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v9

    .local v9, "it$iv":Ljava/lang/Object;
    const/16 v21, 0x0

    .line 1233
    .local v21, "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez p2, :cond_75

    sget-object v28, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move/from16 p3, v12

    .end local v12    # "$i$f$cache":I
    .local p3, "$i$f$cache":I
    invoke-virtual/range {v28 .. v28}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v12

    if-ne v9, v12, :cond_74

    goto :goto_59

    .line 1237
    :cond_74
    goto :goto_5a

    .line 1233
    .end local p3    # "$i$f$cache":I
    .restart local v12    # "$i$f$cache":I
    :cond_75
    move/from16 p3, v12

    .line 1234
    .end local v12    # "$i$f$cache":I
    .restart local p3    # "$i$f$cache":I
    :goto_59
    const/4 v12, 0x0

    .line 400
    .local v12, "$i$a$-cache-CoreTextFieldKt$CoreTextField$drawModifier$1":I
    move-object/from16 p5, v9

    .end local v9    # "it$iv":Ljava/lang/Object;
    .local p5, "it$iv":Ljava/lang/Object;
    new-instance v9, Landroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$drawModifier$1$1;

    invoke-direct {v9, v5, v7, v4}, Landroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$drawModifier$1$1;-><init>(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/OffsetMapping;)V

    check-cast v9, Lkotlin/jvm/functions/Function1;

    .line 1234
    .end local v12    # "$i$a$-cache-CoreTextFieldKt$CoreTextField$drawModifier$1":I
    nop

    .line 1235
    .local v9, "value$iv":Ljava/lang/Object;
    invoke-interface {v10, v9}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1236
    nop

    .line 1232
    .end local v9    # "value$iv":Ljava/lang/Object;
    .end local v21    # "$i$a$-let-ComposerKt$cache$1$iv":I
    .end local p5    # "it$iv":Ljava/lang/Object;
    :goto_5a
    nop

    .line 400
    .end local v10    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local p2    # "invalid$iv":Z
    .end local p3    # "$i$f$cache":I
    check-cast v9, Lkotlin/jvm/functions/Function1;

    invoke-static {v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    invoke-static {v2, v9}, Landroidx/compose/ui/draw/DrawModifierKt;->drawBehind(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    .line 399
    nop

    .line 418
    .local v10, "drawModifier":Landroidx/compose/ui/Modifier;
    sget-object v2, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v2, Landroidx/compose/ui/Modifier;

    const v9, -0x65a1ccf4

    invoke-static {v6, v9, v15}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v6, v5}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v9

    and-int/lit16 v12, v3, 0x1c00

    move/from16 v21, v3

    const/16 v3, 0x800

    .end local v3    # "$dirty1":I
    .local v21, "$dirty1":I
    if-ne v12, v3, :cond_76

    const/4 v3, 0x1

    goto :goto_5b

    :cond_76
    const/4 v3, 0x0

    :goto_5b
    or-int/2addr v3, v9

    move-object/from16 v9, v40

    .end local v40    # "windowInfo":Landroidx/compose/ui/platform/WindowInfo;
    .local v9, "windowInfo":Landroidx/compose/ui/platform/WindowInfo;
    invoke-interface {v6, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v12

    or-int/2addr v3, v12

    move-object/from16 v12, p10

    .end local p10    # "manager":Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;
    .local v12, "manager":Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;
    invoke-interface {v6, v12}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v27

    or-int v3, v3, v27

    move/from16 p2, v3

    and-int/lit8 v3, v22, 0xe

    move-object/from16 p3, v5

    const/4 v5, 0x4

    .end local v5    # "state":Landroidx/compose/foundation/text/LegacyTextFieldState;
    .local p3, "state":Landroidx/compose/foundation/text/LegacyTextFieldState;
    if-ne v3, v5, :cond_77

    const/4 v3, 0x1

    goto :goto_5c

    :cond_77
    const/4 v3, 0x0

    :goto_5c
    or-int v3, p2, v3

    invoke-interface {v6, v4}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v3, v5

    .local v3, "invalid$iv":Z
    move-object v5, v6

    .local v5, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/16 v27, 0x0

    .line 1238
    .local v27, "$i$f$cache":I
    move/from16 p9, v3

    .end local v3    # "invalid$iv":Z
    .restart local p9    # "invalid$iv":Z
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v3

    .local v3, "it$iv":Ljava/lang/Object;
    const/16 v28, 0x0

    .line 1239
    .restart local v28    # "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez p9, :cond_79

    sget-object v36, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move-object/from16 p8, v4

    .end local v4    # "offsetMapping":Landroidx/compose/ui/text/input/OffsetMapping;
    .restart local p8    # "offsetMapping":Landroidx/compose/ui/text/input/OffsetMapping;
    invoke-virtual/range {v36 .. v36}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v4

    if-ne v3, v4, :cond_78

    goto :goto_5d

    .line 1243
    :cond_78
    move/from16 v36, p4

    move-object/from16 v7, p8

    move-object/from16 v40, v9

    move-object v9, v12

    move-object/from16 v12, p3

    goto :goto_5e

    .line 1239
    .end local p8    # "offsetMapping":Landroidx/compose/ui/text/input/OffsetMapping;
    .restart local v4    # "offsetMapping":Landroidx/compose/ui/text/input/OffsetMapping;
    :cond_79
    move-object/from16 p8, v4

    .line 1240
    .end local v4    # "offsetMapping":Landroidx/compose/ui/text/input/OffsetMapping;
    .restart local p8    # "offsetMapping":Landroidx/compose/ui/text/input/OffsetMapping;
    :goto_5d
    const/4 v4, 0x0

    .line 418
    .local v4, "$i$a$-cache-CoreTextFieldKt$CoreTextField$onPositionedModifier$1":I
    new-instance v36, Landroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$onPositionedModifier$1$1;

    move-object/from16 p7, v7

    move-object/from16 p5, v9

    move-object/from16 p6, v12

    move-object/from16 p2, v36

    .end local v9    # "windowInfo":Landroidx/compose/ui/platform/WindowInfo;
    .end local v12    # "manager":Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;
    .local p5, "windowInfo":Landroidx/compose/ui/platform/WindowInfo;
    .local p6, "manager":Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;
    invoke-direct/range {p2 .. p8}, Landroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$onPositionedModifier$1$1;-><init>(Landroidx/compose/foundation/text/LegacyTextFieldState;ZLandroidx/compose/ui/platform/WindowInfo;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/OffsetMapping;)V

    move-object/from16 v41, p2

    move-object/from16 v12, p3

    move/from16 v36, p4

    move-object/from16 v40, p5

    move-object/from16 v9, p6

    move-object/from16 v7, p8

    .end local p3    # "state":Landroidx/compose/foundation/text/LegacyTextFieldState;
    .end local p4    # "enabled":Z
    .end local p5    # "windowInfo":Landroidx/compose/ui/platform/WindowInfo;
    .end local p6    # "manager":Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;
    .end local p8    # "offsetMapping":Landroidx/compose/ui/text/input/OffsetMapping;
    .local v7, "offsetMapping":Landroidx/compose/ui/text/input/OffsetMapping;
    .local v9, "manager":Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;
    .local v12, "state":Landroidx/compose/foundation/text/LegacyTextFieldState;
    .restart local v36    # "enabled":Z
    .restart local v40    # "windowInfo":Landroidx/compose/ui/platform/WindowInfo;
    move-object/from16 v4, v41

    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 1240
    .end local v4    # "$i$a$-cache-CoreTextFieldKt$CoreTextField$onPositionedModifier$1":I
    nop

    .line 1241
    .local v4, "value$iv":Ljava/lang/Object;
    invoke-interface {v5, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1242
    move-object v3, v4

    .line 1238
    .end local v3    # "it$iv":Ljava/lang/Object;
    .end local v4    # "value$iv":Ljava/lang/Object;
    .end local v28    # "$i$a$-let-ComposerKt$cache$1$iv":I
    :goto_5e
    nop

    .line 418
    .end local v5    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v27    # "$i$f$cache":I
    .end local p9    # "invalid$iv":Z
    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-static {v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    invoke-static {v2, v3}, Landroidx/compose/ui/layout/OnGloballyPositionedModifierKt;->onGloballyPositioned(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    .line 417
    nop

    .line 453
    .local v2, "onPositionedModifier":Landroidx/compose/ui/Modifier;
    instance-of v3, v8, Landroidx/compose/ui/text/input/PasswordVisualTransformation;

    .line 455
    .local v3, "isPassword":Z
    new-instance v4, Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifier;

    .line 456
    nop

    .line 457
    nop

    .line 458
    nop

    .line 459
    nop

    .line 460
    nop

    .line 461
    nop

    .line 462
    nop

    .line 463
    nop

    .line 464
    nop

    .line 465
    nop

    .line 455
    move-object/from16 p4, p0

    move/from16 p8, v3

    move-object/from16 p2, v4

    move-object/from16 p9, v7

    move-object/from16 p10, v9

    move-object/from16 p5, v12

    move/from16 p6, v25

    move/from16 p7, v36

    move-object/from16 p3, v37

    .end local v3    # "isPassword":Z
    .end local v7    # "offsetMapping":Landroidx/compose/ui/text/input/OffsetMapping;
    .end local v9    # "manager":Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;
    .end local v12    # "state":Landroidx/compose/foundation/text/LegacyTextFieldState;
    .end local v25    # "readOnly":Z
    .end local v36    # "enabled":Z
    .end local v37    # "transformedText":Landroidx/compose/ui/text/input/TransformedText;
    .local p3, "transformedText":Landroidx/compose/ui/text/input/TransformedText;
    .local p5, "state":Landroidx/compose/foundation/text/LegacyTextFieldState;
    .local p6, "readOnly":Z
    .local p7, "enabled":Z
    .local p8, "isPassword":Z
    .local p9, "offsetMapping":Landroidx/compose/ui/text/input/OffsetMapping;
    .restart local p10    # "manager":Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;
    invoke-direct/range {p2 .. p12}, Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifier;-><init>(Landroidx/compose/ui/text/input/TransformedText;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/foundation/text/LegacyTextFieldState;ZZZLandroidx/compose/ui/text/input/OffsetMapping;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroidx/compose/ui/text/input/ImeOptions;Landroidx/compose/ui/focus/FocusRequester;)V

    .line 454
    move-object/from16 v5, p2

    move/from16 v16, p6

    move/from16 v4, p7

    move/from16 v27, p8

    move-object/from16 v3, p11

    move-object/from16 v25, p12

    const/16 v28, 0x1

    .end local p3    # "transformedText":Landroidx/compose/ui/text/input/TransformedText;
    .end local p5    # "state":Landroidx/compose/foundation/text/LegacyTextFieldState;
    .end local p6    # "readOnly":Z
    .end local p7    # "enabled":Z
    .end local p8    # "isPassword":Z
    .end local p9    # "offsetMapping":Landroidx/compose/ui/text/input/OffsetMapping;
    .end local p10    # "manager":Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;
    .end local p11    # "imeOptions":Landroidx/compose/ui/text/input/ImeOptions;
    .end local p12    # "focusRequester":Landroidx/compose/ui/focus/FocusRequester;
    .local v3, "imeOptions":Landroidx/compose/ui/text/input/ImeOptions;
    .local v4, "enabled":Z
    .restart local v7    # "offsetMapping":Landroidx/compose/ui/text/input/OffsetMapping;
    .restart local v9    # "manager":Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;
    .restart local v12    # "state":Landroidx/compose/foundation/text/LegacyTextFieldState;
    .local v16, "readOnly":Z
    .local v25, "focusRequester":Landroidx/compose/ui/focus/FocusRequester;
    .local v27, "isPassword":Z
    .restart local v37    # "transformedText":Landroidx/compose/ui/text/input/TransformedText;
    move-object/from16 v36, v5

    .line 468
    .local v36, "semanticsModifier":Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifier;
    if-eqz v4, :cond_7a

    if-nez v16, :cond_7a

    invoke-interface/range {v40 .. v40}, Landroidx/compose/ui/platform/WindowInfo;->isWindowFocused()Z

    move-result v5

    if-eqz v5, :cond_7a

    invoke-virtual {v12}, Landroidx/compose/foundation/text/LegacyTextFieldState;->hasHighlight()Z

    move-result v5

    if-nez v5, :cond_7a

    move/from16 v5, v28

    goto :goto_5f

    :cond_7a
    const/4 v5, 0x0

    .line 469
    .local v5, "showCursor":Z
    :goto_5f
    sget-object v41, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v41, Landroidx/compose/ui/Modifier;

    move-object/from16 p4, p0

    move-object/from16 p6, p14

    move/from16 p7, v5

    move-object/from16 p5, v7

    move-object/from16 p3, v12

    move-object/from16 p2, v41

    .end local v5    # "showCursor":Z
    .end local v7    # "offsetMapping":Landroidx/compose/ui/text/input/OffsetMapping;
    .end local v12    # "state":Landroidx/compose/foundation/text/LegacyTextFieldState;
    .end local p14    # "cursorBrush":Landroidx/compose/ui/graphics/Brush;
    .local p3, "state":Landroidx/compose/foundation/text/LegacyTextFieldState;
    .local p5, "offsetMapping":Landroidx/compose/ui/text/input/OffsetMapping;
    .local p6, "cursorBrush":Landroidx/compose/ui/graphics/Brush;
    .local p7, "showCursor":Z
    invoke-static/range {p2 .. p7}, Landroidx/compose/foundation/text/TextFieldCursorKt;->cursor(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/text/LegacyTextFieldState;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/OffsetMapping;Landroidx/compose/ui/graphics/Brush;Z)Landroidx/compose/ui/Modifier;

    move-result-object v5

    .line 471
    move-object/from16 v7, p4

    move-object/from16 v12, p5

    move-object/from16 v41, p6

    move/from16 v49, p7

    move-object/from16 p12, v2

    move-object/from16 v2, p3

    .end local p3    # "state":Landroidx/compose/foundation/text/LegacyTextFieldState;
    .end local p5    # "offsetMapping":Landroidx/compose/ui/text/input/OffsetMapping;
    .end local p6    # "cursorBrush":Landroidx/compose/ui/graphics/Brush;
    .end local p7    # "showCursor":Z
    .local v2, "state":Landroidx/compose/foundation/text/LegacyTextFieldState;
    .local v5, "cursorModifier":Landroidx/compose/ui/Modifier;
    .local v12, "offsetMapping":Landroidx/compose/ui/text/input/OffsetMapping;
    .local v41, "cursorBrush":Landroidx/compose/ui/graphics/Brush;
    .local v49, "showCursor":Z
    .local p12, "onPositionedModifier":Landroidx/compose/ui/Modifier;
    move-object/from16 p14, v5

    .end local v5    # "cursorModifier":Landroidx/compose/ui/Modifier;
    .local p14, "cursorModifier":Landroidx/compose/ui/Modifier;
    const v5, -0x65a0be09

    invoke-static {v6, v5, v15}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v6, v9}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v5

    .local v5, "invalid$iv":Z
    move-object/from16 p2, v6

    .local p2, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/16 v50, 0x0

    .line 1244
    .local v50, "$i$f$cache":I
    move/from16 p3, v5

    .end local v5    # "invalid$iv":Z
    .local p3, "invalid$iv":Z
    invoke-interface/range {p2 .. p2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v5

    .local v5, "it$iv":Ljava/lang/Object;
    const/16 v53, 0x0

    .line 1245
    .local v53, "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez p3, :cond_7c

    sget-object v54, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move-object/from16 v55, v8

    .end local v8    # "visualTransformation":Landroidx/compose/ui/text/input/VisualTransformation;
    .local v55, "visualTransformation":Landroidx/compose/ui/text/input/VisualTransformation;
    invoke-virtual/range {v54 .. v54}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v8

    if-ne v5, v8, :cond_7b

    goto :goto_60

    .line 1249
    :cond_7b
    move-object/from16 v8, p2

    goto :goto_61

    .line 1245
    .end local v55    # "visualTransformation":Landroidx/compose/ui/text/input/VisualTransformation;
    .restart local v8    # "visualTransformation":Landroidx/compose/ui/text/input/VisualTransformation;
    :cond_7c
    move-object/from16 v55, v8

    .line 1246
    .end local v8    # "visualTransformation":Landroidx/compose/ui/text/input/VisualTransformation;
    .restart local v55    # "visualTransformation":Landroidx/compose/ui/text/input/VisualTransformation;
    :goto_60
    const/4 v8, 0x0

    .line 471
    .local v8, "$i$a$-cache-CoreTextFieldKt$CoreTextField$3":I
    move-object/from16 p4, v5

    .end local v5    # "it$iv":Ljava/lang/Object;
    .local p4, "it$iv":Ljava/lang/Object;
    new-instance v5, Landroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$3$1;

    invoke-direct {v5, v9}, Landroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$3$1;-><init>(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;)V

    check-cast v5, Lkotlin/jvm/functions/Function1;

    .line 1246
    .end local v8    # "$i$a$-cache-CoreTextFieldKt$CoreTextField$3":I
    nop

    .line 1247
    .local v5, "value$iv":Ljava/lang/Object;
    move-object/from16 v8, p2

    .end local p2    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .local v8, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    invoke-interface {v8, v5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1248
    nop

    .line 1244
    .end local v5    # "value$iv":Ljava/lang/Object;
    .end local v53    # "$i$a$-let-ComposerKt$cache$1$iv":I
    .end local p4    # "it$iv":Ljava/lang/Object;
    :goto_61
    nop

    .line 471
    .end local v8    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v50    # "$i$f$cache":I
    .end local p3    # "invalid$iv":Z
    check-cast v5, Lkotlin/jvm/functions/Function1;

    invoke-static {v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    const/4 v8, 0x0

    invoke-static {v9, v5, v6, v8}, Landroidx/compose/runtime/EffectsKt;->DisposableEffect(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    .line 473
    const v5, -0x65a0b1e3

    invoke-static {v6, v5, v15}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v6, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v5

    invoke-interface {v6, v11}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v26

    or-int v5, v5, v26

    and-int/lit8 v8, v22, 0xe

    move/from16 p2, v5

    const/4 v5, 0x4

    if-ne v8, v5, :cond_7d

    move/from16 v5, v28

    goto :goto_62

    :cond_7d
    const/4 v5, 0x0

    :goto_62
    or-int v5, p2, v5

    and-int/lit8 v8, v21, 0x70

    xor-int/lit8 v8, v8, 0x30

    move/from16 p2, v5

    const/16 v5, 0x20

    if-le v8, v5, :cond_7e

    invoke-interface {v6, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_7f

    :cond_7e
    and-int/lit8 v5, v21, 0x30

    const/16 v8, 0x20

    if-ne v5, v8, :cond_80

    :cond_7f
    move/from16 v5, v28

    goto :goto_63

    :cond_80
    const/4 v5, 0x0

    :goto_63
    or-int v5, p2, v5

    .local v5, "invalid$iv":Z
    move-object v8, v6

    .restart local v8    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/16 v24, 0x0

    .line 1250
    .local v24, "$i$f$cache":I
    move/from16 p2, v5

    .end local v5    # "invalid$iv":Z
    .local p2, "invalid$iv":Z
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v5

    .local v5, "it$iv":Ljava/lang/Object;
    const/16 v29, 0x0

    .line 1251
    .local v29, "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez p2, :cond_82

    sget-object v50, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move-object/from16 p10, v9

    .end local v9    # "manager":Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;
    .restart local p10    # "manager":Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;
    invoke-virtual/range {v50 .. v50}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v9

    if-ne v5, v9, :cond_81

    goto :goto_64

    .line 1255
    :cond_81
    goto :goto_65

    .line 1251
    .end local p10    # "manager":Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;
    .restart local v9    # "manager":Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;
    :cond_82
    move-object/from16 p10, v9

    .line 1252
    .end local v9    # "manager":Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;
    .restart local p10    # "manager":Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;
    :goto_64
    const/4 v9, 0x0

    .line 473
    .local v9, "$i$a$-cache-CoreTextFieldKt$CoreTextField$4":I
    move-object/from16 p3, v5

    .end local v5    # "it$iv":Ljava/lang/Object;
    .local p3, "it$iv":Ljava/lang/Object;
    new-instance v5, Landroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$4$1;

    invoke-direct {v5, v2, v11, v7, v3}, Landroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$4$1;-><init>(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroidx/compose/ui/text/input/TextInputService;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/ImeOptions;)V

    check-cast v5, Lkotlin/jvm/functions/Function1;

    .line 1252
    .end local v9    # "$i$a$-cache-CoreTextFieldKt$CoreTextField$4":I
    nop

    .line 1253
    .local v5, "value$iv":Ljava/lang/Object;
    invoke-interface {v8, v5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1254
    nop

    .line 1250
    .end local v5    # "value$iv":Ljava/lang/Object;
    .end local v29    # "$i$a$-let-ComposerKt$cache$1$iv":I
    .end local p3    # "it$iv":Ljava/lang/Object;
    :goto_65
    nop

    .line 473
    .end local v8    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v24    # "$i$f$cache":I
    .end local p2    # "invalid$iv":Z
    check-cast v5, Lkotlin/jvm/functions/Function1;

    invoke-static {v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    shr-int/lit8 v8, v21, 0x3

    and-int/lit8 v8, v8, 0xe

    invoke-static {v3, v5, v6, v8}, Landroidx/compose/runtime/EffectsKt;->DisposableEffect(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    .line 489
    sget-object v5, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v5, Landroidx/compose/ui/Modifier;

    .line 490
    nop

    .line 491
    nop

    .line 492
    nop

    .line 493
    invoke-virtual {v2}, Landroidx/compose/foundation/text/LegacyTextFieldState;->getOnValueChange()Lkotlin/jvm/functions/Function1;

    move-result-object v8

    .line 494
    nop

    .line 495
    xor-int/lit8 v9, v16, 0x1

    move-object/from16 p2, v2

    move-object/from16 v24, v5

    move/from16 v2, v28

    move/from16 v5, v38

    .end local v2    # "state":Landroidx/compose/foundation/text/LegacyTextFieldState;
    .end local v38    # "maxLines":I
    .local v5, "maxLines":I
    .local p2, "state":Landroidx/compose/foundation/text/LegacyTextFieldState;
    if-ne v5, v2, :cond_83

    move/from16 v28, v2

    goto :goto_66

    :cond_83
    const/16 v28, 0x0

    .line 496
    :goto_66
    nop

    .line 497
    nop

    .line 498
    invoke-virtual {v3}, Landroidx/compose/ui/text/input/ImeOptions;->getImeAction-eUduSuo()I

    move-result v29

    .line 489
    move-object/from16 p3, p2

    move-object/from16 p4, p10

    move-object/from16 p5, v7

    move-object/from16 p6, v8

    move/from16 p7, v9

    move-object/from16 p9, v12

    move-object/from16 p2, v24

    move/from16 p8, v28

    move/from16 p11, v29

    move-object/from16 p10, v42

    .end local v12    # "offsetMapping":Landroidx/compose/ui/text/input/OffsetMapping;
    .end local v42    # "undoManager":Landroidx/compose/foundation/text/UndoManager;
    .end local p2    # "state":Landroidx/compose/foundation/text/LegacyTextFieldState;
    .local p3, "state":Landroidx/compose/foundation/text/LegacyTextFieldState;
    .local p4, "manager":Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;
    .restart local p9    # "offsetMapping":Landroidx/compose/ui/text/input/OffsetMapping;
    .local p10, "undoManager":Landroidx/compose/foundation/text/UndoManager;
    invoke-static/range {p2 .. p11}, Landroidx/compose/foundation/text/TextFieldKeyInputKt;->textFieldKeyInput-2WJ9YEU(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/text/LegacyTextFieldState;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;ZZLandroidx/compose/ui/text/input/OffsetMapping;Landroidx/compose/foundation/text/UndoManager;I)Landroidx/compose/ui/Modifier;

    move-result-object v7

    .line 488
    move-object/from16 v9, p4

    move/from16 v28, v2

    move-object/from16 v2, p3

    .line 502
    .end local p3    # "state":Landroidx/compose/foundation/text/LegacyTextFieldState;
    .end local p4    # "manager":Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;
    .end local p9    # "offsetMapping":Landroidx/compose/ui/text/input/OffsetMapping;
    .end local p10    # "undoManager":Landroidx/compose/foundation/text/UndoManager;
    .restart local v2    # "state":Landroidx/compose/foundation/text/LegacyTextFieldState;
    .local v7, "textKeyInputModifier":Landroidx/compose/ui/Modifier;
    .local v9, "manager":Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;
    .restart local v12    # "offsetMapping":Landroidx/compose/ui/text/input/OffsetMapping;
    .restart local v42    # "undoManager":Landroidx/compose/foundation/text/UndoManager;
    invoke-virtual {v3}, Landroidx/compose/ui/text/input/ImeOptions;->getKeyboardType-PjHm6EE()I

    move-result v8

    sget-object v24, Landroidx/compose/ui/text/input/KeyboardType;->Companion:Landroidx/compose/ui/text/input/KeyboardType$Companion;

    move-object/from16 p8, v3

    .end local v3    # "imeOptions":Landroidx/compose/ui/text/input/ImeOptions;
    .local p8, "imeOptions":Landroidx/compose/ui/text/input/ImeOptions;
    invoke-virtual/range {v24 .. v24}, Landroidx/compose/ui/text/input/KeyboardType$Companion;->getPassword-PjHm6EE()I

    move-result v3

    invoke-static {v8, v3}, Landroidx/compose/ui/text/input/KeyboardType;->equals-impl0(II)Z

    move-result v3

    if-nez v3, :cond_84

    .line 503
    invoke-virtual/range {p8 .. p8}, Landroidx/compose/ui/text/input/ImeOptions;->getKeyboardType-PjHm6EE()I

    move-result v3

    sget-object v8, Landroidx/compose/ui/text/input/KeyboardType;->Companion:Landroidx/compose/ui/text/input/KeyboardType$Companion;

    invoke-virtual {v8}, Landroidx/compose/ui/text/input/KeyboardType$Companion;->getNumberPassword-PjHm6EE()I

    move-result v8

    invoke-static {v3, v8}, Landroidx/compose/ui/text/input/KeyboardType;->equals-impl0(II)Z

    move-result v3

    if-nez v3, :cond_84

    move/from16 v3, v28

    goto :goto_67

    :cond_84
    const/4 v3, 0x0

    .line 501
    :goto_67
    nop

    .line 505
    .local v3, "handwritingEnabled":Z
    sget-object v8, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v8, Landroidx/compose/ui/Modifier;

    move/from16 v38, v5

    .end local v5    # "maxLines":I
    .restart local v38    # "maxLines":I
    invoke-static/range {v43 .. v43}, Landroidx/compose/foundation/text/CoreTextFieldKt;->CoreTextField$lambda$11(Landroidx/compose/runtime/State;)Z

    move-result v5

    move-object/from16 p2, v10

    .end local v10    # "drawModifier":Landroidx/compose/ui/Modifier;
    .local p2, "drawModifier":Landroidx/compose/ui/Modifier;
    const v10, -0x65a01cfe

    invoke-static {v6, v10, v15}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v6, v3}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v10

    move/from16 p3, v10

    move-object/from16 v10, v39

    .end local v39    # "legacyTextInputServiceAdapter":Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter;
    .local v10, "legacyTextInputServiceAdapter":Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter;
    invoke-interface {v6, v10}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v24

    or-int v24, p3, v24

    .local v24, "invalid$iv":Z
    move-object/from16 p3, v6

    .local p3, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/16 v29, 0x0

    .line 1256
    .local v29, "$i$f$cache":I
    move-object/from16 p6, v11

    .end local v11    # "textInputService":Landroidx/compose/ui/text/input/TextInputService;
    .local p6, "textInputService":Landroidx/compose/ui/text/input/TextInputService;
    invoke-interface/range {p3 .. p3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v11

    .local v11, "it$iv":Ljava/lang/Object;
    const/16 v39, 0x0

    .line 1257
    .local v39, "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez v24, :cond_86

    sget-object v50, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move-object/from16 p9, v12

    .end local v12    # "offsetMapping":Landroidx/compose/ui/text/input/OffsetMapping;
    .restart local p9    # "offsetMapping":Landroidx/compose/ui/text/input/OffsetMapping;
    invoke-virtual/range {v50 .. v50}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v12

    if-ne v11, v12, :cond_85

    goto :goto_68

    .line 1261
    :cond_85
    move-object/from16 v12, p3

    goto :goto_69

    .line 1257
    .end local p9    # "offsetMapping":Landroidx/compose/ui/text/input/OffsetMapping;
    .restart local v12    # "offsetMapping":Landroidx/compose/ui/text/input/OffsetMapping;
    :cond_86
    move-object/from16 p9, v12

    .line 1258
    .end local v12    # "offsetMapping":Landroidx/compose/ui/text/input/OffsetMapping;
    .restart local p9    # "offsetMapping":Landroidx/compose/ui/text/input/OffsetMapping;
    :goto_68
    const/4 v12, 0x0

    .line 505
    .local v12, "$i$a$-cache-CoreTextFieldKt$CoreTextField$stylusHandwritingModifier$1":I
    move-object/from16 p4, v11

    .end local v11    # "it$iv":Ljava/lang/Object;
    .local p4, "it$iv":Ljava/lang/Object;
    new-instance v11, Landroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$stylusHandwritingModifier$1$1;

    invoke-direct {v11, v3, v10}, Landroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$stylusHandwritingModifier$1$1;-><init>(ZLandroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter;)V

    check-cast v11, Lkotlin/jvm/functions/Function0;

    .line 1258
    .end local v12    # "$i$a$-cache-CoreTextFieldKt$CoreTextField$stylusHandwritingModifier$1":I
    nop

    .line 1259
    .local v11, "value$iv":Ljava/lang/Object;
    move-object/from16 v12, p3

    .end local p3    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .local v12, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    invoke-interface {v12, v11}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1260
    nop

    .line 1256
    .end local v11    # "value$iv":Ljava/lang/Object;
    .end local v39    # "$i$a$-let-ComposerKt$cache$1$iv":I
    .end local p4    # "it$iv":Ljava/lang/Object;
    :goto_69
    nop

    .line 505
    .end local v12    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v24    # "invalid$iv":Z
    .end local v29    # "$i$f$cache":I
    check-cast v11, Lkotlin/jvm/functions/Function0;

    invoke-static {v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    invoke-static {v8, v5, v3, v11}, Landroidx/compose/foundation/text/handwriting/StylusHandwritingKt;->stylusHandwriting(Landroidx/compose/ui/Modifier;ZZLkotlin/jvm/functions/Function0;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    .line 504
    nop

    .line 522
    .local v5, "stylusHandwritingModifier":Landroidx/compose/ui/Modifier;
    invoke-static {}, Landroidx/compose/foundation/text/AutofillHighlightKt;->getLocalAutofillHighlightColor()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v8

    check-cast v8, Landroidx/compose/runtime/CompositionLocal;

    .local v8, "this_$iv":Landroidx/compose/runtime/CompositionLocal;
    const/4 v11, 0x6

    .local v11, "$changed$iv":I
    const/4 v12, 0x0

    .line 1262
    .local v12, "$i$f$getCurrent":I
    move/from16 p3, v3

    const v3, 0x789c5f52

    .end local v3    # "handwritingEnabled":Z
    .local p3, "handwritingEnabled":Z
    invoke-static {v6, v3, v13}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v6, v8}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 522
    .end local v8    # "this_$iv":Landroidx/compose/runtime/CompositionLocal;
    .end local v11    # "$changed$iv":I
    .end local v12    # "$i$f$getCurrent":I
    check-cast v3, Landroidx/compose/ui/graphics/Color;

    invoke-virtual {v3}, Landroidx/compose/ui/graphics/Color;->unbox-impl()J

    move-result-wide v11

    .line 524
    .local v11, "autofillHighlightColor":J
    sget-object v3, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v3, Landroidx/compose/ui/Modifier;

    const v8, -0x659f9462

    invoke-static {v6, v8, v15}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v6, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v8

    invoke-interface {v6, v11, v12}, Landroidx/compose/runtime/Composer;->changed(J)Z

    move-result v13

    or-int/2addr v8, v13

    .local v8, "invalid$iv":Z
    move-object v13, v6

    .local v13, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/4 v15, 0x0

    .line 1263
    .local v15, "$i$f$cache":I
    move-object/from16 p4, v6

    .end local v6    # "$composer":Landroidx/compose/runtime/Composer;
    .local p4, "$composer":Landroidx/compose/runtime/Composer;
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v6

    .local v6, "it$iv":Ljava/lang/Object;
    const/16 v24, 0x0

    .line 1264
    .local v24, "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez v8, :cond_88

    sget-object v29, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move/from16 p5, v8

    .end local v8    # "invalid$iv":Z
    .local p5, "invalid$iv":Z
    invoke-virtual/range {v29 .. v29}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v8

    if-ne v6, v8, :cond_87

    goto :goto_6a

    .line 1268
    :cond_87
    goto :goto_6b

    .line 1264
    .end local p5    # "invalid$iv":Z
    .restart local v8    # "invalid$iv":Z
    :cond_88
    move/from16 p5, v8

    .line 1265
    .end local v8    # "invalid$iv":Z
    .restart local p5    # "invalid$iv":Z
    :goto_6a
    const/4 v8, 0x0

    .line 524
    .local v8, "$i$a$-cache-CoreTextFieldKt$CoreTextField$drawDecorationModifier$1":I
    move-object/from16 p7, v6

    .end local v6    # "it$iv":Ljava/lang/Object;
    .local p7, "it$iv":Ljava/lang/Object;
    new-instance v6, Landroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$drawDecorationModifier$1$1;

    invoke-direct {v6, v2, v11, v12}, Landroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$drawDecorationModifier$1$1;-><init>(Landroidx/compose/foundation/text/LegacyTextFieldState;J)V

    check-cast v6, Lkotlin/jvm/functions/Function1;

    .line 1265
    .end local v8    # "$i$a$-cache-CoreTextFieldKt$CoreTextField$drawDecorationModifier$1":I
    nop

    .line 1266
    .local v6, "value$iv":Ljava/lang/Object;
    invoke-interface {v13, v6}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1267
    nop

    .line 1263
    .end local v6    # "value$iv":Ljava/lang/Object;
    .end local v24    # "$i$a$-let-ComposerKt$cache$1$iv":I
    .end local p7    # "it$iv":Ljava/lang/Object;
    :goto_6b
    nop

    .line 524
    .end local v13    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v15    # "$i$f$cache":I
    .end local p5    # "invalid$iv":Z
    check-cast v6, Lkotlin/jvm/functions/Function1;

    invoke-static/range {p4 .. p4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    invoke-static {v3, v6}, Landroidx/compose/ui/draw/DrawModifierKt;->drawBehind(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    .line 523
    nop

    .line 533
    .local v3, "drawDecorationModifier":Landroidx/compose/ui/Modifier;
    nop

    .line 534
    move-object/from16 v15, v32

    .end local v32    # "modifier":Landroidx/compose/ui/Modifier;
    .local v15, "modifier":Landroidx/compose/ui/Modifier;
    invoke-interface {v15, v3}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    .line 535
    invoke-static {v6, v10, v2, v9}, Landroidx/compose/foundation/text/input/internal/LegacyAdaptingPlatformTextInputModifierNodeKt;->legacyTextInputAdapter(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter;Landroidx/compose/foundation/text/LegacyTextFieldState;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    .line 536
    invoke-interface {v6, v5}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    .line 537
    invoke-interface {v6, v0}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    .line 538
    move-object/from16 v8, v18

    .end local v18    # "focusManager":Landroidx/compose/ui/focus/FocusManager;
    .local v8, "focusManager":Landroidx/compose/ui/focus/FocusManager;
    invoke-static {v6, v2, v8}, Landroidx/compose/foundation/text/TextFieldFocusModifier_androidKt;->interceptDPadAndMoveFocus(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/text/LegacyTextFieldState;Landroidx/compose/ui/focus/FocusManager;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    .line 539
    invoke-static {v6, v2, v9}, Landroidx/compose/foundation/text/CoreTextFieldKt;->previewKeyEventToDeselectOnBack(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/text/LegacyTextFieldState;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    .line 540
    invoke-interface {v6, v7}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    .line 541
    move-object/from16 v13, v33

    .end local v33    # "scrollerPosition":Landroidx/compose/foundation/text/TextFieldScrollerPosition;
    .local v13, "scrollerPosition":Landroidx/compose/foundation/text/TextFieldScrollerPosition;
    invoke-static {v6, v13, v14, v4}, Landroidx/compose/foundation/text/TextFieldScrollKt;->textFieldScrollable(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/text/TextFieldScrollerPosition;Landroidx/compose/foundation/interaction/MutableInteractionSource;Z)Landroidx/compose/ui/Modifier;

    move-result-object v6

    .line 542
    invoke-interface {v6, v1}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    .line 543
    move-object/from16 p5, v0

    .end local v0    # "focusModifier":Landroidx/compose/ui/Modifier;
    .local p5, "focusModifier":Landroidx/compose/ui/Modifier;
    move-object/from16 v0, v36

    check-cast v0, Landroidx/compose/ui/Modifier;

    invoke-interface {v6, v0}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    .line 544
    new-instance v6, Landroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$decorationBoxModifier$1;

    invoke-direct {v6, v2}, Landroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$decorationBoxModifier$1;-><init>(Landroidx/compose/foundation/text/LegacyTextFieldState;)V

    check-cast v6, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v6}, Landroidx/compose/ui/layout/OnGloballyPositionedModifierKt;->onGloballyPositioned(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    .line 532
    nop

    .line 547
    .local v0, "decorationBoxModifier":Landroidx/compose/ui/Modifier;
    if-eqz v4, :cond_89

    invoke-virtual {v2}, Landroidx/compose/foundation/text/LegacyTextFieldState;->getHasFocus()Z

    move-result v6

    if-eqz v6, :cond_89

    invoke-virtual {v2}, Landroidx/compose/foundation/text/LegacyTextFieldState;->isInTouchMode()Z

    move-result v6

    if-eqz v6, :cond_89

    invoke-interface/range {v40 .. v40}, Landroidx/compose/ui/platform/WindowInfo;->isWindowFocused()Z

    move-result v6

    if-eqz v6, :cond_89

    move/from16 v6, v28

    goto :goto_6c

    :cond_89
    const/4 v6, 0x0

    .line 546
    :goto_6c
    nop

    .line 549
    .local v6, "showHandleAndMagnifier":Z
    if-eqz v6, :cond_8a

    .line 550
    sget-object v18, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    move-object/from16 p7, v0

    .end local v0    # "decorationBoxModifier":Landroidx/compose/ui/Modifier;
    .local p7, "decorationBoxModifier":Landroidx/compose/ui/Modifier;
    move-object/from16 v0, v18

    check-cast v0, Landroidx/compose/ui/Modifier;

    invoke-static {v0, v9}, Landroidx/compose/foundation/text/selection/TextFieldSelectionManager_androidKt;->textFieldMagnifier(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    goto :goto_6d

    .line 552
    .end local p7    # "decorationBoxModifier":Landroidx/compose/ui/Modifier;
    .restart local v0    # "decorationBoxModifier":Landroidx/compose/ui/Modifier;
    :cond_8a
    move-object/from16 p7, v0

    .end local v0    # "decorationBoxModifier":Landroidx/compose/ui/Modifier;
    .restart local p7    # "decorationBoxModifier":Landroidx/compose/ui/Modifier;
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v0, Landroidx/compose/ui/Modifier;

    .line 549
    :goto_6d
    nop

    .line 548
    nop

    .line 555
    .local v0, "magnifierModifier":Landroidx/compose/ui/Modifier;
    move-wide/from16 v32, v11

    move-object v12, v0

    .end local v0    # "magnifierModifier":Landroidx/compose/ui/Modifier;
    .end local v11    # "autofillHighlightColor":J
    .local v12, "magnifierModifier":Landroidx/compose/ui/Modifier;
    .local v32, "autofillHighlightColor":J
    new-instance v0, Landroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$5;

    move/from16 v53, p3

    move-object/from16 v56, p4

    move-object/from16 v24, p6

    move-object/from16 v59, p7

    move-object/from16 v29, p8

    move-object/from16 v18, p9

    move-object/from16 v11, p12

    move-object/from16 v28, p17

    move-object/from16 v50, v1

    move-object/from16 v54, v5

    move-object/from16 v26, v8

    move-object/from16 v39, v10

    move-object/from16 v1, v19

    move-wide/from16 v57, v32

    move/from16 v5, v38

    move-object/from16 v19, v44

    move-object/from16 v8, v55

    move-object/from16 v10, p2

    move-object/from16 v44, p13

    move-object/from16 v55, v3

    move/from16 v32, v4

    move-object/from16 v38, v14

    move-object/from16 v33, v15

    move-object/from16 v3, v47

    move-object/from16 v47, p5

    move/from16 v4, p15

    move v15, v6

    move-object v14, v9

    move-object v6, v13

    move-object/from16 v13, v52

    move-object/from16 v9, p14

    move-object/from16 v52, v7

    move-object/from16 v7, p0

    .end local v7    # "textKeyInputModifier":Landroidx/compose/ui/Modifier;
    .end local p2    # "drawModifier":Landroidx/compose/ui/Modifier;
    .end local p3    # "handwritingEnabled":Z
    .end local p4    # "$composer":Landroidx/compose/runtime/Composer;
    .end local p5    # "focusModifier":Landroidx/compose/ui/Modifier;
    .end local p6    # "textInputService":Landroidx/compose/ui/text/input/TextInputService;
    .end local p7    # "decorationBoxModifier":Landroidx/compose/ui/Modifier;
    .end local p8    # "imeOptions":Landroidx/compose/ui/text/input/ImeOptions;
    .end local p9    # "offsetMapping":Landroidx/compose/ui/text/input/OffsetMapping;
    .end local p12    # "onPositionedModifier":Landroidx/compose/ui/Modifier;
    .end local p13    # "scope":Landroidx/compose/runtime/RecomposeScope;
    .end local p14    # "cursorModifier":Landroidx/compose/ui/Modifier;
    .end local p15    # "minLines":I
    .end local p17    # "keyboardController":Landroidx/compose/ui/platform/SoftwareKeyboardController;
    .local v1, "decorationBox":Lkotlin/jvm/functions/Function3;
    .local v3, "textStyle":Landroidx/compose/ui/text/TextStyle;
    .local v4, "minLines":I
    .local v5, "maxLines":I
    .local v6, "scrollerPosition":Landroidx/compose/foundation/text/TextFieldScrollerPosition;
    .local v8, "visualTransformation":Landroidx/compose/ui/text/input/VisualTransformation;
    .local v9, "cursorModifier":Landroidx/compose/ui/Modifier;
    .local v10, "drawModifier":Landroidx/compose/ui/Modifier;
    .local v11, "onPositionedModifier":Landroidx/compose/ui/Modifier;
    .local v13, "bringIntoViewRequester":Landroidx/compose/foundation/relocation/BringIntoViewRequester;
    .local v14, "manager":Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;
    .local v15, "showHandleAndMagnifier":Z
    .local v18, "offsetMapping":Landroidx/compose/ui/text/input/OffsetMapping;
    .local v19, "density":Landroidx/compose/ui/unit/Density;
    .local v24, "textInputService":Landroidx/compose/ui/text/input/TextInputService;
    .local v26, "focusManager":Landroidx/compose/ui/focus/FocusManager;
    .local v28, "keyboardController":Landroidx/compose/ui/platform/SoftwareKeyboardController;
    .local v29, "imeOptions":Landroidx/compose/ui/text/input/ImeOptions;
    .local v32, "enabled":Z
    .local v33, "modifier":Landroidx/compose/ui/Modifier;
    .local v38, "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .local v39, "legacyTextInputServiceAdapter":Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter;
    .local v44, "scope":Landroidx/compose/runtime/RecomposeScope;
    .local v47, "focusModifier":Landroidx/compose/ui/Modifier;
    .local v50, "pointerModifier":Landroidx/compose/ui/Modifier;
    .local v52, "textKeyInputModifier":Landroidx/compose/ui/Modifier;
    .local v53, "handwritingEnabled":Z
    .local v54, "stylusHandwritingModifier":Landroidx/compose/ui/Modifier;
    .local v55, "drawDecorationModifier":Landroidx/compose/ui/Modifier;
    .local v56, "$composer":Landroidx/compose/runtime/Composer;
    .local v57, "autofillHighlightColor":J
    .local v59, "decorationBoxModifier":Landroidx/compose/ui/Modifier;
    invoke-direct/range {v0 .. v19}, Landroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$5;-><init>(Lkotlin/jvm/functions/Function3;Landroidx/compose/foundation/text/LegacyTextFieldState;Landroidx/compose/ui/text/TextStyle;IILandroidx/compose/foundation/text/TextFieldScrollerPosition;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/relocation/BringIntoViewRequester;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/input/OffsetMapping;Landroidx/compose/ui/unit/Density;)V

    move-object v7, v0

    move-object v9, v14

    move-object v14, v13

    move-object v13, v6

    move-object v6, v12

    move-object/from16 v12, v18

    .end local v18    # "offsetMapping":Landroidx/compose/ui/text/input/OffsetMapping;
    .local v6, "magnifierModifier":Landroidx/compose/ui/Modifier;
    .local v9, "manager":Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;
    .local v12, "offsetMapping":Landroidx/compose/ui/text/input/OffsetMapping;
    .local v13, "scrollerPosition":Landroidx/compose/foundation/text/TextFieldScrollerPosition;
    .local v14, "bringIntoViewRequester":Landroidx/compose/foundation/relocation/BringIntoViewRequester;
    .restart local p14    # "cursorModifier":Landroidx/compose/ui/Modifier;
    const/16 v0, 0x36

    move-object/from16 p2, v1

    .end local v1    # "decorationBox":Lkotlin/jvm/functions/Function3;
    .local p2, "decorationBox":Lkotlin/jvm/functions/Function3;
    const v1, -0x1d5b873c

    move-object/from16 p3, v2

    move-object/from16 p10, v3

    move-object/from16 v2, v56

    const/4 v3, 0x1

    .end local v3    # "textStyle":Landroidx/compose/ui/text/TextStyle;
    .end local v56    # "$composer":Landroidx/compose/runtime/Composer;
    .local v2, "$composer":Landroidx/compose/runtime/Composer;
    .local p3, "state":Landroidx/compose/foundation/text/LegacyTextFieldState;
    .local p10, "textStyle":Landroidx/compose/ui/text/TextStyle;
    invoke-static {v1, v3, v7, v2, v0}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v0

    check-cast v0, Lkotlin/jvm/functions/Function2;

    const/16 v1, 0x180

    move-object/from16 v3, v59

    .end local v59    # "decorationBoxModifier":Landroidx/compose/ui/Modifier;
    .local v3, "decorationBoxModifier":Landroidx/compose/ui/Modifier;
    invoke-static {v3, v9, v0, v2, v1}, Landroidx/compose/foundation/text/CoreTextFieldKt;->CoreTextFieldRootBox(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_8b

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 662
    .end local v3    # "decorationBoxModifier":Landroidx/compose/ui/Modifier;
    .end local v6    # "magnifierModifier":Landroidx/compose/ui/Modifier;
    .end local v9    # "manager":Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;
    .end local v10    # "drawModifier":Landroidx/compose/ui/Modifier;
    .end local v11    # "onPositionedModifier":Landroidx/compose/ui/Modifier;
    .end local v12    # "offsetMapping":Landroidx/compose/ui/text/input/OffsetMapping;
    .end local v13    # "scrollerPosition":Landroidx/compose/foundation/text/TextFieldScrollerPosition;
    .end local v14    # "bringIntoViewRequester":Landroidx/compose/foundation/relocation/BringIntoViewRequester;
    .end local v15    # "showHandleAndMagnifier":Z
    .end local v19    # "density":Landroidx/compose/ui/unit/Density;
    .end local v23    # "singleLine":Z
    .end local v24    # "textInputService":Landroidx/compose/ui/text/input/TextInputService;
    .end local v25    # "focusRequester":Landroidx/compose/ui/focus/FocusRequester;
    .end local v26    # "focusManager":Landroidx/compose/ui/focus/FocusManager;
    .end local v27    # "isPassword":Z
    .end local v28    # "keyboardController":Landroidx/compose/ui/platform/SoftwareKeyboardController;
    .end local v30    # "selectionBackgroundColor":J
    .end local v34    # "orientation":Landroidx/compose/foundation/gestures/Orientation;
    .end local v36    # "semanticsModifier":Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifier;
    .end local v37    # "transformedText":Landroidx/compose/ui/text/input/TransformedText;
    .end local v39    # "legacyTextInputServiceAdapter":Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter;
    .end local v40    # "windowInfo":Landroidx/compose/ui/platform/WindowInfo;
    .end local v42    # "undoManager":Landroidx/compose/foundation/text/UndoManager;
    .end local v43    # "writeable$delegate":Landroidx/compose/runtime/State;
    .end local v44    # "scope":Landroidx/compose/runtime/RecomposeScope;
    .end local v45    # "fontFamilyResolver":Landroidx/compose/ui/text/font/FontFamily$Resolver;
    .end local v47    # "focusModifier":Landroidx/compose/ui/Modifier;
    .end local v48    # "visualText":Landroidx/compose/ui/text/AnnotatedString;
    .end local v49    # "showCursor":Z
    .end local v50    # "pointerModifier":Landroidx/compose/ui/Modifier;
    .end local v51    # "coroutineScope":Lkotlinx/coroutines/CoroutineScope;
    .end local v52    # "textKeyInputModifier":Landroidx/compose/ui/Modifier;
    .end local v53    # "handwritingEnabled":Z
    .end local v54    # "stylusHandwritingModifier":Landroidx/compose/ui/Modifier;
    .end local v55    # "drawDecorationModifier":Landroidx/compose/ui/Modifier;
    .end local v57    # "autofillHighlightColor":J
    .end local p3    # "state":Landroidx/compose/foundation/text/LegacyTextFieldState;
    .end local p14    # "cursorModifier":Landroidx/compose/ui/Modifier;
    :cond_8b
    move v11, v4

    move v10, v5

    move-object v5, v8

    move/from16 v15, v16

    move-object/from16 v6, v17

    move-object/from16 v17, v20

    move-object/from16 v12, v29

    move/from16 v14, v32

    move-object/from16 v3, v33

    move-object/from16 v13, v35

    move-object/from16 v7, v38

    move-object/from16 v8, v41

    move/from16 v9, v46

    move-object/from16 v16, p2

    move-object/from16 v4, p10

    goto :goto_6e

    .end local v2    # "$composer":Landroidx/compose/runtime/Composer;
    .end local v8    # "visualTransformation":Landroidx/compose/ui/text/input/VisualTransformation;
    .end local v16    # "readOnly":Z
    .end local v17    # "onTextLayout":Lkotlin/jvm/functions/Function1;
    .end local v20    # "textScrollerPosition":Landroidx/compose/foundation/text/TextFieldScrollerPosition;
    .end local v21    # "$dirty1":I
    .end local v22    # "$dirty":I
    .end local v29    # "imeOptions":Landroidx/compose/ui/text/input/ImeOptions;
    .end local v32    # "enabled":Z
    .end local v33    # "modifier":Landroidx/compose/ui/Modifier;
    .end local v35    # "keyboardActions":Landroidx/compose/foundation/text/KeyboardActions;
    .end local v38    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .end local v41    # "cursorBrush":Landroidx/compose/ui/graphics/Brush;
    .end local v46    # "softWrap":Z
    .local v4, "$composer":Landroidx/compose/runtime/Composer;
    .local v5, "$dirty":I
    .local p2, "modifier":Landroidx/compose/ui/Modifier;
    .local p3, "textStyle":Landroidx/compose/ui/text/TextStyle;
    .local p4, "visualTransformation":Landroidx/compose/ui/text/input/VisualTransformation;
    .local p5, "onTextLayout":Lkotlin/jvm/functions/Function1;
    .local p6, "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .local p7, "cursorBrush":Landroidx/compose/ui/graphics/Brush;
    .local p8, "softWrap":Z
    .local p9, "maxLines":I
    .local p10, "minLines":I
    .restart local p11    # "imeOptions":Landroidx/compose/ui/text/input/ImeOptions;
    .local p12, "keyboardActions":Landroidx/compose/foundation/text/KeyboardActions;
    .local p13, "enabled":Z
    .local p14, "readOnly":Z
    .local p15, "decorationBox":Lkotlin/jvm/functions/Function3;
    .restart local p16    # "textScrollerPosition":Landroidx/compose/foundation/text/TextFieldScrollerPosition;
    .local p17, "$dirty1":I
    :cond_8c
    move-object v2, v4

    move/from16 v22, v5

    .end local v4    # "$composer":Landroidx/compose/runtime/Composer;
    .end local v5    # "$dirty":I
    .restart local v2    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v22    # "$dirty":I
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object/from16 v12, p11

    move/from16 v14, p13

    move-object/from16 v16, p15

    move-object/from16 v17, p16

    move/from16 v21, p17

    move-object v5, v8

    move-object v8, v9

    move-object v7, v10

    move-object v6, v11

    move-object v4, v13

    move-object v3, v15

    move/from16 v9, p8

    move/from16 v10, p9

    move/from16 v11, p10

    move-object/from16 v13, p12

    move/from16 v15, p14

    .end local p2    # "modifier":Landroidx/compose/ui/Modifier;
    .end local p3    # "textStyle":Landroidx/compose/ui/text/TextStyle;
    .end local p4    # "visualTransformation":Landroidx/compose/ui/text/input/VisualTransformation;
    .end local p5    # "onTextLayout":Lkotlin/jvm/functions/Function1;
    .end local p6    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .end local p7    # "cursorBrush":Landroidx/compose/ui/graphics/Brush;
    .end local p8    # "softWrap":Z
    .end local p9    # "maxLines":I
    .end local p10    # "minLines":I
    .end local p11    # "imeOptions":Landroidx/compose/ui/text/input/ImeOptions;
    .end local p12    # "keyboardActions":Landroidx/compose/foundation/text/KeyboardActions;
    .end local p13    # "enabled":Z
    .end local p14    # "readOnly":Z
    .end local p15    # "decorationBox":Lkotlin/jvm/functions/Function3;
    .end local p16    # "textScrollerPosition":Landroidx/compose/foundation/text/TextFieldScrollerPosition;
    .end local p17    # "$dirty1":I
    .local v3, "modifier":Landroidx/compose/ui/Modifier;
    .local v4, "textStyle":Landroidx/compose/ui/text/TextStyle;
    .local v5, "visualTransformation":Landroidx/compose/ui/text/input/VisualTransformation;
    .local v6, "onTextLayout":Lkotlin/jvm/functions/Function1;
    .local v7, "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .local v8, "cursorBrush":Landroidx/compose/ui/graphics/Brush;
    .local v9, "softWrap":Z
    .local v10, "maxLines":I
    .local v11, "minLines":I
    .local v12, "imeOptions":Landroidx/compose/ui/text/input/ImeOptions;
    .local v13, "keyboardActions":Landroidx/compose/foundation/text/KeyboardActions;
    .local v14, "enabled":Z
    .local v15, "readOnly":Z
    .local v16, "decorationBox":Lkotlin/jvm/functions/Function3;
    .local v17, "textScrollerPosition":Landroidx/compose/foundation/text/TextFieldScrollerPosition;
    .restart local v21    # "$dirty1":I
    :goto_6e
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v0

    if-eqz v0, :cond_8d

    move-object v1, v0

    new-instance v0, Landroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$6;

    move/from16 v18, p18

    move/from16 v19, p19

    move/from16 v20, p20

    move-object/from16 v60, v1

    move-object/from16 v36, v2

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    .end local v2    # "$composer":Landroidx/compose/runtime/Composer;
    .local v36, "$composer":Landroidx/compose/runtime/Composer;
    invoke-direct/range {v0 .. v20}, Landroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$6;-><init>(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;ZIILandroidx/compose/ui/text/input/ImeOptions;Landroidx/compose/foundation/text/KeyboardActions;ZZLkotlin/jvm/functions/Function3;Landroidx/compose/foundation/text/TextFieldScrollerPosition;III)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    move-object/from16 v1, v60

    invoke-interface {v1, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    goto :goto_6f

    .end local v36    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v2    # "$composer":Landroidx/compose/runtime/Composer;
    :cond_8d
    move-object/from16 v36, v2

    .end local v2    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v36    # "$composer":Landroidx/compose/runtime/Composer;
    :goto_6f
    return-void
.end method

.method private static final CoreTextField$lambda$11(Landroidx/compose/runtime/State;)Z
    .locals 4
    .param p0, "$writeable$delegate"    # Landroidx/compose/runtime/State;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/State<",
            "Ljava/lang/Boolean;",
            ">;)Z"
        }
    .end annotation

    .line 343
    const/4 v0, 0x0

    .local v0, "thisObj$iv":Ljava/lang/Object;
    const/4 v1, 0x0

    .local v1, "property$iv":Lkotlin/reflect/KProperty;
    move-object v2, p0

    .local v2, "$this$getValue$iv":Landroidx/compose/runtime/State;
    const/4 v3, 0x0

    .line 1345
    .local v3, "$i$f$getValue":I
    invoke-interface {v2}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    .end local v0    # "thisObj$iv":Ljava/lang/Object;
    .end local v1    # "property$iv":Lkotlin/reflect/KProperty;
    .end local v2    # "$this$getValue$iv":Landroidx/compose/runtime/State;
    .end local v3    # "$i$f$getValue":I
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 343
    return v0
.end method

.method private static final CoreTextFieldRootBox(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
    .locals 29
    .param p0, "modifier"    # Landroidx/compose/ui/Modifier;
    .param p1, "manager"    # Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;
    .param p2, "content"    # Lkotlin/jvm/functions/Function2;
    .param p3, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p4, "$changed"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    .line 669
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move/from16 v3, p4

    const v4, -0x1399887

    move-object/from16 v5, p3

    invoke-interface {v5, v4}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v5

    .end local p3    # "$composer":Landroidx/compose/runtime/Composer;
    .local v5, "$composer":Landroidx/compose/runtime/Composer;
    const-string v6, "C(CoreTextFieldRootBox)P(2,1)669@31669L83:CoreTextField.kt#423gt5"

    invoke-static {v5, v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    move/from16 v6, p4

    .local v6, "$dirty":I
    and-int/lit8 v7, v3, 0x6

    if-nez v7, :cond_1

    invoke-interface {v5, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_0

    const/4 v7, 0x4

    goto :goto_0

    :cond_0
    const/4 v7, 0x2

    :goto_0
    or-int/2addr v6, v7

    :cond_1
    and-int/lit8 v7, v3, 0x30

    if-nez v7, :cond_3

    invoke-interface {v5, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    const/16 v7, 0x20

    goto :goto_1

    :cond_2
    const/16 v7, 0x10

    :goto_1
    or-int/2addr v6, v7

    :cond_3
    and-int/lit16 v7, v3, 0x180

    if-nez v7, :cond_5

    invoke-interface {v5, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x100

    goto :goto_2

    :cond_4
    const/16 v7, 0x80

    :goto_2
    or-int/2addr v6, v7

    :cond_5
    and-int/lit16 v7, v6, 0x93

    const/16 v8, 0x92

    if-eq v7, v8, :cond_6

    const/4 v7, 0x1

    goto :goto_3

    :cond_6
    const/4 v7, 0x0

    :goto_3
    and-int/lit8 v8, v6, 0x1

    invoke-interface {v5, v7, v8}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v7

    if-eqz v7, :cond_c

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v7

    if-eqz v7, :cond_7

    const/4 v7, -0x1

    const-string v8, "androidx.compose.foundation.text.CoreTextFieldRootBox (CoreTextField.kt:668)"

    invoke-static {v4, v6, v7, v8}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 670
    :cond_7
    const/4 v4, 0x1

    .local v4, "propagateMinConstraints$iv":Z
    and-int/lit8 v7, v6, 0xe

    or-int/lit16 v7, v7, 0x180

    .local v7, "$changed$iv":I
    const/4 v8, 0x0

    .line 1269
    .local v8, "$i$f$Box":I
    const v10, 0x2bb5b5d7

    const-string v11, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo"

    invoke-static {v5, v10, v11}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 1270
    sget-object v10, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    invoke-virtual {v10}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    move-result-object v10

    .line 1274
    .local v10, "contentAlignment$iv":Landroidx/compose/ui/Alignment;
    invoke-static {v10, v4}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    move-result-object v11

    .line 1278
    .local v11, "measurePolicy$iv":Landroidx/compose/ui/layout/MeasurePolicy;
    shl-int/lit8 v12, v7, 0x3

    and-int/lit8 v12, v12, 0x70

    .line 1275
    nop

    .local v12, "$changed$iv$iv":I
    move-object/from16 v13, p0

    .local v13, "modifier$iv$iv":Landroidx/compose/ui/Modifier;
    const/4 v14, 0x0

    .line 1279
    .local v14, "$i$f$Layout":I
    const v15, -0x4ee9b9da

    const-string v9, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh"

    invoke-static {v5, v15, v9}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 1280
    const/4 v9, 0x0

    invoke-static {v5, v9}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    move-result v9

    .line 1281
    .local v9, "compositeKeyHash$iv$iv":I
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    move-result-object v15

    .line 1282
    .local v15, "localMap$iv$iv":Landroidx/compose/runtime/CompositionLocalMap;
    move/from16 p3, v4

    .end local v4    # "propagateMinConstraints$iv":Z
    .local p3, "propagateMinConstraints$iv":Z
    invoke-static {v5, v13}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    .line 1284
    .local v4, "materialized$iv$iv":Landroidx/compose/ui/Modifier;
    sget-object v16, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    move-result-object v16

    move/from16 v17, v6

    .end local v6    # "$dirty":I
    .local v17, "$dirty":I
    shl-int/lit8 v6, v12, 0x6

    and-int/lit16 v6, v6, 0x380

    or-int/lit8 v6, v6, 0x6

    .line 1283
    move-object/from16 v18, v16

    .local v6, "$changed$iv$iv$iv":I
    .local v18, "factory$iv$iv$iv":Lkotlin/jvm/functions/Function0;
    const/16 v16, 0x0

    .line 1285
    .local v16, "$i$f$ReusableComposeNode":I
    move/from16 v19, v6

    .end local v6    # "$changed$iv$iv$iv":I
    .local v19, "$changed$iv$iv$iv":I
    const v6, -0x2942ffcf

    move/from16 v20, v7

    .end local v7    # "$changed$iv":I
    .local v20, "$changed$iv":I
    const-string v7, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp"

    invoke-static {v5, v6, v7}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 1286
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    move-result-object v6

    instance-of v6, v6, Landroidx/compose/runtime/Applier;

    if-nez v6, :cond_8

    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 1287
    :cond_8
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 1288
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v6

    if-eqz v6, :cond_9

    .line 1289
    move-object/from16 v6, v18

    .end local v18    # "factory$iv$iv$iv":Lkotlin/jvm/functions/Function0;
    .local v6, "factory$iv$iv$iv":Lkotlin/jvm/functions/Function0;
    invoke-interface {v5, v6}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    goto :goto_4

    .line 1291
    .end local v6    # "factory$iv$iv$iv":Lkotlin/jvm/functions/Function0;
    .restart local v18    # "factory$iv$iv$iv":Lkotlin/jvm/functions/Function0;
    :cond_9
    move-object/from16 v6, v18

    .end local v18    # "factory$iv$iv$iv":Lkotlin/jvm/functions/Function0;
    .restart local v6    # "factory$iv$iv$iv":Lkotlin/jvm/functions/Function0;
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 1293
    :goto_4
    invoke-static {v5}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    move-result-object v7

    .local v7, "$this$Layout_u24lambda_u240$iv$iv":Landroidx/compose/runtime/Composer;
    const/16 v18, 0x0

    .line 1294
    .local v18, "$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv":I
    sget-object v21, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    move-object/from16 v22, v5

    .end local v5    # "$composer":Landroidx/compose/runtime/Composer;
    .local v22, "$composer":Landroidx/compose/runtime/Composer;
    invoke-virtual/range {v21 .. v21}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    move-result-object v5

    invoke-static {v7, v11, v5}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1295
    sget-object v5, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v5}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lkotlin/jvm/functions/Function2;

    move-result-object v5

    invoke-static {v7, v15, v5}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1296
    sget-object v5, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v5}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lkotlin/jvm/functions/Function2;

    move-result-object v5

    .local v5, "block$iv$iv$iv":Lkotlin/jvm/functions/Function2;
    const/16 v21, 0x0

    .line 1297
    .local v21, "$i$f$set-impl":I
    move-object/from16 v23, v7

    .local v23, "$this$set_impl_u24lambda_u240$iv$iv$iv":Landroidx/compose/runtime/Composer;
    const/16 v24, 0x0

    .line 1298
    .local v24, "$i$a$-with-Updater$set$1$iv$iv$iv":I
    invoke-interface/range {v23 .. v23}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v25

    if-nez v25, :cond_b

    move-object/from16 v25, v6

    .end local v6    # "factory$iv$iv$iv":Lkotlin/jvm/functions/Function0;
    .local v25, "factory$iv$iv$iv":Lkotlin/jvm/functions/Function0;
    invoke-interface/range {v23 .. v23}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v6

    move/from16 v26, v8

    .end local v8    # "$i$f$Box":I
    .local v26, "$i$f$Box":I
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v6, v8}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_a

    goto :goto_5

    :cond_a
    move-object/from16 v8, v23

    goto :goto_6

    .end local v25    # "factory$iv$iv$iv":Lkotlin/jvm/functions/Function0;
    .end local v26    # "$i$f$Box":I
    .restart local v6    # "factory$iv$iv$iv":Lkotlin/jvm/functions/Function0;
    .restart local v8    # "$i$f$Box":I
    :cond_b
    move-object/from16 v25, v6

    move/from16 v26, v8

    .line 1299
    .end local v6    # "factory$iv$iv$iv":Lkotlin/jvm/functions/Function0;
    .end local v8    # "$i$f$Box":I
    .restart local v25    # "factory$iv$iv$iv":Lkotlin/jvm/functions/Function0;
    .restart local v26    # "$i$f$Box":I
    :goto_5
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    move-object/from16 v8, v23

    .end local v23    # "$this$set_impl_u24lambda_u240$iv$iv$iv":Landroidx/compose/runtime/Composer;
    .local v8, "$this$set_impl_u24lambda_u240$iv$iv$iv":Landroidx/compose/runtime/Composer;
    invoke-interface {v8, v6}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1300
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v7, v6, v5}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1302
    :goto_6
    nop

    .line 1297
    .end local v8    # "$this$set_impl_u24lambda_u240$iv$iv$iv":Landroidx/compose/runtime/Composer;
    .end local v24    # "$i$a$-with-Updater$set$1$iv$iv$iv":I
    nop

    .line 1302
    nop

    .line 1303
    .end local v5    # "block$iv$iv$iv":Lkotlin/jvm/functions/Function2;
    .end local v21    # "$i$f$set-impl":I
    sget-object v5, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v5}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lkotlin/jvm/functions/Function2;

    move-result-object v5

    invoke-static {v7, v4, v5}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1304
    nop

    .line 1293
    .end local v7    # "$this$Layout_u24lambda_u240$iv$iv":Landroidx/compose/runtime/Composer;
    .end local v18    # "$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv":I
    nop

    .line 1305
    shr-int/lit8 v5, v19, 0x6

    and-int/lit8 v5, v5, 0xe

    .local v5, "$changed$iv":I
    move-object/from16 v6, v22

    .local v6, "$composer$iv":Landroidx/compose/runtime/Composer;
    const/4 v7, 0x0

    .line 1276
    .local v7, "$i$a$-Layout-BoxKt$Box$1$iv":I
    const v8, -0x7ff482d7

    move-object/from16 v18, v4

    .end local v4    # "materialized$iv$iv":Landroidx/compose/ui/Modifier;
    .local v18, "materialized$iv$iv":Landroidx/compose/ui/Modifier;
    const-string v4, "C72@3468L9:Box.kt#2w3rfo"

    invoke-static {v6, v8, v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    sget-object v4, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    shr-int/lit8 v8, v20, 0x6

    and-int/lit8 v8, v8, 0x70

    or-int/lit8 v8, v8, 0x6

    .local v8, "$changed":I
    check-cast v4, Landroidx/compose/foundation/layout/BoxScope;

    .local v4, "$this$CoreTextFieldRootBox_u24lambda_u2421":Landroidx/compose/foundation/layout/BoxScope;
    move-object/from16 v21, v6

    .local v21, "$composer":Landroidx/compose/runtime/Composer;
    const/16 v23, 0x0

    .line 670
    .local v23, "$i$a$-Box-CoreTextFieldKt$CoreTextFieldRootBox$1":I
    move-object/from16 v24, v4

    .end local v4    # "$this$CoreTextFieldRootBox_u24lambda_u2421":Landroidx/compose/foundation/layout/BoxScope;
    .local v24, "$this$CoreTextFieldRootBox_u24lambda_u2421":Landroidx/compose/foundation/layout/BoxScope;
    const v4, -0x46df9b3f

    move/from16 v27, v5

    .end local v5    # "$changed$iv":I
    .local v27, "$changed$iv":I
    const-string v5, "C669@31717L33:CoreTextField.kt#423gt5"

    move-object/from16 v28, v6

    .end local v21    # "$composer":Landroidx/compose/runtime/Composer;
    .local v6, "$composer":Landroidx/compose/runtime/Composer;
    .local v28, "$composer$iv":Landroidx/compose/runtime/Composer;
    invoke-static {v6, v4, v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    shr-int/lit8 v4, v17, 0x3

    and-int/lit8 v4, v4, 0xe

    shr-int/lit8 v5, v17, 0x3

    and-int/lit8 v5, v5, 0x70

    or-int/2addr v4, v5

    invoke-static {v1, v2, v6, v4}, Landroidx/compose/foundation/text/ContextMenu_androidKt;->ContextMenuArea(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 1276
    .end local v6    # "$composer":Landroidx/compose/runtime/Composer;
    .end local v8    # "$changed":I
    .end local v23    # "$i$a$-Box-CoreTextFieldKt$CoreTextFieldRootBox$1":I
    .end local v24    # "$this$CoreTextFieldRootBox_u24lambda_u2421":Landroidx/compose/foundation/layout/BoxScope;
    invoke-static/range {v28 .. v28}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 1305
    .end local v7    # "$i$a$-Layout-BoxKt$Box$1$iv":I
    .end local v27    # "$changed$iv":I
    .end local v28    # "$composer$iv":Landroidx/compose/runtime/Composer;
    nop

    .line 1306
    invoke-interface/range {v22 .. v22}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 1285
    invoke-static/range {v22 .. v22}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 1307
    nop

    .line 1279
    .end local v16    # "$i$f$ReusableComposeNode":I
    .end local v19    # "$changed$iv$iv$iv":I
    .end local v25    # "factory$iv$iv$iv":Lkotlin/jvm/functions/Function0;
    invoke-static/range {v22 .. v22}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 1308
    nop

    .line 1269
    .end local v9    # "compositeKeyHash$iv$iv":I
    .end local v12    # "$changed$iv$iv":I
    .end local v13    # "modifier$iv$iv":Landroidx/compose/ui/Modifier;
    .end local v14    # "$i$f$Layout":I
    .end local v15    # "localMap$iv$iv":Landroidx/compose/runtime/CompositionLocalMap;
    .end local v18    # "materialized$iv$iv":Landroidx/compose/ui/Modifier;
    invoke-static/range {v22 .. v22}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 1309
    nop

    .end local v10    # "contentAlignment$iv":Landroidx/compose/ui/Alignment;
    .end local v11    # "measurePolicy$iv":Landroidx/compose/ui/layout/MeasurePolicy;
    .end local v20    # "$changed$iv":I
    .end local v26    # "$i$f$Box":I
    .end local p3    # "propagateMinConstraints$iv":Z
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v4

    if-eqz v4, :cond_d

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    goto :goto_7

    .line 671
    .end local v17    # "$dirty":I
    .end local v22    # "$composer":Landroidx/compose/runtime/Composer;
    .local v5, "$composer":Landroidx/compose/runtime/Composer;
    .local v6, "$dirty":I
    :cond_c
    move-object/from16 v22, v5

    move/from16 v17, v6

    .end local v5    # "$composer":Landroidx/compose/runtime/Composer;
    .end local v6    # "$dirty":I
    .restart local v17    # "$dirty":I
    .restart local v22    # "$composer":Landroidx/compose/runtime/Composer;
    invoke-interface/range {v22 .. v22}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    :cond_d
    :goto_7
    invoke-interface/range {v22 .. v22}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v4

    if-eqz v4, :cond_e

    new-instance v5, Landroidx/compose/foundation/text/CoreTextFieldKt$CoreTextFieldRootBox$2;

    invoke-direct {v5, v0, v1, v2, v3}, Landroidx/compose/foundation/text/CoreTextFieldKt$CoreTextFieldRootBox$2;-><init>(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Lkotlin/jvm/functions/Function2;I)V

    check-cast v5, Lkotlin/jvm/functions/Function2;

    invoke-interface {v4, v5}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_e
    return-void
.end method

.method private static final SelectionToolbarAndHandles(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;ZLandroidx/compose/runtime/Composer;I)V
    .locals 12
    .param p0, "manager"    # Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;
    .param p1, "show"    # Z
    .param p2, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p3, "$changed"    # I

    .line 1019
    const v0, 0x25552d88

    invoke-interface {p2, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object p2

    const-string v1, "C(SelectionToolbarAndHandles):CoreTextField.kt#423gt5"

    invoke-static {p2, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    move v1, p3

    .local v1, "$dirty":I
    and-int/lit8 v2, p3, 0x6

    if-nez v2, :cond_1

    invoke-interface {p2, p0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v1, v2

    :cond_1
    and-int/lit8 v2, p3, 0x30

    if-nez v2, :cond_3

    invoke-interface {p2, p1}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0x20

    goto :goto_1

    :cond_2
    const/16 v2, 0x10

    :goto_1
    or-int/2addr v1, v2

    :cond_3
    and-int/lit8 v2, v1, 0x13

    const/16 v3, 0x12

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eq v2, v3, :cond_4

    move v2, v5

    goto :goto_2

    :cond_4
    move v2, v4

    :goto_2
    and-int/lit8 v3, v1, 0x1

    invoke-interface {p2, v2, v3}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v2

    if-eqz v2, :cond_14

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_5

    const/4 v2, -0x1

    const-string v3, "androidx.compose.foundation.text.SelectionToolbarAndHandles (CoreTextField.kt:1018)"

    invoke-static {v0, v1, v2, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 1020
    :cond_5
    move-object v0, p0

    .local v0, "$this$SelectionToolbarAndHandles_u24lambda_u2426":Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;
    const/4 v2, 0x0

    .line 1021
    .local v2, "$i$a$-with-CoreTextFieldKt$SelectionToolbarAndHandles$1":I
    if-eqz p1, :cond_13

    const v3, -0x4cf1f322

    invoke-interface {p2, v3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v3, ""

    invoke-static {p2, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 1025
    nop

    .line 1027
    nop

    .line 1026
    nop

    .line 1024
    invoke-virtual {v0}, Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;->getState$foundation_release()Landroidx/compose/foundation/text/LegacyTextFieldState;

    move-result-object v6

    .line 1025
    const/4 v7, 0x0

    if-eqz v6, :cond_7

    .line 1024
    nop

    .line 1025
    invoke-virtual {v6}, Landroidx/compose/foundation/text/LegacyTextFieldState;->getLayoutResult()Landroidx/compose/foundation/text/TextLayoutResultProxy;

    move-result-object v6

    .line 1026
    if-eqz v6, :cond_7

    .line 1025
    nop

    .line 1026
    invoke-virtual {v6}, Landroidx/compose/foundation/text/TextLayoutResultProxy;->getValue()Landroidx/compose/ui/text/TextLayoutResult;

    move-result-object v6

    .line 1027
    if-eqz v6, :cond_7

    .line 1026
    nop

    .line 1027
    move-object v8, v6

    .line 1163
    .local v8, "it":Landroidx/compose/ui/text/TextLayoutResult;
    const/4 v9, 0x0

    .line 1027
    .local v9, "$i$a$-takeIf-CoreTextFieldKt$SelectionToolbarAndHandles$1$1":I
    invoke-virtual {v0}, Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;->getState$foundation_release()Landroidx/compose/foundation/text/LegacyTextFieldState;

    move-result-object v10

    if-eqz v10, :cond_6

    invoke-virtual {v10}, Landroidx/compose/foundation/text/LegacyTextFieldState;->isLayoutResultStale()Z

    move-result v10

    goto :goto_3

    :cond_6
    move v10, v5

    .end local v8    # "it":Landroidx/compose/ui/text/TextLayoutResult;
    .end local v9    # "$i$a$-takeIf-CoreTextFieldKt$SelectionToolbarAndHandles$1$1":I
    :goto_3
    if-nez v10, :cond_8

    move-object v7, v6

    goto :goto_4

    .line 1025
    :cond_7
    nop

    .line 1027
    :cond_8
    :goto_4
    nop

    .line 1028
    nop

    .line 1027
    nop

    .line 1028
    if-nez v7, :cond_9

    const v3, -0x4ced0348

    invoke-interface {p2, v3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    :goto_5
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    goto/16 :goto_c

    :cond_9
    const v6, -0x4ced0347

    invoke-interface {p2, v6}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-static {p2, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 1027
    nop

    .line 1028
    nop

    .local v7, "it":Landroidx/compose/ui/text/TextLayoutResult;
    const/4 v6, 0x0

    .line 1029
    .local v6, "$i$a$-let-CoreTextFieldKt$SelectionToolbarAndHandles$1$2":I
    invoke-virtual {v0}, Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;->getValue$foundation_release()Landroidx/compose/ui/text/input/TextFieldValue;

    move-result-object v8

    invoke-virtual {v8}, Landroidx/compose/ui/text/input/TextFieldValue;->getSelection-d9O1mEE()J

    move-result-wide v8

    invoke-static {v8, v9}, Landroidx/compose/ui/text/TextRange;->getCollapsed-impl(J)Z

    move-result v8

    if-nez v8, :cond_e

    const v8, -0x647293ac

    invoke-interface {p2, v8}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-static {p2, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 1030
    invoke-virtual {v0}, Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;->getOffsetMapping$foundation_release()Landroidx/compose/ui/text/input/OffsetMapping;

    move-result-object v3

    invoke-virtual {v0}, Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;->getValue$foundation_release()Landroidx/compose/ui/text/input/TextFieldValue;

    move-result-object v8

    invoke-virtual {v8}, Landroidx/compose/ui/text/input/TextFieldValue;->getSelection-d9O1mEE()J

    move-result-wide v8

    invoke-static {v8, v9}, Landroidx/compose/ui/text/TextRange;->getStart-impl(J)I

    move-result v8

    invoke-interface {v3, v8}, Landroidx/compose/ui/text/input/OffsetMapping;->originalToTransformed(I)I

    move-result v3

    .line 1031
    .local v3, "startOffset":I
    invoke-virtual {v0}, Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;->getOffsetMapping$foundation_release()Landroidx/compose/ui/text/input/OffsetMapping;

    move-result-object v8

    invoke-virtual {v0}, Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;->getValue$foundation_release()Landroidx/compose/ui/text/input/TextFieldValue;

    move-result-object v9

    invoke-virtual {v9}, Landroidx/compose/ui/text/input/TextFieldValue;->getSelection-d9O1mEE()J

    move-result-wide v9

    invoke-static {v9, v10}, Landroidx/compose/ui/text/TextRange;->getEnd-impl(J)I

    move-result v9

    invoke-interface {v8, v9}, Landroidx/compose/ui/text/input/OffsetMapping;->originalToTransformed(I)I

    move-result v8

    .line 1032
    .local v8, "endOffset":I
    invoke-virtual {v7, v3}, Landroidx/compose/ui/text/TextLayoutResult;->getBidiRunDirection(I)Landroidx/compose/ui/text/style/ResolvedTextDirection;

    move-result-object v9

    .line 1033
    .local v9, "startDirection":Landroidx/compose/ui/text/style/ResolvedTextDirection;
    add-int/lit8 v10, v8, -0x1

    invoke-static {v10, v4}, Ljava/lang/Math;->max(II)I

    move-result v10

    invoke-virtual {v7, v10}, Landroidx/compose/ui/text/TextLayoutResult;->getBidiRunDirection(I)Landroidx/compose/ui/text/style/ResolvedTextDirection;

    move-result-object v10

    .line 1034
    .local v10, "endDirection":Landroidx/compose/ui/text/style/ResolvedTextDirection;
    invoke-virtual {p0}, Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;->getState$foundation_release()Landroidx/compose/foundation/text/LegacyTextFieldState;

    move-result-object v11

    if-eqz v11, :cond_a

    invoke-virtual {v11}, Landroidx/compose/foundation/text/LegacyTextFieldState;->getShowSelectionHandleStart()Z

    move-result v11

    if-ne v11, v5, :cond_a

    move v11, v5

    goto :goto_6

    :cond_a
    move v11, v4

    :goto_6
    if-eqz v11, :cond_b

    const v11, -0x646c32b9

    invoke-interface {p2, v11}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v11, "1034@46819L219"

    invoke-static {p2, v11}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 1036
    nop

    .line 1037
    nop

    .line 1038
    shl-int/lit8 v11, v1, 0x6

    and-int/lit16 v11, v11, 0x380

    or-int/lit8 v11, v11, 0x6

    .line 1035
    invoke-static {v5, v9, p0, p2, v11}, Landroidx/compose/foundation/text/selection/TextFieldSelectionManagerKt;->TextFieldSelectionHandle(ZLandroidx/compose/ui/text/style/ResolvedTextDirection;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroidx/compose/runtime/Composer;I)V

    .line 1034
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    goto :goto_7

    .line 1040
    :cond_b
    const v11, -0x64682a66

    invoke-interface {p2, v11}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 1041
    :goto_7
    invoke-virtual {p0}, Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;->getState$foundation_release()Landroidx/compose/foundation/text/LegacyTextFieldState;

    move-result-object v11

    if-eqz v11, :cond_c

    invoke-virtual {v11}, Landroidx/compose/foundation/text/LegacyTextFieldState;->getShowSelectionHandleEnd()Z

    move-result v11

    if-ne v11, v5, :cond_c

    goto :goto_8

    :cond_c
    move v5, v4

    :goto_8
    if-eqz v5, :cond_d

    const v5, -0x6466e2b8

    invoke-interface {p2, v5}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v5, "1041@47170L218"

    invoke-static {p2, v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 1043
    nop

    .line 1044
    nop

    .line 1045
    shl-int/lit8 v5, v1, 0x6

    and-int/lit16 v5, v5, 0x380

    or-int/lit8 v5, v5, 0x6

    .line 1042
    invoke-static {v4, v10, p0, p2, v5}, Landroidx/compose/foundation/text/selection/TextFieldSelectionManagerKt;->TextFieldSelectionHandle(ZLandroidx/compose/ui/text/style/ResolvedTextDirection;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroidx/compose/runtime/Composer;I)V

    .line 1041
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    goto :goto_9

    .line 1047
    :cond_d
    const v5, -0x6462de26

    invoke-interface {p2, v5}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 1029
    .end local v3    # "startOffset":I
    .end local v8    # "endOffset":I
    .end local v9    # "startDirection":Landroidx/compose/ui/text/style/ResolvedTextDirection;
    .end local v10    # "endDirection":Landroidx/compose/ui/text/style/ResolvedTextDirection;
    :goto_9
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    goto :goto_a

    .line 1048
    :cond_e
    const v3, -0x646288e6

    invoke-interface {p2, v3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 1050
    :goto_a
    invoke-virtual {v0}, Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;->getState$foundation_release()Landroidx/compose/foundation/text/LegacyTextFieldState;

    move-result-object v3

    if-eqz v3, :cond_12

    .local v3, "textFieldState":Landroidx/compose/foundation/text/LegacyTextFieldState;
    const/4 v5, 0x0

    .line 1054
    .local v5, "$i$a$-let-CoreTextFieldKt$SelectionToolbarAndHandles$1$2$1":I
    invoke-virtual {v0}, Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;->isTextChanged$foundation_release()Z

    move-result v8

    if-eqz v8, :cond_f

    invoke-virtual {v3, v4}, Landroidx/compose/foundation/text/LegacyTextFieldState;->setShowFloatingToolbar(Z)V

    .line 1055
    :cond_f
    invoke-virtual {v3}, Landroidx/compose/foundation/text/LegacyTextFieldState;->getHasFocus()Z

    move-result v4

    if-eqz v4, :cond_11

    .line 1056
    invoke-virtual {v3}, Landroidx/compose/foundation/text/LegacyTextFieldState;->getShowFloatingToolbar()Z

    move-result v4

    if-eqz v4, :cond_10

    invoke-virtual {v0}, Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;->showSelectionToolbar$foundation_release()Lkotlinx/coroutines/Job;

    goto :goto_b

    .line 1057
    :cond_10
    invoke-virtual {v0}, Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;->hideSelectionToolbar$foundation_release()V

    .line 1059
    :cond_11
    :goto_b
    nop

    .line 1050
    .end local v3    # "textFieldState":Landroidx/compose/foundation/text/LegacyTextFieldState;
    .end local v5    # "$i$a$-let-CoreTextFieldKt$SelectionToolbarAndHandles$1$2$1":I
    sget-object v3, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 1059
    :cond_12
    nop

    .line 1028
    .end local v6    # "$i$a$-let-CoreTextFieldKt$SelectionToolbarAndHandles$1$2":I
    .end local v7    # "it":Landroidx/compose/ui/text/TextLayoutResult;
    goto/16 :goto_5

    .line 1021
    :goto_c
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    goto :goto_d

    .line 1061
    :cond_13
    const v3, 0x26cfeb7f

    invoke-interface {p2, v3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    invoke-virtual {v0}, Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;->hideSelectionToolbar$foundation_release()V

    .line 1021
    :goto_d
    nop

    .line 1061
    nop

    .line 1020
    .end local v0    # "$this$SelectionToolbarAndHandles_u24lambda_u2426":Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;
    .end local v2    # "$i$a$-with-CoreTextFieldKt$SelectionToolbarAndHandles$1":I
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_15

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    goto :goto_e

    .line 1063
    :cond_14
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    :cond_15
    :goto_e
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v0

    if-eqz v0, :cond_16

    new-instance v2, Landroidx/compose/foundation/text/CoreTextFieldKt$SelectionToolbarAndHandles$2;

    invoke-direct {v2, p0, p1, p3}, Landroidx/compose/foundation/text/CoreTextFieldKt$SelectionToolbarAndHandles$2;-><init>(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;ZI)V

    check-cast v2, Lkotlin/jvm/functions/Function2;

    invoke-interface {v0, v2}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_16
    return-void
.end method

.method public static final TextFieldCursorHandle(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroidx/compose/runtime/Composer;I)V
    .locals 17
    .param p0, "manager"    # Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;
    .param p1, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p2, "$changed"    # I

    .line 1066
    move-object/from16 v0, p0

    move/from16 v1, p2

    const v2, -0x5597ad88

    move-object/from16 v3, p1

    invoke-interface {v3, v2}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v7

    .end local p1    # "$composer":Landroidx/compose/runtime/Composer;
    .local v7, "$composer":Landroidx/compose/runtime/Composer;
    const-string v3, "C(TextFieldCursorHandle):CoreTextField.kt#423gt5"

    invoke-static {v7, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    move/from16 v3, p2

    .local v3, "$dirty":I
    and-int/lit8 v4, v1, 0x6

    const/4 v5, 0x2

    if-nez v4, :cond_1

    invoke-interface {v7, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x4

    goto :goto_0

    :cond_0
    move v4, v5

    :goto_0
    or-int/2addr v3, v4

    :cond_1
    move v10, v3

    .end local v3    # "$dirty":I
    .local v10, "$dirty":I
    and-int/lit8 v3, v10, 0x3

    const/4 v6, 0x1

    if-eq v3, v5, :cond_2

    move v3, v6

    goto :goto_1

    :cond_2
    const/4 v3, 0x0

    :goto_1
    and-int/lit8 v5, v10, 0x1

    invoke-interface {v7, v3, v5}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v3

    if-eqz v3, :cond_10

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v3

    if-eqz v3, :cond_3

    const/4 v3, -0x1

    const-string v5, "androidx.compose.foundation.text.TextFieldCursorHandle (CoreTextField.kt:1065)"

    invoke-static {v2, v10, v3, v5}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 1067
    :cond_3
    invoke-virtual {v0}, Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;->getState$foundation_release()Landroidx/compose/foundation/text/LegacyTextFieldState;

    move-result-object v2

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Landroidx/compose/foundation/text/LegacyTextFieldState;->getShowCursorHandle()Z

    move-result v2

    if-ne v2, v6, :cond_4

    move v2, v6

    goto :goto_2

    :cond_4
    const/4 v2, 0x0

    :goto_2
    if-eqz v2, :cond_f

    invoke-virtual {v0}, Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;->getTransformedText$foundation_release()Landroidx/compose/ui/text/AnnotatedString;

    move-result-object v2

    if-eqz v2, :cond_6

    check-cast v2, Ljava/lang/CharSequence;

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-lez v2, :cond_5

    move v2, v6

    goto :goto_3

    :cond_5
    const/4 v2, 0x0

    :goto_3
    if-ne v2, v6, :cond_6

    move v2, v6

    goto :goto_4

    :cond_6
    const/4 v2, 0x0

    :goto_4
    if-eqz v2, :cond_f

    const v2, -0x114824f3

    invoke-interface {v7, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v2, "1067@48332L50,1068@48445L7,1070@48505L12,1072@48590L645,1084@49267L385,1069@48462L1200"

    invoke-static {v7, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 1068
    const v2, -0x1954ea6a

    const-string v3, "CC(remember):CoreTextField.kt#9igjgp"

    invoke-static {v7, v2, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v7, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v2

    .local v2, "invalid$iv":Z
    move-object v5, v7

    .local v5, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/4 v8, 0x0

    .line 1312
    .local v8, "$i$f$cache":I
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v9

    .local v9, "it$iv":Ljava/lang/Object;
    const/4 v11, 0x0

    .line 1313
    .local v11, "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez v2, :cond_8

    sget-object v12, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v12}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v12

    if-ne v9, v12, :cond_7

    goto :goto_5

    .line 1317
    :cond_7
    goto :goto_6

    .line 1314
    :cond_8
    :goto_5
    const/4 v12, 0x0

    .line 1068
    .local v12, "$i$a$-cache-CoreTextFieldKt$TextFieldCursorHandle$observer$1":I
    invoke-virtual {v0}, Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;->cursorDragObserver$foundation_release()Landroidx/compose/foundation/text/TextDragObserver;

    move-result-object v12

    .line 1314
    .end local v12    # "$i$a$-cache-CoreTextFieldKt$TextFieldCursorHandle$observer$1":I
    nop

    .line 1315
    .local v12, "value$iv":Ljava/lang/Object;
    invoke-interface {v5, v12}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1316
    move-object v9, v12

    .line 1312
    .end local v9    # "it$iv":Ljava/lang/Object;
    .end local v11    # "$i$a$-let-ComposerKt$cache$1$iv":I
    .end local v12    # "value$iv":Ljava/lang/Object;
    :goto_6
    nop

    .line 1068
    .end local v2    # "invalid$iv":Z
    .end local v5    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v8    # "$i$f$cache":I
    move-object v2, v9

    check-cast v2, Landroidx/compose/foundation/text/TextDragObserver;

    .local v2, "observer":Landroidx/compose/foundation/text/TextDragObserver;
    invoke-static {v7}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 1069
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalDensity()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v5

    check-cast v5, Landroidx/compose/runtime/CompositionLocal;

    .local v5, "this_$iv":Landroidx/compose/runtime/CompositionLocal;
    const/4 v8, 0x0

    .local v8, "$changed$iv":I
    const/4 v9, 0x0

    .line 1318
    .local v9, "$i$f$getCurrent":I
    const v11, 0x789c5f52

    const-string v12, "CC(<get-current>):CompositionLocal.kt#9igjgp"

    invoke-static {v7, v11, v12}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v7, v5}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v11

    invoke-static {v7}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .end local v5    # "this_$iv":Landroidx/compose/runtime/CompositionLocal;
    .end local v8    # "$changed$iv":I
    .end local v9    # "$i$f$getCurrent":I
    check-cast v11, Landroidx/compose/ui/unit/Density;

    .line 1069
    invoke-virtual {v0, v11}, Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;->getCursorPosition-tuRUvjQ$foundation_release(Landroidx/compose/ui/unit/Density;)J

    move-result-wide v11

    .line 1071
    .local v11, "position":J
    const v5, -0x1954d4f0

    invoke-static {v7, v5, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v7, v11, v12}, Landroidx/compose/runtime/Composer;->changed(J)Z

    move-result v5

    .local v5, "invalid$iv":Z
    move-object v8, v7

    .local v8, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/4 v9, 0x0

    .line 1319
    .local v9, "$i$f$cache":I
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v13

    .local v13, "it$iv":Ljava/lang/Object;
    const/4 v14, 0x0

    .line 1320
    .local v14, "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez v5, :cond_a

    sget-object v15, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v15}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v15

    if-ne v13, v15, :cond_9

    goto :goto_7

    .line 1324
    :cond_9
    goto :goto_8

    .line 1321
    :cond_a
    :goto_7
    const/4 v15, 0x0

    .line 1071
    .local v15, "$i$a$-cache-CoreTextFieldKt$TextFieldCursorHandle$1":I
    new-instance v4, Landroidx/compose/foundation/text/CoreTextFieldKt$TextFieldCursorHandle$1$1;

    invoke-direct {v4, v11, v12}, Landroidx/compose/foundation/text/CoreTextFieldKt$TextFieldCursorHandle$1$1;-><init>(J)V

    check-cast v4, Landroidx/compose/foundation/text/selection/OffsetProvider;

    .line 1321
    .end local v15    # "$i$a$-cache-CoreTextFieldKt$TextFieldCursorHandle$1":I
    nop

    .line 1322
    .local v4, "value$iv":Ljava/lang/Object;
    invoke-interface {v8, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1323
    move-object v13, v4

    .line 1319
    .end local v4    # "value$iv":Ljava/lang/Object;
    .end local v13    # "it$iv":Ljava/lang/Object;
    .end local v14    # "$i$a$-let-ComposerKt$cache$1$iv":I
    :goto_8
    nop

    .line 1071
    .end local v5    # "invalid$iv":Z
    .end local v8    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v9    # "$i$f$cache":I
    check-cast v13, Landroidx/compose/foundation/text/selection/OffsetProvider;

    invoke-static {v7}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 1073
    sget-object v4, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v4, Landroidx/compose/ui/Modifier;

    const v5, -0x1954c7d7

    invoke-static {v7, v5, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v7, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v5

    invoke-interface {v7, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v5, v8

    .restart local v5    # "invalid$iv":Z
    move-object v8, v7

    .restart local v8    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/4 v9, 0x0

    .line 1325
    .restart local v9    # "$i$f$cache":I
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v14

    .local v14, "it$iv":Ljava/lang/Object;
    const/4 v15, 0x0

    .line 1326
    .local v15, "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez v5, :cond_c

    sget-object v16, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual/range {v16 .. v16}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v6

    if-ne v14, v6, :cond_b

    goto :goto_9

    .line 1330
    :cond_b
    move/from16 v16, v5

    goto :goto_a

    .line 1327
    :cond_c
    :goto_9
    const/4 v6, 0x0

    .line 1073
    .local v6, "$i$a$-cache-CoreTextFieldKt$TextFieldCursorHandle$2":I
    move/from16 v16, v5

    .end local v5    # "invalid$iv":Z
    .local v16, "invalid$iv":Z
    new-instance v5, Landroidx/compose/foundation/text/CoreTextFieldKt$TextFieldCursorHandle$2$1;

    invoke-direct {v5, v2, v0}, Landroidx/compose/foundation/text/CoreTextFieldKt$TextFieldCursorHandle$2$1;-><init>(Landroidx/compose/foundation/text/TextDragObserver;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;)V

    check-cast v5, Landroidx/compose/ui/input/pointer/PointerInputEventHandler;

    .line 1327
    .end local v6    # "$i$a$-cache-CoreTextFieldKt$TextFieldCursorHandle$2":I
    nop

    .line 1328
    .local v5, "value$iv":Ljava/lang/Object;
    invoke-interface {v8, v5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1329
    move-object v14, v5

    .line 1325
    .end local v5    # "value$iv":Ljava/lang/Object;
    .end local v14    # "it$iv":Ljava/lang/Object;
    .end local v15    # "$i$a$-let-ComposerKt$cache$1$iv":I
    :goto_a
    nop

    .line 1073
    .end local v8    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v9    # "$i$f$cache":I
    .end local v16    # "invalid$iv":Z
    check-cast v14, Landroidx/compose/ui/input/pointer/PointerInputEventHandler;

    invoke-static {v7}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    invoke-static {v4, v2, v14}, Landroidx/compose/ui/input/pointer/SuspendingPointerInputFilterKt;->pointerInput(Landroidx/compose/ui/Modifier;Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    .line 1085
    const v5, -0x1954743b

    invoke-static {v7, v5, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v7, v11, v12}, Landroidx/compose/runtime/Composer;->changed(J)Z

    move-result v3

    .local v3, "invalid$iv":Z
    move-object v5, v7

    .local v5, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/4 v6, 0x0

    .line 1331
    .local v6, "$i$f$cache":I
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v8

    .local v8, "it$iv":Ljava/lang/Object;
    const/4 v9, 0x0

    .line 1332
    .local v9, "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez v3, :cond_e

    sget-object v14, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v14}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v14

    if-ne v8, v14, :cond_d

    goto :goto_b

    .line 1336
    :cond_d
    goto :goto_c

    .line 1333
    :cond_e
    :goto_b
    const/4 v14, 0x0

    .line 1085
    .local v14, "$i$a$-cache-CoreTextFieldKt$TextFieldCursorHandle$3":I
    new-instance v15, Landroidx/compose/foundation/text/CoreTextFieldKt$TextFieldCursorHandle$3$1;

    invoke-direct {v15, v11, v12}, Landroidx/compose/foundation/text/CoreTextFieldKt$TextFieldCursorHandle$3$1;-><init>(J)V

    check-cast v15, Lkotlin/jvm/functions/Function1;

    .line 1333
    .end local v14    # "$i$a$-cache-CoreTextFieldKt$TextFieldCursorHandle$3":I
    nop

    .line 1334
    .local v15, "value$iv":Ljava/lang/Object;
    invoke-interface {v5, v15}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1335
    move-object v8, v15

    .line 1331
    .end local v8    # "it$iv":Ljava/lang/Object;
    .end local v9    # "$i$a$-let-ComposerKt$cache$1$iv":I
    .end local v15    # "value$iv":Ljava/lang/Object;
    :goto_c
    nop

    .line 1085
    .end local v3    # "invalid$iv":Z
    .end local v5    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v6    # "$i$f$cache":I
    check-cast v8, Lkotlin/jvm/functions/Function1;

    invoke-static {v7}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x1

    invoke-static {v4, v5, v8, v6, v3}, Landroidx/compose/ui/semantics/SemanticsModifierKt;->semantics$default(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    .line 1070
    const-wide/16 v5, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x4

    move-object v3, v13

    invoke-static/range {v3 .. v9}, Landroidx/compose/foundation/text/AndroidCursorHandle_androidKt;->CursorHandle-USBMPiE(Landroidx/compose/foundation/text/selection/OffsetProvider;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    .line 1067
    .end local v2    # "observer":Landroidx/compose/foundation/text/TextDragObserver;
    .end local v11    # "position":J
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    goto :goto_d

    .line 1095
    :cond_f
    const v2, -0x11342fe2

    invoke-interface {v7, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    :goto_d
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_11

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    goto :goto_e

    .line 1096
    :cond_10
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    :cond_11
    :goto_e
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v2

    if-eqz v2, :cond_12

    new-instance v3, Landroidx/compose/foundation/text/CoreTextFieldKt$TextFieldCursorHandle$4;

    invoke-direct {v3, v0, v1}, Landroidx/compose/foundation/text/CoreTextFieldKt$TextFieldCursorHandle$4;-><init>(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;I)V

    check-cast v3, Lkotlin/jvm/functions/Function2;

    invoke-interface {v2, v3}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_12
    return-void
.end method

.method public static final synthetic access$CoreTextField$lambda$11(Landroidx/compose/runtime/State;)Z
    .locals 1
    .param p0, "$writeable$delegate"    # Landroidx/compose/runtime/State;

    .line 1
    invoke-static {p0}, Landroidx/compose/foundation/text/CoreTextFieldKt;->CoreTextField$lambda$11(Landroidx/compose/runtime/State;)Z

    move-result v0

    return v0
.end method

.method public static final synthetic access$CoreTextFieldRootBox(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
    .locals 0
    .param p0, "modifier"    # Landroidx/compose/ui/Modifier;
    .param p1, "manager"    # Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;
    .param p2, "content"    # Lkotlin/jvm/functions/Function2;
    .param p3, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p4, "$changed"    # I

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Landroidx/compose/foundation/text/CoreTextFieldKt;->CoreTextFieldRootBox(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method

.method public static final synthetic access$SelectionToolbarAndHandles(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;ZLandroidx/compose/runtime/Composer;I)V
    .locals 0
    .param p0, "manager"    # Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;
    .param p1, "show"    # Z
    .param p2, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p3, "$changed"    # I

    .line 1
    invoke-static {p0, p1, p2, p3}, Landroidx/compose/foundation/text/CoreTextFieldKt;->SelectionToolbarAndHandles(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;ZLandroidx/compose/runtime/Composer;I)V

    return-void
.end method

.method public static final synthetic access$endInputSession(Landroidx/compose/foundation/text/LegacyTextFieldState;)V
    .locals 0
    .param p0, "state"    # Landroidx/compose/foundation/text/LegacyTextFieldState;

    .line 1
    invoke-static {p0}, Landroidx/compose/foundation/text/CoreTextFieldKt;->endInputSession(Landroidx/compose/foundation/text/LegacyTextFieldState;)V

    return-void
.end method

.method public static final synthetic access$notifyFocusedRect(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/OffsetMapping;)V
    .locals 0
    .param p0, "state"    # Landroidx/compose/foundation/text/LegacyTextFieldState;
    .param p1, "value"    # Landroidx/compose/ui/text/input/TextFieldValue;
    .param p2, "offsetMapping"    # Landroidx/compose/ui/text/input/OffsetMapping;

    .line 1
    invoke-static {p0, p1, p2}, Landroidx/compose/foundation/text/CoreTextFieldKt;->notifyFocusedRect(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/OffsetMapping;)V

    return-void
.end method

.method public static final synthetic access$startInputSession(Landroidx/compose/ui/text/input/TextInputService;Landroidx/compose/foundation/text/LegacyTextFieldState;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/ImeOptions;Landroidx/compose/ui/text/input/OffsetMapping;)V
    .locals 0
    .param p0, "textInputService"    # Landroidx/compose/ui/text/input/TextInputService;
    .param p1, "state"    # Landroidx/compose/foundation/text/LegacyTextFieldState;
    .param p2, "value"    # Landroidx/compose/ui/text/input/TextFieldValue;
    .param p3, "imeOptions"    # Landroidx/compose/ui/text/input/ImeOptions;
    .param p4, "offsetMapping"    # Landroidx/compose/ui/text/input/OffsetMapping;

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Landroidx/compose/foundation/text/CoreTextFieldKt;->startInputSession(Landroidx/compose/ui/text/input/TextInputService;Landroidx/compose/foundation/text/LegacyTextFieldState;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/ImeOptions;Landroidx/compose/ui/text/input/OffsetMapping;)V

    return-void
.end method

.method public static final bringSelectionEndIntoView(Landroidx/compose/foundation/relocation/BringIntoViewRequester;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/foundation/text/TextDelegate;Landroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/text/input/OffsetMapping;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 10
    .param p0, "$this$bringSelectionEndIntoView"    # Landroidx/compose/foundation/relocation/BringIntoViewRequester;
    .param p1, "value"    # Landroidx/compose/ui/text/input/TextFieldValue;
    .param p2, "textDelegate"    # Landroidx/compose/foundation/text/TextDelegate;
    .param p3, "textLayoutResult"    # Landroidx/compose/ui/text/TextLayoutResult;
    .param p4, "offsetMapping"    # Landroidx/compose/ui/text/input/OffsetMapping;
    .param p5, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/relocation/BringIntoViewRequester;",
            "Landroidx/compose/ui/text/input/TextFieldValue;",
            "Landroidx/compose/foundation/text/TextDelegate;",
            "Landroidx/compose/ui/text/TextLayoutResult;",
            "Landroidx/compose/ui/text/input/OffsetMapping;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 996
    invoke-virtual {p1}, Landroidx/compose/ui/text/input/TextFieldValue;->getSelection-d9O1mEE()J

    move-result-wide v0

    invoke-static {v0, v1}, Landroidx/compose/ui/text/TextRange;->getMax-impl(J)I

    move-result v0

    invoke-interface {p4, v0}, Landroidx/compose/ui/text/input/OffsetMapping;->originalToTransformed(I)I

    move-result v0

    .line 998
    .local v0, "selectionEndInTransformed":I
    nop

    .line 999
    invoke-virtual {p3}, Landroidx/compose/ui/text/TextLayoutResult;->getLayoutInput()Landroidx/compose/ui/text/TextLayoutInput;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/compose/ui/text/TextLayoutInput;->getText()Landroidx/compose/ui/text/AnnotatedString;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/compose/ui/text/AnnotatedString;->length()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 1000
    invoke-virtual {p3, v0}, Landroidx/compose/ui/text/TextLayoutResult;->getBoundingBox(I)Landroidx/compose/ui/geometry/Rect;

    move-result-object v1

    goto :goto_0

    .line 1002
    :cond_0
    if-eqz v0, :cond_1

    .line 1003
    add-int/lit8 v1, v0, -0x1

    invoke-virtual {p3, v1}, Landroidx/compose/ui/text/TextLayoutResult;->getBoundingBox(I)Landroidx/compose/ui/geometry/Rect;

    move-result-object v1

    goto :goto_0

    .line 1008
    :cond_1
    invoke-virtual {p2}, Landroidx/compose/foundation/text/TextDelegate;->getStyle()Landroidx/compose/ui/text/TextStyle;

    move-result-object v2

    .line 1009
    invoke-virtual {p2}, Landroidx/compose/foundation/text/TextDelegate;->getDensity()Landroidx/compose/ui/unit/Density;

    move-result-object v3

    .line 1010
    invoke-virtual {p2}, Landroidx/compose/foundation/text/TextDelegate;->getFontFamilyResolver()Landroidx/compose/ui/text/font/FontFamily$Resolver;

    move-result-object v4

    .line 1007
    const/16 v7, 0x18

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v2 .. v8}, Landroidx/compose/foundation/text/TextFieldDelegateKt;->computeSizeForDefaultText$default(Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Ljava/lang/String;IILjava/lang/Object;)J

    move-result-wide v1

    .line 1006
    nop

    .line 1012
    .local v1, "defaultSize":J
    new-instance v3, Landroidx/compose/ui/geometry/Rect;

    const/4 v4, 0x0

    .line 1310
    .local v4, "$i$f$getHeight-impl":I
    move-wide v5, v1

    .local v5, "value$iv$iv":J
    const/4 v7, 0x0

    .line 1311
    .local v7, "$i$f$unpackInt2":I
    const-wide v8, 0xffffffffL

    and-long/2addr v8, v5

    long-to-int v5, v8

    .line 1310
    .end local v5    # "value$iv$iv":J
    .end local v7    # "$i$f$unpackInt2":I
    nop

    .line 1012
    .end local v4    # "$i$f$getHeight-impl":I
    int-to-float v4, v5

    const/4 v5, 0x0

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-direct {v3, v5, v5, v6, v4}, Landroidx/compose/ui/geometry/Rect;-><init>(FFFF)V

    move-object v1, v3

    .line 998
    .end local v1    # "defaultSize":J
    :goto_0
    nop

    .line 997
    nop

    .line 1015
    .local v1, "selectionEndBounds":Landroidx/compose/ui/geometry/Rect;
    invoke-interface {p0, v1, p5}, Landroidx/compose/foundation/relocation/BringIntoViewRequester;->bringIntoView(Landroidx/compose/ui/geometry/Rect;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v3

    if-ne v2, v3, :cond_2

    return-object v2

    :cond_2
    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 1016
    return-object v2
.end method

.method private static final endInputSession(Landroidx/compose/foundation/text/LegacyTextFieldState;)V
    .locals 5
    .param p0, "state"    # Landroidx/compose/foundation/text/LegacyTextFieldState;

    .line 964
    invoke-virtual {p0}, Landroidx/compose/foundation/text/LegacyTextFieldState;->getInputSession()Landroidx/compose/ui/text/input/TextInputSession;

    move-result-object v0

    if-eqz v0, :cond_0

    .local v0, "session":Landroidx/compose/ui/text/input/TextInputSession;
    const/4 v1, 0x0

    .line 965
    .local v1, "$i$a$-let-CoreTextFieldKt$endInputSession$1":I
    sget-object v2, Landroidx/compose/foundation/text/TextFieldDelegate;->Companion:Landroidx/compose/foundation/text/TextFieldDelegate$Companion;

    invoke-virtual {p0}, Landroidx/compose/foundation/text/LegacyTextFieldState;->getProcessor()Landroidx/compose/ui/text/input/EditProcessor;

    move-result-object v3

    invoke-virtual {p0}, Landroidx/compose/foundation/text/LegacyTextFieldState;->getOnValueChange()Lkotlin/jvm/functions/Function1;

    move-result-object v4

    invoke-virtual {v2, v0, v3, v4}, Landroidx/compose/foundation/text/TextFieldDelegate$Companion;->onBlur$foundation_release(Landroidx/compose/ui/text/input/TextInputSession;Landroidx/compose/ui/text/input/EditProcessor;Lkotlin/jvm/functions/Function1;)V

    .line 966
    nop

    .line 964
    .end local v0    # "session":Landroidx/compose/ui/text/input/TextInputSession;
    .end local v1    # "$i$a$-let-CoreTextFieldKt$endInputSession$1":I
    nop

    .line 967
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroidx/compose/foundation/text/LegacyTextFieldState;->setInputSession(Landroidx/compose/ui/text/input/TextInputSession;)V

    .line 968
    return-void
.end method

.method private static final notifyFocusedRect(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/OffsetMapping;)V
    .locals 16
    .param p0, "state"    # Landroidx/compose/foundation/text/LegacyTextFieldState;
    .param p1, "value"    # Landroidx/compose/ui/text/input/TextFieldValue;
    .param p2, "offsetMapping"    # Landroidx/compose/ui/text/input/OffsetMapping;

    .line 1114
    sget-object v1, Landroidx/compose/runtime/snapshots/Snapshot;->Companion:Landroidx/compose/runtime/snapshots/Snapshot$Companion;

    .local v1, "this_$iv":Landroidx/compose/runtime/snapshots/Snapshot$Companion;
    const/4 v2, 0x0

    .line 1337
    .local v2, "$i$f$withoutReadObservation":I
    nop

    .line 1338
    invoke-virtual {v1}, Landroidx/compose/runtime/snapshots/Snapshot$Companion;->getCurrentThreadSnapshot()Landroidx/compose/runtime/snapshots/Snapshot;

    move-result-object v3

    .line 1339
    .local v3, "previousSnapshot$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    if-eqz v3, :cond_0

    invoke-virtual {v3}, Landroidx/compose/runtime/snapshots/Snapshot;->getReadObserver()Lkotlin/jvm/functions/Function1;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    move-object v4, v0

    .line 1340
    .local v4, "observer$iv":Lkotlin/jvm/functions/Function1;
    invoke-virtual {v1, v3}, Landroidx/compose/runtime/snapshots/Snapshot$Companion;->makeCurrentNonObservable(Landroidx/compose/runtime/snapshots/Snapshot;)Landroidx/compose/runtime/snapshots/Snapshot;

    move-result-object v5

    .line 1341
    .local v5, "newSnapshot$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    nop

    .line 1342
    const/4 v0, 0x0

    .line 1115
    .local v0, "$i$a$-withoutReadObservation-CoreTextFieldKt$notifyFocusedRect$1":I
    :try_start_0
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/text/LegacyTextFieldState;->getLayoutResult()Landroidx/compose/foundation/text/TextLayoutResultProxy;

    move-result-object v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v6, :cond_1

    .line 1344
    nop

    .end local v0    # "$i$a$-withoutReadObservation-CoreTextFieldKt$notifyFocusedRect$1":I
    .end local v1    # "this_$iv":Landroidx/compose/runtime/snapshots/Snapshot$Companion;
    .end local v2    # "$i$f$withoutReadObservation":I
    .end local v3    # "previousSnapshot$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    .end local v4    # "observer$iv":Lkotlin/jvm/functions/Function1;
    .end local v5    # "newSnapshot$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    :goto_1
    invoke-virtual {v1, v3, v5, v4}, Landroidx/compose/runtime/snapshots/Snapshot$Companion;->restoreNonObservable(Landroidx/compose/runtime/snapshots/Snapshot;Landroidx/compose/runtime/snapshots/Snapshot;Lkotlin/jvm/functions/Function1;)V

    return-void

    .restart local v0    # "$i$a$-withoutReadObservation-CoreTextFieldKt$notifyFocusedRect$1":I
    .restart local v1    # "this_$iv":Landroidx/compose/runtime/snapshots/Snapshot$Companion;
    .restart local v2    # "$i$f$withoutReadObservation":I
    .restart local v3    # "previousSnapshot$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    .restart local v4    # "observer$iv":Lkotlin/jvm/functions/Function1;
    .restart local v5    # "newSnapshot$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    :cond_1
    nop

    .line 1116
    .local v6, "layoutResult":Landroidx/compose/foundation/text/TextLayoutResultProxy;
    :try_start_1
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/text/LegacyTextFieldState;->getInputSession()Landroidx/compose/ui/text/input/TextInputSession;

    move-result-object v7

    if-nez v7, :cond_2

    .line 1344
    nop

    .end local v0    # "$i$a$-withoutReadObservation-CoreTextFieldKt$notifyFocusedRect$1":I
    .end local v1    # "this_$iv":Landroidx/compose/runtime/snapshots/Snapshot$Companion;
    .end local v2    # "$i$f$withoutReadObservation":I
    .end local v3    # "previousSnapshot$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    .end local v4    # "observer$iv":Lkotlin/jvm/functions/Function1;
    .end local v5    # "newSnapshot$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    .end local v6    # "layoutResult":Landroidx/compose/foundation/text/TextLayoutResultProxy;
    goto :goto_1

    .restart local v0    # "$i$a$-withoutReadObservation-CoreTextFieldKt$notifyFocusedRect$1":I
    .restart local v1    # "this_$iv":Landroidx/compose/runtime/snapshots/Snapshot$Companion;
    .restart local v2    # "$i$f$withoutReadObservation":I
    .restart local v3    # "previousSnapshot$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    .restart local v4    # "observer$iv":Lkotlin/jvm/functions/Function1;
    .restart local v5    # "newSnapshot$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    .restart local v6    # "layoutResult":Landroidx/compose/foundation/text/TextLayoutResultProxy;
    :cond_2
    move-object v13, v7

    .line 1117
    .local v13, "inputSession":Landroidx/compose/ui/text/input/TextInputSession;
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/text/LegacyTextFieldState;->getLayoutCoordinates()Landroidx/compose/ui/layout/LayoutCoordinates;

    move-result-object v12

    if-nez v12, :cond_3

    .line 1344
    nop

    .end local v0    # "$i$a$-withoutReadObservation-CoreTextFieldKt$notifyFocusedRect$1":I
    .end local v1    # "this_$iv":Landroidx/compose/runtime/snapshots/Snapshot$Companion;
    .end local v2    # "$i$f$withoutReadObservation":I
    .end local v3    # "previousSnapshot$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    .end local v4    # "observer$iv":Lkotlin/jvm/functions/Function1;
    .end local v5    # "newSnapshot$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    .end local v6    # "layoutResult":Landroidx/compose/foundation/text/TextLayoutResultProxy;
    .end local v13    # "inputSession":Landroidx/compose/ui/text/input/TextInputSession;
    goto :goto_1

    .restart local v0    # "$i$a$-withoutReadObservation-CoreTextFieldKt$notifyFocusedRect$1":I
    .restart local v1    # "this_$iv":Landroidx/compose/runtime/snapshots/Snapshot$Companion;
    .restart local v2    # "$i$f$withoutReadObservation":I
    .restart local v3    # "previousSnapshot$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    .restart local v4    # "observer$iv":Lkotlin/jvm/functions/Function1;
    .restart local v5    # "newSnapshot$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    .restart local v6    # "layoutResult":Landroidx/compose/foundation/text/TextLayoutResultProxy;
    .restart local v13    # "inputSession":Landroidx/compose/ui/text/input/TextInputSession;
    :cond_3
    nop

    .line 1118
    .local v12, "layoutCoordinates":Landroidx/compose/ui/layout/LayoutCoordinates;
    sget-object v8, Landroidx/compose/foundation/text/TextFieldDelegate;->Companion:Landroidx/compose/foundation/text/TextFieldDelegate$Companion;

    .line 1119
    nop

    .line 1120
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/text/LegacyTextFieldState;->getTextDelegate()Landroidx/compose/foundation/text/TextDelegate;

    move-result-object v10

    .line 1121
    invoke-virtual {v6}, Landroidx/compose/foundation/text/TextLayoutResultProxy;->getValue()Landroidx/compose/ui/text/TextLayoutResult;

    move-result-object v11

    .line 1122
    nop

    .line 1123
    nop

    .line 1124
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/text/LegacyTextFieldState;->getHasFocus()Z

    move-result v14

    .line 1125
    nop

    .line 1118
    move-object/from16 v9, p1

    move-object/from16 v15, p2

    invoke-virtual/range {v8 .. v15}, Landroidx/compose/foundation/text/TextFieldDelegate$Companion;->notifyFocusedRect$foundation_release(Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/foundation/text/TextDelegate;Landroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/layout/LayoutCoordinates;Landroidx/compose/ui/text/input/TextInputSession;ZLandroidx/compose/ui/text/input/OffsetMapping;)V

    .line 1127
    nop

    .end local v0    # "$i$a$-withoutReadObservation-CoreTextFieldKt$notifyFocusedRect$1":I
    .end local v6    # "layoutResult":Landroidx/compose/foundation/text/TextLayoutResultProxy;
    .end local v12    # "layoutCoordinates":Landroidx/compose/ui/layout/LayoutCoordinates;
    .end local v13    # "inputSession":Landroidx/compose/ui/text/input/TextInputSession;
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1342
    nop

    .line 1344
    invoke-virtual {v1, v3, v5, v4}, Landroidx/compose/runtime/snapshots/Snapshot$Companion;->restoreNonObservable(Landroidx/compose/runtime/snapshots/Snapshot;Landroidx/compose/runtime/snapshots/Snapshot;Lkotlin/jvm/functions/Function1;)V

    .line 1342
    nop

    .line 1128
    .end local v1    # "this_$iv":Landroidx/compose/runtime/snapshots/Snapshot$Companion;
    .end local v2    # "$i$f$withoutReadObservation":I
    .end local v3    # "previousSnapshot$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    .end local v4    # "observer$iv":Lkotlin/jvm/functions/Function1;
    .end local v5    # "newSnapshot$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    return-void

    .line 1344
    .restart local v1    # "this_$iv":Landroidx/compose/runtime/snapshots/Snapshot$Companion;
    .restart local v2    # "$i$f$withoutReadObservation":I
    .restart local v3    # "previousSnapshot$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    .restart local v4    # "observer$iv":Lkotlin/jvm/functions/Function1;
    .restart local v5    # "newSnapshot$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    :catchall_0
    move-exception v0

    invoke-virtual {v1, v3, v5, v4}, Landroidx/compose/runtime/snapshots/Snapshot$Companion;->restoreNonObservable(Landroidx/compose/runtime/snapshots/Snapshot;Landroidx/compose/runtime/snapshots/Snapshot;Lkotlin/jvm/functions/Function1;)V

    throw v0
.end method

.method private static final previewKeyEventToDeselectOnBack(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/text/LegacyTextFieldState;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;)Landroidx/compose/ui/Modifier;
    .locals 1
    .param p0, "$this$previewKeyEventToDeselectOnBack"    # Landroidx/compose/ui/Modifier;
    .param p1, "state"    # Landroidx/compose/foundation/text/LegacyTextFieldState;
    .param p2, "manager"    # Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;

    .line 723
    new-instance v0, Landroidx/compose/foundation/text/CoreTextFieldKt$previewKeyEventToDeselectOnBack$1;

    invoke-direct {v0, p1, p2}, Landroidx/compose/foundation/text/CoreTextFieldKt$previewKeyEventToDeselectOnBack$1;-><init>(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;)V

    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-static {p0, v0}, Landroidx/compose/ui/input/key/KeyInputModifierKt;->onPreviewKeyEvent(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    .line 730
    return-object v0
.end method

.method private static final startInputSession(Landroidx/compose/ui/text/input/TextInputService;Landroidx/compose/foundation/text/LegacyTextFieldState;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/ImeOptions;Landroidx/compose/ui/text/input/OffsetMapping;)V
    .locals 7
    .param p0, "textInputService"    # Landroidx/compose/ui/text/input/TextInputService;
    .param p1, "state"    # Landroidx/compose/foundation/text/LegacyTextFieldState;
    .param p2, "value"    # Landroidx/compose/ui/text/input/TextFieldValue;
    .param p3, "imeOptions"    # Landroidx/compose/ui/text/input/ImeOptions;
    .param p4, "offsetMapping"    # Landroidx/compose/ui/text/input/OffsetMapping;

    .line 951
    nop

    .line 952
    sget-object v0, Landroidx/compose/foundation/text/TextFieldDelegate;->Companion:Landroidx/compose/foundation/text/TextFieldDelegate$Companion;

    .line 953
    nop

    .line 954
    nop

    .line 955
    invoke-virtual {p1}, Landroidx/compose/foundation/text/LegacyTextFieldState;->getProcessor()Landroidx/compose/ui/text/input/EditProcessor;

    move-result-object v3

    .line 956
    nop

    .line 957
    invoke-virtual {p1}, Landroidx/compose/foundation/text/LegacyTextFieldState;->getOnValueChange()Lkotlin/jvm/functions/Function1;

    move-result-object v5

    .line 958
    invoke-virtual {p1}, Landroidx/compose/foundation/text/LegacyTextFieldState;->getOnImeActionPerformed()Lkotlin/jvm/functions/Function1;

    move-result-object v6

    .line 952
    move-object v1, p0

    move-object v2, p2

    move-object v4, p3

    .end local p0    # "textInputService":Landroidx/compose/ui/text/input/TextInputService;
    .end local p2    # "value":Landroidx/compose/ui/text/input/TextFieldValue;
    .end local p3    # "imeOptions":Landroidx/compose/ui/text/input/ImeOptions;
    .local v1, "textInputService":Landroidx/compose/ui/text/input/TextInputService;
    .local v2, "value":Landroidx/compose/ui/text/input/TextFieldValue;
    .local v4, "imeOptions":Landroidx/compose/ui/text/input/ImeOptions;
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/foundation/text/TextFieldDelegate$Companion;->onFocus$foundation_release(Landroidx/compose/ui/text/input/TextInputService;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/EditProcessor;Landroidx/compose/ui/text/input/ImeOptions;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/text/input/TextInputSession;

    move-result-object p0

    .line 951
    invoke-virtual {p1, p0}, Landroidx/compose/foundation/text/LegacyTextFieldState;->setInputSession(Landroidx/compose/ui/text/input/TextInputSession;)V

    .line 960
    invoke-static {p1, v2, p4}, Landroidx/compose/foundation/text/CoreTextFieldKt;->notifyFocusedRect(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/OffsetMapping;)V

    .line 961
    return-void
.end method

.method public static final tapToFocus(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroidx/compose/ui/focus/FocusRequester;Z)V
    .locals 3
    .param p0, "state"    # Landroidx/compose/foundation/text/LegacyTextFieldState;
    .param p1, "focusRequester"    # Landroidx/compose/ui/focus/FocusRequester;
    .param p2, "allowKeyboard"    # Z

    .line 937
    invoke-virtual {p0}, Landroidx/compose/foundation/text/LegacyTextFieldState;->getHasFocus()Z

    move-result v0

    if-nez v0, :cond_0

    .line 938
    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p1, v2, v0, v1}, Landroidx/compose/ui/focus/FocusRequester;->requestFocus-3ESFkO8$default(Landroidx/compose/ui/focus/FocusRequester;IILjava/lang/Object;)Z

    goto :goto_0

    .line 939
    :cond_0
    if-eqz p2, :cond_1

    .line 940
    invoke-virtual {p0}, Landroidx/compose/foundation/text/LegacyTextFieldState;->getKeyboardController()Landroidx/compose/ui/platform/SoftwareKeyboardController;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v0}, Landroidx/compose/ui/platform/SoftwareKeyboardController;->show()V

    .line 942
    :cond_1
    :goto_0
    return-void
.end method
