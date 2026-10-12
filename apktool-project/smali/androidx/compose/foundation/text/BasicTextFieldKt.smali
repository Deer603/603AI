.class public final Landroidx/compose/foundation/text/BasicTextFieldKt;
.super Ljava/lang/Object;
.source "BasicTextField.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBasicTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicTextField.kt\nandroidx/compose/foundation/text/BasicTextFieldKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 9 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 10 Composer.kt\nandroidx/compose/runtime/Updater\n+ 11 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 12 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,971:1\n75#2:972\n75#2:973\n75#2:974\n75#2:1020\n75#2:1021\n75#2:1022\n1247#3,6:975\n1247#3,6:981\n1247#3,3:987\n1250#3,3:991\n1247#3,6:994\n1247#3,6:1000\n1247#3,3:1013\n1250#3,3:1017\n1247#3,6:1023\n1247#3,6:1029\n1247#3,6:1035\n1247#3,6:1041\n1247#3,6:1088\n1247#3,6:1094\n1247#3,6:1100\n1247#3,6:1106\n1247#3,6:1112\n1247#3,6:1118\n1247#3,6:1124\n1247#3,6:1130\n1247#3,6:1136\n1247#3,6:1142\n1247#3,6:1148\n1247#3,6:1154\n1247#3,6:1160\n1247#3,6:1166\n1247#3,6:1172\n1247#3,6:1178\n1#4:990\n557#5:1006\n554#5,6:1007\n555#6:1016\n70#7:1047\n67#7,9:1048\n77#7:1087\n79#8,6:1057\n86#8,3:1072\n89#8,2:1081\n93#8:1086\n347#9,9:1063\n356#9,3:1083\n4206#10,6:1075\n85#11:1184\n85#11:1185\n85#11:1186\n85#11:1187\n113#11,2:1188\n85#11:1190\n113#11,2:1191\n113#12:1193\n*S KotlinDebug\n*F\n+ 1 BasicTextField.kt\nandroidx/compose/foundation/text/BasicTextFieldKt\n*L\n246#1:972\n247#1:973\n248#1:974\n300#1:1020\n301#1:1021\n302#1:1022\n252#1:975,6\n257#1:981,6\n262#1:987,3\n262#1:991,3\n280#1:994,6\n288#1:1000,6\n299#1:1013,3\n299#1:1017,3\n305#1:1023,6\n349#1:1029,6\n365#1:1035,6\n390#1:1041,6\n505#1:1088,6\n510#1:1094,6\n514#1:1100,6\n526#1:1106,6\n536#1:1112,6\n545#1:1118,6\n555#1:1124,6\n565#1:1130,6\n574#1:1136,6\n713#1:1142,6\n719#1:1148,6\n730#1:1154,6\n734#1:1160,6\n870#1:1166,6\n907#1:1172,6\n947#1:1178,6\n299#1:1006\n299#1:1007,6\n299#1:1016\n430#1:1047\n430#1:1048,9\n430#1:1087\n430#1:1057,6\n430#1:1072,3\n430#1:1081,2\n430#1:1086\n430#1:1063,9\n430#1:1083,3\n430#1:1075,6\n505#1:1184\n526#1:1185\n555#1:1186\n713#1:1187\n713#1:1188,2\n730#1:1190\n730#1:1191,2\n594#1:1193\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00ca\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\u00db\u0001\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00082\u0008\u0008\u0002\u0010\t\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c2\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u00112\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u00132\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u001728\u0008\u0002\u0010\u0018\u001a2\u0012\u0004\u0012\u00020\u001a\u0012\u001b\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001b\u00a2\u0006\u000c\u0008\u001d\u0012\u0008\u0008\u001e\u0012\u0004\u0008\u0008(\u001f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0019\u00a2\u0006\u0002\u0008 2\n\u0008\u0002\u0010!\u001a\u0004\u0018\u00010\"2\u0008\u0008\u0002\u0010#\u001a\u00020$2\n\u0008\u0002\u0010%\u001a\u0004\u0018\u00010&2\n\u0008\u0002\u0010\'\u001a\u0004\u0018\u00010\u00012\u0008\u0008\u0002\u0010(\u001a\u00020)H\u0007\u00a2\u0006\u0002\u0010*\u001a\u00f1\u0001\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00082\u0008\u0008\u0002\u0010\t\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c2\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u00112\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u00132\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u001728\u0008\u0002\u0010\u0018\u001a2\u0012\u0004\u0012\u00020\u001a\u0012\u001b\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001b\u00a2\u0006\u000c\u0008\u001d\u0012\u0008\u0008\u001e\u0012\u0004\u0008\u0008(\u001f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0019\u00a2\u0006\u0002\u0008 2\n\u0008\u0002\u0010!\u001a\u0004\u0018\u00010\"2\u0008\u0008\u0002\u0010#\u001a\u00020$2\n\u0008\u0002\u0010+\u001a\u0004\u0018\u00010,2\n\u0008\u0002\u0010%\u001a\u0004\u0018\u00010&2\n\u0008\u0002\u0010\'\u001a\u0004\u0018\u00010\u00012\u0008\u0008\u0002\u0010(\u001a\u00020)2\u0008\u0008\u0002\u0010-\u001a\u00020\u000cH\u0001\u00a2\u0006\u0002\u0010.\u001a\u00e2\u0001\u0010\u0005\u001a\u00020\u00062\u0006\u0010/\u001a\u0002002\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u0006022\u0008\u0008\u0002\u0010\t\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u00112\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u00132\u0008\u0008\u0002\u00103\u001a\u0002042\u0008\u0008\u0002\u00105\u001a\u00020\u000c2\u0008\u0008\u0002\u00106\u001a\u0002072\u0008\u0008\u0002\u00108\u001a\u0002092\u0014\u0008\u0002\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0006022\u0008\u0008\u0002\u0010!\u001a\u00020\"2\u0008\u0008\u0002\u0010#\u001a\u00020$23\u0008\u0002\u0010:\u001a-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00060\u001b\u00a2\u0006\u0002\u0008;\u00a2\u0006\u000c\u0008\u001d\u0012\u0008\u0008\u001e\u0012\u0004\u0008\u0008(<\u0012\u0004\u0012\u00020\u000602\u00a2\u0006\u0002\u0008;H\u0007\u00a2\u0006\u0002\u0010=\u001a\u00ee\u0001\u0010\u0005\u001a\u00020\u00062\u0006\u0010/\u001a\u0002002\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u0006022\u0008\u0008\u0002\u0010\t\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u00112\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u00132\u0008\u0008\u0002\u00103\u001a\u0002042\u0008\u0008\u0002\u00105\u001a\u00020\u000c2\u0008\u0008\u0002\u00106\u001a\u0002072\u0008\u0008\u0002\u0010>\u001a\u0002072\u0008\u0008\u0002\u00108\u001a\u0002092\u0014\u0008\u0002\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0006022\n\u0008\u0002\u0010!\u001a\u0004\u0018\u00010\"2\u0008\u0008\u0002\u0010#\u001a\u00020$23\u0008\u0002\u0010:\u001a-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00060\u001b\u00a2\u0006\u0002\u0008;\u00a2\u0006\u000c\u0008\u001d\u0012\u0008\u0008\u001e\u0012\u0004\u0008\u0008(<\u0012\u0004\u0012\u00020\u000602\u00a2\u0006\u0002\u0008;H\u0007\u00a2\u0006\u0002\u0010?\u001a\u00e2\u0001\u0010\u0005\u001a\u00020\u00062\u0006\u0010/\u001a\u00020@2\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020\u0006022\u0008\u0008\u0002\u0010\t\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u00112\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u00132\u0008\u0008\u0002\u00103\u001a\u0002042\u0008\u0008\u0002\u00105\u001a\u00020\u000c2\u0008\u0008\u0002\u00106\u001a\u0002072\u0008\u0008\u0002\u00108\u001a\u0002092\u0014\u0008\u0002\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0006022\u0008\u0008\u0002\u0010!\u001a\u00020\"2\u0008\u0008\u0002\u0010#\u001a\u00020$23\u0008\u0002\u0010:\u001a-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00060\u001b\u00a2\u0006\u0002\u0008;\u00a2\u0006\u000c\u0008\u001d\u0012\u0008\u0008\u001e\u0012\u0004\u0008\u0008(<\u0012\u0004\u0012\u00020\u000602\u00a2\u0006\u0002\u0008;H\u0007\u00a2\u0006\u0002\u0010A\u001a\u00ee\u0001\u0010\u0005\u001a\u00020\u00062\u0006\u0010/\u001a\u00020@2\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020\u0006022\u0008\u0008\u0002\u0010\t\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u00112\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u00132\u0008\u0008\u0002\u00103\u001a\u0002042\u0008\u0008\u0002\u00105\u001a\u00020\u000c2\u0008\u0008\u0002\u00106\u001a\u0002072\u0008\u0008\u0002\u0010>\u001a\u0002072\u0008\u0008\u0002\u00108\u001a\u0002092\u0014\u0008\u0002\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0006022\n\u0008\u0002\u0010!\u001a\u0004\u0018\u00010\"2\u0008\u0008\u0002\u0010#\u001a\u00020$23\u0008\u0002\u0010:\u001a-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00060\u001b\u00a2\u0006\u0002\u0008;\u00a2\u0006\u000c\u0008\u001d\u0012\u0008\u0008\u001e\u0012\u0004\u0008\u0008(<\u0012\u0004\u0012\u00020\u000602\u00a2\u0006\u0002\u0008;H\u0007\u00a2\u0006\u0002\u0010B\u001a\u0015\u0010C\u001a\u00020\u00062\u0006\u0010D\u001a\u00020EH\u0001\u00a2\u0006\u0002\u0010F\u001a\u0015\u0010G\u001a\u00020\u00062\u0006\u0010D\u001a\u00020EH\u0001\u00a2\u0006\u0002\u0010F\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\"\u0010\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0004\u00a8\u0006H\u00b2\u0006\n\u0010I\u001a\u00020JX\u008a\u0084\u0002\u00b2\u0006\n\u0010K\u001a\u00020JX\u008a\u0084\u0002\u00b2\u0006\n\u0010L\u001a\u00020JX\u008a\u0084\u0002\u00b2\u0006\n\u0010M\u001a\u000200X\u008a\u008e\u0002\u00b2\u0006\n\u0010N\u001a\u00020@X\u008a\u008e\u0002"
    }
    d2 = {
        "DefaultTextFieldDecorator",
        "Landroidx/compose/foundation/text/input/TextFieldDecorator;",
        "MinTouchTargetSizeForHandles",
        "Landroidx/compose/ui/unit/DpSize;",
        "J",
        "BasicTextField",
        "",
        "state",
        "Landroidx/compose/foundation/text/input/TextFieldState;",
        "modifier",
        "Landroidx/compose/ui/Modifier;",
        "enabled",
        "",
        "readOnly",
        "inputTransformation",
        "Landroidx/compose/foundation/text/input/InputTransformation;",
        "textStyle",
        "Landroidx/compose/ui/text/TextStyle;",
        "keyboardOptions",
        "Landroidx/compose/foundation/text/KeyboardOptions;",
        "onKeyboardAction",
        "Landroidx/compose/foundation/text/input/KeyboardActionHandler;",
        "lineLimits",
        "Landroidx/compose/foundation/text/input/TextFieldLineLimits;",
        "onTextLayout",
        "Lkotlin/Function2;",
        "Landroidx/compose/ui/unit/Density;",
        "Lkotlin/Function0;",
        "Landroidx/compose/ui/text/TextLayoutResult;",
        "Lkotlin/ParameterName;",
        "name",
        "getResult",
        "Lkotlin/ExtensionFunctionType;",
        "interactionSource",
        "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
        "cursorBrush",
        "Landroidx/compose/ui/graphics/Brush;",
        "outputTransformation",
        "Landroidx/compose/foundation/text/input/OutputTransformation;",
        "decorator",
        "scrollState",
        "Landroidx/compose/foundation/ScrollState;",
        "(Landroidx/compose/foundation/text/input/TextFieldState;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/foundation/text/input/InputTransformation;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/input/KeyboardActionHandler;Landroidx/compose/foundation/text/input/TextFieldLineLimits;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/foundation/text/input/OutputTransformation;Landroidx/compose/foundation/text/input/TextFieldDecorator;Landroidx/compose/foundation/ScrollState;Landroidx/compose/runtime/Composer;III)V",
        "codepointTransformation",
        "Landroidx/compose/foundation/text/input/internal/CodepointTransformation;",
        "isPassword",
        "(Landroidx/compose/foundation/text/input/TextFieldState;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/foundation/text/input/InputTransformation;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/input/KeyboardActionHandler;Landroidx/compose/foundation/text/input/TextFieldLineLimits;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/foundation/text/input/internal/CodepointTransformation;Landroidx/compose/foundation/text/input/OutputTransformation;Landroidx/compose/foundation/text/input/TextFieldDecorator;Landroidx/compose/foundation/ScrollState;ZLandroidx/compose/runtime/Composer;III)V",
        "value",
        "Landroidx/compose/ui/text/input/TextFieldValue;",
        "onValueChange",
        "Lkotlin/Function1;",
        "keyboardActions",
        "Landroidx/compose/foundation/text/KeyboardActions;",
        "singleLine",
        "maxLines",
        "",
        "visualTransformation",
        "Landroidx/compose/ui/text/input/VisualTransformation;",
        "decorationBox",
        "Landroidx/compose/runtime/Composable;",
        "innerTextField",
        "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V",
        "minLines",
        "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V",
        "",
        "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V",
        "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V",
        "TextFieldCursorHandle",
        "selectionState",
        "Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;",
        "(Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Landroidx/compose/runtime/Composer;I)V",
        "TextFieldSelectionHandles",
        "foundation_release",
        "cursorHandleState",
        "Landroidx/compose/foundation/text/input/internal/selection/TextFieldHandleState;",
        "startHandleState",
        "endHandleState",
        "textFieldValueState",
        "lastTextValue"
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
.field private static final DefaultTextFieldDecorator:Landroidx/compose/foundation/text/input/TextFieldDecorator;

.field private static final MinTouchTargetSizeForHandles:J


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 583
    sget-object v0, Landroidx/compose/foundation/text/BasicTextFieldKt$DefaultTextFieldDecorator$1;->INSTANCE:Landroidx/compose/foundation/text/BasicTextFieldKt$DefaultTextFieldDecorator$1;

    check-cast v0, Landroidx/compose/foundation/text/input/TextFieldDecorator;

    sput-object v0, Landroidx/compose/foundation/text/BasicTextFieldKt;->DefaultTextFieldDecorator:Landroidx/compose/foundation/text/input/TextFieldDecorator;

    .line 594
    const/16 v0, 0x28

    .local v0, "$this$dp$iv":I
    const/4 v1, 0x0

    .line 1193
    .local v1, "$i$f$getDp":I
    int-to-float v2, v0

    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    .line 594
    .end local v0    # "$this$dp$iv":I
    .end local v1    # "$i$f$getDp":I
    const/16 v1, 0x28

    .local v1, "$this$dp$iv":I
    const/4 v2, 0x0

    .line 1193
    .local v2, "$i$f$getDp":I
    int-to-float v3, v1

    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v1

    .line 594
    .end local v1    # "$this$dp$iv":I
    .end local v2    # "$i$f$getDp":I
    invoke-static {v0, v1}, Landroidx/compose/ui/unit/DpKt;->DpSize-YgX7TsA(FF)J

    move-result-wide v0

    sput-wide v0, Landroidx/compose/foundation/text/BasicTextFieldKt;->MinTouchTargetSizeForHandles:J

    return-void
.end method

.method public static final BasicTextField(Landroidx/compose/foundation/text/input/TextFieldState;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/foundation/text/input/InputTransformation;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/input/KeyboardActionHandler;Landroidx/compose/foundation/text/input/TextFieldLineLimits;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/foundation/text/input/OutputTransformation;Landroidx/compose/foundation/text/input/TextFieldDecorator;Landroidx/compose/foundation/ScrollState;Landroidx/compose/runtime/Composer;III)V
    .locals 36
    .param p0, "state"    # Landroidx/compose/foundation/text/input/TextFieldState;
    .param p1, "modifier"    # Landroidx/compose/ui/Modifier;
    .param p2, "enabled"    # Z
    .param p3, "readOnly"    # Z
    .param p4, "inputTransformation"    # Landroidx/compose/foundation/text/input/InputTransformation;
    .param p5, "textStyle"    # Landroidx/compose/ui/text/TextStyle;
    .param p6, "keyboardOptions"    # Landroidx/compose/foundation/text/KeyboardOptions;
    .param p7, "onKeyboardAction"    # Landroidx/compose/foundation/text/input/KeyboardActionHandler;
    .param p8, "lineLimits"    # Landroidx/compose/foundation/text/input/TextFieldLineLimits;
    .param p9, "onTextLayout"    # Lkotlin/jvm/functions/Function2;
    .param p10, "interactionSource"    # Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .param p11, "cursorBrush"    # Landroidx/compose/ui/graphics/Brush;
    .param p12, "outputTransformation"    # Landroidx/compose/foundation/text/input/OutputTransformation;
    .param p13, "decorator"    # Landroidx/compose/foundation/text/input/TextFieldDecorator;
    .param p14, "scrollState"    # Landroidx/compose/foundation/ScrollState;
    .param p15, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p16, "$changed"    # I
    .param p17, "$changed1"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/text/input/TextFieldState;",
            "Landroidx/compose/ui/Modifier;",
            "ZZ",
            "Landroidx/compose/foundation/text/input/InputTransformation;",
            "Landroidx/compose/ui/text/TextStyle;",
            "Landroidx/compose/foundation/text/KeyboardOptions;",
            "Landroidx/compose/foundation/text/input/KeyboardActionHandler;",
            "Landroidx/compose/foundation/text/input/TextFieldLineLimits;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/ui/unit/Density;",
            "-",
            "Lkotlin/jvm/functions/Function0<",
            "Landroidx/compose/ui/text/TextLayoutResult;",
            ">;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
            "Landroidx/compose/ui/graphics/Brush;",
            "Landroidx/compose/foundation/text/input/OutputTransformation;",
            "Landroidx/compose/foundation/text/input/TextFieldDecorator;",
            "Landroidx/compose/foundation/ScrollState;",
            "Landroidx/compose/runtime/Composer;",
            "III)V"
        }
    .end annotation

    .line 195
    move-object/from16 v0, p13

    move/from16 v1, p16

    move/from16 v2, p17

    move/from16 v3, p18

    const v4, 0x1bfb15b1

    move-object/from16 v5, p15

    invoke-interface {v5, v4}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v5

    .end local p15    # "$composer":Landroidx/compose/runtime/Composer;
    .local v5, "$composer":Landroidx/compose/runtime/Composer;
    const-string v6, "C(BasicTextField)P(13,7,2,11,3,14,5,8,6,9,4!1,10)195@11756L610:BasicTextField.kt#423gt5"

    invoke-static {v5, v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    move/from16 v6, p16

    .local v6, "$dirty":I
    move/from16 v7, p17

    .local v7, "$dirty1":I
    and-int/lit8 v8, v3, 0x1

    if-eqz v8, :cond_0

    or-int/lit8 v6, v6, 0x6

    move-object/from16 v8, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v8, v1, 0x6

    if-nez v8, :cond_2

    move-object/from16 v8, p0

    invoke-interface {v5, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_1

    const/4 v11, 0x4

    goto :goto_0

    :cond_1
    const/4 v11, 0x2

    :goto_0
    or-int/2addr v6, v11

    goto :goto_1

    :cond_2
    move-object/from16 v8, p0

    :goto_1
    and-int/lit8 v11, v3, 0x2

    if-eqz v11, :cond_3

    or-int/lit8 v6, v6, 0x30

    move-object/from16 v14, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v14, v1, 0x30

    if-nez v14, :cond_5

    move-object/from16 v14, p1

    invoke-interface {v5, v14}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_4

    const/16 v15, 0x20

    goto :goto_2

    :cond_4
    const/16 v15, 0x10

    :goto_2
    or-int/2addr v6, v15

    goto :goto_3

    :cond_5
    move-object/from16 v14, p1

    :goto_3
    and-int/lit8 v15, v3, 0x4

    const/16 v16, 0x100

    const/16 v17, 0x80

    if-eqz v15, :cond_6

    or-int/lit16 v6, v6, 0x180

    move/from16 v9, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v9, v1, 0x180

    if-nez v9, :cond_8

    move/from16 v9, p2

    invoke-interface {v5, v9}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v18

    if-eqz v18, :cond_7

    move/from16 v18, v16

    goto :goto_4

    :cond_7
    move/from16 v18, v17

    :goto_4
    or-int v6, v6, v18

    goto :goto_5

    :cond_8
    move/from16 v9, p2

    :goto_5
    and-int/lit8 v18, v3, 0x8

    const/16 v19, 0x800

    const/16 v20, 0x400

    if-eqz v18, :cond_9

    or-int/lit16 v6, v6, 0xc00

    move/from16 v10, p3

    goto :goto_7

    :cond_9
    and-int/lit16 v10, v1, 0xc00

    if-nez v10, :cond_b

    move/from16 v10, p3

    invoke-interface {v5, v10}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v22

    if-eqz v22, :cond_a

    move/from16 v22, v19

    goto :goto_6

    :cond_a
    move/from16 v22, v20

    :goto_6
    or-int v6, v6, v22

    goto :goto_7

    :cond_b
    move/from16 v10, p3

    :goto_7
    and-int/lit8 v22, v3, 0x10

    const/16 v23, 0x2000

    const/16 v24, 0x4000

    if-eqz v22, :cond_c

    or-int/lit16 v6, v6, 0x6000

    move-object/from16 v12, p4

    goto :goto_9

    :cond_c
    and-int/lit16 v12, v1, 0x6000

    if-nez v12, :cond_e

    move-object/from16 v12, p4

    invoke-interface {v5, v12}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v26

    if-eqz v26, :cond_d

    move/from16 v26, v24

    goto :goto_8

    :cond_d
    move/from16 v26, v23

    :goto_8
    or-int v6, v6, v26

    goto :goto_9

    :cond_e
    move-object/from16 v12, p4

    :goto_9
    and-int/lit8 v26, v3, 0x20

    const/high16 v27, 0x30000

    if-eqz v26, :cond_f

    or-int v6, v6, v27

    move-object/from16 v13, p5

    goto :goto_b

    :cond_f
    and-int v27, v1, v27

    if-nez v27, :cond_11

    move-object/from16 v13, p5

    invoke-interface {v5, v13}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v28

    if-eqz v28, :cond_10

    const/high16 v28, 0x20000

    goto :goto_a

    :cond_10
    const/high16 v28, 0x10000

    :goto_a
    or-int v6, v6, v28

    goto :goto_b

    :cond_11
    move-object/from16 v13, p5

    :goto_b
    and-int/lit8 v28, v3, 0x40

    const/high16 v29, 0x180000

    if-eqz v28, :cond_12

    or-int v6, v6, v29

    move-object/from16 v4, p6

    goto :goto_d

    :cond_12
    and-int v29, v1, v29

    if-nez v29, :cond_14

    move-object/from16 v4, p6

    invoke-interface {v5, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v30

    if-eqz v30, :cond_13

    const/high16 v30, 0x100000

    goto :goto_c

    :cond_13
    const/high16 v30, 0x80000

    :goto_c
    or-int v6, v6, v30

    goto :goto_d

    :cond_14
    move-object/from16 v4, p6

    :goto_d
    and-int/lit16 v1, v3, 0x80

    const/high16 v30, 0xc00000

    if-eqz v1, :cond_15

    or-int v6, v6, v30

    move/from16 v30, v1

    move-object/from16 v1, p7

    goto :goto_f

    :cond_15
    and-int v30, p16, v30

    if-nez v30, :cond_17

    move/from16 v30, v1

    move-object/from16 v1, p7

    invoke-interface {v5, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v31

    if-eqz v31, :cond_16

    const/high16 v31, 0x800000

    goto :goto_e

    :cond_16
    const/high16 v31, 0x400000

    :goto_e
    or-int v6, v6, v31

    goto :goto_f

    :cond_17
    move/from16 v30, v1

    move-object/from16 v1, p7

    :goto_f
    and-int/lit16 v1, v3, 0x100

    const/high16 v31, 0x6000000

    if-eqz v1, :cond_18

    or-int v6, v6, v31

    move/from16 v31, v1

    move-object/from16 v1, p8

    goto :goto_11

    :cond_18
    and-int v31, p16, v31

    if-nez v31, :cond_1a

    move/from16 v31, v1

    move-object/from16 v1, p8

    invoke-interface {v5, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v32

    if-eqz v32, :cond_19

    const/high16 v32, 0x4000000

    goto :goto_10

    :cond_19
    const/high16 v32, 0x2000000

    :goto_10
    or-int v6, v6, v32

    goto :goto_11

    :cond_1a
    move/from16 v31, v1

    move-object/from16 v1, p8

    :goto_11
    and-int/lit16 v1, v3, 0x200

    const/high16 v32, 0x30000000

    if-eqz v1, :cond_1b

    or-int v6, v6, v32

    move/from16 v32, v1

    move-object/from16 v1, p9

    goto :goto_13

    :cond_1b
    and-int v32, p16, v32

    if-nez v32, :cond_1d

    move/from16 v32, v1

    move-object/from16 v1, p9

    invoke-interface {v5, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v33

    if-eqz v33, :cond_1c

    const/high16 v33, 0x20000000

    goto :goto_12

    :cond_1c
    const/high16 v33, 0x10000000

    :goto_12
    or-int v6, v6, v33

    goto :goto_13

    :cond_1d
    move/from16 v32, v1

    move-object/from16 v1, p9

    :goto_13
    and-int/lit16 v1, v3, 0x400

    if-eqz v1, :cond_1e

    or-int/lit8 v7, v7, 0x6

    move/from16 v33, v1

    move-object/from16 v1, p10

    goto :goto_15

    :cond_1e
    and-int/lit8 v33, v2, 0x6

    if-nez v33, :cond_20

    move/from16 v33, v1

    move-object/from16 v1, p10

    invoke-interface {v5, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v34

    if-eqz v34, :cond_1f

    const/16 v21, 0x4

    goto :goto_14

    :cond_1f
    const/16 v21, 0x2

    :goto_14
    or-int v7, v7, v21

    goto :goto_15

    :cond_20
    move/from16 v33, v1

    move-object/from16 v1, p10

    :goto_15
    and-int/lit16 v1, v3, 0x800

    if-eqz v1, :cond_21

    or-int/lit8 v7, v7, 0x30

    move/from16 v21, v1

    move-object/from16 v1, p11

    goto :goto_17

    :cond_21
    and-int/lit8 v21, v2, 0x30

    if-nez v21, :cond_23

    move/from16 v21, v1

    move-object/from16 v1, p11

    invoke-interface {v5, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v34

    if-eqz v34, :cond_22

    const/16 v25, 0x20

    goto :goto_16

    :cond_22
    const/16 v25, 0x10

    :goto_16
    or-int v7, v7, v25

    goto :goto_17

    :cond_23
    move/from16 v21, v1

    move-object/from16 v1, p11

    :goto_17
    and-int/lit16 v1, v3, 0x1000

    if-eqz v1, :cond_24

    or-int/lit16 v7, v7, 0x180

    move/from16 v25, v1

    move-object/from16 v1, p12

    goto :goto_19

    :cond_24
    move/from16 v25, v1

    and-int/lit16 v1, v2, 0x180

    if-nez v1, :cond_26

    move-object/from16 v1, p12

    invoke-interface {v5, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v27

    if-eqz v27, :cond_25

    goto :goto_18

    :cond_25
    move/from16 v16, v17

    :goto_18
    or-int v7, v7, v16

    goto :goto_19

    :cond_26
    move-object/from16 v1, p12

    :goto_19
    and-int/lit16 v1, v3, 0x2000

    if-eqz v1, :cond_27

    or-int/lit16 v7, v7, 0xc00

    move/from16 v16, v1

    goto :goto_1c

    :cond_27
    move/from16 v16, v1

    and-int/lit16 v1, v2, 0xc00

    if-nez v1, :cond_2a

    and-int/lit16 v1, v2, 0x1000

    if-nez v1, :cond_28

    invoke-interface {v5, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v1

    goto :goto_1a

    :cond_28
    invoke-interface {v5, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v1

    :goto_1a
    if-eqz v1, :cond_29

    goto :goto_1b

    :cond_29
    move/from16 v19, v20

    :goto_1b
    or-int v7, v7, v19

    :cond_2a
    :goto_1c
    and-int/lit16 v1, v2, 0x6000

    if-nez v1, :cond_2d

    and-int/lit16 v1, v3, 0x4000

    if-nez v1, :cond_2b

    move-object/from16 v1, p14

    invoke-interface {v5, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_2c

    move/from16 v23, v24

    goto :goto_1d

    :cond_2b
    move-object/from16 v1, p14

    :cond_2c
    :goto_1d
    or-int v7, v7, v23

    goto :goto_1e

    :cond_2d
    move-object/from16 v1, p14

    :goto_1e
    const v17, 0x12492493

    and-int v0, v6, v17

    const v1, 0x12492492

    if-ne v0, v1, :cond_2f

    and-int/lit16 v0, v7, 0x2493

    const/16 v1, 0x2492

    if-eq v0, v1, :cond_2e

    goto :goto_1f

    :cond_2e
    const/4 v0, 0x0

    goto :goto_20

    :cond_2f
    :goto_1f
    const/4 v0, 0x1

    :goto_20
    and-int/lit8 v1, v6, 0x1

    invoke-interface {v5, v0, v1}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v0

    if-eqz v0, :cond_43

    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->startDefaults()V

    const-string v0, "191@11610L21"

    invoke-static {v5, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 v0, p16, 0x1

    if-eqz v0, :cond_32

    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    move-result v0

    if-eqz v0, :cond_30

    goto :goto_21

    .line 192
    :cond_30
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    and-int/lit16 v0, v3, 0x4000

    if-eqz v0, :cond_31

    const v0, -0xe001

    and-int/2addr v0, v7

    move-object/from16 v15, p10

    move-object/from16 v16, p11

    move-object/from16 v18, p12

    move-object/from16 v19, p13

    move-object/from16 v20, p14

    move v2, v0

    move-object v11, v4

    move v7, v9

    move v8, v10

    move-object v9, v12

    move-object v10, v13

    move-object/from16 v12, p7

    move-object/from16 v13, p8

    move-object/from16 v0, p9

    .end local v7    # "$dirty1":I
    .local v0, "$dirty1":I
    goto/16 :goto_2c

    .end local v0    # "$dirty1":I
    .restart local v7    # "$dirty1":I
    :cond_31
    move-object/from16 v0, p9

    move-object/from16 v15, p10

    move-object/from16 v16, p11

    move-object/from16 v18, p12

    move-object/from16 v19, p13

    move-object/from16 v20, p14

    move-object v11, v4

    move v2, v7

    move v7, v9

    move v8, v10

    move-object v9, v12

    move-object v10, v13

    move-object/from16 v12, p7

    move-object/from16 v13, p8

    goto/16 :goto_2c

    .line 195
    :cond_32
    :goto_21
    if-eqz v11, :cond_33

    .line 179
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v0, Landroidx/compose/ui/Modifier;

    move-object v14, v0

    .end local p1    # "modifier":Landroidx/compose/ui/Modifier;
    .local v14, "modifier":Landroidx/compose/ui/Modifier;
    :cond_33
    if-eqz v15, :cond_34

    .line 180
    const/4 v0, 0x1

    .end local p2    # "enabled":Z
    .local v0, "enabled":Z
    goto :goto_22

    .line 179
    .end local v0    # "enabled":Z
    .restart local p2    # "enabled":Z
    :cond_34
    move v0, v9

    .line 180
    .end local p2    # "enabled":Z
    .restart local v0    # "enabled":Z
    :goto_22
    if-eqz v18, :cond_35

    .line 181
    const/4 v1, 0x0

    .end local p3    # "readOnly":Z
    .local v1, "readOnly":Z
    goto :goto_23

    .line 180
    .end local v1    # "readOnly":Z
    .restart local p3    # "readOnly":Z
    :cond_35
    move v1, v10

    .line 181
    .end local p3    # "readOnly":Z
    .restart local v1    # "readOnly":Z
    :goto_23
    if-eqz v22, :cond_36

    .line 182
    const/4 v9, 0x0

    .end local p4    # "inputTransformation":Landroidx/compose/foundation/text/input/InputTransformation;
    .local v9, "inputTransformation":Landroidx/compose/foundation/text/input/InputTransformation;
    goto :goto_24

    .line 181
    .end local v9    # "inputTransformation":Landroidx/compose/foundation/text/input/InputTransformation;
    .restart local p4    # "inputTransformation":Landroidx/compose/foundation/text/input/InputTransformation;
    :cond_36
    move-object v9, v12

    .line 182
    .end local p4    # "inputTransformation":Landroidx/compose/foundation/text/input/InputTransformation;
    .restart local v9    # "inputTransformation":Landroidx/compose/foundation/text/input/InputTransformation;
    :goto_24
    if-eqz v26, :cond_37

    .line 183
    sget-object v10, Landroidx/compose/ui/text/TextStyle;->Companion:Landroidx/compose/ui/text/TextStyle$Companion;

    invoke-virtual {v10}, Landroidx/compose/ui/text/TextStyle$Companion;->getDefault()Landroidx/compose/ui/text/TextStyle;

    move-result-object v10

    move-object v13, v10

    .end local p5    # "textStyle":Landroidx/compose/ui/text/TextStyle;
    .local v13, "textStyle":Landroidx/compose/ui/text/TextStyle;
    :cond_37
    if-eqz v28, :cond_38

    .line 184
    sget-object v10, Landroidx/compose/foundation/text/KeyboardOptions;->Companion:Landroidx/compose/foundation/text/KeyboardOptions$Companion;

    invoke-virtual {v10}, Landroidx/compose/foundation/text/KeyboardOptions$Companion;->getDefault()Landroidx/compose/foundation/text/KeyboardOptions;

    move-result-object v4

    .end local p6    # "keyboardOptions":Landroidx/compose/foundation/text/KeyboardOptions;
    .local v4, "keyboardOptions":Landroidx/compose/foundation/text/KeyboardOptions;
    :cond_38
    if-eqz v30, :cond_39

    .line 185
    const/4 v10, 0x0

    .end local p7    # "onKeyboardAction":Landroidx/compose/foundation/text/input/KeyboardActionHandler;
    .local v10, "onKeyboardAction":Landroidx/compose/foundation/text/input/KeyboardActionHandler;
    goto :goto_25

    .line 184
    .end local v10    # "onKeyboardAction":Landroidx/compose/foundation/text/input/KeyboardActionHandler;
    .restart local p7    # "onKeyboardAction":Landroidx/compose/foundation/text/input/KeyboardActionHandler;
    :cond_39
    move-object/from16 v10, p7

    .line 185
    .end local p7    # "onKeyboardAction":Landroidx/compose/foundation/text/input/KeyboardActionHandler;
    .restart local v10    # "onKeyboardAction":Landroidx/compose/foundation/text/input/KeyboardActionHandler;
    :goto_25
    if-eqz v31, :cond_3a

    .line 186
    sget-object v11, Landroidx/compose/foundation/text/input/TextFieldLineLimits;->Companion:Landroidx/compose/foundation/text/input/TextFieldLineLimits$Companion;

    invoke-virtual {v11}, Landroidx/compose/foundation/text/input/TextFieldLineLimits$Companion;->getDefault()Landroidx/compose/foundation/text/input/TextFieldLineLimits;

    move-result-object v11

    .end local p8    # "lineLimits":Landroidx/compose/foundation/text/input/TextFieldLineLimits;
    .local v11, "lineLimits":Landroidx/compose/foundation/text/input/TextFieldLineLimits;
    goto :goto_26

    .line 185
    .end local v11    # "lineLimits":Landroidx/compose/foundation/text/input/TextFieldLineLimits;
    .restart local p8    # "lineLimits":Landroidx/compose/foundation/text/input/TextFieldLineLimits;
    :cond_3a
    move-object/from16 v11, p8

    .line 186
    .end local p8    # "lineLimits":Landroidx/compose/foundation/text/input/TextFieldLineLimits;
    .restart local v11    # "lineLimits":Landroidx/compose/foundation/text/input/TextFieldLineLimits;
    :goto_26
    if-eqz v32, :cond_3b

    .line 187
    const/4 v12, 0x0

    .end local p9    # "onTextLayout":Lkotlin/jvm/functions/Function2;
    .local v12, "onTextLayout":Lkotlin/jvm/functions/Function2;
    goto :goto_27

    .line 186
    .end local v12    # "onTextLayout":Lkotlin/jvm/functions/Function2;
    .restart local p9    # "onTextLayout":Lkotlin/jvm/functions/Function2;
    :cond_3b
    move-object/from16 v12, p9

    .line 187
    .end local p9    # "onTextLayout":Lkotlin/jvm/functions/Function2;
    .restart local v12    # "onTextLayout":Lkotlin/jvm/functions/Function2;
    :goto_27
    if-eqz v33, :cond_3c

    .line 188
    const/4 v15, 0x0

    .end local p10    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .local v15, "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    goto :goto_28

    .line 187
    .end local v15    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .restart local p10    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    :cond_3c
    move-object/from16 v15, p10

    .line 188
    .end local p10    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .restart local v15    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    :goto_28
    if-eqz v21, :cond_3d

    .line 189
    sget-object v17, Landroidx/compose/foundation/text/BasicTextFieldDefaults;->INSTANCE:Landroidx/compose/foundation/text/BasicTextFieldDefaults;

    invoke-virtual/range {v17 .. v17}, Landroidx/compose/foundation/text/BasicTextFieldDefaults;->getCursorBrush()Landroidx/compose/ui/graphics/SolidColor;

    move-result-object v17

    check-cast v17, Landroidx/compose/ui/graphics/Brush;

    .end local p11    # "cursorBrush":Landroidx/compose/ui/graphics/Brush;
    .local v17, "cursorBrush":Landroidx/compose/ui/graphics/Brush;
    goto :goto_29

    .line 188
    .end local v17    # "cursorBrush":Landroidx/compose/ui/graphics/Brush;
    .restart local p11    # "cursorBrush":Landroidx/compose/ui/graphics/Brush;
    :cond_3d
    move-object/from16 v17, p11

    .line 189
    .end local p11    # "cursorBrush":Landroidx/compose/ui/graphics/Brush;
    .restart local v17    # "cursorBrush":Landroidx/compose/ui/graphics/Brush;
    :goto_29
    if-eqz v25, :cond_3e

    .line 190
    const/16 v18, 0x0

    .end local p12    # "outputTransformation":Landroidx/compose/foundation/text/input/OutputTransformation;
    .local v18, "outputTransformation":Landroidx/compose/foundation/text/input/OutputTransformation;
    goto :goto_2a

    .line 189
    .end local v18    # "outputTransformation":Landroidx/compose/foundation/text/input/OutputTransformation;
    .restart local p12    # "outputTransformation":Landroidx/compose/foundation/text/input/OutputTransformation;
    :cond_3e
    move-object/from16 v18, p12

    .line 190
    .end local p12    # "outputTransformation":Landroidx/compose/foundation/text/input/OutputTransformation;
    .restart local v18    # "outputTransformation":Landroidx/compose/foundation/text/input/OutputTransformation;
    :goto_2a
    if-eqz v16, :cond_3f

    .line 191
    const/16 v16, 0x0

    .end local p13    # "decorator":Landroidx/compose/foundation/text/input/TextFieldDecorator;
    .local v16, "decorator":Landroidx/compose/foundation/text/input/TextFieldDecorator;
    goto :goto_2b

    .line 190
    .end local v16    # "decorator":Landroidx/compose/foundation/text/input/TextFieldDecorator;
    .restart local p13    # "decorator":Landroidx/compose/foundation/text/input/TextFieldDecorator;
    :cond_3f
    move-object/from16 v16, p13

    .line 191
    .end local p13    # "decorator":Landroidx/compose/foundation/text/input/TextFieldDecorator;
    .restart local v16    # "decorator":Landroidx/compose/foundation/text/input/TextFieldDecorator;
    :goto_2b
    and-int/lit16 v2, v3, 0x4000

    if-eqz v2, :cond_40

    .line 192
    move/from16 p1, v0

    const/4 v0, 0x1

    const/4 v2, 0x0

    .end local v0    # "enabled":Z
    .local p1, "enabled":Z
    invoke-static {v2, v5, v2, v0}, Landroidx/compose/foundation/ScrollKt;->rememberScrollState(ILandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/ScrollState;

    move-result-object v0

    .end local p14    # "scrollState":Landroidx/compose/foundation/ScrollState;
    .local v0, "scrollState":Landroidx/compose/foundation/ScrollState;
    const v2, -0xe001

    and-int/2addr v2, v7

    move/from16 v7, p1

    move-object/from16 v20, v0

    move v8, v1

    move-object v0, v12

    move-object/from16 v19, v16

    move-object/from16 v16, v17

    move-object v12, v10

    move-object v10, v13

    move-object v13, v11

    move-object v11, v4

    .end local v7    # "$dirty1":I
    .local v2, "$dirty1":I
    goto :goto_2c

    .line 191
    .end local v2    # "$dirty1":I
    .end local p1    # "enabled":Z
    .local v0, "enabled":Z
    .restart local v7    # "$dirty1":I
    .restart local p14    # "scrollState":Landroidx/compose/foundation/ScrollState;
    :cond_40
    move/from16 p1, v0

    .end local v0    # "enabled":Z
    .restart local p1    # "enabled":Z
    move-object/from16 v20, p14

    move v8, v1

    move v2, v7

    move-object v0, v12

    move-object/from16 v19, v16

    move-object/from16 v16, v17

    move/from16 v7, p1

    move-object v12, v10

    move-object v10, v13

    move-object v13, v11

    move-object v11, v4

    .line 192
    .end local v1    # "readOnly":Z
    .end local v4    # "keyboardOptions":Landroidx/compose/foundation/text/KeyboardOptions;
    .end local v17    # "cursorBrush":Landroidx/compose/ui/graphics/Brush;
    .end local p1    # "enabled":Z
    .end local p14    # "scrollState":Landroidx/compose/foundation/ScrollState;
    .local v0, "onTextLayout":Lkotlin/jvm/functions/Function2;
    .restart local v2    # "$dirty1":I
    .local v7, "enabled":Z
    .local v8, "readOnly":Z
    .local v10, "textStyle":Landroidx/compose/ui/text/TextStyle;
    .local v11, "keyboardOptions":Landroidx/compose/foundation/text/KeyboardOptions;
    .local v12, "onKeyboardAction":Landroidx/compose/foundation/text/input/KeyboardActionHandler;
    .local v13, "lineLimits":Landroidx/compose/foundation/text/input/TextFieldLineLimits;
    .local v16, "cursorBrush":Landroidx/compose/ui/graphics/Brush;
    .local v19, "decorator":Landroidx/compose/foundation/text/input/TextFieldDecorator;
    .local v20, "scrollState":Landroidx/compose/foundation/ScrollState;
    :goto_2c
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endDefaults()V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_41

    .line 195
    const-string v1, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:194)"

    const v4, 0x1bfb15b1

    invoke-static {v4, v6, v2, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 197
    :cond_41
    nop

    .line 198
    nop

    .line 199
    nop

    .line 200
    nop

    .line 201
    nop

    .line 202
    nop

    .line 203
    nop

    .line 204
    nop

    .line 205
    nop

    .line 206
    nop

    .line 207
    nop

    .line 208
    nop

    .line 209
    nop

    .line 210
    nop

    .line 211
    nop

    .line 212
    and-int/lit8 v1, v6, 0xe

    and-int/lit8 v4, v6, 0x70

    or-int/2addr v1, v4

    and-int/lit16 v4, v6, 0x380

    or-int/2addr v1, v4

    and-int/lit16 v4, v6, 0x1c00

    or-int/2addr v1, v4

    const v4, 0xe000

    and-int/2addr v4, v6

    or-int/2addr v1, v4

    const/high16 v4, 0x70000

    and-int/2addr v4, v6

    or-int/2addr v1, v4

    const/high16 v4, 0x380000

    and-int/2addr v4, v6

    or-int/2addr v1, v4

    const/high16 v4, 0x1c00000

    and-int/2addr v4, v6

    or-int/2addr v1, v4

    const/high16 v4, 0xe000000

    and-int/2addr v4, v6

    or-int/2addr v1, v4

    const/high16 v4, 0x70000000

    and-int/2addr v4, v6

    or-int v23, v1, v4

    and-int/lit8 v1, v2, 0xe

    or-int/lit16 v1, v1, 0x180

    and-int/lit8 v4, v2, 0x70

    or-int/2addr v1, v4

    shl-int/lit8 v4, v2, 0x3

    and-int/lit16 v4, v4, 0x1c00

    or-int/2addr v1, v4

    shl-int/lit8 v4, v2, 0x3

    const v17, 0xe000

    and-int v4, v4, v17

    or-int/2addr v1, v4

    const/high16 v4, 0x70000

    shl-int/lit8 v17, v2, 0x3

    and-int v4, v17, v4

    or-int v24, v1, v4

    .line 196
    const/16 v17, 0x0

    const/16 v21, 0x0

    const/high16 v25, 0x10000

    move-object/from16 v22, v5

    move/from16 v26, v6

    move-object v6, v14

    move-object/from16 v5, p0

    move-object v14, v0

    .end local v0    # "onTextLayout":Lkotlin/jvm/functions/Function2;
    .end local v5    # "$composer":Landroidx/compose/runtime/Composer;
    .local v6, "modifier":Landroidx/compose/ui/Modifier;
    .local v14, "onTextLayout":Lkotlin/jvm/functions/Function2;
    .local v22, "$composer":Landroidx/compose/runtime/Composer;
    .local v26, "$dirty":I
    invoke-static/range {v5 .. v25}, Landroidx/compose/foundation/text/BasicTextFieldKt;->BasicTextField(Landroidx/compose/foundation/text/input/TextFieldState;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/foundation/text/input/InputTransformation;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/input/KeyboardActionHandler;Landroidx/compose/foundation/text/input/TextFieldLineLimits;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/foundation/text/input/internal/CodepointTransformation;Landroidx/compose/foundation/text/input/OutputTransformation;Landroidx/compose/foundation/text/input/TextFieldDecorator;Landroidx/compose/foundation/ScrollState;ZLandroidx/compose/runtime/Composer;III)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_42

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 214
    :cond_42
    move-object/from16 v3, v19

    move/from16 v19, v2

    move-object v2, v6

    move-object v6, v10

    move-object v10, v14

    move-object v14, v3

    move v3, v7

    move v4, v8

    move-object v5, v9

    move-object v7, v11

    move-object v8, v12

    move-object v9, v13

    move-object v11, v15

    move-object/from16 v12, v16

    move-object/from16 v13, v18

    move-object/from16 v15, v20

    goto :goto_2d

    .end local v2    # "$dirty1":I
    .end local v8    # "readOnly":Z
    .end local v9    # "inputTransformation":Landroidx/compose/foundation/text/input/InputTransformation;
    .end local v10    # "textStyle":Landroidx/compose/ui/text/TextStyle;
    .end local v11    # "keyboardOptions":Landroidx/compose/foundation/text/KeyboardOptions;
    .end local v12    # "onKeyboardAction":Landroidx/compose/foundation/text/input/KeyboardActionHandler;
    .end local v13    # "lineLimits":Landroidx/compose/foundation/text/input/TextFieldLineLimits;
    .end local v14    # "onTextLayout":Lkotlin/jvm/functions/Function2;
    .end local v15    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .end local v16    # "cursorBrush":Landroidx/compose/ui/graphics/Brush;
    .end local v18    # "outputTransformation":Landroidx/compose/foundation/text/input/OutputTransformation;
    .end local v19    # "decorator":Landroidx/compose/foundation/text/input/TextFieldDecorator;
    .end local v20    # "scrollState":Landroidx/compose/foundation/ScrollState;
    .end local v22    # "$composer":Landroidx/compose/runtime/Composer;
    .end local v26    # "$dirty":I
    .restart local v5    # "$composer":Landroidx/compose/runtime/Composer;
    .local v6, "$dirty":I
    .local v7, "$dirty1":I
    .local p1, "modifier":Landroidx/compose/ui/Modifier;
    .restart local p2    # "enabled":Z
    .restart local p3    # "readOnly":Z
    .restart local p4    # "inputTransformation":Landroidx/compose/foundation/text/input/InputTransformation;
    .restart local p5    # "textStyle":Landroidx/compose/ui/text/TextStyle;
    .restart local p6    # "keyboardOptions":Landroidx/compose/foundation/text/KeyboardOptions;
    .restart local p7    # "onKeyboardAction":Landroidx/compose/foundation/text/input/KeyboardActionHandler;
    .restart local p8    # "lineLimits":Landroidx/compose/foundation/text/input/TextFieldLineLimits;
    .restart local p9    # "onTextLayout":Lkotlin/jvm/functions/Function2;
    .restart local p10    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .restart local p11    # "cursorBrush":Landroidx/compose/ui/graphics/Brush;
    .restart local p12    # "outputTransformation":Landroidx/compose/foundation/text/input/OutputTransformation;
    .restart local p13    # "decorator":Landroidx/compose/foundation/text/input/TextFieldDecorator;
    .restart local p14    # "scrollState":Landroidx/compose/foundation/ScrollState;
    :cond_43
    move-object/from16 v22, v5

    move/from16 v26, v6

    .end local v5    # "$composer":Landroidx/compose/runtime/Composer;
    .end local v6    # "$dirty":I
    .restart local v22    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v26    # "$dirty":I
    invoke-interface/range {v22 .. v22}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object/from16 v8, p7

    move-object/from16 v11, p10

    move-object/from16 v15, p14

    move/from16 v19, v7

    move v3, v9

    move-object v5, v12

    move-object v6, v13

    move-object v2, v14

    move-object/from16 v9, p8

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object v7, v4

    move v4, v10

    move-object/from16 v10, p9

    .end local p1    # "modifier":Landroidx/compose/ui/Modifier;
    .end local p2    # "enabled":Z
    .end local p3    # "readOnly":Z
    .end local p4    # "inputTransformation":Landroidx/compose/foundation/text/input/InputTransformation;
    .end local p5    # "textStyle":Landroidx/compose/ui/text/TextStyle;
    .end local p6    # "keyboardOptions":Landroidx/compose/foundation/text/KeyboardOptions;
    .end local p7    # "onKeyboardAction":Landroidx/compose/foundation/text/input/KeyboardActionHandler;
    .end local p8    # "lineLimits":Landroidx/compose/foundation/text/input/TextFieldLineLimits;
    .end local p9    # "onTextLayout":Lkotlin/jvm/functions/Function2;
    .end local p10    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .end local p11    # "cursorBrush":Landroidx/compose/ui/graphics/Brush;
    .end local p12    # "outputTransformation":Landroidx/compose/foundation/text/input/OutputTransformation;
    .end local p13    # "decorator":Landroidx/compose/foundation/text/input/TextFieldDecorator;
    .end local p14    # "scrollState":Landroidx/compose/foundation/ScrollState;
    .local v2, "modifier":Landroidx/compose/ui/Modifier;
    .local v3, "enabled":Z
    .local v4, "readOnly":Z
    .local v5, "inputTransformation":Landroidx/compose/foundation/text/input/InputTransformation;
    .local v6, "textStyle":Landroidx/compose/ui/text/TextStyle;
    .local v7, "keyboardOptions":Landroidx/compose/foundation/text/KeyboardOptions;
    .local v8, "onKeyboardAction":Landroidx/compose/foundation/text/input/KeyboardActionHandler;
    .local v9, "lineLimits":Landroidx/compose/foundation/text/input/TextFieldLineLimits;
    .local v10, "onTextLayout":Lkotlin/jvm/functions/Function2;
    .local v11, "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .local v12, "cursorBrush":Landroidx/compose/ui/graphics/Brush;
    .local v13, "outputTransformation":Landroidx/compose/foundation/text/input/OutputTransformation;
    .local v14, "decorator":Landroidx/compose/foundation/text/input/TextFieldDecorator;
    .local v15, "scrollState":Landroidx/compose/foundation/ScrollState;
    .local v19, "$dirty1":I
    :goto_2d
    invoke-interface/range {v22 .. v22}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v0

    if-eqz v0, :cond_44

    move-object v1, v0

    new-instance v0, Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$1;

    move/from16 v16, p16

    move/from16 v17, p17

    move/from16 v18, p18

    move-object/from16 v35, v1

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v18}, Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$1;-><init>(Landroidx/compose/foundation/text/input/TextFieldState;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/foundation/text/input/InputTransformation;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/input/KeyboardActionHandler;Landroidx/compose/foundation/text/input/TextFieldLineLimits;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/foundation/text/input/OutputTransformation;Landroidx/compose/foundation/text/input/TextFieldDecorator;Landroidx/compose/foundation/ScrollState;III)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    move-object/from16 v1, v35

    invoke-interface {v1, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_44
    return-void
.end method

.method public static final BasicTextField(Landroidx/compose/foundation/text/input/TextFieldState;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/foundation/text/input/InputTransformation;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/input/KeyboardActionHandler;Landroidx/compose/foundation/text/input/TextFieldLineLimits;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/foundation/text/input/internal/CodepointTransformation;Landroidx/compose/foundation/text/input/OutputTransformation;Landroidx/compose/foundation/text/input/TextFieldDecorator;Landroidx/compose/foundation/ScrollState;ZLandroidx/compose/runtime/Composer;III)V
    .locals 56
    .param p0, "state"    # Landroidx/compose/foundation/text/input/TextFieldState;
    .param p1, "modifier"    # Landroidx/compose/ui/Modifier;
    .param p2, "enabled"    # Z
    .param p3, "readOnly"    # Z
    .param p4, "inputTransformation"    # Landroidx/compose/foundation/text/input/InputTransformation;
    .param p5, "textStyle"    # Landroidx/compose/ui/text/TextStyle;
    .param p6, "keyboardOptions"    # Landroidx/compose/foundation/text/KeyboardOptions;
    .param p7, "onKeyboardAction"    # Landroidx/compose/foundation/text/input/KeyboardActionHandler;
    .param p8, "lineLimits"    # Landroidx/compose/foundation/text/input/TextFieldLineLimits;
    .param p9, "onTextLayout"    # Lkotlin/jvm/functions/Function2;
    .param p10, "interactionSource"    # Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .param p11, "cursorBrush"    # Landroidx/compose/ui/graphics/Brush;
    .param p12, "codepointTransformation"    # Landroidx/compose/foundation/text/input/internal/CodepointTransformation;
    .param p13, "outputTransformation"    # Landroidx/compose/foundation/text/input/OutputTransformation;
    .param p14, "decorator"    # Landroidx/compose/foundation/text/input/TextFieldDecorator;
    .param p15, "scrollState"    # Landroidx/compose/foundation/ScrollState;
    .param p16, "isPassword"    # Z
    .param p17, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p18, "$changed"    # I
    .param p19, "$changed1"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/text/input/TextFieldState;",
            "Landroidx/compose/ui/Modifier;",
            "ZZ",
            "Landroidx/compose/foundation/text/input/InputTransformation;",
            "Landroidx/compose/ui/text/TextStyle;",
            "Landroidx/compose/foundation/text/KeyboardOptions;",
            "Landroidx/compose/foundation/text/input/KeyboardActionHandler;",
            "Landroidx/compose/foundation/text/input/TextFieldLineLimits;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/ui/unit/Density;",
            "-",
            "Lkotlin/jvm/functions/Function0<",
            "Landroidx/compose/ui/text/TextLayoutResult;",
            ">;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
            "Landroidx/compose/ui/graphics/Brush;",
            "Landroidx/compose/foundation/text/input/internal/CodepointTransformation;",
            "Landroidx/compose/foundation/text/input/OutputTransformation;",
            "Landroidx/compose/foundation/text/input/TextFieldDecorator;",
            "Landroidx/compose/foundation/ScrollState;",
            "Z",
            "Landroidx/compose/runtime/Composer;",
            "III)V"
        }
    .end annotation

    .line 245
    move-object/from16 v1, p0

    move-object/from16 v0, p14

    move/from16 v2, p18

    move/from16 v3, p19

    move/from16 v4, p20

    const v5, 0x398702f5

    move-object/from16 v6, p17

    invoke-interface {v6, v5}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v5

    .end local p17    # "$composer":Landroidx/compose/runtime/Composer;
    .local v5, "$composer":Landroidx/compose/runtime/Composer;
    const-string v6, "C(BasicTextField)P(15,9,3,13,4,16,7,10,8,11,5,1!1,12!1,14)245@13732L7,246@13787L7,247@13832L7,253@14202L25,254@14276L25,256@14396L107,261@14540L845,279@15583L48,287@15976L397,298@16399L24,299@16476L7,300@16526L7,301@16580L7,304@16626L2068,348@18711L509,348@18700L520,364@19268L51,364@19226L93,389@20448L1339,429@22642L3263:BasicTextField.kt#423gt5"

    invoke-static {v5, v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    move/from16 v6, p18

    .local v6, "$dirty":I
    move/from16 v7, p19

    .local v7, "$dirty1":I
    and-int/lit8 v8, v4, 0x1

    if-eqz v8, :cond_0

    or-int/lit8 v6, v6, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v8, v2, 0x6

    if-nez v8, :cond_2

    invoke-interface {v5, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1

    const/4 v8, 0x4

    goto :goto_0

    :cond_1
    const/4 v8, 0x2

    :goto_0
    or-int/2addr v6, v8

    :cond_2
    :goto_1
    and-int/lit8 v8, v4, 0x2

    if-eqz v8, :cond_3

    or-int/lit8 v6, v6, 0x30

    move-object/from16 v13, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v13, v2, 0x30

    if-nez v13, :cond_5

    move-object/from16 v13, p1

    invoke-interface {v5, v13}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_4

    const/16 v14, 0x20

    goto :goto_2

    :cond_4
    const/16 v14, 0x10

    :goto_2
    or-int/2addr v6, v14

    goto :goto_3

    :cond_5
    move-object/from16 v13, p1

    :goto_3
    and-int/lit8 v14, v4, 0x4

    if-eqz v14, :cond_6

    or-int/lit16 v6, v6, 0x180

    move/from16 v12, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v12, v2, 0x180

    if-nez v12, :cond_8

    move/from16 v12, p2

    invoke-interface {v5, v12}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v17

    if-eqz v17, :cond_7

    const/16 v17, 0x100

    goto :goto_4

    :cond_7
    const/16 v17, 0x80

    :goto_4
    or-int v6, v6, v17

    goto :goto_5

    :cond_8
    move/from16 v12, p2

    :goto_5
    and-int/lit8 v17, v4, 0x8

    const/16 v18, 0x400

    if-eqz v17, :cond_9

    or-int/lit16 v6, v6, 0xc00

    move/from16 v15, p3

    goto :goto_7

    :cond_9
    and-int/lit16 v15, v2, 0xc00

    if-nez v15, :cond_b

    move/from16 v15, p3

    invoke-interface {v5, v15}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v21

    if-eqz v21, :cond_a

    const/16 v21, 0x800

    goto :goto_6

    :cond_a
    move/from16 v21, v18

    :goto_6
    or-int v6, v6, v21

    goto :goto_7

    :cond_b
    move/from16 v15, p3

    :goto_7
    and-int/lit8 v21, v4, 0x10

    if-eqz v21, :cond_c

    or-int/lit16 v6, v6, 0x6000

    move-object/from16 v11, p4

    goto :goto_9

    :cond_c
    and-int/lit16 v11, v2, 0x6000

    if-nez v11, :cond_e

    move-object/from16 v11, p4

    invoke-interface {v5, v11}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v24

    if-eqz v24, :cond_d

    const/16 v24, 0x4000

    goto :goto_8

    :cond_d
    const/16 v24, 0x2000

    :goto_8
    or-int v6, v6, v24

    goto :goto_9

    :cond_e
    move-object/from16 v11, p4

    :goto_9
    and-int/lit8 v24, v4, 0x20

    const/high16 v25, 0x30000

    if-eqz v24, :cond_f

    or-int v6, v6, v25

    move-object/from16 v9, p5

    goto :goto_b

    :cond_f
    and-int v25, v2, v25

    if-nez v25, :cond_11

    move-object/from16 v9, p5

    invoke-interface {v5, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v26

    if-eqz v26, :cond_10

    const/high16 v26, 0x20000

    goto :goto_a

    :cond_10
    const/high16 v26, 0x10000

    :goto_a
    or-int v6, v6, v26

    goto :goto_b

    :cond_11
    move-object/from16 v9, p5

    :goto_b
    and-int/lit8 v26, v4, 0x40

    const/high16 v27, 0x180000

    if-eqz v26, :cond_12

    or-int v6, v6, v27

    move-object/from16 v10, p6

    goto :goto_d

    :cond_12
    and-int v28, v2, v27

    if-nez v28, :cond_14

    move-object/from16 v10, p6

    invoke-interface {v5, v10}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v29

    if-eqz v29, :cond_13

    const/high16 v29, 0x100000

    goto :goto_c

    :cond_13
    const/high16 v29, 0x80000

    :goto_c
    or-int v6, v6, v29

    goto :goto_d

    :cond_14
    move-object/from16 v10, p6

    :goto_d
    and-int/lit16 v2, v4, 0x80

    const/high16 v29, 0xc00000

    if-eqz v2, :cond_15

    or-int v6, v6, v29

    move/from16 v29, v2

    move-object/from16 v2, p7

    goto :goto_f

    :cond_15
    and-int v29, p18, v29

    if-nez v29, :cond_17

    move/from16 v29, v2

    move-object/from16 v2, p7

    invoke-interface {v5, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v30

    if-eqz v30, :cond_16

    const/high16 v30, 0x800000

    goto :goto_e

    :cond_16
    const/high16 v30, 0x400000

    :goto_e
    or-int v6, v6, v30

    goto :goto_f

    :cond_17
    move/from16 v29, v2

    move-object/from16 v2, p7

    :goto_f
    and-int/lit16 v2, v4, 0x100

    const/high16 v30, 0x6000000

    if-eqz v2, :cond_18

    or-int v6, v6, v30

    move/from16 v30, v2

    move-object/from16 v2, p8

    goto :goto_11

    :cond_18
    and-int v30, p18, v30

    if-nez v30, :cond_1a

    move/from16 v30, v2

    move-object/from16 v2, p8

    invoke-interface {v5, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v31

    if-eqz v31, :cond_19

    const/high16 v31, 0x4000000

    goto :goto_10

    :cond_19
    const/high16 v31, 0x2000000

    :goto_10
    or-int v6, v6, v31

    goto :goto_11

    :cond_1a
    move/from16 v30, v2

    move-object/from16 v2, p8

    :goto_11
    and-int/lit16 v2, v4, 0x200

    const/high16 v31, 0x30000000

    if-eqz v2, :cond_1b

    or-int v6, v6, v31

    move/from16 v31, v2

    move-object/from16 v2, p9

    goto :goto_13

    :cond_1b
    and-int v31, p18, v31

    if-nez v31, :cond_1d

    move/from16 v31, v2

    move-object/from16 v2, p9

    invoke-interface {v5, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v32

    if-eqz v32, :cond_1c

    const/high16 v32, 0x20000000

    goto :goto_12

    :cond_1c
    const/high16 v32, 0x10000000

    :goto_12
    or-int v6, v6, v32

    goto :goto_13

    :cond_1d
    move/from16 v31, v2

    move-object/from16 v2, p9

    :goto_13
    and-int/lit16 v2, v4, 0x400

    if-eqz v2, :cond_1e

    or-int/lit8 v7, v7, 0x6

    move/from16 v32, v2

    move-object/from16 v2, p10

    goto :goto_15

    :cond_1e
    and-int/lit8 v32, v3, 0x6

    if-nez v32, :cond_20

    move/from16 v32, v2

    move-object/from16 v2, p10

    invoke-interface {v5, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v33

    if-eqz v33, :cond_1f

    const/16 v33, 0x4

    goto :goto_14

    :cond_1f
    const/16 v33, 0x2

    :goto_14
    or-int v7, v7, v33

    goto :goto_15

    :cond_20
    move/from16 v32, v2

    move-object/from16 v2, p10

    :goto_15
    and-int/lit16 v2, v4, 0x800

    if-eqz v2, :cond_21

    or-int/lit8 v7, v7, 0x30

    move/from16 v33, v2

    move-object/from16 v2, p11

    goto :goto_17

    :cond_21
    and-int/lit8 v33, v3, 0x30

    if-nez v33, :cond_23

    move/from16 v33, v2

    move-object/from16 v2, p11

    invoke-interface {v5, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v34

    if-eqz v34, :cond_22

    const/16 v16, 0x20

    goto :goto_16

    :cond_22
    const/16 v16, 0x10

    :goto_16
    or-int v7, v7, v16

    goto :goto_17

    :cond_23
    move/from16 v33, v2

    move-object/from16 v2, p11

    :goto_17
    and-int/lit16 v2, v4, 0x1000

    if-eqz v2, :cond_24

    or-int/lit16 v7, v7, 0x180

    move/from16 v16, v2

    move-object/from16 v2, p12

    goto :goto_19

    :cond_24
    move/from16 v16, v2

    and-int/lit16 v2, v3, 0x180

    if-nez v2, :cond_26

    move-object/from16 v2, p12

    invoke-interface {v5, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v34

    if-eqz v34, :cond_25

    const/16 v19, 0x100

    goto :goto_18

    :cond_25
    const/16 v19, 0x80

    :goto_18
    or-int v7, v7, v19

    goto :goto_19

    :cond_26
    move-object/from16 v2, p12

    :goto_19
    and-int/lit16 v2, v4, 0x2000

    if-eqz v2, :cond_27

    or-int/lit16 v7, v7, 0xc00

    move/from16 v19, v2

    move-object/from16 v2, p13

    goto :goto_1a

    :cond_27
    move/from16 v19, v2

    and-int/lit16 v2, v3, 0xc00

    if-nez v2, :cond_29

    move-object/from16 v2, p13

    invoke-interface {v5, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v34

    if-eqz v34, :cond_28

    const/16 v18, 0x800

    :cond_28
    or-int v7, v7, v18

    goto :goto_1a

    :cond_29
    move-object/from16 v2, p13

    :goto_1a
    and-int/lit16 v2, v4, 0x4000

    const v18, 0x8000

    if-eqz v2, :cond_2a

    or-int/lit16 v7, v7, 0x6000

    move/from16 v34, v2

    goto :goto_1d

    :cond_2a
    move/from16 v34, v2

    and-int/lit16 v2, v3, 0x6000

    if-nez v2, :cond_2d

    and-int v2, v3, v18

    if-nez v2, :cond_2b

    invoke-interface {v5, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v2

    goto :goto_1b

    :cond_2b
    invoke-interface {v5, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v2

    :goto_1b
    if-eqz v2, :cond_2c

    const/16 v2, 0x4000

    goto :goto_1c

    :cond_2c
    const/16 v2, 0x2000

    :goto_1c
    or-int/2addr v7, v2

    :cond_2d
    :goto_1d
    const/high16 v2, 0x30000

    and-int/2addr v2, v3

    if-nez v2, :cond_30

    and-int v2, v4, v18

    if-nez v2, :cond_2e

    move-object/from16 v2, p15

    invoke-interface {v5, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v35

    if-eqz v35, :cond_2f

    const/high16 v35, 0x20000

    goto :goto_1e

    :cond_2e
    move-object/from16 v2, p15

    :cond_2f
    const/high16 v35, 0x10000

    :goto_1e
    or-int v7, v7, v35

    goto :goto_1f

    :cond_30
    move-object/from16 v2, p15

    :goto_1f
    const/high16 v35, 0x10000

    and-int v35, v4, v35

    if-eqz v35, :cond_31

    or-int v7, v7, v27

    move/from16 v0, p16

    goto :goto_21

    :cond_31
    and-int v27, v3, v27

    if-nez v27, :cond_33

    move/from16 v0, p16

    invoke-interface {v5, v0}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v27

    if-eqz v27, :cond_32

    const/high16 v27, 0x100000

    goto :goto_20

    :cond_32
    const/high16 v27, 0x80000

    :goto_20
    or-int v7, v7, v27

    goto :goto_21

    :cond_33
    move/from16 v0, p16

    :goto_21
    const v27, 0x12492493

    and-int v0, v6, v27

    const v2, 0x12492492

    const/4 v3, 0x1

    if-ne v0, v2, :cond_35

    const v0, 0x92493

    and-int/2addr v0, v7

    const v2, 0x92492

    if-eq v0, v2, :cond_34

    goto :goto_22

    :cond_34
    const/4 v0, 0x0

    goto :goto_23

    :cond_35
    :goto_22
    move v0, v3

    :goto_23
    and-int/lit8 v2, v6, 0x1

    invoke-interface {v5, v0, v2}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v0

    if-eqz v0, :cond_6f

    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->startDefaults()V

    const-string v0, "240@13526L21"

    invoke-static {v5, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 v0, p18, 0x1

    if-eqz v0, :cond_38

    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    move-result v0

    if-eqz v0, :cond_36

    goto :goto_24

    .line 242
    :cond_36
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    and-int v0, v4, v18

    if-eqz v0, :cond_37

    const v0, -0x70001

    and-int/2addr v7, v0

    :cond_37
    move-object/from16 v8, p7

    move-object/from16 v45, p9

    move-object/from16 v14, p10

    move-object/from16 v39, p11

    move-object/from16 v16, p12

    move-object/from16 v0, p13

    move-object/from16 v30, p14

    move-object/from16 v42, p15

    move-object/from16 v33, v9

    move-object v2, v10

    move/from16 v40, v12

    move/from16 v41, v15

    move-object/from16 v9, p8

    move v10, v7

    move/from16 v7, p16

    goto/16 :goto_30

    .line 245
    :cond_38
    :goto_24
    if-eqz v8, :cond_39

    .line 227
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v0, Landroidx/compose/ui/Modifier;

    move-object v13, v0

    .end local p1    # "modifier":Landroidx/compose/ui/Modifier;
    .local v13, "modifier":Landroidx/compose/ui/Modifier;
    :cond_39
    if-eqz v14, :cond_3a

    .line 228
    const/4 v0, 0x1

    move v12, v0

    .end local p2    # "enabled":Z
    .local v12, "enabled":Z
    :cond_3a
    if-eqz v17, :cond_3b

    .line 229
    const/4 v0, 0x0

    move v15, v0

    .end local p3    # "readOnly":Z
    .local v15, "readOnly":Z
    :cond_3b
    if-eqz v21, :cond_3c

    .line 230
    const/4 v0, 0x0

    move-object v11, v0

    .end local p4    # "inputTransformation":Landroidx/compose/foundation/text/input/InputTransformation;
    .local v11, "inputTransformation":Landroidx/compose/foundation/text/input/InputTransformation;
    :cond_3c
    if-eqz v24, :cond_3d

    .line 231
    sget-object v0, Landroidx/compose/ui/text/TextStyle;->Companion:Landroidx/compose/ui/text/TextStyle$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/text/TextStyle$Companion;->getDefault()Landroidx/compose/ui/text/TextStyle;

    move-result-object v0

    .end local p5    # "textStyle":Landroidx/compose/ui/text/TextStyle;
    .local v0, "textStyle":Landroidx/compose/ui/text/TextStyle;
    goto :goto_25

    .line 230
    .end local v0    # "textStyle":Landroidx/compose/ui/text/TextStyle;
    .restart local p5    # "textStyle":Landroidx/compose/ui/text/TextStyle;
    :cond_3d
    move-object v0, v9

    .line 231
    .end local p5    # "textStyle":Landroidx/compose/ui/text/TextStyle;
    .restart local v0    # "textStyle":Landroidx/compose/ui/text/TextStyle;
    :goto_25
    if-eqz v26, :cond_3e

    .line 232
    sget-object v2, Landroidx/compose/foundation/text/KeyboardOptions;->Companion:Landroidx/compose/foundation/text/KeyboardOptions$Companion;

    invoke-virtual {v2}, Landroidx/compose/foundation/text/KeyboardOptions$Companion;->getDefault()Landroidx/compose/foundation/text/KeyboardOptions;

    move-result-object v2

    .end local p6    # "keyboardOptions":Landroidx/compose/foundation/text/KeyboardOptions;
    .local v2, "keyboardOptions":Landroidx/compose/foundation/text/KeyboardOptions;
    goto :goto_26

    .line 231
    .end local v2    # "keyboardOptions":Landroidx/compose/foundation/text/KeyboardOptions;
    .restart local p6    # "keyboardOptions":Landroidx/compose/foundation/text/KeyboardOptions;
    :cond_3e
    move-object v2, v10

    .line 232
    .end local p6    # "keyboardOptions":Landroidx/compose/foundation/text/KeyboardOptions;
    .restart local v2    # "keyboardOptions":Landroidx/compose/foundation/text/KeyboardOptions;
    :goto_26
    if-eqz v29, :cond_3f

    .line 233
    const/4 v8, 0x0

    .end local p7    # "onKeyboardAction":Landroidx/compose/foundation/text/input/KeyboardActionHandler;
    .local v8, "onKeyboardAction":Landroidx/compose/foundation/text/input/KeyboardActionHandler;
    goto :goto_27

    .line 232
    .end local v8    # "onKeyboardAction":Landroidx/compose/foundation/text/input/KeyboardActionHandler;
    .restart local p7    # "onKeyboardAction":Landroidx/compose/foundation/text/input/KeyboardActionHandler;
    :cond_3f
    move-object/from16 v8, p7

    .line 233
    .end local p7    # "onKeyboardAction":Landroidx/compose/foundation/text/input/KeyboardActionHandler;
    .restart local v8    # "onKeyboardAction":Landroidx/compose/foundation/text/input/KeyboardActionHandler;
    :goto_27
    if-eqz v30, :cond_40

    .line 234
    sget-object v9, Landroidx/compose/foundation/text/input/TextFieldLineLimits;->Companion:Landroidx/compose/foundation/text/input/TextFieldLineLimits$Companion;

    invoke-virtual {v9}, Landroidx/compose/foundation/text/input/TextFieldLineLimits$Companion;->getDefault()Landroidx/compose/foundation/text/input/TextFieldLineLimits;

    move-result-object v9

    .end local p8    # "lineLimits":Landroidx/compose/foundation/text/input/TextFieldLineLimits;
    .local v9, "lineLimits":Landroidx/compose/foundation/text/input/TextFieldLineLimits;
    goto :goto_28

    .line 233
    .end local v9    # "lineLimits":Landroidx/compose/foundation/text/input/TextFieldLineLimits;
    .restart local p8    # "lineLimits":Landroidx/compose/foundation/text/input/TextFieldLineLimits;
    :cond_40
    move-object/from16 v9, p8

    .line 234
    .end local p8    # "lineLimits":Landroidx/compose/foundation/text/input/TextFieldLineLimits;
    .restart local v9    # "lineLimits":Landroidx/compose/foundation/text/input/TextFieldLineLimits;
    :goto_28
    if-eqz v31, :cond_41

    .line 235
    const/4 v10, 0x0

    .end local p9    # "onTextLayout":Lkotlin/jvm/functions/Function2;
    .local v10, "onTextLayout":Lkotlin/jvm/functions/Function2;
    goto :goto_29

    .line 234
    .end local v10    # "onTextLayout":Lkotlin/jvm/functions/Function2;
    .restart local p9    # "onTextLayout":Lkotlin/jvm/functions/Function2;
    :cond_41
    move-object/from16 v10, p9

    .line 235
    .end local p9    # "onTextLayout":Lkotlin/jvm/functions/Function2;
    .restart local v10    # "onTextLayout":Lkotlin/jvm/functions/Function2;
    :goto_29
    if-eqz v32, :cond_42

    .line 236
    const/4 v14, 0x0

    .end local p10    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .local v14, "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    goto :goto_2a

    .line 235
    .end local v14    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .restart local p10    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    :cond_42
    move-object/from16 v14, p10

    .line 236
    .end local p10    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .restart local v14    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    :goto_2a
    if-eqz v33, :cond_43

    .line 237
    sget-object v17, Landroidx/compose/foundation/text/BasicTextFieldDefaults;->INSTANCE:Landroidx/compose/foundation/text/BasicTextFieldDefaults;

    invoke-virtual/range {v17 .. v17}, Landroidx/compose/foundation/text/BasicTextFieldDefaults;->getCursorBrush()Landroidx/compose/ui/graphics/SolidColor;

    move-result-object v17

    check-cast v17, Landroidx/compose/ui/graphics/Brush;

    .end local p11    # "cursorBrush":Landroidx/compose/ui/graphics/Brush;
    .local v17, "cursorBrush":Landroidx/compose/ui/graphics/Brush;
    goto :goto_2b

    .line 236
    .end local v17    # "cursorBrush":Landroidx/compose/ui/graphics/Brush;
    .restart local p11    # "cursorBrush":Landroidx/compose/ui/graphics/Brush;
    :cond_43
    move-object/from16 v17, p11

    .line 237
    .end local p11    # "cursorBrush":Landroidx/compose/ui/graphics/Brush;
    .restart local v17    # "cursorBrush":Landroidx/compose/ui/graphics/Brush;
    :goto_2b
    if-eqz v16, :cond_44

    .line 238
    const/16 v16, 0x0

    .end local p12    # "codepointTransformation":Landroidx/compose/foundation/text/input/internal/CodepointTransformation;
    .local v16, "codepointTransformation":Landroidx/compose/foundation/text/input/internal/CodepointTransformation;
    goto :goto_2c

    .line 237
    .end local v16    # "codepointTransformation":Landroidx/compose/foundation/text/input/internal/CodepointTransformation;
    .restart local p12    # "codepointTransformation":Landroidx/compose/foundation/text/input/internal/CodepointTransformation;
    :cond_44
    move-object/from16 v16, p12

    .line 238
    .end local p12    # "codepointTransformation":Landroidx/compose/foundation/text/input/internal/CodepointTransformation;
    .restart local v16    # "codepointTransformation":Landroidx/compose/foundation/text/input/internal/CodepointTransformation;
    :goto_2c
    if-eqz v19, :cond_45

    .line 239
    const/16 v19, 0x0

    .end local p13    # "outputTransformation":Landroidx/compose/foundation/text/input/OutputTransformation;
    .local v19, "outputTransformation":Landroidx/compose/foundation/text/input/OutputTransformation;
    goto :goto_2d

    .line 238
    .end local v19    # "outputTransformation":Landroidx/compose/foundation/text/input/OutputTransformation;
    .restart local p13    # "outputTransformation":Landroidx/compose/foundation/text/input/OutputTransformation;
    :cond_45
    move-object/from16 v19, p13

    .line 239
    .end local p13    # "outputTransformation":Landroidx/compose/foundation/text/input/OutputTransformation;
    .restart local v19    # "outputTransformation":Landroidx/compose/foundation/text/input/OutputTransformation;
    :goto_2d
    if-eqz v34, :cond_46

    .line 240
    const/16 v21, 0x0

    .end local p14    # "decorator":Landroidx/compose/foundation/text/input/TextFieldDecorator;
    .local v21, "decorator":Landroidx/compose/foundation/text/input/TextFieldDecorator;
    goto :goto_2e

    .line 239
    .end local v21    # "decorator":Landroidx/compose/foundation/text/input/TextFieldDecorator;
    .restart local p14    # "decorator":Landroidx/compose/foundation/text/input/TextFieldDecorator;
    :cond_46
    move-object/from16 v21, p14

    .line 240
    .end local p14    # "decorator":Landroidx/compose/foundation/text/input/TextFieldDecorator;
    .restart local v21    # "decorator":Landroidx/compose/foundation/text/input/TextFieldDecorator;
    :goto_2e
    and-int v18, v4, v18

    if-eqz v18, :cond_47

    .line 241
    move-object/from16 p1, v0

    const/4 v0, 0x0

    .end local v0    # "textStyle":Landroidx/compose/ui/text/TextStyle;
    .local p1, "textStyle":Landroidx/compose/ui/text/TextStyle;
    invoke-static {v0, v5, v0, v3}, Landroidx/compose/foundation/ScrollKt;->rememberScrollState(ILandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/ScrollState;

    move-result-object v18

    .end local p15    # "scrollState":Landroidx/compose/foundation/ScrollState;
    .local v18, "scrollState":Landroidx/compose/foundation/ScrollState;
    const v0, -0x70001

    and-int/2addr v7, v0

    goto :goto_2f

    .line 240
    .end local v18    # "scrollState":Landroidx/compose/foundation/ScrollState;
    .end local p1    # "textStyle":Landroidx/compose/ui/text/TextStyle;
    .restart local v0    # "textStyle":Landroidx/compose/ui/text/TextStyle;
    .restart local p15    # "scrollState":Landroidx/compose/foundation/ScrollState;
    :cond_47
    move-object/from16 p1, v0

    .end local v0    # "textStyle":Landroidx/compose/ui/text/TextStyle;
    .restart local p1    # "textStyle":Landroidx/compose/ui/text/TextStyle;
    move-object/from16 v18, p15

    .line 241
    .end local p15    # "scrollState":Landroidx/compose/foundation/ScrollState;
    .restart local v18    # "scrollState":Landroidx/compose/foundation/ScrollState;
    :goto_2f
    if-eqz v35, :cond_48

    .line 242
    const/4 v0, 0x0

    move-object/from16 v33, p1

    move-object/from16 v45, v10

    move/from16 v40, v12

    move/from16 v41, v15

    move-object/from16 v39, v17

    move-object/from16 v42, v18

    move-object/from16 v30, v21

    move v10, v7

    move v7, v0

    move-object/from16 v0, v19

    .end local p16    # "isPassword":Z
    .local v0, "isPassword":Z
    goto :goto_30

    .line 241
    .end local v0    # "isPassword":Z
    .restart local p16    # "isPassword":Z
    :cond_48
    move-object/from16 v33, p1

    move-object/from16 v45, v10

    move/from16 v40, v12

    move/from16 v41, v15

    move-object/from16 v39, v17

    move-object/from16 v42, v18

    move-object/from16 v0, v19

    move-object/from16 v30, v21

    move v10, v7

    move/from16 v7, p16

    .line 242
    .end local v12    # "enabled":Z
    .end local v15    # "readOnly":Z
    .end local v17    # "cursorBrush":Landroidx/compose/ui/graphics/Brush;
    .end local v18    # "scrollState":Landroidx/compose/foundation/ScrollState;
    .end local v19    # "outputTransformation":Landroidx/compose/foundation/text/input/OutputTransformation;
    .end local v21    # "decorator":Landroidx/compose/foundation/text/input/TextFieldDecorator;
    .end local p1    # "textStyle":Landroidx/compose/ui/text/TextStyle;
    .end local p16    # "isPassword":Z
    .local v0, "outputTransformation":Landroidx/compose/foundation/text/input/OutputTransformation;
    .local v7, "isPassword":Z
    .local v10, "$dirty1":I
    .local v30, "decorator":Landroidx/compose/foundation/text/input/TextFieldDecorator;
    .local v33, "textStyle":Landroidx/compose/ui/text/TextStyle;
    .local v39, "cursorBrush":Landroidx/compose/ui/graphics/Brush;
    .local v40, "enabled":Z
    .local v41, "readOnly":Z
    .local v42, "scrollState":Landroidx/compose/foundation/ScrollState;
    .local v45, "onTextLayout":Lkotlin/jvm/functions/Function2;
    :goto_30
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endDefaults()V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v12

    if-eqz v12, :cond_49

    .line 245
    const v12, 0x398702f5

    const-string v15, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:244)"

    invoke-static {v12, v6, v10, v15}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 246
    :cond_49
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalDensity()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v12

    check-cast v12, Landroidx/compose/runtime/CompositionLocal;

    .local v12, "this_$iv":Landroidx/compose/runtime/CompositionLocal;
    const/4 v15, 0x0

    .local v15, "$changed$iv":I
    const/16 v17, 0x0

    .line 972
    .local v17, "$i$f$getCurrent":I
    const v3, 0x789c5f52

    const-string v4, "CC(<get-current>):CompositionLocal.kt#9igjgp"

    invoke-static {v5, v3, v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v5, v12}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v19

    invoke-static {v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 246
    .end local v12    # "this_$iv":Landroidx/compose/runtime/CompositionLocal;
    .end local v15    # "$changed$iv":I
    .end local v17    # "$i$f$getCurrent":I
    move-object/from16 v12, v19

    check-cast v12, Landroidx/compose/ui/unit/Density;

    .line 247
    .local v12, "density":Landroidx/compose/ui/unit/Density;
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalLayoutDirection()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v15

    check-cast v15, Landroidx/compose/runtime/CompositionLocal;

    .local v15, "this_$iv":Landroidx/compose/runtime/CompositionLocal;
    const/16 v17, 0x0

    .local v17, "$changed$iv":I
    const/16 v19, 0x0

    .line 973
    .local v19, "$i$f$getCurrent":I
    invoke-static {v5, v3, v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v5, v15}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v21

    invoke-static {v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 247
    .end local v15    # "this_$iv":Landroidx/compose/runtime/CompositionLocal;
    .end local v17    # "$changed$iv":I
    .end local v19    # "$i$f$getCurrent":I
    move-object/from16 v15, v21

    check-cast v15, Landroidx/compose/ui/unit/LayoutDirection;

    .line 248
    .local v15, "layoutDirection":Landroidx/compose/ui/unit/LayoutDirection;
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalWindowInfo()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v17

    move-object/from16 v3, v17

    check-cast v3, Landroidx/compose/runtime/CompositionLocal;

    .local v3, "this_$iv":Landroidx/compose/runtime/CompositionLocal;
    const/16 v17, 0x0

    .restart local v17    # "$changed$iv":I
    const/16 v19, 0x0

    .line 974
    .restart local v19    # "$i$f$getCurrent":I
    move/from16 p8, v7

    const v7, 0x789c5f52

    .end local v7    # "isPassword":Z
    .local p8, "isPassword":Z
    invoke-static {v5, v7, v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v5, v3}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v7

    invoke-static {v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 248
    .end local v3    # "this_$iv":Landroidx/compose/runtime/CompositionLocal;
    .end local v17    # "$changed$iv":I
    .end local v19    # "$i$f$getCurrent":I
    move-object v3, v7

    check-cast v3, Landroidx/compose/ui/platform/WindowInfo;

    .line 249
    .local v3, "windowInfo":Landroidx/compose/ui/platform/WindowInfo;
    sget-object v7, Landroidx/compose/foundation/text/input/TextFieldLineLimits$SingleLine;->INSTANCE:Landroidx/compose/foundation/text/input/TextFieldLineLimits$SingleLine;

    invoke-static {v9, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v44

    .line 252
    .local v44, "singleLine":Z
    const-string v7, "CC(remember):BasicTextField.kt#9igjgp"

    if-nez v14, :cond_4b

    move-object/from16 p14, v3

    .end local v3    # "windowInfo":Landroidx/compose/ui/platform/WindowInfo;
    .local p14, "windowInfo":Landroidx/compose/ui/platform/WindowInfo;
    const v3, 0x5cffe55

    invoke-interface {v5, v3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v3, "251@14037L39"

    invoke-static {v5, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    const v3, -0x4a2294b3

    invoke-static {v5, v3, v7}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    const/4 v3, 0x0

    .local v3, "invalid$iv":Z
    move-object/from16 p1, v5

    .local p1, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/16 v17, 0x0

    .line 975
    .local v17, "$i$f$cache":I
    move/from16 p2, v3

    .end local v3    # "invalid$iv":Z
    .local p2, "invalid$iv":Z
    invoke-interface/range {p1 .. p1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v3

    .local v3, "it$iv":Ljava/lang/Object;
    const/16 v19, 0x0

    .line 976
    .local v19, "$i$a$-let-ComposerKt$cache$1$iv":I
    sget-object v21, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move-object/from16 p12, v8

    .end local v8    # "onKeyboardAction":Landroidx/compose/foundation/text/input/KeyboardActionHandler;
    .local p12, "onKeyboardAction":Landroidx/compose/foundation/text/input/KeyboardActionHandler;
    invoke-virtual/range {v21 .. v21}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v8

    if-ne v3, v8, :cond_4a

    .line 977
    const/4 v8, 0x0

    .line 252
    .local v8, "$i$a$-cache-BasicTextFieldKt$BasicTextField$interactionSource$1":I
    invoke-static {}, Landroidx/compose/foundation/interaction/InteractionSourceKt;->MutableInteractionSource()Landroidx/compose/foundation/interaction/MutableInteractionSource;

    move-result-object v8

    .line 977
    .end local v8    # "$i$a$-cache-BasicTextFieldKt$BasicTextField$interactionSource$1":I
    nop

    .line 978
    .local v8, "value$iv":Ljava/lang/Object;
    move-object/from16 p3, v3

    move-object/from16 v3, p1

    .end local p1    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .local v3, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .local p3, "it$iv":Ljava/lang/Object;
    invoke-interface {v3, v8}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 979
    nop

    .end local v8    # "value$iv":Ljava/lang/Object;
    goto :goto_31

    .line 980
    .end local p3    # "it$iv":Ljava/lang/Object;
    .local v3, "it$iv":Ljava/lang/Object;
    .restart local p1    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    :cond_4a
    move-object/from16 p3, v3

    move-object/from16 v3, p1

    .end local p1    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .local v3, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .restart local p3    # "it$iv":Ljava/lang/Object;
    move-object/from16 v8, p3

    .line 975
    .end local v19    # "$i$a$-let-ComposerKt$cache$1$iv":I
    .end local p3    # "it$iv":Ljava/lang/Object;
    :goto_31
    nop

    .line 252
    .end local v3    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v17    # "$i$f$cache":I
    .end local p2    # "invalid$iv":Z
    check-cast v8, Landroidx/compose/foundation/interaction/MutableInteractionSource;

    invoke-static {v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    goto :goto_32

    .end local p12    # "onKeyboardAction":Landroidx/compose/foundation/text/input/KeyboardActionHandler;
    .end local p14    # "windowInfo":Landroidx/compose/ui/platform/WindowInfo;
    .local v3, "windowInfo":Landroidx/compose/ui/platform/WindowInfo;
    .local v8, "onKeyboardAction":Landroidx/compose/foundation/text/input/KeyboardActionHandler;
    :cond_4b
    move-object/from16 p14, v3

    move-object/from16 p12, v8

    .end local v3    # "windowInfo":Landroidx/compose/ui/platform/WindowInfo;
    .end local v8    # "onKeyboardAction":Landroidx/compose/foundation/text/input/KeyboardActionHandler;
    .restart local p12    # "onKeyboardAction":Landroidx/compose/foundation/text/input/KeyboardActionHandler;
    .restart local p14    # "windowInfo":Landroidx/compose/ui/platform/WindowInfo;
    const v3, -0x4a22973e

    invoke-interface {v5, v3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    move-object v8, v14

    :goto_32
    move-object/from16 v52, v8

    .line 253
    .local v52, "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    if-eqz v44, :cond_4c

    sget-object v3, Landroidx/compose/foundation/gestures/Orientation;->Horizontal:Landroidx/compose/foundation/gestures/Orientation;

    goto :goto_33

    :cond_4c
    sget-object v3, Landroidx/compose/foundation/gestures/Orientation;->Vertical:Landroidx/compose/foundation/gestures/Orientation;

    :goto_33
    move-object/from16 v43, v3

    move-object/from16 v3, v43

    .line 254
    .local v3, "orientation":Landroidx/compose/foundation/gestures/Orientation;
    move-object/from16 v8, v52

    check-cast v8, Landroidx/compose/foundation/interaction/InteractionSource;

    move-object/from16 v31, v9

    const/4 v9, 0x0

    .end local v9    # "lineLimits":Landroidx/compose/foundation/text/input/TextFieldLineLimits;
    .local v31, "lineLimits":Landroidx/compose/foundation/text/input/TextFieldLineLimits;
    invoke-static {v8, v5, v9}, Landroidx/compose/foundation/interaction/FocusInteractionKt;->collectIsFocusedAsState(Landroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    move-result-object v8

    invoke-interface {v8}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Boolean;

    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v34

    .line 255
    .local v34, "isFocused":Z
    move-object/from16 v8, v52

    check-cast v8, Landroidx/compose/foundation/interaction/InteractionSource;

    invoke-static {v8, v5, v9}, Landroidx/compose/foundation/interaction/HoverInteractionKt;->collectIsHoveredAsState(Landroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    move-result-object v8

    invoke-interface {v8}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Boolean;

    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v36

    .line 256
    .local v36, "isDragHovered":Z
    invoke-interface/range {p14 .. p14}, Landroidx/compose/ui/platform/WindowInfo;->isWindowFocused()Z

    move-result v35

    .line 257
    .local v35, "isWindowFocused":Z
    const v8, -0x4a22678f

    invoke-static {v5, v8, v7}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    const/4 v8, 0x0

    .local v8, "invalid$iv":Z
    move-object v9, v5

    .local v9, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/16 v17, 0x0

    .line 981
    .restart local v17    # "$i$f$cache":I
    move/from16 p1, v8

    .end local v8    # "invalid$iv":Z
    .local p1, "invalid$iv":Z
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v8

    .local v8, "it$iv":Ljava/lang/Object;
    const/16 v19, 0x0

    .line 982
    .restart local v19    # "$i$a$-let-ComposerKt$cache$1$iv":I
    sget-object v21, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move-object/from16 p4, v12

    .end local v12    # "density":Landroidx/compose/ui/unit/Density;
    .local p4, "density":Landroidx/compose/ui/unit/Density;
    invoke-virtual/range {v21 .. v21}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v12

    move-object/from16 p15, v14

    .end local v14    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .local p15, "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    const/4 v14, 0x0

    if-ne v8, v12, :cond_4d

    .line 983
    const/4 v12, 0x0

    .line 258
    .local v12, "$i$a$-cache-BasicTextFieldKt$BasicTextField$stylusHandwritingTrigger$1":I
    move-object/from16 p2, v8

    .end local v8    # "it$iv":Ljava/lang/Object;
    .local p2, "it$iv":Ljava/lang/Object;
    sget-object v8, Lkotlinx/coroutines/channels/BufferOverflow;->DROP_LATEST:Lkotlinx/coroutines/channels/BufferOverflow;

    move-object/from16 v48, v3

    move/from16 p3, v12

    move-object/from16 p16, v15

    const/4 v3, 0x0

    const/4 v12, 0x2

    const/4 v15, 0x1

    .end local v3    # "orientation":Landroidx/compose/foundation/gestures/Orientation;
    .end local v12    # "$i$a$-cache-BasicTextFieldKt$BasicTextField$stylusHandwritingTrigger$1":I
    .end local v15    # "layoutDirection":Landroidx/compose/ui/unit/LayoutDirection;
    .local v48, "orientation":Landroidx/compose/foundation/gestures/Orientation;
    .local p3, "$i$a$-cache-BasicTextFieldKt$BasicTextField$stylusHandwritingTrigger$1":I
    .local p16, "layoutDirection":Landroidx/compose/ui/unit/LayoutDirection;
    invoke-static {v15, v3, v8, v12, v14}, Lkotlinx/coroutines/flow/SharedFlowKt;->MutableSharedFlow$default(IILkotlinx/coroutines/channels/BufferOverflow;ILjava/lang/Object;)Lkotlinx/coroutines/flow/MutableSharedFlow;

    move-result-object v8

    .line 983
    .end local p3    # "$i$a$-cache-BasicTextFieldKt$BasicTextField$stylusHandwritingTrigger$1":I
    nop

    .line 984
    .local v8, "value$iv":Ljava/lang/Object;
    invoke-interface {v9, v8}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 985
    nop

    .end local v8    # "value$iv":Ljava/lang/Object;
    goto :goto_34

    .line 986
    .end local v48    # "orientation":Landroidx/compose/foundation/gestures/Orientation;
    .end local p2    # "it$iv":Ljava/lang/Object;
    .end local p16    # "layoutDirection":Landroidx/compose/ui/unit/LayoutDirection;
    .restart local v3    # "orientation":Landroidx/compose/foundation/gestures/Orientation;
    .local v8, "it$iv":Ljava/lang/Object;
    .restart local v15    # "layoutDirection":Landroidx/compose/ui/unit/LayoutDirection;
    :cond_4d
    move-object/from16 v48, v3

    move-object/from16 p2, v8

    move-object/from16 p16, v15

    .line 981
    .end local v3    # "orientation":Landroidx/compose/foundation/gestures/Orientation;
    .end local v8    # "it$iv":Ljava/lang/Object;
    .end local v15    # "layoutDirection":Landroidx/compose/ui/unit/LayoutDirection;
    .end local v19    # "$i$a$-let-ComposerKt$cache$1$iv":I
    .restart local v48    # "orientation":Landroidx/compose/foundation/gestures/Orientation;
    .restart local p16    # "layoutDirection":Landroidx/compose/ui/unit/LayoutDirection;
    :goto_34
    nop

    .line 257
    .end local v9    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v17    # "$i$f$cache":I
    .end local p1    # "invalid$iv":Z
    move-object v3, v8

    check-cast v3, Lkotlinx/coroutines/flow/MutableSharedFlow;

    .local v3, "stylusHandwritingTrigger":Lkotlinx/coroutines/flow/MutableSharedFlow;
    invoke-static {v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 262
    const v8, -0x4a2252ad

    invoke-static {v5, v8, v7}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    and-int/lit8 v8, v6, 0xe

    const/4 v9, 0x4

    if-ne v8, v9, :cond_4e

    const/4 v8, 0x1

    goto :goto_35

    :cond_4e
    const/4 v8, 0x0

    :goto_35
    and-int/lit16 v9, v10, 0x380

    const/16 v12, 0x100

    if-ne v9, v12, :cond_4f

    const/4 v9, 0x1

    goto :goto_36

    :cond_4f
    const/4 v9, 0x0

    :goto_36
    or-int/2addr v8, v9

    and-int/lit16 v9, v10, 0x1c00

    const/16 v12, 0x800

    if-ne v9, v12, :cond_50

    const/4 v9, 0x1

    goto :goto_37

    :cond_50
    const/4 v9, 0x0

    :goto_37
    or-int/2addr v8, v9

    .local v8, "invalid$iv":Z
    move-object v9, v5

    .restart local v9    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/4 v12, 0x0

    .line 987
    .local v12, "$i$f$cache":I
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v15

    .local v15, "it$iv":Ljava/lang/Object;
    const/16 v17, 0x0

    .line 988
    .local v17, "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez v8, :cond_52

    sget-object v19, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual/range {v19 .. v19}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v14

    if-ne v15, v14, :cond_51

    goto :goto_38

    .line 993
    :cond_51
    move-object/from16 p13, v3

    move/from16 p2, v8

    goto :goto_3b

    .line 989
    :cond_52
    :goto_38
    const/4 v14, 0x0

    .line 269
    .local v14, "$i$a$-cache-BasicTextFieldKt$BasicTextField$transformedState$1":I
    if-nez v16, :cond_54

    sget-object v19, Landroidx/compose/foundation/text/input/internal/SingleLineCodepointTransformation;->INSTANCE:Landroidx/compose/foundation/text/input/internal/SingleLineCodepointTransformation;

    move-object/from16 v24, v19

    .line 990
    .local v24, "it":Landroidx/compose/foundation/text/input/internal/SingleLineCodepointTransformation;
    const/16 v25, 0x0

    .line 269
    .local v25, "$i$a$-takeIf-BasicTextFieldKt$BasicTextField$transformedState$1$appliedCodepointTransformation$1":I
    nop

    .end local v24    # "it":Landroidx/compose/foundation/text/input/internal/SingleLineCodepointTransformation;
    .end local v25    # "$i$a$-takeIf-BasicTextFieldKt$BasicTextField$transformedState$1$appliedCodepointTransformation$1":I
    if-eqz v44, :cond_53

    goto :goto_39

    :cond_53
    const/16 v19, 0x0

    :goto_39
    check-cast v19, Landroidx/compose/foundation/text/input/internal/CodepointTransformation;

    goto :goto_3a

    :cond_54
    move-object/from16 v19, v16

    .line 268
    :goto_3a
    move-object/from16 p1, v19

    .line 270
    .local p1, "appliedCodepointTransformation":Landroidx/compose/foundation/text/input/internal/CodepointTransformation;
    move-object/from16 p13, v3

    .end local v3    # "stylusHandwritingTrigger":Lkotlinx/coroutines/flow/MutableSharedFlow;
    .local p13, "stylusHandwritingTrigger":Lkotlinx/coroutines/flow/MutableSharedFlow;
    new-instance v3, Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;

    .line 271
    nop

    .line 272
    nop

    .line 273
    nop

    .line 274
    nop

    .line 270
    move/from16 p2, v8

    move-object/from16 v8, p1

    .end local p1    # "appliedCodepointTransformation":Landroidx/compose/foundation/text/input/internal/CodepointTransformation;
    .local v8, "appliedCodepointTransformation":Landroidx/compose/foundation/text/input/internal/CodepointTransformation;
    .local p2, "invalid$iv":Z
    invoke-direct {v3, v1, v11, v8, v0}, Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;-><init>(Landroidx/compose/foundation/text/input/TextFieldState;Landroidx/compose/foundation/text/input/InputTransformation;Landroidx/compose/foundation/text/input/internal/CodepointTransformation;Landroidx/compose/foundation/text/input/OutputTransformation;)V

    .line 275
    nop

    .line 989
    .end local v8    # "appliedCodepointTransformation":Landroidx/compose/foundation/text/input/internal/CodepointTransformation;
    .end local v14    # "$i$a$-cache-BasicTextFieldKt$BasicTextField$transformedState$1":I
    nop

    .line 991
    .local v3, "value$iv":Ljava/lang/Object;
    invoke-interface {v9, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 992
    move-object v15, v3

    .line 987
    .end local v3    # "value$iv":Ljava/lang/Object;
    .end local v15    # "it$iv":Ljava/lang/Object;
    .end local v17    # "$i$a$-let-ComposerKt$cache$1$iv":I
    :goto_3b
    nop

    .line 262
    .end local v9    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v12    # "$i$f$cache":I
    .end local p2    # "invalid$iv":Z
    move-object/from16 v37, v15

    check-cast v37, Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;

    invoke-static {v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 261
    move-object/from16 v3, v37

    .line 280
    .local v3, "transformedState":Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;
    const v8, -0x4a21d36a

    invoke-static {v5, v8, v7}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v5, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v8

    .local v8, "invalid$iv":Z
    move-object v9, v5

    .restart local v9    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/4 v12, 0x0

    .line 994
    .restart local v12    # "$i$f$cache":I
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v14

    .local v14, "it$iv":Ljava/lang/Object;
    const/4 v15, 0x0

    .line 995
    .local v15, "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez v8, :cond_56

    sget-object v17, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move-object/from16 v19, v0

    .end local v0    # "outputTransformation":Landroidx/compose/foundation/text/input/OutputTransformation;
    .local v19, "outputTransformation":Landroidx/compose/foundation/text/input/OutputTransformation;
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v0

    if-ne v14, v0, :cond_55

    goto :goto_3c

    .line 999
    :cond_55
    goto :goto_3d

    .line 995
    .end local v19    # "outputTransformation":Landroidx/compose/foundation/text/input/OutputTransformation;
    .restart local v0    # "outputTransformation":Landroidx/compose/foundation/text/input/OutputTransformation;
    :cond_56
    move-object/from16 v19, v0

    .line 996
    .end local v0    # "outputTransformation":Landroidx/compose/foundation/text/input/OutputTransformation;
    .restart local v19    # "outputTransformation":Landroidx/compose/foundation/text/input/OutputTransformation;
    :goto_3c
    const/4 v0, 0x0

    .line 280
    .local v0, "$i$a$-cache-BasicTextFieldKt$BasicTextField$textLayoutState$1":I
    new-instance v17, Landroidx/compose/foundation/text/input/internal/TextLayoutState;

    invoke-direct/range {v17 .. v17}, Landroidx/compose/foundation/text/input/internal/TextLayoutState;-><init>()V

    .line 996
    .end local v0    # "$i$a$-cache-BasicTextFieldKt$BasicTextField$textLayoutState$1":I
    move-object/from16 v0, v17

    .line 997
    .local v0, "value$iv":Ljava/lang/Object;
    invoke-interface {v9, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 998
    move-object v14, v0

    .line 994
    .end local v0    # "value$iv":Ljava/lang/Object;
    .end local v14    # "it$iv":Ljava/lang/Object;
    .end local v15    # "$i$a$-let-ComposerKt$cache$1$iv":I
    :goto_3d
    nop

    .line 280
    .end local v8    # "invalid$iv":Z
    .end local v9    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v12    # "$i$f$cache":I
    move-object/from16 v32, v14

    check-cast v32, Landroidx/compose/foundation/text/input/internal/TextLayoutState;

    .local v32, "textLayoutState":Landroidx/compose/foundation/text/input/internal/TextLayoutState;
    invoke-static {v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 285
    if-eqz v11, :cond_57

    invoke-interface {v11}, Landroidx/compose/foundation/text/input/InputTransformation;->getKeyboardOptions()Landroidx/compose/foundation/text/KeyboardOptions;

    move-result-object v0

    goto :goto_3e

    :cond_57
    const/4 v0, 0x0

    :goto_3e
    invoke-virtual {v2, v0}, Landroidx/compose/foundation/text/KeyboardOptions;->fillUnspecifiedValuesWith$foundation_release(Landroidx/compose/foundation/text/KeyboardOptions;)Landroidx/compose/foundation/text/KeyboardOptions;

    move-result-object v46

    .line 284
    nop

    .line 288
    .local v46, "resolvedKeyboardOptions":Landroidx/compose/foundation/text/KeyboardOptions;
    const v0, -0x4a21a0ed

    invoke-static {v5, v0, v7}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v5, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v0

    .local v0, "invalid$iv":Z
    move-object v8, v5

    .local v8, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/4 v9, 0x0

    .line 1000
    .local v9, "$i$f$cache":I
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v12

    .local v12, "it$iv":Ljava/lang/Object;
    const/4 v14, 0x0

    .line 1001
    .local v14, "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez v0, :cond_59

    sget-object v15, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v15}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v15

    if-ne v12, v15, :cond_58

    goto :goto_3f

    .line 1005
    :cond_58
    move/from16 v24, p8

    move/from16 p1, v0

    move-object v0, v3

    move-object/from16 v3, p4

    goto :goto_41

    .line 1002
    :cond_59
    :goto_3f
    const/4 v15, 0x0

    .line 289
    .local v15, "$i$a$-cache-BasicTextFieldKt$BasicTextField$textFieldSelectionState$1":I
    new-instance v17, Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;

    .line 290
    nop

    .line 291
    nop

    .line 292
    nop

    .line 293
    nop

    .line 294
    nop

    .line 295
    if-eqz v34, :cond_5a

    if-eqz v35, :cond_5a

    const/16 v24, 0x1

    goto :goto_40

    :cond_5a
    const/16 v24, 0x0

    .line 296
    :goto_40
    nop

    .line 289
    move-object/from16 p2, v3

    move-object/from16 p1, v17

    move/from16 p7, v24

    move-object/from16 p3, v32

    move/from16 p5, v40

    move/from16 p6, v41

    .end local v3    # "transformedState":Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;
    .end local v32    # "textLayoutState":Landroidx/compose/foundation/text/input/internal/TextLayoutState;
    .end local v40    # "enabled":Z
    .end local v41    # "readOnly":Z
    .local p2, "transformedState":Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;
    .local p3, "textLayoutState":Landroidx/compose/foundation/text/input/internal/TextLayoutState;
    .local p5, "enabled":Z
    .local p6, "readOnly":Z
    invoke-direct/range {p1 .. p8}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;-><init>(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/ui/unit/Density;ZZZZ)V

    .line 297
    move-object/from16 v3, p4

    move/from16 v24, p8

    move/from16 p1, v0

    move-object/from16 v0, p2

    .line 1002
    .end local v15    # "$i$a$-cache-BasicTextFieldKt$BasicTextField$textFieldSelectionState$1":I
    .end local p2    # "transformedState":Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;
    .end local p3    # "textLayoutState":Landroidx/compose/foundation/text/input/internal/TextLayoutState;
    .end local p4    # "density":Landroidx/compose/ui/unit/Density;
    .end local p5    # "enabled":Z
    .end local p6    # "readOnly":Z
    .end local p8    # "isPassword":Z
    .local v0, "transformedState":Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;
    .local v3, "density":Landroidx/compose/ui/unit/Density;
    .local v24, "isPassword":Z
    .restart local v32    # "textLayoutState":Landroidx/compose/foundation/text/input/internal/TextLayoutState;
    .restart local v40    # "enabled":Z
    .restart local v41    # "readOnly":Z
    .local p1, "invalid$iv":Z
    move-object/from16 v15, v17

    .line 1003
    .local v15, "value$iv":Ljava/lang/Object;
    invoke-interface {v8, v15}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1004
    move-object v12, v15

    .line 1000
    .end local v12    # "it$iv":Ljava/lang/Object;
    .end local v14    # "$i$a$-let-ComposerKt$cache$1$iv":I
    .end local v15    # "value$iv":Ljava/lang/Object;
    :goto_41
    nop

    .line 288
    .end local v8    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v9    # "$i$f$cache":I
    .end local p1    # "invalid$iv":Z
    move-object/from16 v38, v12

    check-cast v38, Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;

    invoke-static {v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 287
    move-object/from16 v8, v38

    .line 299
    .local v8, "textFieldSelectionState":Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;
    const/4 v9, 0x0

    move v12, v9

    .local v12, "$changed$iv":I
    const/4 v9, 0x0

    .line 1006
    .local v9, "$i$f$rememberCoroutineScope":I
    const v14, 0x2e20b340

    const-string v15, "CC(rememberCoroutineScope)558@25470L68:Effects.kt#9igjgp"

    invoke-static {v5, v14, v15}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 1007
    nop

    .line 1011
    move-object v14, v5

    .line 1012
    .local v14, "composer$iv":Landroidx/compose/runtime/Composer;
    const v15, -0x38dffd5c

    const-string v1, "CC(remember):Effects.kt#9igjgp"

    invoke-static {v5, v15, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    const/4 v1, 0x0

    .local v1, "invalid$iv$iv":Z
    move-object v15, v5

    .local v15, "$this$cache$iv$iv":Landroidx/compose/runtime/Composer;
    const/16 v17, 0x0

    .line 1013
    .local v17, "$i$f$cache":I
    move/from16 p1, v1

    .end local v1    # "invalid$iv$iv":Z
    .local p1, "invalid$iv$iv":Z
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v1

    .local v1, "it$iv$iv":Ljava/lang/Object;
    const/16 v25, 0x0

    .line 1014
    .local v25, "$i$a$-let-ComposerKt$cache$1$iv$iv":I
    sget-object v26, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move-object/from16 v27, v2

    .end local v2    # "keyboardOptions":Landroidx/compose/foundation/text/KeyboardOptions;
    .local v27, "keyboardOptions":Landroidx/compose/foundation/text/KeyboardOptions;
    invoke-virtual/range {v26 .. v26}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v2

    if-ne v1, v2, :cond_5b

    .line 1015
    const/4 v2, 0x0

    .line 1012
    .local v2, "$i$a$-cache-EffectsKt$rememberCoroutineScope$2$iv":I
    const/16 v26, 0x0

    .line 1016
    .local v26, "$i$a$-rememberCoroutineScope-EffectsKt$rememberCoroutineScope$1":I
    sget-object v26, Lkotlin/coroutines/EmptyCoroutineContext;->INSTANCE:Lkotlin/coroutines/EmptyCoroutineContext;

    .line 1012
    .end local v26    # "$i$a$-rememberCoroutineScope-EffectsKt$rememberCoroutineScope$1":I
    move-object/from16 p2, v1

    .end local v1    # "it$iv$iv":Ljava/lang/Object;
    .local p2, "it$iv$iv":Ljava/lang/Object;
    move-object/from16 v1, v26

    check-cast v1, Lkotlin/coroutines/CoroutineContext;

    invoke-static {v1, v14}, Landroidx/compose/runtime/EffectsKt;->createCompositionCoroutineScope(Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    .line 1015
    .end local v2    # "$i$a$-cache-EffectsKt$rememberCoroutineScope$2$iv":I
    nop

    .line 1017
    .local v1, "value$iv$iv":Ljava/lang/Object;
    invoke-interface {v15, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1018
    nop

    .end local v1    # "value$iv$iv":Ljava/lang/Object;
    goto :goto_42

    .line 1019
    .end local p2    # "it$iv$iv":Ljava/lang/Object;
    .local v1, "it$iv$iv":Ljava/lang/Object;
    :cond_5b
    move-object/from16 p2, v1

    .line 1013
    .end local v1    # "it$iv$iv":Ljava/lang/Object;
    .end local v25    # "$i$a$-let-ComposerKt$cache$1$iv$iv":I
    :goto_42
    nop

    .line 1012
    .end local v15    # "$this$cache$iv$iv":Landroidx/compose/runtime/Composer;
    .end local v17    # "$i$f$cache":I
    .end local p1    # "invalid$iv$iv":Z
    check-cast v1, Lkotlinx/coroutines/CoroutineScope;

    invoke-static {v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 1006
    invoke-static {v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 1012
    nop

    .line 299
    .end local v9    # "$i$f$rememberCoroutineScope":I
    .end local v12    # "$changed$iv":I
    .end local v14    # "composer$iv":Landroidx/compose/runtime/Composer;
    nop

    .line 300
    .local v1, "coroutineScope":Lkotlinx/coroutines/CoroutineScope;
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalHapticFeedback()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v2

    check-cast v2, Landroidx/compose/runtime/CompositionLocal;

    .local v2, "this_$iv":Landroidx/compose/runtime/CompositionLocal;
    const/4 v9, 0x0

    .local v9, "$changed$iv":I
    const/4 v12, 0x0

    .line 1020
    .local v12, "$i$f$getCurrent":I
    const v14, 0x789c5f52

    invoke-static {v5, v14, v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v5, v2}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v14

    invoke-static {v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 300
    .end local v2    # "this_$iv":Landroidx/compose/runtime/CompositionLocal;
    .end local v9    # "$changed$iv":I
    .end local v12    # "$i$f$getCurrent":I
    move-object v2, v14

    check-cast v2, Landroidx/compose/ui/hapticfeedback/HapticFeedback;

    .line 301
    .local v2, "currentHapticFeedback":Landroidx/compose/ui/hapticfeedback/HapticFeedback;
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalClipboard()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v9

    check-cast v9, Landroidx/compose/runtime/CompositionLocal;

    .local v9, "this_$iv":Landroidx/compose/runtime/CompositionLocal;
    const/4 v12, 0x0

    .local v12, "$changed$iv":I
    const/4 v14, 0x0

    .line 1021
    .local v14, "$i$f$getCurrent":I
    const v15, 0x789c5f52

    invoke-static {v5, v15, v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v5, v9}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v15

    invoke-static {v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 301
    .end local v9    # "this_$iv":Landroidx/compose/runtime/CompositionLocal;
    .end local v12    # "$changed$iv":I
    .end local v14    # "$i$f$getCurrent":I
    move-object v9, v15

    check-cast v9, Landroidx/compose/ui/platform/Clipboard;

    .line 302
    .local v9, "currentClipboard":Landroidx/compose/ui/platform/Clipboard;
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalTextToolbar()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v12

    check-cast v12, Landroidx/compose/runtime/CompositionLocal;

    .local v12, "this_$iv":Landroidx/compose/runtime/CompositionLocal;
    const/4 v14, 0x0

    .local v14, "$changed$iv":I
    const/4 v15, 0x0

    .line 1022
    .local v15, "$i$f$getCurrent":I
    move/from16 v17, v10

    const v10, 0x789c5f52

    .end local v10    # "$dirty1":I
    .local v17, "$dirty1":I
    invoke-static {v5, v10, v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v5, v12}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 302
    .end local v12    # "this_$iv":Landroidx/compose/runtime/CompositionLocal;
    .end local v14    # "$changed$iv":I
    .end local v15    # "$i$f$getCurrent":I
    check-cast v4, Landroidx/compose/ui/platform/TextToolbar;

    .line 305
    .local v4, "currentTextToolbar":Landroidx/compose/ui/platform/TextToolbar;
    const v10, -0x4a214926

    invoke-static {v5, v10, v7}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v5, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v10

    invoke-interface {v5, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v12

    or-int/2addr v10, v12

    .local v10, "invalid$iv":Z
    move-object v12, v5

    .local v12, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/4 v14, 0x0

    .line 1023
    .local v14, "$i$f$cache":I
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v15

    .local v15, "it$iv":Ljava/lang/Object;
    const/16 v25, 0x0

    .line 1024
    .local v25, "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez v10, :cond_5d

    sget-object v26, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move/from16 p1, v10

    .end local v10    # "invalid$iv":Z
    .local p1, "invalid$iv":Z
    invoke-virtual/range {v26 .. v26}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v10

    if-ne v15, v10, :cond_5c

    goto :goto_43

    .line 1028
    :cond_5c
    goto :goto_44

    .line 1024
    .end local p1    # "invalid$iv":Z
    .restart local v10    # "invalid$iv":Z
    :cond_5d
    move/from16 p1, v10

    .line 1025
    .end local v10    # "invalid$iv":Z
    .restart local p1    # "invalid$iv":Z
    :goto_43
    const/4 v10, 0x0

    .line 306
    .local v10, "$i$a$-cache-BasicTextFieldKt$BasicTextField$textToolbarHandler$1":I
    move/from16 p2, v10

    .end local v10    # "$i$a$-cache-BasicTextFieldKt$BasicTextField$textToolbarHandler$1":I
    .local p2, "$i$a$-cache-BasicTextFieldKt$BasicTextField$textToolbarHandler$1":I
    new-instance v10, Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1;

    invoke-direct {v10, v4, v1}, Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1;-><init>(Landroidx/compose/ui/platform/TextToolbar;Lkotlinx/coroutines/CoroutineScope;)V

    .line 346
    nop

    .line 1025
    .end local p2    # "$i$a$-cache-BasicTextFieldKt$BasicTextField$textToolbarHandler$1":I
    nop

    .line 1026
    .local v10, "value$iv":Ljava/lang/Object;
    invoke-interface {v12, v10}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1027
    move-object v15, v10

    .line 1023
    .end local v10    # "value$iv":Ljava/lang/Object;
    .end local v15    # "it$iv":Ljava/lang/Object;
    .end local v25    # "$i$a$-let-ComposerKt$cache$1$iv":I
    :goto_44
    nop

    .line 305
    .end local v12    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v14    # "$i$f$cache":I
    .end local p1    # "invalid$iv":Z
    check-cast v15, Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1;

    invoke-static {v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 304
    nop

    .line 349
    .local v15, "textToolbarHandler":Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1;
    const v10, -0x4a204a9d

    invoke-static {v5, v10, v7}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v5, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v10

    const v12, 0xe000

    and-int/2addr v12, v6

    const/16 v14, 0x4000

    if-ne v12, v14, :cond_5e

    const/4 v12, 0x1

    goto :goto_45

    :cond_5e
    const/4 v12, 0x0

    :goto_45
    or-int/2addr v10, v12

    invoke-interface {v5, v8}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v12

    or-int/2addr v10, v12

    invoke-interface {v5, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v12

    or-int/2addr v10, v12

    invoke-interface {v5, v9}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v12

    or-int/2addr v10, v12

    invoke-interface {v5, v15}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v12

    or-int/2addr v10, v12

    invoke-interface {v5, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v12

    or-int/2addr v10, v12

    and-int/lit16 v12, v6, 0x380

    const/16 v14, 0x100

    if-ne v12, v14, :cond_5f

    const/4 v12, 0x1

    goto :goto_46

    :cond_5f
    const/4 v12, 0x0

    :goto_46
    or-int/2addr v10, v12

    and-int/lit16 v12, v6, 0x1c00

    const/16 v14, 0x800

    if-ne v12, v14, :cond_60

    const/4 v12, 0x1

    goto :goto_47

    :cond_60
    const/4 v12, 0x0

    :goto_47
    or-int/2addr v10, v12

    const/high16 v12, 0x380000

    and-int v12, v17, v12

    const/high16 v14, 0x100000

    if-ne v12, v14, :cond_61

    const/4 v12, 0x1

    goto :goto_48

    :cond_61
    const/4 v12, 0x0

    :goto_48
    or-int/2addr v10, v12

    .local v10, "invalid$iv":Z
    move-object v12, v5

    .restart local v12    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/4 v14, 0x0

    .line 1029
    .restart local v14    # "$i$f$cache":I
    move-object/from16 p2, v0

    .end local v0    # "transformedState":Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;
    .local p2, "transformedState":Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v0

    .local v0, "it$iv":Ljava/lang/Object;
    const/16 v20, 0x0

    .line 1030
    .local v20, "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez v10, :cond_63

    sget-object v22, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move-object/from16 v23, v1

    .end local v1    # "coroutineScope":Lkotlinx/coroutines/CoroutineScope;
    .local v23, "coroutineScope":Lkotlinx/coroutines/CoroutineScope;
    invoke-virtual/range {v22 .. v22}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_62

    goto :goto_49

    .line 1034
    :cond_62
    move-object/from16 v37, v8

    move-object v8, v2

    move-object/from16 v2, v37

    move-object/from16 v37, p2

    goto :goto_4a

    .line 1030
    .end local v23    # "coroutineScope":Lkotlinx/coroutines/CoroutineScope;
    .restart local v1    # "coroutineScope":Lkotlinx/coroutines/CoroutineScope;
    :cond_63
    move-object/from16 v23, v1

    .line 1031
    .end local v1    # "coroutineScope":Lkotlinx/coroutines/CoroutineScope;
    .restart local v23    # "coroutineScope":Lkotlinx/coroutines/CoroutineScope;
    :goto_49
    const/4 v1, 0x0

    .line 349
    .local v1, "$i$a$-cache-BasicTextFieldKt$BasicTextField$2":I
    new-instance v22, Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$2$1;

    move-object/from16 p5, v2

    move-object/from16 p8, v3

    move-object/from16 p4, v8

    move-object/from16 p6, v9

    move-object/from16 p3, v11

    move-object/from16 p7, v15

    move-object/from16 p1, v22

    move/from16 p11, v24

    move/from16 p9, v40

    move/from16 p10, v41

    .end local v2    # "currentHapticFeedback":Landroidx/compose/ui/hapticfeedback/HapticFeedback;
    .end local v3    # "density":Landroidx/compose/ui/unit/Density;
    .end local v8    # "textFieldSelectionState":Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;
    .end local v9    # "currentClipboard":Landroidx/compose/ui/platform/Clipboard;
    .end local v11    # "inputTransformation":Landroidx/compose/foundation/text/input/InputTransformation;
    .end local v15    # "textToolbarHandler":Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1;
    .end local v24    # "isPassword":Z
    .end local v40    # "enabled":Z
    .end local v41    # "readOnly":Z
    .local p3, "inputTransformation":Landroidx/compose/foundation/text/input/InputTransformation;
    .local p4, "textFieldSelectionState":Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;
    .local p5, "currentHapticFeedback":Landroidx/compose/ui/hapticfeedback/HapticFeedback;
    .local p6, "currentClipboard":Landroidx/compose/ui/platform/Clipboard;
    .local p7, "textToolbarHandler":Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1;
    .local p8, "density":Landroidx/compose/ui/unit/Density;
    .local p9, "enabled":Z
    .local p10, "readOnly":Z
    .local p11, "isPassword":Z
    invoke-direct/range {p1 .. p11}, Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$2$1;-><init>(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text/input/InputTransformation;Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Landroidx/compose/ui/hapticfeedback/HapticFeedback;Landroidx/compose/ui/platform/Clipboard;Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1;Landroidx/compose/ui/unit/Density;ZZZ)V

    move-object/from16 v37, p2

    move-object/from16 v2, p4

    move-object/from16 v8, p5

    .end local p2    # "transformedState":Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;
    .end local p3    # "inputTransformation":Landroidx/compose/foundation/text/input/InputTransformation;
    .end local p4    # "textFieldSelectionState":Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;
    .end local p5    # "currentHapticFeedback":Landroidx/compose/ui/hapticfeedback/HapticFeedback;
    .end local p6    # "currentClipboard":Landroidx/compose/ui/platform/Clipboard;
    .end local p7    # "textToolbarHandler":Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1;
    .end local p8    # "density":Landroidx/compose/ui/unit/Density;
    .end local p9    # "enabled":Z
    .end local p10    # "readOnly":Z
    .end local p11    # "isPassword":Z
    .local v2, "textFieldSelectionState":Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;
    .restart local v3    # "density":Landroidx/compose/ui/unit/Density;
    .local v8, "currentHapticFeedback":Landroidx/compose/ui/hapticfeedback/HapticFeedback;
    .restart local v9    # "currentClipboard":Landroidx/compose/ui/platform/Clipboard;
    .restart local v11    # "inputTransformation":Landroidx/compose/foundation/text/input/InputTransformation;
    .restart local v15    # "textToolbarHandler":Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1;
    .restart local v24    # "isPassword":Z
    .local v37, "transformedState":Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;
    .restart local v40    # "enabled":Z
    .restart local v41    # "readOnly":Z
    check-cast v22, Lkotlin/jvm/functions/Function0;

    .line 1031
    .end local v1    # "$i$a$-cache-BasicTextFieldKt$BasicTextField$2":I
    move-object/from16 v1, v22

    .line 1032
    .local v1, "value$iv":Ljava/lang/Object;
    invoke-interface {v12, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1033
    move-object v0, v1

    .line 1029
    .end local v0    # "it$iv":Ljava/lang/Object;
    .end local v1    # "value$iv":Ljava/lang/Object;
    .end local v20    # "$i$a$-let-ComposerKt$cache$1$iv":I
    :goto_4a
    nop

    .line 349
    .end local v10    # "invalid$iv":Z
    .end local v12    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v14    # "$i$f$cache":I
    check-cast v0, Lkotlin/jvm/functions/Function0;

    invoke-static {v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    const/4 v1, 0x0

    invoke-static {v0, v5, v1}, Landroidx/compose/runtime/EffectsKt;->SideEffect(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V

    .line 365
    const v0, -0x4a2006c7

    invoke-static {v5, v0, v7}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v5, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v0

    .local v0, "invalid$iv":Z
    move-object v1, v5

    .local v1, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/4 v10, 0x0

    .line 1035
    .local v10, "$i$f$cache":I
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v12

    .local v12, "it$iv":Ljava/lang/Object;
    const/4 v14, 0x0

    .line 1036
    .local v14, "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez v0, :cond_65

    sget-object v20, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move/from16 p1, v0

    .end local v0    # "invalid$iv":Z
    .restart local p1    # "invalid$iv":Z
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v0

    if-ne v12, v0, :cond_64

    goto :goto_4b

    .line 1040
    :cond_64
    goto :goto_4c

    .line 1036
    .end local p1    # "invalid$iv":Z
    .restart local v0    # "invalid$iv":Z
    :cond_65
    move/from16 p1, v0

    .line 1037
    .end local v0    # "invalid$iv":Z
    .restart local p1    # "invalid$iv":Z
    :goto_4b
    const/4 v0, 0x0

    .line 365
    .local v0, "$i$a$-cache-BasicTextFieldKt$BasicTextField$3":I
    move/from16 p2, v0

    .end local v0    # "$i$a$-cache-BasicTextFieldKt$BasicTextField$3":I
    .local p2, "$i$a$-cache-BasicTextFieldKt$BasicTextField$3":I
    new-instance v0, Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$3$1;

    invoke-direct {v0, v2}, Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$3$1;-><init>(Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;)V

    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 1037
    .end local p2    # "$i$a$-cache-BasicTextFieldKt$BasicTextField$3":I
    nop

    .line 1038
    .local v0, "value$iv":Ljava/lang/Object;
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1039
    move-object v12, v0

    .line 1035
    .end local v0    # "value$iv":Ljava/lang/Object;
    .end local v12    # "it$iv":Ljava/lang/Object;
    .end local v14    # "$i$a$-let-ComposerKt$cache$1$iv":I
    :goto_4c
    nop

    .line 365
    .end local v1    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v10    # "$i$f$cache":I
    .end local p1    # "invalid$iv":Z
    check-cast v12, Lkotlin/jvm/functions/Function1;

    invoke-static {v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    const/4 v0, 0x0

    invoke-static {v2, v12, v5, v0}, Landroidx/compose/runtime/EffectsKt;->DisposableEffect(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    .line 368
    if-nez v24, :cond_66

    .line 369
    invoke-virtual/range {v27 .. v27}, Landroidx/compose/foundation/text/KeyboardOptions;->getKeyboardType-PjHm6EE()I

    move-result v0

    sget-object v1, Landroidx/compose/ui/text/input/KeyboardType;->Companion:Landroidx/compose/ui/text/input/KeyboardType$Companion;

    invoke-virtual {v1}, Landroidx/compose/ui/text/input/KeyboardType$Companion;->getPassword-PjHm6EE()I

    move-result v1

    invoke-static {v0, v1}, Landroidx/compose/ui/text/input/KeyboardType;->equals-impl0(II)Z

    move-result v0

    if-nez v0, :cond_66

    .line 370
    invoke-virtual/range {v27 .. v27}, Landroidx/compose/foundation/text/KeyboardOptions;->getKeyboardType-PjHm6EE()I

    move-result v0

    sget-object v1, Landroidx/compose/ui/text/input/KeyboardType;->Companion:Landroidx/compose/ui/text/input/KeyboardType$Companion;

    invoke-virtual {v1}, Landroidx/compose/ui/text/input/KeyboardType$Companion;->getNumberPassword-PjHm6EE()I

    move-result v1

    invoke-static {v0, v1}, Landroidx/compose/ui/text/input/KeyboardType;->equals-impl0(II)Z

    move-result v0

    if-nez v0, :cond_66

    const/4 v0, 0x1

    goto :goto_4d

    :cond_66
    const/4 v0, 0x0

    .line 367
    :goto_4d
    nop

    .line 372
    .local v0, "handwritingEnabled":Z
    nop

    .line 375
    new-instance v1, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifier;

    .line 376
    nop

    .line 377
    nop

    .line 378
    nop

    .line 379
    nop

    .line 380
    nop

    .line 381
    nop

    .line 382
    nop

    .line 383
    nop

    .line 384
    nop

    .line 385
    nop

    .line 386
    nop

    .line 387
    nop

    .line 375
    move-object/from16 p9, p12

    move-object/from16 p1, v1

    move-object/from16 p4, v2

    move-object/from16 p5, v11

    move/from16 p12, v24

    move-object/from16 p3, v32

    move-object/from16 p2, v37

    move/from16 p6, v40

    move/from16 p7, v41

    move/from16 p10, v44

    move-object/from16 p8, v46

    move-object/from16 p11, v52

    .end local v2    # "textFieldSelectionState":Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;
    .end local v11    # "inputTransformation":Landroidx/compose/foundation/text/input/InputTransformation;
    .end local v24    # "isPassword":Z
    .end local v32    # "textLayoutState":Landroidx/compose/foundation/text/input/internal/TextLayoutState;
    .end local v37    # "transformedState":Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;
    .end local v40    # "enabled":Z
    .end local v41    # "readOnly":Z
    .end local v44    # "singleLine":Z
    .end local v46    # "resolvedKeyboardOptions":Landroidx/compose/foundation/text/KeyboardOptions;
    .end local v52    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .local p2, "transformedState":Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;
    .local p3, "textLayoutState":Landroidx/compose/foundation/text/input/internal/TextLayoutState;
    .restart local p4    # "textFieldSelectionState":Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;
    .local p5, "inputTransformation":Landroidx/compose/foundation/text/input/InputTransformation;
    .local p6, "enabled":Z
    .local p7, "readOnly":Z
    .local p8, "resolvedKeyboardOptions":Landroidx/compose/foundation/text/KeyboardOptions;
    .local p9, "onKeyboardAction":Landroidx/compose/foundation/text/input/KeyboardActionHandler;
    .local p10, "singleLine":Z
    .local p11, "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .local p12, "isPassword":Z
    invoke-direct/range {p1 .. p13}, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifier;-><init>(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Landroidx/compose/foundation/text/input/InputTransformation;ZZLandroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/input/KeyboardActionHandler;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;ZLkotlinx/coroutines/flow/MutableSharedFlow;)V

    move-object/from16 v14, p1

    move-object/from16 v38, p4

    move/from16 v12, p6

    move-object/from16 v10, p8

    move-object/from16 v20, p9

    move-object/from16 v1, p11

    move-object/from16 v2, p13

    .end local p2    # "transformedState":Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;
    .end local p3    # "textLayoutState":Landroidx/compose/foundation/text/input/internal/TextLayoutState;
    .end local p4    # "textFieldSelectionState":Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;
    .end local p5    # "inputTransformation":Landroidx/compose/foundation/text/input/InputTransformation;
    .end local p6    # "enabled":Z
    .end local p7    # "readOnly":Z
    .end local p8    # "resolvedKeyboardOptions":Landroidx/compose/foundation/text/KeyboardOptions;
    .end local p9    # "onKeyboardAction":Landroidx/compose/foundation/text/input/KeyboardActionHandler;
    .end local p10    # "singleLine":Z
    .end local p11    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .end local p12    # "isPassword":Z
    .end local p13    # "stylusHandwritingTrigger":Lkotlinx/coroutines/flow/MutableSharedFlow;
    .local v1, "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .local v2, "stylusHandwritingTrigger":Lkotlinx/coroutines/flow/MutableSharedFlow;
    .local v10, "resolvedKeyboardOptions":Landroidx/compose/foundation/text/KeyboardOptions;
    .restart local v11    # "inputTransformation":Landroidx/compose/foundation/text/input/InputTransformation;
    .local v12, "enabled":Z
    .local v20, "onKeyboardAction":Landroidx/compose/foundation/text/input/KeyboardActionHandler;
    .restart local v24    # "isPassword":Z
    .restart local v32    # "textLayoutState":Landroidx/compose/foundation/text/input/internal/TextLayoutState;
    .restart local v37    # "transformedState":Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;
    .local v38, "textFieldSelectionState":Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;
    .restart local v41    # "readOnly":Z
    .restart local v44    # "singleLine":Z
    check-cast v14, Landroidx/compose/ui/Modifier;

    .line 373
    invoke-interface {v13, v14}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    .line 390
    move-object/from16 p4, v3

    .end local v3    # "density":Landroidx/compose/ui/unit/Density;
    .local p4, "density":Landroidx/compose/ui/unit/Density;
    const v3, -0x4a1f6e3f

    invoke-static {v5, v3, v7}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v5, v0}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v3

    invoke-interface {v5, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v3, v7

    .local v3, "invalid$iv":Z
    move-object v7, v5

    .local v7, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/16 v22, 0x0

    .line 1041
    .local v22, "$i$f$cache":I
    move/from16 p1, v3

    .end local v3    # "invalid$iv":Z
    .restart local p1    # "invalid$iv":Z
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v3

    .local v3, "it$iv":Ljava/lang/Object;
    const/16 v25, 0x0

    .line 1042
    .restart local v25    # "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez p1, :cond_68

    sget-object v26, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move-object/from16 p2, v4

    .end local v4    # "currentTextToolbar":Landroidx/compose/ui/platform/TextToolbar;
    .local p2, "currentTextToolbar":Landroidx/compose/ui/platform/TextToolbar;
    invoke-virtual/range {v26 .. v26}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v4

    if-ne v3, v4, :cond_67

    goto :goto_4e

    .line 1046
    :cond_67
    goto :goto_4f

    .line 1042
    .end local p2    # "currentTextToolbar":Landroidx/compose/ui/platform/TextToolbar;
    .restart local v4    # "currentTextToolbar":Landroidx/compose/ui/platform/TextToolbar;
    :cond_68
    move-object/from16 p2, v4

    .line 1043
    .end local v4    # "currentTextToolbar":Landroidx/compose/ui/platform/TextToolbar;
    .restart local p2    # "currentTextToolbar":Landroidx/compose/ui/platform/TextToolbar;
    :goto_4e
    const/4 v4, 0x0

    .line 390
    .local v4, "$i$a$-cache-BasicTextFieldKt$BasicTextField$decorationModifiers$1":I
    move-object/from16 p3, v3

    .end local v3    # "it$iv":Ljava/lang/Object;
    .local p3, "it$iv":Ljava/lang/Object;
    new-instance v3, Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$decorationModifiers$1$1;

    invoke-direct {v3, v0, v2}, Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$decorationModifiers$1$1;-><init>(ZLkotlinx/coroutines/flow/MutableSharedFlow;)V

    check-cast v3, Lkotlin/jvm/functions/Function0;

    .line 1043
    .end local v4    # "$i$a$-cache-BasicTextFieldKt$BasicTextField$decorationModifiers$1":I
    nop

    .line 1044
    .local v3, "value$iv":Ljava/lang/Object;
    invoke-interface {v7, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1045
    nop

    .line 1041
    .end local v3    # "value$iv":Ljava/lang/Object;
    .end local v25    # "$i$a$-let-ComposerKt$cache$1$iv":I
    .end local p3    # "it$iv":Ljava/lang/Object;
    :goto_4f
    nop

    .line 390
    .end local v7    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v22    # "$i$f$cache":I
    .end local p1    # "invalid$iv":Z
    check-cast v3, Lkotlin/jvm/functions/Function0;

    invoke-static {v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    invoke-static {v14, v12, v0, v3}, Landroidx/compose/foundation/text/handwriting/StylusHandwritingKt;->stylusHandwriting(Landroidx/compose/ui/Modifier;ZZLkotlin/jvm/functions/Function0;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    .line 411
    invoke-static {v3, v12, v1}, Landroidx/compose/foundation/FocusableKt;->focusable(Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;)Landroidx/compose/ui/Modifier;

    move-result-object v46

    .line 413
    move-object/from16 v47, v42

    check-cast v47, Landroidx/compose/foundation/gestures/ScrollableState;

    .line 414
    nop

    .line 419
    if-eqz v12, :cond_69

    invoke-virtual/range {v38 .. v38}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;->getDirectDragGestureInitiator()Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState$InputType;

    move-result-object v3

    sget-object v4, Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState$InputType;->None:Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState$InputType;

    if-ne v3, v4, :cond_69

    const/16 v49, 0x1

    goto :goto_50

    :cond_69
    const/16 v49, 0x0

    .line 421
    :goto_50
    sget-object v3, Landroidx/compose/foundation/gestures/ScrollableDefaults;->INSTANCE:Landroidx/compose/foundation/gestures/ScrollableDefaults;

    .line 422
    nop

    .line 423
    nop

    .line 424
    nop

    .line 421
    move-object/from16 v4, p16

    move-object/from16 v7, v48

    const/4 v14, 0x0

    .end local v48    # "orientation":Landroidx/compose/foundation/gestures/Orientation;
    .end local p16    # "layoutDirection":Landroidx/compose/ui/unit/LayoutDirection;
    .local v4, "layoutDirection":Landroidx/compose/ui/unit/LayoutDirection;
    .local v7, "orientation":Landroidx/compose/foundation/gestures/Orientation;
    invoke-virtual {v3, v4, v7, v14}, Landroidx/compose/foundation/gestures/ScrollableDefaults;->reverseDirection(Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/foundation/gestures/Orientation;Z)Z

    move-result v50

    .line 412
    nop

    .line 426
    nop

    .line 412
    const/16 v53, 0x10

    const/16 v54, 0x0

    const/16 v51, 0x0

    move-object/from16 v52, v1

    .end local v1    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .end local v7    # "orientation":Landroidx/compose/foundation/gestures/Orientation;
    .restart local v48    # "orientation":Landroidx/compose/foundation/gestures/Orientation;
    .restart local v52    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    invoke-static/range {v46 .. v54}, Landroidx/compose/foundation/gestures/ScrollableKt;->scrollable$default(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/ScrollableState;Landroidx/compose/foundation/gestures/Orientation;ZZLandroidx/compose/foundation/gestures/FlingBehavior;Landroidx/compose/foundation/interaction/MutableInteractionSource;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    .line 428
    invoke-static {}, Landroidx/compose/foundation/text/TextPointerIcon_androidKt;->getTextPointerIcon()Landroidx/compose/ui/input/pointer/PointerIcon;

    move-result-object v3

    move/from16 p1, v0

    const/4 v0, 0x2

    const/4 v7, 0x0

    .end local v0    # "handwritingEnabled":Z
    .local p1, "handwritingEnabled":Z
    invoke-static {v1, v3, v14, v0, v7}, Landroidx/compose/ui/input/pointer/PointerIconKt;->pointerHoverIcon$default(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/input/pointer/PointerIcon;ZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    .line 371
    nop

    .line 430
    .local v0, "decorationModifiers":Landroidx/compose/ui/Modifier;
    const/4 v1, 0x1

    .local v1, "propagateMinConstraints$iv":Z
    const/16 v3, 0x180

    .local v3, "$changed$iv":I
    const/4 v7, 0x0

    .line 1047
    .local v7, "$i$f$Box":I
    const v14, 0x2bb5b5d7

    move-object/from16 p3, v0

    .end local v0    # "decorationModifiers":Landroidx/compose/ui/Modifier;
    .local p3, "decorationModifiers":Landroidx/compose/ui/Modifier;
    const-string v0, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo"

    invoke-static {v5, v14, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 1048
    sget-object v0, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    move-result-object v0

    .line 1052
    .local v0, "contentAlignment$iv":Landroidx/compose/ui/Alignment;
    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    move-result-object v14

    .line 1056
    .local v14, "measurePolicy$iv":Landroidx/compose/ui/layout/MeasurePolicy;
    shl-int/lit8 v21, v3, 0x3

    and-int/lit8 v21, v21, 0x70

    .line 1053
    nop

    .local v21, "$changed$iv$iv":I
    move-object/from16 p5, p3

    .local p5, "modifier$iv$iv":Landroidx/compose/ui/Modifier;
    const/16 v22, 0x0

    .line 1057
    .local v22, "$i$f$Layout":I
    move-object/from16 p6, v0

    .end local v0    # "contentAlignment$iv":Landroidx/compose/ui/Alignment;
    .local p6, "contentAlignment$iv":Landroidx/compose/ui/Alignment;
    const v0, -0x4ee9b9da

    move/from16 p7, v1

    .end local v1    # "propagateMinConstraints$iv":Z
    .local p7, "propagateMinConstraints$iv":Z
    const-string v1, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh"

    invoke-static {v5, v0, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 1058
    const/4 v0, 0x0

    invoke-static {v5, v0}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    move-result v0

    .line 1059
    .local v0, "compositeKeyHash$iv$iv":I
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    move-result-object v1

    .line 1060
    .local v1, "localMap$iv$iv":Landroidx/compose/runtime/CompositionLocalMap;
    move/from16 p8, v0

    move-object/from16 p13, v2

    move-object/from16 v0, p5

    .end local v2    # "stylusHandwritingTrigger":Lkotlinx/coroutines/flow/MutableSharedFlow;
    .end local p5    # "modifier$iv$iv":Landroidx/compose/ui/Modifier;
    .local v0, "modifier$iv$iv":Landroidx/compose/ui/Modifier;
    .local p8, "compositeKeyHash$iv$iv":I
    .restart local p13    # "stylusHandwritingTrigger":Lkotlinx/coroutines/flow/MutableSharedFlow;
    invoke-static {v5, v0}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    .line 1062
    .local v2, "materialized$iv$iv":Landroidx/compose/ui/Modifier;
    sget-object v25, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual/range {v25 .. v25}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    move-result-object v25

    move-object/from16 v26, v0

    .end local v0    # "modifier$iv$iv":Landroidx/compose/ui/Modifier;
    .local v26, "modifier$iv$iv":Landroidx/compose/ui/Modifier;
    shl-int/lit8 v0, v21, 0x6

    and-int/lit16 v0, v0, 0x380

    or-int/lit8 v0, v0, 0x6

    .line 1061
    nop

    .local v0, "$changed$iv$iv$iv":I
    move-object/from16 p5, v25

    .local p5, "factory$iv$iv$iv":Lkotlin/jvm/functions/Function0;
    const/16 v25, 0x0

    .line 1063
    .local v25, "$i$f$ReusableComposeNode":I
    move/from16 p9, v0

    .end local v0    # "$changed$iv$iv$iv":I
    .local p9, "$changed$iv$iv$iv":I
    const v0, -0x2942ffcf

    move/from16 p10, v3

    .end local v3    # "$changed$iv":I
    .local p10, "$changed$iv":I
    const-string v3, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp"

    invoke-static {v5, v0, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 1064
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    move-result-object v0

    instance-of v0, v0, Landroidx/compose/runtime/Applier;

    if-nez v0, :cond_6a

    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 1065
    :cond_6a
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 1066
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v0

    if-eqz v0, :cond_6b

    .line 1067
    move-object/from16 v0, p5

    .end local p5    # "factory$iv$iv$iv":Lkotlin/jvm/functions/Function0;
    .local v0, "factory$iv$iv$iv":Lkotlin/jvm/functions/Function0;
    invoke-interface {v5, v0}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    goto :goto_51

    .line 1069
    .end local v0    # "factory$iv$iv$iv":Lkotlin/jvm/functions/Function0;
    .restart local p5    # "factory$iv$iv$iv":Lkotlin/jvm/functions/Function0;
    :cond_6b
    move-object/from16 v0, p5

    .end local p5    # "factory$iv$iv$iv":Lkotlin/jvm/functions/Function0;
    .restart local v0    # "factory$iv$iv$iv":Lkotlin/jvm/functions/Function0;
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 1071
    :goto_51
    invoke-static {v5}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    move-result-object v3

    .local v3, "$this$Layout_u24lambda_u240$iv$iv":Landroidx/compose/runtime/Composer;
    const/16 v28, 0x0

    .line 1072
    .local v28, "$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv":I
    sget-object v29, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    move-object/from16 v47, v0

    .end local v0    # "factory$iv$iv$iv":Lkotlin/jvm/functions/Function0;
    .local v47, "factory$iv$iv$iv":Lkotlin/jvm/functions/Function0;
    invoke-virtual/range {v29 .. v29}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    invoke-static {v3, v14, v0}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1073
    sget-object v0, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    invoke-static {v3, v1, v0}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1074
    sget-object v0, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    .local v0, "block$iv$iv$iv":Lkotlin/jvm/functions/Function2;
    const/16 v29, 0x0

    .line 1075
    .local v29, "$i$f$set-impl":I
    move-object/from16 p5, v3

    .local p5, "$this$set_impl_u24lambda_u240$iv$iv$iv":Landroidx/compose/runtime/Composer;
    const/16 v40, 0x0

    .line 1076
    .local v40, "$i$a$-with-Updater$set$1$iv$iv$iv":I
    invoke-interface/range {p5 .. p5}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v43

    if-nez v43, :cond_6d

    move-object/from16 p11, v1

    .end local v1    # "localMap$iv$iv":Landroidx/compose/runtime/CompositionLocalMap;
    .local p11, "localMap$iv$iv":Landroidx/compose/runtime/CompositionLocalMap;
    invoke-interface/range {p5 .. p5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v1

    move-object/from16 p16, v4

    .end local v4    # "layoutDirection":Landroidx/compose/ui/unit/LayoutDirection;
    .restart local p16    # "layoutDirection":Landroidx/compose/ui/unit/LayoutDirection;
    invoke-static/range {p8 .. p8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6c

    goto :goto_52

    :cond_6c
    move-object/from16 v4, p5

    goto :goto_53

    .end local p11    # "localMap$iv$iv":Landroidx/compose/runtime/CompositionLocalMap;
    .end local p16    # "layoutDirection":Landroidx/compose/ui/unit/LayoutDirection;
    .restart local v1    # "localMap$iv$iv":Landroidx/compose/runtime/CompositionLocalMap;
    .restart local v4    # "layoutDirection":Landroidx/compose/ui/unit/LayoutDirection;
    :cond_6d
    move-object/from16 p11, v1

    move-object/from16 p16, v4

    .line 1077
    .end local v1    # "localMap$iv$iv":Landroidx/compose/runtime/CompositionLocalMap;
    .end local v4    # "layoutDirection":Landroidx/compose/ui/unit/LayoutDirection;
    .restart local p11    # "localMap$iv$iv":Landroidx/compose/runtime/CompositionLocalMap;
    .restart local p16    # "layoutDirection":Landroidx/compose/ui/unit/LayoutDirection;
    :goto_52
    invoke-static/range {p8 .. p8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    move-object/from16 v4, p5

    .end local p5    # "$this$set_impl_u24lambda_u240$iv$iv$iv":Landroidx/compose/runtime/Composer;
    .local v4, "$this$set_impl_u24lambda_u240$iv$iv$iv":Landroidx/compose/runtime/Composer;
    invoke-interface {v4, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1078
    invoke-static/range {p8 .. p8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v3, v1, v0}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1080
    :goto_53
    nop

    .line 1075
    .end local v4    # "$this$set_impl_u24lambda_u240$iv$iv$iv":Landroidx/compose/runtime/Composer;
    .end local v40    # "$i$a$-with-Updater$set$1$iv$iv$iv":I
    nop

    .line 1080
    nop

    .line 1081
    .end local v0    # "block$iv$iv$iv":Lkotlin/jvm/functions/Function2;
    .end local v29    # "$i$f$set-impl":I
    sget-object v0, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    invoke-static {v3, v2, v0}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1082
    nop

    .line 1071
    .end local v3    # "$this$Layout_u24lambda_u240$iv$iv":Landroidx/compose/runtime/Composer;
    .end local v28    # "$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv":I
    nop

    .line 1083
    shr-int/lit8 v0, p9, 0x6

    and-int/lit8 v0, v0, 0xe

    .local v0, "$changed$iv":I
    move-object v1, v5

    .local v1, "$composer$iv":Landroidx/compose/runtime/Composer;
    const/4 v3, 0x0

    .line 1054
    .local v3, "$i$a$-Layout-BoxKt$Box$1$iv":I
    const v4, -0x7ff482d7

    move/from16 p5, v0

    .end local v0    # "$changed$iv":I
    .local p5, "$changed$iv":I
    const-string v0, "C72@3468L9:Box.kt#2w3rfo"

    invoke-static {v1, v4, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    sget-object v0, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    shr-int/lit8 v4, p10, 0x6

    and-int/lit8 v4, v4, 0x70

    or-int/lit8 v4, v4, 0x6

    .local v4, "$changed":I
    check-cast v0, Landroidx/compose/foundation/layout/BoxScope;

    .local v0, "$this$BasicTextField_u24lambda_u2410":Landroidx/compose/foundation/layout/BoxScope;
    move-object/from16 p12, v1

    .local p12, "$composer":Landroidx/compose/runtime/Composer;
    const/16 v28, 0x0

    .line 431
    .local v28, "$i$a$-Box-BasicTextFieldKt$BasicTextField$4":I
    move-object/from16 p17, v0

    .end local v0    # "$this$BasicTextField_u24lambda_u2410":Landroidx/compose/foundation/layout/BoxScope;
    .local p17, "$this$BasicTextField_u24lambda_u2410":Landroidx/compose/foundation/layout/BoxScope;
    const v0, 0x4a0336c8    # 2149810.0f

    move-object/from16 v49, v1

    .end local v1    # "$composer$iv":Landroidx/compose/runtime/Composer;
    .local v49, "$composer$iv":Landroidx/compose/runtime/Composer;
    const-string v1, "C430@22759L3140,430@22709L3190:BasicTextField.kt#423gt5"

    move-object/from16 v50, v2

    move-object/from16 v2, p12

    .end local p12    # "$composer":Landroidx/compose/runtime/Composer;
    .local v2, "$composer":Landroidx/compose/runtime/Composer;
    .local v50, "materialized$iv$iv":Landroidx/compose/ui/Modifier;
    invoke-static {v2, v0, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    new-instance v29, Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$4$1;

    move-object/from16 v46, v10

    move/from16 v40, v12

    move-object/from16 v43, v48

    .end local v10    # "resolvedKeyboardOptions":Landroidx/compose/foundation/text/KeyboardOptions;
    .end local v12    # "enabled":Z
    .end local v48    # "orientation":Landroidx/compose/foundation/gestures/Orientation;
    .local v40, "enabled":Z
    .local v43, "orientation":Landroidx/compose/foundation/gestures/Orientation;
    .restart local v46    # "resolvedKeyboardOptions":Landroidx/compose/foundation/text/KeyboardOptions;
    invoke-direct/range {v29 .. v46}, Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$4$1;-><init>(Landroidx/compose/foundation/text/input/TextFieldDecorator;Landroidx/compose/foundation/text/input/TextFieldLineLimits;Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/ui/text/TextStyle;ZZZLandroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Landroidx/compose/ui/graphics/Brush;ZZLandroidx/compose/foundation/ScrollState;Landroidx/compose/foundation/gestures/Orientation;ZLkotlin/jvm/functions/Function2;Landroidx/compose/foundation/text/KeyboardOptions;)V

    move-object/from16 v1, v29

    move-object/from16 v0, v38

    .end local v38    # "textFieldSelectionState":Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;
    .end local v40    # "enabled":Z
    .end local v43    # "orientation":Landroidx/compose/foundation/gestures/Orientation;
    .local v0, "textFieldSelectionState":Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;
    .restart local v12    # "enabled":Z
    .restart local v48    # "orientation":Landroidx/compose/foundation/gestures/Orientation;
    const/16 v10, 0x36

    move/from16 p12, v3

    .end local v3    # "$i$a$-Layout-BoxKt$Box$1$iv":I
    .local p12, "$i$a$-Layout-BoxKt$Box$1$iv":I
    const v3, -0x2820d9ff

    move/from16 v29, v4

    const/4 v4, 0x1

    .end local v4    # "$changed":I
    .local v29, "$changed":I
    invoke-static {v3, v4, v1, v2, v10}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v1

    check-cast v1, Lkotlin/jvm/functions/Function2;

    shr-int/lit8 v3, v6, 0x3

    and-int/lit8 v3, v3, 0x70

    or-int/lit16 v3, v3, 0x180

    invoke-static {v0, v12, v1, v2, v3}, Landroidx/compose/foundation/text/ContextMenu_androidKt;->ContextMenuArea(Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 498
    nop

    .line 1054
    .end local v2    # "$composer":Landroidx/compose/runtime/Composer;
    .end local v28    # "$i$a$-Box-BasicTextFieldKt$BasicTextField$4":I
    .end local v29    # "$changed":I
    .end local p17    # "$this$BasicTextField_u24lambda_u2410":Landroidx/compose/foundation/layout/BoxScope;
    invoke-static/range {v49 .. v49}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 1083
    .end local v49    # "$composer$iv":Landroidx/compose/runtime/Composer;
    .end local p5    # "$changed$iv":I
    .end local p12    # "$i$a$-Layout-BoxKt$Box$1$iv":I
    nop

    .line 1084
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 1063
    invoke-static {v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 1085
    nop

    .line 1057
    .end local v25    # "$i$f$ReusableComposeNode":I
    .end local v47    # "factory$iv$iv$iv":Lkotlin/jvm/functions/Function0;
    .end local p9    # "$changed$iv$iv$iv":I
    invoke-static {v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 1086
    nop

    .line 1047
    .end local v21    # "$changed$iv$iv":I
    .end local v22    # "$i$f$Layout":I
    .end local v26    # "modifier$iv$iv":Landroidx/compose/ui/Modifier;
    .end local v50    # "materialized$iv$iv":Landroidx/compose/ui/Modifier;
    .end local p8    # "compositeKeyHash$iv$iv":I
    .end local p11    # "localMap$iv$iv":Landroidx/compose/runtime/CompositionLocalMap;
    invoke-static {v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 1087
    nop

    .end local v7    # "$i$f$Box":I
    .end local v14    # "measurePolicy$iv":Landroidx/compose/ui/layout/MeasurePolicy;
    .end local p6    # "contentAlignment$iv":Landroidx/compose/ui/Alignment;
    .end local p7    # "propagateMinConstraints$iv":Z
    .end local p10    # "$changed$iv":I
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_6e

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 499
    .end local v0    # "textFieldSelectionState":Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;
    .end local v8    # "currentHapticFeedback":Landroidx/compose/ui/hapticfeedback/HapticFeedback;
    .end local v9    # "currentClipboard":Landroidx/compose/ui/platform/Clipboard;
    .end local v15    # "textToolbarHandler":Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1;
    .end local v23    # "coroutineScope":Lkotlinx/coroutines/CoroutineScope;
    .end local v32    # "textLayoutState":Landroidx/compose/foundation/text/input/internal/TextLayoutState;
    .end local v34    # "isFocused":Z
    .end local v35    # "isWindowFocused":Z
    .end local v36    # "isDragHovered":Z
    .end local v37    # "transformedState":Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;
    .end local v44    # "singleLine":Z
    .end local v46    # "resolvedKeyboardOptions":Landroidx/compose/foundation/text/KeyboardOptions;
    .end local v48    # "orientation":Landroidx/compose/foundation/gestures/Orientation;
    .end local v52    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .end local p1    # "handwritingEnabled":Z
    .end local p2    # "currentTextToolbar":Landroidx/compose/ui/platform/TextToolbar;
    .end local p3    # "decorationModifiers":Landroidx/compose/ui/Modifier;
    .end local p4    # "density":Landroidx/compose/ui/unit/Density;
    .end local p13    # "stylusHandwritingTrigger":Lkotlinx/coroutines/flow/MutableSharedFlow;
    .end local p14    # "windowInfo":Landroidx/compose/ui/platform/WindowInfo;
    .end local p16    # "layoutDirection":Landroidx/compose/ui/unit/LayoutDirection;
    :cond_6e
    move-object/from16 v49, v5

    move v0, v6

    move-object v5, v11

    move v3, v12

    move-object v2, v13

    move-object/from16 v13, v16

    move/from16 v21, v17

    move-object/from16 v14, v19

    move-object/from16 v8, v20

    move/from16 v17, v24

    move-object/from16 v7, v27

    move-object/from16 v15, v30

    move-object/from16 v9, v31

    move-object/from16 v6, v33

    move-object/from16 v12, v39

    move/from16 v4, v41

    move-object/from16 v16, v42

    move-object/from16 v10, v45

    move-object/from16 v11, p15

    goto :goto_54

    .end local v11    # "inputTransformation":Landroidx/compose/foundation/text/input/InputTransformation;
    .end local v12    # "enabled":Z
    .end local v13    # "modifier":Landroidx/compose/ui/Modifier;
    .end local v16    # "codepointTransformation":Landroidx/compose/foundation/text/input/internal/CodepointTransformation;
    .end local v17    # "$dirty1":I
    .end local v19    # "outputTransformation":Landroidx/compose/foundation/text/input/OutputTransformation;
    .end local v20    # "onKeyboardAction":Landroidx/compose/foundation/text/input/KeyboardActionHandler;
    .end local v24    # "isPassword":Z
    .end local v27    # "keyboardOptions":Landroidx/compose/foundation/text/KeyboardOptions;
    .end local v30    # "decorator":Landroidx/compose/foundation/text/input/TextFieldDecorator;
    .end local v31    # "lineLimits":Landroidx/compose/foundation/text/input/TextFieldLineLimits;
    .end local v33    # "textStyle":Landroidx/compose/ui/text/TextStyle;
    .end local v39    # "cursorBrush":Landroidx/compose/ui/graphics/Brush;
    .end local v41    # "readOnly":Z
    .end local v42    # "scrollState":Landroidx/compose/foundation/ScrollState;
    .end local v45    # "onTextLayout":Lkotlin/jvm/functions/Function2;
    .local v7, "$dirty1":I
    .local p1, "modifier":Landroidx/compose/ui/Modifier;
    .local p2, "enabled":Z
    .local p3, "readOnly":Z
    .local p4, "inputTransformation":Landroidx/compose/foundation/text/input/InputTransformation;
    .local p5, "textStyle":Landroidx/compose/ui/text/TextStyle;
    .local p6, "keyboardOptions":Landroidx/compose/foundation/text/KeyboardOptions;
    .local p7, "onKeyboardAction":Landroidx/compose/foundation/text/input/KeyboardActionHandler;
    .local p8, "lineLimits":Landroidx/compose/foundation/text/input/TextFieldLineLimits;
    .local p9, "onTextLayout":Lkotlin/jvm/functions/Function2;
    .local p10, "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .local p11, "cursorBrush":Landroidx/compose/ui/graphics/Brush;
    .local p12, "codepointTransformation":Landroidx/compose/foundation/text/input/internal/CodepointTransformation;
    .local p13, "outputTransformation":Landroidx/compose/foundation/text/input/OutputTransformation;
    .local p14, "decorator":Landroidx/compose/foundation/text/input/TextFieldDecorator;
    .local p15, "scrollState":Landroidx/compose/foundation/ScrollState;
    .local p16, "isPassword":Z
    :cond_6f
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object/from16 v8, p7

    move-object/from16 v14, p13

    move-object/from16 v16, p15

    move/from16 v17, p16

    move-object/from16 v49, v5

    move v0, v6

    move/from16 v21, v7

    move-object v6, v9

    move-object v7, v10

    move-object v5, v11

    move v3, v12

    move-object v2, v13

    move v4, v15

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v15, p14

    .end local p1    # "modifier":Landroidx/compose/ui/Modifier;
    .end local p2    # "enabled":Z
    .end local p3    # "readOnly":Z
    .end local p4    # "inputTransformation":Landroidx/compose/foundation/text/input/InputTransformation;
    .end local p5    # "textStyle":Landroidx/compose/ui/text/TextStyle;
    .end local p6    # "keyboardOptions":Landroidx/compose/foundation/text/KeyboardOptions;
    .end local p7    # "onKeyboardAction":Landroidx/compose/foundation/text/input/KeyboardActionHandler;
    .end local p8    # "lineLimits":Landroidx/compose/foundation/text/input/TextFieldLineLimits;
    .end local p9    # "onTextLayout":Lkotlin/jvm/functions/Function2;
    .end local p10    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .end local p11    # "cursorBrush":Landroidx/compose/ui/graphics/Brush;
    .end local p12    # "codepointTransformation":Landroidx/compose/foundation/text/input/internal/CodepointTransformation;
    .end local p13    # "outputTransformation":Landroidx/compose/foundation/text/input/OutputTransformation;
    .end local p14    # "decorator":Landroidx/compose/foundation/text/input/TextFieldDecorator;
    .end local p15    # "scrollState":Landroidx/compose/foundation/ScrollState;
    .end local p16    # "isPassword":Z
    .local v0, "$dirty":I
    .local v2, "modifier":Landroidx/compose/ui/Modifier;
    .local v3, "enabled":Z
    .local v4, "readOnly":Z
    .local v5, "inputTransformation":Landroidx/compose/foundation/text/input/InputTransformation;
    .local v6, "textStyle":Landroidx/compose/ui/text/TextStyle;
    .local v7, "keyboardOptions":Landroidx/compose/foundation/text/KeyboardOptions;
    .local v8, "onKeyboardAction":Landroidx/compose/foundation/text/input/KeyboardActionHandler;
    .local v9, "lineLimits":Landroidx/compose/foundation/text/input/TextFieldLineLimits;
    .local v10, "onTextLayout":Lkotlin/jvm/functions/Function2;
    .local v11, "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .local v12, "cursorBrush":Landroidx/compose/ui/graphics/Brush;
    .local v13, "codepointTransformation":Landroidx/compose/foundation/text/input/internal/CodepointTransformation;
    .local v14, "outputTransformation":Landroidx/compose/foundation/text/input/OutputTransformation;
    .local v15, "decorator":Landroidx/compose/foundation/text/input/TextFieldDecorator;
    .local v16, "scrollState":Landroidx/compose/foundation/ScrollState;
    .local v17, "isPassword":Z
    .local v21, "$dirty1":I
    .local v49, "$composer":Landroidx/compose/runtime/Composer;
    :goto_54
    invoke-interface/range {v49 .. v49}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v1

    if-eqz v1, :cond_70

    move/from16 v18, v0

    .end local v0    # "$dirty":I
    .local v18, "$dirty":I
    new-instance v0, Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$5;

    move/from16 v19, p19

    move/from16 v20, p20

    move-object/from16 v55, v1

    move/from16 v22, v18

    move-object/from16 v1, p0

    move/from16 v18, p18

    .end local v18    # "$dirty":I
    .local v22, "$dirty":I
    invoke-direct/range {v0 .. v20}, Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$5;-><init>(Landroidx/compose/foundation/text/input/TextFieldState;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/foundation/text/input/InputTransformation;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/input/KeyboardActionHandler;Landroidx/compose/foundation/text/input/TextFieldLineLimits;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/foundation/text/input/internal/CodepointTransformation;Landroidx/compose/foundation/text/input/OutputTransformation;Landroidx/compose/foundation/text/input/TextFieldDecorator;Landroidx/compose/foundation/ScrollState;ZIII)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    move-object/from16 v1, v55

    invoke-interface {v1, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    goto :goto_55

    .end local v22    # "$dirty":I
    .restart local v0    # "$dirty":I
    :cond_70
    move/from16 v22, v0

    .end local v0    # "$dirty":I
    .restart local v22    # "$dirty":I
    :goto_55
    return-void
.end method

.method public static final BasicTextField(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V
    .locals 36
    .param p0, "value"    # Landroidx/compose/ui/text/input/TextFieldValue;
    .param p1, "onValueChange"    # Lkotlin/jvm/functions/Function1;
    .param p2, "modifier"    # Landroidx/compose/ui/Modifier;
    .param p3, "enabled"    # Z
    .param p4, "readOnly"    # Z
    .param p5, "textStyle"    # Landroidx/compose/ui/text/TextStyle;
    .param p6, "keyboardOptions"    # Landroidx/compose/foundation/text/KeyboardOptions;
    .param p7, "keyboardActions"    # Landroidx/compose/foundation/text/KeyboardActions;
    .param p8, "singleLine"    # Z
    .param p9, "maxLines"    # I
    .param p10, "minLines"    # I
    .param p11, "visualTransformation"    # Landroidx/compose/ui/text/input/VisualTransformation;
    .param p12, "onTextLayout"    # Lkotlin/jvm/functions/Function1;
    .param p13, "interactionSource"    # Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .param p14, "cursorBrush"    # Landroidx/compose/ui/graphics/Brush;
    .param p15, "decorationBox"    # Lkotlin/jvm/functions/Function3;
    .param p16, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p17, "$changed"    # I
    .param p18, "$changed1"    # I
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
            "ZZ",
            "Landroidx/compose/ui/text/TextStyle;",
            "Landroidx/compose/foundation/text/KeyboardOptions;",
            "Landroidx/compose/foundation/text/KeyboardActions;",
            "ZII",
            "Landroidx/compose/ui/text/input/VisualTransformation;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/ui/text/TextLayoutResult;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
            "Landroidx/compose/ui/graphics/Brush;",
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
            "Landroidx/compose/runtime/Composer;",
            "III)V"
        }
    .end annotation

    .line 867
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p17

    move/from16 v3, p18

    move/from16 v4, p19

    const v5, 0x6b8eb362

    move-object/from16 v6, p16

    invoke-interface {v6, v5}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v6

    .end local p16    # "$composer":Landroidx/compose/runtime/Composer;
    .local v6, "$composer":Landroidx/compose/runtime/Composer;
    const-string v7, "C(BasicTextField)P(14,10,8,2,11,13,5,4,12,6,7,15,9,3)869@45734L90,867@45672L740:BasicTextField.kt#423gt5"

    invoke-static {v6, v7}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    move/from16 v7, p17

    .local v7, "$dirty":I
    move/from16 v8, p18

    .local v8, "$dirty1":I
    and-int/lit8 v9, v4, 0x1

    if-eqz v9, :cond_0

    or-int/lit8 v7, v7, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v9, v2, 0x6

    if-nez v9, :cond_2

    invoke-interface {v6, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    const/4 v9, 0x4

    goto :goto_0

    :cond_1
    const/4 v9, 0x2

    :goto_0
    or-int/2addr v7, v9

    :cond_2
    :goto_1
    and-int/lit8 v9, v4, 0x2

    if-eqz v9, :cond_3

    or-int/lit8 v7, v7, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v9, v2, 0x30

    if-nez v9, :cond_5

    invoke-interface {v6, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_4

    const/16 v9, 0x20

    goto :goto_2

    :cond_4
    const/16 v9, 0x10

    :goto_2
    or-int/2addr v7, v9

    :cond_5
    :goto_3
    and-int/lit8 v9, v4, 0x4

    if-eqz v9, :cond_6

    or-int/lit16 v7, v7, 0x180

    move-object/from16 v10, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v10, v2, 0x180

    if-nez v10, :cond_8

    move-object/from16 v10, p2

    invoke-interface {v6, v10}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_7

    const/16 v16, 0x100

    goto :goto_4

    :cond_7
    const/16 v16, 0x80

    :goto_4
    or-int v7, v7, v16

    goto :goto_5

    :cond_8
    move-object/from16 v10, p2

    :goto_5
    and-int/lit8 v16, v4, 0x8

    const/16 v17, 0x800

    const/16 v18, 0x400

    if-eqz v16, :cond_9

    or-int/lit16 v7, v7, 0xc00

    move/from16 v12, p3

    goto :goto_7

    :cond_9
    and-int/lit16 v12, v2, 0xc00

    if-nez v12, :cond_b

    move/from16 v12, p3

    invoke-interface {v6, v12}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v20

    if-eqz v20, :cond_a

    move/from16 v20, v17

    goto :goto_6

    :cond_a
    move/from16 v20, v18

    :goto_6
    or-int v7, v7, v20

    goto :goto_7

    :cond_b
    move/from16 v12, p3

    :goto_7
    and-int/lit8 v20, v4, 0x10

    const/16 v21, 0x4000

    const/16 v22, 0x2000

    if-eqz v20, :cond_c

    or-int/lit16 v7, v7, 0x6000

    move/from16 v14, p4

    goto :goto_9

    :cond_c
    and-int/lit16 v14, v2, 0x6000

    if-nez v14, :cond_e

    move/from16 v14, p4

    invoke-interface {v6, v14}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v24

    if-eqz v24, :cond_d

    move/from16 v24, v21

    goto :goto_8

    :cond_d
    move/from16 v24, v22

    :goto_8
    or-int v7, v7, v24

    goto :goto_9

    :cond_e
    move/from16 v14, p4

    :goto_9
    and-int/lit8 v24, v4, 0x20

    const/high16 v25, 0x30000

    if-eqz v24, :cond_f

    or-int v7, v7, v25

    move-object/from16 v15, p5

    goto :goto_b

    :cond_f
    and-int v26, v2, v25

    if-nez v26, :cond_11

    move-object/from16 v15, p5

    invoke-interface {v6, v15}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v27

    if-eqz v27, :cond_10

    const/high16 v27, 0x20000

    goto :goto_a

    :cond_10
    const/high16 v27, 0x10000

    :goto_a
    or-int v7, v7, v27

    goto :goto_b

    :cond_11
    move-object/from16 v15, p5

    :goto_b
    and-int/lit8 v27, v4, 0x40

    const/high16 v28, 0x180000

    if-eqz v27, :cond_12

    or-int v7, v7, v28

    move-object/from16 v13, p6

    goto :goto_d

    :cond_12
    and-int v28, v2, v28

    if-nez v28, :cond_14

    move-object/from16 v13, p6

    invoke-interface {v6, v13}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v29

    if-eqz v29, :cond_13

    const/high16 v29, 0x100000

    goto :goto_c

    :cond_13
    const/high16 v29, 0x80000

    :goto_c
    or-int v7, v7, v29

    goto :goto_d

    :cond_14
    move-object/from16 v13, p6

    :goto_d
    and-int/lit16 v11, v4, 0x80

    const/high16 v30, 0xc00000

    if-eqz v11, :cond_15

    or-int v7, v7, v30

    move-object/from16 v5, p7

    goto :goto_f

    :cond_15
    and-int v30, v2, v30

    if-nez v30, :cond_17

    move-object/from16 v5, p7

    invoke-interface {v6, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v31

    if-eqz v31, :cond_16

    const/high16 v31, 0x800000

    goto :goto_e

    :cond_16
    const/high16 v31, 0x400000

    :goto_e
    or-int v7, v7, v31

    goto :goto_f

    :cond_17
    move-object/from16 v5, p7

    :goto_f
    and-int/lit16 v2, v4, 0x100

    const/high16 v31, 0x6000000

    if-eqz v2, :cond_18

    or-int v7, v7, v31

    move/from16 v31, v2

    move/from16 v2, p8

    goto :goto_11

    :cond_18
    and-int v31, p17, v31

    if-nez v31, :cond_1a

    move/from16 v31, v2

    move/from16 v2, p8

    invoke-interface {v6, v2}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v32

    if-eqz v32, :cond_19

    const/high16 v32, 0x4000000

    goto :goto_10

    :cond_19
    const/high16 v32, 0x2000000

    :goto_10
    or-int v7, v7, v32

    goto :goto_11

    :cond_1a
    move/from16 v31, v2

    move/from16 v2, p8

    :goto_11
    const/high16 v32, 0x30000000

    and-int v32, p17, v32

    if-nez v32, :cond_1d

    and-int/lit16 v2, v4, 0x200

    if-nez v2, :cond_1b

    move/from16 v2, p9

    invoke-interface {v6, v2}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v32

    if-eqz v32, :cond_1c

    const/high16 v32, 0x20000000

    goto :goto_12

    :cond_1b
    move/from16 v2, p9

    :cond_1c
    const/high16 v32, 0x10000000

    :goto_12
    or-int v7, v7, v32

    goto :goto_13

    :cond_1d
    move/from16 v2, p9

    :goto_13
    and-int/lit16 v2, v4, 0x400

    if-eqz v2, :cond_1e

    or-int/lit8 v8, v8, 0x6

    move/from16 v32, v2

    move/from16 v2, p10

    goto :goto_15

    :cond_1e
    and-int/lit8 v32, v3, 0x6

    if-nez v32, :cond_20

    move/from16 v32, v2

    move/from16 v2, p10

    invoke-interface {v6, v2}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v33

    if-eqz v33, :cond_1f

    const/16 v33, 0x4

    goto :goto_14

    :cond_1f
    const/16 v33, 0x2

    :goto_14
    or-int v8, v8, v33

    goto :goto_15

    :cond_20
    move/from16 v32, v2

    move/from16 v2, p10

    :goto_15
    and-int/lit16 v2, v4, 0x800

    if-eqz v2, :cond_21

    or-int/lit8 v8, v8, 0x30

    move/from16 v33, v2

    move-object/from16 v2, p11

    goto :goto_17

    :cond_21
    and-int/lit8 v33, v3, 0x30

    if-nez v33, :cond_23

    move/from16 v33, v2

    move-object/from16 v2, p11

    invoke-interface {v6, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v34

    if-eqz v34, :cond_22

    const/16 v19, 0x20

    goto :goto_16

    :cond_22
    const/16 v19, 0x10

    :goto_16
    or-int v8, v8, v19

    goto :goto_17

    :cond_23
    move/from16 v33, v2

    move-object/from16 v2, p11

    :goto_17
    and-int/lit16 v2, v4, 0x1000

    if-eqz v2, :cond_24

    or-int/lit16 v8, v8, 0x180

    move/from16 v19, v2

    move-object/from16 v2, p12

    goto :goto_19

    :cond_24
    move/from16 v19, v2

    and-int/lit16 v2, v3, 0x180

    if-nez v2, :cond_26

    move-object/from16 v2, p12

    invoke-interface {v6, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v34

    if-eqz v34, :cond_25

    const/16 v23, 0x100

    goto :goto_18

    :cond_25
    const/16 v23, 0x80

    :goto_18
    or-int v8, v8, v23

    goto :goto_19

    :cond_26
    move-object/from16 v2, p12

    :goto_19
    and-int/lit16 v2, v4, 0x2000

    if-eqz v2, :cond_27

    or-int/lit16 v8, v8, 0xc00

    move/from16 v23, v2

    move-object/from16 v2, p13

    goto :goto_1b

    :cond_27
    move/from16 v23, v2

    and-int/lit16 v2, v3, 0xc00

    if-nez v2, :cond_29

    move-object/from16 v2, p13

    invoke-interface {v6, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v26

    if-eqz v26, :cond_28

    goto :goto_1a

    :cond_28
    move/from16 v17, v18

    :goto_1a
    or-int v8, v8, v17

    goto :goto_1b

    :cond_29
    move-object/from16 v2, p13

    :goto_1b
    and-int/lit16 v2, v4, 0x4000

    if-eqz v2, :cond_2a

    or-int/lit16 v8, v8, 0x6000

    move/from16 v17, v2

    move-object/from16 v2, p14

    goto :goto_1d

    :cond_2a
    move/from16 v17, v2

    and-int/lit16 v2, v3, 0x6000

    if-nez v2, :cond_2c

    move-object/from16 v2, p14

    invoke-interface {v6, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_2b

    goto :goto_1c

    :cond_2b
    move/from16 v21, v22

    :goto_1c
    or-int v8, v8, v21

    goto :goto_1d

    :cond_2c
    move-object/from16 v2, p14

    :goto_1d
    const v18, 0x8000

    and-int v18, v4, v18

    if-eqz v18, :cond_2d

    or-int v8, v8, v25

    move-object/from16 v2, p15

    goto :goto_1f

    :cond_2d
    and-int v21, v3, v25

    if-nez v21, :cond_2f

    move-object/from16 v2, p15

    invoke-interface {v6, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_2e

    const/high16 v21, 0x20000

    goto :goto_1e

    :cond_2e
    const/high16 v21, 0x10000

    :goto_1e
    or-int v8, v8, v21

    goto :goto_1f

    :cond_2f
    move-object/from16 v2, p15

    :goto_1f
    const v21, 0x12492493

    and-int v2, v7, v21

    const v3, 0x12492492

    const/16 v21, 0x0

    const/16 v22, 0x1

    if-ne v2, v3, :cond_31

    const v2, 0x12493

    and-int/2addr v2, v8

    const v3, 0x12492

    if-eq v2, v3, :cond_30

    goto :goto_20

    :cond_30
    move/from16 v2, v21

    goto :goto_21

    :cond_31
    :goto_20
    move/from16 v2, v22

    :goto_21
    and-int/lit8 v3, v7, 0x1

    invoke-interface {v6, v2, v3}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v2

    if-eqz v2, :cond_4c

    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->startDefaults()V

    const-string v2, ""

    invoke-static {v6, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 v2, p17, 0x1

    if-eqz v2, :cond_34

    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    move-result v2

    if-eqz v2, :cond_32

    goto :goto_22

    .line 864
    :cond_32
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    and-int/lit16 v2, v4, 0x200

    if-eqz v2, :cond_33

    const v2, -0x70000001

    and-int/2addr v7, v2

    :cond_33
    move/from16 v23, p9

    move/from16 v24, p10

    move-object/from16 v11, p11

    move-object/from16 v16, p12

    move-object/from16 v19, p13

    move v9, v7

    move-object v2, v10

    move-object v4, v13

    move-object v3, v15

    move-object/from16 v7, p14

    move-object/from16 v15, p15

    move v13, v12

    move-object v12, v5

    move/from16 v5, p8

    goto/16 :goto_2d

    .line 867
    :cond_34
    :goto_22
    if-eqz v9, :cond_35

    .line 852
    sget-object v2, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v2, Landroidx/compose/ui/Modifier;

    .end local p2    # "modifier":Landroidx/compose/ui/Modifier;
    .local v2, "modifier":Landroidx/compose/ui/Modifier;
    goto :goto_23

    .line 867
    .end local v2    # "modifier":Landroidx/compose/ui/Modifier;
    .restart local p2    # "modifier":Landroidx/compose/ui/Modifier;
    :cond_35
    move-object v2, v10

    .line 852
    .end local p2    # "modifier":Landroidx/compose/ui/Modifier;
    .restart local v2    # "modifier":Landroidx/compose/ui/Modifier;
    :goto_23
    if-eqz v16, :cond_36

    .line 853
    const/4 v3, 0x1

    move v12, v3

    .end local p3    # "enabled":Z
    .local v12, "enabled":Z
    :cond_36
    if-eqz v20, :cond_37

    .line 854
    const/4 v3, 0x0

    move v14, v3

    .end local p4    # "readOnly":Z
    .local v14, "readOnly":Z
    :cond_37
    if-eqz v24, :cond_38

    .line 855
    sget-object v3, Landroidx/compose/ui/text/TextStyle;->Companion:Landroidx/compose/ui/text/TextStyle$Companion;

    invoke-virtual {v3}, Landroidx/compose/ui/text/TextStyle$Companion;->getDefault()Landroidx/compose/ui/text/TextStyle;

    move-result-object v3

    move-object v15, v3

    .end local p5    # "textStyle":Landroidx/compose/ui/text/TextStyle;
    .local v15, "textStyle":Landroidx/compose/ui/text/TextStyle;
    :cond_38
    if-eqz v27, :cond_39

    .line 856
    sget-object v3, Landroidx/compose/foundation/text/KeyboardOptions;->Companion:Landroidx/compose/foundation/text/KeyboardOptions$Companion;

    invoke-virtual {v3}, Landroidx/compose/foundation/text/KeyboardOptions$Companion;->getDefault()Landroidx/compose/foundation/text/KeyboardOptions;

    move-result-object v3

    move-object v13, v3

    .end local p6    # "keyboardOptions":Landroidx/compose/foundation/text/KeyboardOptions;
    .local v13, "keyboardOptions":Landroidx/compose/foundation/text/KeyboardOptions;
    :cond_39
    if-eqz v11, :cond_3a

    .line 857
    sget-object v3, Landroidx/compose/foundation/text/KeyboardActions;->Companion:Landroidx/compose/foundation/text/KeyboardActions$Companion;

    invoke-virtual {v3}, Landroidx/compose/foundation/text/KeyboardActions$Companion;->getDefault()Landroidx/compose/foundation/text/KeyboardActions;

    move-result-object v3

    .end local p7    # "keyboardActions":Landroidx/compose/foundation/text/KeyboardActions;
    .local v3, "keyboardActions":Landroidx/compose/foundation/text/KeyboardActions;
    goto :goto_24

    .line 856
    .end local v3    # "keyboardActions":Landroidx/compose/foundation/text/KeyboardActions;
    .restart local p7    # "keyboardActions":Landroidx/compose/foundation/text/KeyboardActions;
    :cond_3a
    move-object v3, v5

    .line 857
    .end local p7    # "keyboardActions":Landroidx/compose/foundation/text/KeyboardActions;
    .restart local v3    # "keyboardActions":Landroidx/compose/foundation/text/KeyboardActions;
    :goto_24
    if-eqz v31, :cond_3b

    .line 858
    const/4 v5, 0x0

    .end local p8    # "singleLine":Z
    .local v5, "singleLine":Z
    goto :goto_25

    .line 857
    .end local v5    # "singleLine":Z
    .restart local p8    # "singleLine":Z
    :cond_3b
    move/from16 v5, p8

    .line 858
    .end local p8    # "singleLine":Z
    .restart local v5    # "singleLine":Z
    :goto_25
    and-int/lit16 v9, v4, 0x200

    if-eqz v9, :cond_3d

    .line 859
    if-eqz v5, :cond_3c

    move/from16 v9, v22

    goto :goto_26

    :cond_3c
    const v9, 0x7fffffff

    .end local p9    # "maxLines":I
    .local v9, "maxLines":I
    :goto_26
    const v10, -0x70000001

    and-int/2addr v7, v10

    goto :goto_27

    .line 858
    .end local v9    # "maxLines":I
    .restart local p9    # "maxLines":I
    :cond_3d
    move/from16 v9, p9

    .line 859
    .end local p9    # "maxLines":I
    .restart local v9    # "maxLines":I
    :goto_27
    if-eqz v32, :cond_3e

    .line 860
    const/4 v10, 0x1

    .end local p10    # "minLines":I
    .local v10, "minLines":I
    goto :goto_28

    .line 859
    .end local v10    # "minLines":I
    .restart local p10    # "minLines":I
    :cond_3e
    move/from16 v10, p10

    .line 860
    .end local p10    # "minLines":I
    .restart local v10    # "minLines":I
    :goto_28
    if-eqz v33, :cond_3f

    .line 861
    sget-object v11, Landroidx/compose/ui/text/input/VisualTransformation;->Companion:Landroidx/compose/ui/text/input/VisualTransformation$Companion;

    invoke-virtual {v11}, Landroidx/compose/ui/text/input/VisualTransformation$Companion;->getNone()Landroidx/compose/ui/text/input/VisualTransformation;

    move-result-object v11

    .end local p11    # "visualTransformation":Landroidx/compose/ui/text/input/VisualTransformation;
    .local v11, "visualTransformation":Landroidx/compose/ui/text/input/VisualTransformation;
    goto :goto_29

    .line 860
    .end local v11    # "visualTransformation":Landroidx/compose/ui/text/input/VisualTransformation;
    .restart local p11    # "visualTransformation":Landroidx/compose/ui/text/input/VisualTransformation;
    :cond_3f
    move-object/from16 v11, p11

    .line 861
    .end local p11    # "visualTransformation":Landroidx/compose/ui/text/input/VisualTransformation;
    .restart local v11    # "visualTransformation":Landroidx/compose/ui/text/input/VisualTransformation;
    :goto_29
    if-eqz v19, :cond_40

    .line 862
    sget-object v16, Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$10;->INSTANCE:Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$10;

    check-cast v16, Lkotlin/jvm/functions/Function1;

    .end local p12    # "onTextLayout":Lkotlin/jvm/functions/Function1;
    .local v16, "onTextLayout":Lkotlin/jvm/functions/Function1;
    goto :goto_2a

    .line 861
    .end local v16    # "onTextLayout":Lkotlin/jvm/functions/Function1;
    .restart local p12    # "onTextLayout":Lkotlin/jvm/functions/Function1;
    :cond_40
    move-object/from16 v16, p12

    .line 862
    .end local p12    # "onTextLayout":Lkotlin/jvm/functions/Function1;
    .restart local v16    # "onTextLayout":Lkotlin/jvm/functions/Function1;
    :goto_2a
    if-eqz v23, :cond_41

    .line 863
    const/16 v19, 0x0

    .end local p13    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .local v19, "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    goto :goto_2b

    .line 862
    .end local v19    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .restart local p13    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    :cond_41
    move-object/from16 v19, p13

    .line 863
    .end local p13    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .restart local v19    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    :goto_2b
    if-eqz v17, :cond_42

    .line 864
    move-object/from16 p2, v2

    .end local v2    # "modifier":Landroidx/compose/ui/Modifier;
    .restart local p2    # "modifier":Landroidx/compose/ui/Modifier;
    new-instance v2, Landroidx/compose/ui/graphics/SolidColor;

    sget-object v17, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    move-object/from16 p3, v3

    .end local v3    # "keyboardActions":Landroidx/compose/foundation/text/KeyboardActions;
    .local p3, "keyboardActions":Landroidx/compose/foundation/text/KeyboardActions;
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    move-result-wide v3

    move/from16 p4, v5

    .end local v5    # "singleLine":Z
    .local p4, "singleLine":Z
    const/4 v5, 0x0

    invoke-direct {v2, v3, v4, v5}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v2, Landroidx/compose/ui/graphics/Brush;

    .end local p14    # "cursorBrush":Landroidx/compose/ui/graphics/Brush;
    .local v2, "cursorBrush":Landroidx/compose/ui/graphics/Brush;
    goto :goto_2c

    .line 863
    .end local p2    # "modifier":Landroidx/compose/ui/Modifier;
    .end local p3    # "keyboardActions":Landroidx/compose/foundation/text/KeyboardActions;
    .end local p4    # "singleLine":Z
    .local v2, "modifier":Landroidx/compose/ui/Modifier;
    .restart local v3    # "keyboardActions":Landroidx/compose/foundation/text/KeyboardActions;
    .restart local v5    # "singleLine":Z
    .restart local p14    # "cursorBrush":Landroidx/compose/ui/graphics/Brush;
    :cond_42
    move-object/from16 p2, v2

    move-object/from16 p3, v3

    move/from16 p4, v5

    .end local v2    # "modifier":Landroidx/compose/ui/Modifier;
    .end local v3    # "keyboardActions":Landroidx/compose/foundation/text/KeyboardActions;
    .end local v5    # "singleLine":Z
    .restart local p2    # "modifier":Landroidx/compose/ui/Modifier;
    .restart local p3    # "keyboardActions":Landroidx/compose/foundation/text/KeyboardActions;
    .restart local p4    # "singleLine":Z
    move-object/from16 v2, p14

    .line 864
    .end local p14    # "cursorBrush":Landroidx/compose/ui/graphics/Brush;
    .local v2, "cursorBrush":Landroidx/compose/ui/graphics/Brush;
    :goto_2c
    if-eqz v18, :cond_43

    sget-object v3, Landroidx/compose/foundation/text/ComposableSingletons$BasicTextFieldKt;->INSTANCE:Landroidx/compose/foundation/text/ComposableSingletons$BasicTextFieldKt;

    invoke-virtual {v3}, Landroidx/compose/foundation/text/ComposableSingletons$BasicTextFieldKt;->getLambda-2$foundation_release()Lkotlin/jvm/functions/Function3;

    move-result-object v3

    move-object v4, v15

    move-object v15, v3

    move-object v3, v4

    move/from16 v5, p4

    move/from16 v23, v9

    move/from16 v24, v10

    move-object v4, v13

    move v9, v7

    move v13, v12

    move-object/from16 v12, p3

    move-object v7, v2

    move-object/from16 v2, p2

    .end local p15    # "decorationBox":Lkotlin/jvm/functions/Function3;
    .local v3, "decorationBox":Lkotlin/jvm/functions/Function3;
    goto :goto_2d

    .end local v3    # "decorationBox":Lkotlin/jvm/functions/Function3;
    .restart local p15    # "decorationBox":Lkotlin/jvm/functions/Function3;
    :cond_43
    move/from16 v5, p4

    move/from16 v23, v9

    move/from16 v24, v10

    move-object v4, v13

    move-object v3, v15

    move-object/from16 v15, p15

    move v9, v7

    move v13, v12

    move-object/from16 v12, p3

    move-object v7, v2

    move-object/from16 v2, p2

    .end local v10    # "minLines":I
    .end local p2    # "modifier":Landroidx/compose/ui/Modifier;
    .end local p3    # "keyboardActions":Landroidx/compose/foundation/text/KeyboardActions;
    .end local p4    # "singleLine":Z
    .end local p15    # "decorationBox":Lkotlin/jvm/functions/Function3;
    .local v2, "modifier":Landroidx/compose/ui/Modifier;
    .local v3, "textStyle":Landroidx/compose/ui/text/TextStyle;
    .local v4, "keyboardOptions":Landroidx/compose/foundation/text/KeyboardOptions;
    .restart local v5    # "singleLine":Z
    .local v7, "cursorBrush":Landroidx/compose/ui/graphics/Brush;
    .local v9, "$dirty":I
    .local v12, "keyboardActions":Landroidx/compose/foundation/text/KeyboardActions;
    .local v13, "enabled":Z
    .local v15, "decorationBox":Lkotlin/jvm/functions/Function3;
    .local v23, "maxLines":I
    .local v24, "minLines":I
    :goto_2d
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endDefaults()V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v10

    if-eqz v10, :cond_44

    .line 867
    const-string v10, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:866)"

    move-object/from16 p2, v2

    const v2, 0x6b8eb362

    .end local v2    # "modifier":Landroidx/compose/ui/Modifier;
    .restart local p2    # "modifier":Landroidx/compose/ui/Modifier;
    invoke-static {v2, v9, v8, v10}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    goto :goto_2e

    .line 864
    .end local p2    # "modifier":Landroidx/compose/ui/Modifier;
    .restart local v2    # "modifier":Landroidx/compose/ui/Modifier;
    :cond_44
    move-object/from16 p2, v2

    .line 881
    .end local v2    # "modifier":Landroidx/compose/ui/Modifier;
    .restart local p2    # "modifier":Landroidx/compose/ui/Modifier;
    :goto_2e
    move-object v2, v11

    .end local v11    # "visualTransformation":Landroidx/compose/ui/text/input/VisualTransformation;
    .local v2, "visualTransformation":Landroidx/compose/ui/text/input/VisualTransformation;
    invoke-virtual {v4, v5}, Landroidx/compose/foundation/text/KeyboardOptions;->toImeOptions$foundation_release(Z)Landroidx/compose/ui/text/input/ImeOptions;

    move-result-object v11

    .line 883
    nop

    .line 884
    move v10, v8

    .end local v8    # "$dirty1":I
    .local v10, "$dirty1":I
    xor-int/lit8 v8, v5, 0x1

    move/from16 v17, v10

    if-eqz v5, :cond_45

    move/from16 v10, v22

    goto :goto_2f

    :cond_45
    move/from16 v10, v24

    .line 885
    .end local v10    # "$dirty1":I
    .local v17, "$dirty1":I
    :goto_2f
    if-eqz v5, :cond_46

    move/from16 v18, v22

    goto :goto_30

    :cond_46
    move/from16 v18, v23

    .line 869
    :goto_30
    nop

    .line 870
    move-object/from16 p3, v2

    .end local v2    # "visualTransformation":Landroidx/compose/ui/text/input/VisualTransformation;
    .local p3, "visualTransformation":Landroidx/compose/ui/text/input/VisualTransformation;
    const v2, -0x4a131a60

    move-object/from16 p4, v3

    .end local v3    # "textStyle":Landroidx/compose/ui/text/TextStyle;
    .local p4, "textStyle":Landroidx/compose/ui/text/TextStyle;
    const-string v3, "CC(remember):BasicTextField.kt#9igjgp"

    invoke-static {v6, v2, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    and-int/lit8 v2, v9, 0xe

    const/4 v3, 0x4

    if-ne v2, v3, :cond_47

    move/from16 v2, v22

    goto :goto_31

    :cond_47
    move/from16 v2, v21

    :goto_31
    and-int/lit8 v3, v9, 0x70

    move/from16 p5, v2

    const/16 v2, 0x20

    if-ne v3, v2, :cond_48

    move/from16 v21, v22

    :cond_48
    or-int v2, p5, v21

    .local v2, "invalid$iv":Z
    move-object v3, v6

    .local v3, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/16 v20, 0x0

    .line 1166
    .local v20, "$i$f$cache":I
    move/from16 p5, v2

    .end local v2    # "invalid$iv":Z
    .local p5, "invalid$iv":Z
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v2

    .local v2, "it$iv":Ljava/lang/Object;
    const/16 v21, 0x0

    .line 1167
    .local v21, "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez p5, :cond_4a

    sget-object v22, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move-object/from16 v25, v4

    .end local v4    # "keyboardOptions":Landroidx/compose/foundation/text/KeyboardOptions;
    .local v25, "keyboardOptions":Landroidx/compose/foundation/text/KeyboardOptions;
    invoke-virtual/range {v22 .. v22}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v4

    if-ne v2, v4, :cond_49

    goto :goto_32

    .line 1171
    :cond_49
    goto :goto_33

    .line 1167
    .end local v25    # "keyboardOptions":Landroidx/compose/foundation/text/KeyboardOptions;
    .restart local v4    # "keyboardOptions":Landroidx/compose/foundation/text/KeyboardOptions;
    :cond_4a
    move-object/from16 v25, v4

    .line 1168
    .end local v4    # "keyboardOptions":Landroidx/compose/foundation/text/KeyboardOptions;
    .restart local v25    # "keyboardOptions":Landroidx/compose/foundation/text/KeyboardOptions;
    :goto_32
    const/4 v4, 0x0

    .line 870
    .local v4, "$i$a$-cache-BasicTextFieldKt$BasicTextField$11":I
    move-object/from16 p6, v2

    .end local v2    # "it$iv":Ljava/lang/Object;
    .local p6, "it$iv":Ljava/lang/Object;
    new-instance v2, Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$11$1;

    invoke-direct {v2, v0, v1}, Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$11$1;-><init>(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;)V

    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 1168
    .end local v4    # "$i$a$-cache-BasicTextFieldKt$BasicTextField$11":I
    nop

    .line 1169
    .local v2, "value$iv":Ljava/lang/Object;
    invoke-interface {v3, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1170
    nop

    .line 1166
    .end local v2    # "value$iv":Ljava/lang/Object;
    .end local v21    # "$i$a$-let-ComposerKt$cache$1$iv":I
    .end local p6    # "it$iv":Ljava/lang/Object;
    :goto_33
    nop

    .line 870
    .end local v3    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v20    # "$i$f$cache":I
    .end local p5    # "invalid$iv":Z
    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 875
    nop

    .line 876
    nop

    .line 877
    nop

    .line 878
    nop

    .line 879
    nop

    .line 880
    nop

    .line 883
    nop

    .line 885
    nop

    .line 884
    nop

    .line 881
    nop

    .line 882
    nop

    .line 887
    nop

    .line 888
    nop

    .line 886
    and-int/lit8 v3, v9, 0xe

    and-int/lit16 v4, v9, 0x380

    or-int/2addr v3, v4

    shr-int/lit8 v4, v9, 0x6

    and-int/lit16 v4, v4, 0x1c00

    or-int/2addr v3, v4

    shl-int/lit8 v4, v17, 0x9

    const v20, 0xe000

    and-int v4, v4, v20

    or-int/2addr v3, v4

    shl-int/lit8 v4, v17, 0x9

    const/high16 v20, 0x70000

    and-int v4, v4, v20

    or-int/2addr v3, v4

    shl-int/lit8 v4, v17, 0x9

    const/high16 v20, 0x380000

    and-int v4, v4, v20

    or-int/2addr v3, v4

    const/high16 v4, 0x1c00000

    shl-int/lit8 v20, v17, 0x9

    and-int v4, v20, v4

    or-int/2addr v3, v4

    shr-int/lit8 v4, v9, 0xf

    and-int/lit16 v4, v4, 0x380

    and-int/lit16 v0, v9, 0x1c00

    or-int/2addr v0, v4

    const v4, 0xe000

    and-int/2addr v4, v9

    or-int/2addr v0, v4

    const/high16 v4, 0x70000

    and-int v4, v17, v4

    or-int/2addr v0, v4

    .line 868
    move v4, v5

    move-object/from16 v5, v16

    .end local v16    # "onTextLayout":Lkotlin/jvm/functions/Function1;
    .local v4, "singleLine":Z
    .local v5, "onTextLayout":Lkotlin/jvm/functions/Function1;
    const/16 v16, 0x0

    const/high16 v20, 0x10000

    move-object v1, v2

    move/from16 v26, v4

    move/from16 v22, v9

    move/from16 v21, v17

    move/from16 v9, v18

    move-object/from16 v2, p2

    move-object/from16 v4, p3

    move/from16 v18, v3

    move-object/from16 v17, v6

    move-object/from16 v6, v19

    move-object/from16 v3, p4

    move/from16 v19, v0

    move-object/from16 v0, p0

    .end local v9    # "$dirty":I
    .end local v19    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .end local p2    # "modifier":Landroidx/compose/ui/Modifier;
    .end local p3    # "visualTransformation":Landroidx/compose/ui/text/input/VisualTransformation;
    .end local p4    # "textStyle":Landroidx/compose/ui/text/TextStyle;
    .local v2, "modifier":Landroidx/compose/ui/Modifier;
    .local v3, "textStyle":Landroidx/compose/ui/text/TextStyle;
    .local v4, "visualTransformation":Landroidx/compose/ui/text/input/VisualTransformation;
    .local v6, "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .local v17, "$composer":Landroidx/compose/runtime/Composer;
    .local v21, "$dirty1":I
    .local v22, "$dirty":I
    .local v26, "singleLine":Z
    invoke-static/range {v0 .. v20}, Landroidx/compose/foundation/text/CoreTextFieldKt;->CoreTextField(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;ZIILandroidx/compose/ui/text/input/ImeOptions;Landroidx/compose/foundation/text/KeyboardActions;ZZLkotlin/jvm/functions/Function3;Landroidx/compose/foundation/text/TextFieldScrollerPosition;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v20, v17

    .end local v17    # "$composer":Landroidx/compose/runtime/Composer;
    .local v20, "$composer":Landroidx/compose/runtime/Composer;
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_4b

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 890
    :cond_4b
    move-object v8, v12

    move-object/from16 v16, v15

    move/from16 v10, v23

    move/from16 v11, v24

    move/from16 v9, v26

    move-object v12, v4

    move-object v15, v7

    move v4, v13

    move-object/from16 v7, v25

    move-object v13, v5

    move v5, v14

    move-object v14, v6

    move-object v6, v3

    move-object v3, v2

    goto :goto_34

    .end local v2    # "modifier":Landroidx/compose/ui/Modifier;
    .end local v3    # "textStyle":Landroidx/compose/ui/text/TextStyle;
    .end local v4    # "visualTransformation":Landroidx/compose/ui/text/input/VisualTransformation;
    .end local v5    # "onTextLayout":Lkotlin/jvm/functions/Function1;
    .end local v12    # "keyboardActions":Landroidx/compose/foundation/text/KeyboardActions;
    .end local v13    # "enabled":Z
    .end local v14    # "readOnly":Z
    .end local v15    # "decorationBox":Lkotlin/jvm/functions/Function3;
    .end local v20    # "$composer":Landroidx/compose/runtime/Composer;
    .end local v21    # "$dirty1":I
    .end local v22    # "$dirty":I
    .end local v23    # "maxLines":I
    .end local v24    # "minLines":I
    .end local v25    # "keyboardOptions":Landroidx/compose/foundation/text/KeyboardOptions;
    .end local v26    # "singleLine":Z
    .local v6, "$composer":Landroidx/compose/runtime/Composer;
    .local v7, "$dirty":I
    .restart local v8    # "$dirty1":I
    .restart local p2    # "modifier":Landroidx/compose/ui/Modifier;
    .local p3, "enabled":Z
    .local p4, "readOnly":Z
    .local p5, "textStyle":Landroidx/compose/ui/text/TextStyle;
    .local p6, "keyboardOptions":Landroidx/compose/foundation/text/KeyboardOptions;
    .restart local p7    # "keyboardActions":Landroidx/compose/foundation/text/KeyboardActions;
    .restart local p8    # "singleLine":Z
    .restart local p9    # "maxLines":I
    .restart local p10    # "minLines":I
    .restart local p11    # "visualTransformation":Landroidx/compose/ui/text/input/VisualTransformation;
    .restart local p12    # "onTextLayout":Lkotlin/jvm/functions/Function1;
    .restart local p13    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .restart local p14    # "cursorBrush":Landroidx/compose/ui/graphics/Brush;
    .restart local p15    # "decorationBox":Lkotlin/jvm/functions/Function3;
    :cond_4c
    move-object/from16 v20, v6

    move/from16 v21, v8

    .end local v6    # "$composer":Landroidx/compose/runtime/Composer;
    .end local v8    # "$dirty1":I
    .restart local v20    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v21    # "$dirty1":I
    invoke-interface/range {v20 .. v20}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move/from16 v9, p8

    move/from16 v11, p10

    move-object/from16 v16, p15

    move-object v8, v5

    move/from16 v22, v7

    move-object v3, v10

    move v4, v12

    move-object v7, v13

    move v5, v14

    move-object v6, v15

    move/from16 v10, p9

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    .end local p2    # "modifier":Landroidx/compose/ui/Modifier;
    .end local p3    # "enabled":Z
    .end local p4    # "readOnly":Z
    .end local p5    # "textStyle":Landroidx/compose/ui/text/TextStyle;
    .end local p6    # "keyboardOptions":Landroidx/compose/foundation/text/KeyboardOptions;
    .end local p7    # "keyboardActions":Landroidx/compose/foundation/text/KeyboardActions;
    .end local p8    # "singleLine":Z
    .end local p9    # "maxLines":I
    .end local p10    # "minLines":I
    .end local p11    # "visualTransformation":Landroidx/compose/ui/text/input/VisualTransformation;
    .end local p12    # "onTextLayout":Lkotlin/jvm/functions/Function1;
    .end local p13    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .end local p14    # "cursorBrush":Landroidx/compose/ui/graphics/Brush;
    .end local p15    # "decorationBox":Lkotlin/jvm/functions/Function3;
    .local v3, "modifier":Landroidx/compose/ui/Modifier;
    .local v4, "enabled":Z
    .local v5, "readOnly":Z
    .local v6, "textStyle":Landroidx/compose/ui/text/TextStyle;
    .local v7, "keyboardOptions":Landroidx/compose/foundation/text/KeyboardOptions;
    .local v8, "keyboardActions":Landroidx/compose/foundation/text/KeyboardActions;
    .local v9, "singleLine":Z
    .local v10, "maxLines":I
    .local v11, "minLines":I
    .local v12, "visualTransformation":Landroidx/compose/ui/text/input/VisualTransformation;
    .local v13, "onTextLayout":Lkotlin/jvm/functions/Function1;
    .local v14, "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .local v15, "cursorBrush":Landroidx/compose/ui/graphics/Brush;
    .local v16, "decorationBox":Lkotlin/jvm/functions/Function3;
    .restart local v22    # "$dirty":I
    :goto_34
    invoke-interface/range {v20 .. v20}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v0

    if-eqz v0, :cond_4d

    move-object v1, v0

    new-instance v0, Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$12;

    move-object/from16 v2, p1

    move/from16 v17, p17

    move/from16 v18, p18

    move/from16 v19, p19

    move-object/from16 v35, v1

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v19}, Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$12;-><init>(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Lkotlin/jvm/functions/Function3;III)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    move-object/from16 v1, v35

    invoke-interface {v1, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_4d
    return-void
.end method

.method public static final synthetic BasicTextField(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V
    .locals 36
    .param p0, "value"    # Landroidx/compose/ui/text/input/TextFieldValue;
    .param p1, "onValueChange"    # Lkotlin/jvm/functions/Function1;
    .param p2, "modifier"    # Landroidx/compose/ui/Modifier;
    .param p3, "enabled"    # Z
    .param p4, "readOnly"    # Z
    .param p5, "textStyle"    # Landroidx/compose/ui/text/TextStyle;
    .param p6, "keyboardOptions"    # Landroidx/compose/foundation/text/KeyboardOptions;
    .param p7, "keyboardActions"    # Landroidx/compose/foundation/text/KeyboardActions;
    .param p8, "singleLine"    # Z
    .param p9, "maxLines"    # I
    .param p10, "visualTransformation"    # Landroidx/compose/ui/text/input/VisualTransformation;
    .param p11, "onTextLayout"    # Lkotlin/jvm/functions/Function1;
    .param p12, "interactionSource"    # Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .param p13, "cursorBrush"    # Landroidx/compose/ui/graphics/Brush;
    .param p14, "decorationBox"    # Lkotlin/jvm/functions/Function3;
    .param p15, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p16, "$changed"    # I
    .param p17, "$changed1"    # I
    .annotation runtime Lkotlin/Deprecated;
        level = .enum Lkotlin/DeprecationLevel;->HIDDEN:Lkotlin/DeprecationLevel;
        message = "Maintained for binary compatibility"
    .end annotation

    .line 951
    move/from16 v0, p16

    move/from16 v1, p17

    move/from16 v2, p18

    const v3, -0x2168495b

    move-object/from16 v4, p15

    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v4

    .end local p15    # "$composer":Landroidx/compose/runtime/Composer;
    .local v4, "$composer":Landroidx/compose/runtime/Composer;
    const-string v5, "C(BasicTextField)P(13,9,7,2,10,12,5,4,11,6,14,8,3)946@48627L39,951@48867L579:BasicTextField.kt#423gt5"

    invoke-static {v4, v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    move/from16 v5, p16

    .local v5, "$dirty":I
    move/from16 v6, p17

    .local v6, "$dirty1":I
    and-int/lit8 v7, v2, 0x1

    if-eqz v7, :cond_0

    or-int/lit8 v5, v5, 0x6

    move-object/from16 v7, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v7, v0, 0x6

    if-nez v7, :cond_2

    move-object/from16 v7, p0

    invoke-interface {v4, v7}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_1

    const/4 v10, 0x4

    goto :goto_0

    :cond_1
    const/4 v10, 0x2

    :goto_0
    or-int/2addr v5, v10

    goto :goto_1

    :cond_2
    move-object/from16 v7, p0

    :goto_1
    and-int/lit8 v10, v2, 0x2

    if-eqz v10, :cond_3

    or-int/lit8 v5, v5, 0x30

    move-object/from16 v10, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v10, v0, 0x30

    if-nez v10, :cond_5

    move-object/from16 v10, p1

    invoke-interface {v4, v10}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_4

    const/16 v13, 0x20

    goto :goto_2

    :cond_4
    const/16 v13, 0x10

    :goto_2
    or-int/2addr v5, v13

    goto :goto_3

    :cond_5
    move-object/from16 v10, p1

    :goto_3
    and-int/lit8 v13, v2, 0x4

    if-eqz v13, :cond_6

    or-int/lit16 v5, v5, 0x180

    move-object/from16 v8, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v8, v0, 0x180

    if-nez v8, :cond_8

    move-object/from16 v8, p2

    invoke-interface {v4, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

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
    move-object/from16 v8, p2

    :goto_5
    and-int/lit8 v16, v2, 0x8

    const/16 v17, 0x800

    const/16 v18, 0x400

    if-eqz v16, :cond_9

    or-int/lit16 v5, v5, 0xc00

    move/from16 v9, p3

    goto :goto_7

    :cond_9
    and-int/lit16 v9, v0, 0xc00

    if-nez v9, :cond_b

    move/from16 v9, p3

    invoke-interface {v4, v9}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v20

    if-eqz v20, :cond_a

    move/from16 v20, v17

    goto :goto_6

    :cond_a
    move/from16 v20, v18

    :goto_6
    or-int v5, v5, v20

    goto :goto_7

    :cond_b
    move/from16 v9, p3

    :goto_7
    and-int/lit8 v20, v2, 0x10

    const/16 v21, 0x4000

    const/16 v22, 0x2000

    if-eqz v20, :cond_c

    or-int/lit16 v5, v5, 0x6000

    move/from16 v11, p4

    goto :goto_9

    :cond_c
    and-int/lit16 v11, v0, 0x6000

    if-nez v11, :cond_e

    move/from16 v11, p4

    invoke-interface {v4, v11}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v24

    if-eqz v24, :cond_d

    move/from16 v24, v21

    goto :goto_8

    :cond_d
    move/from16 v24, v22

    :goto_8
    or-int v5, v5, v24

    goto :goto_9

    :cond_e
    move/from16 v11, p4

    :goto_9
    and-int/lit8 v24, v2, 0x20

    const/high16 v25, 0x30000

    if-eqz v24, :cond_f

    or-int v5, v5, v25

    move-object/from16 v12, p5

    goto :goto_b

    :cond_f
    and-int v25, v0, v25

    if-nez v25, :cond_11

    move-object/from16 v12, p5

    invoke-interface {v4, v12}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v26

    if-eqz v26, :cond_10

    const/high16 v26, 0x20000

    goto :goto_a

    :cond_10
    const/high16 v26, 0x10000

    :goto_a
    or-int v5, v5, v26

    goto :goto_b

    :cond_11
    move-object/from16 v12, p5

    :goto_b
    and-int/lit8 v26, v2, 0x40

    const/high16 v27, 0x180000

    if-eqz v26, :cond_12

    or-int v5, v5, v27

    move-object/from16 v14, p6

    goto :goto_d

    :cond_12
    and-int v27, v0, v27

    if-nez v27, :cond_14

    move-object/from16 v14, p6

    invoke-interface {v4, v14}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

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
    move-object/from16 v14, p6

    :goto_d
    and-int/lit16 v15, v2, 0x80

    const/high16 v29, 0xc00000

    if-eqz v15, :cond_15

    or-int v5, v5, v29

    move-object/from16 v3, p7

    goto :goto_f

    :cond_15
    and-int v29, v0, v29

    if-nez v29, :cond_17

    move-object/from16 v3, p7

    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

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
    move-object/from16 v3, p7

    :goto_f
    and-int/lit16 v0, v2, 0x100

    const/high16 v30, 0x6000000

    if-eqz v0, :cond_18

    or-int v5, v5, v30

    move/from16 v30, v0

    move/from16 v0, p8

    goto :goto_11

    :cond_18
    and-int v30, p16, v30

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
    and-int/lit16 v0, v2, 0x200

    const/high16 v31, 0x30000000

    if-eqz v0, :cond_1b

    or-int v5, v5, v31

    move/from16 v31, v0

    move/from16 v0, p9

    goto :goto_13

    :cond_1b
    and-int v31, p16, v31

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
    and-int/lit16 v0, v2, 0x400

    if-eqz v0, :cond_1e

    or-int/lit8 v6, v6, 0x6

    move/from16 v32, v0

    move-object/from16 v0, p10

    goto :goto_15

    :cond_1e
    and-int/lit8 v32, v1, 0x6

    if-nez v32, :cond_20

    move/from16 v32, v0

    move-object/from16 v0, p10

    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v33

    if-eqz v33, :cond_1f

    const/16 v19, 0x4

    goto :goto_14

    :cond_1f
    const/16 v19, 0x2

    :goto_14
    or-int v6, v6, v19

    goto :goto_15

    :cond_20
    move/from16 v32, v0

    move-object/from16 v0, p10

    :goto_15
    and-int/lit16 v0, v2, 0x800

    if-eqz v0, :cond_21

    or-int/lit8 v6, v6, 0x30

    move/from16 v19, v0

    move-object/from16 v0, p11

    goto :goto_17

    :cond_21
    and-int/lit8 v19, v1, 0x30

    if-nez v19, :cond_23

    move/from16 v19, v0

    move-object/from16 v0, p11

    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v33

    if-eqz v33, :cond_22

    const/16 v23, 0x20

    goto :goto_16

    :cond_22
    const/16 v23, 0x10

    :goto_16
    or-int v6, v6, v23

    goto :goto_17

    :cond_23
    move/from16 v19, v0

    move-object/from16 v0, p11

    :goto_17
    and-int/lit16 v0, v2, 0x1000

    if-eqz v0, :cond_24

    or-int/lit16 v6, v6, 0x180

    move/from16 v23, v0

    move-object/from16 v0, p12

    goto :goto_19

    :cond_24
    move/from16 v23, v0

    and-int/lit16 v0, v1, 0x180

    if-nez v0, :cond_26

    move-object/from16 v0, p12

    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v25

    if-eqz v25, :cond_25

    const/16 v27, 0x100

    goto :goto_18

    :cond_25
    const/16 v27, 0x80

    :goto_18
    or-int v6, v6, v27

    goto :goto_19

    :cond_26
    move-object/from16 v0, p12

    :goto_19
    and-int/lit16 v0, v2, 0x2000

    if-eqz v0, :cond_27

    or-int/lit16 v6, v6, 0xc00

    move/from16 v25, v0

    move-object/from16 v0, p13

    goto :goto_1b

    :cond_27
    move/from16 v25, v0

    and-int/lit16 v0, v1, 0xc00

    if-nez v0, :cond_29

    move-object/from16 v0, p13

    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v27

    if-eqz v27, :cond_28

    goto :goto_1a

    :cond_28
    move/from16 v17, v18

    :goto_1a
    or-int v6, v6, v17

    goto :goto_1b

    :cond_29
    move-object/from16 v0, p13

    :goto_1b
    and-int/lit16 v0, v2, 0x4000

    if-eqz v0, :cond_2a

    or-int/lit16 v6, v6, 0x6000

    move/from16 v17, v0

    move-object/from16 v0, p14

    goto :goto_1d

    :cond_2a
    move/from16 v17, v0

    and-int/lit16 v0, v1, 0x6000

    if-nez v0, :cond_2c

    move-object/from16 v0, p14

    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_2b

    goto :goto_1c

    :cond_2b
    move/from16 v21, v22

    :goto_1c
    or-int v6, v6, v21

    goto :goto_1d

    :cond_2c
    move-object/from16 v0, p14

    :goto_1d
    const v18, 0x12492493

    and-int v0, v5, v18

    const v1, 0x12492492

    if-ne v0, v1, :cond_2e

    and-int/lit16 v0, v6, 0x2493

    const/16 v1, 0x2492

    if-eq v0, v1, :cond_2d

    goto :goto_1e

    :cond_2d
    const/4 v0, 0x0

    goto :goto_1f

    :cond_2e
    :goto_1e
    const/4 v0, 0x1

    :goto_1f
    and-int/lit8 v1, v5, 0x1

    invoke-interface {v4, v0, v1}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v0

    if-eqz v0, :cond_3f

    if-eqz v13, :cond_2f

    .line 937
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v0, Landroidx/compose/ui/Modifier;

    .end local p2    # "modifier":Landroidx/compose/ui/Modifier;
    .local v0, "modifier":Landroidx/compose/ui/Modifier;
    goto :goto_20

    .line 951
    .end local v0    # "modifier":Landroidx/compose/ui/Modifier;
    .restart local p2    # "modifier":Landroidx/compose/ui/Modifier;
    :cond_2f
    move-object v0, v8

    .line 937
    .end local p2    # "modifier":Landroidx/compose/ui/Modifier;
    .restart local v0    # "modifier":Landroidx/compose/ui/Modifier;
    :goto_20
    if-eqz v16, :cond_30

    .line 938
    const/4 v1, 0x1

    move v7, v1

    .end local p3    # "enabled":Z
    .local v1, "enabled":Z
    goto :goto_21

    .line 937
    .end local v1    # "enabled":Z
    .restart local p3    # "enabled":Z
    :cond_30
    move v7, v9

    .line 938
    .end local p3    # "enabled":Z
    .local v7, "enabled":Z
    :goto_21
    if-eqz v20, :cond_31

    .line 939
    const/4 v1, 0x0

    move v8, v1

    .end local p4    # "readOnly":Z
    .local v1, "readOnly":Z
    goto :goto_22

    .line 938
    .end local v1    # "readOnly":Z
    .restart local p4    # "readOnly":Z
    :cond_31
    move v8, v11

    .line 939
    .end local p4    # "readOnly":Z
    .local v8, "readOnly":Z
    :goto_22
    if-eqz v24, :cond_32

    .line 940
    sget-object v1, Landroidx/compose/ui/text/TextStyle;->Companion:Landroidx/compose/ui/text/TextStyle$Companion;

    invoke-virtual {v1}, Landroidx/compose/ui/text/TextStyle$Companion;->getDefault()Landroidx/compose/ui/text/TextStyle;

    move-result-object v1

    move-object v9, v1

    .end local p5    # "textStyle":Landroidx/compose/ui/text/TextStyle;
    .local v1, "textStyle":Landroidx/compose/ui/text/TextStyle;
    goto :goto_23

    .line 939
    .end local v1    # "textStyle":Landroidx/compose/ui/text/TextStyle;
    .restart local p5    # "textStyle":Landroidx/compose/ui/text/TextStyle;
    :cond_32
    move-object v9, v12

    .line 940
    .end local p5    # "textStyle":Landroidx/compose/ui/text/TextStyle;
    .local v9, "textStyle":Landroidx/compose/ui/text/TextStyle;
    :goto_23
    if-eqz v26, :cond_33

    .line 941
    sget-object v1, Landroidx/compose/foundation/text/KeyboardOptions;->Companion:Landroidx/compose/foundation/text/KeyboardOptions$Companion;

    invoke-virtual {v1}, Landroidx/compose/foundation/text/KeyboardOptions$Companion;->getDefault()Landroidx/compose/foundation/text/KeyboardOptions;

    move-result-object v1

    move-object v10, v1

    .end local p6    # "keyboardOptions":Landroidx/compose/foundation/text/KeyboardOptions;
    .local v1, "keyboardOptions":Landroidx/compose/foundation/text/KeyboardOptions;
    goto :goto_24

    .line 940
    .end local v1    # "keyboardOptions":Landroidx/compose/foundation/text/KeyboardOptions;
    .restart local p6    # "keyboardOptions":Landroidx/compose/foundation/text/KeyboardOptions;
    :cond_33
    move-object v10, v14

    .line 941
    .end local p6    # "keyboardOptions":Landroidx/compose/foundation/text/KeyboardOptions;
    .local v10, "keyboardOptions":Landroidx/compose/foundation/text/KeyboardOptions;
    :goto_24
    if-eqz v15, :cond_34

    .line 942
    sget-object v1, Landroidx/compose/foundation/text/KeyboardActions;->Companion:Landroidx/compose/foundation/text/KeyboardActions$Companion;

    invoke-virtual {v1}, Landroidx/compose/foundation/text/KeyboardActions$Companion;->getDefault()Landroidx/compose/foundation/text/KeyboardActions;

    move-result-object v1

    move-object v11, v1

    .end local p7    # "keyboardActions":Landroidx/compose/foundation/text/KeyboardActions;
    .local v1, "keyboardActions":Landroidx/compose/foundation/text/KeyboardActions;
    goto :goto_25

    .line 941
    .end local v1    # "keyboardActions":Landroidx/compose/foundation/text/KeyboardActions;
    .restart local p7    # "keyboardActions":Landroidx/compose/foundation/text/KeyboardActions;
    :cond_34
    move-object v11, v3

    .line 942
    .end local p7    # "keyboardActions":Landroidx/compose/foundation/text/KeyboardActions;
    .local v11, "keyboardActions":Landroidx/compose/foundation/text/KeyboardActions;
    :goto_25
    if-eqz v30, :cond_35

    .line 943
    const/4 v1, 0x0

    move v12, v1

    .end local p8    # "singleLine":Z
    .local v1, "singleLine":Z
    goto :goto_26

    .line 942
    .end local v1    # "singleLine":Z
    .restart local p8    # "singleLine":Z
    :cond_35
    move/from16 v12, p8

    .line 943
    .end local p8    # "singleLine":Z
    .local v12, "singleLine":Z
    :goto_26
    if-eqz v31, :cond_36

    .line 944
    const v1, 0x7fffffff

    move v13, v1

    .end local p9    # "maxLines":I
    .local v1, "maxLines":I
    goto :goto_27

    .line 943
    .end local v1    # "maxLines":I
    .restart local p9    # "maxLines":I
    :cond_36
    move/from16 v13, p9

    .line 944
    .end local p9    # "maxLines":I
    .local v13, "maxLines":I
    :goto_27
    if-eqz v32, :cond_37

    .line 945
    sget-object v1, Landroidx/compose/ui/text/input/VisualTransformation;->Companion:Landroidx/compose/ui/text/input/VisualTransformation$Companion;

    invoke-virtual {v1}, Landroidx/compose/ui/text/input/VisualTransformation$Companion;->getNone()Landroidx/compose/ui/text/input/VisualTransformation;

    move-result-object v1

    move-object v15, v1

    .end local p10    # "visualTransformation":Landroidx/compose/ui/text/input/VisualTransformation;
    .local v1, "visualTransformation":Landroidx/compose/ui/text/input/VisualTransformation;
    goto :goto_28

    .line 944
    .end local v1    # "visualTransformation":Landroidx/compose/ui/text/input/VisualTransformation;
    .restart local p10    # "visualTransformation":Landroidx/compose/ui/text/input/VisualTransformation;
    :cond_37
    move-object/from16 v15, p10

    .line 945
    .end local p10    # "visualTransformation":Landroidx/compose/ui/text/input/VisualTransformation;
    .local v15, "visualTransformation":Landroidx/compose/ui/text/input/VisualTransformation;
    :goto_28
    if-eqz v19, :cond_38

    .line 946
    sget-object v1, Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$16;->INSTANCE:Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$16;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    move-object/from16 v16, v1

    .end local p11    # "onTextLayout":Lkotlin/jvm/functions/Function1;
    .local v1, "onTextLayout":Lkotlin/jvm/functions/Function1;
    goto :goto_29

    .line 945
    .end local v1    # "onTextLayout":Lkotlin/jvm/functions/Function1;
    .restart local p11    # "onTextLayout":Lkotlin/jvm/functions/Function1;
    :cond_38
    move-object/from16 v16, p11

    .line 946
    .end local p11    # "onTextLayout":Lkotlin/jvm/functions/Function1;
    .local v16, "onTextLayout":Lkotlin/jvm/functions/Function1;
    :goto_29
    if-eqz v23, :cond_3a

    .line 947
    const v1, -0x4a11b0f3

    const-string v3, "CC(remember):BasicTextField.kt#9igjgp"

    invoke-static {v4, v1, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    const/4 v1, 0x0

    .local v1, "invalid$iv":Z
    move-object v3, v4

    .local v3, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/4 v14, 0x0

    .line 1178
    .local v14, "$i$f$cache":I
    move-object/from16 p2, v0

    .end local v0    # "modifier":Landroidx/compose/ui/Modifier;
    .restart local p2    # "modifier":Landroidx/compose/ui/Modifier;
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v0

    .local v0, "it$iv":Ljava/lang/Object;
    const/16 v18, 0x0

    .line 1179
    .local v18, "$i$a$-let-ComposerKt$cache$1$iv":I
    sget-object v19, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move/from16 p3, v1

    .end local v1    # "invalid$iv":Z
    .local p3, "invalid$iv":Z
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_39

    .line 1180
    const/4 v1, 0x0

    .line 947
    .local v1, "$i$a$-cache-BasicTextFieldKt$BasicTextField$17":I
    invoke-static {}, Landroidx/compose/foundation/interaction/InteractionSourceKt;->MutableInteractionSource()Landroidx/compose/foundation/interaction/MutableInteractionSource;

    move-result-object v1

    .line 1180
    .end local v1    # "$i$a$-cache-BasicTextFieldKt$BasicTextField$17":I
    nop

    .line 1181
    .local v1, "value$iv":Ljava/lang/Object;
    invoke-interface {v3, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1182
    move-object v0, v1

    .end local v1    # "value$iv":Ljava/lang/Object;
    goto :goto_2a

    .line 1183
    :cond_39
    nop

    .line 1178
    .end local v0    # "it$iv":Ljava/lang/Object;
    .end local v18    # "$i$a$-let-ComposerKt$cache$1$iv":I
    :goto_2a
    nop

    .line 947
    .end local v3    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v14    # "$i$f$cache":I
    .end local p3    # "invalid$iv":Z
    check-cast v0, Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .end local p12    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .local v0, "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    invoke-static {v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    move/from16 v35, v17

    move-object/from16 v17, v0

    move/from16 v0, v35

    goto :goto_2b

    .line 946
    .end local p2    # "modifier":Landroidx/compose/ui/Modifier;
    .local v0, "modifier":Landroidx/compose/ui/Modifier;
    .restart local p12    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    :cond_3a
    move-object/from16 p2, v0

    .end local v0    # "modifier":Landroidx/compose/ui/Modifier;
    .restart local p2    # "modifier":Landroidx/compose/ui/Modifier;
    move/from16 v0, v17

    move-object/from16 v17, p12

    .line 947
    .end local p12    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .local v17, "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    :goto_2b
    if-eqz v25, :cond_3b

    .line 948
    new-instance v1, Landroidx/compose/ui/graphics/SolidColor;

    sget-object v3, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    invoke-virtual {v3}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    move-result-wide v2

    const/4 v14, 0x0

    invoke-direct {v1, v2, v3, v14}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v1, Landroidx/compose/ui/graphics/Brush;

    move-object/from16 v18, v1

    .end local p13    # "cursorBrush":Landroidx/compose/ui/graphics/Brush;
    .local v1, "cursorBrush":Landroidx/compose/ui/graphics/Brush;
    goto :goto_2c

    .line 947
    .end local v1    # "cursorBrush":Landroidx/compose/ui/graphics/Brush;
    .restart local p13    # "cursorBrush":Landroidx/compose/ui/graphics/Brush;
    :cond_3b
    move-object/from16 v18, p13

    .line 948
    .end local p13    # "cursorBrush":Landroidx/compose/ui/graphics/Brush;
    .local v18, "cursorBrush":Landroidx/compose/ui/graphics/Brush;
    :goto_2c
    if-eqz v0, :cond_3c

    sget-object v0, Landroidx/compose/foundation/text/ComposableSingletons$BasicTextFieldKt;->INSTANCE:Landroidx/compose/foundation/text/ComposableSingletons$BasicTextFieldKt;

    invoke-virtual {v0}, Landroidx/compose/foundation/text/ComposableSingletons$BasicTextFieldKt;->getLambda-4$foundation_release()Lkotlin/jvm/functions/Function3;

    move-result-object v0

    move-object/from16 v19, v0

    .end local p14    # "decorationBox":Lkotlin/jvm/functions/Function3;
    .local v0, "decorationBox":Lkotlin/jvm/functions/Function3;
    goto :goto_2d

    .end local v0    # "decorationBox":Lkotlin/jvm/functions/Function3;
    .restart local p14    # "decorationBox":Lkotlin/jvm/functions/Function3;
    :cond_3c
    move-object/from16 v19, p14

    .end local p14    # "decorationBox":Lkotlin/jvm/functions/Function3;
    .local v19, "decorationBox":Lkotlin/jvm/functions/Function3;
    :goto_2d
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_3d

    .line 951
    const-string v0, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:950)"

    const v1, -0x2168495b

    invoke-static {v1, v5, v6, v0}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 953
    :cond_3d
    nop

    .line 954
    nop

    .line 955
    nop

    .line 956
    nop

    .line 957
    nop

    .line 958
    nop

    .line 959
    nop

    .line 960
    nop

    .line 961
    nop

    .line 963
    nop

    .line 962
    nop

    .line 964
    nop

    .line 965
    nop

    .line 966
    nop

    .line 967
    nop

    .line 968
    and-int/lit8 v0, v5, 0xe

    and-int/lit8 v1, v5, 0x70

    or-int/2addr v0, v1

    and-int/lit16 v1, v5, 0x380

    or-int/2addr v0, v1

    and-int/lit16 v1, v5, 0x1c00

    or-int/2addr v0, v1

    const v1, 0xe000

    and-int/2addr v1, v5

    or-int/2addr v0, v1

    const/high16 v1, 0x70000

    and-int/2addr v1, v5

    or-int/2addr v0, v1

    const/high16 v1, 0x380000

    and-int/2addr v1, v5

    or-int/2addr v0, v1

    const/high16 v1, 0x1c00000

    and-int/2addr v1, v5

    or-int/2addr v0, v1

    const/high16 v1, 0xe000000

    and-int/2addr v1, v5

    or-int/2addr v0, v1

    const/high16 v1, 0x70000000

    and-int/2addr v1, v5

    or-int v21, v0, v1

    shl-int/lit8 v0, v6, 0x3

    and-int/lit8 v0, v0, 0x70

    or-int/lit8 v0, v0, 0x6

    shl-int/lit8 v1, v6, 0x3

    and-int/lit16 v1, v1, 0x380

    or-int/2addr v0, v1

    shl-int/lit8 v1, v6, 0x3

    and-int/lit16 v1, v1, 0x1c00

    or-int/2addr v0, v1

    shl-int/lit8 v1, v6, 0x3

    const v2, 0xe000

    and-int/2addr v1, v2

    or-int/2addr v0, v1

    const/high16 v1, 0x70000

    shl-int/lit8 v2, v6, 0x3

    and-int/2addr v1, v2

    or-int v22, v0, v1

    .line 952
    const/4 v14, 0x1

    const/16 v23, 0x0

    move-object/from16 v20, v4

    move/from16 v25, v5

    move/from16 v24, v6

    move-object/from16 v4, p0

    move-object/from16 v5, p1

    move-object/from16 v6, p2

    .end local v4    # "$composer":Landroidx/compose/runtime/Composer;
    .end local v5    # "$dirty":I
    .end local p2    # "modifier":Landroidx/compose/ui/Modifier;
    .local v6, "modifier":Landroidx/compose/ui/Modifier;
    .local v20, "$composer":Landroidx/compose/runtime/Composer;
    .local v24, "$dirty1":I
    .local v25, "$dirty":I
    invoke-static/range {v4 .. v23}, Landroidx/compose/foundation/text/BasicTextFieldKt;->BasicTextField(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_3e

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 970
    :cond_3e
    move-object v3, v6

    move v4, v7

    move v5, v8

    move-object v6, v9

    move-object v7, v10

    move-object v8, v11

    move v9, v12

    move v10, v13

    move-object v11, v15

    move-object/from16 v12, v16

    move-object/from16 v13, v17

    move-object/from16 v14, v18

    move-object/from16 v15, v19

    goto :goto_2e

    .end local v7    # "enabled":Z
    .end local v8    # "readOnly":Z
    .end local v9    # "textStyle":Landroidx/compose/ui/text/TextStyle;
    .end local v10    # "keyboardOptions":Landroidx/compose/foundation/text/KeyboardOptions;
    .end local v11    # "keyboardActions":Landroidx/compose/foundation/text/KeyboardActions;
    .end local v12    # "singleLine":Z
    .end local v13    # "maxLines":I
    .end local v15    # "visualTransformation":Landroidx/compose/ui/text/input/VisualTransformation;
    .end local v16    # "onTextLayout":Lkotlin/jvm/functions/Function1;
    .end local v17    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .end local v18    # "cursorBrush":Landroidx/compose/ui/graphics/Brush;
    .end local v19    # "decorationBox":Lkotlin/jvm/functions/Function3;
    .end local v20    # "$composer":Landroidx/compose/runtime/Composer;
    .end local v24    # "$dirty1":I
    .end local v25    # "$dirty":I
    .restart local v4    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v5    # "$dirty":I
    .local v6, "$dirty1":I
    .restart local p2    # "modifier":Landroidx/compose/ui/Modifier;
    .local p3, "enabled":Z
    .restart local p4    # "readOnly":Z
    .restart local p5    # "textStyle":Landroidx/compose/ui/text/TextStyle;
    .restart local p6    # "keyboardOptions":Landroidx/compose/foundation/text/KeyboardOptions;
    .restart local p7    # "keyboardActions":Landroidx/compose/foundation/text/KeyboardActions;
    .restart local p8    # "singleLine":Z
    .restart local p9    # "maxLines":I
    .restart local p10    # "visualTransformation":Landroidx/compose/ui/text/input/VisualTransformation;
    .restart local p11    # "onTextLayout":Lkotlin/jvm/functions/Function1;
    .restart local p12    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .restart local p13    # "cursorBrush":Landroidx/compose/ui/graphics/Brush;
    .restart local p14    # "decorationBox":Lkotlin/jvm/functions/Function3;
    :cond_3f
    move-object/from16 v20, v4

    move/from16 v25, v5

    move/from16 v24, v6

    .end local v4    # "$composer":Landroidx/compose/runtime/Composer;
    .end local v5    # "$dirty":I
    .end local v6    # "$dirty1":I
    .restart local v20    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v24    # "$dirty1":I
    .restart local v25    # "$dirty":I
    invoke-interface/range {v20 .. v20}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object v4, v8

    move-object v8, v3

    move-object v3, v4

    move/from16 v10, p9

    move-object/from16 v13, p12

    move-object/from16 v15, p14

    move v4, v9

    move v5, v11

    move-object v6, v12

    move-object v7, v14

    move/from16 v9, p8

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v14, p13

    .end local p2    # "modifier":Landroidx/compose/ui/Modifier;
    .end local p3    # "enabled":Z
    .end local p4    # "readOnly":Z
    .end local p5    # "textStyle":Landroidx/compose/ui/text/TextStyle;
    .end local p6    # "keyboardOptions":Landroidx/compose/foundation/text/KeyboardOptions;
    .end local p7    # "keyboardActions":Landroidx/compose/foundation/text/KeyboardActions;
    .end local p8    # "singleLine":Z
    .end local p9    # "maxLines":I
    .end local p10    # "visualTransformation":Landroidx/compose/ui/text/input/VisualTransformation;
    .end local p11    # "onTextLayout":Lkotlin/jvm/functions/Function1;
    .end local p12    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .end local p13    # "cursorBrush":Landroidx/compose/ui/graphics/Brush;
    .end local p14    # "decorationBox":Lkotlin/jvm/functions/Function3;
    .local v3, "modifier":Landroidx/compose/ui/Modifier;
    .local v4, "enabled":Z
    .local v5, "readOnly":Z
    .local v6, "textStyle":Landroidx/compose/ui/text/TextStyle;
    .local v7, "keyboardOptions":Landroidx/compose/foundation/text/KeyboardOptions;
    .local v8, "keyboardActions":Landroidx/compose/foundation/text/KeyboardActions;
    .local v9, "singleLine":Z
    .local v10, "maxLines":I
    .local v11, "visualTransformation":Landroidx/compose/ui/text/input/VisualTransformation;
    .local v12, "onTextLayout":Lkotlin/jvm/functions/Function1;
    .local v13, "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .local v14, "cursorBrush":Landroidx/compose/ui/graphics/Brush;
    .local v15, "decorationBox":Lkotlin/jvm/functions/Function3;
    :goto_2e
    invoke-interface/range {v20 .. v20}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v0

    if-eqz v0, :cond_40

    move-object v1, v0

    new-instance v0, Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$18;

    move-object/from16 v2, p1

    move/from16 v16, p16

    move/from16 v17, p17

    move/from16 v18, p18

    move-object/from16 v34, v1

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v18}, Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$18;-><init>(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Lkotlin/jvm/functions/Function3;III)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    move-object/from16 v1, v34

    invoke-interface {v1, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_40
    return-void
.end method

.method public static final BasicTextField(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V
    .locals 36
    .param p0, "value"    # Ljava/lang/String;
    .param p1, "onValueChange"    # Lkotlin/jvm/functions/Function1;
    .param p2, "modifier"    # Landroidx/compose/ui/Modifier;
    .param p3, "enabled"    # Z
    .param p4, "readOnly"    # Z
    .param p5, "textStyle"    # Landroidx/compose/ui/text/TextStyle;
    .param p6, "keyboardOptions"    # Landroidx/compose/foundation/text/KeyboardOptions;
    .param p7, "keyboardActions"    # Landroidx/compose/foundation/text/KeyboardActions;
    .param p8, "singleLine"    # Z
    .param p9, "maxLines"    # I
    .param p10, "minLines"    # I
    .param p11, "visualTransformation"    # Landroidx/compose/ui/text/input/VisualTransformation;
    .param p12, "onTextLayout"    # Lkotlin/jvm/functions/Function1;
    .param p13, "interactionSource"    # Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .param p14, "cursorBrush"    # Landroidx/compose/ui/graphics/Brush;
    .param p15, "decorationBox"    # Lkotlin/jvm/functions/Function3;
    .param p16, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p17, "$changed"    # I
    .param p18, "$changed1"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/ui/Modifier;",
            "ZZ",
            "Landroidx/compose/ui/text/TextStyle;",
            "Landroidx/compose/foundation/text/KeyboardOptions;",
            "Landroidx/compose/foundation/text/KeyboardActions;",
            "ZII",
            "Landroidx/compose/ui/text/input/VisualTransformation;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/ui/text/TextLayoutResult;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
            "Landroidx/compose/ui/graphics/Brush;",
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
            "Landroidx/compose/runtime/Composer;",
            "III)V"
        }
    .end annotation

    .line 710
    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v0, p17

    move/from16 v3, p18

    move/from16 v4, p19

    const v5, 0x3857730f

    move-object/from16 v6, p16

    invoke-interface {v6, v5}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v5

    .end local p16    # "$composer":Landroidx/compose/runtime/Composer;
    .local v5, "$composer":Landroidx/compose/runtime/Composer;
    const-string v6, "C(BasicTextField)P(14,10,8,2,11,13,5,4,12,6,7,15,9,3)712@36847L57,718@37200L242,718@37189L253,729@37763L41,733@37881L373,731@37810L1032:BasicTextField.kt#423gt5"

    invoke-static {v5, v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    move/from16 v6, p17

    .local v6, "$dirty":I
    move/from16 v7, p18

    .local v7, "$dirty1":I
    and-int/lit8 v8, v4, 0x1

    if-eqz v8, :cond_0

    or-int/lit8 v6, v6, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v8, v0, 0x6

    if-nez v8, :cond_2

    invoke-interface {v5, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1

    const/4 v8, 0x4

    goto :goto_0

    :cond_1
    const/4 v8, 0x2

    :goto_0
    or-int/2addr v6, v8

    :cond_2
    :goto_1
    and-int/lit8 v8, v4, 0x2

    if-eqz v8, :cond_3

    or-int/lit8 v6, v6, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v8, v0, 0x30

    if-nez v8, :cond_5

    invoke-interface {v5, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    const/16 v8, 0x20

    goto :goto_2

    :cond_4
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v6, v8

    :cond_5
    :goto_3
    and-int/lit8 v8, v4, 0x4

    if-eqz v8, :cond_6

    or-int/lit16 v6, v6, 0x180

    move-object/from16 v15, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v15, v0, 0x180

    if-nez v15, :cond_8

    move-object/from16 v15, p2

    invoke-interface {v5, v15}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_7

    const/16 v16, 0x100

    goto :goto_4

    :cond_7
    const/16 v16, 0x80

    :goto_4
    or-int v6, v6, v16

    goto :goto_5

    :cond_8
    move-object/from16 v15, p2

    :goto_5
    and-int/lit8 v16, v4, 0x8

    const/16 v17, 0x800

    const/16 v18, 0x400

    if-eqz v16, :cond_9

    or-int/lit16 v6, v6, 0xc00

    move/from16 v11, p3

    goto :goto_7

    :cond_9
    and-int/lit16 v11, v0, 0xc00

    if-nez v11, :cond_b

    move/from16 v11, p3

    invoke-interface {v5, v11}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v19

    if-eqz v19, :cond_a

    move/from16 v19, v17

    goto :goto_6

    :cond_a
    move/from16 v19, v18

    :goto_6
    or-int v6, v6, v19

    goto :goto_7

    :cond_b
    move/from16 v11, p3

    :goto_7
    and-int/lit8 v19, v4, 0x10

    const/16 v20, 0x4000

    const/16 v21, 0x2000

    if-eqz v19, :cond_c

    or-int/lit16 v6, v6, 0x6000

    move/from16 v13, p4

    goto :goto_9

    :cond_c
    and-int/lit16 v13, v0, 0x6000

    if-nez v13, :cond_e

    move/from16 v13, p4

    invoke-interface {v5, v13}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v23

    if-eqz v23, :cond_d

    move/from16 v23, v20

    goto :goto_8

    :cond_d
    move/from16 v23, v21

    :goto_8
    or-int v6, v6, v23

    goto :goto_9

    :cond_e
    move/from16 v13, p4

    :goto_9
    and-int/lit8 v23, v4, 0x20

    const/high16 v24, 0x30000

    if-eqz v23, :cond_f

    or-int v6, v6, v24

    move-object/from16 v14, p5

    goto :goto_b

    :cond_f
    and-int v25, v0, v24

    if-nez v25, :cond_11

    move-object/from16 v14, p5

    invoke-interface {v5, v14}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v26

    if-eqz v26, :cond_10

    const/high16 v26, 0x20000

    goto :goto_a

    :cond_10
    const/high16 v26, 0x10000

    :goto_a
    or-int v6, v6, v26

    goto :goto_b

    :cond_11
    move-object/from16 v14, p5

    :goto_b
    and-int/lit8 v26, v4, 0x40

    const/high16 v27, 0x180000

    if-eqz v26, :cond_12

    or-int v6, v6, v27

    move-object/from16 v12, p6

    goto :goto_d

    :cond_12
    and-int v27, v0, v27

    if-nez v27, :cond_14

    move-object/from16 v12, p6

    invoke-interface {v5, v12}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v28

    if-eqz v28, :cond_13

    const/high16 v28, 0x100000

    goto :goto_c

    :cond_13
    const/high16 v28, 0x80000

    :goto_c
    or-int v6, v6, v28

    goto :goto_d

    :cond_14
    move-object/from16 v12, p6

    :goto_d
    and-int/lit16 v9, v4, 0x80

    const/high16 v29, 0xc00000

    if-eqz v9, :cond_15

    or-int v6, v6, v29

    move-object/from16 v10, p7

    goto :goto_f

    :cond_15
    and-int v29, v0, v29

    if-nez v29, :cond_17

    move-object/from16 v10, p7

    invoke-interface {v5, v10}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v30

    if-eqz v30, :cond_16

    const/high16 v30, 0x800000

    goto :goto_e

    :cond_16
    const/high16 v30, 0x400000

    :goto_e
    or-int v6, v6, v30

    goto :goto_f

    :cond_17
    move-object/from16 v10, p7

    :goto_f
    and-int/lit16 v0, v4, 0x100

    const/high16 v30, 0x6000000

    if-eqz v0, :cond_18

    or-int v6, v6, v30

    move/from16 v30, v0

    move/from16 v0, p8

    goto :goto_11

    :cond_18
    and-int v30, p17, v30

    if-nez v30, :cond_1a

    move/from16 v30, v0

    move/from16 v0, p8

    invoke-interface {v5, v0}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v31

    if-eqz v31, :cond_19

    const/high16 v31, 0x4000000

    goto :goto_10

    :cond_19
    const/high16 v31, 0x2000000

    :goto_10
    or-int v6, v6, v31

    goto :goto_11

    :cond_1a
    move/from16 v30, v0

    move/from16 v0, p8

    :goto_11
    const/high16 v31, 0x30000000

    and-int v31, p17, v31

    if-nez v31, :cond_1d

    and-int/lit16 v0, v4, 0x200

    if-nez v0, :cond_1b

    move/from16 v0, p9

    invoke-interface {v5, v0}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v31

    if-eqz v31, :cond_1c

    const/high16 v31, 0x20000000

    goto :goto_12

    :cond_1b
    move/from16 v0, p9

    :cond_1c
    const/high16 v31, 0x10000000

    :goto_12
    or-int v6, v6, v31

    goto :goto_13

    :cond_1d
    move/from16 v0, p9

    :goto_13
    and-int/lit16 v0, v4, 0x400

    if-eqz v0, :cond_1e

    or-int/lit8 v7, v7, 0x6

    move/from16 v31, v0

    move/from16 v0, p10

    goto :goto_15

    :cond_1e
    and-int/lit8 v31, v3, 0x6

    if-nez v31, :cond_20

    move/from16 v31, v0

    move/from16 v0, p10

    invoke-interface {v5, v0}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v32

    if-eqz v32, :cond_1f

    const/16 v32, 0x4

    goto :goto_14

    :cond_1f
    const/16 v32, 0x2

    :goto_14
    or-int v7, v7, v32

    goto :goto_15

    :cond_20
    move/from16 v31, v0

    move/from16 v0, p10

    :goto_15
    and-int/lit16 v0, v4, 0x800

    if-eqz v0, :cond_21

    or-int/lit8 v7, v7, 0x30

    move/from16 v32, v0

    move-object/from16 v0, p11

    goto :goto_17

    :cond_21
    and-int/lit8 v32, v3, 0x30

    if-nez v32, :cond_23

    move/from16 v32, v0

    move-object/from16 v0, p11

    invoke-interface {v5, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v33

    if-eqz v33, :cond_22

    const/16 v33, 0x20

    goto :goto_16

    :cond_22
    const/16 v33, 0x10

    :goto_16
    or-int v7, v7, v33

    goto :goto_17

    :cond_23
    move/from16 v32, v0

    move-object/from16 v0, p11

    :goto_17
    and-int/lit16 v0, v4, 0x1000

    if-eqz v0, :cond_24

    or-int/lit16 v7, v7, 0x180

    move/from16 v33, v0

    move-object/from16 v0, p12

    goto :goto_19

    :cond_24
    move/from16 v33, v0

    and-int/lit16 v0, v3, 0x180

    if-nez v0, :cond_26

    move-object/from16 v0, p12

    invoke-interface {v5, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v34

    if-eqz v34, :cond_25

    const/16 v22, 0x100

    goto :goto_18

    :cond_25
    const/16 v22, 0x80

    :goto_18
    or-int v7, v7, v22

    goto :goto_19

    :cond_26
    move-object/from16 v0, p12

    :goto_19
    and-int/lit16 v0, v4, 0x2000

    if-eqz v0, :cond_27

    or-int/lit16 v7, v7, 0xc00

    move/from16 v22, v0

    move-object/from16 v0, p13

    goto :goto_1b

    :cond_27
    move/from16 v22, v0

    and-int/lit16 v0, v3, 0xc00

    if-nez v0, :cond_29

    move-object/from16 v0, p13

    invoke-interface {v5, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v25

    if-eqz v25, :cond_28

    goto :goto_1a

    :cond_28
    move/from16 v17, v18

    :goto_1a
    or-int v7, v7, v17

    goto :goto_1b

    :cond_29
    move-object/from16 v0, p13

    :goto_1b
    and-int/lit16 v0, v4, 0x4000

    if-eqz v0, :cond_2a

    or-int/lit16 v7, v7, 0x6000

    move/from16 v17, v0

    move-object/from16 v0, p14

    goto :goto_1d

    :cond_2a
    move/from16 v17, v0

    and-int/lit16 v0, v3, 0x6000

    if-nez v0, :cond_2c

    move-object/from16 v0, p14

    invoke-interface {v5, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_2b

    goto :goto_1c

    :cond_2b
    move/from16 v20, v21

    :goto_1c
    or-int v7, v7, v20

    goto :goto_1d

    :cond_2c
    move-object/from16 v0, p14

    :goto_1d
    const v18, 0x8000

    and-int v18, v4, v18

    if-eqz v18, :cond_2d

    or-int v7, v7, v24

    move-object/from16 v0, p15

    goto :goto_1f

    :cond_2d
    and-int v20, v3, v24

    if-nez v20, :cond_2f

    move-object/from16 v0, p15

    invoke-interface {v5, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_2e

    const/high16 v20, 0x20000

    goto :goto_1e

    :cond_2e
    const/high16 v20, 0x10000

    :goto_1e
    or-int v7, v7, v20

    goto :goto_1f

    :cond_2f
    move-object/from16 v0, p15

    :goto_1f
    const v20, 0x12492493

    and-int v0, v6, v20

    const v1, 0x12492492

    const/16 v20, 0x1

    if-ne v0, v1, :cond_31

    const v0, 0x12493

    and-int/2addr v0, v7

    const v1, 0x12492

    if-eq v0, v1, :cond_30

    goto :goto_20

    :cond_30
    const/4 v0, 0x0

    goto :goto_21

    :cond_31
    :goto_20
    move/from16 v0, v20

    :goto_21
    and-int/lit8 v1, v6, 0x1

    invoke-interface {v5, v0, v1}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v0

    if-eqz v0, :cond_51

    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->startDefaults()V

    const-string v0, ""

    invoke-static {v5, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 v0, p17, 0x1

    const/4 v1, 0x0

    if-eqz v0, :cond_34

    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    move-result v0

    if-eqz v0, :cond_32

    goto :goto_22

    .line 707
    :cond_32
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    and-int/lit16 v0, v4, 0x200

    if-eqz v0, :cond_33

    const v0, -0x70000001

    and-int/2addr v6, v0

    :cond_33
    move/from16 v3, p8

    move/from16 v30, p9

    move/from16 v31, p10

    move-object/from16 v21, p15

    move-object/from16 v18, v10

    move/from16 v19, v11

    move-object v0, v12

    move-object v9, v14

    move-object v8, v15

    move/from16 v14, v20

    move-object/from16 v10, p11

    move-object/from16 v11, p12

    move-object/from16 v12, p13

    move/from16 v20, v13

    move-object/from16 v13, p14

    goto/16 :goto_2d

    .line 710
    :cond_34
    :goto_22
    if-eqz v8, :cond_35

    .line 695
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v0, Landroidx/compose/ui/Modifier;

    move-object v15, v0

    .end local p2    # "modifier":Landroidx/compose/ui/Modifier;
    .local v15, "modifier":Landroidx/compose/ui/Modifier;
    :cond_35
    if-eqz v16, :cond_36

    .line 696
    const/4 v0, 0x1

    .end local p3    # "enabled":Z
    .local v0, "enabled":Z
    goto :goto_23

    .line 695
    .end local v0    # "enabled":Z
    .restart local p3    # "enabled":Z
    :cond_36
    move v0, v11

    .line 696
    .end local p3    # "enabled":Z
    .restart local v0    # "enabled":Z
    :goto_23
    if-eqz v19, :cond_37

    .line 697
    const/4 v8, 0x0

    move v13, v8

    .end local p4    # "readOnly":Z
    .local v13, "readOnly":Z
    :cond_37
    if-eqz v23, :cond_38

    .line 698
    sget-object v8, Landroidx/compose/ui/text/TextStyle;->Companion:Landroidx/compose/ui/text/TextStyle$Companion;

    invoke-virtual {v8}, Landroidx/compose/ui/text/TextStyle$Companion;->getDefault()Landroidx/compose/ui/text/TextStyle;

    move-result-object v8

    move-object v14, v8

    .end local p5    # "textStyle":Landroidx/compose/ui/text/TextStyle;
    .local v14, "textStyle":Landroidx/compose/ui/text/TextStyle;
    :cond_38
    if-eqz v26, :cond_39

    .line 699
    sget-object v8, Landroidx/compose/foundation/text/KeyboardOptions;->Companion:Landroidx/compose/foundation/text/KeyboardOptions$Companion;

    invoke-virtual {v8}, Landroidx/compose/foundation/text/KeyboardOptions$Companion;->getDefault()Landroidx/compose/foundation/text/KeyboardOptions;

    move-result-object v8

    move-object v12, v8

    .end local p6    # "keyboardOptions":Landroidx/compose/foundation/text/KeyboardOptions;
    .local v12, "keyboardOptions":Landroidx/compose/foundation/text/KeyboardOptions;
    :cond_39
    if-eqz v9, :cond_3a

    .line 700
    sget-object v8, Landroidx/compose/foundation/text/KeyboardActions;->Companion:Landroidx/compose/foundation/text/KeyboardActions$Companion;

    invoke-virtual {v8}, Landroidx/compose/foundation/text/KeyboardActions$Companion;->getDefault()Landroidx/compose/foundation/text/KeyboardActions;

    move-result-object v8

    .end local p7    # "keyboardActions":Landroidx/compose/foundation/text/KeyboardActions;
    .local v8, "keyboardActions":Landroidx/compose/foundation/text/KeyboardActions;
    goto :goto_24

    .line 699
    .end local v8    # "keyboardActions":Landroidx/compose/foundation/text/KeyboardActions;
    .restart local p7    # "keyboardActions":Landroidx/compose/foundation/text/KeyboardActions;
    :cond_3a
    move-object v8, v10

    .line 700
    .end local p7    # "keyboardActions":Landroidx/compose/foundation/text/KeyboardActions;
    .restart local v8    # "keyboardActions":Landroidx/compose/foundation/text/KeyboardActions;
    :goto_24
    if-eqz v30, :cond_3b

    .line 701
    const/4 v9, 0x0

    .end local p8    # "singleLine":Z
    .local v9, "singleLine":Z
    goto :goto_25

    .line 700
    .end local v9    # "singleLine":Z
    .restart local p8    # "singleLine":Z
    :cond_3b
    move/from16 v9, p8

    .line 701
    .end local p8    # "singleLine":Z
    .restart local v9    # "singleLine":Z
    :goto_25
    and-int/lit16 v10, v4, 0x200

    if-eqz v10, :cond_3d

    .line 702
    if-eqz v9, :cond_3c

    move/from16 v10, v20

    goto :goto_26

    :cond_3c
    const v10, 0x7fffffff

    .end local p9    # "maxLines":I
    .local v10, "maxLines":I
    :goto_26
    const v11, -0x70000001

    and-int/2addr v6, v11

    goto :goto_27

    .line 701
    .end local v10    # "maxLines":I
    .restart local p9    # "maxLines":I
    :cond_3d
    move/from16 v10, p9

    .line 702
    .end local p9    # "maxLines":I
    .restart local v10    # "maxLines":I
    :goto_27
    if-eqz v31, :cond_3e

    .line 703
    const/4 v11, 0x1

    .end local p10    # "minLines":I
    .local v11, "minLines":I
    goto :goto_28

    .line 702
    .end local v11    # "minLines":I
    .restart local p10    # "minLines":I
    :cond_3e
    move/from16 v11, p10

    .line 703
    .end local p10    # "minLines":I
    .restart local v11    # "minLines":I
    :goto_28
    if-eqz v32, :cond_3f

    .line 704
    sget-object v16, Landroidx/compose/ui/text/input/VisualTransformation;->Companion:Landroidx/compose/ui/text/input/VisualTransformation$Companion;

    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/text/input/VisualTransformation$Companion;->getNone()Landroidx/compose/ui/text/input/VisualTransformation;

    move-result-object v16

    .end local p11    # "visualTransformation":Landroidx/compose/ui/text/input/VisualTransformation;
    .local v16, "visualTransformation":Landroidx/compose/ui/text/input/VisualTransformation;
    goto :goto_29

    .line 703
    .end local v16    # "visualTransformation":Landroidx/compose/ui/text/input/VisualTransformation;
    .restart local p11    # "visualTransformation":Landroidx/compose/ui/text/input/VisualTransformation;
    :cond_3f
    move-object/from16 v16, p11

    .line 704
    .end local p11    # "visualTransformation":Landroidx/compose/ui/text/input/VisualTransformation;
    .restart local v16    # "visualTransformation":Landroidx/compose/ui/text/input/VisualTransformation;
    :goto_29
    if-eqz v33, :cond_40

    .line 705
    sget-object v19, Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$6;->INSTANCE:Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$6;

    check-cast v19, Lkotlin/jvm/functions/Function1;

    .end local p12    # "onTextLayout":Lkotlin/jvm/functions/Function1;
    .local v19, "onTextLayout":Lkotlin/jvm/functions/Function1;
    goto :goto_2a

    .line 704
    .end local v19    # "onTextLayout":Lkotlin/jvm/functions/Function1;
    .restart local p12    # "onTextLayout":Lkotlin/jvm/functions/Function1;
    :cond_40
    move-object/from16 v19, p12

    .line 705
    .end local p12    # "onTextLayout":Lkotlin/jvm/functions/Function1;
    .restart local v19    # "onTextLayout":Lkotlin/jvm/functions/Function1;
    :goto_2a
    if-eqz v22, :cond_41

    .line 706
    const/16 v21, 0x0

    .end local p13    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .local v21, "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    goto :goto_2b

    .line 705
    .end local v21    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .restart local p13    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    :cond_41
    move-object/from16 v21, p13

    .line 706
    .end local p13    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .restart local v21    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    :goto_2b
    if-eqz v17, :cond_42

    .line 707
    new-instance v3, Landroidx/compose/ui/graphics/SolidColor;

    sget-object v17, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    move-object/from16 p2, v8

    move/from16 p3, v9

    .end local v8    # "keyboardActions":Landroidx/compose/foundation/text/KeyboardActions;
    .end local v9    # "singleLine":Z
    .local p2, "keyboardActions":Landroidx/compose/foundation/text/KeyboardActions;
    .local p3, "singleLine":Z
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    move-result-wide v8

    invoke-direct {v3, v8, v9, v1}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v3, Landroidx/compose/ui/graphics/Brush;

    .end local p14    # "cursorBrush":Landroidx/compose/ui/graphics/Brush;
    .local v3, "cursorBrush":Landroidx/compose/ui/graphics/Brush;
    goto :goto_2c

    .line 706
    .end local v3    # "cursorBrush":Landroidx/compose/ui/graphics/Brush;
    .end local p2    # "keyboardActions":Landroidx/compose/foundation/text/KeyboardActions;
    .end local p3    # "singleLine":Z
    .restart local v8    # "keyboardActions":Landroidx/compose/foundation/text/KeyboardActions;
    .restart local v9    # "singleLine":Z
    .restart local p14    # "cursorBrush":Landroidx/compose/ui/graphics/Brush;
    :cond_42
    move-object/from16 p2, v8

    move/from16 p3, v9

    .end local v8    # "keyboardActions":Landroidx/compose/foundation/text/KeyboardActions;
    .end local v9    # "singleLine":Z
    .restart local p2    # "keyboardActions":Landroidx/compose/foundation/text/KeyboardActions;
    .restart local p3    # "singleLine":Z
    move-object/from16 v3, p14

    .line 707
    .end local p14    # "cursorBrush":Landroidx/compose/ui/graphics/Brush;
    .restart local v3    # "cursorBrush":Landroidx/compose/ui/graphics/Brush;
    :goto_2c
    if-eqz v18, :cond_43

    sget-object v8, Landroidx/compose/foundation/text/ComposableSingletons$BasicTextFieldKt;->INSTANCE:Landroidx/compose/foundation/text/ComposableSingletons$BasicTextFieldKt;

    invoke-virtual {v8}, Landroidx/compose/foundation/text/ComposableSingletons$BasicTextFieldKt;->getLambda-1$foundation_release()Lkotlin/jvm/functions/Function3;

    move-result-object v8

    move-object/from16 v18, p2

    move/from16 v30, v10

    move/from16 v31, v11

    move-object v9, v14

    move-object/from16 v10, v16

    move-object/from16 v11, v19

    move/from16 v14, v20

    move/from16 v19, v0

    move-object v0, v12

    move/from16 v20, v13

    move-object/from16 v12, v21

    move-object v13, v3

    move-object/from16 v21, v8

    move-object v8, v15

    move/from16 v3, p3

    .end local p15    # "decorationBox":Lkotlin/jvm/functions/Function3;
    .local v8, "decorationBox":Lkotlin/jvm/functions/Function3;
    goto :goto_2d

    .end local v8    # "decorationBox":Lkotlin/jvm/functions/Function3;
    .restart local p15    # "decorationBox":Lkotlin/jvm/functions/Function3;
    :cond_43
    move-object/from16 v18, p2

    move/from16 v30, v10

    move/from16 v31, v11

    move-object v9, v14

    move-object v8, v15

    move-object/from16 v10, v16

    move-object/from16 v11, v19

    move/from16 v14, v20

    move/from16 v19, v0

    move-object v0, v12

    move/from16 v20, v13

    move-object/from16 v12, v21

    move-object/from16 v21, p15

    move-object v13, v3

    move/from16 v3, p3

    .end local v14    # "textStyle":Landroidx/compose/ui/text/TextStyle;
    .end local v15    # "modifier":Landroidx/compose/ui/Modifier;
    .end local v16    # "visualTransformation":Landroidx/compose/ui/text/input/VisualTransformation;
    .end local p2    # "keyboardActions":Landroidx/compose/foundation/text/KeyboardActions;
    .end local p3    # "singleLine":Z
    .end local p15    # "decorationBox":Lkotlin/jvm/functions/Function3;
    .local v0, "keyboardOptions":Landroidx/compose/foundation/text/KeyboardOptions;
    .local v3, "singleLine":Z
    .local v8, "modifier":Landroidx/compose/ui/Modifier;
    .local v9, "textStyle":Landroidx/compose/ui/text/TextStyle;
    .local v10, "visualTransformation":Landroidx/compose/ui/text/input/VisualTransformation;
    .local v11, "onTextLayout":Lkotlin/jvm/functions/Function1;
    .local v12, "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .local v13, "cursorBrush":Landroidx/compose/ui/graphics/Brush;
    .local v18, "keyboardActions":Landroidx/compose/foundation/text/KeyboardActions;
    .local v19, "enabled":Z
    .local v20, "readOnly":Z
    .local v21, "decorationBox":Lkotlin/jvm/functions/Function3;
    .local v30, "maxLines":I
    .local v31, "minLines":I
    :goto_2d
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endDefaults()V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v15

    if-eqz v15, :cond_44

    .line 710
    const v15, 0x3857730f

    const-string v14, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:709)"

    invoke-static {v15, v6, v7, v14}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_44
    nop

    .line 713
    const v14, -0x4a177161

    const-string v15, "CC(remember):BasicTextField.kt#9igjgp"

    invoke-static {v5, v14, v15}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    const/4 v14, 0x0

    .local v14, "invalid$iv":Z
    move-object/from16 p10, v5

    .local p10, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/16 v16, 0x0

    .line 1142
    .local v16, "$i$f$cache":I
    invoke-interface/range {p10 .. p10}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v1

    .local v1, "it$iv":Ljava/lang/Object;
    const/16 v22, 0x0

    .line 1143
    .local v22, "$i$a$-let-ComposerKt$cache$1$iv":I
    sget-object v23, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual/range {v23 .. v23}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v4

    if-ne v1, v4, :cond_45

    .line 1144
    const/4 v4, 0x0

    .line 713
    .local v4, "$i$a$-cache-BasicTextFieldKt$BasicTextField$textFieldValueState$2":I
    new-instance v23, Landroidx/compose/ui/text/input/TextFieldValue;

    const/16 v24, 0x6

    const/16 v25, 0x0

    const-wide/16 v32, 0x0

    const/16 v26, 0x0

    move-object/from16 p3, p0

    move-object/from16 p2, v23

    move/from16 p7, v24

    move-object/from16 p8, v25

    move-object/from16 p6, v26

    move-wide/from16 p4, v32

    invoke-direct/range {p2 .. p8}, Landroidx/compose/ui/text/input/TextFieldValue;-><init>(Ljava/lang/String;JLandroidx/compose/ui/text/TextRange;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 p3, v1

    move-object/from16 v1, p2

    move-object/from16 p2, p3

    move/from16 p3, v4

    move/from16 v23, v7

    const/4 v4, 0x0

    const/4 v7, 0x2

    .end local v1    # "it$iv":Ljava/lang/Object;
    .end local v4    # "$i$a$-cache-BasicTextFieldKt$BasicTextField$textFieldValueState$2":I
    .end local v7    # "$dirty1":I
    .local v23, "$dirty1":I
    .local p2, "it$iv":Ljava/lang/Object;
    .local p3, "$i$a$-cache-BasicTextFieldKt$BasicTextField$textFieldValueState$2":I
    invoke-static {v1, v4, v7, v4}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v1

    .line 1144
    .end local p3    # "$i$a$-cache-BasicTextFieldKt$BasicTextField$textFieldValueState$2":I
    nop

    .line 1145
    .local v1, "value$iv":Ljava/lang/Object;
    move-object/from16 v4, p10

    .end local p10    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .local v4, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    invoke-interface {v4, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1146
    nop

    .end local v1    # "value$iv":Ljava/lang/Object;
    goto :goto_2e

    .line 1147
    .end local v4    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v23    # "$dirty1":I
    .end local p2    # "it$iv":Ljava/lang/Object;
    .local v1, "it$iv":Ljava/lang/Object;
    .restart local v7    # "$dirty1":I
    .restart local p10    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    :cond_45
    move-object/from16 v4, p10

    move-object/from16 p2, v1

    move/from16 v23, v7

    .line 1142
    .end local v1    # "it$iv":Ljava/lang/Object;
    .end local v7    # "$dirty1":I
    .end local v22    # "$i$a$-let-ComposerKt$cache$1$iv":I
    .end local p10    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .restart local v4    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .restart local v23    # "$dirty1":I
    :goto_2e
    nop

    .line 713
    .end local v4    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v14    # "invalid$iv":Z
    .end local v16    # "$i$f$cache":I
    check-cast v1, Landroidx/compose/runtime/MutableState;

    .local v1, "textFieldValueState$delegate":Landroidx/compose/runtime/MutableState;
    invoke-static {v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 717
    invoke-static {v1}, Landroidx/compose/foundation/text/BasicTextFieldKt;->BasicTextField$lambda$24(Landroidx/compose/runtime/MutableState;)Landroidx/compose/ui/text/input/TextFieldValue;

    move-result-object v4

    const/4 v7, 0x6

    const/4 v14, 0x0

    const-wide/16 v24, 0x0

    const/16 v16, 0x0

    move-object/from16 p3, p0

    move-object/from16 p2, v4

    move/from16 p7, v7

    move-object/from16 p8, v14

    move-object/from16 p6, v16

    move-wide/from16 p4, v24

    invoke-static/range {p2 .. p8}, Landroidx/compose/ui/text/input/TextFieldValue;->copy-3r_uNRQ$default(Landroidx/compose/ui/text/input/TextFieldValue;Ljava/lang/String;JLandroidx/compose/ui/text/TextRange;ILjava/lang/Object;)Landroidx/compose/ui/text/input/TextFieldValue;

    move-result-object v4

    .line 719
    move-object/from16 v7, p3

    .local v4, "textFieldValue":Landroidx/compose/ui/text/input/TextFieldValue;
    const v14, -0x4a174488

    invoke-static {v5, v14, v15}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v5, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v14

    .restart local v14    # "invalid$iv":Z
    move-object/from16 p2, v5

    .local p2, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/16 v16, 0x0

    .line 1148
    .restart local v16    # "$i$f$cache":I
    move-object/from16 p3, v8

    .end local v8    # "modifier":Landroidx/compose/ui/Modifier;
    .local p3, "modifier":Landroidx/compose/ui/Modifier;
    invoke-interface/range {p2 .. p2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v8

    .local v8, "it$iv":Ljava/lang/Object;
    const/16 v22, 0x0

    .line 1149
    .restart local v22    # "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez v14, :cond_47

    sget-object v24, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move-object/from16 p4, v9

    .end local v9    # "textStyle":Landroidx/compose/ui/text/TextStyle;
    .local p4, "textStyle":Landroidx/compose/ui/text/TextStyle;
    invoke-virtual/range {v24 .. v24}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v9

    if-ne v8, v9, :cond_46

    goto :goto_2f

    .line 1153
    :cond_46
    move-object/from16 v9, p2

    goto :goto_30

    .line 1149
    .end local p4    # "textStyle":Landroidx/compose/ui/text/TextStyle;
    .restart local v9    # "textStyle":Landroidx/compose/ui/text/TextStyle;
    :cond_47
    move-object/from16 p4, v9

    .line 1150
    .end local v9    # "textStyle":Landroidx/compose/ui/text/TextStyle;
    .restart local p4    # "textStyle":Landroidx/compose/ui/text/TextStyle;
    :goto_2f
    const/4 v9, 0x0

    .line 719
    .local v9, "$i$a$-cache-BasicTextFieldKt$BasicTextField$7":I
    move-object/from16 p5, v8

    .end local v8    # "it$iv":Ljava/lang/Object;
    .local p5, "it$iv":Ljava/lang/Object;
    new-instance v8, Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$7$1;

    invoke-direct {v8, v4, v1}, Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$7$1;-><init>(Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/runtime/MutableState;)V

    check-cast v8, Lkotlin/jvm/functions/Function0;

    .line 1150
    .end local v9    # "$i$a$-cache-BasicTextFieldKt$BasicTextField$7":I
    nop

    .line 1151
    .local v8, "value$iv":Ljava/lang/Object;
    move-object/from16 v9, p2

    .end local p2    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .local v9, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    invoke-interface {v9, v8}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1152
    nop

    .line 1148
    .end local v8    # "value$iv":Ljava/lang/Object;
    .end local v22    # "$i$a$-let-ComposerKt$cache$1$iv":I
    .end local p5    # "it$iv":Ljava/lang/Object;
    :goto_30
    nop

    .line 719
    .end local v9    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v14    # "invalid$iv":Z
    .end local v16    # "$i$f$cache":I
    check-cast v8, Lkotlin/jvm/functions/Function0;

    invoke-static {v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    const/4 v9, 0x0

    invoke-static {v8, v5, v9}, Landroidx/compose/runtime/EffectsKt;->SideEffect(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V

    .line 730
    const v8, -0x4a16fef1

    invoke-static {v5, v8, v15}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    and-int/lit8 v8, v6, 0xe

    const/4 v14, 0x4

    if-ne v8, v14, :cond_48

    const/4 v8, 0x1

    goto :goto_31

    :cond_48
    move v8, v9

    .local v8, "invalid$iv":Z
    :goto_31
    move-object v14, v5

    .local v14, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/16 v16, 0x0

    .line 1154
    .restart local v16    # "$i$f$cache":I
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v9

    .local v9, "it$iv":Ljava/lang/Object;
    const/16 v22, 0x0

    .line 1155
    .restart local v22    # "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez v8, :cond_4a

    sget-object v24, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move-object/from16 p2, v4

    .end local v4    # "textFieldValue":Landroidx/compose/ui/text/input/TextFieldValue;
    .local p2, "textFieldValue":Landroidx/compose/ui/text/input/TextFieldValue;
    invoke-virtual/range {v24 .. v24}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v4

    if-ne v9, v4, :cond_49

    goto :goto_32

    .line 1159
    :cond_49
    move/from16 p6, v8

    goto :goto_33

    .line 1155
    .end local p2    # "textFieldValue":Landroidx/compose/ui/text/input/TextFieldValue;
    .restart local v4    # "textFieldValue":Landroidx/compose/ui/text/input/TextFieldValue;
    :cond_4a
    move-object/from16 p2, v4

    .line 1156
    .end local v4    # "textFieldValue":Landroidx/compose/ui/text/input/TextFieldValue;
    .restart local p2    # "textFieldValue":Landroidx/compose/ui/text/input/TextFieldValue;
    :goto_32
    const/4 v4, 0x0

    .line 730
    .local v4, "$i$a$-cache-BasicTextFieldKt$BasicTextField$lastTextValue$2":I
    move/from16 p5, v4

    move/from16 p6, v8

    const/4 v4, 0x0

    const/4 v8, 0x2

    .end local v4    # "$i$a$-cache-BasicTextFieldKt$BasicTextField$lastTextValue$2":I
    .end local v8    # "invalid$iv":Z
    .local p5, "$i$a$-cache-BasicTextFieldKt$BasicTextField$lastTextValue$2":I
    .local p6, "invalid$iv":Z
    invoke-static {v7, v4, v8, v4}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v4

    .line 1156
    .end local p5    # "$i$a$-cache-BasicTextFieldKt$BasicTextField$lastTextValue$2":I
    nop

    .line 1157
    .local v4, "value$iv":Ljava/lang/Object;
    invoke-interface {v14, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1158
    move-object v9, v4

    .line 1154
    .end local v4    # "value$iv":Ljava/lang/Object;
    .end local v9    # "it$iv":Ljava/lang/Object;
    .end local v22    # "$i$a$-let-ComposerKt$cache$1$iv":I
    :goto_33
    nop

    .line 730
    .end local v14    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v16    # "$i$f$cache":I
    .end local p6    # "invalid$iv":Z
    move-object v4, v9

    check-cast v4, Landroidx/compose/runtime/MutableState;

    .local v4, "lastTextValue$delegate":Landroidx/compose/runtime/MutableState;
    invoke-static {v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 750
    invoke-virtual {v0, v3}, Landroidx/compose/foundation/text/KeyboardOptions;->toImeOptions$foundation_release(Z)Landroidx/compose/ui/text/input/ImeOptions;

    move-result-object v17

    .line 752
    nop

    .line 753
    xor-int/lit8 v14, v3, 0x1

    if-eqz v3, :cond_4b

    const/16 v16, 0x1

    goto :goto_34

    :cond_4b
    move/from16 v16, v31

    .line 754
    :goto_34
    if-eqz v3, :cond_4c

    const/4 v8, 0x1

    goto :goto_35

    :cond_4c
    move/from16 v8, v30

    .line 733
    :goto_35
    nop

    .line 734
    const v9, -0x4a16eee5

    invoke-static {v5, v9, v15}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v5, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v9

    and-int/lit8 v15, v6, 0x70

    move-object/from16 v28, v0

    const/16 v0, 0x20

    .end local v0    # "keyboardOptions":Landroidx/compose/foundation/text/KeyboardOptions;
    .local v28, "keyboardOptions":Landroidx/compose/foundation/text/KeyboardOptions;
    if-ne v15, v0, :cond_4d

    const/4 v0, 0x1

    goto :goto_36

    :cond_4d
    const/4 v0, 0x0

    :goto_36
    or-int/2addr v0, v9

    .local v0, "invalid$iv":Z
    move-object v9, v5

    .local v9, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/4 v15, 0x0

    .line 1160
    .local v15, "$i$f$cache":I
    move/from16 p5, v0

    .end local v0    # "invalid$iv":Z
    .local p5, "invalid$iv":Z
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v0

    .local v0, "it$iv":Ljava/lang/Object;
    const/16 v22, 0x0

    .line 1161
    .restart local v22    # "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez p5, :cond_4f

    sget-object v24, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move/from16 v27, v3

    .end local v3    # "singleLine":Z
    .local v27, "singleLine":Z
    invoke-virtual/range {v24 .. v24}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v3

    if-ne v0, v3, :cond_4e

    goto :goto_37

    .line 1165
    :cond_4e
    goto :goto_38

    .line 1161
    .end local v27    # "singleLine":Z
    .restart local v3    # "singleLine":Z
    :cond_4f
    move/from16 v27, v3

    .line 1162
    .end local v3    # "singleLine":Z
    .restart local v27    # "singleLine":Z
    :goto_37
    const/4 v3, 0x0

    .line 734
    .local v3, "$i$a$-cache-BasicTextFieldKt$BasicTextField$8":I
    move-object/from16 p6, v0

    .end local v0    # "it$iv":Ljava/lang/Object;
    .local p6, "it$iv":Ljava/lang/Object;
    new-instance v0, Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$8$1;

    invoke-direct {v0, v2, v1, v4}, Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$8$1;-><init>(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)V

    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 1162
    .end local v3    # "$i$a$-cache-BasicTextFieldKt$BasicTextField$8":I
    nop

    .line 1163
    .local v0, "value$iv":Ljava/lang/Object;
    invoke-interface {v9, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1164
    nop

    .line 1160
    .end local v0    # "value$iv":Ljava/lang/Object;
    .end local v22    # "$i$a$-let-ComposerKt$cache$1$iv":I
    .end local p6    # "it$iv":Ljava/lang/Object;
    :goto_38
    nop

    .line 734
    .end local v9    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v15    # "$i$f$cache":I
    .end local p5    # "invalid$iv":Z
    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-static {v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 744
    nop

    .line 745
    nop

    .line 746
    nop

    .line 747
    nop

    .line 748
    nop

    .line 749
    nop

    .line 752
    nop

    .line 754
    nop

    .line 753
    nop

    .line 750
    nop

    .line 751
    nop

    .line 756
    nop

    .line 757
    nop

    .line 755
    and-int/lit16 v3, v6, 0x380

    shr-int/lit8 v9, v6, 0x6

    and-int/lit16 v9, v9, 0x1c00

    or-int/2addr v3, v9

    shl-int/lit8 v9, v23, 0x9

    const v15, 0xe000

    and-int/2addr v9, v15

    or-int/2addr v3, v9

    shl-int/lit8 v9, v23, 0x9

    const/high16 v15, 0x70000

    and-int/2addr v9, v15

    or-int/2addr v3, v9

    shl-int/lit8 v9, v23, 0x9

    const/high16 v15, 0x380000

    and-int/2addr v9, v15

    or-int/2addr v3, v9

    const/high16 v9, 0x1c00000

    shl-int/lit8 v15, v23, 0x9

    and-int/2addr v9, v15

    or-int v24, v3, v9

    shr-int/lit8 v3, v6, 0xf

    and-int/lit16 v3, v3, 0x380

    and-int/lit16 v9, v6, 0x1c00

    or-int/2addr v3, v9

    const v9, 0xe000

    and-int/2addr v9, v6

    or-int/2addr v3, v9

    const/high16 v9, 0x70000

    and-int v9, v23, v9

    or-int v25, v3, v9

    .line 732
    const/16 v22, 0x0

    const/high16 v26, 0x10000

    move-object/from16 v9, p4

    move-object v7, v0

    move v0, v6

    move v15, v8

    move/from16 v29, v23

    move-object/from16 v6, p2

    move-object/from16 v8, p3

    move-object/from16 v23, v5

    .end local v5    # "$composer":Landroidx/compose/runtime/Composer;
    .end local p2    # "textFieldValue":Landroidx/compose/ui/text/input/TextFieldValue;
    .end local p3    # "modifier":Landroidx/compose/ui/Modifier;
    .end local p4    # "textStyle":Landroidx/compose/ui/text/TextStyle;
    .local v0, "$dirty":I
    .local v6, "textFieldValue":Landroidx/compose/ui/text/input/TextFieldValue;
    .local v8, "modifier":Landroidx/compose/ui/Modifier;
    .local v9, "textStyle":Landroidx/compose/ui/text/TextStyle;
    .local v23, "$composer":Landroidx/compose/runtime/Composer;
    .local v29, "$dirty1":I
    invoke-static/range {v6 .. v26}, Landroidx/compose/foundation/text/CoreTextFieldKt;->CoreTextField(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;ZIILandroidx/compose/ui/text/input/ImeOptions;Landroidx/compose/foundation/text/KeyboardActions;ZZLkotlin/jvm/functions/Function3;Landroidx/compose/foundation/text/TextFieldScrollerPosition;Landroidx/compose/runtime/Composer;III)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v3

    if-eqz v3, :cond_50

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 759
    .end local v1    # "textFieldValueState$delegate":Landroidx/compose/runtime/MutableState;
    .end local v4    # "lastTextValue$delegate":Landroidx/compose/runtime/MutableState;
    .end local v6    # "textFieldValue":Landroidx/compose/ui/text/input/TextFieldValue;
    :cond_50
    move-object v3, v8

    move-object v6, v9

    move-object v14, v12

    move-object v15, v13

    move-object/from16 v8, v18

    move/from16 v4, v19

    move/from16 v5, v20

    move-object/from16 v16, v21

    move/from16 v9, v27

    move-object/from16 v7, v28

    move/from16 v20, v0

    move-object v12, v10

    move-object v13, v11

    move/from16 v10, v30

    move/from16 v11, v31

    goto :goto_39

    .end local v0    # "$dirty":I
    .end local v8    # "modifier":Landroidx/compose/ui/Modifier;
    .end local v9    # "textStyle":Landroidx/compose/ui/text/TextStyle;
    .end local v10    # "visualTransformation":Landroidx/compose/ui/text/input/VisualTransformation;
    .end local v11    # "onTextLayout":Lkotlin/jvm/functions/Function1;
    .end local v12    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .end local v13    # "cursorBrush":Landroidx/compose/ui/graphics/Brush;
    .end local v18    # "keyboardActions":Landroidx/compose/foundation/text/KeyboardActions;
    .end local v19    # "enabled":Z
    .end local v20    # "readOnly":Z
    .end local v21    # "decorationBox":Lkotlin/jvm/functions/Function3;
    .end local v23    # "$composer":Landroidx/compose/runtime/Composer;
    .end local v27    # "singleLine":Z
    .end local v28    # "keyboardOptions":Landroidx/compose/foundation/text/KeyboardOptions;
    .end local v29    # "$dirty1":I
    .end local v30    # "maxLines":I
    .end local v31    # "minLines":I
    .restart local v5    # "$composer":Landroidx/compose/runtime/Composer;
    .local v6, "$dirty":I
    .restart local v7    # "$dirty1":I
    .local p2, "modifier":Landroidx/compose/ui/Modifier;
    .local p3, "enabled":Z
    .local p4, "readOnly":Z
    .local p5, "textStyle":Landroidx/compose/ui/text/TextStyle;
    .local p6, "keyboardOptions":Landroidx/compose/foundation/text/KeyboardOptions;
    .restart local p7    # "keyboardActions":Landroidx/compose/foundation/text/KeyboardActions;
    .restart local p8    # "singleLine":Z
    .restart local p9    # "maxLines":I
    .local p10, "minLines":I
    .restart local p11    # "visualTransformation":Landroidx/compose/ui/text/input/VisualTransformation;
    .restart local p12    # "onTextLayout":Lkotlin/jvm/functions/Function1;
    .restart local p13    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .restart local p14    # "cursorBrush":Landroidx/compose/ui/graphics/Brush;
    .restart local p15    # "decorationBox":Lkotlin/jvm/functions/Function3;
    :cond_51
    move-object/from16 v23, v5

    move/from16 v29, v7

    .end local v5    # "$composer":Landroidx/compose/runtime/Composer;
    .end local v7    # "$dirty1":I
    .restart local v23    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v29    # "$dirty1":I
    invoke-interface/range {v23 .. v23}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move/from16 v9, p8

    move-object/from16 v16, p15

    move/from16 v20, v6

    move-object v8, v10

    move v4, v11

    move-object v7, v12

    move v5, v13

    move-object v6, v14

    move-object v3, v15

    move/from16 v10, p9

    move/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    .end local p2    # "modifier":Landroidx/compose/ui/Modifier;
    .end local p3    # "enabled":Z
    .end local p4    # "readOnly":Z
    .end local p5    # "textStyle":Landroidx/compose/ui/text/TextStyle;
    .end local p6    # "keyboardOptions":Landroidx/compose/foundation/text/KeyboardOptions;
    .end local p7    # "keyboardActions":Landroidx/compose/foundation/text/KeyboardActions;
    .end local p8    # "singleLine":Z
    .end local p9    # "maxLines":I
    .end local p10    # "minLines":I
    .end local p11    # "visualTransformation":Landroidx/compose/ui/text/input/VisualTransformation;
    .end local p12    # "onTextLayout":Lkotlin/jvm/functions/Function1;
    .end local p13    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .end local p14    # "cursorBrush":Landroidx/compose/ui/graphics/Brush;
    .end local p15    # "decorationBox":Lkotlin/jvm/functions/Function3;
    .local v3, "modifier":Landroidx/compose/ui/Modifier;
    .local v4, "enabled":Z
    .local v5, "readOnly":Z
    .local v6, "textStyle":Landroidx/compose/ui/text/TextStyle;
    .local v7, "keyboardOptions":Landroidx/compose/foundation/text/KeyboardOptions;
    .local v8, "keyboardActions":Landroidx/compose/foundation/text/KeyboardActions;
    .local v9, "singleLine":Z
    .local v10, "maxLines":I
    .local v11, "minLines":I
    .local v12, "visualTransformation":Landroidx/compose/ui/text/input/VisualTransformation;
    .local v13, "onTextLayout":Lkotlin/jvm/functions/Function1;
    .local v14, "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .local v15, "cursorBrush":Landroidx/compose/ui/graphics/Brush;
    .local v16, "decorationBox":Lkotlin/jvm/functions/Function3;
    .local v20, "$dirty":I
    :goto_39
    invoke-interface/range {v23 .. v23}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v0

    if-eqz v0, :cond_52

    move-object v1, v0

    new-instance v0, Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$9;

    move/from16 v17, p17

    move/from16 v18, p18

    move/from16 v19, p19

    move-object/from16 v35, v1

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v19}, Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$9;-><init>(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Lkotlin/jvm/functions/Function3;III)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    move-object/from16 v1, v35

    invoke-interface {v1, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_52
    return-void
.end method

.method public static final synthetic BasicTextField(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V
    .locals 36
    .param p0, "value"    # Ljava/lang/String;
    .param p1, "onValueChange"    # Lkotlin/jvm/functions/Function1;
    .param p2, "modifier"    # Landroidx/compose/ui/Modifier;
    .param p3, "enabled"    # Z
    .param p4, "readOnly"    # Z
    .param p5, "textStyle"    # Landroidx/compose/ui/text/TextStyle;
    .param p6, "keyboardOptions"    # Landroidx/compose/foundation/text/KeyboardOptions;
    .param p7, "keyboardActions"    # Landroidx/compose/foundation/text/KeyboardActions;
    .param p8, "singleLine"    # Z
    .param p9, "maxLines"    # I
    .param p10, "visualTransformation"    # Landroidx/compose/ui/text/input/VisualTransformation;
    .param p11, "onTextLayout"    # Lkotlin/jvm/functions/Function1;
    .param p12, "interactionSource"    # Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .param p13, "cursorBrush"    # Landroidx/compose/ui/graphics/Brush;
    .param p14, "decorationBox"    # Lkotlin/jvm/functions/Function3;
    .param p15, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p16, "$changed"    # I
    .param p17, "$changed1"    # I
    .annotation runtime Lkotlin/Deprecated;
        level = .enum Lkotlin/DeprecationLevel;->HIDDEN:Lkotlin/DeprecationLevel;
        message = "Maintained for binary compatibility"
    .end annotation

    .line 911
    move/from16 v0, p16

    move/from16 v1, p17

    move/from16 v2, p18

    const v3, -0x1b1aab2e

    move-object/from16 v4, p15

    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v4

    .end local p15    # "$composer":Landroidx/compose/runtime/Composer;
    .local v4, "$composer":Landroidx/compose/runtime/Composer;
    const-string v5, "C(BasicTextField)P(13,9,7,2,10,12,5,4,11,6,14,8,3)906@47102L39,911@47342L579:BasicTextField.kt#423gt5"

    invoke-static {v4, v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    move/from16 v5, p16

    .local v5, "$dirty":I
    move/from16 v6, p17

    .local v6, "$dirty1":I
    and-int/lit8 v7, v2, 0x1

    if-eqz v7, :cond_0

    or-int/lit8 v5, v5, 0x6

    move-object/from16 v7, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v7, v0, 0x6

    if-nez v7, :cond_2

    move-object/from16 v7, p0

    invoke-interface {v4, v7}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_1

    const/4 v10, 0x4

    goto :goto_0

    :cond_1
    const/4 v10, 0x2

    :goto_0
    or-int/2addr v5, v10

    goto :goto_1

    :cond_2
    move-object/from16 v7, p0

    :goto_1
    and-int/lit8 v10, v2, 0x2

    if-eqz v10, :cond_3

    or-int/lit8 v5, v5, 0x30

    move-object/from16 v10, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v10, v0, 0x30

    if-nez v10, :cond_5

    move-object/from16 v10, p1

    invoke-interface {v4, v10}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_4

    const/16 v13, 0x20

    goto :goto_2

    :cond_4
    const/16 v13, 0x10

    :goto_2
    or-int/2addr v5, v13

    goto :goto_3

    :cond_5
    move-object/from16 v10, p1

    :goto_3
    and-int/lit8 v13, v2, 0x4

    if-eqz v13, :cond_6

    or-int/lit16 v5, v5, 0x180

    move-object/from16 v8, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v8, v0, 0x180

    if-nez v8, :cond_8

    move-object/from16 v8, p2

    invoke-interface {v4, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

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
    move-object/from16 v8, p2

    :goto_5
    and-int/lit8 v16, v2, 0x8

    const/16 v17, 0x800

    const/16 v18, 0x400

    if-eqz v16, :cond_9

    or-int/lit16 v5, v5, 0xc00

    move/from16 v9, p3

    goto :goto_7

    :cond_9
    and-int/lit16 v9, v0, 0xc00

    if-nez v9, :cond_b

    move/from16 v9, p3

    invoke-interface {v4, v9}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v20

    if-eqz v20, :cond_a

    move/from16 v20, v17

    goto :goto_6

    :cond_a
    move/from16 v20, v18

    :goto_6
    or-int v5, v5, v20

    goto :goto_7

    :cond_b
    move/from16 v9, p3

    :goto_7
    and-int/lit8 v20, v2, 0x10

    const/16 v21, 0x4000

    const/16 v22, 0x2000

    if-eqz v20, :cond_c

    or-int/lit16 v5, v5, 0x6000

    move/from16 v11, p4

    goto :goto_9

    :cond_c
    and-int/lit16 v11, v0, 0x6000

    if-nez v11, :cond_e

    move/from16 v11, p4

    invoke-interface {v4, v11}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v24

    if-eqz v24, :cond_d

    move/from16 v24, v21

    goto :goto_8

    :cond_d
    move/from16 v24, v22

    :goto_8
    or-int v5, v5, v24

    goto :goto_9

    :cond_e
    move/from16 v11, p4

    :goto_9
    and-int/lit8 v24, v2, 0x20

    const/high16 v25, 0x30000

    if-eqz v24, :cond_f

    or-int v5, v5, v25

    move-object/from16 v12, p5

    goto :goto_b

    :cond_f
    and-int v25, v0, v25

    if-nez v25, :cond_11

    move-object/from16 v12, p5

    invoke-interface {v4, v12}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v26

    if-eqz v26, :cond_10

    const/high16 v26, 0x20000

    goto :goto_a

    :cond_10
    const/high16 v26, 0x10000

    :goto_a
    or-int v5, v5, v26

    goto :goto_b

    :cond_11
    move-object/from16 v12, p5

    :goto_b
    and-int/lit8 v26, v2, 0x40

    const/high16 v27, 0x180000

    if-eqz v26, :cond_12

    or-int v5, v5, v27

    move-object/from16 v14, p6

    goto :goto_d

    :cond_12
    and-int v27, v0, v27

    if-nez v27, :cond_14

    move-object/from16 v14, p6

    invoke-interface {v4, v14}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

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
    move-object/from16 v14, p6

    :goto_d
    and-int/lit16 v15, v2, 0x80

    const/high16 v29, 0xc00000

    if-eqz v15, :cond_15

    or-int v5, v5, v29

    move-object/from16 v3, p7

    goto :goto_f

    :cond_15
    and-int v29, v0, v29

    if-nez v29, :cond_17

    move-object/from16 v3, p7

    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

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
    move-object/from16 v3, p7

    :goto_f
    and-int/lit16 v0, v2, 0x100

    const/high16 v30, 0x6000000

    if-eqz v0, :cond_18

    or-int v5, v5, v30

    move/from16 v30, v0

    move/from16 v0, p8

    goto :goto_11

    :cond_18
    and-int v30, p16, v30

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
    and-int/lit16 v0, v2, 0x200

    const/high16 v31, 0x30000000

    if-eqz v0, :cond_1b

    or-int v5, v5, v31

    move/from16 v31, v0

    move/from16 v0, p9

    goto :goto_13

    :cond_1b
    and-int v31, p16, v31

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
    and-int/lit16 v0, v2, 0x400

    if-eqz v0, :cond_1e

    or-int/lit8 v6, v6, 0x6

    move/from16 v32, v0

    move-object/from16 v0, p10

    goto :goto_15

    :cond_1e
    and-int/lit8 v32, v1, 0x6

    if-nez v32, :cond_20

    move/from16 v32, v0

    move-object/from16 v0, p10

    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v33

    if-eqz v33, :cond_1f

    const/16 v19, 0x4

    goto :goto_14

    :cond_1f
    const/16 v19, 0x2

    :goto_14
    or-int v6, v6, v19

    goto :goto_15

    :cond_20
    move/from16 v32, v0

    move-object/from16 v0, p10

    :goto_15
    and-int/lit16 v0, v2, 0x800

    if-eqz v0, :cond_21

    or-int/lit8 v6, v6, 0x30

    move/from16 v19, v0

    move-object/from16 v0, p11

    goto :goto_17

    :cond_21
    and-int/lit8 v19, v1, 0x30

    if-nez v19, :cond_23

    move/from16 v19, v0

    move-object/from16 v0, p11

    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v33

    if-eqz v33, :cond_22

    const/16 v23, 0x20

    goto :goto_16

    :cond_22
    const/16 v23, 0x10

    :goto_16
    or-int v6, v6, v23

    goto :goto_17

    :cond_23
    move/from16 v19, v0

    move-object/from16 v0, p11

    :goto_17
    and-int/lit16 v0, v2, 0x1000

    if-eqz v0, :cond_24

    or-int/lit16 v6, v6, 0x180

    move/from16 v23, v0

    move-object/from16 v0, p12

    goto :goto_19

    :cond_24
    move/from16 v23, v0

    and-int/lit16 v0, v1, 0x180

    if-nez v0, :cond_26

    move-object/from16 v0, p12

    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v25

    if-eqz v25, :cond_25

    const/16 v27, 0x100

    goto :goto_18

    :cond_25
    const/16 v27, 0x80

    :goto_18
    or-int v6, v6, v27

    goto :goto_19

    :cond_26
    move-object/from16 v0, p12

    :goto_19
    and-int/lit16 v0, v2, 0x2000

    if-eqz v0, :cond_27

    or-int/lit16 v6, v6, 0xc00

    move/from16 v25, v0

    move-object/from16 v0, p13

    goto :goto_1b

    :cond_27
    move/from16 v25, v0

    and-int/lit16 v0, v1, 0xc00

    if-nez v0, :cond_29

    move-object/from16 v0, p13

    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v27

    if-eqz v27, :cond_28

    goto :goto_1a

    :cond_28
    move/from16 v17, v18

    :goto_1a
    or-int v6, v6, v17

    goto :goto_1b

    :cond_29
    move-object/from16 v0, p13

    :goto_1b
    and-int/lit16 v0, v2, 0x4000

    if-eqz v0, :cond_2a

    or-int/lit16 v6, v6, 0x6000

    move/from16 v17, v0

    move-object/from16 v0, p14

    goto :goto_1d

    :cond_2a
    move/from16 v17, v0

    and-int/lit16 v0, v1, 0x6000

    if-nez v0, :cond_2c

    move-object/from16 v0, p14

    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_2b

    goto :goto_1c

    :cond_2b
    move/from16 v21, v22

    :goto_1c
    or-int v6, v6, v21

    goto :goto_1d

    :cond_2c
    move-object/from16 v0, p14

    :goto_1d
    const v18, 0x12492493

    and-int v0, v5, v18

    const v1, 0x12492492

    if-ne v0, v1, :cond_2e

    and-int/lit16 v0, v6, 0x2493

    const/16 v1, 0x2492

    if-eq v0, v1, :cond_2d

    goto :goto_1e

    :cond_2d
    const/4 v0, 0x0

    goto :goto_1f

    :cond_2e
    :goto_1e
    const/4 v0, 0x1

    :goto_1f
    and-int/lit8 v1, v5, 0x1

    invoke-interface {v4, v0, v1}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v0

    if-eqz v0, :cond_3f

    if-eqz v13, :cond_2f

    .line 897
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v0, Landroidx/compose/ui/Modifier;

    .end local p2    # "modifier":Landroidx/compose/ui/Modifier;
    .local v0, "modifier":Landroidx/compose/ui/Modifier;
    goto :goto_20

    .line 911
    .end local v0    # "modifier":Landroidx/compose/ui/Modifier;
    .restart local p2    # "modifier":Landroidx/compose/ui/Modifier;
    :cond_2f
    move-object v0, v8

    .line 897
    .end local p2    # "modifier":Landroidx/compose/ui/Modifier;
    .restart local v0    # "modifier":Landroidx/compose/ui/Modifier;
    :goto_20
    if-eqz v16, :cond_30

    .line 898
    const/4 v1, 0x1

    move v7, v1

    .end local p3    # "enabled":Z
    .local v1, "enabled":Z
    goto :goto_21

    .line 897
    .end local v1    # "enabled":Z
    .restart local p3    # "enabled":Z
    :cond_30
    move v7, v9

    .line 898
    .end local p3    # "enabled":Z
    .local v7, "enabled":Z
    :goto_21
    if-eqz v20, :cond_31

    .line 899
    const/4 v1, 0x0

    move v8, v1

    .end local p4    # "readOnly":Z
    .local v1, "readOnly":Z
    goto :goto_22

    .line 898
    .end local v1    # "readOnly":Z
    .restart local p4    # "readOnly":Z
    :cond_31
    move v8, v11

    .line 899
    .end local p4    # "readOnly":Z
    .local v8, "readOnly":Z
    :goto_22
    if-eqz v24, :cond_32

    .line 900
    sget-object v1, Landroidx/compose/ui/text/TextStyle;->Companion:Landroidx/compose/ui/text/TextStyle$Companion;

    invoke-virtual {v1}, Landroidx/compose/ui/text/TextStyle$Companion;->getDefault()Landroidx/compose/ui/text/TextStyle;

    move-result-object v1

    move-object v9, v1

    .end local p5    # "textStyle":Landroidx/compose/ui/text/TextStyle;
    .local v1, "textStyle":Landroidx/compose/ui/text/TextStyle;
    goto :goto_23

    .line 899
    .end local v1    # "textStyle":Landroidx/compose/ui/text/TextStyle;
    .restart local p5    # "textStyle":Landroidx/compose/ui/text/TextStyle;
    :cond_32
    move-object v9, v12

    .line 900
    .end local p5    # "textStyle":Landroidx/compose/ui/text/TextStyle;
    .local v9, "textStyle":Landroidx/compose/ui/text/TextStyle;
    :goto_23
    if-eqz v26, :cond_33

    .line 901
    sget-object v1, Landroidx/compose/foundation/text/KeyboardOptions;->Companion:Landroidx/compose/foundation/text/KeyboardOptions$Companion;

    invoke-virtual {v1}, Landroidx/compose/foundation/text/KeyboardOptions$Companion;->getDefault()Landroidx/compose/foundation/text/KeyboardOptions;

    move-result-object v1

    move-object v10, v1

    .end local p6    # "keyboardOptions":Landroidx/compose/foundation/text/KeyboardOptions;
    .local v1, "keyboardOptions":Landroidx/compose/foundation/text/KeyboardOptions;
    goto :goto_24

    .line 900
    .end local v1    # "keyboardOptions":Landroidx/compose/foundation/text/KeyboardOptions;
    .restart local p6    # "keyboardOptions":Landroidx/compose/foundation/text/KeyboardOptions;
    :cond_33
    move-object v10, v14

    .line 901
    .end local p6    # "keyboardOptions":Landroidx/compose/foundation/text/KeyboardOptions;
    .local v10, "keyboardOptions":Landroidx/compose/foundation/text/KeyboardOptions;
    :goto_24
    if-eqz v15, :cond_34

    .line 902
    sget-object v1, Landroidx/compose/foundation/text/KeyboardActions;->Companion:Landroidx/compose/foundation/text/KeyboardActions$Companion;

    invoke-virtual {v1}, Landroidx/compose/foundation/text/KeyboardActions$Companion;->getDefault()Landroidx/compose/foundation/text/KeyboardActions;

    move-result-object v1

    move-object v11, v1

    .end local p7    # "keyboardActions":Landroidx/compose/foundation/text/KeyboardActions;
    .local v1, "keyboardActions":Landroidx/compose/foundation/text/KeyboardActions;
    goto :goto_25

    .line 901
    .end local v1    # "keyboardActions":Landroidx/compose/foundation/text/KeyboardActions;
    .restart local p7    # "keyboardActions":Landroidx/compose/foundation/text/KeyboardActions;
    :cond_34
    move-object v11, v3

    .line 902
    .end local p7    # "keyboardActions":Landroidx/compose/foundation/text/KeyboardActions;
    .local v11, "keyboardActions":Landroidx/compose/foundation/text/KeyboardActions;
    :goto_25
    if-eqz v30, :cond_35

    .line 903
    const/4 v1, 0x0

    move v12, v1

    .end local p8    # "singleLine":Z
    .local v1, "singleLine":Z
    goto :goto_26

    .line 902
    .end local v1    # "singleLine":Z
    .restart local p8    # "singleLine":Z
    :cond_35
    move/from16 v12, p8

    .line 903
    .end local p8    # "singleLine":Z
    .local v12, "singleLine":Z
    :goto_26
    if-eqz v31, :cond_36

    .line 904
    const v1, 0x7fffffff

    move v13, v1

    .end local p9    # "maxLines":I
    .local v1, "maxLines":I
    goto :goto_27

    .line 903
    .end local v1    # "maxLines":I
    .restart local p9    # "maxLines":I
    :cond_36
    move/from16 v13, p9

    .line 904
    .end local p9    # "maxLines":I
    .local v13, "maxLines":I
    :goto_27
    if-eqz v32, :cond_37

    .line 905
    sget-object v1, Landroidx/compose/ui/text/input/VisualTransformation;->Companion:Landroidx/compose/ui/text/input/VisualTransformation$Companion;

    invoke-virtual {v1}, Landroidx/compose/ui/text/input/VisualTransformation$Companion;->getNone()Landroidx/compose/ui/text/input/VisualTransformation;

    move-result-object v1

    move-object v15, v1

    .end local p10    # "visualTransformation":Landroidx/compose/ui/text/input/VisualTransformation;
    .local v1, "visualTransformation":Landroidx/compose/ui/text/input/VisualTransformation;
    goto :goto_28

    .line 904
    .end local v1    # "visualTransformation":Landroidx/compose/ui/text/input/VisualTransformation;
    .restart local p10    # "visualTransformation":Landroidx/compose/ui/text/input/VisualTransformation;
    :cond_37
    move-object/from16 v15, p10

    .line 905
    .end local p10    # "visualTransformation":Landroidx/compose/ui/text/input/VisualTransformation;
    .local v15, "visualTransformation":Landroidx/compose/ui/text/input/VisualTransformation;
    :goto_28
    if-eqz v19, :cond_38

    .line 906
    sget-object v1, Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$13;->INSTANCE:Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$13;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    move-object/from16 v16, v1

    .end local p11    # "onTextLayout":Lkotlin/jvm/functions/Function1;
    .local v1, "onTextLayout":Lkotlin/jvm/functions/Function1;
    goto :goto_29

    .line 905
    .end local v1    # "onTextLayout":Lkotlin/jvm/functions/Function1;
    .restart local p11    # "onTextLayout":Lkotlin/jvm/functions/Function1;
    :cond_38
    move-object/from16 v16, p11

    .line 906
    .end local p11    # "onTextLayout":Lkotlin/jvm/functions/Function1;
    .local v16, "onTextLayout":Lkotlin/jvm/functions/Function1;
    :goto_29
    if-eqz v23, :cond_3a

    .line 907
    const v1, -0x4a126f93    # -1.769991E-6f

    const-string v3, "CC(remember):BasicTextField.kt#9igjgp"

    invoke-static {v4, v1, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    const/4 v1, 0x0

    .local v1, "invalid$iv":Z
    move-object v3, v4

    .local v3, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/4 v14, 0x0

    .line 1172
    .local v14, "$i$f$cache":I
    move-object/from16 p2, v0

    .end local v0    # "modifier":Landroidx/compose/ui/Modifier;
    .restart local p2    # "modifier":Landroidx/compose/ui/Modifier;
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v0

    .local v0, "it$iv":Ljava/lang/Object;
    const/16 v18, 0x0

    .line 1173
    .local v18, "$i$a$-let-ComposerKt$cache$1$iv":I
    sget-object v19, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move/from16 p3, v1

    .end local v1    # "invalid$iv":Z
    .local p3, "invalid$iv":Z
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_39

    .line 1174
    const/4 v1, 0x0

    .line 907
    .local v1, "$i$a$-cache-BasicTextFieldKt$BasicTextField$14":I
    invoke-static {}, Landroidx/compose/foundation/interaction/InteractionSourceKt;->MutableInteractionSource()Landroidx/compose/foundation/interaction/MutableInteractionSource;

    move-result-object v1

    .line 1174
    .end local v1    # "$i$a$-cache-BasicTextFieldKt$BasicTextField$14":I
    nop

    .line 1175
    .local v1, "value$iv":Ljava/lang/Object;
    invoke-interface {v3, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1176
    move-object v0, v1

    .end local v1    # "value$iv":Ljava/lang/Object;
    goto :goto_2a

    .line 1177
    :cond_39
    nop

    .line 1172
    .end local v0    # "it$iv":Ljava/lang/Object;
    .end local v18    # "$i$a$-let-ComposerKt$cache$1$iv":I
    :goto_2a
    nop

    .line 907
    .end local v3    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v14    # "$i$f$cache":I
    .end local p3    # "invalid$iv":Z
    check-cast v0, Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .end local p12    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .local v0, "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    invoke-static {v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    move/from16 v35, v17

    move-object/from16 v17, v0

    move/from16 v0, v35

    goto :goto_2b

    .line 906
    .end local p2    # "modifier":Landroidx/compose/ui/Modifier;
    .local v0, "modifier":Landroidx/compose/ui/Modifier;
    .restart local p12    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    :cond_3a
    move-object/from16 p2, v0

    .end local v0    # "modifier":Landroidx/compose/ui/Modifier;
    .restart local p2    # "modifier":Landroidx/compose/ui/Modifier;
    move/from16 v0, v17

    move-object/from16 v17, p12

    .line 907
    .end local p12    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .local v17, "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    :goto_2b
    if-eqz v25, :cond_3b

    .line 908
    new-instance v1, Landroidx/compose/ui/graphics/SolidColor;

    sget-object v3, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    invoke-virtual {v3}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    move-result-wide v2

    const/4 v14, 0x0

    invoke-direct {v1, v2, v3, v14}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v1, Landroidx/compose/ui/graphics/Brush;

    move-object/from16 v18, v1

    .end local p13    # "cursorBrush":Landroidx/compose/ui/graphics/Brush;
    .local v1, "cursorBrush":Landroidx/compose/ui/graphics/Brush;
    goto :goto_2c

    .line 907
    .end local v1    # "cursorBrush":Landroidx/compose/ui/graphics/Brush;
    .restart local p13    # "cursorBrush":Landroidx/compose/ui/graphics/Brush;
    :cond_3b
    move-object/from16 v18, p13

    .line 908
    .end local p13    # "cursorBrush":Landroidx/compose/ui/graphics/Brush;
    .local v18, "cursorBrush":Landroidx/compose/ui/graphics/Brush;
    :goto_2c
    if-eqz v0, :cond_3c

    sget-object v0, Landroidx/compose/foundation/text/ComposableSingletons$BasicTextFieldKt;->INSTANCE:Landroidx/compose/foundation/text/ComposableSingletons$BasicTextFieldKt;

    invoke-virtual {v0}, Landroidx/compose/foundation/text/ComposableSingletons$BasicTextFieldKt;->getLambda-3$foundation_release()Lkotlin/jvm/functions/Function3;

    move-result-object v0

    move-object/from16 v19, v0

    .end local p14    # "decorationBox":Lkotlin/jvm/functions/Function3;
    .local v0, "decorationBox":Lkotlin/jvm/functions/Function3;
    goto :goto_2d

    .end local v0    # "decorationBox":Lkotlin/jvm/functions/Function3;
    .restart local p14    # "decorationBox":Lkotlin/jvm/functions/Function3;
    :cond_3c
    move-object/from16 v19, p14

    .end local p14    # "decorationBox":Lkotlin/jvm/functions/Function3;
    .local v19, "decorationBox":Lkotlin/jvm/functions/Function3;
    :goto_2d
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_3d

    .line 911
    const-string v0, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:910)"

    const v1, -0x1b1aab2e

    invoke-static {v1, v5, v6, v0}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 913
    :cond_3d
    nop

    .line 914
    nop

    .line 915
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

    .line 923
    nop

    .line 922
    nop

    .line 924
    nop

    .line 925
    nop

    .line 926
    nop

    .line 927
    nop

    .line 928
    and-int/lit8 v0, v5, 0xe

    and-int/lit8 v1, v5, 0x70

    or-int/2addr v0, v1

    and-int/lit16 v1, v5, 0x380

    or-int/2addr v0, v1

    and-int/lit16 v1, v5, 0x1c00

    or-int/2addr v0, v1

    const v1, 0xe000

    and-int/2addr v1, v5

    or-int/2addr v0, v1

    const/high16 v1, 0x70000

    and-int/2addr v1, v5

    or-int/2addr v0, v1

    const/high16 v1, 0x380000

    and-int/2addr v1, v5

    or-int/2addr v0, v1

    const/high16 v1, 0x1c00000

    and-int/2addr v1, v5

    or-int/2addr v0, v1

    const/high16 v1, 0xe000000

    and-int/2addr v1, v5

    or-int/2addr v0, v1

    const/high16 v1, 0x70000000

    and-int/2addr v1, v5

    or-int v21, v0, v1

    shl-int/lit8 v0, v6, 0x3

    and-int/lit8 v0, v0, 0x70

    or-int/lit8 v0, v0, 0x6

    shl-int/lit8 v1, v6, 0x3

    and-int/lit16 v1, v1, 0x380

    or-int/2addr v0, v1

    shl-int/lit8 v1, v6, 0x3

    and-int/lit16 v1, v1, 0x1c00

    or-int/2addr v0, v1

    shl-int/lit8 v1, v6, 0x3

    const v2, 0xe000

    and-int/2addr v1, v2

    or-int/2addr v0, v1

    const/high16 v1, 0x70000

    shl-int/lit8 v2, v6, 0x3

    and-int/2addr v1, v2

    or-int v22, v0, v1

    .line 912
    const/4 v14, 0x1

    const/16 v23, 0x0

    move-object/from16 v20, v4

    move/from16 v25, v5

    move/from16 v24, v6

    move-object/from16 v4, p0

    move-object/from16 v5, p1

    move-object/from16 v6, p2

    .end local v4    # "$composer":Landroidx/compose/runtime/Composer;
    .end local v5    # "$dirty":I
    .end local p2    # "modifier":Landroidx/compose/ui/Modifier;
    .local v6, "modifier":Landroidx/compose/ui/Modifier;
    .local v20, "$composer":Landroidx/compose/runtime/Composer;
    .local v24, "$dirty1":I
    .local v25, "$dirty":I
    invoke-static/range {v4 .. v23}, Landroidx/compose/foundation/text/BasicTextFieldKt;->BasicTextField(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_3e

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 930
    :cond_3e
    move-object v3, v6

    move v4, v7

    move v5, v8

    move-object v6, v9

    move-object v7, v10

    move-object v8, v11

    move v9, v12

    move v10, v13

    move-object v11, v15

    move-object/from16 v12, v16

    move-object/from16 v13, v17

    move-object/from16 v14, v18

    move-object/from16 v15, v19

    goto :goto_2e

    .end local v7    # "enabled":Z
    .end local v8    # "readOnly":Z
    .end local v9    # "textStyle":Landroidx/compose/ui/text/TextStyle;
    .end local v10    # "keyboardOptions":Landroidx/compose/foundation/text/KeyboardOptions;
    .end local v11    # "keyboardActions":Landroidx/compose/foundation/text/KeyboardActions;
    .end local v12    # "singleLine":Z
    .end local v13    # "maxLines":I
    .end local v15    # "visualTransformation":Landroidx/compose/ui/text/input/VisualTransformation;
    .end local v16    # "onTextLayout":Lkotlin/jvm/functions/Function1;
    .end local v17    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .end local v18    # "cursorBrush":Landroidx/compose/ui/graphics/Brush;
    .end local v19    # "decorationBox":Lkotlin/jvm/functions/Function3;
    .end local v20    # "$composer":Landroidx/compose/runtime/Composer;
    .end local v24    # "$dirty1":I
    .end local v25    # "$dirty":I
    .restart local v4    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v5    # "$dirty":I
    .local v6, "$dirty1":I
    .restart local p2    # "modifier":Landroidx/compose/ui/Modifier;
    .local p3, "enabled":Z
    .restart local p4    # "readOnly":Z
    .restart local p5    # "textStyle":Landroidx/compose/ui/text/TextStyle;
    .restart local p6    # "keyboardOptions":Landroidx/compose/foundation/text/KeyboardOptions;
    .restart local p7    # "keyboardActions":Landroidx/compose/foundation/text/KeyboardActions;
    .restart local p8    # "singleLine":Z
    .restart local p9    # "maxLines":I
    .restart local p10    # "visualTransformation":Landroidx/compose/ui/text/input/VisualTransformation;
    .restart local p11    # "onTextLayout":Lkotlin/jvm/functions/Function1;
    .restart local p12    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .restart local p13    # "cursorBrush":Landroidx/compose/ui/graphics/Brush;
    .restart local p14    # "decorationBox":Lkotlin/jvm/functions/Function3;
    :cond_3f
    move-object/from16 v20, v4

    move/from16 v25, v5

    move/from16 v24, v6

    .end local v4    # "$composer":Landroidx/compose/runtime/Composer;
    .end local v5    # "$dirty":I
    .end local v6    # "$dirty1":I
    .restart local v20    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v24    # "$dirty1":I
    .restart local v25    # "$dirty":I
    invoke-interface/range {v20 .. v20}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object v4, v8

    move-object v8, v3

    move-object v3, v4

    move/from16 v10, p9

    move-object/from16 v13, p12

    move-object/from16 v15, p14

    move v4, v9

    move v5, v11

    move-object v6, v12

    move-object v7, v14

    move/from16 v9, p8

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v14, p13

    .end local p2    # "modifier":Landroidx/compose/ui/Modifier;
    .end local p3    # "enabled":Z
    .end local p4    # "readOnly":Z
    .end local p5    # "textStyle":Landroidx/compose/ui/text/TextStyle;
    .end local p6    # "keyboardOptions":Landroidx/compose/foundation/text/KeyboardOptions;
    .end local p7    # "keyboardActions":Landroidx/compose/foundation/text/KeyboardActions;
    .end local p8    # "singleLine":Z
    .end local p9    # "maxLines":I
    .end local p10    # "visualTransformation":Landroidx/compose/ui/text/input/VisualTransformation;
    .end local p11    # "onTextLayout":Lkotlin/jvm/functions/Function1;
    .end local p12    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .end local p13    # "cursorBrush":Landroidx/compose/ui/graphics/Brush;
    .end local p14    # "decorationBox":Lkotlin/jvm/functions/Function3;
    .local v3, "modifier":Landroidx/compose/ui/Modifier;
    .local v4, "enabled":Z
    .local v5, "readOnly":Z
    .local v6, "textStyle":Landroidx/compose/ui/text/TextStyle;
    .local v7, "keyboardOptions":Landroidx/compose/foundation/text/KeyboardOptions;
    .local v8, "keyboardActions":Landroidx/compose/foundation/text/KeyboardActions;
    .local v9, "singleLine":Z
    .local v10, "maxLines":I
    .local v11, "visualTransformation":Landroidx/compose/ui/text/input/VisualTransformation;
    .local v12, "onTextLayout":Lkotlin/jvm/functions/Function1;
    .local v13, "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .local v14, "cursorBrush":Landroidx/compose/ui/graphics/Brush;
    .local v15, "decorationBox":Lkotlin/jvm/functions/Function3;
    :goto_2e
    invoke-interface/range {v20 .. v20}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v0

    if-eqz v0, :cond_40

    move-object v1, v0

    new-instance v0, Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$15;

    move-object/from16 v2, p1

    move/from16 v16, p16

    move/from16 v17, p17

    move/from16 v18, p18

    move-object/from16 v34, v1

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v18}, Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$15;-><init>(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Lkotlin/jvm/functions/Function3;III)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    move-object/from16 v1, v34

    invoke-interface {v1, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_40
    return-void
.end method

.method private static final BasicTextField$lambda$24(Landroidx/compose/runtime/MutableState;)Landroidx/compose/ui/text/input/TextFieldValue;
    .locals 4
    .param p0, "$textFieldValueState$delegate"    # Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/MutableState<",
            "Landroidx/compose/ui/text/input/TextFieldValue;",
            ">;)",
            "Landroidx/compose/ui/text/input/TextFieldValue;"
        }
    .end annotation

    .line 713
    move-object v0, p0

    check-cast v0, Landroidx/compose/runtime/State;

    .local v0, "$this$getValue$iv":Landroidx/compose/runtime/State;
    const/4 v1, 0x0

    .local v1, "thisObj$iv":Ljava/lang/Object;
    const/4 v2, 0x0

    .local v2, "property$iv":Lkotlin/reflect/KProperty;
    const/4 v3, 0x0

    .line 1187
    .local v3, "$i$f$getValue":I
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    .end local v0    # "$this$getValue$iv":Landroidx/compose/runtime/State;
    .end local v1    # "thisObj$iv":Ljava/lang/Object;
    .end local v2    # "property$iv":Lkotlin/reflect/KProperty;
    .end local v3    # "$i$f$getValue":I
    check-cast v0, Landroidx/compose/ui/text/input/TextFieldValue;

    .line 713
    return-object v0
.end method

.method private static final BasicTextField$lambda$25(Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/text/input/TextFieldValue;)V
    .locals 4
    .param p0, "$textFieldValueState$delegate"    # Landroidx/compose/runtime/MutableState;
    .param p1, "value"    # Landroidx/compose/ui/text/input/TextFieldValue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/MutableState<",
            "Landroidx/compose/ui/text/input/TextFieldValue;",
            ">;",
            "Landroidx/compose/ui/text/input/TextFieldValue;",
            ")V"
        }
    .end annotation

    .line 713
    const/4 v0, 0x0

    .local v0, "thisObj$iv":Ljava/lang/Object;
    const/4 v1, 0x0

    .local v1, "property$iv":Lkotlin/reflect/KProperty;
    move-object v2, p0

    .local v2, "$this$setValue$iv":Landroidx/compose/runtime/MutableState;
    const/4 v3, 0x0

    .line 1188
    .local v3, "$i$f$setValue":I
    invoke-interface {v2, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 1189
    nop

    .line 713
    .end local v0    # "thisObj$iv":Ljava/lang/Object;
    .end local v1    # "property$iv":Lkotlin/reflect/KProperty;
    .end local v2    # "$this$setValue$iv":Landroidx/compose/runtime/MutableState;
    .end local v3    # "$i$f$setValue":I
    return-void
.end method

.method private static final BasicTextField$lambda$28(Landroidx/compose/runtime/MutableState;)Ljava/lang/String;
    .locals 4
    .param p0, "$lastTextValue$delegate"    # Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 730
    move-object v0, p0

    check-cast v0, Landroidx/compose/runtime/State;

    .local v0, "$this$getValue$iv":Landroidx/compose/runtime/State;
    const/4 v1, 0x0

    .local v1, "thisObj$iv":Ljava/lang/Object;
    const/4 v2, 0x0

    .local v2, "property$iv":Lkotlin/reflect/KProperty;
    const/4 v3, 0x0

    .line 1190
    .local v3, "$i$f$getValue":I
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    .end local v0    # "$this$getValue$iv":Landroidx/compose/runtime/State;
    .end local v1    # "thisObj$iv":Ljava/lang/Object;
    .end local v2    # "property$iv":Lkotlin/reflect/KProperty;
    .end local v3    # "$i$f$getValue":I
    check-cast v0, Ljava/lang/String;

    .line 730
    return-object v0
.end method

.method private static final BasicTextField$lambda$29(Landroidx/compose/runtime/MutableState;Ljava/lang/String;)V
    .locals 4
    .param p0, "$lastTextValue$delegate"    # Landroidx/compose/runtime/MutableState;
    .param p1, "value"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 730
    const/4 v0, 0x0

    .local v0, "thisObj$iv":Ljava/lang/Object;
    const/4 v1, 0x0

    .local v1, "property$iv":Lkotlin/reflect/KProperty;
    move-object v2, p0

    .local v2, "$this$setValue$iv":Landroidx/compose/runtime/MutableState;
    const/4 v3, 0x0

    .line 1191
    .local v3, "$i$f$setValue":I
    invoke-interface {v2, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 1192
    nop

    .line 730
    .end local v0    # "thisObj$iv":Ljava/lang/Object;
    .end local v1    # "property$iv":Lkotlin/reflect/KProperty;
    .end local v2    # "$this$setValue$iv":Landroidx/compose/runtime/MutableState;
    .end local v3    # "$i$f$setValue":I
    return-void
.end method

.method public static final TextFieldCursorHandle(Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Landroidx/compose/runtime/Composer;I)V
    .locals 11
    .param p0, "selectionState"    # Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;
    .param p1, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p2, "$changed"    # I

    .line 502
    const v0, 0x76b52065

    invoke-interface {p1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v5

    .end local p1    # "$composer":Landroidx/compose/runtime/Composer;
    .local v5, "$composer":Landroidx/compose/runtime/Composer;
    const-string p1, "C(TextFieldCursorHandle)504@26102L128:BasicTextField.kt#423gt5"

    invoke-static {v5, p1}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    move p1, p2

    .local p1, "$dirty":I
    and-int/lit8 v1, p2, 0x6

    const/4 v2, 0x2

    if-nez v1, :cond_1

    invoke-interface {v5, p0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    or-int/2addr p1, v1

    :cond_1
    and-int/lit8 v1, p1, 0x3

    if-eq v1, v2, :cond_2

    const/4 v1, 0x1

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    :goto_1
    and-int/lit8 v2, p1, 0x1

    invoke-interface {v5, v1, v2}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v1

    if-eqz v1, :cond_b

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_3

    const/4 v1, -0x1

    const-string v2, "androidx.compose.foundation.text.TextFieldCursorHandle (BasicTextField.kt:501)"

    invoke-static {v0, p1, v1, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 505
    :cond_3
    const v0, -0x195fc4dc

    const-string v1, "CC(remember):BasicTextField.kt#9igjgp"

    invoke-static {v5, v0, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v5, p0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v0

    .local v0, "invalid$iv":Z
    move-object v2, v5

    .local v2, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/4 v3, 0x0

    .line 1088
    .local v3, "$i$f$cache":I
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v4

    .local v4, "it$iv":Ljava/lang/Object;
    const/4 v6, 0x0

    .line 1089
    .local v6, "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez v0, :cond_5

    sget-object v7, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v7}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v7

    if-ne v4, v7, :cond_4

    goto :goto_2

    .line 1093
    :cond_4
    goto :goto_3

    .line 1090
    :cond_5
    :goto_2
    const/4 v7, 0x0

    .line 506
    .local v7, "$i$a$-cache-BasicTextFieldKt$TextFieldCursorHandle$cursorHandleState$2":I
    new-instance v8, Landroidx/compose/foundation/text/BasicTextFieldKt$TextFieldCursorHandle$cursorHandleState$2$1;

    invoke-direct {v8, p0}, Landroidx/compose/foundation/text/BasicTextFieldKt$TextFieldCursorHandle$cursorHandleState$2$1;-><init>(Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;)V

    check-cast v8, Lkotlin/jvm/functions/Function0;

    invoke-static {v8}, Landroidx/compose/runtime/SnapshotStateKt;->derivedStateOf(Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/State;

    move-result-object v7

    .line 1090
    .end local v7    # "$i$a$-cache-BasicTextFieldKt$TextFieldCursorHandle$cursorHandleState$2":I
    nop

    .line 1091
    .local v7, "value$iv":Ljava/lang/Object;
    invoke-interface {v2, v7}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1092
    move-object v4, v7

    .line 1088
    .end local v4    # "it$iv":Ljava/lang/Object;
    .end local v6    # "$i$a$-let-ComposerKt$cache$1$iv":I
    .end local v7    # "value$iv":Ljava/lang/Object;
    :goto_3
    nop

    .line 505
    .end local v0    # "invalid$iv":Z
    .end local v2    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v3    # "$i$f$cache":I
    check-cast v4, Landroidx/compose/runtime/State;

    invoke-static {v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 504
    move-object v0, v4

    .line 508
    .local v0, "cursorHandleState$delegate":Landroidx/compose/runtime/State;
    invoke-static {v0}, Landroidx/compose/foundation/text/BasicTextFieldKt;->TextFieldCursorHandle$lambda$12(Landroidx/compose/runtime/State;)Landroidx/compose/foundation/text/input/internal/selection/TextFieldHandleState;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldHandleState;->getVisible()Z

    move-result v2

    if-eqz v2, :cond_a

    const v2, -0x12963a51

    invoke-interface {v5, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v2, "509@26319L100,513@26498L87,508@26276L383"

    invoke-static {v5, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 510
    const v2, -0x195fa9d8

    invoke-static {v5, v2, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v5, p0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v2

    .local v2, "invalid$iv":Z
    move-object v3, v5

    .local v3, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/4 v4, 0x0

    .line 1094
    .local v4, "$i$f$cache":I
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v6

    .local v6, "it$iv":Ljava/lang/Object;
    const/4 v7, 0x0

    .line 1095
    .local v7, "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez v2, :cond_7

    sget-object v8, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v8}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v8

    if-ne v6, v8, :cond_6

    goto :goto_4

    .line 1099
    :cond_6
    goto :goto_5

    .line 1096
    :cond_7
    :goto_4
    const/4 v8, 0x0

    .line 510
    .local v8, "$i$a$-cache-BasicTextFieldKt$TextFieldCursorHandle$1":I
    new-instance v9, Landroidx/compose/foundation/text/BasicTextFieldKt$TextFieldCursorHandle$1$1;

    invoke-direct {v9, p0}, Landroidx/compose/foundation/text/BasicTextFieldKt$TextFieldCursorHandle$1$1;-><init>(Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;)V

    check-cast v9, Landroidx/compose/foundation/text/selection/OffsetProvider;

    .line 1096
    .end local v8    # "$i$a$-cache-BasicTextFieldKt$TextFieldCursorHandle$1":I
    nop

    .line 1097
    .local v9, "value$iv":Ljava/lang/Object;
    invoke-interface {v3, v9}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1098
    move-object v6, v9

    .line 1094
    .end local v6    # "it$iv":Ljava/lang/Object;
    .end local v7    # "$i$a$-let-ComposerKt$cache$1$iv":I
    .end local v9    # "value$iv":Ljava/lang/Object;
    :goto_5
    nop

    .line 510
    .end local v2    # "invalid$iv":Z
    .end local v3    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v4    # "$i$f$cache":I
    check-cast v6, Landroidx/compose/foundation/text/selection/OffsetProvider;

    invoke-static {v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 514
    sget-object v2, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v2, Landroidx/compose/ui/Modifier;

    const v3, -0x195f9385

    invoke-static {v5, v3, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v5, p0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v1

    .local v1, "invalid$iv":Z
    move-object v3, v5

    .restart local v3    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/4 v4, 0x0

    .line 1100
    .restart local v4    # "$i$f$cache":I
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v7

    .local v7, "it$iv":Ljava/lang/Object;
    const/4 v8, 0x0

    .line 1101
    .local v8, "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez v1, :cond_9

    sget-object v9, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v9}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v9

    if-ne v7, v9, :cond_8

    goto :goto_6

    .line 1105
    :cond_8
    goto :goto_7

    .line 1102
    :cond_9
    :goto_6
    const/4 v9, 0x0

    .line 514
    .local v9, "$i$a$-cache-BasicTextFieldKt$TextFieldCursorHandle$2":I
    new-instance v10, Landroidx/compose/foundation/text/BasicTextFieldKt$TextFieldCursorHandle$2$1;

    invoke-direct {v10, p0}, Landroidx/compose/foundation/text/BasicTextFieldKt$TextFieldCursorHandle$2$1;-><init>(Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;)V

    check-cast v10, Landroidx/compose/ui/input/pointer/PointerInputEventHandler;

    .line 1102
    .end local v9    # "$i$a$-cache-BasicTextFieldKt$TextFieldCursorHandle$2":I
    nop

    .line 1103
    .local v10, "value$iv":Ljava/lang/Object;
    invoke-interface {v3, v10}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1104
    move-object v7, v10

    .line 1100
    .end local v7    # "it$iv":Ljava/lang/Object;
    .end local v8    # "$i$a$-let-ComposerKt$cache$1$iv":I
    .end local v10    # "value$iv":Ljava/lang/Object;
    :goto_7
    nop

    .line 514
    .end local v1    # "invalid$iv":Z
    .end local v3    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v4    # "$i$f$cache":I
    check-cast v7, Landroidx/compose/ui/input/pointer/PointerInputEventHandler;

    invoke-static {v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    invoke-static {v2, p0, v7}, Landroidx/compose/ui/input/pointer/SuspendingPointerInputFilterKt;->pointerInput(Landroidx/compose/ui/Modifier;Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    .line 517
    sget-wide v3, Landroidx/compose/foundation/text/BasicTextFieldKt;->MinTouchTargetSizeForHandles:J

    .line 509
    move-object v1, v6

    const/16 v6, 0x180

    const/4 v7, 0x0

    invoke-static/range {v1 .. v7}, Landroidx/compose/foundation/text/AndroidCursorHandle_androidKt;->CursorHandle-USBMPiE(Landroidx/compose/foundation/text/selection/OffsetProvider;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    .line 508
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    goto :goto_8

    .line 519
    :cond_a
    const v1, -0x12906082

    invoke-interface {v5, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    :goto_8
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_c

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .end local v0    # "cursorHandleState$delegate":Landroidx/compose/runtime/State;
    goto :goto_9

    .line 520
    :cond_b
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    :cond_c
    :goto_9
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v0

    if-eqz v0, :cond_d

    new-instance v1, Landroidx/compose/foundation/text/BasicTextFieldKt$TextFieldCursorHandle$3;

    invoke-direct {v1, p0, p2}, Landroidx/compose/foundation/text/BasicTextFieldKt$TextFieldCursorHandle$3;-><init>(Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;I)V

    check-cast v1, Lkotlin/jvm/functions/Function2;

    invoke-interface {v0, v1}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_d
    return-void
.end method

.method private static final TextFieldCursorHandle$lambda$12(Landroidx/compose/runtime/State;)Landroidx/compose/foundation/text/input/internal/selection/TextFieldHandleState;
    .locals 4
    .param p0, "$cursorHandleState$delegate"    # Landroidx/compose/runtime/State;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/State<",
            "Landroidx/compose/foundation/text/input/internal/selection/TextFieldHandleState;",
            ">;)",
            "Landroidx/compose/foundation/text/input/internal/selection/TextFieldHandleState;"
        }
    .end annotation

    .line 504
    nop

    .line 505
    const/4 v0, 0x0

    move-object v1, v0

    .local v1, "thisObj$iv":Ljava/lang/Object;
    move-object v2, p0

    .local v0, "property$iv":Lkotlin/reflect/KProperty;
    .local v2, "$this$getValue$iv":Landroidx/compose/runtime/State;
    const/4 v3, 0x0

    .line 1184
    .local v3, "$i$f$getValue":I
    invoke-interface {v2}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    .end local v0    # "property$iv":Lkotlin/reflect/KProperty;
    .end local v1    # "thisObj$iv":Ljava/lang/Object;
    .end local v2    # "$this$getValue$iv":Landroidx/compose/runtime/State;
    .end local v3    # "$i$f$getValue":I
    check-cast v0, Landroidx/compose/foundation/text/input/internal/selection/TextFieldHandleState;

    .line 505
    return-object v0
.end method

.method public static final TextFieldSelectionHandles(Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Landroidx/compose/runtime/Composer;I)V
    .locals 16
    .param p0, "selectionState"    # Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;
    .param p1, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p2, "$changed"    # I

    .line 523
    move-object/from16 v0, p0

    move/from16 v1, p2

    const v2, 0x78b77004

    move-object/from16 v3, p1

    invoke-interface {v3, v2}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v11

    .end local p1    # "$composer":Landroidx/compose/runtime/Composer;
    .local v11, "$composer":Landroidx/compose/runtime/Composer;
    const-string v3, "C(TextFieldSelectionHandles)525@26865L239,554@27919L240:BasicTextField.kt#423gt5"

    invoke-static {v11, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    move/from16 v3, p2

    .local v3, "$dirty":I
    and-int/lit8 v4, v1, 0x6

    const/4 v5, 0x2

    if-nez v4, :cond_1

    invoke-interface {v11, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x4

    goto :goto_0

    :cond_0
    move v4, v5

    :goto_0
    or-int/2addr v3, v4

    :cond_1
    move v14, v3

    .end local v3    # "$dirty":I
    .local v14, "$dirty":I
    and-int/lit8 v3, v14, 0x3

    if-eq v3, v5, :cond_2

    const/4 v3, 0x1

    goto :goto_1

    :cond_2
    const/4 v3, 0x0

    :goto_1
    and-int/lit8 v4, v14, 0x1

    invoke-interface {v11, v3, v4}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v3

    if-eqz v3, :cond_12

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v3

    if-eqz v3, :cond_3

    const/4 v3, -0x1

    const-string v4, "androidx.compose.foundation.text.TextFieldSelectionHandles (BasicTextField.kt:522)"

    invoke-static {v2, v14, v3, v4}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 526
    :cond_3
    const v2, -0x7634e14c

    const-string v15, "CC(remember):BasicTextField.kt#9igjgp"

    invoke-static {v11, v2, v15}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v11, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v2

    .local v2, "invalid$iv":Z
    move-object v3, v11

    .local v3, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/4 v4, 0x0

    .line 1106
    .local v4, "$i$f$cache":I
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v5

    .local v5, "it$iv":Ljava/lang/Object;
    const/4 v6, 0x0

    .line 1107
    .local v6, "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez v2, :cond_5

    sget-object v7, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v7}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v7

    if-ne v5, v7, :cond_4

    goto :goto_2

    .line 1111
    :cond_4
    goto :goto_3

    .line 1108
    :cond_5
    :goto_2
    const/4 v7, 0x0

    .line 527
    .local v7, "$i$a$-cache-BasicTextFieldKt$TextFieldSelectionHandles$startHandleState$2":I
    new-instance v8, Landroidx/compose/foundation/text/BasicTextFieldKt$TextFieldSelectionHandles$startHandleState$2$1;

    invoke-direct {v8, v0}, Landroidx/compose/foundation/text/BasicTextFieldKt$TextFieldSelectionHandles$startHandleState$2$1;-><init>(Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;)V

    check-cast v8, Lkotlin/jvm/functions/Function0;

    invoke-static {v8}, Landroidx/compose/runtime/SnapshotStateKt;->derivedStateOf(Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/State;

    move-result-object v8

    .line 532
    nop

    .line 1108
    .end local v7    # "$i$a$-cache-BasicTextFieldKt$TextFieldSelectionHandles$startHandleState$2":I
    nop

    .line 1109
    .local v8, "value$iv":Ljava/lang/Object;
    invoke-interface {v3, v8}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1110
    move-object v5, v8

    .line 1106
    .end local v5    # "it$iv":Ljava/lang/Object;
    .end local v6    # "$i$a$-let-ComposerKt$cache$1$iv":I
    .end local v8    # "value$iv":Ljava/lang/Object;
    :goto_3
    nop

    .line 526
    .end local v2    # "invalid$iv":Z
    .end local v3    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v4    # "$i$f$cache":I
    check-cast v5, Landroidx/compose/runtime/State;

    invoke-static {v11}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 525
    move-object v2, v5

    .line 534
    .local v2, "startHandleState$delegate":Landroidx/compose/runtime/State;
    invoke-static {v2}, Landroidx/compose/foundation/text/BasicTextFieldKt;->TextFieldSelectionHandles$lambda$16(Landroidx/compose/runtime/State;)Landroidx/compose/foundation/text/input/internal/selection/TextFieldHandleState;

    move-result-object v3

    invoke-virtual {v3}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldHandleState;->getVisible()Z

    move-result v3

    if-eqz v3, :cond_a

    const v3, -0x5062ed49

    invoke-interface {v11, v3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v3, "535@27195L167,544@27589L94,534@27149L662"

    invoke-static {v11, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 536
    const v3, -0x7634b854

    invoke-static {v11, v3, v15}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v11, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v3

    .local v3, "invalid$iv":Z
    move-object v4, v11

    .local v4, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/4 v5, 0x0

    .line 1112
    .local v5, "$i$f$cache":I
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v6

    .local v6, "it$iv":Ljava/lang/Object;
    const/4 v7, 0x0

    .line 1113
    .local v7, "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez v3, :cond_7

    sget-object v8, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v8}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v8

    if-ne v6, v8, :cond_6

    goto :goto_4

    .line 1117
    :cond_6
    goto :goto_5

    .line 1114
    :cond_7
    :goto_4
    const/4 v8, 0x0

    .line 536
    .local v8, "$i$a$-cache-BasicTextFieldKt$TextFieldSelectionHandles$1":I
    new-instance v9, Landroidx/compose/foundation/text/BasicTextFieldKt$TextFieldSelectionHandles$1$1;

    invoke-direct {v9, v0}, Landroidx/compose/foundation/text/BasicTextFieldKt$TextFieldSelectionHandles$1$1;-><init>(Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;)V

    check-cast v9, Landroidx/compose/foundation/text/selection/OffsetProvider;

    .line 1114
    .end local v8    # "$i$a$-cache-BasicTextFieldKt$TextFieldSelectionHandles$1":I
    nop

    .line 1115
    .local v9, "value$iv":Ljava/lang/Object;
    invoke-interface {v4, v9}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1116
    move-object v6, v9

    .line 1112
    .end local v6    # "it$iv":Ljava/lang/Object;
    .end local v7    # "$i$a$-let-ComposerKt$cache$1$iv":I
    .end local v9    # "value$iv":Ljava/lang/Object;
    :goto_5
    nop

    .line 536
    .end local v3    # "invalid$iv":Z
    .end local v4    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v5    # "$i$f$cache":I
    move-object v3, v6

    check-cast v3, Landroidx/compose/foundation/text/selection/OffsetProvider;

    invoke-static {v11}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 542
    invoke-static {v2}, Landroidx/compose/foundation/text/BasicTextFieldKt;->TextFieldSelectionHandles$lambda$16(Landroidx/compose/runtime/State;)Landroidx/compose/foundation/text/input/internal/selection/TextFieldHandleState;

    move-result-object v4

    invoke-virtual {v4}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldHandleState;->getDirection()Landroidx/compose/ui/text/style/ResolvedTextDirection;

    move-result-object v5

    .line 543
    invoke-static {v2}, Landroidx/compose/foundation/text/BasicTextFieldKt;->TextFieldSelectionHandles$lambda$16(Landroidx/compose/runtime/State;)Landroidx/compose/foundation/text/input/internal/selection/TextFieldHandleState;

    move-result-object v4

    invoke-virtual {v4}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldHandleState;->getHandlesCrossed()Z

    move-result v6

    .line 545
    sget-object v4, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v4, Landroidx/compose/ui/Modifier;

    const v7, -0x7634875d

    invoke-static {v11, v7, v15}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v11, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v7

    .local v7, "invalid$iv":Z
    move-object v8, v11

    .local v8, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/4 v9, 0x0

    .line 1118
    .local v9, "$i$f$cache":I
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v10

    .local v10, "it$iv":Ljava/lang/Object;
    const/4 v12, 0x0

    .line 1119
    .local v12, "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez v7, :cond_9

    sget-object v13, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v13}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v13

    if-ne v10, v13, :cond_8

    goto :goto_6

    .line 1123
    :cond_8
    move-object/from16 p1, v2

    goto :goto_7

    .line 1120
    :cond_9
    :goto_6
    const/4 v13, 0x0

    .line 545
    .local v13, "$i$a$-cache-BasicTextFieldKt$TextFieldSelectionHandles$2":I
    move-object/from16 p1, v2

    .end local v2    # "startHandleState$delegate":Landroidx/compose/runtime/State;
    .local p1, "startHandleState$delegate":Landroidx/compose/runtime/State;
    new-instance v2, Landroidx/compose/foundation/text/BasicTextFieldKt$TextFieldSelectionHandles$2$1;

    invoke-direct {v2, v0}, Landroidx/compose/foundation/text/BasicTextFieldKt$TextFieldSelectionHandles$2$1;-><init>(Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;)V

    check-cast v2, Landroidx/compose/ui/input/pointer/PointerInputEventHandler;

    .line 1120
    .end local v13    # "$i$a$-cache-BasicTextFieldKt$TextFieldSelectionHandles$2":I
    nop

    .line 1121
    .local v2, "value$iv":Ljava/lang/Object;
    invoke-interface {v8, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1122
    move-object v10, v2

    .line 1118
    .end local v2    # "value$iv":Ljava/lang/Object;
    .end local v10    # "it$iv":Ljava/lang/Object;
    .end local v12    # "$i$a$-let-ComposerKt$cache$1$iv":I
    :goto_7
    nop

    .line 545
    .end local v7    # "invalid$iv":Z
    .end local v8    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v9    # "$i$f$cache":I
    check-cast v10, Landroidx/compose/ui/input/pointer/PointerInputEventHandler;

    invoke-static {v11}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    invoke-static {v4, v0, v10}, Landroidx/compose/ui/input/pointer/SuspendingPointerInputFilterKt;->pointerInput(Landroidx/compose/ui/Modifier;Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    .line 548
    invoke-static/range {p1 .. p1}, Landroidx/compose/foundation/text/BasicTextFieldKt;->TextFieldSelectionHandles$lambda$16(Landroidx/compose/runtime/State;)Landroidx/compose/foundation/text/input/internal/selection/TextFieldHandleState;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldHandleState;->getLineHeight()F

    move-result v9

    .line 549
    sget-wide v7, Landroidx/compose/foundation/text/BasicTextFieldKt;->MinTouchTargetSizeForHandles:J

    .line 536
    nop

    .line 541
    nop

    .line 542
    nop

    .line 543
    nop

    .line 549
    nop

    .line 548
    nop

    .line 545
    nop

    .line 535
    const/4 v4, 0x1

    const/16 v12, 0x6030

    const/4 v13, 0x0

    invoke-static/range {v3 .. v13}, Landroidx/compose/foundation/text/selection/AndroidSelectionHandles_androidKt;->SelectionHandle-wLIcFTc(Landroidx/compose/foundation/text/selection/OffsetProvider;ZLandroidx/compose/ui/text/style/ResolvedTextDirection;ZJFLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    .line 534
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    goto :goto_8

    .line 551
    .end local p1    # "startHandleState$delegate":Landroidx/compose/runtime/State;
    .local v2, "startHandleState$delegate":Landroidx/compose/runtime/State;
    :cond_a
    move-object/from16 p1, v2

    .end local v2    # "startHandleState$delegate":Landroidx/compose/runtime/State;
    .restart local p1    # "startHandleState$delegate":Landroidx/compose/runtime/State;
    const v2, -0x5058fc23

    invoke-interface {v11, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    :goto_8
    nop

    .line 555
    const v2, -0x76345d8b

    invoke-static {v11, v2, v15}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v11, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v2

    .local v2, "invalid$iv":Z
    move-object v3, v11

    .local v3, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/4 v4, 0x0

    .line 1124
    .local v4, "$i$f$cache":I
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v5

    .local v5, "it$iv":Ljava/lang/Object;
    const/4 v6, 0x0

    .line 1125
    .local v6, "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez v2, :cond_c

    sget-object v7, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v7}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v7

    if-ne v5, v7, :cond_b

    goto :goto_9

    .line 1129
    :cond_b
    goto :goto_a

    .line 1126
    :cond_c
    :goto_9
    const/4 v7, 0x0

    .line 556
    .local v7, "$i$a$-cache-BasicTextFieldKt$TextFieldSelectionHandles$endHandleState$2":I
    new-instance v8, Landroidx/compose/foundation/text/BasicTextFieldKt$TextFieldSelectionHandles$endHandleState$2$1;

    invoke-direct {v8, v0}, Landroidx/compose/foundation/text/BasicTextFieldKt$TextFieldSelectionHandles$endHandleState$2$1;-><init>(Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;)V

    check-cast v8, Lkotlin/jvm/functions/Function0;

    invoke-static {v8}, Landroidx/compose/runtime/SnapshotStateKt;->derivedStateOf(Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/State;

    move-result-object v8

    .line 561
    nop

    .line 1126
    .end local v7    # "$i$a$-cache-BasicTextFieldKt$TextFieldSelectionHandles$endHandleState$2":I
    nop

    .line 1127
    .local v8, "value$iv":Ljava/lang/Object;
    invoke-interface {v3, v8}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1128
    move-object v5, v8

    .line 1124
    .end local v5    # "it$iv":Ljava/lang/Object;
    .end local v6    # "$i$a$-let-ComposerKt$cache$1$iv":I
    .end local v8    # "value$iv":Ljava/lang/Object;
    :goto_a
    nop

    .line 555
    .end local v2    # "invalid$iv":Z
    .end local v3    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v4    # "$i$f$cache":I
    check-cast v5, Landroidx/compose/runtime/State;

    invoke-static {v11}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 554
    move-object v2, v5

    .line 563
    .local v2, "endHandleState$delegate":Landroidx/compose/runtime/State;
    invoke-static {v2}, Landroidx/compose/foundation/text/BasicTextFieldKt;->TextFieldSelectionHandles$lambda$20(Landroidx/compose/runtime/State;)Landroidx/compose/foundation/text/input/internal/selection/TextFieldHandleState;

    move-result-object v3

    invoke-virtual {v3}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldHandleState;->getVisible()Z

    move-result v3

    if-eqz v3, :cond_11

    const v3, -0x5052fd46

    invoke-interface {v11, v3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v3, "564@28248L168,573@28640L95,563@28202L659"

    invoke-static {v11, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 565
    const v3, -0x763434b3

    invoke-static {v11, v3, v15}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v11, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v3

    .local v3, "invalid$iv":Z
    move-object v4, v11

    .local v4, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/4 v5, 0x0

    .line 1130
    .local v5, "$i$f$cache":I
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v6

    .local v6, "it$iv":Ljava/lang/Object;
    const/4 v7, 0x0

    .line 1131
    .local v7, "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez v3, :cond_e

    sget-object v8, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v8}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v8

    if-ne v6, v8, :cond_d

    goto :goto_b

    .line 1135
    :cond_d
    goto :goto_c

    .line 1132
    :cond_e
    :goto_b
    const/4 v8, 0x0

    .line 565
    .local v8, "$i$a$-cache-BasicTextFieldKt$TextFieldSelectionHandles$3":I
    new-instance v9, Landroidx/compose/foundation/text/BasicTextFieldKt$TextFieldSelectionHandles$3$1;

    invoke-direct {v9, v0}, Landroidx/compose/foundation/text/BasicTextFieldKt$TextFieldSelectionHandles$3$1;-><init>(Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;)V

    check-cast v9, Landroidx/compose/foundation/text/selection/OffsetProvider;

    .line 1132
    .end local v8    # "$i$a$-cache-BasicTextFieldKt$TextFieldSelectionHandles$3":I
    nop

    .line 1133
    .local v9, "value$iv":Ljava/lang/Object;
    invoke-interface {v4, v9}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1134
    move-object v6, v9

    .line 1130
    .end local v6    # "it$iv":Ljava/lang/Object;
    .end local v7    # "$i$a$-let-ComposerKt$cache$1$iv":I
    .end local v9    # "value$iv":Ljava/lang/Object;
    :goto_c
    nop

    .line 565
    .end local v3    # "invalid$iv":Z
    .end local v4    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v5    # "$i$f$cache":I
    move-object v3, v6

    check-cast v3, Landroidx/compose/foundation/text/selection/OffsetProvider;

    invoke-static {v11}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 571
    invoke-static {v2}, Landroidx/compose/foundation/text/BasicTextFieldKt;->TextFieldSelectionHandles$lambda$20(Landroidx/compose/runtime/State;)Landroidx/compose/foundation/text/input/internal/selection/TextFieldHandleState;

    move-result-object v4

    invoke-virtual {v4}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldHandleState;->getDirection()Landroidx/compose/ui/text/style/ResolvedTextDirection;

    move-result-object v5

    .line 572
    invoke-static {v2}, Landroidx/compose/foundation/text/BasicTextFieldKt;->TextFieldSelectionHandles$lambda$20(Landroidx/compose/runtime/State;)Landroidx/compose/foundation/text/input/internal/selection/TextFieldHandleState;

    move-result-object v4

    invoke-virtual {v4}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldHandleState;->getHandlesCrossed()Z

    move-result v6

    .line 574
    sget-object v4, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v4, Landroidx/compose/ui/Modifier;

    const v7, -0x763403fc

    invoke-static {v11, v7, v15}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v11, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v7

    .local v7, "invalid$iv":Z
    move-object v8, v11

    .local v8, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/4 v9, 0x0

    .line 1136
    .local v9, "$i$f$cache":I
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v10

    .restart local v10    # "it$iv":Ljava/lang/Object;
    const/4 v12, 0x0

    .line 1137
    .restart local v12    # "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez v7, :cond_10

    sget-object v13, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v13}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v13

    if-ne v10, v13, :cond_f

    goto :goto_d

    .line 1141
    :cond_f
    goto :goto_e

    .line 1138
    :cond_10
    :goto_d
    const/4 v13, 0x0

    .line 574
    .local v13, "$i$a$-cache-BasicTextFieldKt$TextFieldSelectionHandles$4":I
    new-instance v15, Landroidx/compose/foundation/text/BasicTextFieldKt$TextFieldSelectionHandles$4$1;

    invoke-direct {v15, v0}, Landroidx/compose/foundation/text/BasicTextFieldKt$TextFieldSelectionHandles$4$1;-><init>(Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;)V

    check-cast v15, Landroidx/compose/ui/input/pointer/PointerInputEventHandler;

    .line 1138
    .end local v13    # "$i$a$-cache-BasicTextFieldKt$TextFieldSelectionHandles$4":I
    nop

    .line 1139
    .local v15, "value$iv":Ljava/lang/Object;
    invoke-interface {v8, v15}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1140
    move-object v10, v15

    .line 1136
    .end local v10    # "it$iv":Ljava/lang/Object;
    .end local v12    # "$i$a$-let-ComposerKt$cache$1$iv":I
    .end local v15    # "value$iv":Ljava/lang/Object;
    :goto_e
    nop

    .line 574
    .end local v7    # "invalid$iv":Z
    .end local v8    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v9    # "$i$f$cache":I
    check-cast v10, Landroidx/compose/ui/input/pointer/PointerInputEventHandler;

    invoke-static {v11}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    invoke-static {v4, v0, v10}, Landroidx/compose/ui/input/pointer/SuspendingPointerInputFilterKt;->pointerInput(Landroidx/compose/ui/Modifier;Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    .line 577
    invoke-static {v2}, Landroidx/compose/foundation/text/BasicTextFieldKt;->TextFieldSelectionHandles$lambda$20(Landroidx/compose/runtime/State;)Landroidx/compose/foundation/text/input/internal/selection/TextFieldHandleState;

    move-result-object v4

    invoke-virtual {v4}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldHandleState;->getLineHeight()F

    move-result v9

    .line 578
    sget-wide v7, Landroidx/compose/foundation/text/BasicTextFieldKt;->MinTouchTargetSizeForHandles:J

    .line 565
    nop

    .line 570
    nop

    .line 571
    nop

    .line 572
    nop

    .line 578
    nop

    .line 577
    nop

    .line 574
    nop

    .line 564
    const/4 v4, 0x0

    const/16 v12, 0x6030

    const/4 v13, 0x0

    invoke-static/range {v3 .. v13}, Landroidx/compose/foundation/text/selection/AndroidSelectionHandles_androidKt;->SelectionHandle-wLIcFTc(Landroidx/compose/foundation/text/selection/OffsetProvider;ZLandroidx/compose/ui/text/style/ResolvedTextDirection;ZJFLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    .line 563
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    goto :goto_f

    .line 580
    :cond_11
    const v3, -0x50491763

    invoke-interface {v11, v3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    :goto_f
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v3

    if-eqz v3, :cond_13

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .end local v2    # "endHandleState$delegate":Landroidx/compose/runtime/State;
    .end local p1    # "startHandleState$delegate":Landroidx/compose/runtime/State;
    goto :goto_10

    .line 581
    :cond_12
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    :cond_13
    :goto_10
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v2

    if-eqz v2, :cond_14

    new-instance v3, Landroidx/compose/foundation/text/BasicTextFieldKt$TextFieldSelectionHandles$5;

    invoke-direct {v3, v0, v1}, Landroidx/compose/foundation/text/BasicTextFieldKt$TextFieldSelectionHandles$5;-><init>(Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;I)V

    check-cast v3, Lkotlin/jvm/functions/Function2;

    invoke-interface {v2, v3}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_14
    return-void
.end method

.method private static final TextFieldSelectionHandles$lambda$16(Landroidx/compose/runtime/State;)Landroidx/compose/foundation/text/input/internal/selection/TextFieldHandleState;
    .locals 4
    .param p0, "$startHandleState$delegate"    # Landroidx/compose/runtime/State;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/State<",
            "Landroidx/compose/foundation/text/input/internal/selection/TextFieldHandleState;",
            ">;)",
            "Landroidx/compose/foundation/text/input/internal/selection/TextFieldHandleState;"
        }
    .end annotation

    .line 525
    nop

    .line 526
    const/4 v0, 0x0

    move-object v1, v0

    .local v1, "thisObj$iv":Ljava/lang/Object;
    move-object v2, p0

    .local v0, "property$iv":Lkotlin/reflect/KProperty;
    .local v2, "$this$getValue$iv":Landroidx/compose/runtime/State;
    const/4 v3, 0x0

    .line 1185
    .local v3, "$i$f$getValue":I
    invoke-interface {v2}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    .end local v0    # "property$iv":Lkotlin/reflect/KProperty;
    .end local v1    # "thisObj$iv":Ljava/lang/Object;
    .end local v2    # "$this$getValue$iv":Landroidx/compose/runtime/State;
    .end local v3    # "$i$f$getValue":I
    check-cast v0, Landroidx/compose/foundation/text/input/internal/selection/TextFieldHandleState;

    .line 526
    return-object v0
.end method

.method private static final TextFieldSelectionHandles$lambda$20(Landroidx/compose/runtime/State;)Landroidx/compose/foundation/text/input/internal/selection/TextFieldHandleState;
    .locals 4
    .param p0, "$endHandleState$delegate"    # Landroidx/compose/runtime/State;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/State<",
            "Landroidx/compose/foundation/text/input/internal/selection/TextFieldHandleState;",
            ">;)",
            "Landroidx/compose/foundation/text/input/internal/selection/TextFieldHandleState;"
        }
    .end annotation

    .line 554
    nop

    .line 555
    const/4 v0, 0x0

    move-object v1, v0

    .local v1, "thisObj$iv":Ljava/lang/Object;
    move-object v2, p0

    .local v0, "property$iv":Lkotlin/reflect/KProperty;
    .local v2, "$this$getValue$iv":Landroidx/compose/runtime/State;
    const/4 v3, 0x0

    .line 1186
    .local v3, "$i$f$getValue":I
    invoke-interface {v2}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    .end local v0    # "property$iv":Lkotlin/reflect/KProperty;
    .end local v1    # "thisObj$iv":Ljava/lang/Object;
    .end local v2    # "$this$getValue$iv":Landroidx/compose/runtime/State;
    .end local v3    # "$i$f$getValue":I
    check-cast v0, Landroidx/compose/foundation/text/input/internal/selection/TextFieldHandleState;

    .line 555
    return-object v0
.end method

.method public static final synthetic access$BasicTextField$lambda$24(Landroidx/compose/runtime/MutableState;)Landroidx/compose/ui/text/input/TextFieldValue;
    .locals 1
    .param p0, "$textFieldValueState$delegate"    # Landroidx/compose/runtime/MutableState;

    .line 1
    invoke-static {p0}, Landroidx/compose/foundation/text/BasicTextFieldKt;->BasicTextField$lambda$24(Landroidx/compose/runtime/MutableState;)Landroidx/compose/ui/text/input/TextFieldValue;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$BasicTextField$lambda$25(Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/text/input/TextFieldValue;)V
    .locals 0
    .param p0, "$textFieldValueState$delegate"    # Landroidx/compose/runtime/MutableState;
    .param p1, "value"    # Landroidx/compose/ui/text/input/TextFieldValue;

    .line 1
    invoke-static {p0, p1}, Landroidx/compose/foundation/text/BasicTextFieldKt;->BasicTextField$lambda$25(Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/text/input/TextFieldValue;)V

    return-void
.end method

.method public static final synthetic access$BasicTextField$lambda$28(Landroidx/compose/runtime/MutableState;)Ljava/lang/String;
    .locals 1
    .param p0, "$lastTextValue$delegate"    # Landroidx/compose/runtime/MutableState;

    .line 1
    invoke-static {p0}, Landroidx/compose/foundation/text/BasicTextFieldKt;->BasicTextField$lambda$28(Landroidx/compose/runtime/MutableState;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$BasicTextField$lambda$29(Landroidx/compose/runtime/MutableState;Ljava/lang/String;)V
    .locals 0
    .param p0, "$lastTextValue$delegate"    # Landroidx/compose/runtime/MutableState;
    .param p1, "value"    # Ljava/lang/String;

    .line 1
    invoke-static {p0, p1}, Landroidx/compose/foundation/text/BasicTextFieldKt;->BasicTextField$lambda$29(Landroidx/compose/runtime/MutableState;Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic access$getDefaultTextFieldDecorator$p()Landroidx/compose/foundation/text/input/TextFieldDecorator;
    .locals 1

    .line 1
    sget-object v0, Landroidx/compose/foundation/text/BasicTextFieldKt;->DefaultTextFieldDecorator:Landroidx/compose/foundation/text/input/TextFieldDecorator;

    return-object v0
.end method
