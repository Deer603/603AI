.class public final Landroidx/compose/foundation/text/selection/SelectionManager;
.super Ljava/lang/Object;
.source "SelectionManager.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSelectionManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionManager.kt\nandroidx/compose/foundation/text/selection/SelectionManager\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 5 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 6 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 7 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n+ 8 Rect.kt\nandroidx/compose/ui/geometry/Rect\n*L\n1#1,1107:1\n85#2:1108\n113#2,2:1109\n85#2:1111\n113#2,2:1112\n85#2:1114\n113#2,2:1115\n85#2:1117\n113#2,2:1118\n85#2:1120\n113#2,2:1121\n85#2:1123\n113#2,2:1124\n85#2:1127\n113#2,2:1128\n1#3:1126\n1#3:1192\n278#4:1130\n278#4:1131\n278#4:1207\n107#5,7:1132\n96#5,5:1139\n269#6,3:1144\n34#6,6:1147\n272#6:1153\n87#6,2:1154\n34#6,6:1156\n89#6:1162\n34#6,6:1163\n102#6,2:1169\n34#6,6:1171\n104#6:1177\n34#6,6:1179\n439#6,3:1185\n34#6,4:1188\n39#6:1193\n442#6:1194\n70#6,6:1201\n34#6,6:1208\n102#6,2:1214\n34#6,6:1216\n104#6:1222\n102#6,2:1223\n34#6,6:1225\n104#6:1231\n1565#7:1178\n56#8,6:1195\n*S KotlinDebug\n*F\n+ 1 SelectionManager.kt\nandroidx/compose/foundation/text/selection/SelectionManager\n*L\n131#1:1108\n131#1:1109,2\n181#1:1111\n181#1:1112,2\n188#1:1114\n188#1:1115,2\n196#1:1117\n196#1:1118,2\n204#1:1120\n204#1:1121,2\n211#1:1123\n211#1:1124,2\n234#1:1127\n234#1:1128,2\n619#1:1192\n387#1:1130\n399#1:1131\n884#1:1207\n411#1:1132,7\n412#1:1139,5\n422#1:1144,3\n422#1:1147,6\n422#1:1153\n445#1:1154,2\n445#1:1156,6\n445#1:1162\n472#1:1163,6\n532#1:1169,2\n532#1:1171,6\n532#1:1177\n545#1:1179,6\n619#1:1185,3\n619#1:1188,4\n619#1:1193\n619#1:1194\n877#1:1201,6\n895#1:1208,6\n910#1:1214,2\n910#1:1216,6\n910#1:1222\n922#1:1223,2\n922#1:1225,6\n922#1:1231\n544#1:1178\n634#1:1195,6\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00b8\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0007\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0017\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0000\u0008\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\"\u0010w\u001a\u00020\u00122\u0006\u0010x\u001a\u00020\u000b2\u0006\u0010y\u001a\u00020\u0012H\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008z\u0010{J\r\u0010|\u001a\u00020OH\u0000\u00a2\u0006\u0002\u0008}J\u001a\u0010~\u001a\u0004\u0018\u00010\u007f2\u0008\u0010\u0080\u0001\u001a\u00030\u0081\u0001H\u0000\u00a2\u0006\u0003\u0008\u0082\u0001J\u000c\u0010\u0083\u0001\u001a\u0005\u0018\u00010\u0084\u0001H\u0002J\u0011\u0010\u0085\u0001\u001a\u0004\u0018\u00010NH\u0000\u00a2\u0006\u0003\u0008\u0086\u0001J2\u0010\u0087\u0001\u001a\u0004\u0018\u00010Z2\u0007\u0010\u0088\u0001\u001a\u00020\u00122\u0007\u0010\u0089\u0001\u001a\u00020\u00122\u0007\u0010\u008a\u0001\u001a\u00020\u0007H\u0002\u00f8\u0001\u0000\u00a2\u0006\u0006\u0008\u008b\u0001\u0010\u008c\u0001J\u0011\u0010\u008d\u0001\u001a\u00030\u008e\u00012\u0007\u0010\u008a\u0001\u001a\u00020\u0007J\u000f\u0010\u008f\u0001\u001a\u00020\u0007H\u0000\u00a2\u0006\u0003\u0008\u0090\u0001J\u000f\u0010\u0091\u0001\u001a\u00020\u0007H\u0000\u00a2\u0006\u0003\u0008\u0092\u0001J\u000f\u0010\u0093\u0001\u001a\u00020\u0007H\u0000\u00a2\u0006\u0003\u0008\u0094\u0001J\u0007\u0010\u0095\u0001\u001a\u00020OJ\u000f\u0010\u0096\u0001\u001a\u00020\u000bH\u0000\u00a2\u0006\u0003\u0008\u0097\u0001J\u000f\u0010\u0098\u0001\u001a\u00020OH\u0000\u00a2\u0006\u0003\u0008\u0099\u0001J:\u0010\u009a\u0001\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020\t0\u009c\u00010\u009b\u00012\u0008\u0010\u009d\u0001\u001a\u00030\u009e\u00012\t\u0010\u009f\u0001\u001a\u0004\u0018\u00010\tH\u0000\u00a2\u0006\u0003\u0008\u00a0\u0001J\u001b\u0010\u00a1\u0001\u001a\u00020O2\u0007\u0010\u0088\u0001\u001a\u00020\u0012\u00f8\u0001\u0000\u00a2\u0006\u0005\u0008\u00a2\u0001\u0010\u001eJ\u001b\u0010\u00a3\u0001\u001a\u00020O2\u0007\u0010\u00a4\u0001\u001a\u00020Z2\u0007\u0010\u00a5\u0001\u001a\u00020\tH\u0002J\u000f\u0010\u00a6\u0001\u001a\u00020\u0007H\u0001\u00a2\u0006\u0003\u0008\u00a7\u0001J1\u0010\u00a8\u0001\u001a\u00020O2\u0007\u0010\u0088\u0001\u001a\u00020\u00122\u0007\u0010\u008a\u0001\u001a\u00020\u00072\u0008\u0010\u00a9\u0001\u001a\u00030\u00aa\u0001H\u0002\u00f8\u0001\u0000\u00a2\u0006\u0006\u0008\u00ab\u0001\u0010\u00ac\u0001J\t\u0010\u00ad\u0001\u001a\u00020OH\u0002J\t\u0010\u00ae\u0001\u001a\u00020OH\u0002J:\u0010\u00af\u0001\u001a\u00020\u00072\u0007\u0010\u0088\u0001\u001a\u00020\u00122\u0007\u0010\u0089\u0001\u001a\u00020\u00122\u0007\u0010\u008a\u0001\u001a\u00020\u00072\u0008\u0010\u00a9\u0001\u001a\u00030\u00aa\u0001H\u0000\u00f8\u0001\u0000\u00a2\u0006\u0006\u0008\u00b0\u0001\u0010\u00b1\u0001J;\u0010\u00af\u0001\u001a\u00020\u00072\t\u0010\u00b2\u0001\u001a\u0004\u0018\u00010\u00122\u0006\u0010X\u001a\u00020\u00122\u0007\u0010\u008a\u0001\u001a\u00020\u00072\u0008\u0010\u00a9\u0001\u001a\u00030\u00aa\u0001H\u0000\u00f8\u0001\u0000\u00a2\u0006\u0006\u0008\u00b3\u0001\u0010\u00b4\u0001J\t\u0010\u00b5\u0001\u001a\u00020OH\u0002J\u001d\u0010\u00b6\u0001\u001a\u00020I*\u00020I2\u000e\u0010\u00b7\u0001\u001a\t\u0012\u0004\u0012\u00020O0\u00b8\u0001H\u0002R\u0014\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0008\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0008\u0010\n\u001a\u0004\u0018\u00010\u000b@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\r\u0010\u000e\"\u0004\u0008\u000f\u0010\u0010R5\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u00128F@BX\u0086\u008e\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0012\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u0014\u0010\u0015\"\u0004\u0008\u0016\u0010\u0017R1\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00128@@BX\u0080\u008e\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0012\n\u0004\u0008\u001f\u0010\u0019\u001a\u0004\u0008\u001b\u0010\u001c\"\u0004\u0008\u001d\u0010\u001eR1\u0010 \u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00128@@BX\u0080\u008e\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0012\n\u0004\u0008#\u0010\u0019\u001a\u0004\u0008!\u0010\u001c\"\u0004\u0008\"\u0010\u001eR/\u0010%\u001a\u0004\u0018\u00010$2\u0008\u0010\u0011\u001a\u0004\u0018\u00010$8F@BX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008*\u0010\u0019\u001a\u0004\u0008&\u0010\'\"\u0004\u0008(\u0010)R\u0011\u0010+\u001a\u00020,8F\u00a2\u0006\u0006\u001a\u0004\u0008-\u0010.R5\u0010/\u001a\u0004\u0018\u00010\u00122\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u00128F@BX\u0086\u008e\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0012\n\u0004\u00082\u0010\u0019\u001a\u0004\u00080\u0010\u0015\"\u0004\u00081\u0010\u0017R\u001a\u00103\u001a\u000204X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u00085\u00106\"\u0004\u00087\u00108R\u001c\u00109\u001a\u0004\u0018\u00010:X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008;\u0010<\"\u0004\u0008=\u0010>R+\u0010?\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00078F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008D\u0010\u0019\u001a\u0004\u0008@\u0010A\"\u0004\u0008B\u0010CR\u0014\u0010E\u001a\u00020\u00078BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008E\u0010AR$\u0010F\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00078F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008F\u0010A\"\u0004\u0008G\u0010CR\u0011\u0010H\u001a\u00020I8F\u00a2\u0006\u0006\u001a\u0004\u0008J\u0010KR(\u0010L\u001a\u0010\u0012\u0004\u0012\u00020N\u0012\u0004\u0012\u00020O\u0018\u00010MX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008P\u0010Q\"\u0004\u0008R\u0010SR@\u0010U\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020O0M2\u0014\u0010T\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020O0M@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008V\u0010Q\"\u0004\u0008W\u0010SR\u0016\u0010X\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0002\n\u0000R&\u0010Y\u001a\u0004\u0018\u00010Z8\u0000@\u0000X\u0081\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\u0008[\u0010\\\u001a\u0004\u0008]\u0010^\"\u0004\u0008_\u0010`R(\u0010a\u001a\u0004\u0018\u00010\t2\u0008\u0010\n\u001a\u0004\u0018\u00010\t8F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008b\u0010c\"\u0004\u0008d\u0010eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010f\u001a\u00020\u00078BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008g\u0010AR$\u0010h\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007@@X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008i\u0010A\"\u0004\u0008j\u0010CR\u0011\u0010k\u001a\u00020,8F\u00a2\u0006\u0006\u001a\u0004\u0008l\u0010.R5\u0010m\u001a\u0004\u0018\u00010\u00122\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u00128F@BX\u0086\u008e\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0012\n\u0004\u0008p\u0010\u0019\u001a\u0004\u0008n\u0010\u0015\"\u0004\u0008o\u0010\u0017R\u001c\u0010q\u001a\u0004\u0018\u00010rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008s\u0010t\"\u0004\u0008u\u0010v\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006\u00b9\u0001"
    }
    d2 = {
        "Landroidx/compose/foundation/text/selection/SelectionManager;",
        "",
        "selectionRegistrar",
        "Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;",
        "(Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;)V",
        "_isInTouchMode",
        "Landroidx/compose/runtime/MutableState;",
        "",
        "_selection",
        "Landroidx/compose/foundation/text/selection/Selection;",
        "value",
        "Landroidx/compose/ui/layout/LayoutCoordinates;",
        "containerLayoutCoordinates",
        "getContainerLayoutCoordinates",
        "()Landroidx/compose/ui/layout/LayoutCoordinates;",
        "setContainerLayoutCoordinates",
        "(Landroidx/compose/ui/layout/LayoutCoordinates;)V",
        "<set-?>",
        "Landroidx/compose/ui/geometry/Offset;",
        "currentDragPosition",
        "getCurrentDragPosition-_m7T9-E",
        "()Landroidx/compose/ui/geometry/Offset;",
        "setCurrentDragPosition-_kEHs6E",
        "(Landroidx/compose/ui/geometry/Offset;)V",
        "currentDragPosition$delegate",
        "Landroidx/compose/runtime/MutableState;",
        "dragBeginPosition",
        "getDragBeginPosition-F1C5BW0$foundation_release",
        "()J",
        "setDragBeginPosition-k-4lQ0M",
        "(J)V",
        "dragBeginPosition$delegate",
        "dragTotalDistance",
        "getDragTotalDistance-F1C5BW0$foundation_release",
        "setDragTotalDistance-k-4lQ0M",
        "dragTotalDistance$delegate",
        "Landroidx/compose/foundation/text/Handle;",
        "draggingHandle",
        "getDraggingHandle",
        "()Landroidx/compose/foundation/text/Handle;",
        "setDraggingHandle",
        "(Landroidx/compose/foundation/text/Handle;)V",
        "draggingHandle$delegate",
        "endHandleLineHeight",
        "",
        "getEndHandleLineHeight",
        "()F",
        "endHandlePosition",
        "getEndHandlePosition-_m7T9-E",
        "setEndHandlePosition-_kEHs6E",
        "endHandlePosition$delegate",
        "focusRequester",
        "Landroidx/compose/ui/focus/FocusRequester;",
        "getFocusRequester",
        "()Landroidx/compose/ui/focus/FocusRequester;",
        "setFocusRequester",
        "(Landroidx/compose/ui/focus/FocusRequester;)V",
        "hapticFeedBack",
        "Landroidx/compose/ui/hapticfeedback/HapticFeedback;",
        "getHapticFeedBack",
        "()Landroidx/compose/ui/hapticfeedback/HapticFeedback;",
        "setHapticFeedBack",
        "(Landroidx/compose/ui/hapticfeedback/HapticFeedback;)V",
        "hasFocus",
        "getHasFocus",
        "()Z",
        "setHasFocus",
        "(Z)V",
        "hasFocus$delegate",
        "isDraggingInProgress",
        "isInTouchMode",
        "setInTouchMode",
        "modifier",
        "Landroidx/compose/ui/Modifier;",
        "getModifier",
        "()Landroidx/compose/ui/Modifier;",
        "onCopyHandler",
        "Lkotlin/Function1;",
        "Landroidx/compose/ui/text/AnnotatedString;",
        "",
        "getOnCopyHandler",
        "()Lkotlin/jvm/functions/Function1;",
        "setOnCopyHandler",
        "(Lkotlin/jvm/functions/Function1;)V",
        "newOnSelectionChange",
        "onSelectionChange",
        "getOnSelectionChange",
        "setOnSelectionChange",
        "previousPosition",
        "previousSelectionLayout",
        "Landroidx/compose/foundation/text/selection/SelectionLayout;",
        "getPreviousSelectionLayout$foundation_release$annotations",
        "()V",
        "getPreviousSelectionLayout$foundation_release",
        "()Landroidx/compose/foundation/text/selection/SelectionLayout;",
        "setPreviousSelectionLayout$foundation_release",
        "(Landroidx/compose/foundation/text/selection/SelectionLayout;)V",
        "selection",
        "getSelection",
        "()Landroidx/compose/foundation/text/selection/Selection;",
        "setSelection",
        "(Landroidx/compose/foundation/text/selection/Selection;)V",
        "shouldShowMagnifier",
        "getShouldShowMagnifier",
        "showToolbar",
        "getShowToolbar$foundation_release",
        "setShowToolbar$foundation_release",
        "startHandleLineHeight",
        "getStartHandleLineHeight",
        "startHandlePosition",
        "getStartHandlePosition-_m7T9-E",
        "setStartHandlePosition-_kEHs6E",
        "startHandlePosition$delegate",
        "textToolbar",
        "Landroidx/compose/ui/platform/TextToolbar;",
        "getTextToolbar",
        "()Landroidx/compose/ui/platform/TextToolbar;",
        "setTextToolbar",
        "(Landroidx/compose/ui/platform/TextToolbar;)V",
        "convertToContainerCoordinates",
        "layoutCoordinates",
        "offset",
        "convertToContainerCoordinates-R5De75A",
        "(Landroidx/compose/ui/layout/LayoutCoordinates;J)J",
        "copy",
        "copy$foundation_release",
        "getAnchorSelectable",
        "Landroidx/compose/foundation/text/selection/Selectable;",
        "anchor",
        "Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;",
        "getAnchorSelectable$foundation_release",
        "getContentRect",
        "Landroidx/compose/ui/geometry/Rect;",
        "getSelectedText",
        "getSelectedText$foundation_release",
        "getSelectionLayout",
        "position",
        "previousHandlePosition",
        "isStartHandle",
        "getSelectionLayout-Wko1d7g",
        "(JJZ)Landroidx/compose/foundation/text/selection/SelectionLayout;",
        "handleDragObserver",
        "Landroidx/compose/foundation/text/TextDragObserver;",
        "isEntireContainerSelected",
        "isEntireContainerSelected$foundation_release",
        "isNonEmptySelection",
        "isNonEmptySelection$foundation_release",
        "isTriviallyCollapsedSelection",
        "isTriviallyCollapsedSelection$foundation_release",
        "onRelease",
        "requireContainerCoordinates",
        "requireContainerCoordinates$foundation_release",
        "selectAll",
        "selectAll$foundation_release",
        "selectAllInSelectable",
        "Lkotlin/Pair;",
        "Landroidx/collection/LongObjectMap;",
        "selectableId",
        "",
        "previousSelection",
        "selectAllInSelectable$foundation_release",
        "selectWordAtPositionIfNotAlreadySelected",
        "selectWordAtPositionIfNotAlreadySelected-k-4lQ0M",
        "selectionChanged",
        "selectionLayout",
        "newSelection",
        "shouldPerformHaptics",
        "shouldPerformHaptics$foundation_release",
        "startSelection",
        "adjustment",
        "Landroidx/compose/foundation/text/selection/SelectionAdjustment;",
        "startSelection-9KIMszo",
        "(JZLandroidx/compose/foundation/text/selection/SelectionAdjustment;)V",
        "toolbarCopy",
        "updateHandleOffsets",
        "updateSelection",
        "updateSelection-jyLRC_s$foundation_release",
        "(JJZLandroidx/compose/foundation/text/selection/SelectionAdjustment;)Z",
        "newPosition",
        "updateSelection-qNKwrvQ$foundation_release",
        "(Landroidx/compose/ui/geometry/Offset;JZLandroidx/compose/foundation/text/selection/SelectionAdjustment;)Z",
        "updateSelectionToolbar",
        "onClearSelectionRequested",
        "block",
        "Lkotlin/Function0;",
        "foundation_release"
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


# instance fields
.field private final _isInTouchMode:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final _selection:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Landroidx/compose/foundation/text/selection/Selection;",
            ">;"
        }
    .end annotation
.end field

.field private containerLayoutCoordinates:Landroidx/compose/ui/layout/LayoutCoordinates;

.field private final currentDragPosition$delegate:Landroidx/compose/runtime/MutableState;

.field private final dragBeginPosition$delegate:Landroidx/compose/runtime/MutableState;

.field private final dragTotalDistance$delegate:Landroidx/compose/runtime/MutableState;

.field private final draggingHandle$delegate:Landroidx/compose/runtime/MutableState;

.field private final endHandlePosition$delegate:Landroidx/compose/runtime/MutableState;

.field private focusRequester:Landroidx/compose/ui/focus/FocusRequester;

.field private hapticFeedBack:Landroidx/compose/ui/hapticfeedback/HapticFeedback;

.field private final hasFocus$delegate:Landroidx/compose/runtime/MutableState;

.field private onCopyHandler:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/ui/text/AnnotatedString;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private onSelectionChange:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/foundation/text/selection/Selection;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private previousPosition:Landroidx/compose/ui/geometry/Offset;

.field private previousSelectionLayout:Landroidx/compose/foundation/text/selection/SelectionLayout;

.field private final selectionRegistrar:Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;

.field private showToolbar:Z

.field private final startHandlePosition$delegate:Landroidx/compose/runtime/MutableState;

.field private textToolbar:Landroidx/compose/ui/platform/TextToolbar;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x8

    sput v0, Landroidx/compose/foundation/text/selection/SelectionManager;->$stable:I

    return-void
.end method

.method public constructor <init>(Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;)V
    .locals 4
    .param p1, "selectionRegistrar"    # Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;

    .line 74
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/text/selection/SelectionManager;->selectionRegistrar:Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;

    .line 76
    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {v0, v0, v1, v0}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v2

    iput-object v2, p0, Landroidx/compose/foundation/text/selection/SelectionManager;->_selection:Landroidx/compose/runtime/MutableState;

    .line 89
    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-static {v2, v0, v1, v0}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v2

    iput-object v2, p0, Landroidx/compose/foundation/text/selection/SelectionManager;->_isInTouchMode:Landroidx/compose/runtime/MutableState;

    .line 104
    new-instance v2, Landroidx/compose/foundation/text/selection/SelectionManager$onSelectionChange$1;

    invoke-direct {v2, p0}, Landroidx/compose/foundation/text/selection/SelectionManager$onSelectionChange$1;-><init>(Landroidx/compose/foundation/text/selection/SelectionManager;)V

    check-cast v2, Lkotlin/jvm/functions/Function1;

    iput-object v2, p0, Landroidx/compose/foundation/text/selection/SelectionManager;->onSelectionChange:Lkotlin/jvm/functions/Function1;

    .line 128
    new-instance v2, Landroidx/compose/ui/focus/FocusRequester;

    invoke-direct {v2}, Landroidx/compose/ui/focus/FocusRequester;-><init>()V

    iput-object v2, p0, Landroidx/compose/foundation/text/selection/SelectionManager;->focusRequester:Landroidx/compose/ui/focus/FocusRequester;

    .line 131
    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-static {v2, v0, v1, v0}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v2

    iput-object v2, p0, Landroidx/compose/foundation/text/selection/SelectionManager;->hasFocus$delegate:Landroidx/compose/runtime/MutableState;

    .line 181
    sget-object v2, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    invoke-virtual {v2}, Landroidx/compose/ui/geometry/Offset$Companion;->getZero-F1C5BW0()J

    move-result-wide v2

    invoke-static {v2, v3}, Landroidx/compose/ui/geometry/Offset;->box-impl(J)Landroidx/compose/ui/geometry/Offset;

    move-result-object v2

    invoke-static {v2, v0, v1, v0}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v2

    iput-object v2, p0, Landroidx/compose/foundation/text/selection/SelectionManager;->dragBeginPosition$delegate:Landroidx/compose/runtime/MutableState;

    .line 188
    sget-object v2, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    invoke-virtual {v2}, Landroidx/compose/ui/geometry/Offset$Companion;->getZero-F1C5BW0()J

    move-result-wide v2

    invoke-static {v2, v3}, Landroidx/compose/ui/geometry/Offset;->box-impl(J)Landroidx/compose/ui/geometry/Offset;

    move-result-object v2

    invoke-static {v2, v0, v1, v0}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v2

    iput-object v2, p0, Landroidx/compose/foundation/text/selection/SelectionManager;->dragTotalDistance$delegate:Landroidx/compose/runtime/MutableState;

    .line 196
    invoke-static {v0, v0, v1, v0}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v2

    iput-object v2, p0, Landroidx/compose/foundation/text/selection/SelectionManager;->startHandlePosition$delegate:Landroidx/compose/runtime/MutableState;

    .line 204
    invoke-static {v0, v0, v1, v0}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v2

    iput-object v2, p0, Landroidx/compose/foundation/text/selection/SelectionManager;->endHandlePosition$delegate:Landroidx/compose/runtime/MutableState;

    .line 211
    invoke-static {v0, v0, v1, v0}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v2

    iput-object v2, p0, Landroidx/compose/foundation/text/selection/SelectionManager;->draggingHandle$delegate:Landroidx/compose/runtime/MutableState;

    .line 234
    invoke-static {v0, v0, v1, v0}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v0

    iput-object v0, p0, Landroidx/compose/foundation/text/selection/SelectionManager;->currentDragPosition$delegate:Landroidx/compose/runtime/MutableState;

    .line 242
    nop

    .line 243
    iget-object v0, p0, Landroidx/compose/foundation/text/selection/SelectionManager;->selectionRegistrar:Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;

    new-instance v1, Landroidx/compose/foundation/text/selection/SelectionManager$1;

    invoke-direct {v1, p0}, Landroidx/compose/foundation/text/selection/SelectionManager$1;-><init>(Landroidx/compose/foundation/text/selection/SelectionManager;)V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v0, v1}, Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;->setOnPositionChangeCallback$foundation_release(Lkotlin/jvm/functions/Function1;)V

    .line 250
    iget-object v0, p0, Landroidx/compose/foundation/text/selection/SelectionManager;->selectionRegistrar:Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;

    new-instance v1, Landroidx/compose/foundation/text/selection/SelectionManager$2;

    invoke-direct {v1, p0}, Landroidx/compose/foundation/text/selection/SelectionManager$2;-><init>(Landroidx/compose/foundation/text/selection/SelectionManager;)V

    check-cast v1, Lkotlin/jvm/functions/Function4;

    invoke-virtual {v0, v1}, Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;->setOnSelectionUpdateStartCallback$foundation_release(Lkotlin/jvm/functions/Function4;)V

    .line 277
    iget-object v0, p0, Landroidx/compose/foundation/text/selection/SelectionManager;->selectionRegistrar:Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;

    new-instance v1, Landroidx/compose/foundation/text/selection/SelectionManager$3;

    invoke-direct {v1, p0}, Landroidx/compose/foundation/text/selection/SelectionManager$3;-><init>(Landroidx/compose/foundation/text/selection/SelectionManager;)V

    check-cast v1, Lkotlin/jvm/functions/Function2;

    invoke-virtual {v0, v1}, Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;->setOnSelectionUpdateSelectAll$foundation_release(Lkotlin/jvm/functions/Function2;)V

    .line 293
    iget-object v0, p0, Landroidx/compose/foundation/text/selection/SelectionManager;->selectionRegistrar:Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;

    new-instance v1, Landroidx/compose/foundation/text/selection/SelectionManager$4;

    invoke-direct {v1, p0}, Landroidx/compose/foundation/text/selection/SelectionManager$4;-><init>(Landroidx/compose/foundation/text/selection/SelectionManager;)V

    check-cast v1, Lkotlin/jvm/functions/Function6;

    invoke-virtual {v0, v1}, Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;->setOnSelectionUpdateCallback$foundation_release(Lkotlin/jvm/functions/Function6;)V

    .line 315
    iget-object v0, p0, Landroidx/compose/foundation/text/selection/SelectionManager;->selectionRegistrar:Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;

    new-instance v1, Landroidx/compose/foundation/text/selection/SelectionManager$5;

    invoke-direct {v1, p0}, Landroidx/compose/foundation/text/selection/SelectionManager$5;-><init>(Landroidx/compose/foundation/text/selection/SelectionManager;)V

    check-cast v1, Lkotlin/jvm/functions/Function0;

    invoke-virtual {v0, v1}, Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;->setOnSelectionUpdateEndCallback$foundation_release(Lkotlin/jvm/functions/Function0;)V

    .line 325
    iget-object v0, p0, Landroidx/compose/foundation/text/selection/SelectionManager;->selectionRegistrar:Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;

    new-instance v1, Landroidx/compose/foundation/text/selection/SelectionManager$6;

    invoke-direct {v1, p0}, Landroidx/compose/foundation/text/selection/SelectionManager$6;-><init>(Landroidx/compose/foundation/text/selection/SelectionManager;)V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v0, v1}, Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;->setOnSelectableChangeCallback$foundation_release(Lkotlin/jvm/functions/Function1;)V

    .line 333
    iget-object v0, p0, Landroidx/compose/foundation/text/selection/SelectionManager;->selectionRegistrar:Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;

    new-instance v1, Landroidx/compose/foundation/text/selection/SelectionManager$7;

    invoke-direct {v1, p0}, Landroidx/compose/foundation/text/selection/SelectionManager$7;-><init>(Landroidx/compose/foundation/text/selection/SelectionManager;)V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v0, v1}, Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;->setAfterSelectableUnsubscribe$foundation_release(Lkotlin/jvm/functions/Function1;)V

    .line 348
    nop

    .line 74
    return-void
.end method

.method public static final synthetic access$convertToContainerCoordinates-R5De75A(Landroidx/compose/foundation/text/selection/SelectionManager;Landroidx/compose/ui/layout/LayoutCoordinates;J)J
    .locals 2
    .param p0, "$this"    # Landroidx/compose/foundation/text/selection/SelectionManager;
    .param p1, "layoutCoordinates"    # Landroidx/compose/ui/layout/LayoutCoordinates;
    .param p2, "offset"    # J

    .line 74
    invoke-direct {p0, p1, p2, p3}, Landroidx/compose/foundation/text/selection/SelectionManager;->convertToContainerCoordinates-R5De75A(Landroidx/compose/ui/layout/LayoutCoordinates;J)J

    move-result-wide v0

    return-wide v0
.end method

.method public static final synthetic access$getSelectionRegistrar$p(Landroidx/compose/foundation/text/selection/SelectionManager;)Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;
    .locals 1
    .param p0, "$this"    # Landroidx/compose/foundation/text/selection/SelectionManager;

    .line 74
    iget-object v0, p0, Landroidx/compose/foundation/text/selection/SelectionManager;->selectionRegistrar:Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;

    return-object v0
.end method

.method public static final synthetic access$isDraggingInProgress(Landroidx/compose/foundation/text/selection/SelectionManager;)Z
    .locals 1
    .param p0, "$this"    # Landroidx/compose/foundation/text/selection/SelectionManager;

    .line 74
    invoke-direct {p0}, Landroidx/compose/foundation/text/selection/SelectionManager;->isDraggingInProgress()Z

    move-result v0

    return v0
.end method

.method public static final synthetic access$setCurrentDragPosition-_kEHs6E(Landroidx/compose/foundation/text/selection/SelectionManager;Landroidx/compose/ui/geometry/Offset;)V
    .locals 0
    .param p0, "$this"    # Landroidx/compose/foundation/text/selection/SelectionManager;
    .param p1, "<set-?>"    # Landroidx/compose/ui/geometry/Offset;

    .line 74
    invoke-direct {p0, p1}, Landroidx/compose/foundation/text/selection/SelectionManager;->setCurrentDragPosition-_kEHs6E(Landroidx/compose/ui/geometry/Offset;)V

    return-void
.end method

.method public static final synthetic access$setDragBeginPosition-k-4lQ0M(Landroidx/compose/foundation/text/selection/SelectionManager;J)V
    .locals 0
    .param p0, "$this"    # Landroidx/compose/foundation/text/selection/SelectionManager;
    .param p1, "<set-?>"    # J

    .line 74
    invoke-direct {p0, p1, p2}, Landroidx/compose/foundation/text/selection/SelectionManager;->setDragBeginPosition-k-4lQ0M(J)V

    return-void
.end method

.method public static final synthetic access$setDragTotalDistance-k-4lQ0M(Landroidx/compose/foundation/text/selection/SelectionManager;J)V
    .locals 0
    .param p0, "$this"    # Landroidx/compose/foundation/text/selection/SelectionManager;
    .param p1, "<set-?>"    # J

    .line 74
    invoke-direct {p0, p1, p2}, Landroidx/compose/foundation/text/selection/SelectionManager;->setDragTotalDistance-k-4lQ0M(J)V

    return-void
.end method

.method public static final synthetic access$setDraggingHandle(Landroidx/compose/foundation/text/selection/SelectionManager;Landroidx/compose/foundation/text/Handle;)V
    .locals 0
    .param p0, "$this"    # Landroidx/compose/foundation/text/selection/SelectionManager;
    .param p1, "<set-?>"    # Landroidx/compose/foundation/text/Handle;

    .line 74
    invoke-direct {p0, p1}, Landroidx/compose/foundation/text/selection/SelectionManager;->setDraggingHandle(Landroidx/compose/foundation/text/Handle;)V

    return-void
.end method

.method public static final synthetic access$setEndHandlePosition-_kEHs6E(Landroidx/compose/foundation/text/selection/SelectionManager;Landroidx/compose/ui/geometry/Offset;)V
    .locals 0
    .param p0, "$this"    # Landroidx/compose/foundation/text/selection/SelectionManager;
    .param p1, "<set-?>"    # Landroidx/compose/ui/geometry/Offset;

    .line 74
    invoke-direct {p0, p1}, Landroidx/compose/foundation/text/selection/SelectionManager;->setEndHandlePosition-_kEHs6E(Landroidx/compose/ui/geometry/Offset;)V

    return-void
.end method

.method public static final synthetic access$setStartHandlePosition-_kEHs6E(Landroidx/compose/foundation/text/selection/SelectionManager;Landroidx/compose/ui/geometry/Offset;)V
    .locals 0
    .param p0, "$this"    # Landroidx/compose/foundation/text/selection/SelectionManager;
    .param p1, "<set-?>"    # Landroidx/compose/ui/geometry/Offset;

    .line 74
    invoke-direct {p0, p1}, Landroidx/compose/foundation/text/selection/SelectionManager;->setStartHandlePosition-_kEHs6E(Landroidx/compose/ui/geometry/Offset;)V

    return-void
.end method

.method public static final synthetic access$startSelection-9KIMszo(Landroidx/compose/foundation/text/selection/SelectionManager;JZLandroidx/compose/foundation/text/selection/SelectionAdjustment;)V
    .locals 0
    .param p0, "$this"    # Landroidx/compose/foundation/text/selection/SelectionManager;
    .param p1, "position"    # J
    .param p3, "isStartHandle"    # Z
    .param p4, "adjustment"    # Landroidx/compose/foundation/text/selection/SelectionAdjustment;

    .line 74
    invoke-direct {p0, p1, p2, p3, p4}, Landroidx/compose/foundation/text/selection/SelectionManager;->startSelection-9KIMszo(JZLandroidx/compose/foundation/text/selection/SelectionAdjustment;)V

    return-void
.end method

.method public static final synthetic access$toolbarCopy(Landroidx/compose/foundation/text/selection/SelectionManager;)V
    .locals 0
    .param p0, "$this"    # Landroidx/compose/foundation/text/selection/SelectionManager;

    .line 74
    invoke-direct {p0}, Landroidx/compose/foundation/text/selection/SelectionManager;->toolbarCopy()V

    return-void
.end method

.method public static final synthetic access$updateHandleOffsets(Landroidx/compose/foundation/text/selection/SelectionManager;)V
    .locals 0
    .param p0, "$this"    # Landroidx/compose/foundation/text/selection/SelectionManager;

    .line 74
    invoke-direct {p0}, Landroidx/compose/foundation/text/selection/SelectionManager;->updateHandleOffsets()V

    return-void
.end method

.method public static final synthetic access$updateSelectionToolbar(Landroidx/compose/foundation/text/selection/SelectionManager;)V
    .locals 0
    .param p0, "$this"    # Landroidx/compose/foundation/text/selection/SelectionManager;

    .line 74
    invoke-direct {p0}, Landroidx/compose/foundation/text/selection/SelectionManager;->updateSelectionToolbar()V

    return-void
.end method

.method private final convertToContainerCoordinates-R5De75A(Landroidx/compose/ui/layout/LayoutCoordinates;J)J
    .locals 3
    .param p1, "layoutCoordinates"    # Landroidx/compose/ui/layout/LayoutCoordinates;
    .param p2, "offset"    # J

    .line 771
    iget-object v0, p0, Landroidx/compose/foundation/text/selection/SelectionManager;->containerLayoutCoordinates:Landroidx/compose/ui/layout/LayoutCoordinates;

    .line 772
    .local v0, "coordinates":Landroidx/compose/ui/layout/LayoutCoordinates;
    if-eqz v0, :cond_1

    invoke-interface {v0}, Landroidx/compose/ui/layout/LayoutCoordinates;->isAttached()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 773
    :cond_0
    invoke-virtual {p0}, Landroidx/compose/foundation/text/selection/SelectionManager;->requireContainerCoordinates$foundation_release()Landroidx/compose/ui/layout/LayoutCoordinates;

    move-result-object v1

    invoke-interface {v1, p1, p2, p3}, Landroidx/compose/ui/layout/LayoutCoordinates;->localPositionOf-R5De75A(Landroidx/compose/ui/layout/LayoutCoordinates;J)J

    move-result-wide v1

    return-wide v1

    .line 772
    :cond_1
    :goto_0
    sget-object v1, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    invoke-virtual {v1}, Landroidx/compose/ui/geometry/Offset$Companion;->getUnspecified-F1C5BW0()J

    move-result-wide v1

    return-wide v1
.end method

.method private final getContentRect()Landroidx/compose/ui/geometry/Rect;
    .locals 18

    .line 612
    move-object/from16 v0, p0

    invoke-virtual {v0}, Landroidx/compose/foundation/text/selection/SelectionManager;->getSelection()Landroidx/compose/foundation/text/selection/Selection;

    move-result-object v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return-object v2

    .line 613
    :cond_0
    iget-object v1, v0, Landroidx/compose/foundation/text/selection/SelectionManager;->containerLayoutCoordinates:Landroidx/compose/ui/layout/LayoutCoordinates;

    if-nez v1, :cond_1

    return-object v2

    .line 614
    .local v1, "containerCoordinates":Landroidx/compose/ui/layout/LayoutCoordinates;
    :cond_1
    invoke-interface {v1}, Landroidx/compose/ui/layout/LayoutCoordinates;->isAttached()Z

    move-result v3

    if-nez v3, :cond_2

    return-object v2

    .line 617
    :cond_2
    iget-object v3, v0, Landroidx/compose/foundation/text/selection/SelectionManager;->selectionRegistrar:Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;

    .line 618
    invoke-virtual {v0}, Landroidx/compose/foundation/text/selection/SelectionManager;->requireContainerCoordinates$foundation_release()Landroidx/compose/ui/layout/LayoutCoordinates;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;->sort(Landroidx/compose/ui/layout/LayoutCoordinates;)Ljava/util/List;

    move-result-object v3

    .line 619
    nop

    .local v3, "$this$fastMapNotNull$iv":Ljava/util/List;
    const/4 v4, 0x0

    .line 1185
    .local v4, "$i$f$fastMapNotNull":I
    nop

    .line 1186
    new-instance v5, Ljava/util/ArrayList;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v6

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 1187
    .local v5, "target$iv":Ljava/util/ArrayList;
    move-object v6, v3

    .local v6, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v7, 0x0

    .line 1188
    .local v7, "$i$f$fastForEach":I
    nop

    .line 1189
    const/4 v8, 0x0

    .local v8, "index$iv$iv":I
    move-object v9, v6

    check-cast v9, Ljava/util/Collection;

    invoke-interface {v9}, Ljava/util/Collection;->size()I

    move-result v9

    :goto_0
    if-ge v8, v9, :cond_5

    .line 1190
    invoke-interface {v6, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    .line 1191
    .local v10, "item$iv$iv":Ljava/lang/Object;
    move-object v11, v10

    .local v11, "e$iv":Ljava/lang/Object;
    const/4 v12, 0x0

    .line 1187
    .local v12, "$i$a$-fastForEach-ListUtilsKt$fastMapNotNull$2$iv":I
    move-object v13, v11

    check-cast v13, Landroidx/compose/foundation/text/selection/Selectable;

    .local v13, "selectable":Landroidx/compose/foundation/text/selection/Selectable;
    const/4 v14, 0x0

    .line 620
    .local v14, "$i$a$-fastMapNotNull-SelectionManager$getContentRect$selectableSubSelections$1":I
    iget-object v15, v0, Landroidx/compose/foundation/text/selection/SelectionManager;->selectionRegistrar:Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;

    invoke-virtual {v15}, Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;->getSubselections()Landroidx/collection/LongObjectMap;

    move-result-object v15

    move-object/from16 v16, v2

    move-object/from16 v17, v3

    .end local v3    # "$this$fastMapNotNull$iv":Ljava/util/List;
    .local v17, "$this$fastMapNotNull$iv":Ljava/util/List;
    invoke-interface {v13}, Landroidx/compose/foundation/text/selection/Selectable;->getSelectableId()J

    move-result-wide v2

    invoke-virtual {v15, v2, v3}, Landroidx/collection/LongObjectMap;->get(J)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/compose/foundation/text/selection/Selection;

    if-eqz v2, :cond_3

    .local v2, "it":Landroidx/compose/foundation/text/selection/Selection;
    const/4 v3, 0x0

    .line 621
    .local v3, "$i$a$-let-SelectionManager$getContentRect$selectableSubSelections$1$1":I
    invoke-static {v13, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    .line 620
    .end local v2    # "it":Landroidx/compose/foundation/text/selection/Selection;
    .end local v3    # "$i$a$-let-SelectionManager$getContentRect$selectableSubSelections$1$1":I
    goto :goto_1

    :cond_3
    move-object/from16 v2, v16

    .line 622
    :goto_1
    nop

    .line 1187
    .end local v13    # "selectable":Landroidx/compose/foundation/text/selection/Selectable;
    .end local v14    # "$i$a$-fastMapNotNull-SelectionManager$getContentRect$selectableSubSelections$1":I
    if-eqz v2, :cond_4

    .line 1192
    .local v2, "it$iv":Ljava/lang/Object;
    const/4 v3, 0x0

    .line 1187
    .local v3, "$i$a$-let-ListUtilsKt$fastMapNotNull$2$1$iv":I
    move-object v13, v5

    check-cast v13, Ljava/util/Collection;

    invoke-interface {v13, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 1191
    .end local v2    # "it$iv":Ljava/lang/Object;
    .end local v3    # "$i$a$-let-ListUtilsKt$fastMapNotNull$2$1$iv":I
    .end local v11    # "e$iv":Ljava/lang/Object;
    .end local v12    # "$i$a$-fastForEach-ListUtilsKt$fastMapNotNull$2$iv":I
    :cond_4
    nop

    .line 1189
    .end local v10    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v8, v8, 0x1

    move-object/from16 v2, v16

    move-object/from16 v3, v17

    goto :goto_0

    .end local v17    # "$this$fastMapNotNull$iv":Ljava/util/List;
    .local v3, "$this$fastMapNotNull$iv":Ljava/util/List;
    :cond_5
    move-object/from16 v16, v2

    move-object/from16 v17, v3

    .line 1193
    .end local v3    # "$this$fastMapNotNull$iv":Ljava/util/List;
    .end local v8    # "index$iv$iv":I
    .restart local v17    # "$this$fastMapNotNull$iv":Ljava/util/List;
    nop

    .line 1194
    .end local v6    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v7    # "$i$f$fastForEach":I
    move-object v2, v5

    check-cast v2, Ljava/util/List;

    .line 624
    .end local v4    # "$i$f$fastMapNotNull":I
    .end local v5    # "target$iv":Ljava/util/ArrayList;
    .end local v17    # "$this$fastMapNotNull$iv":Ljava/util/List;
    invoke-static {v2}, Landroidx/compose/foundation/text/selection/SelectionManagerKt;->access$firstAndLast(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    .line 616
    nop

    .line 626
    .local v2, "selectableSubSelections":Ljava/util/List;
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_6

    return-object v16

    .line 628
    :cond_6
    invoke-static {v2, v1}, Landroidx/compose/foundation/text/selection/SelectionManagerKt;->getSelectedRegionRect(Ljava/util/List;Landroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/ui/geometry/Rect;

    move-result-object v3

    .line 627
    nop

    .line 630
    .local v3, "selectedRegionRect":Landroidx/compose/ui/geometry/Rect;
    invoke-static {}, Landroidx/compose/foundation/text/selection/SelectionManagerKt;->access$getInvertedInfiniteRect$p()Landroidx/compose/ui/geometry/Rect;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_7

    return-object v16

    .line 632
    :cond_7
    invoke-static {v1}, Landroidx/compose/foundation/text/selection/SelectionManagerKt;->visibleBounds(Landroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/ui/geometry/Rect;

    move-result-object v4

    invoke-virtual {v4, v3}, Landroidx/compose/ui/geometry/Rect;->intersect(Landroidx/compose/ui/geometry/Rect;)Landroidx/compose/ui/geometry/Rect;

    move-result-object v4

    .line 634
    .local v4, "visibleRect":Landroidx/compose/ui/geometry/Rect;
    move-object v5, v4

    .local v5, "this_$iv":Landroidx/compose/ui/geometry/Rect;
    const/4 v6, 0x0

    .line 1195
    .local v6, "$i$f$getWidth":I
    invoke-virtual {v5}, Landroidx/compose/ui/geometry/Rect;->getRight()F

    move-result v7

    invoke-virtual {v5}, Landroidx/compose/ui/geometry/Rect;->getLeft()F

    move-result v8

    sub-float/2addr v7, v8

    .line 634
    .end local v5    # "this_$iv":Landroidx/compose/ui/geometry/Rect;
    .end local v6    # "$i$f$getWidth":I
    const/4 v5, 0x0

    cmpg-float v6, v7, v5

    if-ltz v6, :cond_9

    move-object v6, v4

    .local v6, "this_$iv":Landroidx/compose/ui/geometry/Rect;
    const/4 v7, 0x0

    .line 1200
    .local v7, "$i$f$getHeight":I
    invoke-virtual {v6}, Landroidx/compose/ui/geometry/Rect;->getBottom()F

    move-result v8

    invoke-virtual {v6}, Landroidx/compose/ui/geometry/Rect;->getTop()F

    move-result v9

    sub-float/2addr v8, v9

    .line 634
    .end local v6    # "this_$iv":Landroidx/compose/ui/geometry/Rect;
    .end local v7    # "$i$f$getHeight":I
    cmpg-float v5, v8, v5

    if-gez v5, :cond_8

    goto :goto_2

    .line 636
    :cond_8
    invoke-static {v1}, Landroidx/compose/ui/layout/LayoutCoordinatesKt;->positionInRoot(Landroidx/compose/ui/layout/LayoutCoordinates;)J

    move-result-wide v5

    invoke-virtual {v4, v5, v6}, Landroidx/compose/ui/geometry/Rect;->translate-k-4lQ0M(J)Landroidx/compose/ui/geometry/Rect;

    move-result-object v7

    .line 637
    .local v7, "rootRect":Landroidx/compose/ui/geometry/Rect;
    invoke-virtual {v7}, Landroidx/compose/ui/geometry/Rect;->getBottom()F

    move-result v5

    invoke-static {}, Landroidx/compose/foundation/text/selection/SelectionHandlesKt;->getHandleHeight()F

    move-result v6

    const/high16 v8, 0x40800000    # 4.0f

    mul-float/2addr v6, v8

    add-float v11, v5, v6

    const/4 v12, 0x7

    const/4 v13, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v7 .. v13}, Landroidx/compose/ui/geometry/Rect;->copy$default(Landroidx/compose/ui/geometry/Rect;FFFFILjava/lang/Object;)Landroidx/compose/ui/geometry/Rect;

    move-result-object v5

    return-object v5

    .line 634
    .end local v7    # "rootRect":Landroidx/compose/ui/geometry/Rect;
    :cond_9
    :goto_2
    return-object v16
.end method

.method public static synthetic getPreviousSelectionLayout$foundation_release$annotations()V
    .locals 0

    return-void
.end method

.method private final getSelectionLayout-Wko1d7g(JJZ)Landroidx/compose/foundation/text/selection/SelectionLayout;
    .locals 14
    .param p1, "position"    # J
    .param p3, "previousHandlePosition"    # J
    .param p5, "isStartHandle"    # Z

    .line 873
    invoke-virtual {p0}, Landroidx/compose/foundation/text/selection/SelectionManager;->requireContainerCoordinates$foundation_release()Landroidx/compose/ui/layout/LayoutCoordinates;

    move-result-object v5

    .line 874
    .local v5, "containerCoordinates":Landroidx/compose/ui/layout/LayoutCoordinates;
    iget-object v0, p0, Landroidx/compose/foundation/text/selection/SelectionManager;->selectionRegistrar:Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;

    invoke-virtual {v0, v5}, Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;->sort(Landroidx/compose/ui/layout/LayoutCoordinates;)Ljava/util/List;

    move-result-object v10

    .line 876
    .local v10, "sortedSelectables":Ljava/util/List;
    invoke-static {}, Landroidx/collection/LongIntMapKt;->mutableLongIntMapOf()Landroidx/collection/MutableLongIntMap;

    move-result-object v11

    .line 877
    .local v11, "idToIndexMap":Landroidx/collection/MutableLongIntMap;
    move-object v0, v10

    .local v0, "$this$fastForEachIndexed$iv":Ljava/util/List;
    const/4 v1, 0x0

    .line 1201
    .local v1, "$i$f$fastForEachIndexed":I
    nop

    .line 1202
    const/4 v2, 0x0

    .local v2, "index$iv":I
    move-object v3, v0

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->size()I

    move-result v3

    :goto_0
    if-ge v2, v3, :cond_0

    .line 1203
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    .line 1204
    .local v4, "item$iv":Ljava/lang/Object;
    move-object v6, v4

    check-cast v6, Landroidx/compose/foundation/text/selection/Selectable;

    .local v6, "selectable":Landroidx/compose/foundation/text/selection/Selectable;
    move v7, v2

    .local v7, "index":I
    const/4 v8, 0x0

    .line 878
    .local v8, "$i$a$-fastForEachIndexed-SelectionManager$getSelectionLayout$1":I
    invoke-interface {v6}, Landroidx/compose/foundation/text/selection/Selectable;->getSelectableId()J

    move-result-wide v12

    invoke-virtual {v11, v12, v13, v7}, Landroidx/collection/MutableLongIntMap;->set(JI)V

    .line 879
    nop

    .line 1204
    .end local v6    # "selectable":Landroidx/compose/foundation/text/selection/Selectable;
    .end local v7    # "index":I
    .end local v8    # "$i$a$-fastForEachIndexed-SelectionManager$getSelectionLayout$1":I
    nop

    .line 1202
    .end local v4    # "item$iv":Ljava/lang/Object;
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 1206
    .end local v2    # "index$iv":I
    :cond_0
    nop

    .line 881
    .end local v0    # "$this$fastForEachIndexed$iv":Ljava/util/List;
    .end local v1    # "$i$f$fastForEachIndexed":I
    new-instance v0, Landroidx/compose/foundation/text/selection/SelectionManager$getSelectionLayout-Wko1d7g$$inlined$compareBy$1;

    invoke-direct {v0, v11}, Landroidx/compose/foundation/text/selection/SelectionManager$getSelectionLayout-Wko1d7g$$inlined$compareBy$1;-><init>(Landroidx/collection/MutableLongIntMap;)V

    move-object v8, v0

    check-cast v8, Ljava/util/Comparator;

    .line 884
    .local v8, "selectableIdOrderingComparator":Ljava/util/Comparator;
    move-wide/from16 v0, p3

    .local v0, "$this$isUnspecified$iv":J
    const/4 v2, 0x0

    .line 1207
    .local v2, "$i$f$isUnspecified-k-4lQ0M":I
    const-wide v3, 0x7fffffff7fffffffL

    and-long/2addr v3, v0

    const-wide v6, 0x7fc000007fc00000L    # 2.247117487993712E307

    cmp-long v3, v3, v6

    if-nez v3, :cond_1

    const/4 v3, 0x1

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    .line 884
    .end local v0    # "$this$isUnspecified$iv":J
    .end local v2    # "$i$f$isUnspecified-k-4lQ0M":I
    :goto_1
    if-eqz v3, :cond_2

    const/4 v0, 0x0

    goto :goto_2

    :cond_2
    invoke-virtual {p0}, Landroidx/compose/foundation/text/selection/SelectionManager;->getSelection()Landroidx/compose/foundation/text/selection/Selection;

    move-result-object v0

    :goto_2
    move-object v7, v0

    .line 886
    .local v7, "previousSelection":Landroidx/compose/foundation/text/selection/Selection;
    new-instance v0, Landroidx/compose/foundation/text/selection/SelectionLayoutBuilder;

    .line 887
    nop

    .line 888
    nop

    .line 889
    nop

    .line 890
    nop

    .line 891
    nop

    .line 892
    nop

    .line 886
    const/4 v9, 0x0

    move-wide v1, p1

    move-wide/from16 v3, p3

    move/from16 v6, p5

    invoke-direct/range {v0 .. v9}, Landroidx/compose/foundation/text/selection/SelectionLayoutBuilder;-><init>(JJLandroidx/compose/ui/layout/LayoutCoordinates;ZLandroidx/compose/foundation/text/selection/Selection;Ljava/util/Comparator;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 885
    nop

    .line 895
    .local v0, "builder":Landroidx/compose/foundation/text/selection/SelectionLayoutBuilder;
    move-object v1, v10

    .local v1, "$this$fastForEach$iv":Ljava/util/List;
    const/4 v2, 0x0

    .line 1208
    .local v2, "$i$f$fastForEach":I
    nop

    .line 1209
    const/4 v3, 0x0

    .local v3, "index$iv":I
    move-object v4, v1

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->size()I

    move-result v4

    :goto_3
    if-ge v3, v4, :cond_3

    .line 1210
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    .line 1211
    .local v6, "item$iv":Ljava/lang/Object;
    move-object v9, v6

    check-cast v9, Landroidx/compose/foundation/text/selection/Selectable;

    .local v9, "it":Landroidx/compose/foundation/text/selection/Selectable;
    const/4 v12, 0x0

    .line 895
    .local v12, "$i$a$-fastForEach-SelectionManager$getSelectionLayout$2":I
    invoke-interface {v9, v0}, Landroidx/compose/foundation/text/selection/Selectable;->appendSelectableInfoToBuilder(Landroidx/compose/foundation/text/selection/SelectionLayoutBuilder;)V

    .line 1211
    .end local v9    # "it":Landroidx/compose/foundation/text/selection/Selectable;
    .end local v12    # "$i$a$-fastForEach-SelectionManager$getSelectionLayout$2":I
    nop

    .line 1209
    .end local v6    # "item$iv":Ljava/lang/Object;
    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    .line 1213
    .end local v3    # "index$iv":I
    :cond_3
    nop

    .line 897
    .end local v1    # "$this$fastForEach$iv":Ljava/util/List;
    .end local v2    # "$i$f$fastForEach":I
    invoke-virtual {v0}, Landroidx/compose/foundation/text/selection/SelectionLayoutBuilder;->build()Landroidx/compose/foundation/text/selection/SelectionLayout;

    move-result-object v1

    return-object v1
.end method

.method private final getShouldShowMagnifier()Z
    .locals 1

    .line 238
    invoke-direct {p0}, Landroidx/compose/foundation/text/selection/SelectionManager;->isDraggingInProgress()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/compose/foundation/text/selection/SelectionManager;->isInTouchMode()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/compose/foundation/text/selection/SelectionManager;->isTriviallyCollapsedSelection$foundation_release()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private final isDraggingInProgress()Z
    .locals 1

    .line 135
    invoke-virtual {p0}, Landroidx/compose/foundation/text/selection/SelectionManager;->getDraggingHandle()Landroidx/compose/foundation/text/Handle;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private final onClearSelectionRequested(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/Modifier;
    .locals 2
    .param p1, "$this$onClearSelectionRequested"    # Landroidx/compose/ui/Modifier;
    .param p2, "block"    # Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)",
            "Landroidx/compose/ui/Modifier;"
        }
    .end annotation

    .line 750
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    new-instance v1, Landroidx/compose/foundation/text/selection/SelectionManager$onClearSelectionRequested$1;

    invoke-direct {v1, p0, p2}, Landroidx/compose/foundation/text/selection/SelectionManager$onClearSelectionRequested$1;-><init>(Landroidx/compose/foundation/text/selection/SelectionManager;Lkotlin/jvm/functions/Function0;)V

    check-cast v1, Landroidx/compose/ui/input/pointer/PointerInputEventHandler;

    invoke-static {p1, v0, v1}, Landroidx/compose/ui/input/pointer/SuspendingPointerInputFilterKt;->pointerInput(Landroidx/compose/ui/Modifier;Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    .line 765
    return-object v0
.end method

.method private final selectionChanged(Landroidx/compose/foundation/text/selection/SelectionLayout;Landroidx/compose/foundation/text/selection/Selection;)V
    .locals 2
    .param p1, "selectionLayout"    # Landroidx/compose/foundation/text/selection/SelectionLayout;
    .param p2, "newSelection"    # Landroidx/compose/foundation/text/selection/Selection;

    .line 901
    invoke-virtual {p0}, Landroidx/compose/foundation/text/selection/SelectionManager;->shouldPerformHaptics$foundation_release()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 902
    iget-object v0, p0, Landroidx/compose/foundation/text/selection/SelectionManager;->hapticFeedBack:Landroidx/compose/ui/hapticfeedback/HapticFeedback;

    if-eqz v0, :cond_0

    sget-object v1, Landroidx/compose/ui/hapticfeedback/HapticFeedbackType;->Companion:Landroidx/compose/ui/hapticfeedback/HapticFeedbackType$Companion;

    invoke-virtual {v1}, Landroidx/compose/ui/hapticfeedback/HapticFeedbackType$Companion;->getTextHandleMove-5zf0vsI()I

    move-result v1

    invoke-interface {v0, v1}, Landroidx/compose/ui/hapticfeedback/HapticFeedback;->performHapticFeedback-CdsT49E(I)V

    .line 904
    :cond_0
    iget-object v0, p0, Landroidx/compose/foundation/text/selection/SelectionManager;->selectionRegistrar:Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;

    invoke-interface {p1, p2}, Landroidx/compose/foundation/text/selection/SelectionLayout;->createSubSelections(Landroidx/compose/foundation/text/selection/Selection;)Landroidx/collection/LongObjectMap;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;->setSubselections(Landroidx/collection/LongObjectMap;)V

    .line 905
    iget-object v0, p0, Landroidx/compose/foundation/text/selection/SelectionManager;->onSelectionChange:Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 906
    return-void
.end method

.method private final setCurrentDragPosition-_kEHs6E(Landroidx/compose/ui/geometry/Offset;)V
    .locals 3
    .param p1, "<set-?>"    # Landroidx/compose/ui/geometry/Offset;

    .line 234
    iget-object v0, p0, Landroidx/compose/foundation/text/selection/SelectionManager;->currentDragPosition$delegate:Landroidx/compose/runtime/MutableState;

    .local v0, "$this$setValue$iv":Landroidx/compose/runtime/MutableState;
    const/4 v1, 0x0

    .local v1, "property$iv":Lkotlin/reflect/KProperty;
    const/4 v2, 0x0

    .line 1128
    .local v2, "$i$f$setValue":I
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 1129
    nop

    .line 234
    .end local v0    # "$this$setValue$iv":Landroidx/compose/runtime/MutableState;
    .end local v1    # "property$iv":Lkotlin/reflect/KProperty;
    .end local v2    # "$i$f$setValue":I
    return-void
.end method

.method private final setDragBeginPosition-k-4lQ0M(J)V
    .locals 4
    .param p1, "<set-?>"    # J

    .line 181
    iget-object v0, p0, Landroidx/compose/foundation/text/selection/SelectionManager;->dragBeginPosition$delegate:Landroidx/compose/runtime/MutableState;

    .local v0, "$this$setValue$iv":Landroidx/compose/runtime/MutableState;
    const/4 v1, 0x0

    .local v1, "property$iv":Lkotlin/reflect/KProperty;
    invoke-static {p1, p2}, Landroidx/compose/ui/geometry/Offset;->box-impl(J)Landroidx/compose/ui/geometry/Offset;

    move-result-object v2

    .local v2, "value$iv":Ljava/lang/Object;
    const/4 v3, 0x0

    .line 1112
    .local v3, "$i$f$setValue":I
    invoke-interface {v0, v2}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 1113
    nop

    .line 181
    .end local v0    # "$this$setValue$iv":Landroidx/compose/runtime/MutableState;
    .end local v1    # "property$iv":Lkotlin/reflect/KProperty;
    .end local v2    # "value$iv":Ljava/lang/Object;
    .end local v3    # "$i$f$setValue":I
    return-void
.end method

.method private final setDragTotalDistance-k-4lQ0M(J)V
    .locals 4
    .param p1, "<set-?>"    # J

    .line 188
    iget-object v0, p0, Landroidx/compose/foundation/text/selection/SelectionManager;->dragTotalDistance$delegate:Landroidx/compose/runtime/MutableState;

    .local v0, "$this$setValue$iv":Landroidx/compose/runtime/MutableState;
    const/4 v1, 0x0

    .local v1, "property$iv":Lkotlin/reflect/KProperty;
    invoke-static {p1, p2}, Landroidx/compose/ui/geometry/Offset;->box-impl(J)Landroidx/compose/ui/geometry/Offset;

    move-result-object v2

    .local v2, "value$iv":Ljava/lang/Object;
    const/4 v3, 0x0

    .line 1115
    .local v3, "$i$f$setValue":I
    invoke-interface {v0, v2}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 1116
    nop

    .line 188
    .end local v0    # "$this$setValue$iv":Landroidx/compose/runtime/MutableState;
    .end local v1    # "property$iv":Lkotlin/reflect/KProperty;
    .end local v2    # "value$iv":Ljava/lang/Object;
    .end local v3    # "$i$f$setValue":I
    return-void
.end method

.method private final setDraggingHandle(Landroidx/compose/foundation/text/Handle;)V
    .locals 3
    .param p1, "<set-?>"    # Landroidx/compose/foundation/text/Handle;

    .line 211
    iget-object v0, p0, Landroidx/compose/foundation/text/selection/SelectionManager;->draggingHandle$delegate:Landroidx/compose/runtime/MutableState;

    .local v0, "$this$setValue$iv":Landroidx/compose/runtime/MutableState;
    const/4 v1, 0x0

    .local v1, "property$iv":Lkotlin/reflect/KProperty;
    const/4 v2, 0x0

    .line 1124
    .local v2, "$i$f$setValue":I
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 1125
    nop

    .line 211
    .end local v0    # "$this$setValue$iv":Landroidx/compose/runtime/MutableState;
    .end local v1    # "property$iv":Lkotlin/reflect/KProperty;
    .end local v2    # "$i$f$setValue":I
    return-void
.end method

.method private final setEndHandlePosition-_kEHs6E(Landroidx/compose/ui/geometry/Offset;)V
    .locals 3
    .param p1, "<set-?>"    # Landroidx/compose/ui/geometry/Offset;

    .line 204
    iget-object v0, p0, Landroidx/compose/foundation/text/selection/SelectionManager;->endHandlePosition$delegate:Landroidx/compose/runtime/MutableState;

    .local v0, "$this$setValue$iv":Landroidx/compose/runtime/MutableState;
    const/4 v1, 0x0

    .local v1, "property$iv":Lkotlin/reflect/KProperty;
    const/4 v2, 0x0

    .line 1121
    .local v2, "$i$f$setValue":I
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 1122
    nop

    .line 204
    .end local v0    # "$this$setValue$iv":Landroidx/compose/runtime/MutableState;
    .end local v1    # "property$iv":Lkotlin/reflect/KProperty;
    .end local v2    # "$i$f$setValue":I
    return-void
.end method

.method private final setStartHandlePosition-_kEHs6E(Landroidx/compose/ui/geometry/Offset;)V
    .locals 3
    .param p1, "<set-?>"    # Landroidx/compose/ui/geometry/Offset;

    .line 196
    iget-object v0, p0, Landroidx/compose/foundation/text/selection/SelectionManager;->startHandlePosition$delegate:Landroidx/compose/runtime/MutableState;

    .local v0, "$this$setValue$iv":Landroidx/compose/runtime/MutableState;
    const/4 v1, 0x0

    .local v1, "property$iv":Lkotlin/reflect/KProperty;
    const/4 v2, 0x0

    .line 1118
    .local v2, "$i$f$setValue":I
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 1119
    nop

    .line 196
    .end local v0    # "$this$setValue$iv":Landroidx/compose/runtime/MutableState;
    .end local v1    # "property$iv":Lkotlin/reflect/KProperty;
    .end local v2    # "$i$f$setValue":I
    return-void
.end method

.method private final startSelection-9KIMszo(JZLandroidx/compose/foundation/text/selection/SelectionAdjustment;)V
    .locals 8
    .param p1, "position"    # J
    .param p3, "isStartHandle"    # Z
    .param p4, "adjustment"    # Landroidx/compose/foundation/text/selection/SelectionAdjustment;

    .line 792
    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/compose/foundation/text/selection/SelectionManager;->previousSelectionLayout:Landroidx/compose/foundation/text/selection/SelectionLayout;

    .line 793
    nop

    .line 794
    nop

    .line 795
    sget-object v0, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/geometry/Offset$Companion;->getUnspecified-F1C5BW0()J

    move-result-wide v4

    .line 796
    nop

    .line 797
    nop

    .line 793
    move-object v1, p0

    move-wide v2, p1

    move v6, p3

    move-object v7, p4

    .end local p1    # "position":J
    .end local p3    # "isStartHandle":Z
    .end local p4    # "adjustment":Landroidx/compose/foundation/text/selection/SelectionAdjustment;
    .local v2, "position":J
    .local v6, "isStartHandle":Z
    .local v7, "adjustment":Landroidx/compose/foundation/text/selection/SelectionAdjustment;
    invoke-virtual/range {v1 .. v7}, Landroidx/compose/foundation/text/selection/SelectionManager;->updateSelection-jyLRC_s$foundation_release(JJZLandroidx/compose/foundation/text/selection/SelectionAdjustment;)Z

    .line 799
    return-void
.end method

.method private final toolbarCopy()V
    .locals 0

    .line 584
    invoke-virtual {p0}, Landroidx/compose/foundation/text/selection/SelectionManager;->copy$foundation_release()V

    .line 585
    invoke-virtual {p0}, Landroidx/compose/foundation/text/selection/SelectionManager;->onRelease()V

    .line 586
    return-void
.end method

.method private final updateHandleOffsets()V
    .locals 26

    .line 359
    move-object/from16 v0, p0

    invoke-virtual {v0}, Landroidx/compose/foundation/text/selection/SelectionManager;->getSelection()Landroidx/compose/foundation/text/selection/Selection;

    move-result-object v1

    .line 360
    .local v1, "selection":Landroidx/compose/foundation/text/selection/Selection;
    iget-object v2, v0, Landroidx/compose/foundation/text/selection/SelectionManager;->containerLayoutCoordinates:Landroidx/compose/ui/layout/LayoutCoordinates;

    .line 361
    .local v2, "containerCoordinates":Landroidx/compose/ui/layout/LayoutCoordinates;
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroidx/compose/foundation/text/selection/Selection;->getStart()Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;

    move-result-object v4

    if-eqz v4, :cond_0

    .line 1126
    .local v4, "p0":Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;
    const/4 v5, 0x0

    .line 361
    .local v5, "$i$a$-let-SelectionManager$updateHandleOffsets$startSelectable$1":I
    invoke-virtual {v0, v4}, Landroidx/compose/foundation/text/selection/SelectionManager;->getAnchorSelectable$foundation_release(Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;)Landroidx/compose/foundation/text/selection/Selectable;

    move-result-object v4

    .end local v4    # "p0":Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;
    .end local v5    # "$i$a$-let-SelectionManager$updateHandleOffsets$startSelectable$1":I
    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    .line 362
    .local v4, "startSelectable":Landroidx/compose/foundation/text/selection/Selectable;
    :goto_0
    if-eqz v1, :cond_1

    invoke-virtual {v1}, Landroidx/compose/foundation/text/selection/Selection;->getEnd()Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;

    move-result-object v5

    if-eqz v5, :cond_1

    .line 1126
    .local v5, "p0":Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;
    const/4 v6, 0x0

    .line 362
    .local v6, "$i$a$-let-SelectionManager$updateHandleOffsets$endSelectable$1":I
    invoke-virtual {v0, v5}, Landroidx/compose/foundation/text/selection/SelectionManager;->getAnchorSelectable$foundation_release(Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;)Landroidx/compose/foundation/text/selection/Selectable;

    move-result-object v5

    .end local v5    # "p0":Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;
    .end local v6    # "$i$a$-let-SelectionManager$updateHandleOffsets$endSelectable$1":I
    goto :goto_1

    :cond_1
    const/4 v5, 0x0

    .line 363
    .local v5, "endSelectable":Landroidx/compose/foundation/text/selection/Selectable;
    :goto_1
    if-eqz v4, :cond_2

    invoke-interface {v4}, Landroidx/compose/foundation/text/selection/Selectable;->getLayoutCoordinates()Landroidx/compose/ui/layout/LayoutCoordinates;

    move-result-object v6

    goto :goto_2

    :cond_2
    const/4 v6, 0x0

    .line 364
    .local v6, "startLayoutCoordinates":Landroidx/compose/ui/layout/LayoutCoordinates;
    :goto_2
    if-eqz v5, :cond_3

    invoke-interface {v5}, Landroidx/compose/foundation/text/selection/Selectable;->getLayoutCoordinates()Landroidx/compose/ui/layout/LayoutCoordinates;

    move-result-object v7

    goto :goto_3

    :cond_3
    const/4 v7, 0x0

    .line 366
    .local v7, "endLayoutCoordinates":Landroidx/compose/ui/layout/LayoutCoordinates;
    :goto_3
    nop

    .line 367
    if-eqz v1, :cond_13

    .line 368
    if-eqz v2, :cond_12

    .line 369
    invoke-interface {v2}, Landroidx/compose/ui/layout/LayoutCoordinates;->isAttached()Z

    move-result v8

    if-eqz v8, :cond_11

    .line 370
    if-nez v6, :cond_4

    if-nez v7, :cond_4

    move-object/from16 v19, v1

    move-object/from16 v20, v2

    goto/16 :goto_10

    .line 377
    :cond_4
    invoke-static {v2}, Landroidx/compose/foundation/text/selection/SelectionManagerKt;->visibleBounds(Landroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/ui/geometry/Rect;

    move-result-object v8

    .line 378
    .local v8, "visibleBounds":Landroidx/compose/ui/geometry/Rect;
    nop

    .line 379
    const-wide v9, 0x7fc000007fc00000L    # 2.247117487993712E307

    const-wide v11, 0x7fffffff7fffffffL

    const/4 v13, 0x0

    const/4 v14, 0x1

    if-eqz v6, :cond_a

    move-object v15, v6

    .local v15, "handleCoordinates":Landroidx/compose/ui/layout/LayoutCoordinates;
    const/16 v16, 0x0

    .line 386
    .local v16, "$i$a$-let-SelectionManager$updateHandleOffsets$1":I
    invoke-interface {v4, v1, v14}, Landroidx/compose/foundation/text/selection/Selectable;->getHandlePosition-dBAh8RU(Landroidx/compose/foundation/text/selection/Selection;Z)J

    move-result-wide v17

    .line 385
    move-wide/from16 v19, v17

    .line 387
    .local v19, "handlePosition":J
    nop

    .local v17, "$this$isUnspecified$iv":J
    const/16 v21, 0x0

    .line 1130
    .local v21, "$i$f$isUnspecified-k-4lQ0M":I
    and-long v22, v17, v11

    cmp-long v22, v22, v9

    if-nez v22, :cond_5

    move/from16 v17, v14

    goto :goto_4

    :cond_5
    move/from16 v17, v13

    .line 387
    .end local v17    # "$this$isUnspecified$iv":J
    .end local v21    # "$i$f$isUnspecified-k-4lQ0M":I
    :goto_4
    if-eqz v17, :cond_6

    move-wide/from16 v17, v9

    move-wide/from16 v22, v11

    const/16 v21, 0x0

    goto :goto_8

    .line 389
    :cond_6
    move-wide/from16 v17, v9

    move-wide/from16 v9, v19

    .end local v19    # "handlePosition":J
    .local v9, "handlePosition":J
    invoke-interface {v2, v15, v9, v10}, Landroidx/compose/ui/layout/LayoutCoordinates;->localPositionOf-R5De75A(Landroidx/compose/ui/layout/LayoutCoordinates;J)J

    move-result-wide v19

    .line 388
    nop

    .line 390
    .local v19, "position":J
    invoke-static/range {v19 .. v20}, Landroidx/compose/ui/geometry/Offset;->box-impl(J)Landroidx/compose/ui/geometry/Offset;

    move-result-object v21

    move-wide/from16 v22, v11

    invoke-virtual/range {v21 .. v21}, Landroidx/compose/ui/geometry/Offset;->unbox-impl()J

    move-result-wide v11

    .local v11, "it":J
    const/16 v24, 0x0

    .line 391
    .local v24, "$i$a$-takeIf-SelectionManager$updateHandleOffsets$1$1":I
    invoke-virtual {v0}, Landroidx/compose/foundation/text/selection/SelectionManager;->getDraggingHandle()Landroidx/compose/foundation/text/Handle;

    move-result-object v14

    sget-object v3, Landroidx/compose/foundation/text/Handle;->SelectionStart:Landroidx/compose/foundation/text/Handle;

    if-eq v14, v3, :cond_8

    invoke-static {v8, v11, v12}, Landroidx/compose/foundation/text/selection/SelectionManagerKt;->containsInclusive-Uv8p0NA(Landroidx/compose/ui/geometry/Rect;J)Z

    move-result v3

    if-eqz v3, :cond_7

    goto :goto_5

    :cond_7
    move v3, v13

    goto :goto_6

    :cond_8
    :goto_5
    const/4 v3, 0x1

    .line 390
    .end local v11    # "it":J
    .end local v24    # "$i$a$-takeIf-SelectionManager$updateHandleOffsets$1$1":I
    :goto_6
    if-eqz v3, :cond_9

    goto :goto_7

    :cond_9
    const/16 v21, 0x0

    .line 392
    :goto_7
    nop

    .line 379
    .end local v9    # "handlePosition":J
    .end local v15    # "handleCoordinates":Landroidx/compose/ui/layout/LayoutCoordinates;
    .end local v16    # "$i$a$-let-SelectionManager$updateHandleOffsets$1":I
    .end local v19    # "position":J
    :goto_8
    move-object/from16 v3, v21

    goto :goto_9

    :cond_a
    move-wide/from16 v17, v9

    move-wide/from16 v22, v11

    const/4 v3, 0x0

    .line 378
    :goto_9
    invoke-direct {v0, v3}, Landroidx/compose/foundation/text/selection/SelectionManager;->setStartHandlePosition-_kEHs6E(Landroidx/compose/ui/geometry/Offset;)V

    .line 395
    nop

    .line 396
    if-eqz v7, :cond_10

    move-object v3, v7

    .local v3, "handleCoordinates":Landroidx/compose/ui/layout/LayoutCoordinates;
    const/4 v9, 0x0

    .line 398
    .local v9, "$i$a$-let-SelectionManager$updateHandleOffsets$2":I
    invoke-interface {v5, v1, v13}, Landroidx/compose/foundation/text/selection/Selectable;->getHandlePosition-dBAh8RU(Landroidx/compose/foundation/text/selection/Selection;Z)J

    move-result-wide v10

    .line 397
    nop

    .line 399
    .local v10, "handlePosition":J
    move-wide v14, v10

    .local v14, "$this$isUnspecified$iv":J
    const/4 v12, 0x0

    .line 1131
    .local v12, "$i$f$isUnspecified-k-4lQ0M":I
    and-long v19, v14, v22

    cmp-long v16, v19, v17

    if-nez v16, :cond_b

    const/4 v12, 0x1

    goto :goto_a

    :cond_b
    move v12, v13

    .line 399
    .end local v12    # "$i$f$isUnspecified-k-4lQ0M":I
    .end local v14    # "$this$isUnspecified$iv":J
    :goto_a
    if-eqz v12, :cond_c

    move-object/from16 v19, v1

    move-object/from16 v20, v2

    const/4 v3, 0x0

    goto :goto_e

    .line 401
    :cond_c
    invoke-interface {v2, v3, v10, v11}, Landroidx/compose/ui/layout/LayoutCoordinates;->localPositionOf-R5De75A(Landroidx/compose/ui/layout/LayoutCoordinates;J)J

    move-result-wide v14

    .line 400
    nop

    .line 402
    .local v14, "position":J
    invoke-static {v14, v15}, Landroidx/compose/ui/geometry/Offset;->box-impl(J)Landroidx/compose/ui/geometry/Offset;

    move-result-object v12

    move-wide/from16 v17, v14

    .end local v14    # "position":J
    .local v17, "position":J
    invoke-virtual {v12}, Landroidx/compose/ui/geometry/Offset;->unbox-impl()J

    move-result-wide v13

    .local v13, "it":J
    const/4 v15, 0x0

    .line 403
    .local v15, "$i$a$-takeIf-SelectionManager$updateHandleOffsets$2$1":I
    move-object/from16 v19, v1

    .end local v1    # "selection":Landroidx/compose/foundation/text/selection/Selection;
    .local v19, "selection":Landroidx/compose/foundation/text/selection/Selection;
    invoke-virtual {v0}, Landroidx/compose/foundation/text/selection/SelectionManager;->getDraggingHandle()Landroidx/compose/foundation/text/Handle;

    move-result-object v1

    move-object/from16 v20, v2

    .end local v2    # "containerCoordinates":Landroidx/compose/ui/layout/LayoutCoordinates;
    .local v20, "containerCoordinates":Landroidx/compose/ui/layout/LayoutCoordinates;
    sget-object v2, Landroidx/compose/foundation/text/Handle;->SelectionEnd:Landroidx/compose/foundation/text/Handle;

    if-eq v1, v2, :cond_e

    invoke-static {v8, v13, v14}, Landroidx/compose/foundation/text/selection/SelectionManagerKt;->containsInclusive-Uv8p0NA(Landroidx/compose/ui/geometry/Rect;J)Z

    move-result v1

    if-eqz v1, :cond_d

    goto :goto_b

    :cond_d
    const/4 v13, 0x0

    goto :goto_c

    :cond_e
    :goto_b
    const/4 v13, 0x1

    .line 402
    .end local v13    # "it":J
    .end local v15    # "$i$a$-takeIf-SelectionManager$updateHandleOffsets$2$1":I
    :goto_c
    if-eqz v13, :cond_f

    move-object/from16 v25, v12

    goto :goto_d

    :cond_f
    const/16 v25, 0x0

    .line 404
    :goto_d
    move-object/from16 v3, v25

    .line 396
    .end local v3    # "handleCoordinates":Landroidx/compose/ui/layout/LayoutCoordinates;
    .end local v9    # "$i$a$-let-SelectionManager$updateHandleOffsets$2":I
    .end local v10    # "handlePosition":J
    .end local v17    # "position":J
    :goto_e
    goto :goto_f

    .end local v19    # "selection":Landroidx/compose/foundation/text/selection/Selection;
    .end local v20    # "containerCoordinates":Landroidx/compose/ui/layout/LayoutCoordinates;
    .restart local v1    # "selection":Landroidx/compose/foundation/text/selection/Selection;
    .restart local v2    # "containerCoordinates":Landroidx/compose/ui/layout/LayoutCoordinates;
    :cond_10
    move-object/from16 v19, v1

    move-object/from16 v20, v2

    .end local v1    # "selection":Landroidx/compose/foundation/text/selection/Selection;
    .end local v2    # "containerCoordinates":Landroidx/compose/ui/layout/LayoutCoordinates;
    .restart local v19    # "selection":Landroidx/compose/foundation/text/selection/Selection;
    .restart local v20    # "containerCoordinates":Landroidx/compose/ui/layout/LayoutCoordinates;
    const/4 v3, 0x0

    .line 395
    :goto_f
    invoke-direct {v0, v3}, Landroidx/compose/foundation/text/selection/SelectionManager;->setEndHandlePosition-_kEHs6E(Landroidx/compose/ui/geometry/Offset;)V

    .line 406
    return-void

    .line 369
    .end local v8    # "visibleBounds":Landroidx/compose/ui/geometry/Rect;
    .end local v19    # "selection":Landroidx/compose/foundation/text/selection/Selection;
    .end local v20    # "containerCoordinates":Landroidx/compose/ui/layout/LayoutCoordinates;
    .restart local v1    # "selection":Landroidx/compose/foundation/text/selection/Selection;
    .restart local v2    # "containerCoordinates":Landroidx/compose/ui/layout/LayoutCoordinates;
    :cond_11
    move-object/from16 v19, v1

    move-object/from16 v20, v2

    .end local v1    # "selection":Landroidx/compose/foundation/text/selection/Selection;
    .end local v2    # "containerCoordinates":Landroidx/compose/ui/layout/LayoutCoordinates;
    .restart local v19    # "selection":Landroidx/compose/foundation/text/selection/Selection;
    .restart local v20    # "containerCoordinates":Landroidx/compose/ui/layout/LayoutCoordinates;
    goto :goto_10

    .line 368
    .end local v19    # "selection":Landroidx/compose/foundation/text/selection/Selection;
    .end local v20    # "containerCoordinates":Landroidx/compose/ui/layout/LayoutCoordinates;
    .restart local v1    # "selection":Landroidx/compose/foundation/text/selection/Selection;
    .restart local v2    # "containerCoordinates":Landroidx/compose/ui/layout/LayoutCoordinates;
    :cond_12
    move-object/from16 v19, v1

    move-object/from16 v20, v2

    .end local v1    # "selection":Landroidx/compose/foundation/text/selection/Selection;
    .end local v2    # "containerCoordinates":Landroidx/compose/ui/layout/LayoutCoordinates;
    .restart local v19    # "selection":Landroidx/compose/foundation/text/selection/Selection;
    .restart local v20    # "containerCoordinates":Landroidx/compose/ui/layout/LayoutCoordinates;
    goto :goto_10

    .line 367
    .end local v19    # "selection":Landroidx/compose/foundation/text/selection/Selection;
    .end local v20    # "containerCoordinates":Landroidx/compose/ui/layout/LayoutCoordinates;
    .restart local v1    # "selection":Landroidx/compose/foundation/text/selection/Selection;
    .restart local v2    # "containerCoordinates":Landroidx/compose/ui/layout/LayoutCoordinates;
    :cond_13
    move-object/from16 v19, v1

    move-object/from16 v20, v2

    .line 372
    .end local v1    # "selection":Landroidx/compose/foundation/text/selection/Selection;
    .end local v2    # "containerCoordinates":Landroidx/compose/ui/layout/LayoutCoordinates;
    .restart local v19    # "selection":Landroidx/compose/foundation/text/selection/Selection;
    .restart local v20    # "containerCoordinates":Landroidx/compose/ui/layout/LayoutCoordinates;
    :goto_10
    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/compose/foundation/text/selection/SelectionManager;->setStartHandlePosition-_kEHs6E(Landroidx/compose/ui/geometry/Offset;)V

    .line 373
    invoke-direct {v0, v1}, Landroidx/compose/foundation/text/selection/SelectionManager;->setEndHandlePosition-_kEHs6E(Landroidx/compose/ui/geometry/Offset;)V

    .line 374
    return-void
.end method

.method private final updateSelectionToolbar()V
    .locals 10

    .line 589
    invoke-virtual {p0}, Landroidx/compose/foundation/text/selection/SelectionManager;->getHasFocus()Z

    move-result v0

    if-nez v0, :cond_0

    .line 590
    return-void

    .line 593
    :cond_0
    iget-object v0, p0, Landroidx/compose/foundation/text/selection/SelectionManager;->textToolbar:Landroidx/compose/ui/platform/TextToolbar;

    if-nez v0, :cond_1

    return-void

    :cond_1
    move-object v1, v0

    .line 594
    .local v1, "textToolbar":Landroidx/compose/ui/platform/TextToolbar;
    iget-boolean v0, p0, Landroidx/compose/foundation/text/selection/SelectionManager;->showToolbar:Z

    if-eqz v0, :cond_5

    invoke-virtual {p0}, Landroidx/compose/foundation/text/selection/SelectionManager;->isInTouchMode()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 595
    invoke-direct {p0}, Landroidx/compose/foundation/text/selection/SelectionManager;->getContentRect()Landroidx/compose/ui/geometry/Rect;

    move-result-object v2

    if-nez v2, :cond_2

    return-void

    .line 596
    .local v2, "rect":Landroidx/compose/ui/geometry/Rect;
    :cond_2
    nop

    .line 597
    nop

    .line 598
    invoke-virtual {p0}, Landroidx/compose/foundation/text/selection/SelectionManager;->isNonEmptySelection$foundation_release()Z

    move-result v0

    const/4 v3, 0x0

    if-eqz v0, :cond_3

    new-instance v0, Landroidx/compose/foundation/text/selection/SelectionManager$updateSelectionToolbar$1;

    invoke-direct {v0, p0}, Landroidx/compose/foundation/text/selection/SelectionManager$updateSelectionToolbar$1;-><init>(Ljava/lang/Object;)V

    check-cast v0, Lkotlin/reflect/KFunction;

    goto :goto_0

    :cond_3
    move-object v0, v3

    :goto_0
    check-cast v0, Lkotlin/jvm/functions/Function0;

    .line 596
    nop

    .line 599
    invoke-virtual {p0}, Landroidx/compose/foundation/text/selection/SelectionManager;->isEntireContainerSelected$foundation_release()Z

    move-result v4

    if-eqz v4, :cond_4

    goto :goto_1

    :cond_4
    new-instance v3, Landroidx/compose/foundation/text/selection/SelectionManager$updateSelectionToolbar$2;

    invoke-direct {v3, p0}, Landroidx/compose/foundation/text/selection/SelectionManager$updateSelectionToolbar$2;-><init>(Ljava/lang/Object;)V

    check-cast v3, Lkotlin/reflect/KFunction;

    :goto_1
    move-object v6, v3

    check-cast v6, Lkotlin/jvm/functions/Function0;

    .line 600
    nop

    .line 596
    const/16 v8, 0xc

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    move-object v3, v0

    invoke-static/range {v1 .. v9}, Landroidx/compose/ui/platform/TextToolbar;->showMenu$default(Landroidx/compose/ui/platform/TextToolbar;Landroidx/compose/ui/geometry/Rect;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .end local v2    # "rect":Landroidx/compose/ui/geometry/Rect;
    goto :goto_2

    .line 602
    :cond_5
    invoke-interface {v1}, Landroidx/compose/ui/platform/TextToolbar;->getStatus()Landroidx/compose/ui/platform/TextToolbarStatus;

    move-result-object v0

    sget-object v2, Landroidx/compose/ui/platform/TextToolbarStatus;->Shown:Landroidx/compose/ui/platform/TextToolbarStatus;

    if-ne v0, v2, :cond_6

    .line 603
    invoke-interface {v1}, Landroidx/compose/ui/platform/TextToolbar;->hide()V

    .line 605
    :cond_6
    :goto_2
    return-void
.end method


# virtual methods
.method public final copy$foundation_release()V
    .locals 4

    .line 569
    nop

    .line 570
    nop

    .line 568
    invoke-virtual {p0}, Landroidx/compose/foundation/text/selection/SelectionManager;->getSelectedText$foundation_release()Landroidx/compose/ui/text/AnnotatedString;

    move-result-object v0

    .line 569
    if-eqz v0, :cond_2

    .line 568
    nop

    .line 569
    move-object v1, v0

    .line 1126
    .local v1, "it":Landroidx/compose/ui/text/AnnotatedString;
    const/4 v2, 0x0

    .line 569
    .local v2, "$i$a$-takeIf-SelectionManager$copy$1":I
    move-object v3, v1

    check-cast v3, Ljava/lang/CharSequence;

    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-lez v3, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    .end local v1    # "it":Landroidx/compose/ui/text/AnnotatedString;
    .end local v2    # "$i$a$-takeIf-SelectionManager$copy$1":I
    :goto_0
    if-eqz v3, :cond_1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    .line 570
    :goto_1
    if-eqz v0, :cond_2

    .line 569
    nop

    .line 570
    nop

    .line 1126
    .local v0, "textToCopy":Landroidx/compose/ui/text/AnnotatedString;
    const/4 v1, 0x0

    .line 570
    .local v1, "$i$a$-let-SelectionManager$copy$2":I
    iget-object v2, p0, Landroidx/compose/foundation/text/selection/SelectionManager;->onCopyHandler:Lkotlin/jvm/functions/Function1;

    if-eqz v2, :cond_3

    invoke-interface {v2, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    .line 569
    .end local v0    # "textToCopy":Landroidx/compose/ui/text/AnnotatedString;
    .end local v1    # "$i$a$-let-SelectionManager$copy$2":I
    :cond_2
    nop

    .line 571
    :cond_3
    :goto_2
    return-void
.end method

.method public final getAnchorSelectable$foundation_release(Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;)Landroidx/compose/foundation/text/selection/Selectable;
    .locals 3
    .param p1, "anchor"    # Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;

    .line 355
    iget-object v0, p0, Landroidx/compose/foundation/text/selection/SelectionManager;->selectionRegistrar:Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;

    invoke-virtual {v0}, Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;->getSelectableMap$foundation_release()Landroidx/collection/LongObjectMap;

    move-result-object v0

    invoke-virtual {p1}, Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;->getSelectableId()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Landroidx/collection/LongObjectMap;->get(J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/foundation/text/selection/Selectable;

    return-object v0
.end method

.method public final getContainerLayoutCoordinates()Landroidx/compose/ui/layout/LayoutCoordinates;
    .locals 1

    .line 164
    iget-object v0, p0, Landroidx/compose/foundation/text/selection/SelectionManager;->containerLayoutCoordinates:Landroidx/compose/ui/layout/LayoutCoordinates;

    return-object v0
.end method

.method public final getCurrentDragPosition-_m7T9-E()Landroidx/compose/ui/geometry/Offset;
    .locals 3

    .line 234
    iget-object v0, p0, Landroidx/compose/foundation/text/selection/SelectionManager;->currentDragPosition$delegate:Landroidx/compose/runtime/MutableState;

    check-cast v0, Landroidx/compose/runtime/State;

    .local v0, "$this$getValue$iv":Landroidx/compose/runtime/State;
    const/4 v1, 0x0

    .local v1, "property$iv":Lkotlin/reflect/KProperty;
    const/4 v2, 0x0

    .line 1127
    .local v2, "$i$f$getValue":I
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    .end local v0    # "$this$getValue$iv":Landroidx/compose/runtime/State;
    .end local v1    # "property$iv":Lkotlin/reflect/KProperty;
    .end local v2    # "$i$f$getValue":I
    check-cast v0, Landroidx/compose/ui/geometry/Offset;

    .line 234
    return-object v0
.end method

.method public final getDragBeginPosition-F1C5BW0$foundation_release()J
    .locals 3

    .line 181
    iget-object v0, p0, Landroidx/compose/foundation/text/selection/SelectionManager;->dragBeginPosition$delegate:Landroidx/compose/runtime/MutableState;

    check-cast v0, Landroidx/compose/runtime/State;

    .local v0, "$this$getValue$iv":Landroidx/compose/runtime/State;
    const/4 v1, 0x0

    .local v1, "property$iv":Lkotlin/reflect/KProperty;
    const/4 v2, 0x0

    .line 1111
    .local v2, "$i$f$getValue":I
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    .end local v0    # "$this$getValue$iv":Landroidx/compose/runtime/State;
    .end local v1    # "property$iv":Lkotlin/reflect/KProperty;
    .end local v2    # "$i$f$getValue":I
    check-cast v0, Landroidx/compose/ui/geometry/Offset;

    invoke-virtual {v0}, Landroidx/compose/ui/geometry/Offset;->unbox-impl()J

    move-result-wide v0

    .line 181
    return-wide v0
.end method

.method public final getDragTotalDistance-F1C5BW0$foundation_release()J
    .locals 3

    .line 188
    iget-object v0, p0, Landroidx/compose/foundation/text/selection/SelectionManager;->dragTotalDistance$delegate:Landroidx/compose/runtime/MutableState;

    check-cast v0, Landroidx/compose/runtime/State;

    .local v0, "$this$getValue$iv":Landroidx/compose/runtime/State;
    const/4 v1, 0x0

    .local v1, "property$iv":Lkotlin/reflect/KProperty;
    const/4 v2, 0x0

    .line 1114
    .local v2, "$i$f$getValue":I
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    .end local v0    # "$this$getValue$iv":Landroidx/compose/runtime/State;
    .end local v1    # "property$iv":Lkotlin/reflect/KProperty;
    .end local v2    # "$i$f$getValue":I
    check-cast v0, Landroidx/compose/ui/geometry/Offset;

    invoke-virtual {v0}, Landroidx/compose/ui/geometry/Offset;->unbox-impl()J

    move-result-wide v0

    .line 188
    return-wide v0
.end method

.method public final getDraggingHandle()Landroidx/compose/foundation/text/Handle;
    .locals 3

    .line 211
    iget-object v0, p0, Landroidx/compose/foundation/text/selection/SelectionManager;->draggingHandle$delegate:Landroidx/compose/runtime/MutableState;

    check-cast v0, Landroidx/compose/runtime/State;

    .local v0, "$this$getValue$iv":Landroidx/compose/runtime/State;
    const/4 v1, 0x0

    .local v1, "property$iv":Lkotlin/reflect/KProperty;
    const/4 v2, 0x0

    .line 1123
    .local v2, "$i$f$getValue":I
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    .end local v0    # "$this$getValue$iv":Landroidx/compose/runtime/State;
    .end local v1    # "property$iv":Lkotlin/reflect/KProperty;
    .end local v2    # "$i$f$getValue":I
    check-cast v0, Landroidx/compose/foundation/text/Handle;

    .line 211
    return-object v0
.end method

.method public final getEndHandleLineHeight()F
    .locals 4

    .line 225
    invoke-virtual {p0}, Landroidx/compose/foundation/text/selection/SelectionManager;->getSelection()Landroidx/compose/foundation/text/selection/Selection;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 226
    .local v0, "selection":Landroidx/compose/foundation/text/selection/Selection;
    :cond_0
    invoke-virtual {v0}, Landroidx/compose/foundation/text/selection/Selection;->getEnd()Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;

    move-result-object v2

    .line 1126
    .local v2, "p0":Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;
    const/4 v3, 0x0

    .line 226
    .local v3, "$i$a$-let-SelectionManager$endHandleLineHeight$selectable$1":I
    invoke-virtual {p0, v2}, Landroidx/compose/foundation/text/selection/SelectionManager;->getAnchorSelectable$foundation_release(Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;)Landroidx/compose/foundation/text/selection/Selectable;

    move-result-object v2

    .end local v2    # "p0":Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;
    .end local v3    # "$i$a$-let-SelectionManager$endHandleLineHeight$selectable$1":I
    if-nez v2, :cond_1

    return v1

    .line 227
    .local v2, "selectable":Landroidx/compose/foundation/text/selection/Selectable;
    :cond_1
    invoke-virtual {v0}, Landroidx/compose/foundation/text/selection/Selection;->getEnd()Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;->getOffset()I

    move-result v1

    invoke-interface {v2, v1}, Landroidx/compose/foundation/text/selection/Selectable;->getLineHeight(I)F

    move-result v1

    return v1
.end method

.method public final getEndHandlePosition-_m7T9-E()Landroidx/compose/ui/geometry/Offset;
    .locals 3

    .line 204
    iget-object v0, p0, Landroidx/compose/foundation/text/selection/SelectionManager;->endHandlePosition$delegate:Landroidx/compose/runtime/MutableState;

    check-cast v0, Landroidx/compose/runtime/State;

    .local v0, "$this$getValue$iv":Landroidx/compose/runtime/State;
    const/4 v1, 0x0

    .local v1, "property$iv":Lkotlin/reflect/KProperty;
    const/4 v2, 0x0

    .line 1120
    .local v2, "$i$f$getValue":I
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    .end local v0    # "$this$getValue$iv":Landroidx/compose/runtime/State;
    .end local v1    # "property$iv":Lkotlin/reflect/KProperty;
    .end local v2    # "$i$f$getValue":I
    check-cast v0, Landroidx/compose/ui/geometry/Offset;

    .line 204
    return-object v0
.end method

.method public final getFocusRequester()Landroidx/compose/ui/focus/FocusRequester;
    .locals 1

    .line 128
    iget-object v0, p0, Landroidx/compose/foundation/text/selection/SelectionManager;->focusRequester:Landroidx/compose/ui/focus/FocusRequester;

    return-object v0
.end method

.method public final getHapticFeedBack()Landroidx/compose/ui/hapticfeedback/HapticFeedback;
    .locals 1

    .line 119
    iget-object v0, p0, Landroidx/compose/foundation/text/selection/SelectionManager;->hapticFeedBack:Landroidx/compose/ui/hapticfeedback/HapticFeedback;

    return-object v0
.end method

.method public final getHasFocus()Z
    .locals 3

    .line 131
    iget-object v0, p0, Landroidx/compose/foundation/text/selection/SelectionManager;->hasFocus$delegate:Landroidx/compose/runtime/MutableState;

    check-cast v0, Landroidx/compose/runtime/State;

    .local v0, "$this$getValue$iv":Landroidx/compose/runtime/State;
    const/4 v1, 0x0

    .local v1, "property$iv":Lkotlin/reflect/KProperty;
    const/4 v2, 0x0

    .line 1108
    .local v2, "$i$f$getValue":I
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    .end local v0    # "$this$getValue$iv":Landroidx/compose/runtime/State;
    .end local v1    # "property$iv":Lkotlin/reflect/KProperty;
    .end local v2    # "$i$f$getValue":I
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 131
    return v0
.end method

.method public final getModifier()Landroidx/compose/ui/Modifier;
    .locals 4

    .line 140
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v0, Landroidx/compose/ui/Modifier;

    new-instance v1, Landroidx/compose/foundation/text/selection/SelectionManager$modifier$1;

    invoke-direct {v1, p0}, Landroidx/compose/foundation/text/selection/SelectionManager$modifier$1;-><init>(Landroidx/compose/foundation/text/selection/SelectionManager;)V

    check-cast v1, Lkotlin/jvm/functions/Function0;

    invoke-direct {p0, v0, v1}, Landroidx/compose/foundation/text/selection/SelectionManager;->onClearSelectionRequested(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    .line 141
    new-instance v1, Landroidx/compose/foundation/text/selection/SelectionManager$modifier$2;

    invoke-direct {v1, p0}, Landroidx/compose/foundation/text/selection/SelectionManager$modifier$2;-><init>(Landroidx/compose/foundation/text/selection/SelectionManager;)V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Landroidx/compose/ui/layout/OnGloballyPositionedModifierKt;->onGloballyPositioned(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    .line 142
    iget-object v1, p0, Landroidx/compose/foundation/text/selection/SelectionManager;->focusRequester:Landroidx/compose/ui/focus/FocusRequester;

    invoke-static {v0, v1}, Landroidx/compose/ui/focus/FocusRequesterModifierKt;->focusRequester(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/focus/FocusRequester;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    .line 143
    new-instance v1, Landroidx/compose/foundation/text/selection/SelectionManager$modifier$3;

    invoke-direct {v1, p0}, Landroidx/compose/foundation/text/selection/SelectionManager$modifier$3;-><init>(Landroidx/compose/foundation/text/selection/SelectionManager;)V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Landroidx/compose/ui/focus/FocusChangedModifierKt;->onFocusChanged(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    .line 149
    const/4 v1, 0x0

    const/4 v2, 0x3

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2, v1}, Landroidx/compose/foundation/FocusableKt;->focusable$default(Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    .line 150
    new-instance v1, Landroidx/compose/foundation/text/selection/SelectionManager$modifier$4;

    invoke-direct {v1, p0}, Landroidx/compose/foundation/text/selection/SelectionManager$modifier$4;-><init>(Landroidx/compose/foundation/text/selection/SelectionManager;)V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Landroidx/compose/foundation/text/selection/SelectionGesturesKt;->updateSelectionTouchMode(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    .line 151
    new-instance v1, Landroidx/compose/foundation/text/selection/SelectionManager$modifier$5;

    invoke-direct {v1, p0}, Landroidx/compose/foundation/text/selection/SelectionManager$modifier$5;-><init>(Landroidx/compose/foundation/text/selection/SelectionManager;)V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Landroidx/compose/ui/input/key/KeyInputModifierKt;->onKeyEvent(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    .line 159
    invoke-direct {p0}, Landroidx/compose/foundation/text/selection/SelectionManager;->getShouldShowMagnifier()Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v1, Landroidx/compose/ui/Modifier;

    invoke-static {v1, p0}, Landroidx/compose/foundation/text/selection/SelectionManager_androidKt;->selectionMagnifier(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/text/selection/SelectionManager;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    goto :goto_0

    :cond_0
    sget-object v1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v1, Landroidx/compose/ui/Modifier;

    :goto_0
    invoke-interface {v0, v1}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    return-object v0
.end method

.method public final getOnCopyHandler()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Landroidx/compose/ui/text/AnnotatedString;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .line 122
    iget-object v0, p0, Landroidx/compose/foundation/text/selection/SelectionManager;->onCopyHandler:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public final getOnSelectionChange()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Landroidx/compose/foundation/text/selection/Selection;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .line 104
    iget-object v0, p0, Landroidx/compose/foundation/text/selection/SelectionManager;->onSelectionChange:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public final getPreviousSelectionLayout$foundation_release()Landroidx/compose/foundation/text/selection/SelectionLayout;
    .locals 1

    .line 240
    iget-object v0, p0, Landroidx/compose/foundation/text/selection/SelectionManager;->previousSelectionLayout:Landroidx/compose/foundation/text/selection/SelectionLayout;

    return-object v0
.end method

.method public final getSelectedText$foundation_release()Landroidx/compose/ui/text/AnnotatedString;
    .locals 17

    .line 540
    move-object/from16 v0, p0

    invoke-virtual {v0}, Landroidx/compose/foundation/text/selection/SelectionManager;->getSelection()Landroidx/compose/foundation/text/selection/Selection;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_4

    iget-object v1, v0, Landroidx/compose/foundation/text/selection/SelectionManager;->selectionRegistrar:Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;

    invoke-virtual {v1}, Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;->getSubselections()Landroidx/collection/LongObjectMap;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/collection/LongObjectMap;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_2

    .line 544
    :cond_0
    const/4 v1, 0x0

    .line 1178
    .local v1, "$i$f$buildAnnotatedString":I
    new-instance v3, Landroidx/compose/ui/text/AnnotatedString$Builder;

    const/4 v4, 0x0

    const/4 v5, 0x1

    invoke-direct {v3, v4, v5, v2}, Landroidx/compose/ui/text/AnnotatedString$Builder;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v2, v3

    .local v2, "$this$getSelectedText_u24lambda_u2418":Landroidx/compose/ui/text/AnnotatedString$Builder;
    const/4 v4, 0x0

    .line 545
    .local v4, "$i$a$-buildAnnotatedString-SelectionManager$getSelectedText$1":I
    iget-object v5, v0, Landroidx/compose/foundation/text/selection/SelectionManager;->selectionRegistrar:Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;

    invoke-virtual {v0}, Landroidx/compose/foundation/text/selection/SelectionManager;->requireContainerCoordinates$foundation_release()Landroidx/compose/ui/layout/LayoutCoordinates;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;->sort(Landroidx/compose/ui/layout/LayoutCoordinates;)Ljava/util/List;

    move-result-object v5

    .local v5, "$this$fastForEach$iv":Ljava/util/List;
    const/4 v6, 0x0

    .line 1179
    .local v6, "$i$f$fastForEach":I
    nop

    .line 1180
    const/4 v7, 0x0

    .local v7, "index$iv":I
    move-object v8, v5

    check-cast v8, Ljava/util/Collection;

    invoke-interface {v8}, Ljava/util/Collection;->size()I

    move-result v8

    :goto_0
    if-ge v7, v8, :cond_3

    .line 1181
    invoke-interface {v5, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    .line 1182
    .local v9, "item$iv":Ljava/lang/Object;
    move-object v10, v9

    check-cast v10, Landroidx/compose/foundation/text/selection/Selectable;

    .local v10, "selectable":Landroidx/compose/foundation/text/selection/Selectable;
    const/4 v11, 0x0

    .line 546
    .local v11, "$i$a$-fastForEach-SelectionManager$getSelectedText$1$1":I
    iget-object v12, v0, Landroidx/compose/foundation/text/selection/SelectionManager;->selectionRegistrar:Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;

    invoke-virtual {v12}, Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;->getSubselections()Landroidx/collection/LongObjectMap;

    move-result-object v12

    invoke-interface {v10}, Landroidx/compose/foundation/text/selection/Selectable;->getSelectableId()J

    move-result-wide v13

    invoke-virtual {v12, v13, v14}, Landroidx/collection/LongObjectMap;->get(J)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Landroidx/compose/foundation/text/selection/Selection;

    if-eqz v12, :cond_2

    .local v12, "subSelection":Landroidx/compose/foundation/text/selection/Selection;
    const/4 v13, 0x0

    .line 547
    .local v13, "$i$a$-let-SelectionManager$getSelectedText$1$1$1":I
    invoke-interface {v10}, Landroidx/compose/foundation/text/selection/Selectable;->getText()Landroidx/compose/ui/text/AnnotatedString;

    move-result-object v14

    .line 549
    .local v14, "currentText":Landroidx/compose/ui/text/AnnotatedString;
    invoke-virtual {v12}, Landroidx/compose/foundation/text/selection/Selection;->getHandlesCrossed()Z

    move-result v15

    if-eqz v15, :cond_1

    .line 550
    nop

    .line 551
    invoke-virtual {v12}, Landroidx/compose/foundation/text/selection/Selection;->getEnd()Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;

    move-result-object v15

    invoke-virtual {v15}, Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;->getOffset()I

    move-result v15

    .line 552
    invoke-virtual {v12}, Landroidx/compose/foundation/text/selection/Selection;->getStart()Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;->getOffset()I

    move-result v0

    .line 550
    invoke-virtual {v14, v15, v0}, Landroidx/compose/ui/text/AnnotatedString;->subSequence(II)Landroidx/compose/ui/text/AnnotatedString;

    move-result-object v0

    goto :goto_1

    .line 555
    :cond_1
    nop

    .line 556
    invoke-virtual {v12}, Landroidx/compose/foundation/text/selection/Selection;->getStart()Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;->getOffset()I

    move-result v0

    .line 557
    invoke-virtual {v12}, Landroidx/compose/foundation/text/selection/Selection;->getEnd()Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;

    move-result-object v15

    invoke-virtual {v15}, Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;->getOffset()I

    move-result v15

    .line 555
    invoke-virtual {v14, v0, v15}, Landroidx/compose/ui/text/AnnotatedString;->subSequence(II)Landroidx/compose/ui/text/AnnotatedString;

    move-result-object v0

    .line 549
    :goto_1
    nop

    .line 548
    nop

    .line 561
    .local v0, "currentSelectedText":Landroidx/compose/ui/text/AnnotatedString;
    invoke-virtual {v2, v0}, Landroidx/compose/ui/text/AnnotatedString$Builder;->append(Landroidx/compose/ui/text/AnnotatedString;)V

    .line 562
    nop

    .line 546
    .end local v0    # "currentSelectedText":Landroidx/compose/ui/text/AnnotatedString;
    .end local v12    # "subSelection":Landroidx/compose/foundation/text/selection/Selection;
    .end local v13    # "$i$a$-let-SelectionManager$getSelectedText$1$1$1":I
    .end local v14    # "currentText":Landroidx/compose/ui/text/AnnotatedString;
    nop

    .line 563
    :cond_2
    nop

    .line 1182
    .end local v10    # "selectable":Landroidx/compose/foundation/text/selection/Selectable;
    .end local v11    # "$i$a$-fastForEach-SelectionManager$getSelectedText$1$1":I
    nop

    .line 1180
    .end local v9    # "item$iv":Ljava/lang/Object;
    add-int/lit8 v7, v7, 0x1

    move-object/from16 v0, p0

    goto :goto_0

    .line 1184
    .end local v7    # "index$iv":I
    :cond_3
    nop

    .line 564
    .end local v5    # "$this$fastForEach$iv":Ljava/util/List;
    .end local v6    # "$i$f$fastForEach":I
    nop

    .line 1178
    .end local v2    # "$this$getSelectedText_u24lambda_u2418":Landroidx/compose/ui/text/AnnotatedString$Builder;
    .end local v4    # "$i$a$-buildAnnotatedString-SelectionManager$getSelectedText$1":I
    invoke-virtual {v3}, Landroidx/compose/ui/text/AnnotatedString$Builder;->toAnnotatedString()Landroidx/compose/ui/text/AnnotatedString;

    move-result-object v0

    .line 544
    .end local v1    # "$i$f$buildAnnotatedString":I
    return-object v0

    .line 541
    :cond_4
    :goto_2
    return-object v2
.end method

.method public final getSelection()Landroidx/compose/foundation/text/selection/Selection;
    .locals 1

    .line 80
    iget-object v0, p0, Landroidx/compose/foundation/text/selection/SelectionManager;->_selection:Landroidx/compose/runtime/MutableState;

    invoke-interface {v0}, Landroidx/compose/runtime/MutableState;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/foundation/text/selection/Selection;

    return-object v0
.end method

.method public final getShowToolbar$foundation_release()Z
    .locals 1

    .line 577
    iget-boolean v0, p0, Landroidx/compose/foundation/text/selection/SelectionManager;->showToolbar:Z

    return v0
.end method

.method public final getStartHandleLineHeight()F
    .locals 4

    .line 217
    invoke-virtual {p0}, Landroidx/compose/foundation/text/selection/SelectionManager;->getSelection()Landroidx/compose/foundation/text/selection/Selection;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 218
    .local v0, "selection":Landroidx/compose/foundation/text/selection/Selection;
    :cond_0
    invoke-virtual {v0}, Landroidx/compose/foundation/text/selection/Selection;->getStart()Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;

    move-result-object v2

    .line 1126
    .local v2, "p0":Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;
    const/4 v3, 0x0

    .line 218
    .local v3, "$i$a$-let-SelectionManager$startHandleLineHeight$selectable$1":I
    invoke-virtual {p0, v2}, Landroidx/compose/foundation/text/selection/SelectionManager;->getAnchorSelectable$foundation_release(Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;)Landroidx/compose/foundation/text/selection/Selectable;

    move-result-object v2

    .end local v2    # "p0":Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;
    .end local v3    # "$i$a$-let-SelectionManager$startHandleLineHeight$selectable$1":I
    if-nez v2, :cond_1

    return v1

    .line 219
    .local v2, "selectable":Landroidx/compose/foundation/text/selection/Selectable;
    :cond_1
    invoke-virtual {v0}, Landroidx/compose/foundation/text/selection/Selection;->getStart()Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;->getOffset()I

    move-result v1

    invoke-interface {v2, v1}, Landroidx/compose/foundation/text/selection/Selectable;->getLineHeight(I)F

    move-result v1

    return v1
.end method

.method public final getStartHandlePosition-_m7T9-E()Landroidx/compose/ui/geometry/Offset;
    .locals 3

    .line 196
    iget-object v0, p0, Landroidx/compose/foundation/text/selection/SelectionManager;->startHandlePosition$delegate:Landroidx/compose/runtime/MutableState;

    check-cast v0, Landroidx/compose/runtime/State;

    .local v0, "$this$getValue$iv":Landroidx/compose/runtime/State;
    const/4 v1, 0x0

    .local v1, "property$iv":Lkotlin/reflect/KProperty;
    const/4 v2, 0x0

    .line 1117
    .local v2, "$i$f$getValue":I
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    .end local v0    # "$this$getValue$iv":Landroidx/compose/runtime/State;
    .end local v1    # "property$iv":Lkotlin/reflect/KProperty;
    .end local v2    # "$i$f$getValue":I
    check-cast v0, Landroidx/compose/ui/geometry/Offset;

    .line 196
    return-object v0
.end method

.method public final getTextToolbar()Landroidx/compose/ui/platform/TextToolbar;
    .locals 1

    .line 125
    iget-object v0, p0, Landroidx/compose/foundation/text/selection/SelectionManager;->textToolbar:Landroidx/compose/ui/platform/TextToolbar;

    return-object v0
.end method

.method public final handleDragObserver(Z)Landroidx/compose/foundation/text/TextDragObserver;
    .locals 1
    .param p1, "isStartHandle"    # Z

    .line 653
    new-instance v0, Landroidx/compose/foundation/text/selection/SelectionManager$handleDragObserver$1;

    invoke-direct {v0, p1, p0}, Landroidx/compose/foundation/text/selection/SelectionManager$handleDragObserver$1;-><init>(ZLandroidx/compose/foundation/text/selection/SelectionManager;)V

    check-cast v0, Landroidx/compose/foundation/text/TextDragObserver;

    .line 746
    return-object v0
.end method

.method public final isEntireContainerSelected$foundation_release()Z
    .locals 19

    .line 439
    move-object/from16 v0, p0

    iget-object v1, v0, Landroidx/compose/foundation/text/selection/SelectionManager;->selectionRegistrar:Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;

    invoke-virtual {v0}, Landroidx/compose/foundation/text/selection/SelectionManager;->requireContainerCoordinates$foundation_release()Landroidx/compose/ui/layout/LayoutCoordinates;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;->sort(Landroidx/compose/ui/layout/LayoutCoordinates;)Ljava/util/List;

    move-result-object v1

    .line 442
    .local v1, "selectables":Ljava/util/List;
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_0

    return v3

    .line 445
    :cond_0
    move-object v2, v1

    .local v2, "$this$fastAll$iv":Ljava/util/List;
    const/4 v4, 0x0

    .line 1154
    .local v4, "$i$f$fastAll":I
    nop

    .line 1155
    move-object v5, v2

    .local v5, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v6, 0x0

    .line 1156
    .local v6, "$i$f$fastForEach":I
    nop

    .line 1157
    const/4 v7, 0x0

    .local v7, "index$iv$iv":I
    move-object v8, v5

    check-cast v8, Ljava/util/Collection;

    invoke-interface {v8}, Ljava/util/Collection;->size()I

    move-result v8

    :goto_0
    if-ge v7, v8, :cond_6

    .line 1158
    invoke-interface {v5, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    .line 1159
    .local v9, "item$iv$iv":Ljava/lang/Object;
    move-object v10, v9

    .local v10, "it$iv":Ljava/lang/Object;
    const/4 v11, 0x0

    .line 1155
    .local v11, "$i$a$-fastForEach-ListUtilsKt$fastAll$2$iv":I
    move-object v12, v10

    check-cast v12, Landroidx/compose/foundation/text/selection/Selectable;

    .local v12, "it":Landroidx/compose/foundation/text/selection/Selectable;
    const/4 v13, 0x0

    .line 446
    .local v13, "$i$a$-fastAll-SelectionManager$isEntireContainerSelected$1":I
    invoke-interface {v12}, Landroidx/compose/foundation/text/selection/Selectable;->getText()Landroidx/compose/ui/text/AnnotatedString;

    move-result-object v14

    .line 447
    .local v14, "text":Landroidx/compose/ui/text/AnnotatedString;
    move-object v15, v14

    check-cast v15, Ljava/lang/CharSequence;

    invoke-interface {v15}, Ljava/lang/CharSequence;->length()I

    move-result v15

    const/16 v16, 0x0

    if-nez v15, :cond_1

    move v15, v3

    goto :goto_1

    :cond_1
    move/from16 v15, v16

    :goto_1
    if-eqz v15, :cond_2

    move-object/from16 v18, v1

    move/from16 v17, v4

    goto :goto_2

    .line 452
    :cond_2
    iget-object v15, v0, Landroidx/compose/foundation/text/selection/SelectionManager;->selectionRegistrar:Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;

    invoke-virtual {v15}, Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;->getSubselections()Landroidx/collection/LongObjectMap;

    move-result-object v15

    move/from16 v17, v4

    .end local v4    # "$i$f$fastAll":I
    .local v17, "$i$f$fastAll":I
    invoke-interface {v12}, Landroidx/compose/foundation/text/selection/Selectable;->getSelectableId()J

    move-result-wide v3

    invoke-virtual {v15, v3, v4}, Landroidx/collection/LongObjectMap;->get(J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/compose/foundation/text/selection/Selection;

    if-nez v3, :cond_3

    move-object/from16 v18, v1

    move/from16 v3, v16

    goto :goto_2

    .line 451
    :cond_3
    nop

    .line 454
    .local v3, "subSelection":Landroidx/compose/foundation/text/selection/Selection;
    invoke-virtual {v3}, Landroidx/compose/foundation/text/selection/Selection;->getStart()Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;

    move-result-object v4

    invoke-virtual {v4}, Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;->getOffset()I

    move-result v4

    .line 455
    .local v4, "selectionStart":I
    invoke-virtual {v3}, Landroidx/compose/foundation/text/selection/Selection;->getEnd()Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;

    move-result-object v15

    invoke-virtual {v15}, Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;->getOffset()I

    move-result v15

    .line 459
    .local v15, "selectionEnd":I
    sub-int v18, v4, v15

    invoke-static/range {v18 .. v18}, Ljava/lang/Math;->abs(I)I

    move-result v0

    move-object/from16 v18, v1

    .end local v1    # "selectables":Ljava/util/List;
    .local v18, "selectables":Ljava/util/List;
    invoke-virtual {v14}, Landroidx/compose/ui/text/AnnotatedString;->length()I

    move-result v1

    if-ne v0, v1, :cond_4

    const/4 v3, 0x1

    goto :goto_2

    :cond_4
    move/from16 v3, v16

    .line 1155
    .end local v3    # "subSelection":Landroidx/compose/foundation/text/selection/Selection;
    .end local v4    # "selectionStart":I
    .end local v12    # "it":Landroidx/compose/foundation/text/selection/Selectable;
    .end local v13    # "$i$a$-fastAll-SelectionManager$isEntireContainerSelected$1":I
    .end local v14    # "text":Landroidx/compose/ui/text/AnnotatedString;
    .end local v15    # "selectionEnd":I
    :goto_2
    if-nez v3, :cond_5

    move/from16 v3, v16

    goto :goto_3

    .line 1159
    .end local v10    # "it$iv":Ljava/lang/Object;
    .end local v11    # "$i$a$-fastForEach-ListUtilsKt$fastAll$2$iv":I
    :cond_5
    nop

    .line 1157
    .end local v9    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v7, v7, 0x1

    const/4 v3, 0x1

    move-object/from16 v0, p0

    move/from16 v4, v17

    move-object/from16 v1, v18

    goto :goto_0

    .end local v17    # "$i$f$fastAll":I
    .end local v18    # "selectables":Ljava/util/List;
    .restart local v1    # "selectables":Ljava/util/List;
    .local v4, "$i$f$fastAll":I
    :cond_6
    move-object/from16 v18, v1

    move/from16 v17, v4

    .line 1161
    .end local v1    # "selectables":Ljava/util/List;
    .end local v4    # "$i$f$fastAll":I
    .end local v7    # "index$iv$iv":I
    .restart local v17    # "$i$f$fastAll":I
    .restart local v18    # "selectables":Ljava/util/List;
    nop

    .line 1162
    .end local v5    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v6    # "$i$f$fastForEach":I
    const/4 v3, 0x1

    .line 445
    .end local v2    # "$this$fastAll$iv":Ljava/util/List;
    .end local v17    # "$i$f$fastAll":I
    :goto_3
    return v3
.end method

.method public final isInTouchMode()Z
    .locals 1

    .line 91
    iget-object v0, p0, Landroidx/compose/foundation/text/selection/SelectionManager;->_isInTouchMode:Landroidx/compose/runtime/MutableState;

    invoke-interface {v0}, Landroidx/compose/runtime/MutableState;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final isNonEmptySelection$foundation_release()Z
    .locals 18

    .line 520
    move-object/from16 v0, p0

    invoke-virtual {v0}, Landroidx/compose/foundation/text/selection/SelectionManager;->getSelection()Landroidx/compose/foundation/text/selection/Selection;

    move-result-object v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return v2

    .line 521
    .local v1, "selection":Landroidx/compose/foundation/text/selection/Selection;
    :cond_0
    invoke-virtual {v1}, Landroidx/compose/foundation/text/selection/Selection;->getStart()Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;

    move-result-object v3

    invoke-virtual {v1}, Landroidx/compose/foundation/text/selection/Selection;->getEnd()Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 522
    return v2

    .line 525
    :cond_1
    invoke-virtual {v1}, Landroidx/compose/foundation/text/selection/Selection;->getStart()Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;

    move-result-object v3

    invoke-virtual {v3}, Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;->getSelectableId()J

    move-result-wide v3

    invoke-virtual {v1}, Landroidx/compose/foundation/text/selection/Selection;->getEnd()Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;

    move-result-object v5

    invoke-virtual {v5}, Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;->getSelectableId()J

    move-result-wide v5

    cmp-long v3, v3, v5

    const/4 v4, 0x1

    if-nez v3, :cond_2

    .line 528
    return v4

    .line 532
    :cond_2
    iget-object v3, v0, Landroidx/compose/foundation/text/selection/SelectionManager;->selectionRegistrar:Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;

    invoke-virtual {v0}, Landroidx/compose/foundation/text/selection/SelectionManager;->requireContainerCoordinates$foundation_release()Landroidx/compose/ui/layout/LayoutCoordinates;

    move-result-object v5

    invoke-virtual {v3, v5}, Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;->sort(Landroidx/compose/ui/layout/LayoutCoordinates;)Ljava/util/List;

    move-result-object v3

    .local v3, "$this$fastAny$iv":Ljava/util/List;
    const/4 v5, 0x0

    .line 1169
    .local v5, "$i$f$fastAny":I
    nop

    .line 1170
    move-object v6, v3

    .local v6, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v7, 0x0

    .line 1171
    .local v7, "$i$f$fastForEach":I
    nop

    .line 1172
    const/4 v8, 0x0

    .local v8, "index$iv$iv":I
    move-object v9, v6

    check-cast v9, Ljava/util/Collection;

    invoke-interface {v9}, Ljava/util/Collection;->size()I

    move-result v9

    :goto_0
    if-ge v8, v9, :cond_6

    .line 1173
    invoke-interface {v6, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    .line 1174
    .local v10, "item$iv$iv":Ljava/lang/Object;
    move-object v11, v10

    .local v11, "it$iv":Ljava/lang/Object;
    const/4 v12, 0x0

    .line 1170
    .local v12, "$i$a$-fastForEach-ListUtilsKt$fastAny$2$iv":I
    move-object v13, v11

    check-cast v13, Landroidx/compose/foundation/text/selection/Selectable;

    .local v13, "selectable":Landroidx/compose/foundation/text/selection/Selectable;
    const/4 v14, 0x0

    .line 533
    .local v14, "$i$a$-fastAny-SelectionManager$isNonEmptySelection$1":I
    iget-object v15, v0, Landroidx/compose/foundation/text/selection/SelectionManager;->selectionRegistrar:Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;

    invoke-virtual {v15}, Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;->getSubselections()Landroidx/collection/LongObjectMap;

    move-result-object v15

    move-object/from16 v16, v3

    .end local v3    # "$this$fastAny$iv":Ljava/util/List;
    .local v16, "$this$fastAny$iv":Ljava/util/List;
    invoke-interface {v13}, Landroidx/compose/foundation/text/selection/Selectable;->getSelectableId()J

    move-result-wide v2

    invoke-virtual {v15, v2, v3}, Landroidx/collection/LongObjectMap;->get(J)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/compose/foundation/text/selection/Selection;

    if-eqz v2, :cond_4

    .local v2, "$this$isNonEmptySelection_u24lambda_u2415_u24lambda_u2414":Landroidx/compose/foundation/text/selection/Selection;
    const/4 v3, 0x0

    .line 534
    .local v3, "$i$a$-run-SelectionManager$isNonEmptySelection$1$1":I
    invoke-virtual {v2}, Landroidx/compose/foundation/text/selection/Selection;->getStart()Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;

    move-result-object v15

    invoke-virtual {v15}, Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;->getOffset()I

    move-result v15

    invoke-virtual {v2}, Landroidx/compose/foundation/text/selection/Selection;->getEnd()Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;

    move-result-object v17

    invoke-virtual/range {v17 .. v17}, Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;->getOffset()I

    move-result v4

    if-eq v15, v4, :cond_3

    const/4 v2, 0x1

    goto :goto_1

    :cond_3
    const/4 v2, 0x0

    .line 533
    .end local v2    # "$this$isNonEmptySelection_u24lambda_u2415_u24lambda_u2414":Landroidx/compose/foundation/text/selection/Selection;
    .end local v3    # "$i$a$-run-SelectionManager$isNonEmptySelection$1$1":I
    :goto_1
    goto :goto_2

    .line 535
    :cond_4
    const/4 v2, 0x0

    .line 1170
    .end local v13    # "selectable":Landroidx/compose/foundation/text/selection/Selectable;
    .end local v14    # "$i$a$-fastAny-SelectionManager$isNonEmptySelection$1":I
    :goto_2
    if-eqz v2, :cond_5

    const/4 v2, 0x1

    goto :goto_3

    .line 1174
    .end local v11    # "it$iv":Ljava/lang/Object;
    .end local v12    # "$i$a$-fastForEach-ListUtilsKt$fastAny$2$iv":I
    :cond_5
    nop

    .line 1172
    .end local v10    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v8, v8, 0x1

    move-object/from16 v3, v16

    const/4 v2, 0x0

    const/4 v4, 0x1

    goto :goto_0

    .end local v16    # "$this$fastAny$iv":Ljava/util/List;
    .local v3, "$this$fastAny$iv":Ljava/util/List;
    :cond_6
    move-object/from16 v16, v3

    .line 1176
    .end local v3    # "$this$fastAny$iv":Ljava/util/List;
    .end local v8    # "index$iv$iv":I
    .restart local v16    # "$this$fastAny$iv":Ljava/util/List;
    nop

    .line 1177
    .end local v6    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v7    # "$i$f$fastForEach":I
    const/4 v2, 0x0

    .line 532
    .end local v5    # "$i$f$fastAny":I
    .end local v16    # "$this$fastAny$iv":Ljava/util/List;
    :goto_3
    return v2
.end method

.method public final isTriviallyCollapsedSelection$foundation_release()Z
    .locals 3

    .line 507
    invoke-virtual {p0}, Landroidx/compose/foundation/text/selection/SelectionManager;->getSelection()Landroidx/compose/foundation/text/selection/Selection;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    .line 508
    .local v0, "selection":Landroidx/compose/foundation/text/selection/Selection;
    :cond_0
    invoke-virtual {v0}, Landroidx/compose/foundation/text/selection/Selection;->getStart()Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;

    move-result-object v1

    invoke-virtual {v0}, Landroidx/compose/foundation/text/selection/Selection;->getEnd()Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    return v1
.end method

.method public final onRelease()V
    .locals 2

    .line 642
    iget-object v0, p0, Landroidx/compose/foundation/text/selection/SelectionManager;->selectionRegistrar:Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;

    invoke-static {}, Landroidx/collection/LongObjectMapKt;->emptyLongObjectMap()Landroidx/collection/LongObjectMap;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;->setSubselections(Landroidx/collection/LongObjectMap;)V

    .line 643
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroidx/compose/foundation/text/selection/SelectionManager;->setShowToolbar$foundation_release(Z)V

    .line 644
    invoke-virtual {p0}, Landroidx/compose/foundation/text/selection/SelectionManager;->getSelection()Landroidx/compose/foundation/text/selection/Selection;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 645
    iget-object v0, p0, Landroidx/compose/foundation/text/selection/SelectionManager;->onSelectionChange:Lkotlin/jvm/functions/Function1;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 646
    invoke-virtual {p0}, Landroidx/compose/foundation/text/selection/SelectionManager;->isInTouchMode()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 647
    iget-object v0, p0, Landroidx/compose/foundation/text/selection/SelectionManager;->hapticFeedBack:Landroidx/compose/ui/hapticfeedback/HapticFeedback;

    if-eqz v0, :cond_0

    sget-object v1, Landroidx/compose/ui/hapticfeedback/HapticFeedbackType;->Companion:Landroidx/compose/ui/hapticfeedback/HapticFeedbackType$Companion;

    invoke-virtual {v1}, Landroidx/compose/ui/hapticfeedback/HapticFeedbackType$Companion;->getTextHandleMove-5zf0vsI()I

    move-result v1

    invoke-interface {v0, v1}, Landroidx/compose/ui/hapticfeedback/HapticFeedback;->performHapticFeedback-CdsT49E(I)V

    .line 650
    :cond_0
    return-void
.end method

.method public final requireContainerCoordinates$foundation_release()Landroidx/compose/ui/layout/LayoutCoordinates;
    .locals 4

    .line 410
    iget-object v0, p0, Landroidx/compose/foundation/text/selection/SelectionManager;->containerLayoutCoordinates:Landroidx/compose/ui/layout/LayoutCoordinates;

    .line 411
    .local v0, "coordinates":Landroidx/compose/ui/layout/LayoutCoordinates;
    const/4 v1, 0x0

    .line 1132
    .local v1, "$i$f$requirePreconditionNotNull":I
    nop

    .line 1134
    if-eqz v0, :cond_1

    .line 1138
    nop

    .line 412
    .end local v1    # "$i$f$requirePreconditionNotNull":I
    invoke-interface {v0}, Landroidx/compose/ui/layout/LayoutCoordinates;->isAttached()Z

    move-result v1

    .local v1, "value$iv":Z
    const/4 v2, 0x0

    .line 1139
    .local v2, "$i$f$requirePrecondition":I
    nop

    .line 1140
    if-nez v1, :cond_0

    .line 1141
    const/4 v3, 0x0

    .line 412
    .local v3, "$i$a$-requirePrecondition-SelectionManager$requireContainerCoordinates$2":I
    nop

    .line 1141
    .end local v3    # "$i$a$-requirePrecondition-SelectionManager$requireContainerCoordinates$2":I
    const-string/jumbo v3, "unattached coordinates"

    invoke-static {v3}, Landroidx/compose/foundation/internal/InlineClassHelperKt;->throwIllegalArgumentException(Ljava/lang/String;)V

    .line 1143
    :cond_0
    nop

    .line 413
    .end local v1    # "value$iv":Z
    .end local v2    # "$i$f$requirePrecondition":I
    return-object v0

    .line 1135
    .local v1, "$i$f$requirePreconditionNotNull":I
    :cond_1
    const/4 v2, 0x0

    .line 411
    .local v2, "$i$a$-requirePreconditionNotNull-SelectionManager$requireContainerCoordinates$1":I
    nop

    .line 1135
    .end local v2    # "$i$a$-requirePreconditionNotNull-SelectionManager$requireContainerCoordinates$1":I
    const-string/jumbo v2, "null coordinates"

    invoke-static {v2}, Landroidx/compose/foundation/internal/InlineClassHelperKt;->throwIllegalArgumentExceptionForNullCheck(Ljava/lang/String;)Ljava/lang/Void;

    new-instance v2, Lkotlin/KotlinNothingValueException;

    invoke-direct {v2}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw v2
.end method

.method public final selectAll$foundation_release()V
    .locals 17

    .line 465
    move-object/from16 v0, p0

    iget-object v1, v0, Landroidx/compose/foundation/text/selection/SelectionManager;->selectionRegistrar:Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;

    invoke-virtual {v0}, Landroidx/compose/foundation/text/selection/SelectionManager;->requireContainerCoordinates$foundation_release()Landroidx/compose/ui/layout/LayoutCoordinates;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;->sort(Landroidx/compose/ui/layout/LayoutCoordinates;)Ljava/util/List;

    move-result-object v1

    .line 466
    .local v1, "selectables":Ljava/util/List;
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    return-void

    .line 468
    :cond_0
    const/4 v2, 0x0

    .line 469
    .local v2, "firstSubSelection":Ljava/lang/Object;
    const/4 v3, 0x0

    .line 471
    .local v3, "lastSubSelection":Ljava/lang/Object;
    invoke-static {}, Landroidx/collection/LongObjectMapKt;->mutableLongObjectMapOf()Landroidx/collection/MutableLongObjectMap;

    move-result-object v4

    move-object v5, v4

    .local v5, "$this$selectAll_u24lambda_u2413":Landroidx/collection/MutableLongObjectMap;
    const/4 v6, 0x0

    .line 472
    .local v6, "$i$a$-apply-SelectionManager$selectAll$newSubSelections$1":I
    move-object v7, v1

    .local v7, "$this$fastForEach$iv":Ljava/util/List;
    const/4 v8, 0x0

    .line 1163
    .local v8, "$i$f$fastForEach":I
    nop

    .line 1164
    const/4 v9, 0x0

    .local v9, "index$iv":I
    move-object v10, v7

    check-cast v10, Ljava/util/Collection;

    invoke-interface {v10}, Ljava/util/Collection;->size()I

    move-result v10

    :goto_0
    if-ge v9, v10, :cond_3

    .line 1165
    invoke-interface {v7, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    .line 1166
    .local v11, "item$iv":Ljava/lang/Object;
    move-object v12, v11

    check-cast v12, Landroidx/compose/foundation/text/selection/Selectable;

    .local v12, "selectable":Landroidx/compose/foundation/text/selection/Selectable;
    const/4 v13, 0x0

    .line 473
    .local v13, "$i$a$-fastForEach-SelectionManager$selectAll$newSubSelections$1$1":I
    invoke-interface {v12}, Landroidx/compose/foundation/text/selection/Selectable;->getSelectAllSelection()Landroidx/compose/foundation/text/selection/Selection;

    move-result-object v14

    if-nez v14, :cond_1

    move-object v15, v1

    goto :goto_1

    .line 474
    .local v14, "subSelection":Landroidx/compose/foundation/text/selection/Selection;
    :cond_1
    if-nez v2, :cond_2

    move-object v2, v14

    .line 475
    :cond_2
    move-object v3, v14

    .line 476
    move-object v15, v1

    move-object/from16 v16, v2

    .end local v1    # "selectables":Ljava/util/List;
    .end local v2    # "firstSubSelection":Ljava/lang/Object;
    .local v15, "selectables":Ljava/util/List;
    .local v16, "firstSubSelection":Ljava/lang/Object;
    invoke-interface {v12}, Landroidx/compose/foundation/text/selection/Selectable;->getSelectableId()J

    move-result-wide v1

    invoke-virtual {v5, v1, v2, v14}, Landroidx/collection/MutableLongObjectMap;->put(JLjava/lang/Object;)Ljava/lang/Object;

    .line 477
    move-object/from16 v2, v16

    .line 1166
    .end local v12    # "selectable":Landroidx/compose/foundation/text/selection/Selectable;
    .end local v13    # "$i$a$-fastForEach-SelectionManager$selectAll$newSubSelections$1$1":I
    .end local v14    # "subSelection":Landroidx/compose/foundation/text/selection/Selection;
    .end local v16    # "firstSubSelection":Ljava/lang/Object;
    .restart local v2    # "firstSubSelection":Ljava/lang/Object;
    :goto_1
    nop

    .line 1164
    .end local v11    # "item$iv":Ljava/lang/Object;
    add-int/lit8 v9, v9, 0x1

    move-object v1, v15

    goto :goto_0

    .end local v15    # "selectables":Ljava/util/List;
    .restart local v1    # "selectables":Ljava/util/List;
    :cond_3
    move-object v15, v1

    .line 1168
    .end local v1    # "selectables":Ljava/util/List;
    .end local v9    # "index$iv":I
    .restart local v15    # "selectables":Ljava/util/List;
    nop

    .line 478
    .end local v7    # "$this$fastForEach$iv":Ljava/util/List;
    .end local v8    # "$i$f$fastForEach":I
    nop

    .line 471
    .end local v5    # "$this$selectAll_u24lambda_u2413":Landroidx/collection/MutableLongObjectMap;
    .end local v6    # "$i$a$-apply-SelectionManager$selectAll$newSubSelections$1":I
    nop

    .line 470
    nop

    .line 480
    .local v4, "newSubSelections":Landroidx/collection/MutableLongObjectMap;
    invoke-virtual {v4}, Landroidx/collection/MutableLongObjectMap;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_4

    return-void

    .line 484
    :cond_4
    if-ne v2, v3, :cond_5

    .line 485
    move-object v1, v2

    goto :goto_2

    .line 487
    :cond_5
    new-instance v1, Landroidx/compose/foundation/text/selection/Selection;

    .line 488
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v2}, Landroidx/compose/foundation/text/selection/Selection;->getStart()Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;

    move-result-object v5

    .line 489
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v3}, Landroidx/compose/foundation/text/selection/Selection;->getEnd()Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;

    move-result-object v6

    .line 490
    nop

    .line 487
    const/4 v7, 0x0

    invoke-direct {v1, v5, v6, v7}, Landroidx/compose/foundation/text/selection/Selection;-><init>(Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;Z)V

    .line 484
    :goto_2
    nop

    .line 483
    nop

    .line 494
    .local v1, "newSelection":Landroidx/compose/foundation/text/selection/Selection;
    iget-object v5, v0, Landroidx/compose/foundation/text/selection/SelectionManager;->selectionRegistrar:Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;

    move-object v6, v4

    check-cast v6, Landroidx/collection/LongObjectMap;

    invoke-virtual {v5, v6}, Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;->setSubselections(Landroidx/collection/LongObjectMap;)V

    .line 495
    iget-object v5, v0, Landroidx/compose/foundation/text/selection/SelectionManager;->onSelectionChange:Lkotlin/jvm/functions/Function1;

    invoke-interface {v5, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 496
    const/4 v5, 0x0

    iput-object v5, v0, Landroidx/compose/foundation/text/selection/SelectionManager;->previousSelectionLayout:Landroidx/compose/foundation/text/selection/SelectionLayout;

    .line 497
    return-void
.end method

.method public final selectAllInSelectable$foundation_release(JLandroidx/compose/foundation/text/selection/Selection;)Lkotlin/Pair;
    .locals 22
    .param p1, "selectableId"    # J
    .param p3, "previousSelection"    # Landroidx/compose/foundation/text/selection/Selection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Landroidx/compose/foundation/text/selection/Selection;",
            ")",
            "Lkotlin/Pair<",
            "Landroidx/compose/foundation/text/selection/Selection;",
            "Landroidx/collection/LongObjectMap<",
            "Landroidx/compose/foundation/text/selection/Selection;",
            ">;>;"
        }
    .end annotation

    .line 420
    move-object/from16 v0, p0

    invoke-static {}, Landroidx/collection/LongObjectMapKt;->mutableLongObjectMapOf()Landroidx/collection/MutableLongObjectMap;

    move-result-object v1

    .line 422
    .local v1, "subselections":Landroidx/collection/MutableLongObjectMap;
    iget-object v2, v0, Landroidx/compose/foundation/text/selection/SelectionManager;->selectionRegistrar:Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;

    invoke-virtual {v0}, Landroidx/compose/foundation/text/selection/SelectionManager;->requireContainerCoordinates$foundation_release()Landroidx/compose/ui/layout/LayoutCoordinates;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;->sort(Landroidx/compose/ui/layout/LayoutCoordinates;)Ljava/util/List;

    move-result-object v2

    .local v2, "$this$fastFold$iv":Ljava/util/List;
    const/4 v3, 0x0

    .local v3, "initial$iv":Ljava/lang/Object;
    const/4 v4, 0x0

    .line 1144
    .local v4, "$i$f$fastFold":I
    nop

    .line 1145
    const/4 v5, 0x0

    .local v5, "accumulator$iv":Ljava/lang/Object;
    move-object v5, v3

    .line 1146
    move-object v6, v2

    .local v6, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v7, 0x0

    .line 1147
    .local v7, "$i$f$fastForEach":I
    nop

    .line 1148
    const/4 v8, 0x0

    .local v8, "index$iv$iv":I
    move-object v9, v6

    check-cast v9, Ljava/util/Collection;

    invoke-interface {v9}, Ljava/util/Collection;->size()I

    move-result v9

    :goto_0
    if-ge v8, v9, :cond_2

    .line 1149
    invoke-interface {v6, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    .line 1150
    .local v10, "item$iv$iv":Ljava/lang/Object;
    move-object v11, v10

    .local v11, "e$iv":Ljava/lang/Object;
    const/4 v12, 0x0

    .line 1146
    .local v12, "$i$a$-fastForEach-ListUtilsKt$fastFold$2$iv":I
    move-object v13, v11

    check-cast v13, Landroidx/compose/foundation/text/selection/Selectable;

    .local v13, "selectable":Landroidx/compose/foundation/text/selection/Selectable;
    move-object v14, v5

    .local v14, "mergedSelection":Landroidx/compose/foundation/text/selection/Selection;
    const/4 v15, 0x0

    .line 426
    .local v15, "$i$a$-fastFold-SelectionManager$selectAllInSelectable$newSelection$1":I
    invoke-interface {v13}, Landroidx/compose/foundation/text/selection/Selectable;->getSelectableId()J

    move-result-wide v16

    cmp-long v16, v16, p1

    if-nez v16, :cond_0

    invoke-interface {v13}, Landroidx/compose/foundation/text/selection/Selectable;->getSelectAllSelection()Landroidx/compose/foundation/text/selection/Selection;

    move-result-object v16

    goto :goto_1

    .line 427
    :cond_0
    const/16 v16, 0x0

    .line 426
    :goto_1
    nop

    .line 425
    move-object/from16 v17, v16

    .line 428
    .local v17, "selection":Landroidx/compose/foundation/text/selection/Selection;
    if-eqz v17, :cond_1

    move-object/from16 v16, v17

    .line 1126
    .local v16, "it":Landroidx/compose/foundation/text/selection/Selection;
    const/16 v18, 0x0

    .line 428
    .local v18, "$i$a$-let-SelectionManager$selectAllInSelectable$newSelection$1$1":I
    move-object/from16 v19, v2

    move-object/from16 v20, v3

    .end local v2    # "$this$fastFold$iv":Ljava/util/List;
    .end local v3    # "initial$iv":Ljava/lang/Object;
    .local v19, "$this$fastFold$iv":Ljava/util/List;
    .local v20, "initial$iv":Ljava/lang/Object;
    invoke-interface {v13}, Landroidx/compose/foundation/text/selection/Selectable;->getSelectableId()J

    move-result-wide v2

    move/from16 v21, v4

    move-object/from16 v4, v16

    .end local v16    # "it":Landroidx/compose/foundation/text/selection/Selection;
    .local v4, "it":Landroidx/compose/foundation/text/selection/Selection;
    .local v21, "$i$f$fastFold":I
    invoke-virtual {v1, v2, v3, v4}, Landroidx/collection/MutableLongObjectMap;->set(JLjava/lang/Object;)V

    .end local v4    # "it":Landroidx/compose/foundation/text/selection/Selection;
    .end local v18    # "$i$a$-let-SelectionManager$selectAllInSelectable$newSelection$1$1":I
    goto :goto_2

    .end local v19    # "$this$fastFold$iv":Ljava/util/List;
    .end local v20    # "initial$iv":Ljava/lang/Object;
    .end local v21    # "$i$f$fastFold":I
    .restart local v2    # "$this$fastFold$iv":Ljava/util/List;
    .restart local v3    # "initial$iv":Ljava/lang/Object;
    .local v4, "$i$f$fastFold":I
    :cond_1
    move-object/from16 v19, v2

    move-object/from16 v20, v3

    move/from16 v21, v4

    .line 429
    .end local v2    # "$this$fastFold$iv":Ljava/util/List;
    .end local v3    # "initial$iv":Ljava/lang/Object;
    .end local v4    # "$i$f$fastFold":I
    .restart local v19    # "$this$fastFold$iv":Ljava/util/List;
    .restart local v20    # "initial$iv":Ljava/lang/Object;
    .restart local v21    # "$i$f$fastFold":I
    :goto_2
    move-object/from16 v4, v17

    .end local v17    # "selection":Landroidx/compose/foundation/text/selection/Selection;
    .local v4, "selection":Landroidx/compose/foundation/text/selection/Selection;
    invoke-static {v14, v4}, Landroidx/compose/foundation/text/selection/SelectionManagerKt;->merge(Landroidx/compose/foundation/text/selection/Selection;Landroidx/compose/foundation/text/selection/Selection;)Landroidx/compose/foundation/text/selection/Selection;

    move-result-object v2

    .line 1146
    .end local v4    # "selection":Landroidx/compose/foundation/text/selection/Selection;
    .end local v13    # "selectable":Landroidx/compose/foundation/text/selection/Selectable;
    .end local v14    # "mergedSelection":Landroidx/compose/foundation/text/selection/Selection;
    .end local v15    # "$i$a$-fastFold-SelectionManager$selectAllInSelectable$newSelection$1":I
    move-object v5, v2

    .line 1150
    .end local v11    # "e$iv":Ljava/lang/Object;
    .end local v12    # "$i$a$-fastForEach-ListUtilsKt$fastFold$2$iv":I
    nop

    .line 1148
    .end local v10    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v8, v8, 0x1

    move-object/from16 v2, v19

    move-object/from16 v3, v20

    move/from16 v4, v21

    goto :goto_0

    .end local v19    # "$this$fastFold$iv":Ljava/util/List;
    .end local v20    # "initial$iv":Ljava/lang/Object;
    .end local v21    # "$i$f$fastFold":I
    .restart local v2    # "$this$fastFold$iv":Ljava/util/List;
    .restart local v3    # "initial$iv":Ljava/lang/Object;
    .local v4, "$i$f$fastFold":I
    :cond_2
    move-object/from16 v19, v2

    move-object/from16 v20, v3

    move/from16 v21, v4

    .line 1152
    .end local v2    # "$this$fastFold$iv":Ljava/util/List;
    .end local v3    # "initial$iv":Ljava/lang/Object;
    .end local v4    # "$i$f$fastFold":I
    .end local v8    # "index$iv$iv":I
    .restart local v19    # "$this$fastFold$iv":Ljava/util/List;
    .restart local v20    # "initial$iv":Ljava/lang/Object;
    .restart local v21    # "$i$f$fastFold":I
    nop

    .line 1153
    .end local v6    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v7    # "$i$f$fastForEach":I
    nop

    .line 422
    .end local v5    # "accumulator$iv":Ljava/lang/Object;
    .end local v19    # "$this$fastFold$iv":Ljava/util/List;
    .end local v20    # "initial$iv":Ljava/lang/Object;
    .end local v21    # "$i$f$fastFold":I
    nop

    .line 421
    nop

    .line 431
    .local v5, "newSelection":Landroidx/compose/foundation/text/selection/Selection;
    invoke-virtual {v0}, Landroidx/compose/foundation/text/selection/SelectionManager;->isInTouchMode()Z

    move-result v2

    if-eqz v2, :cond_3

    move-object/from16 v2, p3

    invoke-static {v5, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    .line 432
    iget-object v3, v0, Landroidx/compose/foundation/text/selection/SelectionManager;->hapticFeedBack:Landroidx/compose/ui/hapticfeedback/HapticFeedback;

    if-eqz v3, :cond_4

    sget-object v4, Landroidx/compose/ui/hapticfeedback/HapticFeedbackType;->Companion:Landroidx/compose/ui/hapticfeedback/HapticFeedbackType$Companion;

    invoke-virtual {v4}, Landroidx/compose/ui/hapticfeedback/HapticFeedbackType$Companion;->getTextHandleMove-5zf0vsI()I

    move-result v4

    invoke-interface {v3, v4}, Landroidx/compose/ui/hapticfeedback/HapticFeedback;->performHapticFeedback-CdsT49E(I)V

    goto :goto_3

    .line 431
    :cond_3
    move-object/from16 v2, p3

    .line 434
    :cond_4
    :goto_3
    new-instance v3, Lkotlin/Pair;

    invoke-direct {v3, v5, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v3
.end method

.method public final selectWordAtPositionIfNotAlreadySelected-k-4lQ0M(J)V
    .locals 23
    .param p1, "position"    # J

    .line 918
    move-object/from16 v0, p0

    move-wide/from16 v1, p1

    iget-object v3, v0, Landroidx/compose/foundation/text/selection/SelectionManager;->containerLayoutCoordinates:Landroidx/compose/ui/layout/LayoutCoordinates;

    if-nez v3, :cond_0

    return-void

    .line 919
    .local v3, "containerCoordinates":Landroidx/compose/ui/layout/LayoutCoordinates;
    :cond_0
    invoke-interface {v3}, Landroidx/compose/ui/layout/LayoutCoordinates;->isAttached()Z

    move-result v4

    if-nez v4, :cond_1

    return-void

    .line 922
    :cond_1
    iget-object v4, v0, Landroidx/compose/foundation/text/selection/SelectionManager;->selectionRegistrar:Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;

    invoke-virtual {v4}, Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;->getSelectables$foundation_release()Ljava/util/List;

    move-result-object v4

    .local v4, "$this$fastAny$iv":Ljava/util/List;
    const/4 v5, 0x0

    .line 1223
    .local v5, "$i$f$fastAny":I
    nop

    .line 1224
    move-object v6, v4

    .local v6, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v7, 0x0

    .line 1225
    .local v7, "$i$f$fastForEach":I
    nop

    .line 1226
    const/4 v8, 0x0

    .local v8, "index$iv$iv":I
    move-object v9, v6

    check-cast v9, Ljava/util/Collection;

    invoke-interface {v9}, Ljava/util/Collection;->size()I

    move-result v9

    :goto_0
    if-ge v8, v9, :cond_6

    .line 1227
    invoke-interface {v6, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    .line 1228
    .local v12, "item$iv$iv":Ljava/lang/Object;
    move-object v13, v12

    .local v13, "it$iv":Ljava/lang/Object;
    const/4 v14, 0x0

    .line 1224
    .local v14, "$i$a$-fastForEach-ListUtilsKt$fastAny$2$iv":I
    move-object v15, v13

    check-cast v15, Landroidx/compose/foundation/text/selection/Selectable;

    .local v15, "selectable":Landroidx/compose/foundation/text/selection/Selectable;
    const/16 v16, 0x0

    .line 924
    .local v16, "$i$a$-fastAny-SelectionManager$selectWordAtPositionIfNotAlreadySelected$isClickedPositionInsideSelection$1":I
    iget-object v11, v0, Landroidx/compose/foundation/text/selection/SelectionManager;->selectionRegistrar:Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;

    invoke-virtual {v11}, Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;->getSubselections()Landroidx/collection/LongObjectMap;

    move-result-object v11

    move-object/from16 v17, v4

    move/from16 v18, v5

    .end local v4    # "$this$fastAny$iv":Ljava/util/List;
    .end local v5    # "$i$f$fastAny":I
    .local v17, "$this$fastAny$iv":Ljava/util/List;
    .local v18, "$i$f$fastAny":I
    invoke-interface {v15}, Landroidx/compose/foundation/text/selection/Selectable;->getSelectableId()J

    move-result-wide v4

    invoke-virtual {v11, v4, v5}, Landroidx/collection/LongObjectMap;->get(J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/compose/foundation/text/selection/Selection;

    if-nez v4, :cond_2

    .line 925
    move-object/from16 v19, v3

    const/4 v11, 0x0

    goto :goto_1

    .line 923
    :cond_2
    nop

    .line 927
    .local v4, "selection":Landroidx/compose/foundation/text/selection/Selection;
    invoke-interface {v15}, Landroidx/compose/foundation/text/selection/Selectable;->getLayoutCoordinates()Landroidx/compose/ui/layout/LayoutCoordinates;

    move-result-object v5

    if-nez v5, :cond_3

    move-object/from16 v19, v3

    const/4 v11, 0x0

    goto :goto_1

    .line 926
    :cond_3
    nop

    .line 929
    .local v5, "selectableLayoutCoords":Landroidx/compose/ui/layout/LayoutCoordinates;
    invoke-interface {v5, v3, v1, v2}, Landroidx/compose/ui/layout/LayoutCoordinates;->localPositionOf-R5De75A(Landroidx/compose/ui/layout/LayoutCoordinates;J)J

    move-result-wide v19

    .line 928
    move-wide/from16 v21, v19

    .line 930
    .local v21, "positionInSelectable":J
    invoke-interface {v15}, Landroidx/compose/foundation/text/selection/Selectable;->textLayoutResult()Landroidx/compose/ui/text/TextLayoutResult;

    move-result-object v11

    if-nez v11, :cond_4

    move-object/from16 v19, v3

    const/4 v11, 0x0

    goto :goto_1

    .line 931
    .local v11, "textLayoutResult":Landroidx/compose/ui/text/TextLayoutResult;
    :cond_4
    nop

    .line 932
    nop

    .line 933
    invoke-virtual {v4}, Landroidx/compose/foundation/text/selection/Selection;->toTextRange-d9O1mEE()J

    move-result-wide v19

    invoke-static/range {v19 .. v20}, Landroidx/compose/ui/text/TextRange;->box-impl(J)Landroidx/compose/ui/text/TextRange;

    move-result-object v10

    .line 931
    move-object/from16 v19, v3

    move-object/from16 v20, v4

    move-wide/from16 v3, v21

    .end local v4    # "selection":Landroidx/compose/foundation/text/selection/Selection;
    .end local v21    # "positionInSelectable":J
    .local v3, "positionInSelectable":J
    .local v19, "containerCoordinates":Landroidx/compose/ui/layout/LayoutCoordinates;
    .local v20, "selection":Landroidx/compose/foundation/text/selection/Selection;
    invoke-static {v11, v3, v4, v10}, Landroidx/compose/foundation/text/TextLayoutHelperKt;->isPositionInsideSelection-uaM50fQ(Landroidx/compose/ui/text/TextLayoutResult;JLandroidx/compose/ui/text/TextRange;)Z

    move-result v10

    .line 934
    move v11, v10

    .line 1224
    .end local v3    # "positionInSelectable":J
    .end local v5    # "selectableLayoutCoords":Landroidx/compose/ui/layout/LayoutCoordinates;
    .end local v11    # "textLayoutResult":Landroidx/compose/ui/text/TextLayoutResult;
    .end local v15    # "selectable":Landroidx/compose/foundation/text/selection/Selectable;
    .end local v16    # "$i$a$-fastAny-SelectionManager$selectWordAtPositionIfNotAlreadySelected$isClickedPositionInsideSelection$1":I
    .end local v20    # "selection":Landroidx/compose/foundation/text/selection/Selection;
    :goto_1
    if-eqz v11, :cond_5

    const/4 v11, 0x1

    goto :goto_2

    .line 1228
    .end local v13    # "it$iv":Ljava/lang/Object;
    .end local v14    # "$i$a$-fastForEach-ListUtilsKt$fastAny$2$iv":I
    :cond_5
    nop

    .line 1226
    .end local v12    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v8, v8, 0x1

    move-object/from16 v4, v17

    move/from16 v5, v18

    move-object/from16 v3, v19

    goto :goto_0

    .end local v17    # "$this$fastAny$iv":Ljava/util/List;
    .end local v18    # "$i$f$fastAny":I
    .end local v19    # "containerCoordinates":Landroidx/compose/ui/layout/LayoutCoordinates;
    .local v3, "containerCoordinates":Landroidx/compose/ui/layout/LayoutCoordinates;
    .local v4, "$this$fastAny$iv":Ljava/util/List;
    .local v5, "$i$f$fastAny":I
    :cond_6
    move-object/from16 v19, v3

    move-object/from16 v17, v4

    move/from16 v18, v5

    .line 1230
    .end local v3    # "containerCoordinates":Landroidx/compose/ui/layout/LayoutCoordinates;
    .end local v4    # "$this$fastAny$iv":Ljava/util/List;
    .end local v5    # "$i$f$fastAny":I
    .end local v8    # "index$iv$iv":I
    .restart local v17    # "$this$fastAny$iv":Ljava/util/List;
    .restart local v18    # "$i$f$fastAny":I
    .restart local v19    # "containerCoordinates":Landroidx/compose/ui/layout/LayoutCoordinates;
    nop

    .line 1231
    .end local v6    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v7    # "$i$f$fastForEach":I
    const/4 v11, 0x0

    .line 922
    .end local v17    # "$this$fastAny$iv":Ljava/util/List;
    .end local v18    # "$i$f$fastAny":I
    :goto_2
    nop

    .line 921
    nop

    .line 936
    .local v11, "isClickedPositionInsideSelection":Z
    if-nez v11, :cond_7

    .line 937
    nop

    .line 938
    nop

    .line 939
    nop

    .line 940
    sget-object v3, Landroidx/compose/foundation/text/selection/SelectionAdjustment;->Companion:Landroidx/compose/foundation/text/selection/SelectionAdjustment$Companion;

    invoke-virtual {v3}, Landroidx/compose/foundation/text/selection/SelectionAdjustment$Companion;->getWord()Landroidx/compose/foundation/text/selection/SelectionAdjustment;

    move-result-object v3

    .line 937
    const/4 v4, 0x1

    invoke-direct {v0, v1, v2, v4, v3}, Landroidx/compose/foundation/text/selection/SelectionManager;->startSelection-9KIMszo(JZLandroidx/compose/foundation/text/selection/SelectionAdjustment;)V

    .line 943
    :cond_7
    return-void
.end method

.method public final setContainerLayoutCoordinates(Landroidx/compose/ui/layout/LayoutCoordinates;)V
    .locals 2
    .param p1, "value"    # Landroidx/compose/ui/layout/LayoutCoordinates;

    .line 166
    iput-object p1, p0, Landroidx/compose/foundation/text/selection/SelectionManager;->containerLayoutCoordinates:Landroidx/compose/ui/layout/LayoutCoordinates;

    .line 167
    invoke-virtual {p0}, Landroidx/compose/foundation/text/selection/SelectionManager;->getHasFocus()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroidx/compose/foundation/text/selection/SelectionManager;->getSelection()Landroidx/compose/foundation/text/selection/Selection;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 168
    if-eqz p1, :cond_0

    invoke-static {p1}, Landroidx/compose/ui/layout/LayoutCoordinatesKt;->positionInWindow(Landroidx/compose/ui/layout/LayoutCoordinates;)J

    move-result-wide v0

    invoke-static {v0, v1}, Landroidx/compose/ui/geometry/Offset;->box-impl(J)Landroidx/compose/ui/geometry/Offset;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 169
    .local v0, "positionInWindow":Landroidx/compose/ui/geometry/Offset;
    :goto_0
    iget-object v1, p0, Landroidx/compose/foundation/text/selection/SelectionManager;->previousPosition:Landroidx/compose/ui/geometry/Offset;

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 170
    iput-object v0, p0, Landroidx/compose/foundation/text/selection/SelectionManager;->previousPosition:Landroidx/compose/ui/geometry/Offset;

    .line 171
    invoke-direct {p0}, Landroidx/compose/foundation/text/selection/SelectionManager;->updateHandleOffsets()V

    .line 172
    invoke-direct {p0}, Landroidx/compose/foundation/text/selection/SelectionManager;->updateSelectionToolbar()V

    .line 175
    .end local v0    # "positionInWindow":Landroidx/compose/ui/geometry/Offset;
    :cond_1
    return-void
.end method

.method public final setFocusRequester(Landroidx/compose/ui/focus/FocusRequester;)V
    .locals 0
    .param p1, "<set-?>"    # Landroidx/compose/ui/focus/FocusRequester;

    .line 128
    iput-object p1, p0, Landroidx/compose/foundation/text/selection/SelectionManager;->focusRequester:Landroidx/compose/ui/focus/FocusRequester;

    return-void
.end method

.method public final setHapticFeedBack(Landroidx/compose/ui/hapticfeedback/HapticFeedback;)V
    .locals 0
    .param p1, "<set-?>"    # Landroidx/compose/ui/hapticfeedback/HapticFeedback;

    .line 119
    iput-object p1, p0, Landroidx/compose/foundation/text/selection/SelectionManager;->hapticFeedBack:Landroidx/compose/ui/hapticfeedback/HapticFeedback;

    return-void
.end method

.method public final setHasFocus(Z)V
    .locals 4
    .param p1, "<set-?>"    # Z

    .line 131
    iget-object v0, p0, Landroidx/compose/foundation/text/selection/SelectionManager;->hasFocus$delegate:Landroidx/compose/runtime/MutableState;

    .local v0, "$this$setValue$iv":Landroidx/compose/runtime/MutableState;
    const/4 v1, 0x0

    .local v1, "property$iv":Lkotlin/reflect/KProperty;
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    .local v2, "value$iv":Ljava/lang/Object;
    const/4 v3, 0x0

    .line 1109
    .local v3, "$i$f$setValue":I
    invoke-interface {v0, v2}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 1110
    nop

    .line 131
    .end local v0    # "$this$setValue$iv":Landroidx/compose/runtime/MutableState;
    .end local v1    # "property$iv":Lkotlin/reflect/KProperty;
    .end local v2    # "value$iv":Ljava/lang/Object;
    .end local v3    # "$i$f$setValue":I
    return-void
.end method

.method public final setInTouchMode(Z)V
    .locals 2
    .param p1, "value"    # Z

    .line 93
    iget-object v0, p0, Landroidx/compose/foundation/text/selection/SelectionManager;->_isInTouchMode:Landroidx/compose/runtime/MutableState;

    invoke-interface {v0}, Landroidx/compose/runtime/MutableState;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eq v0, p1, :cond_0

    .line 94
    iget-object v0, p0, Landroidx/compose/foundation/text/selection/SelectionManager;->_isInTouchMode:Landroidx/compose/runtime/MutableState;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {v0, v1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 95
    invoke-direct {p0}, Landroidx/compose/foundation/text/selection/SelectionManager;->updateSelectionToolbar()V

    .line 97
    :cond_0
    return-void
.end method

.method public final setOnCopyHandler(Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .param p1, "<set-?>"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/ui/text/AnnotatedString;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 122
    iput-object p1, p0, Landroidx/compose/foundation/text/selection/SelectionManager;->onCopyHandler:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public final setOnSelectionChange(Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .param p1, "newOnSelectionChange"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/foundation/text/selection/Selection;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 112
    new-instance v0, Landroidx/compose/foundation/text/selection/SelectionManager$onSelectionChange$2;

    invoke-direct {v0, p0, p1}, Landroidx/compose/foundation/text/selection/SelectionManager$onSelectionChange$2;-><init>(Landroidx/compose/foundation/text/selection/SelectionManager;Lkotlin/jvm/functions/Function1;)V

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iput-object v0, p0, Landroidx/compose/foundation/text/selection/SelectionManager;->onSelectionChange:Lkotlin/jvm/functions/Function1;

    .line 116
    return-void
.end method

.method public final setPreviousSelectionLayout$foundation_release(Landroidx/compose/foundation/text/selection/SelectionLayout;)V
    .locals 0
    .param p1, "<set-?>"    # Landroidx/compose/foundation/text/selection/SelectionLayout;

    .line 240
    iput-object p1, p0, Landroidx/compose/foundation/text/selection/SelectionManager;->previousSelectionLayout:Landroidx/compose/foundation/text/selection/SelectionLayout;

    return-void
.end method

.method public final setSelection(Landroidx/compose/foundation/text/selection/Selection;)V
    .locals 1
    .param p1, "value"    # Landroidx/compose/foundation/text/selection/Selection;

    .line 82
    iget-object v0, p0, Landroidx/compose/foundation/text/selection/SelectionManager;->_selection:Landroidx/compose/runtime/MutableState;

    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 83
    if-eqz p1, :cond_0

    .line 84
    invoke-direct {p0}, Landroidx/compose/foundation/text/selection/SelectionManager;->updateHandleOffsets()V

    .line 86
    :cond_0
    return-void
.end method

.method public final setShowToolbar$foundation_release(Z)V
    .locals 0
    .param p1, "value"    # Z

    .line 579
    iput-boolean p1, p0, Landroidx/compose/foundation/text/selection/SelectionManager;->showToolbar:Z

    .line 580
    invoke-direct {p0}, Landroidx/compose/foundation/text/selection/SelectionManager;->updateSelectionToolbar()V

    .line 581
    return-void
.end method

.method public final setTextToolbar(Landroidx/compose/ui/platform/TextToolbar;)V
    .locals 0
    .param p1, "<set-?>"    # Landroidx/compose/ui/platform/TextToolbar;

    .line 125
    iput-object p1, p0, Landroidx/compose/foundation/text/selection/SelectionManager;->textToolbar:Landroidx/compose/ui/platform/TextToolbar;

    return-void
.end method

.method public final shouldPerformHaptics$foundation_release()Z
    .locals 14

    .line 910
    invoke-virtual {p0}, Landroidx/compose/foundation/text/selection/SelectionManager;->isInTouchMode()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    iget-object v0, p0, Landroidx/compose/foundation/text/selection/SelectionManager;->selectionRegistrar:Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;

    invoke-virtual {v0}, Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;->getSelectables$foundation_release()Ljava/util/List;

    move-result-object v0

    .local v0, "$this$fastAny$iv":Ljava/util/List;
    const/4 v2, 0x0

    .line 1214
    .local v2, "$i$f$fastAny":I
    nop

    .line 1215
    move-object v3, v0

    .local v3, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v4, 0x0

    .line 1216
    .local v4, "$i$f$fastForEach":I
    nop

    .line 1217
    const/4 v5, 0x0

    .local v5, "index$iv$iv":I
    move-object v6, v3

    check-cast v6, Ljava/util/Collection;

    invoke-interface {v6}, Ljava/util/Collection;->size()I

    move-result v6

    :goto_0
    const/4 v7, 0x1

    if-ge v5, v6, :cond_2

    .line 1218
    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    .line 1219
    .local v8, "item$iv$iv":Ljava/lang/Object;
    move-object v9, v8

    .local v9, "it$iv":Ljava/lang/Object;
    const/4 v10, 0x0

    .line 1215
    .local v10, "$i$a$-fastForEach-ListUtilsKt$fastAny$2$iv":I
    move-object v11, v9

    check-cast v11, Landroidx/compose/foundation/text/selection/Selectable;

    .local v11, "it":Landroidx/compose/foundation/text/selection/Selectable;
    const/4 v12, 0x0

    .line 910
    .local v12, "$i$a$-fastAny-SelectionManager$shouldPerformHaptics$1":I
    invoke-interface {v11}, Landroidx/compose/foundation/text/selection/Selectable;->getText()Landroidx/compose/ui/text/AnnotatedString;

    move-result-object v13

    check-cast v13, Ljava/lang/CharSequence;

    invoke-interface {v13}, Ljava/lang/CharSequence;->length()I

    move-result v13

    if-lez v13, :cond_0

    move v13, v7

    goto :goto_1

    :cond_0
    move v13, v1

    .line 1215
    .end local v11    # "it":Landroidx/compose/foundation/text/selection/Selectable;
    .end local v12    # "$i$a$-fastAny-SelectionManager$shouldPerformHaptics$1":I
    :goto_1
    if-eqz v13, :cond_1

    move v0, v7

    goto :goto_2

    .line 1219
    .end local v9    # "it$iv":Ljava/lang/Object;
    .end local v10    # "$i$a$-fastForEach-ListUtilsKt$fastAny$2$iv":I
    :cond_1
    nop

    .line 1217
    .end local v8    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 1221
    .end local v5    # "index$iv$iv":I
    :cond_2
    nop

    .line 1222
    .end local v3    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v4    # "$i$f$fastForEach":I
    move v0, v1

    .line 910
    .end local v0    # "$this$fastAny$iv":Ljava/util/List;
    .end local v2    # "$i$f$fastAny":I
    :goto_2
    if-eqz v0, :cond_3

    move v1, v7

    :cond_3
    return v1
.end method

.method public final updateSelection-jyLRC_s$foundation_release(JJZLandroidx/compose/foundation/text/selection/SelectionAdjustment;)Z
    .locals 3
    .param p1, "position"    # J
    .param p3, "previousHandlePosition"    # J
    .param p5, "isStartHandle"    # Z
    .param p6, "adjustment"    # Landroidx/compose/foundation/text/selection/SelectionAdjustment;

    .line 851
    if-eqz p5, :cond_0

    sget-object v0, Landroidx/compose/foundation/text/Handle;->SelectionStart:Landroidx/compose/foundation/text/Handle;

    goto :goto_0

    :cond_0
    sget-object v0, Landroidx/compose/foundation/text/Handle;->SelectionEnd:Landroidx/compose/foundation/text/Handle;

    :goto_0
    invoke-direct {p0, v0}, Landroidx/compose/foundation/text/selection/SelectionManager;->setDraggingHandle(Landroidx/compose/foundation/text/Handle;)V

    .line 852
    invoke-static {p1, p2}, Landroidx/compose/ui/geometry/Offset;->box-impl(J)Landroidx/compose/ui/geometry/Offset;

    move-result-object v0

    invoke-direct {p0, v0}, Landroidx/compose/foundation/text/selection/SelectionManager;->setCurrentDragPosition-_kEHs6E(Landroidx/compose/ui/geometry/Offset;)V

    .line 855
    invoke-direct/range {p0 .. p5}, Landroidx/compose/foundation/text/selection/SelectionManager;->getSelectionLayout-Wko1d7g(JJZ)Landroidx/compose/foundation/text/selection/SelectionLayout;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_1

    return v1

    .line 854
    :cond_1
    nop

    .line 856
    .local v0, "selectionLayout":Landroidx/compose/foundation/text/selection/SelectionLayout;
    iget-object v2, p0, Landroidx/compose/foundation/text/selection/SelectionManager;->previousSelectionLayout:Landroidx/compose/foundation/text/selection/SelectionLayout;

    invoke-interface {v0, v2}, Landroidx/compose/foundation/text/selection/SelectionLayout;->shouldRecomputeSelection(Landroidx/compose/foundation/text/selection/SelectionLayout;)Z

    move-result v2

    if-nez v2, :cond_2

    .line 857
    return v1

    .line 860
    :cond_2
    invoke-interface {p6, v0}, Landroidx/compose/foundation/text/selection/SelectionAdjustment;->adjust(Landroidx/compose/foundation/text/selection/SelectionLayout;)Landroidx/compose/foundation/text/selection/Selection;

    move-result-object v1

    .line 861
    .local v1, "newSelection":Landroidx/compose/foundation/text/selection/Selection;
    invoke-virtual {p0}, Landroidx/compose/foundation/text/selection/SelectionManager;->getSelection()Landroidx/compose/foundation/text/selection/Selection;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    .line 862
    invoke-direct {p0, v0, v1}, Landroidx/compose/foundation/text/selection/SelectionManager;->selectionChanged(Landroidx/compose/foundation/text/selection/SelectionLayout;Landroidx/compose/foundation/text/selection/Selection;)V

    .line 864
    :cond_3
    iput-object v0, p0, Landroidx/compose/foundation/text/selection/SelectionManager;->previousSelectionLayout:Landroidx/compose/foundation/text/selection/SelectionLayout;

    .line 865
    const/4 v2, 0x1

    return v2
.end method

.method public final updateSelection-qNKwrvQ$foundation_release(Landroidx/compose/ui/geometry/Offset;JZLandroidx/compose/foundation/text/selection/SelectionAdjustment;)Z
    .locals 8
    .param p1, "newPosition"    # Landroidx/compose/ui/geometry/Offset;
    .param p2, "previousPosition"    # J
    .param p4, "isStartHandle"    # Z
    .param p5, "adjustment"    # Landroidx/compose/foundation/text/selection/SelectionAdjustment;

    .line 818
    if-nez p1, :cond_0

    const/4 v0, 0x0

    return v0

    .line 819
    :cond_0
    nop

    .line 820
    invoke-virtual {p1}, Landroidx/compose/ui/geometry/Offset;->unbox-impl()J

    move-result-wide v2

    .line 821
    nop

    .line 822
    nop

    .line 823
    nop

    .line 819
    move-object v1, p0

    move-wide v4, p2

    move v6, p4

    move-object v7, p5

    .end local p2    # "previousPosition":J
    .end local p4    # "isStartHandle":Z
    .end local p5    # "adjustment":Landroidx/compose/foundation/text/selection/SelectionAdjustment;
    .local v4, "previousPosition":J
    .local v6, "isStartHandle":Z
    .local v7, "adjustment":Landroidx/compose/foundation/text/selection/SelectionAdjustment;
    invoke-virtual/range {v1 .. v7}, Landroidx/compose/foundation/text/selection/SelectionManager;->updateSelection-jyLRC_s$foundation_release(JJZLandroidx/compose/foundation/text/selection/SelectionAdjustment;)Z

    move-result p2

    return p2
.end method
